package lesson3;

public class Homework {
    static int a = 111;
    static int b = 14;
    static int c = 25;
    static int d = 4;
    public static void main(String[] args) {
      if(compare(a,b)>compare(c,d))
          System.out.println(compare(a,b));
      else System.out.println(compare(c,d));
      int count = 1;
        int[] sameNumbers = {1,2,2,3,2};
        int actualNumber = sameNumbers[0];

        for (int i = 0; i <sameNumbers.length ; i++) {

            if (sameNumbers[i]==actualNumber)
                count++;
            else actualNumber = sameNumbers[i];
        }
        System.out.println(count);

    }
    public static int compare(int a, int b){
     if(a>b)
         return a;
     else return b;
    }
}
