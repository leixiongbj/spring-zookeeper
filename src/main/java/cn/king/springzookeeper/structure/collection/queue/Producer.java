package cn.king.springzookeeper.structure.collection.queue;

import java.util.concurrent.BlockingQueue;

/**
 * @Author: xionglei
 * @Date: 2018/12/21 20:10
 */
public class Producer implements Runnable{

    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        for (;;){
            try {
                queue.put(1);
                System.out.println("生产一个" + System.currentTimeMillis());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
