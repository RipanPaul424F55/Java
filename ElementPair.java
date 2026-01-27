import java.util.Scanner;
public class ElementPair
{
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the range of the array : ");
    int n=obj.nextInt();
    int [] a=new int [(n+1)];
    System.out.println("fill up");
    for(int i=0;i<n;i++)
    {
      System.out.print("a["+i+"] ");
      a[i]=obj.nextInt();
    }
    System.out.print("Enter a sum ");
    int s=obj.nextInt();
    boolean x=false;
    for(int i=0;i<n;i++)
    for(int j=i;j<n;j++)
    {
      if((a[j]+a[i])==s)
      {
        System.out.println("pair is "+a[i]+" + "+a[j]+" = "+(a[i]+a[j]));
        x=true;
      }
    }
    if(x==false)
    System.out.println("no pair found");
  }
}
