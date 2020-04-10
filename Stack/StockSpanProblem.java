package Stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args)
    {
        int[] arr={100,80,60,70,60,75,85};
        int[] Stock=new int[arr.length];
           getStockSpan(arr,Stock);
        for(int i=0;i<Stock.length;i++)
        {
            System.out.print(Stock[i]+" ");
        }
    }
    static void  getStockSpan(int[] arr,int[] Stock)
    {
        Stack<Integer> st=new Stack<>();
    }
}
