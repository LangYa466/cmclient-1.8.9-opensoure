public class tk implements tt {
   private final sG atD;

   // $FF: synthetic method
   public void w(zz var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.q((iO)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public tk(sG var1) {
      this.atD = var1;
   }

   public void q(iO var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var1.bY().equals(y.q[2474 & 451]) && var1.hr() && !var1.xZ()) {
         this.atD.o(var1.ho());

         for(int var9 = 0; var9 < 2; ++var9) {
            float var10 = var1.aOF + (var1.aOn - var1.aOF) * var4 - (var1.aQS + (var1.aQB - var1.aQS) * var4);
            float var11 = var1.aOr + (var1.aNN - var1.aOr) * var4;
            pz.nE();
            pz.i(var10, 0.0F, 1.0F, 0.0F);
            pz.i(var11, 1.0F, 0.0F, 0.0F);
            pz.y(0.375F * (float)(var9 * 2 - 1), 0.0F, 0.0F);
            pz.y(0.0F, -0.375F, 0.0F);
            pz.i(-var11, 1.0F, 0.0F, 0.0F);
            pz.i(-var10, 0.0F, 1.0F, 0.0F);
            float var12 = 1.3333334F;
            pz.u(var12, var12, var12);
            this.atD.rA().D(0.0625F);
            pz.nF();
         }
      }

   }

   public boolean rG() {
      return true;
   }
}
