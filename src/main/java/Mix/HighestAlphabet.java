package Mix;

public class HighestAlphabet {

    //    Given  : String with alphabets
//    Return : highest character , a - smallest and z -largest
//
//    Input :xyzx
//    Output : z

    static char getHighestAlphabet(String string) {
        char[] arrOfChar = string.toCharArray();
        char max = arrOfChar[0];
        for (int i = 0; i < arrOfChar.length; i++) {
            if (arrOfChar[i] > max) {
                max = arrOfChar[i];
            }
        }
        return max;
    }
}
