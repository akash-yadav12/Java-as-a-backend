// Create a new Class
class Person{
  String name;
  int age;
  void display(){
    System.out.println("Name is: "+name+" age is: "+age);
  }
}

class ObjectClass{
  public static void main(String args[]){
    // Create a new object of class Person
    Person p = new Person();

    // Accessing data and methods
    p.name = "Akash";
    p.age = 21;
    p.display();
  }
}