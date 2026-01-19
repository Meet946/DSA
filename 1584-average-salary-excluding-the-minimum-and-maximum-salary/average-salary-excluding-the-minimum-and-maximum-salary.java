class Solution {
      public double average(int[] salary) {
       int max = 0;
       int min = 100000000;
       double avg = 0;

       for (int i = 0; i < salary.length; i++){
            // to find max
           if(salary[i] > max){
               max = salary[i];
           }
           // to find min 
           if(salary[i] < min){
               min = salary[i];
           }
           avg += salary[i];
       }
        // calculate average
       avg = (avg - min - max) / (salary.length - 2);
       return avg;
   }
}