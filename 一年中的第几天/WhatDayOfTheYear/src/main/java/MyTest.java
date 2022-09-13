public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.dayOfYear("2012-01-02"));
    }

    public int dayOfYear(String date) {
//        对字符串进行分割
        String[] dateArr = date.split("-");
//        获取年月日
        int year = Integer.valueOf(dateArr[0]);
        int month = Integer.valueOf(dateArr[1]);
        int day = Integer.valueOf(dateArr[2]);
        int res = day;
//        用数组记录每月的天数，不算闰年
        int[] monthNum = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        如果是闰年+0,平年+1
        for (int i = 0; i < month - 1; i++) {
            res += monthNum[i];
        }
        if (month >= 3) {
            res += (isLeapYear(year) ? 1 : 0);
        }
        return res;
    }

    public Boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0;
    }

}
