package com.yangqiang.validandvalidated.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Author: 杨强
 * @Date: 2019/6/28 10:16
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull(message = "id不能为空")
    private Long id;
    @NotEmpty(message = "姓名不能为空 ")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
    /*添加字段*/
    private String  add;
}
