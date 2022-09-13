public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public String restoreString(String s, int[] indices) {
        char[] res=new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]]=s.charAt(i);
        }
        return String.valueOf(res);
    }


}
