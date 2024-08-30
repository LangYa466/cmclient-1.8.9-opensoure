import java.util.concurrent.Callable;

class sn implements Callable {
   // $FF: synthetic field
   final sj arq;
   // $FF: synthetic field
   final GX arr;

   sn(sj var1, GX var2) {
      this.arq = var1;
      this.arr = var2;
   }

   // $FF: synthetic method
   public Object call() {
      return this.gm();
   }

   public String gm() {
      return String.valueOf(this.arr.Ia());
   }
}
