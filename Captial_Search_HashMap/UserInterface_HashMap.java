package Collections;
import java.util.Scanner;
public class UserInterface_HashMap extends Country{
	public static Country newMap = new Country();
	static Scanner get = new Scanner(System.in);
	public static void main(String[] Args) {
		while(true) {
			display();
			int choice = get.nextInt();
			get.nextLine();
			switch(choice){
			case 1:
				System.out.println("Enter country name to add: ");
				String counname = get.nextLine();
				System.out.println("Enter capitalname to add: ");
				String capiname = get.nextLine();
				newMap.add(counname, capiname);
				break;
			case 2:
				System.out.println("Enter country name to Search: ");
				String name = get.nextLine();
				String next = newMap.search(name);
				System.out.println(next);
				break;
			case 3:
				System.out.println("Thank you for using the Application !!");
				return;
			default:
				System.out.println("nvalid option choose valid option ^-^! ");
				return;
			}}
		}
		private static void display() {
			System.out.println("\nMenu:");
			System.out.println("1. Add");
			System.out.println("2. Search");
			System.out.println("3. Exit");
		}
	}