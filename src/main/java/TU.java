import java.util.Random;

public abstract class Tu {
   private final boolean cjj;

   public Tu() {
      this(false);
   }

   public Tu(boolean var1) {
      this.cjj = var1;
   }

   protected void N(QI var1, NW var2, hI var3) {
      if (this.cjj) {
         var1.q(var2, var3, 3);
      } else {
         var1.q(var2, var3, 2);
      }

   }

   public abstract boolean w(QI var1, Random var2, NW var3);

   public void acx() {
   }
}
