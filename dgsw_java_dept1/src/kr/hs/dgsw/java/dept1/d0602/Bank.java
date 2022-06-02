package kr.hs.dgsw.java.dept1.d0602;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {

	private final Map<String, Account> accountMap = new HashMap<String, Account>();
	
	public void makeAccount(String name) {
		Account account = new Account(name);
		accountMap.put(name, account);
	}
	
	public void deposit(String name, int amount) {
		Account account = accountMap.get(name);
		
		if (account != null) {
			int balance = account.getBalance();
			
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int newBalance = balance + amount;
			
			account.setBalance(newBalance);
		}
	}
	
	public Account getAccount(String name) {
		return accountMap.get(name);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.makeAccount("È«±æµ¿");
		
		Thread thread1 = new Thread(new DepositThread(bank, 50000));
		thread1.start();

		Thread thread2 = new Thread(new DepositThread(bank, 30000));
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Account account = bank.getAccount("È«±æµ¿");
		System.out.println(account.getName() + " °èÁÂÀÇ ÀÜ¾×Àº " + account.getBalance() + "¿ø ÀÔ´Ï´Ù.");
	}
	
}
