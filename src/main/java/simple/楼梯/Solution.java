package simple.楼梯;
/*
70. 爬楼梯
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
* */

//动态规划
public class Solution {

    public int climbStairs(int n) {
        int num[] = new int[n];
        //n方法=(n-1)+(n-2)
        if(n==1){
            return 1;
        }
        num[0]=1;
        num[1]=2;
        for (int i = 2; i < n; i++) {
            num[i] = num[i-1]+num[i-2];
        }
        return num[n-1];

    }
}
