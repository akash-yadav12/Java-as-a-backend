import java.util.*;

class Student{
  int marks;
  String name;
  Student(int m, String n){
    marks = m;
    name = n;
  }
  @Override
    public String toString() {
        return "Student{" + "name=" + '\''+ name + '\'' + ", marks='" + marks + '\'' + '}' + System.getProperty("line.separator");
    }
}

class SortObjects{
  public static void main(String args[]){
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(new Student(84, "Alias 1"));
    students.add(new Student(86, "Alias 2"));
    students.add(new Student(76, "Alias 3"));
    students.add(new Student(85, "Alias 4"));
    students.add(new Student(93, "Alias 5"));
    System.out.println(Arrays.asList(students));
    students.sort((a,b) -> b.marks - a.marks);
    System.out.println(Arrays.asList(students));
  }
}