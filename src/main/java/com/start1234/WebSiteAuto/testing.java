package com.start1234.WebSiteAuto;

public class testing {
	
	int z;

	public static void main(String[] args) {
   
		System.out.println("system print");
		testing ref=new testing();
		ref.method();
		
		testing.method2();
		WithoutMain tmm=new WithoutMain();
		tmm.timepass();
		tmm.sleep();
		tmm.eat();
		
		System.out.println(tmm.x);
		System.out.println(WithoutMain.y);
	}
	
	
	public void method()
	{
		int z=3;
		System.out.println("its printing");
	}
	public static void method2()
	{
		System.out.println("its not printing");
	}

}
