public class ISBN
{
    public static String check(String st)
    {
        int a=Integer.parseInt(st.substring(0,st.length()/2));
        int b=Integer.parseInt(st.substring(st.length()/2,st.length()));
        int c=1,s=0;
        while(b>0)
        {
            System.out.println(b%10+" x "+c);
            s+=b%10*c++;
            b/=10;
        }
        while(a>0)
        {
            System.out.println(a%10+" x "+c);
            s+=a%10*c++;
            a/=10;
        }
        System.out.println("s:"+s);
        return (s%11==0)? "Yes" : "No";
    }
    public static void main(String args[])
    {
        if(args.length>0)
        for(int i=0;i<args.length;i++)
        System.out.println("Is "+args[i]+" an ISBN number? "+check(args[i]));
        else
        System.out.println("No input...");
    }
}