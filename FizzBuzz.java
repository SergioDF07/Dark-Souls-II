public class FizzBuzz {
    public static void main(String[] args) {
        String multiplo3 = "Fizz";
        String multiplo5 = "Buzz";
        String multiploAmbos = "FizzBuzz";
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(multiplo3);
            } else if(i % 3 != 0 && i % 5 == 0) {
                System.out.println(multiplo5);
            } else if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(multiploAmbos);
            } else {
                System.out.println(i);
            }
            }
        }
    }