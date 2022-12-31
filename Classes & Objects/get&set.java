public class get&set {

            public static void main(String args[])
        {
            Pen p1= new Pen();
            p1.setColor("Black");
            System.out.println(p1.getColor());
    
            // BankAccount myAcc= new BankAccount();
            // myAcc.username="Parth Lotte";
            // // myAcc.password="abcdefghi";
    
    
        }
    }
}
    
    class Pen{
    
        private String color;
        private int tip;
    
        String getColor()
        {
            return this.color;
        }
        
        void setColor(String newColor )
        {
            this.color=newColor;
        }

        int getTip()
        {
            return this.tip;
        }

        void setTip(int tip)
        {
            this.tip=tip;
        }
    };
    
    // class BankAccount{
    
    //  public String username;
    //  private String password;
    //   void setPass(String pwd)
    //  {
    //     password=pwd;
    //  }
    // };
    

