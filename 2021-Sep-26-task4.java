Given an array of integers a and a set of queries of the form [l, r, x], your task is to calculate the number of occurrences of the number x in the inclusive subarray a[l..r] (0-based), for each query. Return the sum of the answers for all queries as the result.

Example

For a = [1, 2, 1, 3, 1, 2, 1] and

queries = [
  [1, 3, 3],
  [0, 4, 1],
  [2, 5, 2],
  [5, 6, 1]
]
the output should be countOnSubarrays(a, queries) = 6.

The answer to the first query is 1: the number 3 appears 1 time in the subarray [2, 1, 3];
The answer to the second query is 3: the number 1 appears 3 times in the subarray [1, 2, 1, 3, 1];
The answer to the third query is 1: the number 2 appears 1 time in the subarray [1, 3, 1, 2];
The answer to the fourth query is 1: the number 1 appears 1 time in the subarray [2, 1].
So the answer is 1 + 3 + 1 + 1 = 6.
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

An array of integers.

Guaranteed constraints:
1 ≤ a.length ≤ 104,
1 ≤ a[i] ≤ 100.

[input] array.array.integer queries

An array of queries, where queries[i] contains three numbers: l, r and x.

Guaranteed constraints:
3 ≤ queries.length ≤ 105,
queries[i].length = 3,
0 ≤ queries[i][0] ≤ queries[i][1] < a.length,
1 ≤ queries[i][2] ≤ 100.

[output] integer

The sum of the answers to all queries.
