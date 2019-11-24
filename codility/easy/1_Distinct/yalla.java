"""
https://app.codility.com/programmers/lessons/6-sorting/distinct/
result : https://app.codility.com/demo/results/trainingBGJKSR-UE6/
Task Score :100%
Correctness:100%
Performance:100%
"""
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set hashSet = new HashSet<>();
        for(int number : A){
            hashSet.add(number);
        }
        return hashSet.size();
    }
}