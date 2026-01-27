import java.util.Scanner;
class octal2dec
{
    public static boolean isoct(int temp)
    {
        boolean flag=true;
        while(temp>0)
        {
            if(temp%10>7)
            {
                flag=false;
                break;
            }else
            temp=temp/10;
        }
        return flag;
    }
    public static int dec(int n)
    {

        int sum=0,count=0;
        while(n>0)
        {
            sum+=n%10*Math.pow(8,count++);
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a octal number:");
        int oct=obj.nextInt();
        if(isoct(oct))
        System.out.print("decimal value of ("+oct+")8 is ("+dec(oct)+")10");
        else
        System.out.print("invalid input...");
    }
}