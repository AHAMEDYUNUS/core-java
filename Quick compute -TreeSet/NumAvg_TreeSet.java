package Collections;
import java.util.TreeSet;
public class NumAvg_TreeSet {
	public TreeSet<Integer> numSet;

	public NumAvg_TreeSet(){
		this.numSet=new TreeSet<Integer>();
	}
	public TreeSet<Integer> getNumSet() {
		return numSet;
	}

	public void setNumSet(TreeSet<Integer> numSet) {
		this.numSet = numSet;
	}
	
public void addNum(int num) {
		if(num%5 !=0 && num%6 !=0) {
			numSet.add(num);
		}else {
			System.out.println("Numbers are divisible by 5 or 6: ");}}
	
		public double calAvg() {
			int sum = 0;
			for (int num:numSet) {
				sum+=num;
			}if (numSet.size()>0) {
				return sum/numSet.size();
			}else {
				System.out.println("ther's no numbers in treeset");
				return 0.0;
			}}}

