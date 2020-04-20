import java.util.Scanner;
public class MissingNumberInArray
{
    public void missingNumber(int array[],int n)
    {

        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n-1;i++)
        {
            sum2=sum2+array[i];
        }
        System.out.println(sum1-sum2);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        MissingNumberInArray mn=new MissingNumberInArray();
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
                array[i]=sc.nextInt();
        }
            mn.missingNumber(array,n);
        }

    }
