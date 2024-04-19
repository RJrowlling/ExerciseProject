package com.cjy.homework01;

/**
 * @author cjy
 * @version 1.0
 */
public class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        String temp = title;
        if (title.length() > 15) {
            temp = title.substring(0,15) + "...";
        }
        return "News{" +
                "title='" + temp + '\'' +
                '}';
    }
}
