import java.util.Scanner;
public class pattern
{
    public static void main(String[]args) {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
            System.out.print("*\t");
            }
            System.out.println();
        }
        for(i=4-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
