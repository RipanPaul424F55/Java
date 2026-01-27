import java.util.Scanner;
public class stringsort
{
    public conv [] sorted(conv [] a)
    {
        for(int i=0;i<a.length-1;i++)
        for(int j=0;j<a.length-i-1;j++)
        if(a[j].c2i()>a[j+1].c2i())
        {
            int n1=a[j].c2i();
            char c1=a[j].i2c();
            a[j].n=a[j+1].c2i();
            a[j].c=a[j+1].i2c();
            a[j+1].n=n1;
            a[j+1].c=c1;
        }
        return a;
    }
    public String sort(String s,stringsort d)
    {
        charval q=new charval();
        conv [] c=new conv[s.length()];
        for(int i=0;i<s.length();i++)
        c[i]=new conv(s.charAt(i),q.lib(s.charAt(i)));
        c=d.sorted(c);
        String s1="";
        for(int i=0;i<s.length();i++)
        s1+=c[i].i2c();
        return s1;
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        stringsort d=new stringsort();
        System.out.println("sorting of "+args[0]+" is "+d.sort(args[0],d));
        System.out.println("anagram check:");
        System.out.print("Enter first string:");
        String s1=obj.next();
        System.out.print("Enter second string:");
        String s2=obj.next();
        obj.close();
        System.out.println("is it anagram? "+((d.sort(s1,d).equals(d.sort(s2,d)))? "YES" : "NO" ));
    }
}