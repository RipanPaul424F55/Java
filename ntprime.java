public class ntprime
{
    public static boolean prime(int n)
    {
        if(n<=1)
        return false;
        for(int i=2;i<n;i++)
        if(n%i==0)
        return false;
        return true;
    }
    public static void check(int a,int b)
    {
        while(a<b)
        {
            if(prime(a))
            System.out.println("Prime:"+a);
            a++;
        }
    }
    public static void main(String args[])
    {
        if(args.length==1)
        check(0,Integer.parseInt(args[0]));
        else if(args.length>=2)
        check(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        else
        System.out.println("No Input");
    }
}