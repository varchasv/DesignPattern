package lms;

public class BookIssueService {

    static int util(int row, int col ,int matrix [][], char ch )
    {
        int[][] cost = new int[row+1][col+1];
        // for 1st column
        for (int i = 1; i < row+1; i++)
        {
            if(matrix[i-1][0]=='.' || matrix[i-1][0]==ch)
            {
                cost[i][0] = 1 + cost[i - 1][0];
            }
            else {
                cost[i][0] = Integer.MAX_VALUE;
            }
        }

        // for 1st row
        for (int j = 1; j < col+1; j++)
        {
            if(matrix[0][j-1]=='.' || matrix[0][j-1]==ch)
            {
                cost[0][j] = 1 + cost[0][j];
            }
            else {
                cost[0][j] = Integer.MAX_VALUE;
            }
        }

        // for rest of the 2d matrix
        for (int i = 1; i < row+1; i++)
        {
            for (int j = 1; j < col+1; j++)
            {
               if(matrix[i-1][j-1] =='.' || matrix[i-1][j-1]==ch){
                   cost[i][j] = Math.min(cost[i][j-1],cost[i-1][j]) == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(cost[i][j-1],cost[i-1][j]) +1;
               }else {
                   cost[i][j] = Integer.MAX_VALUE;
               }
            }
        }

        // Returning the value in
        // last cell
        return cost[row][col];
    }
}
