import java.util.Scanner;
public class factorial
{
    private static int factorial(int n)
    {
        if(n>0)
        return factorial(n-1)*n;
        else 
        return 1;
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=obj.nextInt();
        System.out.print(n+"! = "+factorial(n));
    }
}