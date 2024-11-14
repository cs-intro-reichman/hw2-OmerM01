// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sum = 1;
		double uneven = 3;
		for(int i = 1; i <= num; i++){
			if(i % 2 != 0){
				uneven = uneven * (-1);
			}
			sum = sum + (1.0/uneven);
			uneven = Math.abs(uneven) + 2.0;
		}
		System.out.println(sum * 4);
	}
}
