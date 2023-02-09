import java.util.Scanner;
public class Question5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String a=sc.next();
        System.out.println("Enter number of test cases");
        int testcases=sc.nextInt();
        while (testcases-->0)
        {
            System.out.println("Enter substring starting index:");
            int i=sc.nextInt();
            System.out.println("Enter substring ending index:");
            int j=sc.nextInt();
            String temp=a.substring(i-1,j-1);
            int[]freq=new int[26];
            for(char ch:temp.toCharArray())
             freq[ch-97]++;
            int count=0;
            boolean flag=true;
            for( i=0;i<26;i++)
            {
                if(freq[i]>0) {
                    if (freq[i] % 2 == 0)
                        count++;
                    else if (flag) {
                        count++;
                        flag = false;
                    }
                }
            }
            System.out.println(count);

        }
    }
}
