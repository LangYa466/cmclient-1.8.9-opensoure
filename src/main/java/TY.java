public class ty implements tt {
   private static final PJ atZ = new PJ(o.q[-23714 & 22462]);
   private final sQ aua;

   public ty(sQ var1) {
      this.aua = var1;
   }

   public boolean rG() {
      return false;
   }

   // $FF: synthetic method
   public void w(zz var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.q((CH)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void q(CH var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.aua.o(atZ);
      pz.nX();
      pz.nB();
      pz.P(1, 1);
      if (var1.xZ()) {
         pz.O(false);
      } else {
         pz.O(true);
      }

      int var9 = 61680;
      int var10 = var9 % 65536;
      int var11 = var9 / 65536;
      qa.q(qa.aiX, (float)var10 / 1.0F, (float)var11 / 1.0F);
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      if (MV.Tf()) {
         net.optifine.shaders.F.akm();
      }

      MV.Td().akH = true;
      this.aua.ro().q(var1, var2, var3, var5, var6, var7, var8);
      MV.Td().akH = false;
      if (MV.Tf()) {
         net.optifine.shaders.F.aix();
      }

      var9 = var1.I(var4);
      var10 = var9 % 65536;
      var11 = var9 / 65536;
      qa.q(qa.aiX, (float)var10 / 1.0F, (float)var11 / 1.0F);
      this.aua.q(var1, var4);
      pz.nz();
      pz.hT();
   }
}
