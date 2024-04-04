package Interfaceday4;
import java.util.Scanner;
public class Main extends CustmerDetails {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		CustmerDetails c1 = new CustmerDetails(get);
		System.out.println(c1);
	}
}
