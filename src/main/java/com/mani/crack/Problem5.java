package com.mani.crack;

public class Problem5
{
    public static void main(String[] args)
    {
        /*
        *
        * Write an algorithm such that if an element in an MxN matrix is 0,
        * its entire row and column is set to 0.
        * */



        //int[][] matrixSize= new int[5][4];
        int[][] matrixSize= new int[][]
                {
                        {1,2,3,4,5},
                        {9,0,1,5,4},
                        {1,3,4,5,1},

                };

        //keep the row index
        int[] rows = new int [matrixSize.length];
        //keep the column index
        int[] columns = new int[matrixSize[0].length];

        for (int i=0;i<rows.length;i++)
        {
            for (int j=0 ;j<columns.length;j++)
            {
                if (matrixSize[i][j]==0)
                {
                    rows[i]=1;
                    columns[j]=1;
                    //matrixSize[i][j]=1;
                }
            }
        }


        for (int i=0;i<rows.length;i++)
        {
            for (int j=0 ;j<columns.length;j++)
            {
                if ((rows[i] == 1 || columns[j] == 1))
                {
                    matrixSize[i][j] = 0;
                }
            }
        }

        //print the matrix for result
        for (int i=0;i<rows.length;i++)
        {
            for (int j=0 ;j<columns.length;j++)
            {
                System.out.print(matrixSize[i][j]);
            }
            System.out.println("");
        }



    }
}
