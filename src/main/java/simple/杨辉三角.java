package simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
//
//        在「杨辉三角」中，每个数是它左上方和右上方的数的和。
public class 杨辉三角 {
//动态规划

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return List.of(Collections.emptyList());
        }
        List<List<Integer>> returnList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            ArrayList<Integer> integers = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if(j==0||j==i){
                    integers.add(1);
                }else {
                    List<Integer> beforeInt = returnList.get(i - 1);
                    integers.add(beforeInt.get(j-1)+beforeInt.get(j));
                }
            }
            returnList.add(integers);
        }
        return returnList;

    }
}
