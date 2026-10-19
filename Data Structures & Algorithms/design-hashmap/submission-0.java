class MyHashMap {
    
    private int[] storage;

    public MyHashMap() {
        storage = new int[1000001];
        Arrays.fill(storage, -1);
    }
    
    public void put(int key, int value) {
        storage[key] = value; 
    }
    
    public int get(int key) {
        return storage[key]; 
    }
    public void remove(int key) {
        storage[key] = -1; 
    }
}