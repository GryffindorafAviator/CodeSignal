Given two strings, 
find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", 
the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (java)

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer

Solution
int commonCharacterCount(String s1, String s2) {
    Map<Character, Integer> hm = new HashMap<>();
    int cnt = 0;
    
    helperMap(s1, hm);
    
    for (int i = 0; i < s2.length(); ++i) {
        char ch = s2.charAt(i);
        
        if (hm.containsKey(ch)) {
            ++cnt;
            hm.put(ch, hm.get(ch) - 1);
            
            if (hm.get(ch) == 0) {
                hm.remove(ch);
            }
        }
    }
    
    return cnt;    
}

void helperMap(String s1, Map<Character, Integer> hm) {
    for (int i = 0; i < s1.length(); ++i) {
        hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
    }
}

TC: O(n); SC: O(n)
