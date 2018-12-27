package com.advancedcollections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class BankAccountListTest  {
private SavingAccountList savingaccount1,savingaccount2,savingaccount3,savingaccount4,savingaccount5,savingaccount6,savingacount7,savingaccount8;
	
	@Before
	public void setUp(){
		savingaccount1 = new SavingAccountList(10000,105,"jaffer",true);
		savingaccount2 = new SavingAccountList(10000,103,"shubham",false);
		savingaccount3 = new SavingAccountList(10000,102,"Shiva",true);
		savingaccount4 = new SavingAccountList(10500,105,"prasanth",false);
		savingaccount5 = new SavingAccountList(10900,109,"hema",true);
	}
	@Test
	public void testForPrintingObjectsThroughArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {
			Set<SavingAccountList> al = new TreeSet<SavingAccountList>();
			al.add(savingaccount1);
			al.add(savingaccount2);
			al.add(savingaccount3);
			al.add(savingaccount4);
			al.add(savingaccount5);
			
			for (SavingAccountList savingAccountList : al) {
				//System.out.println(savingAccountList);
			}
}
	
	
	
	
	
}
