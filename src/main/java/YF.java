import java.util.concurrent.Callable;

final class yf implements Callable {
   // $FF: synthetic field
   final int aLp;
   // $FF: synthetic field
   final cv aLq;

   yf(int var1, cv var2) {
      this.aLp = var1;
      this.aLq = var2;
   }

   // $FF: synthetic method
   public Object call() {
      return this.gm();
   }

   public String gm() {
      try {
         return String.format(y.q[4763 & 28315], this.aLp, this.aLq.cM(), this.aLq.getClass().getCanonicalName());
      } catch (Throwable var2) {
         return y.q[17052 & -23652] + this.aLp;
      }
   }
}
