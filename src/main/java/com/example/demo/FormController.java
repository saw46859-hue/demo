package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 声明这是一个控制器，且返回普通字符串/JSON数据
public class FormController {

    // 接收 POST 请求，路径对应表单里的 action="/submit"
    @PostMapping("/submit")
    public String handleFormSubmit(UserForm userForm) {
        // 1. 在服务器后台（IDEA 控制台）打印出接收到的表单数据
        System.out.println("========== 收到新的表单提交数据 ==========");
        System.out.println(userForm);
        System.out.println("========================================");

        // 2. 给浏览器前端返回一句话，提示提交成功
        return "提交成功！数据已打印在后台控制台。";
    }
}