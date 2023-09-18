class Max
{
	public static void main(String... S)
	{
		int arr1[]={10,7,6,4,9};
		int max=arr1[0];
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]>max)
				max=arr1[i];
		}
		System.out.print("MAX value :"+max);
	}
}