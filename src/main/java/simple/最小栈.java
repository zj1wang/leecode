package simple;

import java.util.LinkedList;

/*
* 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。

实现 MinStack 类:

MinStack() 初始化堆栈对象。
void push(int val) 将元素val推入堆栈。
void pop() 删除堆栈顶部的元素。
int top() 获取堆栈顶部的元素。
int getMin() 获取堆栈中的最小元素。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/min-stack
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*
* */
public class 最小栈 {


    class MinStack {
        private LinkedList<Integer> stack;
        private LinkedList<Integer> minStack;

        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
            minStack.push(Integer.MAX_VALUE);

        }

        public void push(int val) {
            stack.push(val);
            minStack.push(Math.min(val,minStack.peek()));

        }

        public void pop() {
            minStack.pop();
            stack.pop();

        }

        public int top() {
         return    stack.peek();

        }

        public int getMin() {
          return   minStack.peek();

        }
    }

}
