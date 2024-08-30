public class tr implements tt {
   private final si atL;

   public tr(si var1) {
      this.atL = var1;
   }

   // $FF: synthetic method
   public void w(zz var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.q((Co)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void q(Co var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var1.Dp() != 0) {
         pl var9 = hS.eV().fB();
         pz.od();
         pz.nE();
         pz.i(5.0F + 180.0F * ((mc)this.atL.ro()).Wg.Xw / 3.1415927F, 1.0F, 0.0F, 0.0F);
         pz.i(90.0F, 1.0F, 0.0F, 0.0F);
         pz.y(-0.9375F, -0.625F, -0.9375F);
         float var10 = 0.5F;
         pz.u(var10, -var10, var10);
         int var11 = var1.I(var4);
         int var12 = var11 % 65536;
         int var13 = var11 / 65536;
         qa.q(qa.aiX, (float)var12 / 1.0F, (float)var13 / 1.0F);
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         this.atL.o(tU.awb);
         var9.q(Ea.bjA.cx(), 1.0F);
         pz.nF();
         pz.nS();
      }

   }

   public boolean rG() {
      return false;
   }
}
