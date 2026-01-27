class oc
{
    int n;
    char c;
    public oc(char c)
    {
        this.c=c;
        n=1;
    }
}
class con
{
    boolean b;
    char c;
    public con(char c,boolean b)
    {
        this.c=c;
        this.b=b;
    }
}
public class highestoccurance
{
    public static int cxx;
    public static int newoc(oc [] occurance,char ch,int count)
    {
        if(count==0)
        return -1;
        else
        for(int i=0;i<count;i++)
        if(occurance[i].c==ch)
        return i;
        return -1;
    }
    public static oc [] sorted(oc [] a,int count)
    {
        for(int i=count-1;i>0;i--)
        for(int j=count-1;j>0;j--)
        if(a[j].n>a[j-1].n)
        {
            int n1=a[j].n;
            char c1=a[j].c;
            a[j].c=a[j-1].c;
            a[j].n=a[j-1].n;
            a[j-1].c=c1;
            a[j-1].n=n1;
        }
        return a;
    }
    public static oc [] find(String s)
    {
        oc [] occurance=new oc[s.length()];
        int occurancecount=0;
        con [] c=new con[s.length()];
        for(int i=0;i<s.length();i++)
        c[i]=new con(s.charAt(i),false);
        for(int i=0;i<s.length();i++)
        {
            if(!c[i].b)
            for(int j=i;j<s.length();j++)//checks each character for one iteration
            if(!c[j].b && c[i].c==c[j].c)//if the element is not counted before
            {
                if(newoc(occurance,c[i].c,occurancecount)==-1)//inserting new character with occurance 1
                occurance[occurancecount++]=new oc(c[i].c);
                else
                occurance[newoc(occurance,c[i].c,occurancecount)].n++;//incrementing its frequency by one
                c[j].b=true;//don't change
            }
        }
        cxx=occurancecount;
        return sorted(occurance,occurancecount);
    }
    public static void main(String args[])
    {
        oc [] x=find(args[0]);
        for(int i=0;i<cxx;i++)
        System.out.println("character:"+x[i].c+" occurance:"+x[i].n);
    }
}