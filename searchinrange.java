public class searchinrange {
  public static void main(String[] args) {
    int[] arr={23,45,6,7,5,122,-3,16,-11};
    int target=4;
    System.out.println(linearsearch(arr,target,1,4));
    
    
  }
  //search in the array:return index if item found
  //otherwise if item not found return -1
  static int linearsearch(int[] arr,int target,int start,int end){
    if (arr.length==0){
      return -1;
    }
    //run a for loop
    for (int index=start;index<=end;index++){
      //check for element at every index
      int element=arr[index];

      if (element==target){
        return index;
      }
    }
    //this line qill execute if none of the return statements above have executed
    return -1;

  }
  
}

