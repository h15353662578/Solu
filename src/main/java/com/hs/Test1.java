package com.hs;

/**
 * @author Huasheng
 * @Date 2021/04/20/21:03
 * @Description
 */
public class Test1 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,4,8,9,35,67};
        System.out.println(two(a, 8));
    }

    public static int two(int[] a,int key){
        int left = 0;
        int right = a.length-1;
        while (right>=left){
            int medin = (int)(right + left)/2;
            if (a[medin] < key){
                left = medin + 1;
            }else if (a[medin] > key) {
                right = medin - 1;
            }else{
                return medin;
            }
        }
        return -1;
    }
}

 class DIgui {
    public static void main(String[] args) {
        int a[] = new int[]{1,3,4,5,6,7,35,37,66};
        System.out.println(rank(a,0,a.length -1,1));

    }

    public static int rank(int[] a,int left , int right, int b){
//        if(right < left){
//            return -1;
//        }else{
                int medin = (int)(right + left)/2;
                System.out.println(left+"|"+right);
                if (right>=left){
                if (a[medin] < b){
                    left = medin +1;
                    rank(a, left, right, b);
                }else if (a[medin] > b){
                    right = medin -1;
                    rank(a, left, right, b);
                }else if (a[medin]==b) {
                    System.out.println(medin);
                    return medin;
                }
                }
        return -1;
        }
    }
//}


class Test2 {
    public static void main(String[] args) {
        System.out.println(commonDivisor(9,6));
    }
    public  static int commonDivisor(int m,int n){

        if (n==0) {
            return m;
        }
        int r=m%n;
        return commonDivisor(n,r);
    }

}

class Test3{
    private static long COUNT = 0;
    private static double[][] M;
    private static double fasterBinomial(int N, int k, double p) {
        COUNT++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        if (M[N][k] == -1) {
            M[N][k] = (1.0 - p) * fasterBinomial(N - 1, k, p) + p * fasterBinomial(N - 1, k - 1, p);
        }
        return M[N][k];
    }

    public static double binomial(int N, int k, double p) {
        M = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                M[i][j] = -1;
            }
        }
        return fasterBinomial(N, k, p);
    }

    public static void main(String[] args){
        double array=binomial(10,5,0.25);
        System.out.println(array);
    }
}

class Test4 {
    public static void main(String[] args) {
        int[] a = new int[]{1,1,2,3,4,4,4,5,6};
        System.out.println(Solution.removeDuplicates(a));

    }
    static class Solution {
        public static int removeDuplicates(int[] nums) {
            int count = 0;
            for(int right = 1;right<nums.length;right++){
                if(nums[right] == nums[right-1]){
                    count++;
                }else{
                    nums[right-count] = nums[right];
                }
            }
            return count;
        }
    }
}