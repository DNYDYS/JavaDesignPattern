package com.dnydys.dubboCheckedLocking;

/**
 * @Classname Singleton
 * @Description 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @Date 2021/12/25 15:22
 * @Created by hasee
 *
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class Singleton {
    //增加 volatile 关键字，禁止指令重排序：
    private static volatile Singleton instance;
    private Singleton(){

    }
    private static Singleton getInstance(){
        // 判断对象是否以及实例化过，没有则进入加锁代码块，此处可能有多个线程同时进来，等待类对象锁
        if (instance == null){
            // 获取类对象锁，其他线程在外等待，其他线程进来再次判断，如果对象实例化了，则不需要再实例化
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
