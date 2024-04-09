package Collections;
import java.util.HashMap;
public class Country {
	private HashMap<String, String> countryMap;
	public Country(){
		this.countryMap = new HashMap<String, String>();
		
	}
	public void add(String cname, String capname) {
		countryMap.put(cname,capname);
	}
	public String search(String cname) {
		return countryMap.get(cname);
	}
}
