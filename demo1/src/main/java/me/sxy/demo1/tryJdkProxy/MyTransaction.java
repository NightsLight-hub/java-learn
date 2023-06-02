package me.sxy.demo1.tryJdkProxy;

public class MyTransaction {
        public void beginTransaction() {
            System.out.println("begin transaction");
        }

        public void commit() {
            System.out.println("commit");
        }

        public void rollback() {
            System.out.println("rollback");
        }
}
