Ticket numbers usually consist of an even number of digits. 
A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, 
determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.
  
boolean isLucky(int n) {
    List<Integer> digits = new ArrayList<>();
    int cnt = 0;
    int digit = 0;
    
    while (n != 0) {
        digit += n % 10;
        n /= 10;
        
        digits.add(digit);
        ++cnt;
    }
    
    if (digits.get(cnt - 1) - digits.get(cnt / 2 - 1) * 2 == 0) {
        return true;
    }
    
    return false;
}

TC: O(n); SC: O(n)
