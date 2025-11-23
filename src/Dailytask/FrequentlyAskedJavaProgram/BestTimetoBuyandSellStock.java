package Dailytask.FrequentlyAskedJavaProgram;

import java.util.Arrays;

public class BestTimetoBuyandSellStock {
    static void main() {
        int a []={7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i =0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }else {
                int profit =a[i]-min;
                if(profit>max){
                    max=profit;
                }
            }
        }
        System.out.println(max);
    }
}
