package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
	ArrayList<StockInfo> arrayList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockAccount sa = new StockAccount();
		System.out.println("Welcome to stock management Program");
		while (true) {
			System.out.println("Enter the choice! \n1)Enter new stock \n2)Display Stock report " + "\n3)exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 -> sa.addStock();
			case 2 -> sa.stockReport();
			case 3 -> {
				System.out.println("exiting");
				System.exit(0);
			}
			default -> System.out.println("invalid, give correct input");
			}
		}
	}

	public void addStock() {
		StockInfo stockinfo = new StockInfo();

		System.out.println("Enter the Share name");
		stockinfo.setStockName(scanner.next());

		System.out.println("Enter the Number of share");
		stockinfo.setNumberOfShare(scanner.nextDouble());

		System.out.println("Enter the share price");
		stockinfo.setSharePrice(scanner.nextDouble());

		// adding object to array list
		arrayList.add(stockinfo);
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
}
