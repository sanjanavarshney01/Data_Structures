package couple;

import java.util.Arrays;

public class Anagram {
    public boolean anagram(String str1, String str2) {
        int n1 = str1.length();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < n1; i++) {
            if (arr1[i]==arr2[i]){
                return true;
            }

        }
     return false;
    }
}