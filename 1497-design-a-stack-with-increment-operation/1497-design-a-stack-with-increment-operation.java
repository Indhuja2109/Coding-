class CustomStack {
    private int stck[] = null;
    private int currSize = 0, maxSize = 0;
    public CustomStack(int maxSize) {
        stck = new int[maxSize];
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(currSize < maxSize){
            stck[currSize++] = x;
        }
    }
    
    public int pop() {
        if(currSize == 0)return -1;
        else{
            int item = stck[currSize-1];
            if(currSize > 0)currSize--;
            return item;
        }
    }
    
    public void increment(int k, int val) {
        int indx = 0;
        while(k-->0 && indx < currSize){
          stck[indx++] += val;
        }
    }
}