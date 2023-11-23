public class recursion {
  public static void main(String[] args) {
    int base = 2;
    int exponent = 3;
    int result = power(base, exponent);
    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
   }

    //implement your case algorithm
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } 
        else {
            return x * power(x, n - 1);
        }
    }
    }
  

    
