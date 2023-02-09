import java.util.Scanner;

public class Question2b
{
    static void swap(int[]matrix,int m,int j)
    {
        int temp=matrix[m];
        matrix[m]=matrix[j];
        matrix[j]=temp;
    }
    static void swap(String[]matrix,int m,int j)
    {
        String temp=matrix[m];
        matrix[m]=matrix[j];
        matrix[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size");
        int N=sc.nextInt();
        String[] string = new String[N];
        int[] value = new int[N];
        int[]pos=new int[N];
        for (int i = 0; i < N; i++) {

            System.out.println("Enter String");
            String t=in.nextLine();
            String[]t1=t.split(" ");
            value[i] = Integer.parseInt(t1[0]);
            string[i]=t1[1];
            if(i<N/2)
                pos[i]=0;
            else
                pos[i]=1;
        }
        for(int i=0;i<N;i++)
        {
            int min=i;
            for(int j=i+1;j<N;j++)
            {
                if(value[j]<value[min])
                    min=j;
                if(value[j]==value[min] && pos[j]==0)
                    min=j;
            }
            swap(string,i,min);
            swap(value,i,min);
            swap(pos,i,min);
        }
        for(int i=0;i<N;i++){
            if(pos[i]==0)
                System.out.print('-');
            else
                System.out.print(string[i]+" ");
        }
    }
}
