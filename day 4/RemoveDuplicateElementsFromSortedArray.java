public class Solution {
    public int removeDuplicates(int[] A) {
      if(A.length<=1) return A.length;
      int i=1;
      for (int j=1; j<A.length; j++){
          if(A[j]>A[i-1]){
              A[i]=A[j];
              i++;
          }
      }
      return i;
    }
}
