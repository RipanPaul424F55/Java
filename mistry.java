public class mistry
{
    public static int rev(int n)
    {
        int t=n,c=0,s=0;
        while(t>0)
        {
            t/=10;
            c++;
        }
        t=n;
        while(n>0)
        {
            s+=((int)Math.pow(10,c-1))*(n%10);
            c--;
            n/=10;
        }
        return s;
    }
    public static String check(int n)
    {
        for(int i=2;i<n;i++)
        if(i+rev(i)==n)
        return "Yes";
        return "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("is "+args[i]+" a mistry number?"+check(Integer.parseInt(args[i])));
        else
        System.out.println("No Input...");
    }
}