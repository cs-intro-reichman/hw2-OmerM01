// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sum = 0;
		double uneven = 1;
		int sign = 1;
		for(int i = 1; i <= num; i++){
			sum = sum + (sign * 1.0 / uneven);
			sign = -sign;
			uneven += 2.0;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + (4 * sum));
	}
}
