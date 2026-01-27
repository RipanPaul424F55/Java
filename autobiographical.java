public class autobiographical
{
    public static String check(int n)
    {
        int s=0;
        int n1=n;
        while(n>0)
        {
            s+=n%10;
            n/=10;
        }
        return (s==String.valueOf(n1).length())? "Yes" : "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("is "+args[i]+" an autobiographical?:"+check(Integer.parseInt(args[i])));
        else
        System.out.println("no input...");
    }
}