package com;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/order")
public class OrderServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int amount = Integer.parseInt(req.getParameter("amount"));
		RazorpayClient razorpay;
		try {
			razorpay = new RazorpayClient("rzp_test_pv6FbtEGoD0n4P", "iladq0iIJ4h3mt2LyxAalTuK");
			JSONObject orderRequest = new JSONObject();
			orderRequest.put("amount",amount*100); // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise
			orderRequest.put("currency","INR");
			orderRequest.put("receipt", "receipt#1");
			JSONObject notes = new JSONObject();
			notes.put("notes_key_1","Tea, Earl Grey, Hot");
			orderRequest.put("notes",notes);

			Order order = razorpay.orders.create(orderRequest);
			PrintWriter out = resp.getWriter();
			out.append(order.toString());
		} catch (RazorpayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
