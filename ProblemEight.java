import java.util.Arrays;

class ProblemEight{
    public static void main(String[] args){
    int[] Values = {6, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
    System.out.println(median(Values));
}

public static int median(int[] listOfValues){
    int len = listOfValues.length;
    Arrays.sort(listOfValues);
    int There = (len%2);
    int Median = (len - There)/2;
    return listOfValues[Median];
}
}