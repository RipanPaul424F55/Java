class con
{
    char c;
    int n;
    public con(char c,int n)
    {
        this.c=c;
        this.n=n;
    }
}
public class anagram
{
    public static void print(con [] a)
    {
        System.out.println("the given array");
        for(con g:a)
        System.out.println("char:"+g.c+" ,val:"+g.n);
    }
    public static String sorted(con [] a)
    {
        String s="";
        for(int i=0;i<a.length-1;i++)
        for(int j=0;j<a.length-i-1;j++)
        if(a[j].n>a[j+1].n)
        {
            int n1=a[j].n;
            char c1=a[j].c;
            a[j].n=a[j+1].n;
            a[j].c=a[j+1].c;
            a[j+1].n=n1;
            a[j+1].c=c1;
        }
        for(int i=0;i<a.length;i++)
        s+=a[i].c;
        return s;
    }
    public static String check(String s1,String s2)
    {
        if(s1.length()==s2.length() && s2.length()>0)
        {
            con [] a1=new con[s1.length()];
            con [] a2=new con[s2.length()];
            for(int i=0;i<a1.length;i++)
            a1[i]=new con(s1.charAt(i),(int)s1.charAt(i));
            for(int i=0;i<a2.length;i++)
            a2[i]=new con(s2.charAt(i),(int)s2.charAt(i));
            if(sorted(a1).equals(sorted(a2)))
            return "YES";
            else return "NO";
        }
        else return "NO";
    }
    public static void main(String args[])
    {
        if(args.length==2)
        System.out.print("Is the given string anagram?"+check(args[0],args[1]));
        else
        System.out.print("input error");
    }
}