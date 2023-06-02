package me.sxy.demo1.tryJdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonServiceInterceptor implements InvocationHandler {

        private Object target;

        private MyTransaction myTransaction;

        public PersonServiceInterceptor(Object target, MyTransaction myTransaction) {
            this.target = target;
            this.myTransaction = myTransaction;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            myTransaction.beginTransaction();
            Object result = method.invoke(target, args);
            myTransaction.commit();
            return result;
        }
}
