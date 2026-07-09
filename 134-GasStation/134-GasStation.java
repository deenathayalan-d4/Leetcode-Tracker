// Last updated: 09/07/2026, 15:08:50
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a = 0; // total
        int b = 0; // tank
        int c = 0; // start

        for (int i = 0; i < gas.length; i++) {
            int d = gas[i] - cost[i];
            a += d;
            b += d;

            if (b < 0) {
                b = 0;
                c = i + 1;
            }
        }

        return a >= 0 ? c : -1;
    }
}