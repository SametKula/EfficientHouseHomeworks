package homeworkLessonSpace8;

public class Coin {
    public String coinsValue;

    public void flipCoin(java.util.Random r) {
        r.setSeed(10);
        coinsValue = "tails";

        if (r.nextBoolean())
            coinsValue = "heads";
    }

    public boolean isCoinReqValid(String coinStr) {
        return coinStr.equals("heads") || coinStr.equals("tails");
    }
    public String adjustmentCoinValue(String coinFaceStrForFix) {
        if (coinFaceStrForFix.trim().equalsIgnoreCase("heads") || coinFaceStrForFix.trim().equalsIgnoreCase("tails"))
            return coinFaceStrForFix.toLowerCase();
        return "Invalid Coin Type";
    }
}
