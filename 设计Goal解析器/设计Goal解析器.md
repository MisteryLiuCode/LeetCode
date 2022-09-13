## 题目：

请你设计一个可以解释字符串 `command` 的 **Goal 解析器** 。`command` 由 `"G"`、`"()"` 和/或 `"(al)"` 按某种顺序组成。Goal 解析器会将 `"G"` 解释为字符串 `"G"`、`"()"` 解释为字符串 `"o"` ，`"(al)"` 解释为字符串 `"al"` 。然后，按原顺序将经解释得到的字符串连接成一个字符串。

给你字符串 `command` ，返回 **Goal 解析器** 对 `command` 的解释结果。



**示例 1：**

```
输入：command = "G()(al)"
输出："Goal"
解释：Goal 解析器解释命令的步骤如下所示：
G -> G
() -> o
(al) -> al
最后连接得到的结果是 "Goal"
```

**示例 2：**

```
输入：command = "G()()()()(al)"
输出："Gooooal"
```

**示例 3：**

```
输入：command = "(al)G(al)()()G"
输出："alGalooG"
```

## 思路：

- 遍历字符串，
- 如果字符等于G，那么就拼接G
- 如果字符等于（ ，下一个字符等于 a 那么拼接al，改变指针指向
- 如果左字符等于（，下一个字符等于 ），那么拼接o ，改变字符的指向

## 代码：

```java
public String interpret(String command) {
//        对字符遍历
        String result="";
        for (int i=0;i<command.length();i++){
            if (command.charAt(i)=='G'){
                result+="G";
                continue;
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)==')'){
                result+="o";
                i=i+1;
                continue;
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                result+="al";
                i=i+3;
                continue;
            }
        }
        return result;
    }
```

## 结果：

![image-20220216164709157](https://gitee.com/misteryliu/typora/raw/master/image/image-20220216164709157.png)