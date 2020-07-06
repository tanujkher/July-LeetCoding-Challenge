
public class plus_one {
    public static void main(String[] args) {
        System.out.println("Simple add one keeping carry and look for variations");
    }
}

class tn {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            if(i == digits.length - 1){
                int sum = digits[i] + 1;
                carry = sum / 10;
                int curr = sum % 10;
                digits[i] = curr;
            }else{
                if(carry == 0){
                    break;
                }
                int sum = digits[i] + carry;
                carry = sum / 10;
                int curr = sum % 10;
                digits[i] = curr;
            }
        }
        if(carry != 0){
            int[] ans = new int[digits.length + 1];
            ans[0] = carry;
            for(int i = 0; i <= digits.length - 1; i++){
                ans[i + 1] = digits[i];
            }
            digits = ans;
        }
        return digits;
    }
}