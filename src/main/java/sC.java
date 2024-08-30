public class sc extends rL {
   private static final PJ aqM = new PJ(t.q[29310 & 959]);

   // $FF: synthetic method
   public void e(zk var1, double var2, double var4, double var6, float var8, float var9) {
      this.q((DP)var1, var2, var4, var6, var8, var9);
   }

   public void q(DP var1, double var2, double var4, double var6, float var8, float var9) {
      pz.nE();
      pz.y((float)var2, (float)var4, (float)var6);
      pz.od();
      pz.u(0.5F, 0.5F, 0.5F);
      this.g(var1);
      qk var10 = qk.pm();
      qq var11 = var10.pl();
      boolean var12 = true;
      boolean var13 = true;
      float var14 = 0.0625F;
      float var15 = 0.125F;
      float var16 = 0.125F;
      float var17 = 0.1875F;
      float var18 = 1.0F;
      float var19 = 0.5F;
      float var20 = 0.5F;
      pz.i(180.0F - this.aql.arC, 0.0F, 1.0F, 0.0F);
      pz.i(-this.aql.arQ, 1.0F, 0.0F, 0.0F);
      var11.q(7, us.axH);
      var11.i(-0.5D, -0.5D, 0.0D).e(0.0625D, 0.1875D).o(0.0F, 1.0F, 0.0F).pJ();
      var11.i(0.5D, -0.5D, 0.0D).e(0.125D, 0.1875D).o(0.0F, 1.0F, 0.0F).pJ();
      var11.i(0.5D, 0.5D, 0.0D).e(0.125D, 0.125D).o(0.0F, 1.0F, 0.0F).pJ();
      var11.i(-0.5D, 0.5D, 0.0D).e(0.0625D, 0.125D).o(0.0F, 1.0F, 0.0F).pJ();
      var10.pn();
      pz.nS();
      pz.nF();
      if (var1.bgk != null) {
         float var21 = var1.bgk.aD(var9);
         float var22 = Pq.bk(Pq.bh(var21) * 3.1415927F);
         PX var23 = new PX(-0.36D, 0.03D, 0.35D);
         var23 = var23.bm(-(var1.bgk.aOr + (var1.bgk.aNN - var1.bgk.aOr) * var9) * 3.1415927F / 180.0F);
         var23 = var23.bn(-(var1.bgk.aOF + (var1.bgk.aOn - var1.bgk.aOF) * var9) * 3.1415927F / 180.0F);
         var23 = var23.bn(var22 * 0.5F);
         var23 = var23.bm(-var22 * 0.7F);
         double var24 = var1.bgk.aOf + (var1.bgk.aNZ - var1.bgk.aOf) * (double)var9 + var23.bUV;
         double var26 = var1.bgk.aNH + (var1.bgk.aNK - var1.bgk.aNH) * (double)var9 + var23.bUW;
         double var28 = var1.bgk.aNW + (var1.bgk.aOt - var1.bgk.aNW) * (double)var9 + var23.bUX;
         double var30 = (double)var1.bgk.xC();
         if (this.aql.EM != null && this.aql.EM.aCr > 0 || var1.bgk != hS.eV().CM) {
            float var32 = (var1.bgk.aQS + (var1.bgk.aQB - var1.bgk.aQS) * var9) * 3.1415927F / 180.0F;
            double var33 = (double)Pq.bk(var32);
            double var35 = (double)Pq.bi(var32);
            double var37 = 0.35D;
            double var39 = 0.8D;
            var24 = var1.bgk.aOf + (var1.bgk.aNZ - var1.bgk.aOf) * (double)var9 - var35 * 0.35D - var33 * 0.8D;
            var26 = var1.bgk.aNH + var30 + (var1.bgk.aNK - var1.bgk.aNH) * (double)var9 - 0.45D;
            var28 = var1.bgk.aNW + (var1.bgk.aOt - var1.bgk.aNW) * (double)var9 - var33 * 0.35D + var35 * 0.8D;
            var30 = var1.bgk.hI() ? -0.1875D : 0.0D;
         }

         double var51 = var1.aOf + (var1.aNZ - var1.aOf) * (double)var9;
         double var34 = var1.aNH + (var1.aNK - var1.aNH) * (double)var9 + 0.25D;
         double var36 = var1.aNW + (var1.aOt - var1.aNW) * (double)var9;
         double var38 = (double)((float)(var24 - var51));
         double var40 = (double)((float)(var26 - var34)) + var30;
         double var42 = (double)((float)(var28 - var36));
         pz.nC();
         pz.nx();
         var11.q(3, us.axK);
         boolean var44 = true;

         for(int var45 = 0; var45 <= 16; ++var45) {
            float var46 = (float)var45 / 16.0F;
            var11.i(var2 + var38 * (double)var46, var4 + var40 * (double)(var46 * var46 + var46) * 0.5D + 0.25D, var6 + var42 * (double)var46).v(0, 0, 0, 255).pJ();
         }

         var10.pn();
         pz.oe();
         pz.nP();
         super.e(var1, var2, var4, var6, var8, var9);
      }

   }

   public sc(sx var1) {
      super(var1);
   }

   protected PJ q(DP var1) {
      return aqM;
   }

   // $FF: synthetic method
   protected PJ f(zk var1) {
      return this.q((DP)var1);
   }
}
