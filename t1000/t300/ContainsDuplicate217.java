package com.lemonade.leetcode.t1000.t300;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Map map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i], 1);
            }
        }

        return false;
    }
}
