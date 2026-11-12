class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        int rem = 0;

        while (columnNumber != 0) {
            columnNumber--;

            rem = columnNumber % 26;

            char ch = (char)('A' + rem);

            result = ch + result;

            columnNumber = columnNumber / 26;
        }

        return result;
    }
}