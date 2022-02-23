// Several people are standing in a row and need to be divided into two teams. 
// The first person goes into team 1, 
// the second goes into team 2, 
// the third goes into team 1 again, 
// the fourth into team 2, 
// and so on.

// You are given an array of positive integers - the weights of the people. 
// Return an array of two integers, 
// where the first element is the total weight of team 1, 
// and the second element is the total weight of team 2 after the division is complete.

// Example
// For a = [50, 60, 60, 45, 70], 
// the output should be
// solution(a) = [180, 105].

// Input/Output

// [execution time limit] 3 seconds (java)

// [input] array.integer a

// Guaranteed constraints:
// 1 ≤ a.length ≤ 105,
// 45 ≤ a[i] ≤ 100.

// [output] array.integer

// Solution
int[] solution(int[] a) {
    if (a == null || a.length == 0) {
        return new int[0];
    }
    
    int weightEven = 0;
    int weightOdd = 0;
    
    for (int i = 0; i < a.length; i++) {
        if (i % 2 == 0) {
            weightEven += a[i];
        }
        else {
            weightOdd += a[i];
        }
    }
    
    return new int[] {weightEven, weightOdd};
}
// TC: O(n); SC: O(1)
