package com.os.control.runnable;

public class CustomRunnable implements Runnable {

    private final CustomThreadCallback callback;
    private int total;
    private int current;
    private boolean running;

    public CustomRunnable(int total, CustomThreadCallback callback) {
        this.total = total;
        this.callback = callback;
        this.current = 0;
        this.running = false;

    }

    @Override
    public void run() {

        callback.threadStart();
        while (current <= total) {
            if (isRunning()) {
                try {
                    callback.threadWork();// isRunning == true 
                    current++;

                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
        callback.threadEnd();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean isRunning() {
        return running;
    }

    public void startRunning() {
        this.running = true;
    }

    public void stopRunning() {
        this.running = false;
    }

    public CustomThreadCallback getCallback() {
        return callback;
    }

}
