package Lambda_NumberCategory;
import java.util.function.*;

 class NumberCategoryUtility implements NumberCategory {
	 public static NumberCategory checkAmicable() {
		return (num1, num2)-> {
			int sum1=0, sum2=0;
			for (int i=1; i<=num1/2; i++) {
				if (num1 % i ==0) {
					sum1 += i;
				}
			}
			for (int i=1; i<=num2/2; i++) {
				if (num2 % i ==0) {
					sum2 += i;
				}
			}
			return sum1 == num2 && sum2 == num1;
		};
	 }
	 public static NumberCategory checkPalindrome() {
	    return (num1, num2) -> {
	        int product = num1 * num2;
	        String productStr = String.valueOf(product);
	        String reversedProductStr = new StringBuilder(productStr).reverse().toString();
	        return productStr.equals(reversedProductStr);
	        };
	    }
	@Override
	public boolean checkNumberCategory(int num1, int num2) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
