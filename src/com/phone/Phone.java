package com.phone;
//data type count
public class Phone {
	private void phoneInfo(String name) {
		// TODO Auto-generated method stub
        System.out.println("phone name:"+name+"\n");
	}
	private void phoneImfo(String name,int size) {
		// TODO Auto-generated method stub
        System.out.println("phone name:"+name+"\n"+"phone size:"+size+"\n");
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo("one plus nord 2 lite");
		p.phoneImfo("one plus nord 2 lite", 12);
		
		p.phoneInfo("oppo");
		p.phoneImfo("oppo", 10);
	}
}
