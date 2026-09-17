class Solution {
    private int dist(int[] target, int[] finger) {
        return Math.abs(target[0] - finger[0]) + Math.abs(target[1] - finger[1]);
    }

    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] lPoint = {3, 0}; // *
        int[] rPoint = {3, 2}; // #

        int[][] pos = new int[10][];
        int num = 1;
        for (int y = 0; y < 3; y++)
            for (int x = 0; x < 3; x++)
                pos[num++] = new int[]{y, x};
        pos[0] = new int[]{3, 1};

        for (int target : numbers) {
            int[] tp = pos[target];

            if (target == 1 || target == 4 || target == 7) {
                sb.append("L");
                lPoint = tp;
            } else if (target == 3 || target == 6 || target == 9) {
                sb.append("R");
                rPoint = tp;
            } else {
                int lDist = dist(tp, lPoint);
                int rDist = dist(tp, rPoint);
                if (lDist < rDist || (lDist == rDist && hand.equals("left"))) {
                    sb.append("L");
                    lPoint = tp;
                } else {
                    sb.append("R");
                    rPoint = tp;
                }
            }
        }
        return sb.toString();
    }
}