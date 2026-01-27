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
public class circularshort
{
    public static node input(String [] a)
    {
        node start=null;
        node ptr=null;
        for(String s:a)
        if(start==null)
        {
            start=new node(Integer.parseInt(s));
            ptr=start;
        }
        else
        {
            ptr.next=new node(Integer.parseInt(s));
            ptr=ptr.next;
        }
        ptr.next=start;
        return ptr.next;
    }
    public static void disp(node n1)
    {
        node temp=n1;
        do{
            if(temp.next==n1)
            System.out.println(temp.n);
            else
            System.out.print(temp.n+",");
            temp=temp.next;
        }while(temp!=n1);
    }
    public static node sort(node n1)
    {
        node temp=n1;
        do{
            node temp1=n1;
            do{
                if(temp1.next!=n1)
                if(temp1.n>temp1.next.n)
                {
                    int y=temp1.n;
                    temp1.n=temp1.next.n;
                    temp1.next.n=y;
                }
                temp1=temp1.next;
            }while(temp1!=n1);
            temp=temp.next;
        }while(temp!=n1);
        return n1;
    }
    public static void main(String args[])
    {
        System.out.println("the list");
        disp(input(args));
        System.out.println("after sort by ascending order,the list");
        disp(sort(input(args)));
    }
}