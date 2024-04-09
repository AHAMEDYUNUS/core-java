package Collections;
import java.util.ArrayList;
import java.util.Collections;
public class Products {
	private ArrayList<String> newlist;
	public Products() {
		this.newlist = new ArrayList<String>();
	}
	public void addProductToList(String product) {
		newlist.add(product);
	}
	public void sortProductList() {
		Collections.sort(newlist);
		for(String i :newlist) {
		System.out.println(i);
		}
		
	}

}
