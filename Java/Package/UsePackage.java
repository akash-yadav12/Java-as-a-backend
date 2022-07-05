import BasicMaths.*;
import java.util.*;
class UsePackage {
  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    int rev;  
    int a1=10;
    int b1=20;
    int c1;
    c1=Maths.add(a1,b1);
    System.out.println("addition is" +c1);
    System.out.println("multiplication is" +(Maths.mul(a1,b1)));
    if(Maths.armstrong(451)) {
      System.out.println("it is armstrong");
    }
    else {
    System.out.println("not armstrong");
    }
    String a;
    System.out.println("enter a string");
    a=sc.nextLine();
    System.out.println("reverse of the string is:"+(Maths.stringRev(a)));
    System.out.println("factorial is:"+ Maths.fact(5));
    System.out.println("permutation is:" +Maths.permutation(7,3));
    int num=3982;
    rev=Maths.reverse(num);
    System.out.println("reverse of the number is:" +rev);
  } 
} 