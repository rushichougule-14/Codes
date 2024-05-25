import java.util.*;

class LL
{
    public static void main(String []args)
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();
        lobj.add(10);
        lobj.add(20);
        lobj.add(30);
        lobj.add(13);

        lobj.add(1,55);

        System.out.println("Data From LinkedList");

        System.out.println(lobj);
        lobj.add(10);
        lobj.remove(2);

        Iterator <Integer> iobj = lobj.iterator();
        System.out.println("Data from linked list using iterator is ");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());     
        }

        lobj = null;
    }
}