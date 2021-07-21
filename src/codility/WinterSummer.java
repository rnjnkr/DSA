package codility;

public class WinterSummer {
    public static void main(String[] args) {
        int[] temps = new int[] {5, -2, 3, 8, 6};
        WinterSummer ws = new WinterSummer();
        System.out.println(ws.solution(temps));

    }

    public int solution(int[] temps) {
        int len = temps.length;
        if (len == 0) return 0;

        int winterHigh = temps[0];
        int overallHigh = temps[0];
        int winterLen = 0;

        // Get max element while iterating from left to right
        for (int temp : temps) {
            if (temp <= winterHigh) {
                winterHigh = overallHigh;
                winterLen++;
            }
            else if (temp > overallHigh) overallHigh = temp;
        }

        return winterLen;
    }
}
