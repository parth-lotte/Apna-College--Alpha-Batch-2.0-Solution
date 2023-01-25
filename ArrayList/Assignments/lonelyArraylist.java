import java.util.HashMap;
import java.util.*;
public class lonelyArraylist {
    public List<Integer> findLonely(int [] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: nums)
        {
            map.put(ele,map.getOrDefault(ele, 0)+1);
        } 

        ArrayList<Integer> arr= new ArrayList<>();
        for(int ele: nums)
        {
            if(map.get(ele)>1 || map.containsKey(ele-1)||map.containsKey(ele+1))
            {
                continue;
            }
            arr.add(ele);
        }
        return arr;
    }



    
}
