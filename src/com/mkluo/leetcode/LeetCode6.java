package com.mkluo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: LeetCode-6-Z字形变换
 * @Author: luomingkui
 * @Date: Created in 下午3:05 2019/5/14
 * @Version: V1.0
 */

public class LeetCode6 {

    public static void main(String[] args) {
        LeetCode6 leetCode6 = new LeetCode6();
        String abc = leetCode6.convert("acngmhgnrjdn",3);
        System.out.println(abc);
    }

    public String convert(String s, int numRows) {

        if (numRows == 1){
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i <  s.length(); i++){
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1){
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows){
            ret.append(row);
        }
        return ret.toString();
    }


}