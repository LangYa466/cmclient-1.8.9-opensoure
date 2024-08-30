import java.nio.ByteBuffer;

class aef {
   private int djc;
   private int djd;
   private int dje;
   private ByteBuffer djf;
   // $FF: synthetic field
   final aed djg;
   private int djh;

   // $FF: synthetic method
   static int q(aef var0, int var1) {
      return var0.djc = var1;
   }

   // $FF: synthetic method
   static ByteBuffer q(aef var0, ByteBuffer var1) {
      return var0.djf = var1;
   }

   // $FF: synthetic method
   static int w(aef var0, int var1) {
      return var0.djd = var1;
   }

   // $FF: synthetic method
   static int e(aef var0, int var1) {
      return var0.djh = var1;
   }

   private aef(aed var1) {
      this.djg = var1;
   }

   // $FF: synthetic method
   static int r(aef var0, int var1) {
      return var0.dje = var1;
   }

   public int asA() {
      return adU.asi().q(this.djg, this.djc, this.djd, this.djh, this.dje, this.djf);
   }
}
