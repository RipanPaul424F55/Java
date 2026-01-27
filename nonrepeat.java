public class nonrepeat
{
    public static boolean check(String [] a)
    {
        boolean x=false;
        for(int i=0;i<a.length;i++)
        {
            boolean b=true;
            for(int j=0;j<a.length;j++)
            if(a[i].equals(a[j]) && i!=j)
            b=false;
            if(b==true)
            {
                if(!x)
                System.out.println("non repeat element(S)");
                System.out.println(a[i]);
                x=true;
            }
        }
        return x;
    }
    public static void main(String args[])
    {
        System.out.println("The array:");
        for(String s:args)
        System.out.print(s+" ");
        System.out.println();
        if(!check(args))
        System.out.print("There are no non-repeating elements");
    }
}