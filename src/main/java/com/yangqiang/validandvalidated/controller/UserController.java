package com.yangqiang.validandvalidated.controller;

import com.yangqiang.validandvalidated.entity.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**@Author: 杨强
 * @Date: 2019/6/28 10:18
 * @Version 1.0
 */
@RestController
public class UserController {


    @GetMapping("/valid")
    public String testValid(@Validated User user){
        return "success";
    }


}
