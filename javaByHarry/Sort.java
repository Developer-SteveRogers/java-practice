class Sort
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3};
		boolean isSort=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[i+1])
				isSort = true;
		}
		if(isSort==true)
		System.out.println("Array is sort :");
        else
		System.out.println("Array is not sort");
	}
}