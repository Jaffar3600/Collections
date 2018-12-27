package com.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ClassStudentTest {
 
	@Test
	public void testForStudentsNameSort() {
		List<String> arraylist = new ArrayList<String>();
		arraylist.add("Jaffer");
		arraylist.add("Shiva");
		arraylist.add("prasanth");
		arraylist.add("rajendra");
		arraylist.add("pilli");
		arraylist.add("mrudhla");
		arraylist.add("priyanka");
		arraylist.add("srivani");
		for (Object object : arraylist) {
			System.out.println(object);
		}
		System.out.println("----------------------------");
		Collections.sort(arraylist);
		
		for (Object object : arraylist) {
			System.out.println(object);
		}
	}

}
