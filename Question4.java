import java.util.Scanner;
public class Question4
{
    String myFunc(int i,String[] array,String temp)
    {
        if(i== array.length)
            return temp;
        if(temp.equals(""))
            return "";

        temp=temp.replaceAll(array[i],"");
        temp=myFunc(i+1,array,temp);
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No of test cases");
        int testCases=sc.nextInt();
        while (testCases-->0)
        {
            System.out.println("Enter array size:");
            int size=sc.nextInt();
            String[]array=new String[size];
            System.out.println("Enter input");
            for(int i=0;i<size;i++)
                array[i]=sc.next();
            System.out.println("Enter String to Compare:");
            String loginAttempt=sc.next();
            Question4 obj=new Question4();
            String temp=obj.myFunc(0,array,loginAttempt);
            if(temp.equals(""))
                System.out.println("True");
            else
                System.out.println("Wrong Password");
        }
    }
}
