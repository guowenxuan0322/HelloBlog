package net.evercodig.helloblog.common;

public enum UserState {
    Success("成功"),
    Fail("失败");
    private String name;

    UserState (String name){
        this.name = name;
    }
}
