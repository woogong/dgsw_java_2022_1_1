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
		System.out.printf("%s���� %d����ŭ �Ա��մϴ�.\n", name, amount);
		
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
		
		bank.makeAccount("ȫ�浿");
		
		DepositThread self = new DepositThread("ȫ�浿", bank, 300000);
		new Thread(self).start();
		
		DepositThread parent = new DepositThread("ȫ�浿", bank, 100000);
		new Thread(parent).start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		Account account = bank.getAccount("ȫ�浿");
		System.out.printf("%s���� ������ �ܾ��� %d���Դϴ�.\n", 
				account.getName(), account.getBalance());
		
	} 
	
	
	
	
}
