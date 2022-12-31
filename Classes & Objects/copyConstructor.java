// import javax.xml.stream.events.StartDocument;

public class copyConstructor {

    public static void main(String args[])
    {
        Student s1= new Student();
        s1.name="Parth";
        s1.roll=101;
        s1.password="ABCD";

        // Student s2= new Student();
        // s2.password="EFGH";

        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=70;

        Student s2= new Student(s1);
        s2.password="xyz";
        s1.marks[2]=100002;
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
        
    }
}

    class Student{

        String name;
        int roll;
        String password;
        int marks[];
        
        // Shalllow Copy Constructor 

        // Student (Student s1)
        // {
        //     marks= new int [3];
        //     // int marks [] = new int [3]
        //     this.name=s1.name;
        //     this.roll=s1.roll;
        //     this.marks=s1.marks;
        // }
            // Deep Copy Constructor

            Student (Student s1)
            {
                marks = new int[3];
                this.name=s1.name;
                this.roll=s1.roll;
                for (int i = 0; i < marks.length; i++) {
                    this.marks[i]=s1.marks[i];
                    
                }

            }

        Student()
        {
            marks= new int [3];
            System.out.println("Empty Constructor called..");
        }

        Student(String name)
        {
            marks= new int [3];
            this.name=name;

        }

         Student (int roll)
         {
            marks=new int[3];
            this.roll=roll;

         }

    };

    

