import java.util.Scanner;
public class KadaneAlgorithm
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements in an array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int current_max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=0;
            for(int j=i;j<size;j++)
            {
                sum=sum+arr[j];
                if(sum>current_max)
                {
                    current_max=sum;
                }
            }
        }
        System.out.println(current_max);
    }
}
