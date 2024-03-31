package learningbasics;
public class NumberNames{
  public static void main(String[] args){
    java.util.Scanner get = new java.util.Scanner(System.in);
    System.out.println("Enter number to check : ");
    int num = get.nextInt();
    if(iseven(num)){
     System.out.println("even number");
     }else{
        System.out.println("odd number");
        }
  }
  public static Boolean iseven(int num){
    if(num%2==0){
      return true;
      }else{
        return false;
        }
  }      
  
}
