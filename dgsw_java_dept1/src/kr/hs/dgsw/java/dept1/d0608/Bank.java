package kr.hs.dgsw.java.dept1.d0608;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	private final Map<String, Account> accountMap = 
			new HashMap<String, Account>();
	
	public Account makeAccount(String name) {
		Account account = new Account();
		account.setName(name);
		account.setBalance(0);
		
		accountMap.put(name, account);
		
		return account;
	}
	
	public void deposit(String name, long amount) {
		System.out.printf("%s´ÔÀÌ %d¿ø¸¸Å­ ÀÔ±ÝÇÕ´Ï´Ù.\n", name, amount);
		
		Account account = accountMap.get(name);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {}
		
		if (account != null) {
			synchronized(account) {
				long balance = account.getBalance();
	
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {}
	
				balance = balance + amount;
	
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
	
				account.setBalance(balance);
			}
		}
	}
	
	public Account getAccount(String name) {
		return accountMap.get(name);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.makeAccount("È«±æµ¿");
		
		DepositThread self = new DepositThread("È«±æµ¿", bank, 300000);
		new Thread(self).start();
		
		DepositThread parent = new DepositThread("È«±æµ¿", bank, 100000);
		new Thread(parent).start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		Account account = bank.getAccount("È«±æµ¿");
		System.out.printf("%s´ÔÀÇ °èÁÂÀÇ ÀÜ¾×Àº %d¿øÀÔ´Ï´Ù.\n", 
				account.getName(), account.getBalance());
		
	} 
	
	
	
	
}
