class Min
{
	public static void main(String... S)
	{
		int arr1[]={10,7,6,4,9};
		int min=arr1[0];
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]<min)
				min=arr1[i];
		}
		System.out.print("MIN value :"+min);
	}
}