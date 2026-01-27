public class alternateprime
{
    public static boolean prime(int n)
    {
        if(n==0 || n==1)
        return false;
        for(int i=2;i<n;i++)
        if(n%i==0)
        return false;
        return true;
    }
    public static void check(int n)
    {
        System.out.println("For range "+n);
        System.out.println("Prime Numbers are");
        for(int i=0;i<n;i++)
        if(prime(i))
        System.out.println(i);
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        check(Integer.parseInt(args[i]));
        else
        System.out.println("No Input...");
    }
}