package com.mathew.butler.user.loginenum;

public enum LoginEnum {
    NAME("姓名只能包含字母，数字，且字母开头，总长度为10"),
    ACCOUNT("手机号格式不正确"),
    PASSWORD("密码必须包含一个小写，大写，数字，且总长度为8");
    private String message;
    
    LoginEnum(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
}
