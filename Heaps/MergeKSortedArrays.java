package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
    public static ArrayList<Integer> mergeArray(ArrayList<ArrayList<Integer>>kArray, int k){
        ArrayList<Integer> result = new ArrayList<>();
        //max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for (ArrayList<Integer> array : kArray ){
            pq.addAll(array);
        }
        while(!pq.isEmpty()){
            result.add(pq.peek());
            pq.remove();
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
