package org.example.jacoco.time;

public class TimeService {

    static {
        if (System.currentTimeMillis() % 2 == 0) {
            System.out.println("Even time");
        } else {
            System.out.println("Odd time");
        }
    }

    public void doSomething() {
        System.out.println("Doing something");
    }

}
