package com.ds.paypay;

public interface Queue <T> {

    public Queue<T> enQueue(T t);

    public Queue<T> deQueue() throws Exception;

    public T head();

    public boolean isEmpty();
}
