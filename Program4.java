//To find the max of the elements 
package program1;

public class Program4 {
	public static int findmax(int[] num)
	{
		int sum=0;
		int max = num[0];
		
		for(int i=0; i<5; i++)
		{
			if(num[i]>max)
			{
				max = num[i];
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		int[] num = {10,20,30,40,50};
		int max = findmax(num);
		System.out.println("The maximum of numbers is:" +max);
	}

}
