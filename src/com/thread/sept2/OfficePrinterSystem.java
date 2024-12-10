package com.thread.sept2;
class Printer{
    private boolean isPrinting = false;

    public synchronized void printDocument(String name) throws InterruptedException {
        while (isPrinting){
            System.out.println(name+" is waiting for the printer...");
            wait();
        }
        isPrinting = true;
        System.out.println(name+"  is printing a document...");
        Thread.sleep(2000);
        isPrinting=false;
        System.out.println(name+" has finished printing");
        System.out.println();
        notifyAll();
    }
}
public class OfficePrinterSystem {
    public static void main(String[] args) {
        Printer p  = new Printer();
        Runnable r = ()->{
          try{
              p.printDocument("Vishal");
          }catch (InterruptedException i){
              i.printStackTrace();
          }
        };

        Runnable r1 = ()->{
            try{
                p.printDocument("Ankush");
            }catch (InterruptedException i){
                i.printStackTrace();
            }
        };

        Runnable r2 = ()->{
            try{
                p.printDocument("Ajit");
            }catch (InterruptedException i){
                i.printStackTrace();
            }
        };

        Runnable r3 = ()->{
            try{
                p.printDocument("Bhupesh");
            }catch (InterruptedException i){
                i.printStackTrace();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r2);
        Thread t4 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
