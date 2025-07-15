package demo;

import java.util.ArrayList;

public class test1 {

    public static void printPermutation(ArrayList<Integer> permutation){
        for(int i=0; i<permutation.size();i++){
            System.out.print(permutation.get(i)+" ");
        }
        System.out.println();
    }

    public static void findPer(int start , int n , ArrayList<Integer> permutation){

        if(start> n ){
            printPermutation(permutation);
            return;
        }
        permutation.add(start);
        findPer(start+1, n, permutation);

        permutation.remove(permutation.size()-1);
        findPer(start+1, n, permutation);
    }
    public static void main(String []args){

        ArrayList<Integer> permutation = new ArrayList<>();
        int n = 3 ;
        int start = 1;
        findPer(start,n,permutation);

    }
}