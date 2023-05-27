class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        System.out.println(c.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public int maxAreaBruteForce(int[] height) {
        int maxArea = 0;
        for (int i=0; i<height.length; i++) {
            for (int j=i+1; j<height.length; j++) {
                int area = (j-i) * Math.min(height[i], height[j]);
                if (maxArea < area) maxArea = area;
            }
        }
        return maxArea;
    }


    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length-1;
        int maxArea = 0;
        while (p1 <= p2) {
            int area = (p2-p1) * Math.min(height[p1], height[p2]); 
            if (maxArea < area) maxArea = area;

            if (height[p1] < height[p2])
                p1++;
            else 
                p2--;
        }
        return maxArea;
    }

}