package homeworkLessonSpace11;

public class CharharacterTest {
    public static void main(String[] args) {
        System.out.println(TextFactory.testPassword(new Password("sadisdasddsd")));
    }



}
class TextFactory {

    public static String capitilize(String text){
        for (int i = 0; i < text.length(); i++)
            if (Character.isLetter(text.charAt(i)))
                return text.substring(0, i) + Character.toUpperCase(text.charAt(i)) + text.substring(i + 1);

        return "there isn't a letter on this text plase try again";
    }

    public static void tesingPassword(Password password){
        int letterCount = 0, digitCount = 0, symbolCount = 0;

        if (password.getPassword().length() < 7){
            password.setReasonOfInvaliditation("password is too short ");
            return;
        }

        for(int i = 0; i < password.getPassword().length(); i++){
            char ch = password.getPassword().charAt(i);

            if (Character.isLetter(ch))
                letterCount++;
            else if (Character.isDigit(ch))
                digitCount++;
            else
                symbolCount++;
        }

        if (letterCount < 3)
            password.setReasonOfInvaliditation(password.getReasonOfInvaliditation().concat("Letter not enough"));
        if (digitCount < 3)
            password.setReasonOfInvaliditation(password.getReasonOfInvaliditation().concat("Digit not enough"));
        if (symbolCount < 3)
            password.setReasonOfInvaliditation(password.getReasonOfInvaliditation().concat("Symbol not enough"));

        if (password.getReasonOfInvaliditation().equals(""))
            password.setIsPasswordValid(true);
    }
    public static String testPassword(Password password){
        tesingPassword(password);
        return password.getIsPasswordValid() ? "Password is valid" : "your password invalid beacause " + password.getReasonOfInvaliditation() ;
    }

}

class Password {
    String _password;
    boolean _isPasswordValid;
    String _reasonOfInvaliditation;

    Password(String password){
        _password = password;
        _reasonOfInvaliditation = "";
    }

    public String getPassword(){
        return _password;
    }
    public void setPassword(String password){
        _password = password;
    }
    public boolean getIsPasswordValid(){
        return _isPasswordValid;
    }
    public void setIsPasswordValid(boolean isPasswordValid){
        _isPasswordValid = isPasswordValid;
    }
    public String getReasonOfInvaliditation() {
        return _reasonOfInvaliditation;
    }

    public void setReasonOfInvaliditation(String reasonOfInvaliditation) {
        _reasonOfInvaliditation = reasonOfInvaliditation;
    }

}
