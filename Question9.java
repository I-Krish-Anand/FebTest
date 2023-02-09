import java.util.Scanner;
public class Question9
{
    void display(int[][]matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][]matrix=new int[n][n];
        int[]binary={1,0};
        int i,start=0,j,end=n-1,k=0;
        while (start<=end)
        {
            for(i=start;i<=end;i++)
            {
                for (j = start; j <= end; j++)
                {
                    if (i == start || j == start||i==end||j==end)
                        matrix[i][j] =binary[k];
                }
            }
            start++;
            end--;
            k++;
            k=k%2;
        }
        Question9 obj=new Question9();
        obj.display(matrix);
    }
}
