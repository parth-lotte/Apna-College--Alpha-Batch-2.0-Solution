public class OOPS{

    public static void main(String args[])
    {
        Pen p1= new Pen();
        p1.setColor("Black");
        System.out.println(p1.color);

        BankAccount myAcc= new BankAccount();
        myAcc.username="Parth Lotte";
        // myAcc.password="abcdefghi";


    }
}

class Pen{

    String color;
    int tip;

    void getColor(String newColor)
    {
        color=newColor;
    }

    void setTip(int newTip)
    {
        tip=newTip;
    }
};

class BankAccount{

 public String username;
 private String password;
  void setPass(String pwd)
 {
    password=pwd;
 }
};