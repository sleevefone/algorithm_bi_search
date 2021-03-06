package com.algorithm.$2_java8;

import org.junit.jupiter.api.Test;

public class ProxyTest {
  
    @Test
    public void testProxy() throws Throwable {  
        // 实例化目标对象  
        UserService userService = new UserServiceImpl();  
          
        // 实例化InvocationHandler  
        JDK_proxy_demo invocationHandler = new JDK_proxy_demo(userService);
          
        // 根据目标对象生成代理对象  
        UserService proxy = (UserService) invocationHandler.getProxy();  
          
        // 调用代理对象的方法  
        proxy.add();  
          
    }  
} 