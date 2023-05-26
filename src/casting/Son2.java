package casting;

//sub class

public class Son2 extends Father2

{

	public void farm()                         // override
	{
		System.out.println("5 acre");
	}

	public void home()                              // override
	{
		System.out.println("2  bhk");
	}

	public void money()                                  // override
	{
		System.out.println("15 lakh");
	}
	
	public void car()                                    // own property
	{
		System.out.println("tata safari");
	}
}
