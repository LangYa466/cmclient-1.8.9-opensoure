public abstract class sv extends tb {
   public boolean q(zx var1, rI var2, double var3, double var5, double var7) {
      if (super.q(var1, var2, var3, var5, var7)) {
         return true;
      } else if (var1.yL() && var1.yP() != null) {
         zk var9 = var1.yP();
         return var2.w(var9.xE());
      } else {
         return false;
      }
   }

   public void q(zx var1, float var2) {
      int var3 = var1.I(var2);
      int var4 = var3 % 65536;
      int var5 = var3 / 65536;
      qa.q(qa.aiX, (float)var4 / 1.0F, (float)var5 / 1.0F);
   }

   public sv(sx var1, lJ var2, float var3) {
      super(var1, var2, var3);
   }

   protected boolean w(zx var1) {
      return super.q(var1) && (var1.yg() || var1.dg() && var1 == this.aql.Bk);
   }

   protected void w(zx var1, double var2, double var4, double var6, float var8, float var9) {
      if (!MV.Tf() || !net.optifine.shaders.F.cOf) {
         zk var10 = var1.yP();
         if (var10 != null) {
            var4 = var4 - (1.6D - (double)var1.gJ) * 0.5D;
            qk var11 = qk.pm();
            qq var12 = var11.pl();
            double var13 = this.a((double)var10.aOF, (double)var10.aOn, (double)(var9 * 0.5F)) * 0.01745329238474369D;
            double var15 = this.a((double)var10.aOr, (double)var10.aNN, (double)(var9 * 0.5F)) * 0.01745329238474369D;
            double var17 = Math.cos(var13);
            double var19 = Math.sin(var13);
            double var21 = Math.sin(var15);
            if (var10 instanceof zt) {
               var17 = 0.0D;
               var19 = 0.0D;
               var21 = -1.0D;
            }

            double var23 = Math.cos(var15);
            double var25 = this.a(var10.aOf, var10.aNZ, (double)var9) - var17 * 0.7D - var19 * 0.5D * var23;
            double var27 = this.a(var10.aNH + (double)var10.xC() * 0.7D, var10.aNK + (double)var10.xC() * 0.7D, (double)var9) - var21 * 0.5D - 0.25D;
            double var29 = this.a(var10.aNW, var10.aOt, (double)var9) - var19 * 0.7D + var17 * 0.5D * var23;
            double var31 = this.a((double)var1.aQS, (double)var1.aQB, (double)var9) * 0.01745329238474369D + 1.5707963267948966D;
            var17 = Math.cos(var31) * (double)var1.gK * 0.4D;
            var19 = Math.sin(var31) * (double)var1.gK * 0.4D;
            double var33 = this.a(var1.aOf, var1.aNZ, (double)var9) + var17;
            double var35 = this.a(var1.aNH, var1.aNK, (double)var9);
            double var37 = this.a(var1.aNW, var1.aOt, (double)var9) + var19;
            var2 = var2 + var17;
            var6 = var6 + var19;
            double var39 = (double)((float)(var25 - var33));
            double var41 = (double)((float)(var27 - var35));
            double var43 = (double)((float)(var29 - var37));
            pz.nC();
            pz.nx();
            pz.nK();
            if (MV.Tf()) {
               net.optifine.shaders.F.aiI();
            }

            boolean var45 = true;
            double var46 = 0.025D;
            var12.q(5, us.axK);

            for(int var48 = 0; var48 <= 24; ++var48) {
               float var49 = 0.5F;
               float var50 = 0.4F;
               float var51 = 0.3F;
               if (var48 % 2 == 0) {
                  var49 *= 0.7F;
                  var50 *= 0.7F;
                  var51 *= 0.7F;
               }

               float var52 = (float)var48 / 24.0F;
               var12.i(var2 + var39 * (double)var52 + 0.0D, var4 + var41 * (double)(var52 * var52 + var52) * 0.5D + (double)((24.0F - (float)var48) / 18.0F + 0.125F), var6 + var43 * (double)var52).p(var49, var50, var51, 1.0F).pJ();
               var12.i(var2 + var39 * (double)var52 + 0.025D, var4 + var41 * (double)(var52 * var52 + var52) * 0.5D + (double)((24.0F - (float)var48) / 18.0F + 0.125F) + 0.025D, var6 + var43 * (double)var52).p(var49, var50, var51, 1.0F).pJ();
            }

            var11.pn();
            var12.q(5, us.axK);

            for(int var58 = 0; var58 <= 24; ++var58) {
               float var59 = 0.5F;
               float var60 = 0.4F;
               float var61 = 0.3F;
               if (var58 % 2 == 0) {
                  var59 *= 0.7F;
                  var60 *= 0.7F;
                  var61 *= 0.7F;
               }

               float var62 = (float)var58 / 24.0F;
               var12.i(var2 + var39 * (double)var62 + 0.0D, var4 + var41 * (double)(var62 * var62 + var62) * 0.5D + (double)((24.0F - (float)var58) / 18.0F + 0.125F) + 0.025D, var6 + var43 * (double)var62).p(var59, var60, var61, 1.0F).pJ();
               var12.i(var2 + var39 * (double)var62 + 0.025D, var4 + var41 * (double)(var62 * var62 + var62) * 0.5D + (double)((24.0F - (float)var58) / 18.0F + 0.125F), var6 + var43 * (double)var62 + 0.025D).p(var59, var60, var61, 1.0F).pJ();
            }

            var11.pn();
            if (MV.Tf()) {
               net.optifine.shaders.F.ajT();
            }

            pz.oe();
            pz.nP();
            pz.nL();
         }
      }

   }

   // $FF: synthetic method
   protected boolean d(zk var1) {
      return this.w((zx)var1);
   }

   // $FF: synthetic method
   protected boolean q(zz var1) {
      return this.w((zx)var1);
   }

   private double a(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   public void q(zx var1, double var2, double var4, double var6, float var8, float var9) {
      super.q(var1, var2, var4, var6, var8, var9);
      this.w(var1, var2, var4, var6, var8, var9);
   }

   // $FF: synthetic method
   public void e(zk var1, double var2, double var4, double var6, float var8, float var9) {
      this.q((zx)var1, var2, var4, var6, var8, var9);
   }
}
