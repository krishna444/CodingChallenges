class RootOfNumber {

    /**
     * Estimates the nth root of a given number
     * Especial attention when 0<=x<1 
     */
    public double rootOfNumber(double x, int n) {
        if (x < 1) //Case of 0<=x<=1 is different
            return search(x, 1, x, n);
        else
            return search(0, x, x, n);
    }

    private double search(double lower, double upper, double x, int n) {
        double estimation = (lower + upper) / 2;
        double checkValue = 1;
        double threshold = 0.0001;
        for (int i = 0; i < n; i++) {
            checkValue *= estimation;
        }
        System.out.println(
                "lower=" + lower + "upper=" + upper + " estimation=" + estimation + " checkValue=" + checkValue);
        if (Math.abs(checkValue - x) < threshold) {
            return estimation;
        }
        if (checkValue <= x) {
            return search(estimation, upper, x, n);
        } else {
            return search(lower, estimation, x, n);
        }
    }

    public static void main(String... args) {
        RootOfNumber rootOfNumber = new RootOfNumber();
        double root = rootOfNumber.rootOfNumber(0.9, 30);
        System.out.println(root);
    }
}