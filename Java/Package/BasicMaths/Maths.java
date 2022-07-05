package BasicMaths;
public class Maths
{
 public static int add(int a,int b)
 {
   return (a+b);
 }
 public static int mul(int a, int b)
 {
  return (a*b);
 }
 public static int sub(int a, int b)
 {
  return (a-b);
 }
 public static int div(int a, int b)
 {
  return (a/b);
 }
 public static int mod(int a, int b)
 {
  return (a%b);
 }
 public static boolean armstrong(int a)
 {
  int og,rem,sum=0;
  og=a;
  while(a!=0)
  {
   rem=a%10;
   sum= sum+rem*rem*rem;
   a=a/10;
  }
  if(sum==og)
  {
   return true;
  }
  else
  {
   return false;
  }
 } 
 public static String stringRev(String str)
 { 
  int i;
  String rev="";
  for(i=str.length()-1;i>=0;i--)
  {
    rev=rev +str.charAt(i);
  }
  return rev;
 }
 public static int fact( int n)
  {
   int i,fact=1;
   for(i=1;i<=n;i++)
   {
    fact=fact*i;
   }
   return fact;
  }
 public static float permutation(int n,int r)
 {
  return Maths.fact(n)/Maths.fact(n-r);
 }
 public static int reverse(int num)
 {
  int rem,rev=0;
  while(num!=0)
  {
    rem=num%10;
    rev=rev*10 +rem;
    num=num/10;
  }
  return rev;
 }
} 
 
