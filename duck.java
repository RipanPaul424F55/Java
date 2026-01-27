public class duck
{
    public static String check(String s)
    {
        if(s.charAt(0)=='0')
        return "No";
        int n=Integer.parseInt(s);
        while(n>0)
        {
            if(n%10==0)
            return "Yes";
            n/=10;
        }
        return "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("Is "+args[i]+" a duck number?"+check(args[i]));
        else
        System.out.println("No input");
    }
}