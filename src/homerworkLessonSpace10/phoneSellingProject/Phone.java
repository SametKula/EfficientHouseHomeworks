package homerworkLessonSpace10.phoneSellingProject;

public class Phone {
    public static java.util.Scanner kb = new java.util.Scanner(System.in);
    public String model;
    public int publicingYear;
    public double durability;

    public boolean bluethoot;

    public boolean wifi;

    /*public void startPhone(){
        while(isPhoneStartable()){
            System.out.print("phone is working right now/n");
            System.out.print("what whould you do: ");
            String input = kb.next();
            switch(input){
                case "display propirities" :
                    System.out.println(displayCommands("phoneproprities"));
                    break;
                case "help":
                default:
                    System.out.println(displayCommands("help"));
            }
        }
    }*/
    /*public String displayCommands(String command){
        command = command.toLowerCase().trim();
        return switch (command){
            case "help" ->
                "display propirities-> for display prorities\nhelp -> for help\n";
            case "phoneproprities" ->
                "model: ".concat(model).concat("\npublising year: " + publicingYear);
            case "open bluethoot" -> {

            }
            default -> "this command not such a command";
        };
    }*/
    public void switchBluethoot(){
        if (!bluethoot)
            System.out.println("now bluethoot opened");
        else
            System.out.println("now bluethoot closed");
        bluethoot = !bluethoot;
    }
    public boolean isPhoneStartable(){
        return durability > 4.5 ;
    }

}
