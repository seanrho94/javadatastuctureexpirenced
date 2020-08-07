package com.practise.thread;

import java.util.concurrent.*;

public class MutipleFileReadParallel {
    public static void main(String[] args) {

        ScheduledExecutorService sed=Executors.newScheduledThreadPool(8);
        sed.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() +"Kerbe reneawl");
            }
        },0,1, TimeUnit.SECONDS);


        ScheduledExecutorService sed1=Executors.newScheduledThreadPool(8);
        sed.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() +"Kerberos reneawl after evrey 2 sec");
            }
        },0,3, TimeUnit.SECONDS);

    }
}
