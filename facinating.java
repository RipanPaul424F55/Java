public class facinating
{
    public static String str(int n)
    {
        return String.valueOf(n);
    }
    public static boolean all(String s)
    {
        for(int i=1;i<10;i++)
        {
            boolean b=false;
            for(int j=0;j<9;j++)
            if(String.valueOf(i).charAt(0)==s.charAt(j))
            {
                System.out.println(i+" found");
                b=true;
            }
            if(!b)
            return false;
        }
        return true;
    }
    public static String check(int n)
    {
        if(String.valueOf(n).length()<3)
        return "No";
        else
        {
            String s=str(n)+str(n*2)+str(n*3);
            System.out.println("s: "+s);
            if(s.length()==9 && all(s))//if s.length==9 and contain all character
            //then we no need to check for redundant,it will contain all 1-9 with no repetiti
            {//check for repeatition of numbers
                for(int i=1;i<=9;i++)
                {
                    boolean t=false;
                    for(int j=0;j<9;j++)
                    if(String.valueOf(i).charAt(0)==s.charAt(j))
                    if(!t)
                    t=true;
                    else return "No";
                }
                return "Yes";
            }
            else return "No";
        }
    }
    public static void main(String args[])
    {
        if(args.length>0)
        System.out.print("is "+args[0]+" a facinating number:"+check(Integer.parseInt(args[0])));
        else
        System.out.print("no input...");
    }
}