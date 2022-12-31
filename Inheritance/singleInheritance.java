public class singleInheritance {
    public static void main(String args[])
    {
        Fish shark = new Fish();
        shark.breathe();
    }

 }

    class Animal{
        String color;

        void eat()
        {
            System.out.println("I want pizza");
        }
        void breathe()
        {
            System.out.println("I want to breathe");
        }
    }

    class Fish extends Animal
    {
        String type;
        int fins;

        void water()
        {
            System.out.println("Water is black");
        }
    }
    

