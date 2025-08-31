package program1;
import java.util.Arrays;

public class Program5 {
	public static void Change(int[] i)
	{
		i[2] = 60;
	}
	
	public static void main(String[] args)
	{
		int[] i = {10,20,30,40,50};
		
		Change(i);
		System.out.println("Changed array is"+Arrays.toString(i));
	}

}
