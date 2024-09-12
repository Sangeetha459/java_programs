import java.util.Scanner;
public class main
{
    public static void main(String[] args)
{
    int n;
    int sum=0,avg;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of elements you want to store:");
    n=sc.nextInt();
    int[]array=new int[10];
    System.out.println("enter the elements of the array:");
    for(int i=0;i<n;i++)
    {
        array[i]=sc.nextInt();
        sum=sum+array[i];
    }
    System.out.println("sum of the elements are:"+sum);
    avg=sum/n;
    System.out.println("average of the elements are:"+avg);
}
}
    
