class TimeMap {
    HashMap<String, List<Pair>> hashMap;

    public TimeMap() { 
        hashMap = new HashMap<>();
    } 

    public void set(String key, String value, int timestamp) {
        hashMap.putIfAbsent(key, new ArrayList<>());
        hashMap.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!hashMap.containsKey(key))
            return "";

        List<Pair> temp = hashMap.get(key);

        int low = 0;
        int high = temp.size() - 1;
        String ans = "";
        while(low <= high)
        {
            int mid = (high + low)/2;
            if(temp.get(mid).time == timestamp)
            {
                return temp.get(mid).value;
            }
            else if(temp.get(mid).time > timestamp)
            {
                high = mid - 1;
            }
            else
            {
                ans = temp.get(mid).value;
                low = mid + 1;
            }
        }
        return ans;
    }
}

class Pair{
    String value;
    int time;

    Pair(String value, int time)
    {
        this.value = value;
        this.time = time;
    }
}
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */