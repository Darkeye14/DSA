package Heaps;

//brute force
// sort and n - k element

import java.util.PriorityQueue;

public class KthLargest {
    static void kth_Largest_MaxHeap(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->b-a);
        int n = arr.length;
        for (int i =0; i< n; i++){
            pq.add(arr[i]);
        }
        int f = k-1;
        while(f > 0){
            pq.remove();
            f--;
        }
        System.out.println("Kth Smallest element "+pq.peek())  ;
    }
// for min heap, kth smallest
    //        PriorityQueue<Integer> pq = new PriorityQueue<>();

    public static void main(String args[]) {

        int arr[] = {1, 2, 6, 4, 5, 3}  ;

        kth_Largest_MaxHeap(arr, 3)  ;
      //  kth_Smallest_MinHeap(arr, 3)  ;
    }
}


//Quickest Select Algo -> nothing but quick sort;
// as soon as the pivot = k-1 return



