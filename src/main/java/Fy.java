public class FY extends Fm {
   private final cv brI;

   public static void q(QI var0, NW var1, OK var2, cv var3) {
      NW var4 = var1.v(var2.WL());
      NW var5 = var1.v(var2.WO());
      int var6 = (var0.g(var5).ds().cT() ? 1 : 0) + (var0.g(var5.Vi()).ds().cT() ? 1 : 0);
      int var7 = (var0.g(var4).ds().cT() ? 1 : 0) + (var0.g(var4.Vi()).ds().cT() ? 1 : 0);
      boolean var8 = var0.g(var5).ds() == var3 || var0.g(var5.Vi()).ds() == var3;
      boolean var9 = var0.g(var4).ds() == var3 || var0.g(var4.Vi()).ds() == var3;
      boolean var10 = var8 && !var9 || var7 > var6;
      NW var11 = var1.Vi();
      hI var12 = var3.cx().q(ds.oI, var2).q(ds.oJ, var10 ? du.oQ : du.oP);
      var0.q(var1, var12.q(ds.oK, dt.oN), 2);
      var0.q(var11, var12.q(ds.oK, dt.oM), 2);
      var0.e(var1, var3);
      var0.e(var11, var3);
   }

   public boolean q(GX var1, DD var2, QI var3, NW var4, OK var5, float var6, float var7, float var8) {
      if (var5 != OK.bQC) {
         return false;
      } else {
         hI var9 = var3.g(var4);
         cv var10 = var9.ds();
         if (!var10.u(var3, var4)) {
            var4 = var4.v(var5);
         }

         if (!var2.q(var4, var5, var1)) {
            return false;
         } else if (!this.brI.e(var3, var4)) {
            return false;
         } else {
            q(var3, var4, OK.v((double)var2.aOn), this.brI);
            --var1.bsH;
            return true;
         }
      }
   }

   public FY(cv var1) {
      this.brI = var1;
      this.r(yl.aLN);
   }
}
