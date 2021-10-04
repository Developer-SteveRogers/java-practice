import java.util.Scanner;
class ArrayBasic2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] arr = new char[2][6];
		System.out.println("Enter your names:");
		for(int i=0;i<2;i++)
		{
			arr [i]=sc.nextLine();
		}
		for(int i=0;i<2;i++)
		{
			
			System.out.print(arr[i][j]+"\n");
		}
		
		
	}
}