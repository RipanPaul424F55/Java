public class shift
{
    public static void main(String args[])
    {
        try
        {
        int n=Integer.parseInt(args[0]);
        System.out.print(n);
        }
        catch(Exception as e)
        {
            System.out.println("error : "+e.getMessage());
        }
    }
}