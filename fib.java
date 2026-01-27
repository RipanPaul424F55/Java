import java.util.Scanner;
public class fib
{
    public static void fib(int a,int b,int n)
    {
        if(n>0)
        {
            System.out.print(a+" ");
            fib(b,a+b,--n);
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the range:");
        int n=obj.nextInt();
        fib(0,1,n);
    }
}