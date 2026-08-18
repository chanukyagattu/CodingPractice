package practice.com;

import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> pq;
    int kThLargest;

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));   // returns 4
        System.out.println(kthLargest.add(5));   // returns 5
        System.out.println(kthLargest.add(10));  // returns 5
        System.out.println(kthLargest.add(9));   // returns 8
        System.out.println(kthLargest.add(4));   // returns 8
    }

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(k + 1);
        kThLargest = k;
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        
        while (pq.size() > kThLargest) {
            pq.poll();
        }
 
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */