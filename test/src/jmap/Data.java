package jmap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Data {
    String name = "Hello world";

    static List<Connect> testJMaps = new ArrayList<>();

    public void getData() throws InterruptedException {
        for(int i =0;i<10000000;i++){
            Thread thread = new Thread("thread" +i){
                public void run(){
                    Connect test = new Connect();
                    testJMaps.add(test);
                    System.out.println("size list :"+testJMaps.size());
                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
        }
    }
}
