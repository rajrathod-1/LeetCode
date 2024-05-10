import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = 0;
        List<Integer> result = new ArrayList<>();
        
        for (int i = n - 1; i >= 0 || k > 0 || carry > 0; i--) {
            int sum = carry;
            if (i >= 0)
                sum += num[i];
            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }
            carry = sum / 10;
            result.add(0, sum % 10);
        }
        
        return result;
    }
}
