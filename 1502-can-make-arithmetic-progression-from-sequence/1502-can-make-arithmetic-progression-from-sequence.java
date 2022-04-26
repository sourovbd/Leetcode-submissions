class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        for(int j=1;j<arr.length;j++)
            {
            if(d!=arr[j]-arr[j-1])
                return false;
            
            
            }
        return true;
    }
}