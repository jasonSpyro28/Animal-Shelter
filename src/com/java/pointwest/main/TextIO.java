package com.java.pointwest.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//File file = new File("C:\\Users\\jason.mateo\\Desktop\\sample\\sample.txt");
		File file = new File("C:\\Users\\jason.mateo\\Desktop\\sample\\groceries.txt");
		File totalBillFile = new File("C:\\Users\\jason.mateo\\Desktop\\sample\\totalBill.txt");
		// System.out.println(file.exists());

		try {
			// PrintWriter writer = new PrintWriter(file);
			// writer.print("Hello World");
			// writer.print("Hello World");
			// writer.flush();
			// writer.print("Hello World");
			// writer.close();

			Scanner scan = new Scanner(file);
			Double totalCost = 0.00;
			while (scan.hasNextLine()) {
				//System.out.println(scan.nextLine().split("\\|"));
				String item = scan.nextLine();
				String[] groceriesList = item.split("\\|");
				//System.out.println(groceriesList[0]);
				//System.out.println(groceriesList[1]);
				//System.out.println(groceriesList[2]);
				
				String fruit = (groceriesList[0]);
				Double qty = Double.parseDouble((groceriesList[1]));
				Double price = Double.parseDouble((groceriesList[2]));
				Double totalPrice = qty * price;
				totalCost += totalPrice;
				System.out.println("The " + qty + (String)fruit + " costs " + totalPrice);
			}
			System.out.println("The total bill costs " + totalCost);
			
			PrintWriter writer = new PrintWriter(totalBillFile);
			writer.print("The total bill costs " + totalCost);
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
