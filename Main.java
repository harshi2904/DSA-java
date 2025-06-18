import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    //store 5 roll nos
    int[] numbers=new int[5];
    //store 5 names
    String[] names= new String[5];
    //data of 5 students:{roll no,name,marks}
    int[] rno=new int[5];
    String[] name=new String[5];
    float[] marks=new float[5];
    Student[] students=new Student[5];
    //Student kunal;
    Student harshi=new Student();
    harshi.rno=13;
    harshi.name="harshitha";
    harshi.marks=90.5f;
    System.out.println(harshi.rno);
    System.out.println(harshi.name);
    System.out.println(harshi.marks);


  }
}
//create a class
class Student{
  int rno;
  String name;
  float marks;

  
  
}
