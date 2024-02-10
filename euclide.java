public class euclide {

    public static int par_soustraction(int a, int b) {
       while(a != b) {
          if(a > b) {
              a = a - b;
          } else {
              b = b - a;
          }
       };
        return a;
    };

    public static int modulo(int a, int b) {
        while(b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int par_recursivite(int a, int b) {
        return (b == 0) ?  a : par_recursivite(b, a % b);
    }

}
