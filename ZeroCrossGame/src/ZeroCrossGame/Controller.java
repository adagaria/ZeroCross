
package ZeroCrossGame;

import java.util.InputMismatchException;
import java.util.Scanner;

//Asking user for the game board size.
public class Controller
{
    public static int N;
    public static int getBoardSize()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose the size of the board! \n"
                    + "Enter 3 for 3X3 board, 4 for 4X4 board, etc..");
        int boardSize;
        boardSize = s.nextInt();
        System.out.print("You chose a "+boardSize+"X"+boardSize+" board.\n");
        return boardSize;
    }
    
    
    public static int bs()
    {
        return N;
    }
    
    
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Welcome to Cross Zero!!!");
            System.out.println();
            
            int pAgain;
            Scanner s = new Scanner(System.in);
            do
            {
                
                N = getBoardSize();
                
                if(N<=0)
                 {
                     System.out.println("Size of the board must be greater than '0'!"
                             + "\nPlease enter a valid number for size!!");
                     System.exit(N);
                 }
              
                Board Setup = new Board();
            
                Setup.createBoard();
                Setup.printBoard();
       
                System.out.println("\nChoose the difficulty level"
                        + "\n\t1. Easy\n\t2. Medium\n\t3.Hard"
                        );
                int level = s.nextInt(); /// setting the level
                if(level == 1)
                {
                  
                    Player human = new Player();
                    LevelEasy computer = new LevelEasy();
                    System.out.println("please choose your symbol");
                    System.out.println("type 1 for 'X' or 2 for 'O'");

                    int symbol = s.nextInt();
              
                    if(symbol == 1)
                    {
                        System.out.println("You choose 'X'");
                        human.setSymbol("X");
                        computer.setSymbol("O");
                    } 
                    else if(symbol == 2)
                    {
                        System.out.println("You chose 'O'");
                        human.setSymbol("O");
                        computer.setSymbol("X");
                    }
                    else if((symbol != 1) && (symbol != 2))
                    {
                        System.out.println("Please choose either '1' or '2'!!");
                        System.exit(symbol);
                    }
                  
                    int first = (int) (Math.random() * 2);

                    boolean won = false;
                    int turns = 0;
                
                    if(first == 0)
                    {
                        System.out.println("You got to make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! "
                                    + "\nCongratulations!!! You won the game!!");
                            System.exit(turns);
                        }
                    }
                    else
                    {
                        System.out.println("I make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! "
                                    + "\n I won the game!!");
                            System.exit(turns);
                        }
                    }
                
                    if(first == 0)
                    {
                        System.out.println();
                        while(!won)
                        {
                            human.takeTurn(Setup.getBoard());
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("Congrats, you won!");
                            }
                            if(turns == N*N)
                            {
                                won = true;
                               
                                System.out.println("Its a draw!");
                                break;
                            }
                            if(!won)
                            {
                                computer.takeTurn(Setup.getBoard(), human);
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You lost the game"
                                        );
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a draw!");
                                    break;
                                }
                            }   
                        } 
                    }
                    else 
                    {
                        System.out.println();
                        while(!won)
                        {
                            computer.takeTurn(Setup.getBoard(), human);
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("You lost the game"
                                        );
                            }
                            
                           
                            if(turns == N*N)
                            {
                                won = true;
                                System.out.println("Its a draw!");
                                break;
                            }
                            if(!won)
                            {
                                human.takeTurn(Setup.getBoard());
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You won the game!");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a draw!");
                                    break;
                                }
                            }
                        }
                    }
                }
                else if(level == 2)
                {
                   
                    Player human = new Player();
                    LevelMedium computer = new LevelMedium();
                    System.out.println("please choose your symbol");
                    System.out.println("type 1 for 'x' or 2 for 'o'");

                    int symbol = s.nextInt();
                
                    if(symbol == 1)
                    {
                     
                        System.out.println("You choose 'X'");
                        human.setSymbol("X");
                        computer.setSymbol("O");
                    } 
                    else if(symbol == 2)
                    {
                        System.out.println("You choose 'O'");
                        human.setSymbol("O");
                        computer.setSymbol("X");
                    }
                    else if((symbol != 1) && (symbol != 2))
                    {
                        System.out.println("Please choose either '1' or '2'!!");
                        System.exit(symbol);
                    }
                    
                    int first = (int) (Math.random() * 2);

                    boolean won = false;
                    int turns = 0;
                
                    if(first == 0)
                    {
                        System.out.println("You got to make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! \nYou won the game!!");
                            System.exit(turns);
                        }
                    }
                    else
                    {
                        System.out.println("I make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! \nI won the game!!");
                            System.exit(turns);
                        }
                    }
                
                    if(first == 0)
                    {
                        System.out.println();
                        while(!won)
                        {
                            human.takeTurn(Setup.getBoard());
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("Congrats you won!");
                            }
                            if(turns == N*N)
                            {
                                won = true;
                               
                                System.out.println("Its a draw!");
                                break;
                            }
                            if(!won)
                            {
                                computer.takeTurn(Setup.getBoard(), human);
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You lost the game"
                                       );
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a draw!");
                                    break;
                                }
                            }   
                        } 
                    }
                    else 
                    {
                        System.out.println();
                        while(!won)
                        {
                            computer.takeTurn(Setup.getBoard(), human);
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("You lost the game"
                                        );
                            }
                            
                            
                            if(turns == N*N)
                            {
                                won = true;
                                System.out.println("Its a draw!");
                                break;
                            }
                            if(!won)
                            {
                                human.takeTurn(Setup.getBoard());
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You win!");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a draw!");
                                    break;
                                }
                            }
                        }  
                    }
                    
                }
                else if(level == 3)
                {
                  
                    Player human = new Player();
                    LevelHard computer = new LevelHard();
                    System.out.println("please choose your symbol");
                    System.out.println("type 1 for 'x' or 2 for 'o'");

                    int marker = s.nextInt();
                 
                    if(marker == 1)
                    {
                       
                        System.out.println("You choose 'X'");
                        human.setSymbol("X");
                        computer.setSymbol("O");
                    } 
                    else if(marker == 2)
                    {
                        System.out.println("You choose 'O'");
                        human.setSymbol("O");
                        computer.setSymbol("X");
                    }
                    else if((marker != 1) && (marker != 2))
                    {
                        System.out.println("Please choose either '1' or '2'!!");
                        System.exit(marker);
                    }
                    
                    int first = (int) (Math.random() * 2);

                    boolean won = false;
                    int turns = 0;
                
                    if(first == 0)
                    {
                        System.out.println("You got to make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! \nYou won the game!!");
                            System.exit(turns);
                        }
                    }
                    else
                    {
                        System.out.println("I make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                    + "\n first player wins the game!! \nI won the game!!");
                            System.exit(turns);
                        }
                    }
                
                    if(first == 0)
                    {
                        System.out.println();
                        while(!won)
                        {
                            human.takeTurn(Setup.getBoard());
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("Congrats you won!");
                            }
                            if(turns == N*N)
                            {
                                won = true;
                             
                                System.out.println("Its a draw!");
                                break;
                            }
                            if(!won)
                            {
                                computer.takeTurn(Setup.getBoard(), human);
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You just lost the game"
                                      );
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                
                                    System.out.println("Its a draw!");
                                    break;
                                }
                            }   
                        }  
                    }
                    else 
                    {
                        System.out.println();
                        while(!won)
                        {
                            computer.takeTurn(Setup.getBoard(), human);
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("You lost the game"
                                        );
                            }
                            
                            
                            if(turns == N*N)
                            {
                                won = true;
                                System.out.println("Its a draw!");
                                break;
                            }
                            if(!won)
                            {
                                human.takeTurn(Setup.getBoard());
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You win!");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("Its a draw!");
                                    break;
                                }
                            }
                        } 
                    }
                }
                else
                {
                    System.out.println("Please enter a valid number for choosing the level!"
                            + "\nChoose 1 or 2 or 3 only.");
                    System.exit(level);
                }
                System.out.println("Would you like to play again? Type '1' for yes!!\n"
                        + "Any other input will be considered as a 'NO'!!");
                System.out.println();
                pAgain = s.nextInt();
            }while(pAgain == 1);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input!! \n ");
        }
    }
     
     
     
}