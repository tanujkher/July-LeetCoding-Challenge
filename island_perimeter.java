
public class island_perimeter {
    public static void main(String[] args) {
        System.out.println("Simply iterate over the 2d array and look for the surrounding cells of 1 with zero or outside range");
    }
}

class tion {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        for(int i = 0; i <= grid.length - 1; i++){
            for(int j = 0; j <= grid[0].length - 1; j++){
                if(grid[i][j] == 1){
                    if(i - 1 >= 0 && grid[i - 1][j] != 1){
                         p++;
                    }else if(!(i - 1 >= 0)){
                        p++;
                    }
                    if(i + 1 <= grid.length - 1 && grid[i + 1][j] != 1){
                        p++;
                    }else if(!(i + 1 <= grid.length - 1)){
                        p++;
                    }
                    if(j - 1 >= 0 && grid[i][j - 1] != 1){
                         p++;
                    }else if(!(j - 1 >= 0)){
                        p++;
                    }
                    if(j + 1 <= grid[0].length - 1 && grid[i][j + 1] != 1){
                        p++;
                    }else if(!(j + 1 <= grid[0].length - 1)){
                        p++;
                    }
                }
            }
        }
        return p;
    }
}