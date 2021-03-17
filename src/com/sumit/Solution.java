package com.sumit;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public int[] deckRevealedIncreasing(int[] deck) 
    {
        //sort array
        Arrays.sort(deck);
        
        int [] res = new int[deck.length];
        
        
        Queue<Integer> q = new LinkedList<>();
        
        /*adding index in queue
         * 
         * this queue will have value:
         * q = {0,1,2,3,4,....n-1}
        */
        for(int i =0 ;i<deck.length;i++)
        {
            q.add(i);
        }
        
        /*
         * iterating over deck array and then pop the first value of queue , which will
         * act as index for result array and in that index we place the value of first
         * element from deck. 
         * 
         * then again pop the first value from queue and put it to end of queue by 
         * calling add method of queue.
         * 
         */
        for(int i =0 ; i<deck.length;i++)
        {
            res[q.poll()] = deck[i];
            q.add(q.poll());
        }
        
        return res;
    }
}
