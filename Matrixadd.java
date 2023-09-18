class Matrixadd
{
	public static void main(String... S)
	{
		int ar1[][]={{10,7,6},{6,8,7}};
		int ar2[][]={{11,6,3},{5,7,4}};
		int sum[][]={{0,0,0},{0,0,0}};
		for(int i=0; i<ar1.length; i++)
		{
			for(int j=0; j<ar1[i].length; j++)
			{
				sum[i][j]=ar1[i][j]+ar2[i][j];
				System.out.print(sum[i][j]);
			}
			System.out.println();
		}
	}
}