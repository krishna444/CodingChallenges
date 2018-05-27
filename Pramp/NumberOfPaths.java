/**
 * Read problem details {@link NumberOfPaths.md}
 */
class NumberOfPaths {
    private int p = 0;

    public int numOfPathsToDest(int n) {

        // your code goes here
        move(0, 0, n);
        return p;
    }

    private void move(int x, int y, int n) {
        if (x == n - 1 && y == n - 1) {
            p++;
            return;
        }
        if (x >= y && x < n && y < n) {
            move(x + 1, y, n);
            move(x, y + 1, n);
        } else {
            return;
        }
    }

    public static void main(String... args) {
        NumberOfPaths numberOfPaths = new NumberOfPaths();
        int paths = numberOfPaths.numOfPathsToDest(100);
        System.out.println(paths);

    }
}