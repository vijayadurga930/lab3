package Lab3;

import java.util.Scanner;

public class SecondSmallest {
	private int check(int array[]) {
	int i=0;
	int max=0,secondmax=i;
	for(i=0;i<array.length;i++)
	{
		for (int j=i+1;j<array.length;j++)
		{
			if(array[i]<array[j]) {
				max=array[i];
			}
		}
		for(i=0;i<array.length;i++)
		{
			for (int j=i+1;j<array.length;j++)
			{
			if(array[i]<array[j] && array[j]!=max)
			{
				secondmax=array[j];
			}
			
			}
		}
	}
	return secondmax;
		
		}
	public static void main(String[] args) {
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=scanner.nextInt();
		int array []=new int[size];
		System.out.println("Enter elements of the array are:  ");
		for( int i=0;i<size;i++)
		{
			array[i]=scanner.nextInt();
		}
		
		SecondSmallest small = new SecondSmallest();
		int output = small.check(array);
		System.out.println(output);
		scanner.close();
		}

	
}


	 
		

	


