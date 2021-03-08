package com.forest.algorithm.queue;

import java.util.Stack;

/**
 * 队列的栈实现
 * @see <a href="https://leetcode-cn.com/problems/implement-queue-using-stacks/">Leetcode</a>
 * 栈：先进后出
 * 队列：先进先出
 * 思路：利用栈的特点，先进后出，定义两个栈inStack和outStack，入栈到inStack，
 *      那么最先入的就在最下面，出栈时，将inStack栈顶元素一个个移到outStack，这时对于
 *      outStack，最先入inStack的元素就被移到了outStack的栈顶，这时从outStack栈顶
 *      出，就实现了队列的先进先出
 *
 * @author Forest
 * @date 2021年03月08日 19:58
 */
public class StackQueue<E> {
    private Stack<E> inStack;
    private Stack<E> outStack;

    public StackQueue() {
        inStack = new Stack();
        outStack = new Stack();
    }

    /**
     * 入队：push到inStack
     *
     * @param e
     * @return 
     * @author Forest
     * @date 2021/3/8 下午8:09
     */
    public void push(E e) {
        inStack.push(e);
    }

    /**
     * 出队
     * 1.如果outStack不为空，直接从outStack出栈顶元素
     * 2.如果outStack为空，循环将inStack元素添加到outStack知道inStack为空，然后执行1
     *
     * @param 
     * @return 
     * @author Forest
     * @date 2021/3/8 下午8:09
     */
    public E pop() {
        if (outStack.empty()) {
            while (!inStack.empty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    /**
     * 查询队列第一个元素
     * 1.如果outStack不为空，直接返回outStack栈顶元素
     * 2.如果outStack为空，直接返回inStack栈底元素
     *
     * @param 
     * @return 
     * @author Forest
     * @date 2021/3/8 下午8:12
     */
    public E peek() {
        if (!outStack.empty()) {
            return outStack.peek();
        } else {
            return inStack.firstElement();
        }
    }

    /**
     * 判断队列是否为空
     * inStack和outStack都为空则队列为空
     *
     * @param 
     * @return 
     * @author Forest
     * @date 2021/3/8 下午8:14
     */
    public boolean empty() {
        if(inStack.empty() && outStack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
