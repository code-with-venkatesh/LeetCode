class LRUCache {

    private int capacity;
    private Map<Integer, LinkedListNode> cache;
    private LinkedList<LinkedListNode> lruList;

    private class LinkedListNode {
        int key;
        int value;

        LinkedListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        lruList = new LinkedList<>();
    }

    public int get(int key) {

        if (!cache.containsKey(key))
            return -1;

        LinkedListNode node = cache.get(key);

        lruList.remove(node);
        lruList.addFirst(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (cache.containsKey(key)) {

            LinkedListNode node = cache.get(key);

            lruList.remove(node);
            node.value = value;
            lruList.addFirst(node);

        } else {

            if (cache.size() >= capacity) {

                LinkedListNode last = lruList.removeLast();

                cache.remove(last.key);
            }

            LinkedListNode node = new LinkedListNode(key, value);

            lruList.addFirst(node);

            cache.put(key, node);
        }
    }
}