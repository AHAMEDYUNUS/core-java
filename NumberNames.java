package learningbasics;
import java.util.Scanner;
public class NumberNames {
	public static void main(String[] args) {
		Scanner getter = new Scanner(System.in);
		System.out.print("Enter number : ");
		int input = getter.nextInt();
		getter.close();
		
		String[] names = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		
		String numString = Integer.toString(input);
		
		for (int i=0;i<numString.length();i++) {
			char digit=numString.charAt(i);
			int index=Character.getNumericValue(digit);
			System.out.print(names[index]+ " ");
		}
	}
}
