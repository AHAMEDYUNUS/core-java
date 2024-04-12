package Try_catch;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class userInterface_petname extends Petname_File_exception{
	public static void main(String[] Args) throws FileNotFoundException {
		Scanner get = new Scanner(System.in);
		System.out.print("Enter file path/name : "); 
		String filen = get.nextLine();
		findPetName(filen);
	}
}
