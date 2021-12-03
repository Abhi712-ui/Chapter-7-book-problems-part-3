class ProblemThree{
    public static void main(String[] args){
    int[] x = {14, 1, 22, 17, 36, 7, -43, 5};
    System.out.println(countInRange(x, 4, 17));
}

public static int countInRange(int[] vals, int min, int max){
    int a = 0;
    for(int b: vals){
        if(b >= min && b <= max){
            a++;
        }
    }
    return a;
}
}