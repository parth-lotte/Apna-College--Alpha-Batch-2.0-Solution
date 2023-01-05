public class interfaces {

    public static void main(String args[])
    {

        Queen Q= new Queen();
        Q.moves();

    }

}

interface ChessPlayer{
    void moves();
}

    class Queen implements ChessPlayer {

        public void moves()
        {
            System.out.println("up,down,right,left,diagonal");
        }
    }
    class Rook implements ChessPlayer {

        public void moves()
        {
            System.out.println("up,down,right,left");
        }
    }
    class King  implements ChessPlayer {

        public void moves()
        {
            System.out.println("up,down,right,left");
        }
    }
