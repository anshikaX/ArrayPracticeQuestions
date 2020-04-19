import java.util.Scanner;
public class SubarrayWithGivenSum
{
    public static void main(String args[])
    {
        int flag =1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the number");
        int num=sc.nextInt();

        System.out.println("Entering elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0)
            {
                System.out.println("Invalid input");
                i--;
            }

        }

        int sum=0;
        for(int i=0;i<size && sum!=num;i++)
        {
            sum=0;
            for(int j=i;j<size;j++)
            {
                sum = sum + arr[j];
                if(sum==num)
                {
                    System.out.println("Starting position is: " +(i+1)+ " and Ending position is: " +(j+1) );
                    System.out.println(sum);
                    flag=0;
                    break;
                }
            }
        }

        if(flag==1)
        {
            System.out.println("-1");
        }



    }
}
