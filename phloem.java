public class phloem
{
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
    public static String check(int n)
    {
        int [] a=new int[count(n)];
        for(int i=0;i<a.length;i++)
        {
            a[i]=n%10;
            n/=10;
        }
        n=0;
        for(int i=1;i<a.length-1;i++)
        n+=a[i];
        return (n==(a[0]+a[a.length-1]))? "Xylem" : "Phloem";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("is "+args[i]+" a xylem or phloem number?"+check(Integer.parseInt(args[i])));
        else
        System.out.println("No Input...");
    }
}