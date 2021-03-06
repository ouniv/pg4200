package org.pg4200.sol02;

import org.junit.jupiter.api.Test;
import org.pg4200.les02.queue.MyQueue;
import org.pg4200.les02.queue.MyQueueTestTemplate;

import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Created by arcuri82 on 16-Aug-17.
 */
public class RingArrayQueueTest extends MyQueueTestTemplate{

    @Override
    protected <T> MyQueue<T> getNewInstance(Class<T> klass) {
        return new RingArrayQueue<>();
    }

    @Test
    public void testFailToPeekOnEmpty(){

        assertThrows(RuntimeException.class,
                () -> queue.peek());
    }
}