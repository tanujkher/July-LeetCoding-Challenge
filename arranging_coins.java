
public class arranging_coins{
    public static void main(String[] args) {
        System.out.println("Simple math solution ans = (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5)");
    }
}

class Solution {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }
}