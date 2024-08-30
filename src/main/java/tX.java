import java.util.concurrent.Callable;

final class Tx implements Callable {
   // $FF: synthetic field
   final Rl cjq;

   // $FF: synthetic method
   public Object call() {
      return this.gm();
   }

   public String gm() {
      return String.valueOf(this.cjq);
   }

   Tx(Rl var1) {
      this.cjq = var1;
   }
}
