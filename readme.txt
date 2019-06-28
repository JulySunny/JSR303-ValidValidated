@Valid和@Validated参数校验
    1.常用注解
        @NotEmpty:适用于Collection,Map,数组,String(注意不能校验String="  "的情况)
        @NotNull:适用于所有对象的非null校验,常用于Integer Long
        @NotBlank:适用于String,可以校验String="  "的情况

    注意:@NotEmpty和NotBlank不能校验Integer,Long等基本类型

    2.校验失败时的异常抛出问题
        方法一:添加 Controller的入参BindingResult 对象
                通过BindingResult.getFieldError().getDefaultMessage() 获取异常信息
        方法二:不添加 Controller的入参BindingResult 对象
                不添加如果校验失败会抛出异常BindingException.可以添加全局异常捕获同一抛出异常
