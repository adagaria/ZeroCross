
package ZeroCrossGame;

public class LevelEasy extends Symbol
{
    
    
     public void takeTurn(String[][] board, Player human) 
     {
        Board Setup = new Board();
        int bs = Controller.bs();
        int rand1 = 0;
        int rand2 = 0;
        boolean mademove = false;
        while(!mademove)
        {
            rand1 = (int) (Math.random() * bs);
            rand2 = (int) (Math.random() * bs);

            int rand11,rand22;
            
            if(!"X".equals(board[rand1][rand2]) && !"O".equals(board[rand1][rand2]))
            {
                rand11 = rand1+1;
                rand22 = rand2+1;
                System.out.println("\nSymbol  at: "+rand11+" "+rand22);
                board[rand1][rand2] = Spot;
                mademove = true;        
            }
        }
     }
}
