import java.util.concurrent.Callable;

class mS implements Callable {
   // $FF: synthetic field
   final mP ZG;

   mS(mP var1) {
      this.ZG = var1;
   }

   public String gm() {
      return mP.r(this.ZG).CM.hA();
   }

   // $FF: synthetic method
   public Object call() {
      return this.gm();
   }
}
