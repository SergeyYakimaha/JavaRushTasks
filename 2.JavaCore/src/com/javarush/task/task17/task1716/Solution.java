package com.javarush.task.task17.task1716;

/* 
Синхронизированные методы
*/

public class Solution implements Runnable {
    @Override
    public void run() {
            Thread cur = Thread.currentThread();
            while (!cur.isInterrupted())
                System.out.println(cur.getName());
    }

    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private void method0() {
        Double d = method3();
    }

    protected void method1(String param1) {
        Solution solution = new Solution();
        solution.method0();
    }

    public void method2(int param1) {
        param1++;
    }

    synchronized double method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private synchronized void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    synchronized public String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    String method7(double param2) {
        return "" + param2;
    }

    public static void main(String[] args) throws InterruptedException {
        Solution s1 = new Solution();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        t1.start();
        t2.start();
        Thread.sleep(50);

        t1.interrupt();
        t2.interrupt();
    }

}
