package com.company.recursion2;

public class PrintSubsetsofArray {
        public static void printSubsets(int input[],String outputsofar,int si) {
            if(si==input.length){
                System.out.println(outputsofar);
                return;

            }
            printSubsets(input,outputsofar,si+1);
            printSubsets(input,outputsofar + input[si] + " ",si + 1);
        }
        public static void printSubsets(int input[]) {
            // Write your code here

            printSubsets(input,"",0);

        }
    }

    class runner {

//        public static int[] takeInput() {
//            Scanner s = new Scanner(System.in);
//            int size = s.nextInt();
//            int arr[] = new int[size];
//            for (int i = 0; i < size; i++) {
//                arr[i] = s.nextInt();
//            }
//            return arr;
//        }

        public static void main(String[] args) {
            int[] input = {15,20,12};
            PrintSubsetsofArray.printSubsets(input);
        }
    }


