import java.util.Scanner;

class Exception1
{
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		int index = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the index of array");
		index = sobj.nextInt();

		
		try
		{
			System.out.println("Data is :"+arr[index]);

		}

		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Exception Occured :"+obj);
		}
		finally 
		{
			System.out.println("Application gets treminated");
		}

		System.out.println("End of main");
	}
}

