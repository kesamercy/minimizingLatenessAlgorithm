package ub.cse.algo;

import java.util.*;

public class Solution {
    
    private int _n_rallies;
    private ArrayList<int[]> _rallies;
    
    public Solution (int n_rallies, ArrayList<int[]> rallies){
        _n_rallies = n_rallies;
        _rallies = rallies;
    }


    /**
     * You should fill this in on your own. Rallies is list of tuples, in the form (rally duration, rally deadline).
     * Your output should also be a list of tuples, of the form (rally id, start time of rally). If no possible
     * schedule exists, you should return an empty list.
     * @return
     */
    public ArrayList<int[]> getSchedule(){
        ArrayList<int[]> schedule = new ArrayList<int[]>();

        System.out.println("the number of the deadline " + _rallies.get(2)[1]);

        //use the merge sort algorithm to sort the arraylist then proceed with the other part of the program

























        //sort the schedule by the deadline, the earliest deadline should come first ascending order

        //create a temp schedule and copy elements therre... this is also the one you sort
        ArrayList<int[]> tempRallies = new ArrayList<int[]>();
        tempRallies.addAll(_rallies);
        int durationAndFinishTimeValues = 2;


        //the hash map..
        HashMap<Integer, ArrayList<Integer>> newrallies  = new HashMap<>();

        //the keys should be the deadline
        for (int i = 0; i < _n_rallies; i++) {
            //i is the position that should now be in the list of the value
            System.out.println("the rallies " + _rallies.get(i));
            for (int j = 0; j < durationAndFinishTimeValues ; j++) {
//                newrallies.put()

            }
            for (int values: _rallies.get(i)) {

            }


        }
        for (int []duration: _rallies) {

            for (int finishTime: duration) {

            }

        }

        //the values should be a list, of the orinigal position and the duration


        //put this into a hash map and then sort the hashmap

//        she needs to decide in n log n time

//        sort the algorithm first using binary search

        //for every job in i, schedule it from start to finish based on the duration

        //figure out how to get every element in the array

//
//        Order the jobs in order of their deadlines
//        Assume for simplicity of notation that d 1 ≤ . . . ≤ d n
//        Initially, f = s
//        128
//        Chapter 4 Greedy Algorithms
//        Consider the jobs i = 1, . . . , n in this order
//        Assign job i to the time interval from s(i) = f to f(i) = f + t i
//        Let f = f + t i
//                End
//        Return the set of scheduled intervals [s(i), f(i)] for i = 1, . . . , n

        //make sure that every job finishes before it's suggested end time

        //update the start time after you scheudle a job based on the previous end time.

        //System.out.println("IMPLEMENT ME!");
        return schedule;
    }
}
