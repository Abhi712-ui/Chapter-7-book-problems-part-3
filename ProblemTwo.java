class ProblemTwo{
    public static void main(String[] args){
    int[] beans = {36, 12, 25, 19, 46, 31, 22};
        System.out.println(range(beans));
}
public static int range(int[] arr){
    int Max = getMax(arr);
    int Min = getMin(arr);
    return Max - Min + 1;
}
public static int getMax(int[] arr){
    int maxValue = arr[0]; 
    for(int i=0;i < arr.length-1;i++){ 
      if(arr[i] > maxValue){ 
         maxValue = arr[i]; 
      } 
    } 
    return maxValue; 
  }

  public static int getMin(int[] arr){
    int minValue = arr[0]; 
    for(int i=0;i<arr.length-1;i++){ 
      if(arr[i] < minValue){ 
        minValue = arr[i]; 
      } 
    } 
    return minValue; 
  }
}
