abstract class Person{
  int age;
  String name;
  Person(int a, String n){
    age = a;
    name = n;
  }
  void display(){
    System.out.println("Name is: "+name+"\nAge is: "+age);
  }
}
class Child extends Person{
  Child(int a, String n){
    super(a,n);
  }
}
class Abstract{
  public static void main(String args[]){
    Child c = new Child(21, "Akash");
    c.display(); // display method of person cannot be accessed directly can only be accessed by inheriting the person class
  }
} 