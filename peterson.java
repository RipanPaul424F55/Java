public class peterson
{
    public static int factorial(int n)
    {
        if(n==0 || n==1)
        return 1;
        else return factorial(n-1)*n;
    }
    public static String check(int n)
    {
        int s=0,t=n;
        while(t>0)
        {
            s+=factorial(t%10);
            t=t/10;
        }
        return (s==n)? "yes" : "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        System.out.print("is "+args[0]+" a peterson number?:"+check(Integer.parseInt(args[0])));
        else
        System.out.print("no input in the command line argument...");
    }
}