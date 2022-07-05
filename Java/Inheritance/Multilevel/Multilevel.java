class Student{
  int RollNo;
  String Name;
  Student(int a, String b){
    RollNo = a;
    Name = b;
  }
  void display(){
    System.out.println("Name = "+Name+ " Roll NO: " +RollNo);
  }
}
class Test extends Student{
  float m1,m2;
  Test(int r, String n, float x, float y ){
    super(r,n);
    m1 = x;
    m2 = y;
  }
  void show(){
    System.out.println("Marks 1: "+ m1 + " Marks 2: "+ m2);
  }
}
class Result extends Test{
  float total;
  Result(int r, String n, float x, float y){
    super(r,n,x,y);
  }
  void showRes(){
    total = m1+m2;
    System.out.println("Total Result: "+total);
  }
}
class Multilevel{
  public static void main(String args[]){
    Result R = new Result(71, "Akash", 93,98);
    R.display();
    R.show();
    R.showRes();
  }
}