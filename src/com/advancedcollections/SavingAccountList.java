package com.advancedcollections;

public class SavingAccountList implements Comparable<SavingAccountList> {
	private double accountbalance;
	private int accountid;
	private String accountholdername;
	private boolean issalariedaccount;
	
	public SavingAccountList(double accountbalance, int accountid,
			String accountholdername, boolean issalariedaccount) {
		super();
		this.accountbalance = accountbalance;
		this.accountid = accountid;
		this.accountholdername = accountholdername;
		this.issalariedaccount = issalariedaccount;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountbalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((accountholdername == null) ? 0 : accountholdername
						.hashCode());
		result = prime * result + accountid;
		result = prime * result + (issalariedaccount ? 1231 : 1237);
		return result;
	}
	public double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public boolean isIssalariedaccount() {
		return issalariedaccount;
	}
	public void setIssalariedaccount(boolean issalariedaccount) {
		this.issalariedaccount = issalariedaccount;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccountList other = (SavingAccountList) obj;
		if (Double.doubleToLongBits(accountbalance) != Double
				.doubleToLongBits(other.accountbalance))
			return false;
		if (accountholdername == null) {
			if (other.accountholdername != null)
				return false;
		} else if (!accountholdername.equals(other.accountholdername))
			return false;
		if (accountid != other.accountid)
			return false;
		if (issalariedaccount != other.issalariedaccount)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "SavingAccountList [accountbalance=" + accountbalance
				+ ", accountid=" + accountid + ", accountholdername="
				+ accountholdername + ", issalariedaccount="
				+ issalariedaccount + "]";
	}
	
	
	@Override
	public int compareTo(SavingAccountList a) {
		if( a.accountid==this.accountid)
			return 0;
		else if(a.accountid>this.accountid)
			return -1;
		else
			return 1;
		
	}

}
