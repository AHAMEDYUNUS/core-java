package Learningbase;
import java.util.Scanner;

public class rectangle {
	int length, bredth;
	public static void main(String[] args) {
		rectangle rect = new rectangle();
		System.out.print("Enter length:");
		rect.length =   new Scanner(System.in).nextInt();
		System.out.print("Enter bredth:");
		rect.bredth = new Scanner(System.in).nextInt();
		System.out.println(rect.getArea());
	}
	public int getArea() {
		return length*bredth;
	}
}
