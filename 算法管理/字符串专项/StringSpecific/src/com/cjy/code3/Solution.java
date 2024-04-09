package com.cjy.code3;

/**
 * @Author cjy
 * @Date 2024/4/9 18:52
 * @Version 1.0
 * @Description: 假定一段路径记作字符串 path，其中以 "." 作为分隔符。现需将路径加密，加密方法为将 path
 * 中的分隔符替换为空格 " "，请返回加密后的字符串。
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(pathEncryption("a.aef.qerf.bb"));
    }
    public static String pathEncryption(String path) {
        String replace = path.replace(".", " ");
        return replace;
    }
}
