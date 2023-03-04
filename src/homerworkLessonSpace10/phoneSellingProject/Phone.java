package homerworkLessonSpace10.phoneSellingProject;

public class Phone {
    public static java.util.Scanner kb = new java.util.Scanner(System.in);
    public String model;
    public int publicingYear;
    public double durability;
    public int posiblePrice;

    public boolean bluethoot;

    public boolean wifi;

    public Phone (String _model, int _publicingYear, double _durability, int _phonePrice){
        model = _model;
        publicingYear = _publicingYear;
        durability = _durability;
        posiblePrice = _phonePrice;

    }
    public double phonePrice = posiblePrice * durability;

    public void startPhone() {
        PHONE:
        while (isPhoneStartable()) {
            System.out.print("phone is working right now/n");
            System.out.print("what whould you do: ");
            String input = kb.next().toLowerCase().trim();

            switch (input) {
                case "display propirities":
                    System.out.println(displayCommands("phoneproprities"));
                    break;
                case "open bluethoot":
                    System.out.println(displayCommands("open bluethoot"));
                    break;
                case "open wifi":
                    System.out.println(displayCommands("open wifi"));
                    break;
                case "quit":
                    break PHONE;
                case "help":
                default:
                    System.out.println(displayCommands("help"));
            }
        }
        System.out.printf("Thank your for using %s", model);
    }

    public String displayCommands(String command) {
        return switch (command) {
            case "help" ->
                    "display propirities-> for display prorities\nhelp -> for help\nopen bluethoot -> for swtich bluethoot on/off\n" +
                            "open wifi -> for swtich wifi on/off\nfor quit type quit";
            case "phoneproprities" ->
                    String.format("model: %s\npublish year: %d\nwifi: %b\nblueathoot: %b\ndurability: %.2f", model, publicingYear, wifi, bluethoot, durability);
            case "open bluethoot" -> switchBluethoot();
            case "open wifi" -> switchWifi();
            default -> "this command not such a command";
        };
    }

    public String switchBluethoot() {
        bluethoot = !bluethoot;
        if (bluethoot)
            return "now bluethoot opened";

        return "now bluethoot closed";

    }

    public String switchWifi() {
        wifi = !wifi;
        if (wifi)
            return "now wifi opened";

        return "now wifi closed";

    }

    public void errorPhone(double damage){
        System.out.println("your phone get damage a smoewhere and this damage's value is : " + String.format("%.2f",damage));
        durability -= damage;
    }

    public boolean isPhoneStartable() {
        return durability > 0.45;
    }

}
