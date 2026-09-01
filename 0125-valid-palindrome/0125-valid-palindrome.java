class Solution {
    public boolean isPalindrome(String s) {
        // String original=s;
        String cleaned="";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                char ch=Character.toLowerCase(s.charAt(i));
                cleaned=cleaned+ch;
            }
        }
        for(int i=cleaned.length()-1;i>=0;i--)
        {
            rev=rev+cleaned.charAt(i);
        }
        if(cleaned.equals(rev))
        {
            return true;
        }
        return false;
    }
}
           