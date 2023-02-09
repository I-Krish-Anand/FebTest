import java.util.HashMap;
import java.util.Scanner;
public class Question1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int[] cost=new int[n];
        System.out.println("Enter Input");
        for(int i=0;i<n;i++)
            cost[i]=sc.nextInt();
        //int[]cost=new int[]{1,3,4,5,6};
        System.out.println("Enter sum:");
        int m=sc.nextInt();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<cost.length;i++)
        {
            if(map.containsKey(m-cost[i])) {
                System.out.println(map.get(m - cost[i]) + " " + (i + 1));
                break;
            }
            map.put(cost[i],i+1);
        }
    }
}
