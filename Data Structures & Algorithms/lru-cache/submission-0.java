class LRUCache {

   
    class Node{
        Node prev;
        Node next;
        int key;
        int value;

        public Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }
    int capacity;
    HashMap<Integer, Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        //dummy nodes
        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        Node node = map.get(key);
        remove(node);
        insertFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
            remove(map.get(key));
        
        Node node = new Node(key, value);
        map.put(key, node);
        insertFront(node);

        //if Cache size is max
        if(map.size() > capacity)
        {
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }

    public void remove(Node node)
    {
        Node previous = node.prev;
        previous.next = node.next;
        node.next.prev = previous;
    }

    public void insertFront(Node node)
    {
        Node first = head.next;
        node.next = first;
        first.prev = node;
        head.next = node;
        node.prev = head;
    }
    
}
