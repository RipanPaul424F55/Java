public class series
{
         public static void main(String args[])
         {
                for(int i=0;i<args.length;i++)
                System.out.println(args[i]+"th element is "+ser_ies(Integer.parseInt(args[i])));
         }
         public static int ser_ies(int n)
        {
              int i=1,val=0;
              int temp=0;
              System.out.println("The series");
              while(i<=n)
              {
                    if(i%2!=0)//odd
                    temp=val;
                    else
                    {
                         temp=val/2;
                         val+=2;
                    }
                    System.out.print(temp+" ");
                    i++;
              }
              System.out.println();
              return temp;
        }
}