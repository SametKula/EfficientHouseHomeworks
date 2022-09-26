package Hmwk2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to calorie Calculator");
        System.out.printf("%nplease enter a value -----------(insert type >>>\"activity,weight(kg),minutes\")%n>>>Basketball%n>>>68%n>>>30%n");
        System.out.println("▬▬▬your calorie expenditure is "+caloriesCalculator("running",68,30)+" calories▬▬▬");
        System.out.printf("%nplease enter a value -----------(insert type >>>\"activity,weight(kg),minutes\")%n>>>Basketball%n>>>68%n>>>30%n");
        System.out.println("▬▬▬your calorie expenditure is "+caloriesCalculator("basketball",68,30)+" calories▬▬▬");
        System.out.printf("%nplease enter a value -----------(insert type >>>\"activity,weight(kg),minutes\")%n>>>Basketball%n>>>68%n>>>30%n");
        System.out.println("▬▬▬your calorie expenditure is "+caloriesCalculator("sleeping",68,60*6)+" calories▬▬▬");



    }

    public static double caloriesCalculator(String met, double weight, int minutes) {
        double cal = 1;
        if (met.equalsIgnoreCase("running")) {
            cal = (175.0 / 1000.0) * 10 * weight * minutes;
        };
        if (met.equalsIgnoreCase("basketball")) {
            cal = (175 / 1000.0) * 8 * weight * minutes;
        }
        if (met.equalsIgnoreCase("sleeping")) {
            cal = (175.0 / 1000.0) * 1 * weight * minutes;
        }

        return (int)cal;
    }
    /*      terminal output is :
            Welcome to calorie Calculator

            please enter a value -----------(insert type >>>"activity,weight(kg),minutes")
            >>>Basketball
            >>>68
            >>>30
            ▬▬▬your calorie expenditure is 3570.0 calories▬▬▬

            please enter a value -----------(insert type >>>"activity,weight(kg),minutes")
            >>>Basketball
            >>>68
            >>>30
            ▬▬▬your calorie expenditure is 2855.0 calories▬▬▬

            please enter a value -----------(insert type >>>"activity,weight(kg),minutes")
            >>>Basketball
            >>>68
            >>>30
            ▬▬▬your calorie expenditure is 4283.0 calories▬▬▬*/
}
