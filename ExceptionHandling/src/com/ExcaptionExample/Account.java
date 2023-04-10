package com.ExcaptionExample;

public class Account {
	
	private int id;
	private String name;
	private float balance;
	
	
	public Account() {
	
	}

	public Account(int id, String name, float balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	void deposit(float amount) {
		this.balance+=amount;
		System.out.println("deposit amount:"+amount);
		System.out.println("balance:"+this.balance);
	}
	
	void withdraw(float amount)  {
		if(this.balance-amount<0) {
			try {
			throw new InsufficientBalance("Balance is too low");
		}
		   catch(InsufficientBalance e) {
			System.out.println(e);   
		   }
		   }else {
			   this.balance=amount;
			   System.out.println("amount withdraw:"+amount);
			   System.out.println("current balance:"+this.balance);
		   }
	}
    

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}


	public class Test{
		
		public static void main(String[]args) {
			Account a1 = new Account();
			a1.setId(1001);
			a1.setName("priya");
			a1.setBalance(6000f);
			a1.deposit(200f);
			a1.withdraw(600);
			
			
		}
	}
	

}
