class LRUCache {
    private int capacity;
    private Map<Integer, Integer> map = new HashMap<>();
    private Deque<Integer> keys = new ArrayDeque<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        int value = map.getOrDefault(key, -1);
        
        if (value != -1) {
            dragKey(key);
        }
        
        return value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            update(key, value);
        }
        else {
            add(key, value);
        }
    }
    
    private void update(int key, int value) {
        map.put(key, value);
        dragKey(key);
    }
    
    private void add(int key, int value) {
        if (keys.size() >= capacity) {
            map.remove(keys.poll());
        }
        
        keys.add(key);
        map.put(key, value);
    }
    
    private void dragKey(int key) {
        keys.removeFirstOccurrence(key);
        keys.add(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */