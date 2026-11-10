class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
            Integer[]arr=new Integer[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                arr[i]=nums[i];
            }
            Arrays.sort(arr, (a, b) -> {
    if(map.get(a) != map.get(b))
    {
        return map.get(a) - map.get(b);
    }
    return b - a;
});
int[] result = new int[nums.length];

for(int i = 0; i < arr.length; i++)
{
    result[i] = arr[i];
}

return result;
    }
}
 
    