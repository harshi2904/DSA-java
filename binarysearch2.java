public class binarysearch2 {
  public static void main(String[] args) {
    int[] arr={-1,-3,-4,0,2,4,6,8};
    int target=0;
    int ans=binarysearch(arr,target);
    System.out.println(ans);

    
  }
  static int binarysearch(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    while (start<=end){
      int mid=start+(end-start)/2;
      if (target<arr[mid]){
        end=mid-1;

      }else if (target>arr[mid]){
        end=mid+1;

      }else{
        return mid;

      }
    }
    return -1;

  }
  
}
