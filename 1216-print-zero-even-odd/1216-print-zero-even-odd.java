class ZeroEvenOdd {
    private int n;
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    private boolean zeroPrinted = false;
    private boolean evenPrinted = false;
    private boolean oddPrinted = false;

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i ++) {
            if (zeroPrinted) {
                wait();
            }
            if (i % 2 == 0) {
                evenPrinted = false;
                oddPrinted = true;
            } else {
                evenPrinted = true;
                oddPrinted = false;
            }
            printNumber.accept(0);
            zeroPrinted = true;
            notifyAll();
        }
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            while (evenPrinted) {
                wait();
            }
            evenPrinted = true;
            zeroPrinted = false;
            printNumber.accept(i);
            notifyAll();
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            while (oddPrinted) {
                wait();
            }
            oddPrinted = true;
            zeroPrinted = false;
            printNumber.accept(i);
            notifyAll();
        }
    }
}