You are given an array of integers a and two integers l and r. 
You task is to calculate a boolean array b, 
where b[i] = true if there exists an integer x, 
such that a[i] = (i + 1) * x and l ≤ x ≤ r. 
Otherwise, b[i] should be set to false.

Example

For a = [8, 5, 6, 16, 5], l = 1, and r = 3, 
the output should be 
boundedRatio(a, l, r) = [false, false, true, false, true].

For a[0] = 8, 
we need to find a value of x such that 1 * x = 8, 
but the only value that would work is x = 8 which doesn't satisfy the boundaries 1 ≤ x ≤ 3, 
so b[0] = false.
For a[1] = 5, 
we need to find a value of x such that 2 * x = 5, 
but there is no integer value that would satisfy this equation, so b[1] = false.
For a[2] = 6, 
we can choose x = 2 because 3 * 2 = 6 and 1 ≤ 2 ≤ 3, 
so b[2] = true.
For a[3] = 16, 
there is no an integer 1 ≤ x ≤ 3, 
such that 4 * x = 16, so b[3] = false.
For a[4] = 5, 
we can choose x = 1 because 5 * 1 = 5 and 1 ≤ 1 ≤ 3, 
so b[4] = true.
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

An array of integers.

Guaranteed constraints:
1 ≤ a.length ≤ 100,
1 ≤ a[i] ≤ 106.

[input] integer l

An integer representing the lower bound for x.

Guaranteed constraints:
1 ≤ l ≤ 104.

[input] integer r

An integer representing the upper bound for x.

Guaranteed constraints:
1 ≤ r ≤ 104,
l ≤ r.

[output] array.boolean

A boolean array.

boolean[] boundedRatio(int[] a, int l, int r) {
    boolean[] b = new boolean[a.length];
    
    for (int i = 0; i < a.length; ++i) {
        for (int x = l; x <= r; ++x) {
            if (a[i] == (i + 1) * x) {
                b[i] = true;
            }
        }
    }
    
    return b;
}
