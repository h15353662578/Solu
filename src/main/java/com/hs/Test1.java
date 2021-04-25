package com.hs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

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
                int medin = (right + left)/2;
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

class Test5{
    public static void main(String[] args) {
        System.out.print(huih("AABBCCC", "CCCAABB"));
    }
    public static boolean huih(String str1,String str2){
        return str1.length()==str2.length() && (str1+str1).contains(str2);
    }
}

/***
 * 数组中只有一个数字出现过一次输出
 */
class Test6{
    public static int singleNUmber(int[] nums){
        int ans = 0;
        for(int i:nums)ans ^=i;
        return ans;
    }

    public static void main(String[] args) {
        int[] a =new int[]{1,1,2,2,55,55,6};
        System.out.println(singleNUmber(a));
    }
}


class Test7{
    public static void main(String[] args) {
        int h1 ;
        int h2 ;
        double ball1,b1;
        double ball2,b2;

        Scanner scanner = new Scanner(System.in);
        h1 = scanner.nextInt();
        h2 = scanner.nextInt();
        b1 = (double)h1;
        b2 = (double)h2;
        System.out.println("这是ball1弹起十次的高度记录");
        for (int i=1;i<=10;i++){
            ball1=b1*0.6;
            b1=ball1;

            System.out.println("----------这是第"+i+"次的高度----------");
            System.out.println(ball1+"米");
        }
        System.out.println("这是ball2弹起十次的高度记录");
        for (int j=1;j<=10;j++){
            ball2=b2*0.6;
            b2=ball2;

            System.out.println("----------这是第"+j+"次的高度----------");
            System.out.println(ball2+"米");
        }
        System.out.println("----------记录结束---------");
    }
}

class Test8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s;
        double g=9.8;
        double t;
        t = scanner.nextInt();
        s=t*g*t*t;

        System.out.println(s);
    }

}

class Test9{
    public static void main(String[] args) {
        int[] T = new int[]{1,4,5,7,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入x值");
        int x = scanner.nextInt();
        System.out.println(find(T,x));
    }

    public static int find(int[] T,int x){
        for (int j = 0;j < T.length; j++){
            if(x == T[j]){
                return x;
            }
        }
        return -1;
    }
}

class Test10{
    public static void main(String[] args) {
        int[] T = new int[]{1,4,5,6,7,78,88};
        int[] Y = new int[T.length+1];
        int insertIndex = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入x的值");
        int x = scanner.nextInt();
        for (int i = 0;i<T.length;i++){
            for (int j=1;j<T.length;j++){
                if (x > T[i]&& x<T[j]){
                    insertIndex = x;
                }
            }
            Y[insertIndex] = x;
            System.out.println(Arrays.toString(Y));
        }
    }
}

class Test11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((x+"").length());
        while (x!=0){
            int a =x%10;
            System.out.println(a);
            x=x/10;
        }
    }
}

class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int n = z;
        String x = "1 / 2 + 1 / 4 + 1 / n";
        String y = "1 / 1 + 1 / 3 + 1 / n";
        System.out.println(select(x, y, n));
    }

    public static String select(String x, String y, int n) {
        if (n % 2 == 0) {
            return x;
        } else {
            return y;
        }
    }
}

class Test13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("人数");
        int x = sc.nextInt();
        boolean[] y = new boolean[x];
        for (int i=0;i<y.length;i++){
            y[i] = true;
        }
        int l = x;
        int c = 0;
        int in = 0;
        while (l > 1){
            if (y[in]== true){
                c++;
                if (c == 3){
                    c = 0;
                    y[in] = false;
                    l--;
                }
            }
            in++;
            if (in == x){
                in = 0;
            }
        }
        for (int i = 0;i < x;i ++){
            if (y[i]== true){
                System.out.println("第"+(i + 1)+"位留下了");
            }
        }
    }
}

class Test14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i = 1;
        while (true){
            i++;
            if(i%a==0&&i%b==0&&i%c==0&&i>=a&&i>=b){
                System.out.println("最小公倍数"+i);
                i=1;
                break;
            }
        }
        int t = 1;
        while (true){
            i++;
            if(1%i==0&&b%i==0&&c%i==0){
                t=i;
            }
            if(i>a||i>b||i>c);
            break;
        }
        System.out.println("最大公约数"+t);
    }
}


class Test15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数组位数");
        int s = sc.nextInt();
        System.out.println("输入数组");
        int[] a= new int[s];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("输入要查询的数");
        int key = sc.nextInt();
        System.out.println(""+Arrays.toString(a));
        System.out.println(two(a,key));
    }
    public static int two(int[] a,int key){
        int left = 0;
        int right = a.length-1;
        while (right>=left){
            int medin = (right + left)/2;
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

class Test16{
    public static void main(String[] args) {
        //使用AtomicLong
        demo(
                () -> new AtomicLong(0),
                (adder) -> adder.getAndIncrement()
        );

        //使用累加器 LongAdder
        demo(
                () -> new LongAdder(),
                adder -> adder.increment()
        );
    }

    private static <T> void demo(Supplier<T> adderSupplier, Consumer<T> action) {
        T adder = adderSupplier.get();
        List<Thread> ts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入线程数");
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            ts.add(new Thread(() -> {
                for (int k = 0; k < 500 * 1000; k++) {
                    action.accept(adder);
                }
            }));
        }

        long start = System.nanoTime();
        ts.forEach(t -> t.start());
        ts.forEach(t -> {});

        long end = System.nanoTime();
        System.out.println(adder + "  执行时间:" + (end -start)/1000_000+"秒");
    }
}

/***
 * 累加器
 */
class Test17{
    public static void main(String[] args) throws InterruptedException{
        LongAccumulator accumulator = new LongAccumulator((x,y)->{
            long s = x + x * y;
            System.out.println(x+"x"+x+"*"+y+"="+s);
            return s;
        },1);
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        IntStream.range(1,10).forEach(i->executorService.submit(() -> accumulator.accumulate(i)));
        executorService.shutdown();
        Thread.sleep(20000);
        System.out.println(accumulator.getThenReset());
    }
}








