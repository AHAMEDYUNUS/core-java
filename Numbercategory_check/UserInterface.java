package Lambda_NumberCategory;

public class UserInterface {
    public static void main(String[] args) {
        java.util.Scanner get = new java.util.Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = get.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = get.nextInt();

        NumberCategory amicableChecker = NumberCategoryUtility.checkAmicable();
        NumberCategory palindromeChecker = NumberCategoryUtility.checkPalindrome();

        boolean areAmicable = amicableChecker.checkNumberCategory(num1, num2);
        boolean isPalindrome = palindromeChecker.checkNumberCategory(num1, num2);

        if (areAmicable) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers");
        }

        if (isPalindrome) {
            System.out.println("Their Product " + (num1 * num2) + " does produce a Palindrome");
        } else {
            System.out.println("Their Product " + (num1 * num2) + " does not produce a Palindrome");
        }
    }
}
