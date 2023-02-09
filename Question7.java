import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question7
{
    void myFunc(int i,int[]array,List<Integer>list)
    {
        if(i==array.length) {
            System.out.println(list);
            return;
        }

        list.add(array[i]);
        myFunc(i+1,array,list);
        list.remove(list.size()-1);
        myFunc(i+1,array,list);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Enter Input");
        for(int i=0;i<n;i++)
            array[i]=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        Question7 obj=new Question7();
        obj.myFunc(0,array,list);
    }
}
