public class optimizedContainerWithmostwater {
    // using two pointers approach

    public static int storeWater(ArrayList<Integer> height)
    {
        int maxWater=0;
        int lp=0;
        int ep=height.size()-1;

        while(lp<ep)
        {
            int ht=Math.min(height.get(lp),height.get(ep));
            int width= ep-lp;
            int currWater= ht*width;
            maxWater=Math.max(maxWater,currWater);
            
        }
        if(height.get(lp)<height.get(ep))
        {
            lp++;
        }
        else{
            ep--;
        }
    }

    public static void main(String args[])
    {
        ArrayList <Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(
            storeWater(height));
    }
}
