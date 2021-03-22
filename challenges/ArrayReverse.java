public class ArrayReverse{


public static void main (String[] args) {
   int [] j = new int[]{1,2,3,4,5};
// System.out.println(reverseArray(j));
reverseArray(j);

}



public static int[] reverseArray (int[] inputArray){
  int [] outputArray = new int [inputArray.length];
  int backCounter = inputArray.length-1;
for (int i = 0; i <= inputArray.length-1 ; i++){
  outputArray[i] = inputArray[backCounter-i];
  System.out.println(outputArray[i]);
}
return outputArray;
}
}