import java.util.Arrays;
class ProblemFive{
    public static void main(String[] args){
        int[] u = {27, 15, 15, 11, 27};
    System.out.println(Mode(u));
}
public static int Mode(int[] arr){
    int[] arrUniques = Arrays.stream(arr).distinct().toArray();
    int f = 0;
    for(int a : arrUniques){
        f++;
    }
    int[] bars = new int[f];
    for(int i = 0; i <= f - 1; i++){
        int z = 0;
        for(int v : arr){
            if(v == arrUniques[i]){
                z++;
            }
        }
        bars[i] = z;
    }
    int[] z = new int[bars.length];
    int h =  getMax(bars);
    for(int n = 0; n <= bars.length - 1; n++){
        if(h == bars[n]){
            z[n] =  arrUniques[n];
        }
    }
    return getMin(z);
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