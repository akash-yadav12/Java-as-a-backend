class ExceptionDemo {
  public static void main(String args[]) {
    int num =8;
    try {
      if(num%2==0){
      throw(new ArithmeticException());
    }
    }
    catch(Exception e) {
      System.out.println("Exception Occured--->" + e);
    }
    System.out.println("Execution of first part Complete");

    // Catching multiple exception
    int a[] = {5,10};
    int b = 5;
    try{
      int x = a[2]/b-a[1];
    }
    catch(ArithmeticException e){
      System.out.println("Division by zero "+ e);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array index Error ---> "+ e);
    }
    catch(ArrayStoreException e){
      System.out.println("Wrong Datatype ---> "+e);
    }
    finally{
      System.out.println("Finally Block executed!!");
    }
    int y = a[1]/a[0];
    System.out.println("y = "+y);
  }
}
  