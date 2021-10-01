// Given an array of strings, 
// return another array containing all of its longest strings.

// Example

// For inputArray = ["aba", "aa", "ad", "vcd", "aba"], 
// the output should be
// allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

// Input/Output

// [execution time limit] 3 seconds (java)

// [input] array.string inputArray

// A non-empty array.

// Guaranteed constraints:
// 1 ≤ inputArray.length ≤ 10,
// 1 ≤ inputArray[i].length ≤ 10.

// [output] array.string

// Array of the longest strings, 
// stored in the same order as in the inputArray.

// Solution
String[] allLongestStrings(String[] inputArray) {
   if (inputArray.length == 1) {
       return inputArray;
   }
    
    int end = 1;
    int len = inputArray[0].length();
    
    for (int i = 1; i < inputArray.length; ++i) {
        if (inputArray[i].length() == len) {
            inputArray[end] = inputArray[i];
            ++end;
        }
        else if (inputArray[i].length() > len) {
            inputArray[0] = inputArray[i];
            end = 1;
            len = inputArray[i].length();
        }
    }
    
    return Arrays.copyOf(inputArray, end);
}

// TC: O(n); SC: O(1)
