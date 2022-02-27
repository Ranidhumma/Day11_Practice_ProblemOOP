package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	static double balance = 1000;
	ArrayList<StockInfo> arrayList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public void addStock() {
		StockInfo stockinfo;
		stockinfo = new StockInfo();
		double withdraw = 0;

		System.out.println("Enter the Stock name");
		scanner.nextLine();
		stockinfo.setStockName(scanner.nextLine());

		System.out.println("Enter the Number of Shares");
		stockinfo.setNumberOfShare(scanner.nextInt());

		System.out.println("Enter the share price");
		stockinfo.setSharePrice(scanner.nextDouble());

		withdraw = stockinfo.getSharePrice() * stockinfo.getNumberOfShare();

		if (balance >= withdraw) {
			balance = balance - withdraw;
			arrayList.add(stockinfo);
			System.out.println("Remaining balance = " + balance);
		} else

			debit(withdraw);
	}

	public void StockReportPrint() {
		StockInfo stockinfo;
		stockinfo = new StockInfo();
		for (int i = 0; i < arrayList.size(); i++) {
			stockinfo = arrayList.get(i);
			System.out.println(stockinfo.toString());

		}
	}

	public void debit(double withdraw) {
		if (withdraw > balance) {
			System.out.println("Debit amount exceeded account balance");
			System.out.println("Remaining Balance = " + balance);
			System.out.println("withdraw = " + withdraw);

		}
	}

	public void stockReport() {
		Double sum = 0.0;
		System.out.println("*****Stock Report*****");
		for (int i = 0; i < arrayList.size(); i++) {
			StockInfo s = arrayList.get(i);
			double totalprice = s.getNumberOfShare() * s.getSharePrice();

			totalprice = sum + totalprice;

			System.out.println("stock name = " + s.getStockName() + "\nnumber of shares = " + s.getNumberOfShare()
					+ "\nstock price = " + s.getSharePrice() + "\nTotal price of stock = " + totalprice + "\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account Test = new Account();
		System.out.println("Welcome to stock management Program");
		while (true) {
			System.out.println("Enter the choice! \n1)Addstock \n2)Stock report " + "\n3)exit");
			short choice = scanner.nextShort();
			switch (choice) {
			case 1 -> Test.addStock();
			case 2 -> Test.stockReport();
			case 3 -> System.exit(1);

			}
		}
	}
}
