class BusiestPeriod {
    private int findBusiestPeriod(int[][] data) {
        // your code goes here
        // your code goes here
        int maximum = data[0][1];
        int timeStamp = data[0][0];
        int entry=data[0][2];
        int counter=maximum;
        // int[] value = data[0];       
        for (int i = 1; i < data.length; i++) {
            System.out.println(timeStamp);
            int[] item = data[i];
            if (item[0] == timeStamp) {
                // Entry increase
                if (item[2] != entry) {
                    counter += item[1];
                } else {// Exit decrease
                    counter -= item[1];
                }
            } else {
                if (counter > maximum) {
                    maximum = counter;                   
                    //timeStamp = item[0];
                    entry=item[2];
                }
                 counter=item[1];
                // reset counter
                // value = item;
                
            }

        }
        return timeStamp;
    }

    public static void main(String... args) {
        BusiestPeriod busiestPeriod = new BusiestPeriod();
        int[][] data = { { 1487799425, 21, 0 }, { 1487799427, 22, 1 }, { 1487901318, 7, 0 } };

        // { { 1487799426, 21, 1 } };

        // { { 1487799425, 14, 1 }, { 1487799425, 4, 0 }, { 1487799425, 2, 0 }, {
        // 1487800378, 10, 1 },
        // { 1487801478, 18, 0 }, { 1487801478, 18, 1 }, { 1487901013, 1, 0 }, {
        // 1487901211, 7, 1 },
        // { 1487901211, 7, 0 } };

        int time = busiestPeriod.findBusiestPeriod(data);
        System.out.println("result"+time);

    }

}