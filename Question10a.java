import java.util.Scanner;

public class Question10a
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter Input");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        int k=6,sum=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if((array[i]+array[j])%k==0)
                {
                    sum++;
                    System.out.println(array[i]+" "+array[j]);
                }

            }
        }
        System.out.println(sum);
//        int[] freq=new int[k];
//        for(int i:array)
//          freq[i%k]++;
//        sum+=(freq[0]*freq[0]-1)/2;
//        for(int i=1;i<=k/2;i++)
//            sum+=(freq[i]*freq[k-i]);
//        if(k%2==0)
//            sum+=(freq[k/2]*freq[k/2]-1)/2;
//        System.out.println(sum);
    }
}
