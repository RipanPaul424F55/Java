public class sunny
{
    public static String check(int n)
    {
        for(int i=1;i<=n+1;i++)
        if(i*i==n+1)
        return "Yes";
        return "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        System.out.print("is "+args[0]+" a sunny number:"+check(Integer.parseInt(args[0])));
        else
        System.out.print("no input...");
    }
}