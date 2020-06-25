package net.manishgiri.easy.validatesubsequence.solution2;

import java.util.List;

class Program {

    // Time - O(m+n), loops through sequence (length - n) while also doing additional work
    // equivalent to looping through array (length - m)

    static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int lastIdx = -1, pos = 0;
        boolean wasFound = false;
        for(int i = 0; i < sequence.size(); i++) {
            for(int j = lastIdx + 1; j < array.size(); j++) {
                if(array.get(j) == sequence.get(i)) {
                    pos = j;
                    wasFound = true;
                    break;
                }
            }
            if(!wasFound || pos < lastIdx)
                return false;
            else {
                lastIdx = pos;
                wasFound = false;
            }
        }
        return true;
    }

}
