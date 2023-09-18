class Max1
{
	public static void main(String... S)
	{
		int ar1[][]={{10,7,6},{4,8,9}};
		int max=ar1[0][0];
		for(int i=0; i<ar1.length; i++)
		{
			for(int j=0; j<ar1[i].length; j++)
			{
				if(ar1[i][j]>max)
					max=ar1[i][j];
			}
		}
		System.out.print("Max value is :"+max);
	}
}