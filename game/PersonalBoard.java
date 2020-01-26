/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;

/**
 *
 * @author Jim
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        boolean[][] board = getBoard();

        if (d >= 1) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    board[i][j]=true;
                }
            }
        } else if (d <= 0) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    board[i][j]=false;
                }
            }

        } else {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    board[i][j]=(Math.random()<d);
                }
            }

        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        boolean[][] board = getBoard();
        if (i >= board.length || i1 >= board[0].length || i1 < 0 || i < 0) {
            return false;
        } else {
            return board[i][i1];
        }
    }

    @Override
    public void turnToLiving(int i, int i1) {

        boolean[][] board = getBoard();
        if (i >= board.length || i1 >= board[0].length || i1 < 0 || i < 0) {
            return;
        }

        board[i][i1] = true;
    }

    @Override
    public void turnToDead(int i, int i1) {
        boolean[][] board = getBoard();
        if (i >= board.length || i1 >= board[0].length || i1 < 0 || i < 0) {
            return;
        }
        board[i][i1] = false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        boolean[][] board = getBoard();
        int sum =0;
        
        
        
        for(int x=i-1;x<i+2;x++){
            for(int y=i1-1;y<i1+2;y++){
                if(x>=board.length){
                    
                }else if(y>=board[0].length){
                    
                }
                
                
                
                
                else if(x<0){
                    
                }else if(y<0){
                    
                }
                
                else if(board[x][y]){
                    sum++;
                }
            }
        }
        if(board[i][i1]){
            sum--;
        }
        return sum;
       
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        boolean[][] board = getBoard();
        if(i2<2){
            board[i][i1]=false;
        }else if(i2==2){
           
        }else if(i2==3){
           if(!board[i][i1]){
               board[i][i1]=true;
           }
        }else if(i2>3){
           board[i][i1]=false;
        }
    }

}
