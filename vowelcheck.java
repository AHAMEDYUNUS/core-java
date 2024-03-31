package Learningbase;

public class vowelcheck {
	public static void main(String[] args) {
		java.util.Scanner getsent = new java.util.Scanner(System.in);
		String sentence;
		System.out.print("Enter a string : ");
		sentence = getsent.nextLine();
		
		int count =0;
		for(int i=0; i<sentence.length(); i++)
		{
			if (isvowel(sentence.charAt(i))) {
				count++;
			}
		}
		System.out.println("Number of vowels : "+ count);
	}

	public static boolean isvowel(char letter)
	{
		switch(letter)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				return true;
			default:
				return false;
		}
	}
}
