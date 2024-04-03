package com.kit.admissions;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		
		System.out.print("Enter student ID: ");
		int studentId = get.nextInt();
		System.out.print("Enter student name: ");
		String name = get.nextLine();
		System.out.println("Enter Department: ");
		String department = get.nextLine();
		System.out.println("Enter gender: ");
		String gender = get.nextLine();
		System.out.println("Enter category: ");
		String category = get.nextLine();
		System.out.println("Enter collegeFee: ");
		double collegeFee = get.nextDouble();
		
		if (category.equals("Hosteller")) {
            get.nextLine(); // Consume newline
            System.out.println("Enter the room number");
            int roomNumber = get.nextInt();
            get.nextLine(); // Consume newline
            System.out.println("Enter the Block name");
            String blockName = get.nextLine();
            System.out.println("Enter the room type");
            String roomType = get.nextLine();

            Hosteller hosteller = new Hosteller(studentId, name, department, gender, collegeFee, category, roomNumber, blockName, roomType);
            double totalFee = hosteller.calculateTotalFee();
            System.out.println("Total College fee is " + totalFee);
        } else if (category.equals("DayScholar")) {
            get.nextLine(); // Consume newline
            System.out.println("Enter Bus number");
            int busNumber = get.nextInt();
            System.out.println("Enter the distance");
            int distance = get.nextInt();

            Dayscholar dayScholar = new Dayscholar(studentId, name, department, gender, category, collegeFee, busNumber, distance);
            double totalFee = dayScholar.calculateTotalFee();
            System.out.println("Total College fee is " + totalFee);
        } else {
            System.out.println("Invalid category");
        }

        get.close();
    }
	}
	
