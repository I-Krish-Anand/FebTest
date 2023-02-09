import java.util.Scanner;

public class Question6
{
    static void swap(int[][]matrix,int j,int m,int k)
    {
        int temp=matrix[m][j];
        matrix[m][j]=matrix[k][j];
        matrix[k][j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n= sc.nextInt();
        int[][]matrix=new int[n][n];
        System.out.println("Enter Matrix elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                matrix[i][j]=sc.nextInt();
        }
        System.out.println("No of swaps");
        int nswaps= sc.nextInt();
        while (nswaps-->0) {
            for (int j = 0; j < matrix[0].length; j++) {
                int m = 0, k = n - 1;
                while (m < k) {
                    swap(matrix, j, m++, k--);
                }
            }
            //transpose
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
                System.out.println();

            }

    }
}
