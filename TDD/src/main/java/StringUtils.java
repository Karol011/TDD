public class StringUtils {

    public String changeToUpperCase(String input) {
        return input.toUpperCase();
    }

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String multipleString(String input, int i) {
      return input.repeat(i);

    }

    public long countCharInString(String input, char letter) {
         long counter = input.codePoints()
                .filter(s -> s == letter)
                .count();
         return counter;

    }

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        System.out.println(stringUtils.multipleString("lalka", 3));
        System.out.println(stringUtils.countCharInString("abbar",'b'));

    }

}
