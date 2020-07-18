/******************************************************************************
VINAYAKA MUDRADI

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> result = new ArrayList<String>();
        if(s.length()>k){
            char arr[] = s.toCharArray();
           
            for(int i=0; i<s.length()-1; i++){
                if(i+k<=s.length()){
                    result.add(s.substring(i, i+k));
                }
            }
            Collections.sort(result);
        }
        smallest = result.get(0);
        largest = result.get(result.size()-1);
        return smallest + "\n" + largest;
        // for(int j=0; j<result.size(); j++){
        //     System.out.println(result.get(j));
        // }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        // getSmallestAndLargest(s, k);
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}


