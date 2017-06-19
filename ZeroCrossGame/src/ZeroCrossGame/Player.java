
package ZeroCrossGame;

import java.util.Scanner;


class Player extends Symbol 
{


    public void takeTurn(String[][] board) 
    {

        Scanner s = new Scanner(System.in);

        boolean turn = true;

        int bs = Controller.bs();
        while(turn)
        {
            System.out.println("please enter row");
            int row = s.nextInt();
            System.out.println("please enter col");
            int col = s.nextInt();
            System.out.print("you entered "+row+" "+col);
            System.out.println();
            if(row<1 || row>bs || col<1 ||col>bs)
            {
                System.out.println("Enter valid numbers for picking spot!!");
                System.exit(bs);
            }
            //..............
            if(!"X".equals(board[row - 1][col - 1]) && !"O".equals(board[row - 1][col - 1]))
            {
                board[row - 1][col - 1] = Spot;
                turn = false;
            }
            else 
            {
                System.out.println("Already occupied! please pick another spot!");
        }
    } 
} 

} 
