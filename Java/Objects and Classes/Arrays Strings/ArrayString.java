class ArrayString{
  public static void main(String args[]){
    int array[] = {1,2,3,4,5,6,7,8,9,10};
    for (int i = 0; i<10; i++){
      System.out.print(array[i]+" ");
    }

    String name = "Akash Yadav";
    System.out.println(name);

    String names[] = new String[5];
    for(int i = 0; i<5; i++){
      names[i] = "alias "+i;
    }

    for (int i = 0; i<5; i++){
      System.out.print(names[i]+" ");
    }
  }
}