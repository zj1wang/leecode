package simple;

/*
* 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。

你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。

返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。


* */
//暴力法n2
//单次循环，记录最小最大值
public class 买卖股票最佳时机 {
    public int maxProfit(int[] prices) {
        int minProfit = Integer.MAX_VALUE;
        int maxGet = 0;
        for (int price :
                prices) {
            if(price<minProfit){
                minProfit = price;
            }else if(price-minProfit>maxGet){
                maxGet = price-minProfit;
            }
        }

        return maxGet;


    }
}
