package net.evercodig.helloblog.common;

public enum LoginState {
    Succed("登录成功"),
    Fail("登录失败"),
    Error("用户名错误");
    private String name;

    LoginState(String name){
        this.name = name;
    }
}
