class H2O {
    Semaphore hs,os;
    public H2O() {
        hs= new Semaphore(2);
        os= new Semaphore(0);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		
        hs.acquire();
        releaseHydrogen.run();
        os.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        
        os.acquire(2);
		releaseOxygen.run();
        hs.release(2);
    }
}