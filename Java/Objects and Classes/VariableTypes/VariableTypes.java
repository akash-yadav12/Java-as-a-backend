class Area{

  // Class/Static Variable
  static int count=0;
  Area(){
    count++;
  }

  // instance variable
  int dimension1, dimension2;

  int calculate(){
    // local variable
    int area;
    area = dimension1*dimension2;
    return area;
  }
}

class VariableTypes{
  public static void main(String args[]){
    Area area1 = new Area();
    Area area2 = new Area();
    Area area3 = new Area();
    // To access static variables/methods classname.(variable/method)name is used
    System.out.println("total no of object created are: "+ Area.count);
  }
}