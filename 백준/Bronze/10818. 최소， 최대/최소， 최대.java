import java.util.Scanner;
public class Main{
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] array = new int[n];
        int min, max;
    
        for ( int i = 0 ; i < n; i++){
            array[i] = s.nextInt();
        }

        min = max = array[0];

        for(int i = 1 ; i < n ; i++){
            if( min > array[i] )
                min = array[i];
            if( max < array[i] )
                max = array[i];
        }

        System.out.println(min);
        System.out.println(max);
    }
}