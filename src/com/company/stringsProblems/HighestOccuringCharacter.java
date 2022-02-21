package com.company.stringsProblems;

public class HighestOccuringCharacter {

    public static char highestOccuringCharacter(String str){

        char ans = '\0';

        if (str.length() ==0){
            return ans;
        }

        int freq[] = new int[256];
        for (int i=0;i<str.length();i++){
            for (int j=0;j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)){
                    freq[str.charAt(i)]++;
                }
            }
        }
        int max=0;
        int index = 0;
        for (int i=0; i<freq.length;i++){
            if (max<freq[i]) {
                max = Integer.max(max, freq[i]);
                index=i;
            }
        }


        return (char) index;
    }

    public static void main(String[] args) {
        System.out.println(highestOccuringCharacter("abdefgbabfba"));
    }
}
