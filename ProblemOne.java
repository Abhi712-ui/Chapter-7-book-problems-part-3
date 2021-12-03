class ProblemOne{
public static void main(String[] args){
    int[] d = {74, 85, 102, 99, 101, 85, 56};
    int a = lastIndexOf(d, 85);
    System.out.print(a);
}
public static int lastIndexOf(int[] a, int b){
    int c = -1; 
    for(int i = 0; i <= a.length-1; i++){
        if(a[i] == b){
            c = i;
        }
    }
    return c;
}
}