public class bouncy
{
    public static boolean inc(int n)
    {
        int l=n%10;
        n/=10;
        while(n>0)
        {
            if(l<n%10)
            return false;
            l=n%10;
            n/=10;
        }
        return true;
    }
    public static boolean dec(int n)
    {
        int l=n%10;
        n/=10;
        while(n>0)
        {
            if(l>n%10)
            return false;
            l=n%10;
            n/=10;
        }
        return true;
    }
    public static String check(int n)
    {
        return (!inc(n) && !dec(n))? "Yes" : "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("is "+args[i]+" a bouncy number?"+check(Integer.parseInt(args[i])));
        else
        System.out.println("NO input...");
    }
}