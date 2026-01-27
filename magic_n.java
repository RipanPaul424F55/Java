public class magic_n
{
    public static String check(int n)
    {
        return (recursion(n)==1)? "Yes" : "No";
    }
    public static int recursion(int n)
    {
        if(count(n)==1)
        return n;
        else
        {
            int s=0;
            while(n>0)
            {
                s+=n%10;
                n/=10;
            }
            return recursion(s);
        }
    }
    public static int count(int n)
    {
        int c=0;
        while(n>0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(String s:args)
        System.out.println("is "+s+" a magic number:"+check(Integer.parseInt(s)));
        else
        System.out.println("No input...");
    }
}