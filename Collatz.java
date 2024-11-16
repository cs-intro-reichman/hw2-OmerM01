// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
				int seed = Integer.parseInt(args[0]); // Parse the seed
				String mode = args[1]; // Parse the mode (v or c)
		
				for (int i = 1; i <= seed; i++) {
					int pointer = i;
					int steps = 1;
		
					// Print the starting number if in verbose mode
					if (mode.equals("v")) {
						System.out.print(pointer);
					}
		
					// Special case for starting at 1
					if (pointer == 1) {
						if (mode.equals("v")) {
							System.out.print(" 4 2 1"); // Add the repeating cycle
						}
						steps = 4; // 1 → 4 → 2 → 1 counts as 4 steps
					} else {
						// Regular Collatz sequence logic
						while (pointer != 1) {
							if (pointer % 2 == 0) {
								pointer /= 2;
							} else {
								pointer = pointer * 3 + 1;
							}
		
							// Print each number in verbose mode
							if (mode.equals("v")) {
								System.out.print(" " + pointer);
							}
							steps++;
						}
					}
		
					// Print the steps in parentheses in verbose mode
					if (mode.equals("v")) {
						System.out.println(" (" + steps + ")");
					}
				}
		
				// Print final summary for all modes
				System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
			}
		
}
