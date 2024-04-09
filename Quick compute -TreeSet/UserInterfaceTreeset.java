package Collections;
import java.util.Scanner;
public class UserInterfaceTreeset extends NumAvg_TreeSet{

	public static NumAvg_TreeSet newAvg = new NumAvg_TreeSet();
	public static Scanner get = new Scanner(System.in);
	
	public static void main(String[] Args) {
		while(true) {
			display();
			int choice = get.nextInt();
			get.nextLine();
			switch(choice) {
				case 1:
					System.out.println("Enter Number to Add : ");
					int numbertoadd = get.nextInt();
					get.nextLine();
					newAvg.addNum(numbertoadd);
					break;
				case 2:
					double average = newAvg.calAvg();
					System.out.println(average);
					break;
				case 3:
					System.out.println("Thank you for choosing this Application");
					return;
				default:
					System.out.println("invalid choice, please enter valid option");
					break;
			}
		}
	
}
	private static void display() {
		System.out.println("\nMenu: ");
		System.out.println("1. Add Number");
		System.out.println("2. Find Average");
		System.out.println("3. Exit");
	}
		
	}

