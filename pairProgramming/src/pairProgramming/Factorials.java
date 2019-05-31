package pairProgramming;

public class Factorials {

	public static void main(String[] args)
	{
		Factorials f = new Factorials();
		System.out.println(f.fact(479001600));
	}
	
	public int fact(int fact)
	{
		int answer = 0;
		int x = 2;
		int y = 0;

		
		answer = fact/x;

		x++;
		while(answer != 1)
		{
			if(answer != 1)
			{
				answer = answer/x;
				x++;
			}
		}
		return x-1;
	}


}
