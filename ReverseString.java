  import java.util.*;
  public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String original;
       System.out.println("enter the string");
       original= sc.nextLine();  
       String reversed = "";
       int length = original.length();
       
       for (int i = length - 1; i >= 0; i--) {
          reversed = reversed + original.charAt(i);
       }
       
       System.out.println("Original string: " + original);
       System.out.println("Reversed string: " + reversed);
    }
 }
 



