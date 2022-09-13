public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.minimizeResult("999+999"));
        System.out.println("===========================");
        System.out.println(myTest.minimizeResult("12+34"));
        System.out.println("===========================");
        System.out.println(myTest.minimizeResult("247+38"));
    }

    public String minimizeResult(String expression) {
        /**
         * 初始化最小值
         */
        int min = Integer.MAX_VALUE;
        /**
         * 记录左括号好右括号的位置
         */
        int left = 0;
        int right = 0;
        String[] split = expression.split("\\+");
        for (int i = split[0].length() - 1; i >=0; i--) {
//            初始化为1
            int multiLeft=1;
//            如果不是边界，就截取，是边界乘的值就设为1
            if (i!=0){
                multiLeft = Integer.valueOf(split[0].substring(0, i));
            }
            int addLeft = Integer.valueOf(split[0].substring(i, split[0].length()));
            for (int j = 1; j <=split[1].length(); j++) {
                int multiRight=1;
                int addRight = Integer.valueOf(split[1].substring(0, j));
//                如果不为边界就截取，否则设为1
                if (j!=split[1].length()){
                    multiRight = Integer.valueOf(split[1].substring(j, split[1].length()));
                }
//                求结果
                int sum = (addLeft + addRight) * multiLeft * multiRight;
//                如果更小，就记录括号的位置
                if (sum < min) {
                    left = i;
                    right = j;
                    min = sum;
                }
            }
        }
        StringBuilder res = new StringBuilder(expression);
//        插入左括号
        res.insert(left,"(");
//        算好左括号和+号，要后移两位
        res.insert(right+split[0].length()+2,")");
        return res.toString();
    }
}
