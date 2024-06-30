package backtacking;

public class GridWay {

    private static int gridWay(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;

        }
        int w1 = gridWay(i + 1, j, m, n);
        int w2 = gridWay(i , j+1, m, n);
        System.out.println(w1 +" " +w2);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;

        System.out.println(gridWay(0, 0, n, m));
    }
}
