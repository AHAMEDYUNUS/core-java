package Try_catch;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Petname_File_exception {
	public static void findPetName(String filename) throws FileNotFoundException {
		FileReader fr = new FileReader(filename);
		boolean found = false;
		try(BufferedReader bf = new BufferedReader(fr)){
			
			String line;
			while(!found && (line = bf.readLine()) != null) {
				String[] words = line.split("\\s+");
				for(String word:words) {
					if(hasTwoVowels(word)) {
						System.out.println(word);
						found = true;
						break;
					}
				}
			}
		}catch (FileNotFoundException e) {
			System.err.println("Please give correct file name");
		}catch (IOException e) {
			System.out.println("Error occured while reading the file");
			e.printStackTrace();
		}
		
	}
	public static boolean hasTwoVowels(String word) {
		int count = 0;
		for(char c :word.toCharArray()) {
			if("aeiouAEIOU".indexOf(c) != -1) {
				count++;
			}
		}
		return count == 2;
	}

}
