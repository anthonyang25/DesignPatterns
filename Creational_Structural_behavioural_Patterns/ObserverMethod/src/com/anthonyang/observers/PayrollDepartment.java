package com.anthonyang.observers;
import com.anthonyang.domain.Employee;


public class PayrollDepartment implements IObserver{

	@Override
	public void callMe(Employee emp, String msg) {
		System.out.println("PAYROLL department notified...");
		System.out.println(msg + ": " + emp.getName());
	}
	
	

}
