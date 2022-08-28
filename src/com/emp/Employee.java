package com.emp;
//data type
public class Employee {
	private void empId(String name) {
		System.out.println("emp name:"+name);
	}
	private void empId(int id) {
		// TODO Auto-generated method stub
       System.out.println("emp id:"+id);
	}
	private void empId(long num) {
		// TODO Auto-generated method stub
        System.out.println("emp num:"+num+"\n");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId("hari");
		e.empId(6472);
		e.empId(7467284456L);
		
		e.empId("madan");
		e.empId(6432);
		e.empId(46727827652L);
	}

}
