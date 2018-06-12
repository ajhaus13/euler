public class Lesson2 {



    public static void main(String[] args){

        int first = 0;
        int second = 1;
        int fib = first + second;
        int sum = 0;
        while (fib < 4000000) {
            first = second;
            second = fib;
            fib = first + second;
            if(fib % 2 == 0){
                sum += fib;
            }
        }
System.out.println(sum);
    }
}
