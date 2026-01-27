public class keith
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
        int [] a=new int[count(n)+1];
        int temp=n,last=count(n);
        for(int i=count(n)-1;i>-1;i--)
        {
            a[i]=temp%10;
            temp/=10;
        }
        int s;//the sum
        do{
            s=0;
            for(int i=0;i<last;i++)
            s+=a[i];
            if(s==n)
            return "Yes";
            a[last]=s;
            a=rearrange(a);
        }while(s<n);
        return "No";
    }
    public static void array(int [] a)
    {
        for(int q:a)
        System.out.print(q+" ");
        System.out.println();
    }
    public static int [] rearrange(int [] a)
    {
        for(int i=0;i<a.length-1;i++)
        a[i]=a[i+1];
        a[a.length-1]=0;
        return a;
    }
    public static void main(String args[])
    {
        //if(args.length>0)
        System.out.print("\nIs "+742+" a keith number? "+check(Integer.parseInt("742")));
        //else
        //System.out.print("No input...");
    }
}