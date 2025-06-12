public class floornum {
  public static void main(String[] args) {
    int[] arr={2,3,5,9,14,16,18};
    int target=15;
    int ans=Floornum(arr,target);
    System.out.println(ans);
    
  }
  //return the index
  //return index that is greater<=target
  static int Floornum(int[] arr,int target){
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
    return end;

  }
  
}


  

