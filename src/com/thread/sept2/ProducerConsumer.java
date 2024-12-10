package com.thread.sept2;
class Buffer{
    private final int[] buffer;
    private final int size;
    private int count;

    public Buffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.count = 0;
    }
    public synchronized  void produce(int items) throws InterruptedException{
        while (count==size){
            wait();
        }
        buffer[count] = items;
        count++;
        System.out.println("Produced : "+items);

        notify();
    }

    public synchronized  int consume() throws InterruptedException{
        while (count==0){
            wait();
        }
        int item = buffer[count-1];
        count--;

        System.out.println("Consumed : "+item);

        notify();

        return item;
    }

}
class  Producer implements Runnable{
    private final Buffer buffer;

    public  Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try{
            for (int i =1;i<=5;i++){
                buffer.produce(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class Consumer implements Runnable{
    private final Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer= buffer;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                int item = buffer.consume();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10);
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();

        for (int i =0;i<10;i++){
            System.out.println("Main thread also running");
        }
    }
}
