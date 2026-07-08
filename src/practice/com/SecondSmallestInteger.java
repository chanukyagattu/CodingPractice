package practice.com;

public class SecondSmallestInteger {
    public static void main(String[] args) {
//        int ip[] = { 1, 2, 3, 4, 5 };
        // give me various examples of inut below for testting
        int[] ip = { 5, -10, -4, 3, 0, 12, 1, 100, -3, -10 };


        int first = ip[0], second = ip[0];
        for (int i = 1; i < ip.length; i++) {
            if (ip[i] < first) {
                first = ip[i];
            } else if (ip[i] < second && ip[i] != first) {
                second = ip[i];
            }
        }
        System.out.println("Second smallest integer is: " + second);
    }
}
