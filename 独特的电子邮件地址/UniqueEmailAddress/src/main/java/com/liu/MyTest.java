package com.liu;

import java.util.HashSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] emails=new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(myTest.numUniqueEmails2(emails));
    }

    public int numUniqueEmails(String[] emails) {
        HashSet set = new HashSet();
        for (String email : emails) {
//            对字符串进行分割
            String[] split = email.split("@");
            split[0] = split[0].replace(".", "");
            if (split[0].contains("+")){
                split[0]=split[0].split("\\+")[0];
            }
            email=split[0]+"@"+split[1];
            set.add(email);
        }
        return set.size();
    }

    public int numUniqueEmails2(String[] emails) {
        HashSet set = new HashSet();
        for (String email : emails) {
//            对字符串进行分割
            String[] split = email.split("@");
            StringBuilder res = new StringBuilder();
            for (int i=0;i<split[0].length();i++){
                if (split[0].charAt(i) == '.'){
                    continue;
                }
                if (split[0].charAt(i) == '+'){
                    break;
                }
                res.append(split[0].charAt(i));
            }
            res.append("@");
            res.append(split[1]);
            System.out.println(res);
            set.add(res.toString());
        }
        return set.size();
    }

}
