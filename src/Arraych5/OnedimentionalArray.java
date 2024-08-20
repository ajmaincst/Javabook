package Arraych5;

class OnedimentionalArray {
     public static void main(String[] args) {
         int[] numbers = {6,4,76,6,34,67,86,98};
         int sum =0;
         for (int num : numbers){
             sum += numbers[num];
         }
         double average = (double) sum/numbers.length;
         System.out.println("Sum="+sum);
         System.out.println("Average="+average);
     }
}
