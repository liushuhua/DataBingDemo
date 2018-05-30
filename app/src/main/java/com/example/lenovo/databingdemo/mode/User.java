package com.example.lenovo.databingdemo.mode;

/**
 * Created by LSH on 2018/5/30.
 * description：
 */
public class User {
    private String name;

    public User(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    private String passWord;
}
