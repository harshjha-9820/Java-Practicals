import java.util.*;
class Student{
  private int rollno;
  private String name;
  private int age;
  private double cgpa;

  public Student() {
    rollno = 01;
    name = "Harsh Jha";
    age = 19;
    cgpa = 0.0;
    
  }

//
 public Student(int rollno, String name, int age, double cgpa){
   this.rollno = rollno;
   this.name = name;
   this.age = age;
   this.cgpa = cgpa;

 }
// getter method.....
  public int getRollno(){
    return this.rollno;
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public double getCgpa(){
    return this.cgpa;
  }

// Setter method.......
  void setRollno(int newRollno){
    this.rollno=newRollno;
  }
  void setName(String newName){
    this.name=newName;
  }
  void setAge(int newAge){
    this.age=newAge;
  }
  void setCgpa(double newCgpa){
    this.cgpa=newCgpa;
  }

}

// Dis[lay............
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Student s1 = new Student(01,"Aditya Jha",19,0.0);
    Student s2 = new Student(02,"Arham Jain",19,8.5);
    Student s3 = new Student(03,"Riya Sakhare",19,7.6);
    Student s4 = new Student(04,"Dev Nagar",19,8.9);
    Student s5 = new Student(05,"Harsh Jha",19,7.5);
    Student s6 = new Student(06,"Manav",19,7.0);
    Student s7 = new Student(07,"Parth Sharma",20,7.5);

    

    System.out.println("Student Detail:--");
    System.out.println("Roll no = " +s1.getRollno() +" ,Name = " +s1.getName() +" ,Age = " +s1.getAge() +" ,CGPA = " +s1.getCgpa());
    System.out.println("Roll no = " +s2.getRollno() +" ,Name = " +s2.getName() +" ,Age = " +s2.getAge() +" ,CGPA = " +s2.getCgpa());
    System.out.println("Roll no = " +s3.getRollno() +" ,Name = " +s3.getName() +" ,Age = " +s3.getAge() +" ,CGPA = " +s3.getCgpa());
    System.out.println("Roll no = " +s4.getRollno() +" ,Name = " +s4.getName() +" ,Age = " +s4.getAge() +" ,CGPA = " +s4.getCgpa());
    System.out.println("Roll no = " +s5.getRollno() +" ,Name = " +s5.getName() +" ,Age = " +s5.getAge() +" ,CGPA = " +s5.getCgpa());
    System.out.println("Roll no = " +s6.getRollno() +" ,Name = " +s6.getName() +" ,Age = " +s6.getAge() +" ,CGPA = " +s6.getCgpa());
    System.out.println("Roll no = " +s7.getRollno() +" ,Name = " +s7.getName() +" ,Age = " +s7.getAge() +" ,CGPA = " +s7.getCgpa());
    
  }
}
