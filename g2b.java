public class g2b
{
    public static int size(int n)
    {
        int c=0;
        while(n>0 && c++>-1)
        n=n/10;
        return c;
    }
    public static int xor(int a,int b)
    {
        if(a!=b)
        return 1;
        else
        return 0;
    }
    public static boolean check(int n)
    {
        boolean x=true;
        while(n>0)
        {
            if(!(n%10==0 || n%10==1))
            {
                x=false;
                break;
            }
            else
            n=n/10;
        }
        return x;
    }
    public static int binary(int grey)
    {
        int x=grey;
        int [] a=new int[size(grey)];
        int [] b=new int[size(grey)];
        for(int i=size(grey)-1;i>-1;i--)
        {
            a[i]=x%10;
            x=x/10;
        }
        for(int i=0;i<size(grey);i++)
        {
            if(i==0)
            b[0]=a[0];
            else
            b[i]=xor(b[i-1],a[i]);
        }
        int n=0;
        System.out.println("The array:");
        for(int i:b)
        System.out.print(i+" ");
        System.out.println();
        for(int i=0;i<size(grey);i++)
        n+=Math.pow(10,i)*b[size(grey)-(i+1)];
        return n;
    }
    public static void main(String args[])
    {
        int grey=Integer.parseInt(args[0]);
        if(check(grey))
        System.out.print("binary value of "+grey+" is "+binary(grey));
        else
        System.out.print("invalid gray value...");
    }
}