class Shape{
  protected double bs, ht, area;
  void getData(double b, double h){
    bs = b;
    ht = h;
  }
}
class Triangle extends Shape{
  void display(){
    area = 0.5*bs*ht;
    System.out.println("Area of Triangle is: "+area);
  }
}
class Reactangle extends Shape{
  void display(){
    area = bs*ht;
    System.out.println("Area of rectangle is: "+area);
  }
}
class Heirarchical{
  public static void main(String args[]){
    Triangle T = new Triangle();
    Reactangle R = new Reactangle();
    T.getData(3.5,7.5);
    T.display();
    R.getData(4,4);
    R.display();
  }
}