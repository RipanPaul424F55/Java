class node
{
    int v;
    node next;
    public node(int v,node next)
    {
        this.v=v;
        this.next=next;
    }
}
public class max
{
    public static node input(String [] s)
    {
        node start=null,temp=null;
        for(String y:s)
        if(start==null)
        {
            start=new node(Integer.parseInt(y),null);
            temp=start;
        }
        else
        {
            temp.next=new node(Integer.parseInt(y),null);
            temp=temp.next;
        }
        return start;
    }
    public static int large(node n)
    {
        int x=0;
        while(n!=null)
        {
            if(n.v>x)
            x=n.v;
            n=n.next;
        }
        return x;
    }
    public static int small(node n)
    {
        int x=n.v;
        while(n!=null)
        {
            if(x>n.v)
            x=n.v;
            n=n.next;
        }
        return x;
    }
    public static double avg(node n)
    {
        double c=0,s=0;
        while(n!=null)
        {
            c++;
            s+=n.v;
            n=n.next;
        }
        return s/c;
    }
    public static int sum(node n)
    {
        int s=0;
        while(n!=null)
        {
            s+=n.v;
            n=n.next;
        }
        return s;
    }
    public static int prod(node n)
    {
        int p=1;
        while(n!=null)
        {
            if(n.v==0)
            return 0;
            p*=n.v;
            n=n.next;
        }
        return p;
    }
    public static void print(node n)
    {
        System.out.println("the linked list");
        while(n!=null)
        {
            System.out.print(n.v);
            System.out.print(" ");
            n=n.next;
        }
    }
    public static void main(String args[])
    {
        node n=input(args);
        print(n);
        System.out.println();
        System.out.println("Largest value:"+large(n)+" ,smallest value:"+small(n));
        System.out.print("average:"+avg(n)+" ,sum:"+sum(n)+"\n");
        System.out.print("Product:"+prod(n));
    }
}