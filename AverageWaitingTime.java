public double averageWaitingTime(int[][] customers) {
        int cust=customers.length;
        long netWaitingTime=0;
        int nextIdleTime=0;
        for(int i=0;i<cust;i++){
            nextIdleTime=Math.max(customers[i][0],nextIdleTime)+customers[i][1];
            netWaitingTime+=nextIdleTime-customers[i][0];
        }
        double avgWaitingTime=(double)netWaitingTime/cust;
        return avgWaitingTime;
    }

Input: customers = [[1,2],[2,5],[4,3]]
Output: 5.00000
Explanation:
1) The first customer arrives at time 1, the chef takes his order and starts preparing it immediately at time 1, and finishes at time 3, so the waiting time of the first customer is 3 - 1 = 2.
2) The second customer arrives at time 2, the chef takes his order and starts preparing it at time 3, and finishes at time 8, so the waiting time of the second customer is 8 - 2 = 6.
3) The third customer arrives at time 4, the chef takes his order and starts preparing it at time 8, and finishes at time 11, so the waiting time of the third customer is 11 - 4 = 7.
So the average waiting time = (2 + 6 + 7) / 3 = 5.
