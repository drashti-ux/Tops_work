use new;

-- procedure to get all employee detail
delimiter //
create procedure allemp()
begin
	select * from employe;
end // 
delimiter ;

call allemp();   -- calling default procedure

-- procedure to get perticular employee data
delimiter //
create procedure empById(in eid int)
begin
	select * from employe where emp_id = eid;
end //
delimiter ;

call empById(2);	-- calling in parameter procedure

-- procedure of out parameter

delimiter //
create procedure highSal(out sal double)
begin 
	select max(salary) into sal from employe;
end //
delimiter ;

call highsal(@m);
select @m;

delimiter //
create procedure empSal(inout k int)
begin 
	select salary into k from employe where emp_id = k;
end //
delimiter ;

set @k = 10;
call empSal(@k);
select @k;
