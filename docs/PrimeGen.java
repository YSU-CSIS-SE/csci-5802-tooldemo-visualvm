import java.lang.*;

class PrimeGen {
  public static void main(String[] args) throws java.io.IOException {
    int n = 150000;
    System.out.println("Ready");
    System.in.read();
    while (true) {
      searchMethod(n);
      System.out.println("searchMethod Complete");
      System.in.read();
      sieveMethod(n);
      System.out.println("sieveMethod Complete");
      System.in.read();
    }
  }
  private static void searchMethod(int n) {
    for (int i = 2; i < n; i++) {
      boolean prime=true;
      for (int j = 2; j < i; j++)
        if (i % j == 0) { prime = false; break; }
    }
  }
  private static void sieveMethod(int n) {
    boolean[] sieve = new boolean[n];
    for (int i = 0; i < n; i++) sieve[i] = true;
    int sqrtn = (int)Math.ceil(Math.sqrt(n));

    for (int i = 2; i < sqrtn; i++) {
      if (!sieve[i]) continue;
      for (int j = i*2; j < n; j += i)
        sieve[j] = false;
    }
  }
}
