public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder(s.replace("-", "").toUpperCase());
        for (int i=stringBuilder.length()-k;i>=0;i-=k){
            stringBuilder.insert(i,'-');
        }
        return stringBuilder.toString();
    }
}
