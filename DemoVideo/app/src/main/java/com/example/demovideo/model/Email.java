package com.example.demovideo.model;

public class Email {

    String nameEmail, time, titleContent, content;
    String titleImage;
    boolean check;

    public String getNameEmail() {
        return nameEmail;
    }

    public String getTitleContent() {
        return titleContent;
    }

    public void setTitleContent(String titleContent) {
        this.titleContent = titleContent;
    }

    public void setNameEmail(String nameEmail) {
        this.nameEmail = nameEmail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Email(String titleImage,String nameEmail, String time, String titleContent, String content) {
        this.titleImage = titleImage;
        this.nameEmail = nameEmail;
        this.time = time;
        this.titleContent = titleContent;
        this.content = content;
        this.check = false;
    }
}
