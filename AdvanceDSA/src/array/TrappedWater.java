package array;

public class TrappedWater {

    private static int trappedWater(int[] height) {
        int trappedWater = 0;
        int [] lHeight = new int[height.length];
        lHeight[0]= height[0];
        for (int i = 1; i< height.length; i++){
            lHeight[i] = Math.max(height[i], lHeight[i-1]);
        }
//        for (int i = 0; i< lHeight.length; i++)
//           System.out.println(lHeight[i]);

        int [] rHeight = new int[height.length];
        rHeight[height.length-1]= height[height.length-1];
        for (int i =height.length-2 ; i >= 0; i--){
            rHeight[i]= Math.max(height[i], rHeight[i+1]);
        }
//        for (int i = 0; i < rHeight.length; i++)
//            System.out.println(rHeight[i]);

        for (int i =0; i < height.length; i++){
         int waterLevel = Math.min(rHeight[i], lHeight[i]);
            trappedWater +=  waterLevel - height[i];
            System.out.println(trappedWater);
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int [] height = {4,2,0,6,3,2,5};
       System.out.println(trappedWater(height));
    }


}
