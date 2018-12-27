package com.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ProductsTest {
	private Laptop laptop1,laptop2,laptop3;
	private Car car1,car2,car3;
	private Television television1,television2,television3;
	private CellPhone cellphone1,cellphone2,cellphone3;
	private School school1,school2,school3;
	
	
	@Before
	public void setUp(){
		laptop1=new Laptop("Lenovo","L21","Windowsxp","intel i3");
		laptop2=new Laptop("Dell","D31","windows7","intel i7");
		laptop3=new Laptop("Mac","m51","macos","AppleA6");
		
		car1 = new Car("skoda","sg3",2014,2000000);
		car2 = new Car("scorpio","sp3",2016,2000000);
		car3 = new Car("ferrari","sg3",2018,2000000);
		
		television1=new Television("Samsung","PLASMA",true,80000);
		television2=new Television("Sony","LED",true,50000);
		television3=new Television("onida","LCD",false,20000);
		
		cellphone1 = new CellPhone("Honor","9lite","front and Back dual camera","android 4",15000);
		cellphone2 = new CellPhone("samsung","j7","front and Back dual camera","android 4",15000);
		cellphone3 = new CellPhone("apple","x","front and Back dual camera","android 4",15000);
		
		school1 = new School("Pragna","Guntur","Guntur","10 out of 10");
		school2 = new School("OXFORD","Guntur","Guntur","10 out of 10");
		school3 = new School("Jain public school","Guntur","Guntur","10 out of 10");
	}
	
	
	@Test
	public void testForRead() {
		List<Object> list = new ArrayList<>();
		list.add(laptop1);
		list.add(laptop2);
		list.add(laptop3);
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(television1);
		list.add(television2);
		list.add(television3);
		list.add(cellphone1);
		list.add(cellphone2);
		list.add(school1);
		list.add(school2);
		list.add(school3);
		
		
		for (Object object : list) {
			System.out.println(object);
		}
		
}
	
	public void carTest(){
		
		
		System.out.println();
	}
}

