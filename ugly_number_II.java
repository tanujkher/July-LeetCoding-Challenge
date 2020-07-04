import java.util.ArrayList;

public class ugly_number_II {
    public static void main(String[] args) {
        System.out.println("Simple add to list with comparsion");
    }
}

class Solut {
    public int nthUglyNumber(int n) {
        int m2 = 0;
        int m3 = 0;
        int m5 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        while(list.size() <= n){
            int a2 = list.get(m2) * 2;
            int a3 = list.get(m3) * 3;
            int a5 = list.get(m5) * 5;
            int min = Math.min(a2, Math.min(a3, a5));
            if(list.get(list.size() - 1) < min){
                list.add(min);
            }
            if(min == a2){
                m2++;
            }else if(min == a3){
                m3++;
            }else if(min == a5){
                m5++;
            }
        }
        return list.get(n - 1);
    }
}