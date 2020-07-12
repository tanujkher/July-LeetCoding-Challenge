
public class reverse_bits {
    public static void main(String[] args) {
        System.out.println("Bit manipulation");
    }
}

class ion {
    public int reverseBits(int n) {
   
        int times = 31;
        int revDigit = 0;
        
        while(times>=0){
            
            int lastDigit = n & 1;
            if(lastDigit == 1) revDigit|=lastDigit<<times;
            
            times--;
            n=n>>1;
        }
        return revDigit;
    }
}