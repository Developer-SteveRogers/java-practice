class Prac6
{
	public static void main(String[] args)
	{
		// Question 1
		//float sum=0;
		//float[] ar={12.7f,10.9f,4.7f,9.5f,5.5f};
		//for(float element : ar)
		//{
			//sum= sum+element;
		//}
		//System.out.println("the sum of Array is"+sum);
	   
	   
	   // Question 2
	   
	   //int[] ar = {10,20,30,40,50,60,70};
	   //int input = 20;
	   //boolean isInArray= false;
	   //for(int element : ar)
	   //{
		   //if(input==element)
		   //{
			  // isInArray = true;
			//   break;
		 //  }
		   
	   //}
	    //if(isInArray)
		//{
		//	System.out.println("the element is in Array");
		//}
		//else
		//{
		//	System.out.println("the element is not in Array");
		//}
		
		//Question 3
		//float sum=0;
		//int[] ar ={90,80,60,45,70,90,40};
		//for(int element : ar)
		//{
		//	sum= sum+element;
	//	}
		
		//System.out.println(" Average is :" +sum/ar.length);
	//}
//}
   // practice 5
      int[][] mat1= {{1,1,1},{1,1,1}};
      int[][] mat2= {{1,1,1},{1,1,1}};
      int[][] result={{0,0,0},{0,0,0}};
      for(int i=0;i<mat1.length;i++)
	  {
            for(int j=0;j<mat1[i].length;j++)
	       result[i][j]=mat1[i][j]+mat2[i][j];
      }
	    for(int i=0;i<mat1.length;i++)
	  {
            for(int j=0;j<mat1[i].length;j++)
	       System.out.println(result[i][j]);
	   System.out.print("\n");
      }
	  
	}
}
                				