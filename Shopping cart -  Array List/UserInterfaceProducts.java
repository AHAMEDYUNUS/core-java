package Collections;
import java.util.Scanner;
public class UserInterfaceProducts extends Products{
	public static Products listnew = new Products();
	static Scanner get = new Scanner(System.in);
	public static void main(String[] Args) {
			while(true){
				display();
				int choice1 = get.nextInt();
				switch(choice1){
				case 1:
					System.out.println("Enter products to add : ");
					String prod = get.nextLine();
					listnew.addProductToList(prod);
					break;
				case 2:
					System.out.println("Product List :");
					listnew.sortProductList();
					break;
				case 3:
					System.out.println("Thank you for using the Application !!");
					return;
				default:
					System.out.println("invalid option choose valid option ^-^! ");
					return;
				}}
		}
	private static void display() {
		System.out.println("\nMenu:");
		System.out.println("1. Add");
		System.out.println("2. Display");
		System.out.println("3. Exit");
	}
}
