package leetcode;

public class MaximumWater {
    public int maximumWater(int[] height){
        int maxArea =0;
        int left =0;
        int right= height.length -1;
        while(left< right){
            int area = Math.max(height[left], height[right])*(right-left);
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
