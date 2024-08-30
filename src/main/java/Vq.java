import java.util.List;
import java.util.Random;

abstract class VQ extends Ut {
   protected VR cmy = VR.cmz;

   protected Ut q(VM var1, List var2, Random var3, int var4, int var5) {
      // $FF: Couldn't be decompiled
   }

   protected Ut w(VM var1, List var2, Random var3, int var4, int var5) {
      // $FF: Couldn't be decompiled
   }

   protected VR g(Random var1) {
      int var2 = var1.nextInt(5);
      switch(var2) {
      case 0:
      case 1:
      default:
         return VR.cmz;
      case 2:
         return VR.cmA;
      case 3:
         return VR.cmB;
      case 4:
         return VR.cmC;
      }
   }

   protected Ut e(VM var1, List var2, Random var3, int var4, int var5) {
      // $FF: Couldn't be decompiled
   }

   protected void q(QI var1, Random var2, Ur var3, VR var4, int var5, int var6, int var7) {
      // $FF: Couldn't be decompiled
   }

   protected VQ(int var1) {
      super(var1);
   }

   protected void P(HL var1) {
      this.cmy = VR.valueOf(var1.bG(i.q[2026 & 954]));
   }

   public VQ() {
   }

   protected static boolean t(Ur var0) {
      return var0 != null && var0.ckH > 10;
   }

   protected void O(HL var1) {
      var1.a(i.q[2987 & 9130], this.cmy.name());
   }
}
