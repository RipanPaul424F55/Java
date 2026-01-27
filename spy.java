public class spy
{
    public static String check(int n)
    {
        int n1=n,s=0,p=1;
        while(n1>0)
        {
            s+=n1%10;
            n1/=10;
        }
        while(n>0)
        {
            p*=n%10;
            n/=10;
        }
        return (s==p)? "Yes" : "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("is "+args[i]+" a spy number:"+check(Integer.parseInt(args[i])));
        else
        System.out.print("no input");
    }
}