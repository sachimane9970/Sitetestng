package com.start1234.WebSiteAuto;

public class InterfaceClass implements InterC {

	public static void main(String[] args) {
		
		InterfaceClass ref=new InterfaceClass();
		ref.eat();
		ref.talk();
		ref.walk();
	}

	public void eat() {
    System.out.println("8pm");		
	}

	public void talk() {
    System.out.println("always");		
	}

	public void walk() {
    System.out.println("after food");		
	}

}
