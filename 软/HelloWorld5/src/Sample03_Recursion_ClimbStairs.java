public class Sample03_Recursion_ClimbStairs {
        /**
         * 计算爬到 n 阶楼梯楼顶的不同方法数
         * @param n 楼梯的阶数，n > 0
         * @return 不同的方法数
         */
        public int methodsQuanity(int n) {
            if(n == 1){
                return 1;
            }
            if(n == 2){
                return 2;
            }

//            return MethodsQuanity(n-1) + MethodsQuanity(n-2);

            int ans = 0;
            int first = 1;
            int second = 2;
            for(int i = 3; i <= n; i++){
                ans = first + second;
                first = second;
                second = ans;
            }
            return ans;
        }
        public static void main(String[] args) {
            Sample03_Recursion_ClimbStairs s = new Sample03_Recursion_ClimbStairs();
            System.out.println(s.methodsQuanity(5));
        }
}
