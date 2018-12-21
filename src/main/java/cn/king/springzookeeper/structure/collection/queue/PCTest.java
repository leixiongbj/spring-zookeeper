package cn.king.springzookeeper.structure.collection.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: xionglei
 * @Date: 2018/12/21 20:26
 */
public class PCTest {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
        new Thread(new Consumer(queue)).start();
        new Thread(new Producer(queue)).start();
    }
}
