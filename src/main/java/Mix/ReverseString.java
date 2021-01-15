package Mix;

public class ReverseString {


    public char[] reverseString(char[] s) {
        // char s[] = {'h','e','l','l','o'};
        String str = "";
        for (int i = s.length - 1; i >= 0; i--) {
            str += s[i];

        }
        s = str.toCharArray();
        return s;
    }




}
