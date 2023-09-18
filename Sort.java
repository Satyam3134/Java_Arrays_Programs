class Sort
{
	public static void main(String... S)
	{
		int ar[]={10,5,6,4,9};
		for(int i=0; i<ar.length; i++)
		{
			int sort=0;
			for(int j=0; j<ar.length; j++)
			if(ar[i]>ar[j])
			{
				sort=ar[i];
				ar[i]=ar[j];
				ar[j]=sort;
			}		
	    }
		for(int k=0; k<ar.length; k++)
			System.out.print(" "+ar[k]);
	}

}