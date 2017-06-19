
package ZeroCrossGame;


class LevelHard extends Symbol 
{
  

    public void takeTurn(String[][] board, Player human) 
    {
        boolean mademove = false;

        Board Setup = new Board();
        int bs = Controller.bs();
        int counter = 1;
        
        for(int a = 0; a<bs; a++)
        {
            for(int j=0; j<bs-2; j++)
            {
                if((board[j][a].equals(board[j+1][a]) && board[j][a].equals(Spot))
                        || (board[j][a].equals(board[j+2][a]) && board[j][a].equals(Spot))
                        || (board[j+1][a].equals(board[j+2][a]) && board[j+1][a].equals(Spot)))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0;k<bs;k++)
                    {
                        if(!board[k][a].equals(human.getSymbol()) && !board[k][a].equals(Spot))
                        {
                            board[k][a] = Spot;
                            mademove = true;
                            return;
                        }
                    }
                }
            }
            counter = 1;
        }
        
        counter = 1;
      
        for(int i = 0; i<bs; i++)
        {
            for(int j=0; j<bs-2; j++)
            {
                if((board[i][j].equals(board[i][j+1]) && board[i][j].equals(Spot))
                        ||(board[i][j].equals(board[i][j+2]) && board[i][j].equals(Spot))
                        || (board[i][j+1].equals(board[i][j+2]) && board[i][j+1].equals(Spot)))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0; k<bs; k++)
                    {
                        if(!board[i][k].equals(human.getSymbol()) && !board[i][k].equals(Spot))
                        {
                            board[i][k] = Spot;
                            mademove = true;
                            return;
                        }
                    }
                }
               
            }
            counter = 1;
        }
        
        counter = 1;
        
        for(int i=0;i<bs;i++)
        {
            for(int j=0;j<bs;j++)
            {
                if(i!=j)
                {
                    if(board[i][i].equals(board[j][j]) && board[j][j].equals(Spot))
                    {
                        counter = counter+1;
                    }
                    if(counter == bs-1)
                    {
                        for(int k=0;k<bs;k++)
                        {
                            if(!board[k][k].equals(human.getSymbol()) && !board[k][k].equals(Spot))
                            {
                                board[k][k] = Spot;
                                mademove = true;
                                return;
                            }
                        }
                    }
                }
            }
        }
        counter = 1;
       
        for(int j=bs-2;j>=0;j--)
            {
                int i=bs-1;
                if(board[i][i].equals(board[j][j]) && board[j][j].equals(Spot))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0;k<bs;k++)
                    {
                        if(!board[k][k].equals(human.getSymbol()) && !board[k][k].equals(Spot))
                        {
                            board[k][k] = Spot;
                            mademove = true;
                            return;
                        }
                    }
                }
            }
        
        counter = 1;
    
        for(int i=0;i<bs-2;i++)
        {
            if(board[i][bs-1-i].equals(board[i+1][bs-1-i-1]) && board[i][bs-1-i].equals(Spot))
            {
                counter = counter+1;
            }
            if(counter == bs-1)
            {
                for(int k=0;k<bs-1;k++)
                {
                    if(!board[k][bs-1-k].equals(human.getSymbol()) && !board[k][bs-1-k].equals(Spot))
                    {
                        board[k][bs-1-k] = Spot;
                        mademove = true;
                        return;
                    }
                }
            }
        }
  
 
        counter = 1;
    
        for(int a = 0; a<bs; a++)
        {
            for(int j=0; j<bs-2; j++)
            {
                if((board[a][j].equals(board[a][j+1]) && board[a][j].equals(human.getSymbol()))
                        ||(board[a][j].equals(board[a][j+2]) && board[a][j].equals(human.getSymbol()))
                        || (board[a][j+1].equals(board[a][j+2]) && board[a][j+1].equals(human.getSymbol())))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0;k<bs;k++)
                    {
                        if(!board[a][k].equals(human.getSymbol()) && !board[a][k].equals(Spot))
                        {
                            System.out.println("Symbol at: "+a+" "+k);
                            board[a][k] = Spot;
                            mademove = true;
                            return;
                        }
                    }
                }
            }
            counter = 1;
        }
        
        counter = 1;
        
        for(int i = 0; i<bs; i++)
        {
            for(int j=0; j<bs-2; j++)
            {
                if(board[j][i].equals(board[j+1][i]) && board[j][i].equals(human.getSymbol())
                        || (board[j][i].equals(board[j+2][i]) && board[j][i].equals(human.getSymbol()))
                        || (board[j+1][i].equals(board[j+2][i]) && board[j+1][i].equals(human.getSymbol())))
                {
                    counter = counter+1;
                }
                if(counter == bs-1)
                {
                    for(int k=0; k<bs; k++)
                    {
                        if(!board[i][k].equals(human.getSymbol()) && !board[i][k].equals(Spot))
                        {
                            System.out.println("Symbol at: "+k+" "+i);
                            board[k][i] = Spot;
                            mademove = true;
                            return;
                        }
                    }
                }
               
            }
            counter = 1;
        }
        
        
  
        counter = 1;
        for(int j=1;j<bs;j++)
        {
            int i=0;
            if(board[i][i].equals(board[j][j]) && board[j][j].equals(human.getSymbol()))
            {
                counter = counter+1;
            }
            if(counter == bs-1)
            {
                for(int k=0;k<bs;k++)
                {
                    if(!board[k][k].equals(human.getSymbol()) && !board[k][k].equals(Spot))
                    {
                        System.out.println("Symbol at: "+k+" "+k);
                        board[k][k] = Spot;
                        mademove = true;
                        return;
                    }
                }
            }
        }
        
      
        counter = 1;
        for(int i=0;i<bs-1;i++)
        {
            if(board[i][bs-1-i].equals(board[i+1][bs-1-i-1]) && board[i][bs-1-i].equals(human.getSymbol()))
            {
                counter = counter+1;
            }
            if(counter == bs-1)
            {
                for(int k=0;k<bs;k++)
                {
                    if(!board[k][bs-1-k].equals(human.getSymbol()) && !board[k][bs-1-k].equals(Spot))
                    {
                        System.out.println("Symbol at: "+k+" "+(bs-1-k));
                        board[k][bs-1-k] = Spot;
                        mademove = true;
                        return;
                    }
                }
            }
        }

     
        int rand1 = 0;
        int rand2 = 0;
        
        while(!mademove)
        {
            rand1 = (int) (Math.random() * bs);
            rand2 = (int) (Math.random() * bs);

            int rand11,rand22;
            if(!"X".equals(board[rand1][rand2]) && !"O".equals(board[rand1][rand2]))
            {
                rand11 = rand1+1;
                rand22 = rand2+1;
                System.out.println("\nSymbol at: "+rand11+" "+rand22);
                board[rand1][rand2] = Spot;
                mademove = true;        
            }
        }
    }
}