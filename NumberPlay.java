package learningbasics;

public class NumberPlay {
	public static void main(String[] args) {
		java.util.Scanner get = new java.util.Scanner(System.in);
		System.out.print("Enter number : ");
		int input = get.nextInt();
		String numString = Integer.toString(input);
		if(greater(input)) {
			char dig1=numString.charAt(0);
			char dig2=numString.charAt(1);
			
			int intdig1=Character.getNumericValue(dig1);
			int intdig2=Character.getNumericValue(dig2);
			int z = intdig1-intdig2;
			System.out.println(z);
		}else {
			char digit1=numString.charAt(0);
			char digit2=numString.charAt(1);
			int intdigit1=Character.getNumericValue(digit1);
			int intdigit2=Character.getNumericValue(digit2);
			int a = intdigit2-intdigit1;
			System.out.println(a);
				}
		}
public static Boolean greater(int input) {
	if(input>50) {
		return true;
	}else {
		return false;
	}
}
}
