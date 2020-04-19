import java.util.Scanner;
public class CountTheTriplets
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements in an array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0)
            {
                System.out.println("Invalid input");
                i--;
            }
        }

        int sum;
        for(int i=0;i<size;i++)
        {
            sum=0;
            for(int j=i+1;j<size;j++)
            {
                sum=arr[i]+arr[j];
            }
            for(int k=0;k<size;k++)
            {
                if(arr[k]==sum)
                {
                    count++;
                    break;
                }
            }
        }
        if(count==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println("The count of triplets are: " +count);
        }

    }
}
