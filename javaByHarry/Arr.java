public class Arr
{
	public static void main(String[] args)
	{
		//float sum=0;
		//float[] ar={12.7f,10.9f,4.7f,9.5f,5.5f};
		//for(float element : ar)
		//{
			//sum= sum+element;
		//}
		//System.out.println("the sum of Array is"+sum);
	   
	   int[] ar = {10,20,30,40,50,60,70};
	   int input = 20;
	   boolean isInArray= false;
	   for(int element : ar)
	   {
		   if(input==element)
		   {
			   isInArray = true;
			   break;
		   }
		   
	   }
	    if(isInArray)
		{
			System.out.println("the element is in Array");
		}
		else
		{
			System.out.println("the element is not in Array");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
		