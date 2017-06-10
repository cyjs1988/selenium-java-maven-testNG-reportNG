package TestNG.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNGdemo {

	@BeforeClass
	public void setup(){
		
		System.out.println("a start!");
	}
	
	@AfterClass
	public void tearup(){
		
		System.out.println("a end!");
	}
	
	@Test
	public void test1(){
		System.out.println("a1");
		
	}
	
	@Test
	public void test2(){
		System.out.println("a2");
		
	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
