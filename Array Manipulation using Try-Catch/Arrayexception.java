package Try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Arrayexception {
	static Scanner get = new Scanner(System.in);
	
	public static void main(String[] Args) {
		getDuplicateElement();
	}
	
	public static String getDuplicateElement() {
		try{
		System.out.println("Enter Array size : ");
		int n = get.nextInt();
		int[] array1 = new int[n];
		if(n<0) {
			throw new NegativeArraySizeException();
		}
		
		System.out.println("Enter elements of the Array: ");
		for(int i = 0;i<n;i++) {
			array1[i]=get.nextInt();
		}
		System.out.println("Array elements are :");
		for(int i=0;i<n;i++) {
			System.out.println(array1[i]);
		}
		System.out.println("Enter the position of array element to be replicated : ");
		int r = get.nextInt();
		if(r<0 || r>=n) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] replica =new int[array1.length+1];
		for(int i =0;i<=r;i++) {
			replica[i]=array1[i];
		}
		replica[r+1]=array1[r];
		for(int i = r+2;i<replica.length;i++) {
			replica[i]=array1[i-1];
		}
		System.out.println("Array with replicated elements :");
		for(int i=0;i<replica.length;i++) {
			System.out.println(replica[i]+"");
		}
		return null;
		}catch(InputMismatchException e) {
			System.out.println("Input was not in the coreect format");
			return "Input was not in the coreect format";
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of range");
			return "Array index is out of range";
		}catch (NegativeArraySizeException e) {
			System.out.println("Array size should be positive");
			return "Array size should be positive";
		}
	}	
	
}
