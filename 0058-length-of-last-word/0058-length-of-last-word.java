class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int last = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                count++;
            }
            else if(count > 0) {
                last = count;
                count = 0;
            }
        }

        if(count > 0) {
            return count;
        }

        return last;
    }
}