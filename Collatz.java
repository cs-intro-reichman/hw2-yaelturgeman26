// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
        String mode = args[1];
		int count = 1;
		int current=1;
		boolean ifFirst = true;
		if(mode.equals("v"))
		{
			for(int i = 1; i <= N; i++)
			{	
				while(current != 1 || ifFirst) {	
					if(current % 2 == 0) {
						System.out.print(current + " ");
						current = current / 2;
					}
					else {
						System.out.print(current + " ");
						current = current * 3 + 1;	
					}
					ifFirst = false;
					count++;
				}
				System.out.println(current + " (" + count + ")");
				count = 1;
				current = i + 1;
			}
			System.out.println("Every one of the first" + " " + N +  " " + "hailstone sequences reached 1.");
		}

		if(mode.equals("c"))
		{
			System.out.println("Every one of the first" + " " + N +  " " + "hailstone sequences reached 1.");
		}

	}
}
