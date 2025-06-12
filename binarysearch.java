public class binarysearch {
  public static void main(String[] args) {
    int[] arr={2,3,-12,1,0,4,15,16,18,22,24};
    int target=18;
    int ans=binarySearch(arr,target);
    System.out.println(ans);
    
  }
  //return the index
  //return -1 if it doesnt exist
  static int binarySearch(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    while (start<=end){
      //find mid ele
      //int mid= (start+end)/2;  //might be possible that start+end exceeds the range pf int in java..so it may lead to error
      int mid= start+(end-start)/2;
      if (target<arr[mid]){
        end=mid-1;

      }else if (target>arr[mid]){
        start=mid+1;
      }else{
        return mid;
      }
    }
    return -1;

  }
  
}
