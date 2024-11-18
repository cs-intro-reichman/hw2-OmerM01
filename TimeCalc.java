public class TimeCalc {
    public static void main(String[] args) {
        //setting the 3 variavble (user input) 
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        //calculating the new time
        int totalMinutes = (hours * 60) +  minutes +  minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = (totalMinutes - (totalHours * 60));

        //printing by the format
        if(newHours < 10) System.out.print("0");
        System.out.print(newHours + ":");
        if(newMinutes < 10) System.out.print("0");
        System.out.println(newMinutes);
    }
}
