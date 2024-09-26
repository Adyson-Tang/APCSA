
/*
Adyson Tang
Sept 25
2B
 */
public class StringTools{
    String sentence;
    public StringTools () {
        sentence = "hi";
    }

    public StringTools (String s) {
        sentence = s;
    }

    public String lastLetter (String str) {
        int len;
        len = str.length();
        return str.substring (len - 1);
    }

    public String formatPhoneNumber (String strl) {;
        String Open = "(";
        String Close = ")";
        String Dash = "-";
        return Open + strl.substring(0 , 3) + Close + Dash + strl.substring (3 , 6) + Dash + strl.substring (6 , 10);

    }

    public String middleThree (String str) {
        int len;
        len = str.length()/ 2 - 1;
        return str.substring (len, len + 3);

    }

    public String swapLastTwo (String str) {
        int len;
        len = str.length();
        return str.substring (0, len - 2) + str.substring (len - 1, len) + str.substring (len - 2, len - 1);
    }

    public boolean frontAgain (String str, int n) {
        String First = str.substring (0, n);
        String Last = str.substring (str.length() - n, str.length());
        return First.equals(Last);
    }
}