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
        ArrayList<int[]> tempRallies = new ArrayList<int[]>();
        tempRallies.addAll(_rallies);
        int startTime = 0;
        int endTime = 0;
        int duration = 0;
        int deadline = 1;
        //change the name unsortedarrayList to something more meangingful

       mergeSort(_rallies);

        for (int i = 0; i <_n_rallies; i++) {
            int supposedFinishTime = _rallies.get(i)[deadline];
            int [] assignedRally = new int[2];
            endTime = startTime + _rallies.get(i)[duration];
            int rallyId = tempRallies.indexOf(_rallies.get(i));

            assignedRally[0] = rallyId;
            assignedRally[1] = startTime;
            schedule.add(assignedRally);
            startTime = endTime;


            int lateness = supposedFinishTime - endTime;
            if (lateness < 0) {
                schedule.clear();
                return schedule;
            }

        }
        return schedule;
    }

    public static void mergeSort(ArrayList<int[]>rallies){
        doMergeSort(rallies);
    }

    public static void doMergeSort(ArrayList<int[]> unsortedRallies){

        int middle;
        ArrayList<int[]> left = new ArrayList<>();
        ArrayList<int[]> right = new ArrayList<>();

        if (unsortedRallies.size() > 1) {
            middle = unsortedRallies.size() / 2;

            for (int i = 0; i < middle; i++){
                left.add(unsortedRallies.get(i));
            }

            for (int j = middle; j < unsortedRallies.size(); j++) {
                right.add(unsortedRallies.get(j));
            }
            doMergeSort(left);
            doMergeSort(right);

            merge(unsortedRallies, left, right);
        }
    }

    private static void merge(ArrayList<int[]> unsortedRallies, ArrayList<int[]> left, ArrayList<int[]> right){
        ArrayList<int[]> temp = new ArrayList<>();

        int numbersIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int deadline = 1;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex)[deadline] < right.get(rightIndex)[deadline] ) {
                unsortedRallies.set(numbersIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                unsortedRallies.set(numbersIndex, right.get(rightIndex));
                rightIndex++;
            }
            numbersIndex++;
        }

        int tempIndex = 0;
        if (leftIndex >= left.size()) {
            temp = right;
            tempIndex = rightIndex;
        }
        else {
            temp = left;
            tempIndex = leftIndex;
        }

        for (int i = tempIndex; i < temp.size(); i++) {
            unsortedRallies.set(numbersIndex, temp.get(i));
            numbersIndex++;
        }
    }
}
