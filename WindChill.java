package basic_core_program;

public class WindChill {
    public static void main(String args[]) {
        System.out.println("Enter temperature in Fahrenheit: ");
        double temp = Double.parseDouble(args[0]);
        System.out.println("Enter speed of wind miles/hour : ");
        double wind = Double.parseDouble(args[1]);
        if (temp < 50)
            if (wind < 120 && wind > 3) {
                wind = 35.74 + (0.6215 * temp) + ((0.4275 * temp - 35.75) * Math.pow(wind, 0.16));
                System.out.println("Wind Chill is: " + wind);
            } else {
                System.out.println("Invalid input value of wind should be in between 3 and 120");
            }
        else {
            System.out.println("Invalid input value of temp should be less than 50");
        }
    }
}
