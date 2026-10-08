package com.example.demo;

import java.util.List;

public class UserForm {
    private String username;
    private String password;
    private String email;
    private String phone;
    private Integer age;
    private String gender;           // radio 单选
    private List<String> hobbies;    // checkbox 多选
    private String city;             // select 下拉框
    private String birthday;         // date 日期
    private String bio;              // textarea 文本域

    // Getter 和 Setter
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public List<String> getHobbies() { return hobbies; }
    public void setHobbies(List<String> hobbies) { this.hobbies = hobbies; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }

    @Override
    public String toString() {
        return "UserForm {" +
                "\n  用户名 = '" + username + '\'' +
                ",\n  密码 = '" + password + '\'' +
                ",\n  邮箱 = '" + email + '\'' +
                ",\n  手机号 = '" + phone + '\'' +
                ",\n  年龄 = " + age +
                ",\n  性别 = '" + gender + '\'' +
                ",\n  爱好 = " + hobbies +
                ",\n  城市 = '" + city + '\'' +
                ",\n  生日 = '" + birthday + '\'' +
                ",\n  个人简介 = '" + bio + '\'' +
                "\n}";
    }
}