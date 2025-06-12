public class ceilingnumBS {
  public static void main(String[] args) {
    int[] arr={2,3,5,9,14,16,18};
    int target=16;
    int ans=ceilingnum(arr,target);
    System.out.println(ans);
    
  }
  //return the index
  ////return index that is smallest>=target
  static int ceilingnum(int[] arr,int target){
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
    return start;

  }
  
}


  

