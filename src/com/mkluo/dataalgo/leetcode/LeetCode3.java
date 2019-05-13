package com.mkluo.dataalgo.leetcode;



import java.util.HashMap;
import java.util.Map;

/**
 * @Description: LeetCode-3-无重复字符的最长子串
 * @Author: luomingkui
 * @Date: Created in 下午2:22 2019/5/12
 * @Version: V1.0
 */

public class LeetCode3 {

    public static void main(String[] args) {
        LeetCode3 leetCode3 = new LeetCode3();
        int total = leetCode3.lengthOfLongestSubstring("aaaaaaa");
        System.out.println(total);
    }

    /*public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }*/

    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans = 0;

        Map<Character,Integer> map = new HashMap<>();

        for (int j=0,i=0;j<n;j++){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }

}
