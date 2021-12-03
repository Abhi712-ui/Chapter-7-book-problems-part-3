class ProblemFour{
    public static void main(String[] args){
        int[] g = {10, 11, 12, 13, 14, 15};
    System.out.println(isSorted(g));
}
public static boolean isSorted(int[] arr){
    if(arr.length == 1){
        return true;
    }
    else{
    for(int i = 1; i <= arr.length - 2; i++){
        if(!(arr[i] >= arr[i-1] && arr[i] <= arr[i+1])){
           return false;
        }
    }
}
    return true;
}
}