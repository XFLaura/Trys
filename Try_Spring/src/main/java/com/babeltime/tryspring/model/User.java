package com.babeltime.tryspring.model;




import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User {

    /*
    @NotEmpty(message="姓名不能为空")
    private String name;

    @Max(value=100,message="年龄不能大于100岁")
    @Min(value=18,message="必须年满18岁")
    private int age;
    @NotEmpty(message="密码不能为空")
    @Length(min=6,message="密码长度不能小于6位")
    private String pass;
    //setter、getter
*/
    private Long id;
    private String name;
    private String password;
    private int age;

    public User(String name,String password,int age){
        this.name = name;
        this.password = password;
        this.age = age;

    }

    public  User(){

    }

    public Long getId(){
        return id;
    }
}
