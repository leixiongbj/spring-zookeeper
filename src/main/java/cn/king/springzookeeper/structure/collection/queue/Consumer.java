package cn.king.springzookeeper.structure.collection.queue;

import java.util.concurrent.BlockingQueue;

/**
 * @Author: xionglei
 * @Date: 2018/12/21 20:25
 */
public class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (;;){
            try {
                Integer i = queue.take();
                System.out.println("消费一个:" + i + "---" + System.currentTimeMillis());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
