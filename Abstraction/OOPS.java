public class oops {
    public static void main(String args[])
    {
        Horse h= new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c=new Chicken();
        c.walk();
    }
}
        abstract class Animal
    {   
        String color;
        Animal()
        {
            color= "Black";
        }
        void eat()
        {
            System.out.println("Animal Eats");
        }
        abstract void walk();
    }
    class Horse extends Animal{
        void changeColor(){
            color="Pink";
        }
        void walk()
        {
            System.out.println("Walks on 4 legs");
        }
    }
    class Chicken extends Animal {
        void walk()
        {
            System.out.println("Walk on 2 legs");
        }
    }


    

