class ProblemOne{
public static void main(String[] args){
    
}
public static int lastIndexOf(int[] a, int b){
int c = -1;
for(int d = 0; d <= a.length - 1; d++){
if(a[d] == b){
    c = d;
}
}
return c;
}
}