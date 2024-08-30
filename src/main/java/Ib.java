import java.util.concurrent.Callable;

class ib implements Callable {
   // $FF: synthetic field
   final hS CW;

   // $FF: synthetic method
   public Object call() {
      return this.gm();
   }

   public String gm() {
      return this.CW.Cx.getClass().getCanonicalName();
   }

   ib(hS var1) {
      this.CW = var1;
   }
}
