// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sum = 1;
		double uneven = 3;
		for(int i = 1; i <= num; i++){
			if(i % 2 != 0){
				uneven = uneven * (-1);
				System.out.println(uneven);
			}
			sum = sum + (1/uneven);
			System.out.println(sum);
			uneven = Math.abs(uneven) + 2;
			System.out.println(uneven);
		}
		System.out.println(sum * 4);
	}
}
