class Solution {
    Map<Integer, Integer> frequency = new HashMap<>();
    public int[] topKFrequent(int[] nums, int k) {
        
        for(int i = 0 ; i < nums.length; i++){
            Integer curr = frequency.get(nums[i]);
            if(curr != null){
                frequency.put(nums[i]  , ++curr);
            } else {
                frequency.put(nums[i]  , 1);
            }
        }
        
    PriorityQueue<Map.Entry<Integer,
                                Integer>> heap = new PriorityQueue<>(
                 (a, b)
                -> a.getValue().equals(b.getValue())
                   ? Integer.compare(b.getKey(),
                                     a.getKey())
                   : Integer.compare(b.getValue(),
                                     a.getValue()));
    
    for(Map.Entry entry : frequency.entrySet()){
        heap.add(entry);
    }
        
     int[] finalArr = new int[k];   
     for (int i = 0; i < k; i++)
     {
         finalArr[i] = heap.poll().getKey();
         System.out.println(finalArr[i]);
     }
        return finalArr;
}
}

