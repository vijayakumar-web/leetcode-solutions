import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            // Check if the number is already seen
            if (set.contains(n)) {
                return false;
            }

            // Store the number
            set.add(n);

            // Calculate sum of squares of digits
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                n = n / 10;

                sum = sum + digit * digit;
            }

            // Use the calculated sum as the new number
            n = sum;
        }

        return true;
    }
}