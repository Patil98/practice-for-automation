package loops;

public class Example29      // do while loop
                                   // print suare and cubes from 1 to 100

{
public static void main(String[] args)

{
	m1();
	m2();
	
	
}

public static void m1()
{
	int i=1;
	
	do
	{
		System.out.println(i*i);
		
		i++;
	}
	
	while(i<=100);
}
public static void m2()

{
	int i=1;
	
	do
	{
		System.out.println(i*i*i);
		
		i++;
	}
	while(i<=100);
}

}
