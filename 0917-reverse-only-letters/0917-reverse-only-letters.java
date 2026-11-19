class Solution {
    public String reverseOnlyLetters(String s) {
        // String s = "ab-cd";

        char[] ch = s.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {

            if (!Character.isLetter(ch[left])) {
                left++;
            }
            else if (!Character.isLetter(ch[right])) {
                right--;
            }
            else {
                int temp = ch[left];
                ch[left] = ch[right];
                ch[right] = (char) temp;

                left++;
                right--;
            }
        }

        return new String(ch);
    }
}