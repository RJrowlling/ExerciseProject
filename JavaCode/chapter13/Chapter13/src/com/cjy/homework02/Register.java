package com.cjy.homework02;

/**
 * @author cjy
 * @version 1.0
 */
public class Register {
    private String username;
    private String password;
    private String email;

    public Register(String username, String password, String email) {
        if (!(username.length()==2 || username.length()==3 ||username.length()==4)) {
            throw new UsernameException("你输入的用户名长度应为2或3或5");
        }
        if (!(password.length() == 6 && password.matches("^[0-9]*$"))) {
            throw new PasswordException("你输入的密码长度应为6位，并且全是数字");
        }
        if (!(email.indexOf('@') >=0 && email.indexOf('@') < email.indexOf('.'))) {
            throw new EmailException("你输入的邮箱应包含@和.，并且@在.的前面");
        }
        this.username = username;
        this.password = password;
        this.email = email;
        System.out.println("注册成功！");
    }

    public void show() {
        System.out.println("用户名：" + username);
        System.out.println("邮 箱：" + email);
    }
}
