public class MyMath{

    public long factorial(int n){
        if( n == 0 )
            return 1;

        long factorial = 1;
        for(int i = n ; i > 0; i--)
            factorial *= i;
          return factorial;
    }


    public long fibonacci(int n){
        int n0=0 ,n1=1;
        int fibonacci = 0;

        if( n == 0 )
            return 0;
        if( n == 1 || n == 2 )
            return 1;

        for (int i = 1; i < n; ++i) {
            fibonacci = n1 + n0;
            n0 = n1;
            n1 = fibonacci;
        }
        return fibonacci;
    }

  public void printPyramidNumbers(int n) {

    for(int i = 1; i<=n; i++ ){
        for (int j = 1; j <= i; j++){
            System.out.print(j);

        }
        System.out.println();
    }
  }

  public int gcd(int a, int b){

        while ( a != b){
            if(a==0)
                return b;

            if(b==0)
                return a;

            if(a>b)
               a = a-b;

            if(a<b)
               b = b-a;

            if(a == b)
               a=b;
        }
        return b;
  }

  public int lengthOfCollatzSeq(int n){

      int length = 1;
      while(n != 1) {
          if(n % 2 == 0) {
              n = n/2;
          }

          else {
              n = (3 * n) + 1;
          }
          ++length;
      }
      return length;
  }




    public static void main(String[] args){

    MyMath myMath = new MyMath();
    System.out.println("___________________________________");
    System.out.println("n! = " + myMath.factorial(6));
    System.out.println("___________________________________");
    System.out.println("n.fibonacci degeri = " + myMath.fibonacci(6));
    System.out.println("___________________________________");
    myMath.printPyramidNumbers(6);
    System.out.println("___________________________________");
    System.out.println("gcd(a,b): "+myMath.gcd(24,54));
    System.out.println("___________________________________");
    System.out.println("lengthOfCollatzSeq : "+myMath.lengthOfCollatzSeq(27));
    System.out.println("___________________________________");


    }

}
