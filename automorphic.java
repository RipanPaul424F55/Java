public class automorphic
{
    public static boolean check(int n)
    {
        int sq=n*n;
        return (sq%100==n)? true : false;
    }
    public static void main(String args[])
    {
        //if(check(Integer.parseInt(args[0])))
        //System.out.print("The number is automorphic");
        //else
        //System.out.print("The number is not aputmorphic");
        //another way
        System.out.print("\n (Another way) is the number is automorphic:");
        System.out.print((Math.pow(Integer.parseInt(args[0]),2)%100==Integer.parseInt(args[0])) ? "yes" : "no");
    }
}