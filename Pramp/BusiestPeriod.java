import java.util.Arrays;

class BusiestPeriod {
    private int findBusiestPeriod(int[][] data) {
        int counter = 0;
        int maxCounter = Integer.MIN_VALUE;
        int time = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][2] == 0) {
                counter -= data[i][1];
            } else {
                counter += data[i][1];
            }

            if (i < data.length - 1 && data[i][0] == data[i + 1][0]) {
                continue;
            }

            if (counter > maxCounter) {
                maxCounter = counter;
                time = data[i][0];
            }
        }
        return time;
    }

    public static void main(String... args) {
        BusiestPeriod busiestPeriod = new BusiestPeriod();
        /*
         * int[][] data = { { 1487799425, 21, 0 }, { 1487799427, 22, 1 }, { 1487901318,
         * 7, 0 } };
         */

        // int[][] data= { { 1487799426, 21, 1 } };

        int[][] data = { { 1487799425, 14, 1 }, { 1487799425, 4, 0 }, { 1487799425, 2, 0 }, { 1487800378, 10, 1 },
                { 1487801478, 18, 0 }, { 1487801478, 18, 1 }, { 1487901013, 1, 0 }, { 1487901211, 7, 1 },
                { 1487901211, 7, 0 } };

        int time = busiestPeriod.findBusiestPeriod(data);
        System.out.println("result=>" + time);

    }

}