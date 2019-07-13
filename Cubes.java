package Lab4;

import java.util.Scanner;

public class Cubes {
	public int cubes(int n) {
	int sum1=0,sum2=0;
	
	 {
		for(int i=0;i<=n;i++) 
	      {   		
			i=n%10;
			sum1=sum1+(i*i*i);
			n=n/10;
	      }
				
	  }
		return (sum2=sum1+(n*n*n));
		
	}
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number: ");
	     int k = scanner.nextInt();
		Cubes cube= new Cubes();
		
		System.out.println("sum is:" +cube.cubes(k));
		scanner.close();
		
		

	}

	

}
