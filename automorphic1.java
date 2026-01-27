public class automorphic1
{
    public static String check(int n)
    {
        return (n*n%Math.pow(10,dig(n))==n)? "yes" : "No";
    }
    public static int dig(int n)
    {
        int c=0;
        while(n>0)
        {
            n/=10;
            c++;
        }
        return c;
    }
    public static void main(String args[])
    {
        if(args.length>0)
        System.out.print("is "+args[0]+" automorhic?"+check(Integer.parseInt(args[0])));
        else
        System.out.print("no input...");
    }
}