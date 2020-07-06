
public class hamming_distance {
    public static void main(String[] args) {
        System.out.println("Simple bit manipulation");
    }
}

class sn {
    public int hammingDistance(int x, int y) {
        String s1 = toBinary(x);
        String s2 = toBinary(y);
        int i = 0;
        int j = 0;
        int ans = 0;
        if(s1.length() < s2.length()){
            while(s1.length() != s2.length()){
                s1 = '0' + s1;
            }
        }
        if(s1.length() > s2.length()){
            while(s1.length() != s2.length()){
                s2 = '0' + s2;
            }
        }
        while(i <= s1.length() - 1 && j <= s2.length() - 1){
            if(s1.charAt(i) != s2.charAt(j)){
                ans++;
            }
            i++;
            j++;
        }
        return ans;
    }
    private String toBinary(int x){
        String ans = "";
        while(x != 0){
            int dig = x % 2;
            x = x / 2;
            ans = dig + ans;
        }
        return ans;
    }
}