class Rectangle{
  int length,breadth;
  Rectangle(int l, int b){
    length = l;
    breadth = b;
  }
  void display(){
    System.out.println("Length = "+length+ " Breadth = "+breadth);
  }
}

class Constructors{
  public static void main(String args[]){
    /* Create new object of rectangle
       Along with creating an object, initializing data using constructor
    */
    Rectangle r = new Rectangle(5,6);
    r.display();

  }
}