import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
       int n=sc.nextInt();
        System.out.println("Enter Trailing days:");
        int d=sc.nextInt();
       int[]expenditure=new int[n];
        System.out.println("Enter Input for Arrays");
       for(int i=0;i<n;i++)
           expenditure[i]=sc.nextInt();
       int count=0;
       for(int i=0;i<expenditure.length;i++)
       {
           if(i>=d)
           {
               int[]temp=new int[5];
               System.arraycopy(expenditure,i-d,temp,0,5);
               Arrays.sort(temp);
               double median;
               if(d%2!=0)
                  median= temp[d/2];
               else
                   median=(temp[d/2]+temp[(d/2)-1])/2d;
               if(expenditure[i]>=2*median)
                   count++;
           }
       }
        System.out.println(count);
    }
}
