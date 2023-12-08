package Strings;

public class RemoveSpecial {
    public static void main(String[] args) {
        String str1 = "ehfuhfeufheigb1ejj8jcuhwcvuwhc0";
        String nums = "1234567890";

        for (char num : nums.toCharArray()) {
            str1 = str1.replace(String.valueOf(num), "");
        }

        System.out.println(str1);
        ///////////////////////////////////////////////
        String str2 = "ehfuhfeufheigb1ejj8jcuhwcvuwhc0";

        // Use regular expression to replace all numeric characters
        str2= str2.replaceAll("[0-9]", "");

        System.out.println(str2);
        ////////////////////////////////////////////////////////
        String str3 = "ehfuhfeufheigb1ejj8jcuhwcvuwhc0!@#$%^&*()";

        // Use regular expression to replace all non-alphanumeric characters
        str3 = str3.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str3);
    }
}