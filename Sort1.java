class Sort1
{
	public static void main(String... S)
	{
	int ar[][]={{10,5,6},{7,4,9},{1,3,2}};
		for(int i=0; i<ar.length; i++)
		{
			int sort=0;
			for(int j=0; j<ar.length; j++)
			{
				for(int k=0; k<ar.length; k++)
				{
					for(int l=0; l<ar.length; l++)
					{
						if(ar[i][j]>ar[k][l]){
				         sort=ar[i][j];
				         ar[i][j]=ar[k][l];
				         ar[k][l]=sort;
						}
					}
				}
			}
	    }
		for(int i=0; i<ar.length; i++)
			for(int j=0; j<ar.length; j++)
			    System.out.print(" "+ar[i][j]);
	}

}