class ProblemTen{
    public static void main(String[] args){
    int[] p = {2, 2, 2, 5, 7, 6, 5};
    System.out.println(percentEven(p));
}

public static double percentEven(int[] vals){
    int even = 0;
    for(int i = 0; i < vals.length; i++){
        if(vals[i] % 2 == 0){
        even++;
        }
    }  
  double percent = (even / vals.length) *100;
  return percent;
}
}