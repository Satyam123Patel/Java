package program1;

public class Program6 {
	public static void Change(int[] arr)
	{
		arr[2]=20;
	}
	
	public static void main(String[] args)
	{
		int[]  arr= {1,2,3,4,5};
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		Change(arr);
		System.out.print("\n");
		for(int i=0; i<5; i++)
		{
			
			System.out.print(arr[i] + " ");
		}
	}

}
