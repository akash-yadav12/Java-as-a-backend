import java.lang.*;
class FirstThread extends Thread {
    public void run() {
        for(int i=1; i<=10; i++) {
            try {
                if(i == 3) {
                    sleep(4000);
                }
            }
            catch(Exception x){ }
            System.out.println("First " +i*5);
        }
        System.out.println(" First Thread Finished ");
    }
}
class SecondThread extends Thread {
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println("Second " +7*i);
        }
        System.out.println(" Second Thread Finished ");
    }
}
class ThirdThread extends Thread {
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println("Third " +i*13);
        }
        System.out.println(" Third Thread Finished ");
    }
}
class MultiThreading {
    public static void main(String arg[]) {
        FirstThread a1 = new FirstThread();
        SecondThread b1 = new SecondThread();
        ThirdThread c1 = new ThirdThread();
        a1.start();
        b1.start();
        c1.start();
    }
}

