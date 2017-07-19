class Solution {
public:
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    int strStr(const char *source, const char *target) {
        // write your code here
              if (source == NULL || target == NULL) return -1;  
      int lenS = strlen(source);  
      int lenT = strlen(target);  
      for (int i = 0; i < lenS - lenT + 1; ++i) {  
          int j;  
          for (j = 0; j < lenT; ++j) {  
              if (source[i + j] != target[j]) break;  
          }  
          if (j == lenT) return i;  
      }  
        return -1;
    }
};
