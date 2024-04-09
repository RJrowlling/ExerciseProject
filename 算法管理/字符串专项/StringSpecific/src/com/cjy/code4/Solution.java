package com.cjy.code4;

/**
 * @Author cjy
 * @Date 2024/4/9 18:57
 * @Version 1.0
 * @Description: 某公司门禁密码使用动态口令技术。初始密码为字符串 password，密码更新均遵循以下步骤：
 *设定一个正整数目标值 target
 *将 password 前 target 个字符按原顺序移动至字符串末尾
 *请返回更新后的密码字符串。
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(dynamicPassword("s3cur1tyC0d3", 4));
    }
    public static String dynamicPassword(String password, int target) {
        String substring1 = password.substring(0, target);
        String substring2 = password.substring(target);
        return substring2 + substring1;
    }
}
