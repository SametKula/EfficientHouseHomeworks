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
                    displayCommands("phoneproprities");
                    break;
                case "open bluethoot":
                    displayCommands("open bluethoot");
                    break;
                case "open wifi":
                    displayCommands("open wifi");
                    break;
                case "quit":
                    break PHONE;
                case "help":
                default:
                    displayCommands("help");
            }
            durabilityLower();
        }
        System.out.printf("Thank your for using %s", model);
    }

    public void displayCommands(String command) {
        switch (command) {
            case "help":
                System.out.println("""
                        display propirities-> for display prorities
                        help -> for help
                        open bluethoot -> for swtich bluethoot on/off
                        open wifi -> for swtich wifi on/off
                        for quit type quit""");
                break;
            case "phoneproprities":
                System.out.printf("model: %s\npublish year: %d\nwifi: %b\nblueathoot: %b\ndurability: %.2f%n", model, publicingYear, wifi, bluethoot, durability);
                break;
            case "bluethoot":
                switchBluethoot();
                break;
            case "wifi":
                switchWifi();
                break;
            default:
                System.out.println("this command not such a command");
        }
    }

    public void durabilityLower(double value){
        durability -= value;
    }
    public void durabilityLower(){
        durabilityLower(0.02);
    }

    public void errorPhone(double damage){
        System.out.println("your phone get damage a smoewhere and this damage's value is : " + String.format("%.2f",damage));
        durabilityLower(damage);
    }

    public boolean isPhoneStartable() {
        return durability > 0.45;
    }

    public void switchBluethoot() {
        swticher(this ,!bluethoot ,"bluethoot");

    }
    public void switchWifi() {
        swticher(this ,!wifi ,"wifi");

    }
    public void swticher(Phone ph, boolean boolexpres, String changedOne){
        if (changedOne.equals("wifi"))
            ph.wifi = boolexpres;
        else if (changedOne.equals("bluethoot")){
            ph.bluethoot = boolexpres;
        }

        System.out.printf("the %s is %s now have a nice day",changedOne , boolexpres ? "on": "off");
    }

}
