class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m= nums2.length;
        int[] arr=new int[n+m];
        System.arraycopy(nums1,0,arr,0,n);
        System.arraycopy(nums2,0,arr,n,m);
        Arrays.sort(arr);
     int len = arr.length;
     if(len%2==0){
             return (arr[len/2-1]+arr[len/2])/2.0;
       }
        else{
          
             return arr[len/2];}
        }

     }