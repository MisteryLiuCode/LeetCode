/**
 * @program: AddressInvalidation
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-11 22:27
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.defangIPaddr("1.1.1.1"));
    }

    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

}
