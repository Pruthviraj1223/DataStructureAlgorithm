class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        
        Map<Integer,Integer> map = new HashMap();
        int[] result = new int[2];
        
        
        for(int i=0;i<nums.length;i++){

            
            if(map.containsKey(target - nums[i])){
                
                result[0] = i;                      // result[1]
                result[1] = map.get(target - nums[i]); // result[0]
                
                return result;
                
                
                
            }
            
            map.put(nums[i],i);

        }
        
        return result;
    
        
//         Arrays.sort(nums);
        
//         int start = 0;
//         int end = nums.length - 1;
//         int[] result = new int[2];
        
//         while(start<end){

//             int sum = nums[start] + nums[end];
            
//             if(sum==target){
            
                
//                 result[0] = start;
//                 result[1] = end;
             
//                 return result;
//             }else if(sum>target){

            
//             end--;
            
            
//             }else{
                
                
//                 start++;
                    
//             }
        
//         }
        
//         return result;

    
    }    
    
}