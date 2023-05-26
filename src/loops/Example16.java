package loops;

public class Example16 // do while loop
                          // print cubes from 2 to 10

{
public static void main(String[] args) 
{
	int i=2;
	
	do
	{
		System.out.println(i*i*i);
		
		i++;
	}
	while(i<=10);
}
}
