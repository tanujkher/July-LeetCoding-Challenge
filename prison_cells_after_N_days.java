import java.util.Arrays;
import java.util.HashSet;

public class prison_cells_after_N_days {
    public static void main(String[] args) {
        System.out.println("Simple hashmap solution");
    }
}

class sol {
    public int[] prisonAfterNDays(int[] cells, int N) {
        if (N == 0)
            return cells;
        HashSet<String> set = new HashSet<>();
        int size = 0;
        boolean flag = false;

        for (int i = 1; i <= N; i++) {

            int[] res = prisonAfterOneDay(cells);
            String str = Arrays.toString(res);
            if (!set.contains(str)) {
                set.add(str);
                size++;
            } else {
                flag = true;
                break;
            }
            cells = res;
        }
        if (flag) {
            N = N % size;
            for (int i = 1; i <= N; i++) {
                cells = prisonAfterOneDay(cells);
            }
        }
        return cells;
    }

    public int[] prisonAfterOneDay(int[] cells) {
        int[] res = new int[cells.length];
        for (int i = 1; i < cells.length - 1; i++) {
            if (cells[i - 1] == cells[i + 1]) {
                res[i] = 1;
            }
        }
        return res;
    }
}