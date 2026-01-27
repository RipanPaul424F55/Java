public class bin2dec
{
    public static boolean isbin(String s)
    {
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        if(s.charAt(i)!='1' && s.charAt(i)!='0')
        {
            flag=false;
            break;
        }
        return flag;
    }
    public static byte lib(char c)
    {
        if(c=='0')
        return 0;
        else 
        return 1;
    }
    public static int dec(String s)
    {
        int sum=0,count=0;
        for(int i=s.length()-1;i>-1;i--)
        sum+=lib(s.charAt(i))*Math.pow(2,count++);
        return sum;
    }
    public static void main(String args[])
    {
       /* Scanner obj=new Scanner(System.in);
        Systemp.out.println("Enter a binary value:");
        String bin=obj.next();*/
        String bin=args[0];
        if(isbin(bin))
        System.out.print("decimal value of ("+bin+")2 is ("+dec(bin)+")10");
        else
        System.out.print("Invalid input...");
    }
}