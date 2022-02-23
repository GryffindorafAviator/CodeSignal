// Write a function that reverses characters in (possibly nested) parentheses in the input string.

// Input strings will always be well-formed with matching ()s.

// Example
// For inputString = "(bar)", 
// the output should be
// solution(inputString) = "rab";

// For inputString = "foo(bar)baz",
// the output should be
// solution(inputString) = "foorabbaz";

// For inputString = "foo(bar)baz(blim)", 
// the output should be
// solution(inputString) = "foorabbazmilb";

// For inputString = "foo(bar(baz))blim", 
// the output should be
// solution(inputString) = "foobazrabblim".
  
// Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
// Input/Output

// [execution time limit] 3 seconds (java)

// [input] string inputString

// A string consisting of lowercase English letters and the characters ( and ). 
// It is guaranteed that all parentheses in inputString form a regular bracket sequence.

// Guaranteed constraints:
// 0 ≤ inputString.length ≤ 50.

// [output] string

// Return inputString, 
// with all the characters that were in parentheses reversed.

// Solution
String solution(String inputString) {
    if (inputString == null || inputString.length() < 2) {
        return inputString;
    }

    char[] charArr = inputString.toCharArray();
    Deque<Integer> stack = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    
    if (charArr.length == 2 && charArr[0] == '(') {
        return "";
    }
    
    for (int i = 0; i < inputString.length(); i++) {
        if (charArr[i] == '(') {
            stack.addFirst(i);
        }
        else if (charArr[i] == ')') {
            int leftParen = stack.pollFirst();
         
            swapArray(charArr, leftParen + 1, i - 1); 
        }
    }
    
    for (int i = 0; i < charArr.length; i++) {
        if (charArr[i] == '(' || charArr[i] == ')') {
            continue;
        }
        
        sb.append(charArr[i]);
    }
    
    
    
    return sb.toString();   
}

private void swapArray(char[] charArr, int start, int end) {
    while (start < end) {
        swapChar(charArr, start, end);
        start++;
        end--;
    }
}

private void swapChar(char[] charArr, int left, int right) {
    char temp = charArr[left];
    charArr[left] = charArr[right];
    charArr[right] = temp;
}
// TC: O(n^m): SC: O(n);
// n is the length of the string. m is the number of parentheses.

