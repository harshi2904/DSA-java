public class orderagnostic {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7};
    int target=7;
    int result=agnosticsearch(arr,target);
    System.out.println(result);
  }
  static int agnosticsearch(int[] arr,int target){
    int start=0;
    int end=arr.length -1;
    boolean isASC=arr[start]<arr[end];
    while (start<=end){
      int mid=start+(end-start)/2;
      if (arr[mid]==target){
        return mid;

      }
      if (isASC){
        if (target<arr[mid]){
          end=mid-1;
        }else{
          start=mid+1;
        }



      }else{
        if(target>arr[mid]){
          end=mid-1;
        }else{
          start=mid+1;
        }
      }


    }
    return -1;

  }
  
}
