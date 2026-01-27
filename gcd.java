import java.util.Scanner;
public class gcd
{
    public static int gcd(int a,int b)
    {
        if(a>b)
        return gcd(a-b,b);
        else if(b>a)
        return gcd(a,b-a);
        else
        return b;
    }
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a=obj.nextInt();
        System.out.print("Enter second number:");
        int b=obj.nextInt();
        System.out.print("gcd is "+gcd(a,b)+" lcm is "+(a*b)/gcd(a,b));
    }
}