package com.mathew.butler.user.model;

import com.mathew.butler.base.model.BaseModel;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

@Entity
public class User extends BaseModel{
    /**
     @null           验证对象是否为空
     @notnull     验证对象是否为非空
     @asserttrue       验证 boolean 对象是否为 true
     @assertfalse      验证 boolean 对象是否为 false
     @min           验证 number 和 string 对象是否大等于指定的值
     @max           验证 number 和 string 对象是否小等于指定的值
     @decimalmin    验证 number 和 string 对象是否大等于指定的值，小数存在精度
     @decimalmax    验证 number 和 string 对象是否小等于指定的值，小数存在精度
     @size           验证对象（array,collection,map,string）长度是否在给定的范围之内
     @digits       验证 number 和 string 的构成是否合法
     @past           验证 date 和 calendar 对象是否在当前时间之前
     @future       验证 date 和 calendar 对象是否在当前时间之后
     @pattern     验证 string 对象是否符合正则表达式的规则
     @Email     验证邮箱
     */

    @Pattern(regexp = "^[\\da-zA-Z\\u4E00-\\u9FA5]{1,10}$", message = "姓名只能包含字母，数字，且字母开头，总长度为10")
    private String name;

    @Pattern(regexp = "^(13[0-9])|(14[5|7])|(15[0|1|2|3|5|6|7|8|9])|(18[0|1|2|3|5|6|7|8|9])\\d{8}$", message = "手机号格式不正确")
    private String account;
    
    @Pattern(regexp = "([a-zA-Z0-9]|[_!@#$%^&*_+-=]){6,20}", message = "密码包含小写，大写，数字，且长度6-20")
    private String password;
    
    private int age;
    
    private int shopId;
    
    private int roleId;
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
//        this.password = DigestUtils.md5DigestAsHex(password.getBytes());
        this.password = password;
    }
    
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
}
