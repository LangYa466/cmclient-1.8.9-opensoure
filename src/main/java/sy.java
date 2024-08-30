public class sY extends rL {
   private static final PJ asI = new PJ(o.q[18292 & 885]);

   public void q(BR var1, double var2, double var4, double var6, float var8, float var9) {
      pz.nE();
      pz.y((float)var2, (float)var4, (float)var6);
      this.g(var1);
      int var10 = var1.CQ();
      float var11 = (float)(var10 % 4 * 16 + 0) / 64.0F;
      float var12 = (float)(var10 % 4 * 16 + 16) / 64.0F;
      float var13 = (float)(var10 / 4 * 16 + 0) / 64.0F;
      float var14 = (float)(var10 / 4 * 16 + 16) / 64.0F;
      float var15 = 1.0F;
      float var16 = 0.5F;
      float var17 = 0.25F;
      int var18 = var1.I(var9);
      int var19 = var18 % 65536;
      int var20 = var18 / 65536;
      qa.q(qa.aiX, (float)var19 / 1.0F, (float)var20 / 1.0F);
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      float var21 = 255.0F;
      float var22 = ((float)var1.aZt + var9) / 2.0F;
      if (MV.SM()) {
         var22 = Xh.bB(var22);
      }

      var20 = (int)((Pq.bk(var22 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      boolean var23 = true;
      int var24 = (int)((Pq.bk(var22 + 4.1887903F) + 1.0F) * 0.1F * 255.0F);
      pz.i(180.0F - this.aql.arC, 0.0F, 1.0F, 0.0F);
      pz.i(-this.aql.arQ, 1.0F, 0.0F, 0.0F);
      float var25 = 0.3F;
      pz.u(0.3F, 0.3F, 0.3F);
      qk var26 = qk.pm();
      qq var27 = var26.pl();
      var27.q(7, us.axI);
      int var28 = var20;
      int var29 = 255;
      int var30 = var24;
      if (MV.SM()) {
         int var31 = Xh.bC(var22);
         if (var31 >= 0) {
            var28 = var31 >> 16 & 255;
            var29 = var31 >> 8 & 255;
            var30 = var31 >> 0 & 255;
         }
      }

      var27.i((double)(0.0F - var16), (double)(0.0F - var17), 0.0D).e((double)var11, (double)var14).v(var28, var29, var30, 128).o(0.0F, 1.0F, 0.0F).pJ();
      var27.i((double)(var15 - var16), (double)(0.0F - var17), 0.0D).e((double)var12, (double)var14).v(var28, var29, var30, 128).o(0.0F, 1.0F, 0.0F).pJ();
      var27.i((double)(var15 - var16), (double)(1.0F - var17), 0.0D).e((double)var12, (double)var13).v(var28, var29, var30, 128).o(0.0F, 1.0F, 0.0F).pJ();
      var27.i((double)(0.0F - var16), (double)(1.0F - var17), 0.0D).e((double)var11, (double)var13).v(var28, var29, var30, 128).o(0.0F, 1.0F, 0.0F).pJ();
      var26.pn();
      pz.nz();
      pz.nS();
      pz.nF();
      super.e(var1, var2, var4, var6, var8, var9);
   }

   protected PJ q(BR var1) {
      return asI;
   }

   public sY(sx var1) {
      super(var1);
      this.aqm = 0.15F;
      this.aqn = 0.75F;
   }

   // $FF: synthetic method
   public void e(zk var1, double var2, double var4, double var6, float var8, float var9) {
      this.q((BR)var1, var2, var4, var6, var8, var9);
   }

   // $FF: synthetic method
   protected PJ f(zk var1) {
      return this.q((BR)var1);
   }
}
