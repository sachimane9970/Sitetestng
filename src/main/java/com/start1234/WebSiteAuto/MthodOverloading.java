package com.start1234.WebSiteAuto;

public class MthodOverloading {
	

	public static void main(String[] args) {

		MthodOverloading def=new MthodOverloading();
		def.method();
		def.method2(20);
		def.method3(10, 2);
		def.method4(2, 3, 4);
		
}
	public void method()
	{
		System.out.println("sachin");
	}
	public void method2(int x)
	{
		System.out.println(x);
		System.out.println("method2");
	}	
	public void method3(int x, int y)
	{
		System.out.println(x*y);
		System.out.println("method3");
	}
	public void method4(int x, int y, int z)
	{
		System.out.println(x*y*z);
		System.out.println("method4");
	}
}