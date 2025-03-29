class Fibonacci extends Thread {
    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}

class EvenNum extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class MultiThread {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        EvenNum e = new EvenNum();

        
        f.start();
        try {
            f.join(); 
        } 
        catch (InterruptedException ie) {
           
        }
        e.start();
    }
}
