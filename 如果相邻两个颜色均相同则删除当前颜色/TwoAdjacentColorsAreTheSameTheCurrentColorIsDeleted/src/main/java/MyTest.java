public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.winnerOfGame("AAABABB"));
        System.out.println(myTest.winnerOfGame("AA"));
        System.out.println(myTest.winnerOfGame("ABBBBBBBAAA"));
    }

    public boolean winnerOfGame1(String colors) {
        StringBuilder s = new StringBuilder(colors);
        Boolean res = false;
        while (true) {
            Boolean flag = false;
            if (s.length() < 3) {
                break;
            }
            for (int i = 1; i < s.length() - 1; i++) {
                if (res == false && s.charAt(i) == 'A' && s.charAt(i - 1) == 'A' && s.charAt(i + 1) == 'A') {
                    s.replace(i, i + 1, "");
                    res = true;
                    flag = true;
                    break;
                } else if (res == true && s.charAt(i) == 'B' && s.charAt(i - 1) == 'B' && s.charAt(i + 1) == 'B') {
                    s.replace(i, i + 1, "");
                    res = false;
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return res;
    }

    public boolean winnerOfGame(String colors) {
        int a = 0;
        int b = 0;
        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == 'A' && colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A') {
                a++;
            }
            if (colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B') {
                b++;
            }
        }
        return a>b?true:false;
    }


}
