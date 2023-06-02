package me.sxy.demo1.tryJdkProxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

class ProxyTest {
    @Test
    public void test() {
        Object target = new PersonServiceImpl();
        MyTransaction myTransaction = new MyTransaction();
        PersonServiceInterceptor interceptor = new PersonServiceInterceptor(target, myTransaction);
        PersonService personService = (PersonService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), interceptor);
        String returnValue = (String) personService.savePerson("sxy", 31);
        System.out.println(returnValue);
    }
}