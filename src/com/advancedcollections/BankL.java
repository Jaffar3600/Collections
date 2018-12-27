package com.advancedcollections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BankL {
	public Set<SavingAccount> test(List<SavingAccount> a1){
		System.out.println(a1);
		Set<SavingAccount> set = new TreeSet<SavingAccount>(a1);
		return set;

	}
	
	
}
