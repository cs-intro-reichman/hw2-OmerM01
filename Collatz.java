// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
        int sum;

		for(int i = 1; i <= seed; i++){
			int pointer = i;
			sum = 0;

			if(mode.equals("V")){ //prints the num from where it begins
				System.out.print(pointer);
			}

			while(pointer != 1){
				if(pointer % 2 == 0){
					pointer = pointer/2;
				} else{
					pointer = (pointer * 3) + 1;
				}

				if(mode.equals("V")){
					System.out.print(" " + pointer );
				}
				sum++;
			}

			if (mode.equals("v")) {
                System.out.println(" (" + sum + ")");
            }
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

	}
}
