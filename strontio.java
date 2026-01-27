public class strontio
{
    public static int count(int n)
    {
        int c=0;
        while(n>0)
        {
            n/=10;
            c++;
        }
        return c;
    }
    public static String check(int n)
    {
        if(count(n)!=4)
        return "No";
        n+=n;//pqrs
        n/=10;//pqr
        int ten=n%10;//r
        n/=10;//pq
        int hundread=n%10;//q
        return (ten==hundread)? "Yes" : "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("is "+args[i]+" a strontio number?"+check(Integer.parseInt(args[i])));
        else
        System.out.println("No Input...");
    }
}