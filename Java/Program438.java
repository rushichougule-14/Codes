import java.util.*;

class Program438
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of Array:");

        int Size = sobj.nextInt();

        Sorting obj = new Sorting(Size);
        obj.Accept();
        obj.Display();

        obj.BubbleSort();
        obj.Display();


    }
}


interface Marvellous
{
    public void BubbleSort();
    public void SelectionSort();
    public void InsertionSort();

}

class Sorting implements Marvellous
{
    private int Arr[];

    public Sorting(int Size)
    {
        Arr = new int[Size];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements: ");

        for(int i = 0 ;i< Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }

    }

    public void Display()
    {
        System.out.println("Elements are :");

        for(int i = 0 ;i< Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }

    }

    public void BubbleSort()
    {
        int i = 0, j=0 ,temp =0;

        boolean flag = false;

        for(i = 0; i<Arr.length;i++)
        {
            flag = false;

            for(j = 0;j<Arr.length-i-1;j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                    flag = true;
                }
            }

            if (flag == false)
            {
                break;
            }
        }

    }

    public void InsertionSort()
    {
       

    }

    public void SelectionSort()
    {
       

    }
}