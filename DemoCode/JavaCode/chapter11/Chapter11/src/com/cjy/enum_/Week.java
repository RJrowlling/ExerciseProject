package com.cjy.enum_;

/**
 * @author cjy
 * @version 1.0
 */
public enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");

    private String name;

    Week(String name) {
        this.name = name;
    }
}
