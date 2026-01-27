public class smith
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
    public static int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public static String check(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        if(n%i==0 && prime(i))
        s+=sum(i);
        return (s==sum(n))? "Yes" : "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("Is "+args[i]+" a smith number:"+check(Integer.parseInt(args[i])));
        else
        System.out.println("No Input...");
    }
}