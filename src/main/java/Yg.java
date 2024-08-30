import java.util.concurrent.Callable;

final class yg implements Callable {
   // $FF: synthetic field
   final int aLr;

   public String gm() {
      if (this.aLr < 0) {
         return y.q[665 & 31384] + this.aLr + w.q[24671 & -32579];
      } else {
         String var1 = String.format(y.q[10971 & 1693], Integer.toBinaryString(this.aLr)).replace(q.q[-27830 & 11646], w.q[8617 & 18349]);
         return String.format(y.q[666 & -10342], this.aLr, var1);
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.gm();
   }

   yg(int var1) {
      this.aLr = var1;
   }
}
