//Program to find the sum of all elements of an array

package program1;

public class Program3 {
	public static int findsum(int[] num)
	{
		int sum=0;
		for(int i=0; i<5; i++)
		{
			System.out.println(num[i]);
			sum = sum+num[i];
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,5,6};
		int result = findsum(arr);
		System.out.println(result);
	}
      
}
