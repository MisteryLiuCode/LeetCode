public class MyTest {
    public static void main(String[] args) {
//        String[] strs=new String[]{"aaa","aaa","aa"};
        String[] strs=new String[]{"aba","cdc","eae"};
        MyTest myTest = new MyTest();
        System.out.println(myTest.findLUSlength(strs));

    }

    public int findLUSlength(String[] strs) {
        int max=-1;
//        int strLength=strs.length;
//        对于每一个字符，判断是否完整的按照顺序在后面的字符串中出现
        for (int i = 0; i < strs.length; i++) {
            int aBooleanNum=0;
            for (int j =0; j < strs.length; j++) {
                if (i==j){
                    continue;
                }
//                res=isAppear(strs[i], strs[j])?--strLength:strLength;
                Boolean aBoolean = isAppear(strs[i], strs[j]);
                if (aBoolean==true){
                    break;
                }
                aBooleanNum++;
            }
            if (aBooleanNum==strs.length-1){
                max=Math.max(max,strs[i].length());
            }
        }
        return max;
    }

    //    判断是否完整的按照顺序在后面的字符串中出现
    private Boolean isAppear(String currentCharacter, String compareCharacter) {
        int index = 0;
        for (int j = 0; j < compareCharacter.length(); j++) {
            if (currentCharacter.charAt(index) == compareCharacter.charAt(j)) {
                index++;
            }
            if (index==currentCharacter.length()){
                break;
            }
        }
        return index==currentCharacter.length();
    }
}
