public class constructor {
    public static void main(String args[])
    {
        Student s1= new Student();
        Student s2= new Student("Alex ");
        Student s3= new Student(101);
    }
    }
class Student{
    String name;
    int standard;
    //  Non - Parameterized Constructor
    Student()
    {
        System.out.println("Empty constructor");
    }
    Student(String name) // Parameterized Constructor
    {
        this.name=name;
        // System.out.println("Default Constructor Created...");
        System.out.println(this.name);
    }
    Student(int Stand)
    {
        this.standard=Stand;
        System.out.println(this.standard);
    }
};
