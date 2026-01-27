public class Erimp
{
    public static boolean prime(int n)
    {
        if(n==0 || n==1)
        return false;
        if(n==2)
        return true;
        for(int i=2;i<n;i++)
        if(n%i==0)
        return false;
        return true;
    }
    public static int count(int n)
    {
        int c=0;
        while(n>0)
        {
            n/=10;
            c++;
        }
        return c;
    }
    public static int rev(int n)
    {
        int s=0,c=count(n)-1;
        while(n>0)
        {
            s+=Math.pow(10,c--)*(n%10);
            n/=10;
        }
        return s;
    }
    public static String check(int n)
    {
        return (prime(n) && prime(rev(n)))? "Yes" : "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("is "+args[i]+" an erimp number:"+check(Integer.parseInt(args[i])));
        else
        System.out.print("no input...");
    }
}