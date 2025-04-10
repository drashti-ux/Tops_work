<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>
 $("document").ready(function(){
	 document.getElementById('rzp-button1').onclick = function(e){
		    e.preventDefault();
		    var amount =$("#amount").val()
		    $.post("order",{amount},(rt)=>{
			var data = JSON.parse(rt)
		    	var options = {
		    		    "key": "rzp_test_pv6FbtEGoD0n4P", // Enter the Key ID generated from the Dashboard
		    		    "amount": data.amount , // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
		    		    "currency": "INR",
		    		    "name": "Acme Corp",
		    		    "description": "Test Transaction",
		    		    "image": "https://example.com/your_logo",
		    		    "order_id": data.id, //This is a sample Order ID. Pass the `id` obtained in the response of Step 1
		    		    "handler": function (response){
		    		        alert("Payment Succesfull");
		    		    },
		    		    "prefill": {
		    		        "name": "Gaurav Kumar",
		    		        "email": "gaurav.kumar@example.com",
		    		        "contact": "9000090000"
		    		    },
		    		    "notes": {
		    		        "address": "Razorpay Corporate Office"
		    		    },
		    		    "theme": {
		    		        "color": "#3399cc"
		    		    }
		    		};
		    		var rzp1 = new Razorpay(options);
		    		rzp1.on('payment.failed', function (response){
		    		        alert(response.error.code);
		    		        alert(response.error.description);
		    		        alert(response.error.source);
		    		        alert(response.error.step);
		    		        alert(response.error.reason);
		    		        alert(response.error.metadata.order_id);
		    		        alert(response.error.metadata.payment_id);
		    		});
		    		rzp1.open();
		    }) 
		}
 
 })

</script>
</head>
<body>
	<div class="container card mx-auto col-4 mt-5 p-3">
	<h1 class="text-center">Order Details</h1>
	<hr>
	<div class="mx-2">
	<input type="text" placeholder="Enter Amount" id="amount" class="form-control">
	</div>
	<button id="rzp-button1" class="btn btn-warning m-2">Pay with Razorpay</button>
	</div>
</body>
</html>