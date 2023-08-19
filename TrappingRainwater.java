public class TrappingRainwater {
    public static int TrappingRainwater(int height[]){
        // left max boundary - array
        int leftMax[]=new int[height.length];
        leftMax[0]= height[0];
        for (int i = 1;i<leftMax.length;i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
            
        }
        int rightMax[]=new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for (int j =rightMax.length-2 ;j>=0;j--){
            rightMax[j]=Math.max(height[j],rightMax[j+1]);
        }
        int trap=0;
        //loop
        for (int i= 0 ;i< (height.length);i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trap +=waterlevel-height[i];
        }
        return trap;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("The trapped rainwater is "+TrappingRainwater(height));
    }
}
