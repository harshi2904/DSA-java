public class leetcodeceilingnum {
  public static void main(String[] args) {

      char[] arr={'a','c','b','f'};
      char target='z';
      char ans=nextGreatestLetter(arr,target);
      System.out.println(ans);
  }
  
  public static char nextGreatestLetter(char[] letters, char target) {
      int start=0;
      int end=letters.length-1;
      int n =letters.length;

      while(start<=end){
         int  mid=start+(end-start)/2;

          if(target<letters[mid]){
              end=mid-1;

          }else if (target >= letters[mid]){
              start = mid + 1;
      }
          
      
   }
    return start<n ?letters[start]:letters[0];
  }

    
}