package com.dnydys.staticClass;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * @Classname Singleton
 * @Description TODO
 * @Date 2021/12/25 16:02
 * @Created by hasee
 *
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 *
 * 描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * 这种方式同样利用了 classloader 机制来保证初始化 instance 时只有一个线程，
 * 饿汉模式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果）
 * 而这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用
 * 想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载
 * 另外一方面，又不希望在 Singleton 类加载时就实例化，因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，
 * 那么这个时候实例化 instance 显然是不合适的。
 * 这个时候，这种方式相比饿汉模式就显得很合理。
 */
public class Singleton {

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){

    }
    private static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
