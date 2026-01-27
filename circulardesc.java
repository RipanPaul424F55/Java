class node
{
    int n;
    node next;
    public node(int n)
    {
        this.n=n;
        next=null;
    }
}
public class circulardesc
{
    public static node input(String [] args)
    {
        node s=null,t=null;
        for(String sx:args)
        if(s==null)
        {
            s=new node(Integer.parseInt(sx));
            t=s;
        }
        else
        {
            t.next=new node(Integer.parseInt(sx));
            t=t.next;
        }
        t.next=s;
        return s;
    }
    public static void disp(node x)
    {
        node s=x;
        do{
            if(s.next!=x)
            System.out.print(s.n+",");
            else
            System.out.println(s.n);
            s=s.next;
        }while(s!=x);
    }
    public static node sort(node start)
    {
        node temp=start;
        do{
            node temp1=start;
            do{
                if(temp1.next!=start)
                if(temp1.n<temp1.next.n)
                {
                    int y=temp1.n;
                    temp1.n=temp1.next.n;
                    temp1.next.n=y;
                }
                temp1=temp1.next;
            }while(temp1!=start);
            temp=temp.next;
        }while(temp!=start);
        return start;
    }
    public static void main(String args[])
    {
        System.out.println("the list:");
        disp(input(args));
        System.out.print("After sorting by descending order,the list\n");
        disp(sort(input(args)));
    }
}