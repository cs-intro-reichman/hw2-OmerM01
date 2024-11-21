// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]); 
		String mode = args[1];

		for (int i = 1; i <= seed; i++) {
			int pointer = i;
			int steps = 1;

			if (mode.equals("v")) {
				System.out.print(pointer);
			}

			if (pointer == 1) {
				if (mode.equals("v")) {
						System.out.print(" 4 2 1");
				}
				steps = 4; 
			} else {
				while (pointer != 1) {
					if (pointer % 2 == 0) {
						pointer /= 2;
					} else {
						pointer = pointer * 3 + 1;
					}
		
					if (mode.equals("v")) {
						System.out.print(" " + pointer);
					}
					steps++;
				}
			}
			
			if (mode.equals("v")) {
				System.out.println(" (" + steps + ")");
			}
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
		
}
