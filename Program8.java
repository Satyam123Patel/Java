package program1;

public class Program8 {
	public static void Change(int[] arr)
	{
		arr[0]= 20;
		arr[1] = 30;
	}
	
	public static void main(String[] args)
	{
    int arr[] = {30,40};
    Change(arr);
    for(int nums:arr)
    {
    System.out.print(nums +" ");
	}

  }
}