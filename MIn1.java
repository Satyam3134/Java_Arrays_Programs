class Min1
{
	public static void main(String... S)
	{
		int ar1[][]={{10,7,6},{4,8,7}};
		int min=ar1[0][0];
		for(int i=0; i<ar1.length; i++)
		{
			for(int j=0; j<ar1[i].length; j++)
			{
				if(ar1[i][j]<min)
					min=ar1[i][j];
			}
		}
		System.out.print("Min value is :"+min);
	}
}