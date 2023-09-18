class Union
{
	public static void main(String... S)
	{
		int Ary1[]={2,4,6,8,9};
		int Ary2[]={3,5,4,7,6};
		for(int i=0; i<Ary1.length; i++)
			for(int j=0; j<Ary2.length; j++)
				if(Ary1[i]==Ary2[j])
					System.out.print(Ary2[j]);
	}
}