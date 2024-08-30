import org.lwjgl.opengl.GL11;

public class sg extends sv {
   private static final PJ aqR = new PJ(o.q[2477 & -32275]);
   private static final PJ aqS = new PJ(o.q[9199 & -15953]);
   int aqT;
   private static final PJ aqU = new PJ(o.q[-25170 & 16878]);

   // $FF: synthetic method
   protected PJ f(zk var1) {
      return this.q((Cj)var1);
   }

   public void q(Cj var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.aqT != ((lZ)this.atf).le()) {
         this.atf = new lZ();
         this.aqT = ((lZ)this.atf).le();
      }

      super.q((zx)var1, var2, var4, var6, var8, var9);
      zz var10 = var1.Dj();
      if (var10 != null) {
         float var11 = var1.aK(var9);
         qk var12 = qk.pm();
         qq var13 = var12.pl();
         this.o(aqS);
         GL11.glTexParameterf(3553, 10242, 10497.0F);
         GL11.glTexParameterf(3553, 10243, 10497.0F);
         pz.nx();
         pz.nK();
         pz.nz();
         pz.O(true);
         float var14 = 240.0F;
         qa.q(qa.aiX, var14, var14);
         pz.s(770, 1, 1, 0);
         float var15 = (float)var1.vR.Ky() + var9;
         float var16 = var15 * 0.5F % 1.0F;
         float var17 = var1.xC();
         pz.nE();
         pz.y((float)var2, (float)var4 + var17, (float)var6);
         PX var18 = this.q(var10, (double)var10.gJ * 0.5D, var9);
         PX var19 = this.q(var1, (double)var17, var9);
         PX var20 = var18.d(var19);
         double var21 = var20.XU() + 1.0D;
         var20 = var20.XT();
         float var23 = (float)Math.acos(var20.bUW);
         float var24 = (float)Math.atan2(var20.bUX, var20.bUV);
         pz.i((1.5707964F + -var24) * 57.295776F, 0.0F, 1.0F, 0.0F);
         pz.i(var23 * 57.295776F, 1.0F, 0.0F, 0.0F);
         byte var25 = 1;
         double var26 = (double)var15 * 0.05D * (1.0D - (double)(var25 & 1) * 2.5D);
         var13.q(7, us.axL);
         float var28 = var11 * var11;
         int var29 = 64 + (int)(var28 * 240.0F);
         int var30 = 32 + (int)(var28 * 192.0F);
         int var31 = 128 - (int)(var28 * 64.0F);
         double var32 = (double)var25 * 0.2D;
         double var34 = var32 * 1.41D;
         double var36 = 0.0D + Math.cos(var26 + 2.356194490192345D) * var34;
         double var38 = 0.0D + Math.sin(var26 + 2.356194490192345D) * var34;
         double var40 = 0.0D + Math.cos(var26 + 0.7853981633974483D) * var34;
         double var42 = 0.0D + Math.sin(var26 + 0.7853981633974483D) * var34;
         double var44 = 0.0D + Math.cos(var26 + 3.9269908169872414D) * var34;
         double var46 = 0.0D + Math.sin(var26 + 3.9269908169872414D) * var34;
         double var48 = 0.0D + Math.cos(var26 + 5.497787143782138D) * var34;
         double var50 = 0.0D + Math.sin(var26 + 5.497787143782138D) * var34;
         double var52 = 0.0D + Math.cos(var26 + 3.141592653589793D) * var32;
         double var54 = 0.0D + Math.sin(var26 + 3.141592653589793D) * var32;
         double var56 = 0.0D + Math.cos(var26 + 0.0D) * var32;
         double var58 = 0.0D + Math.sin(var26 + 0.0D) * var32;
         double var60 = 0.0D + Math.cos(var26 + 1.5707963267948966D) * var32;
         double var62 = 0.0D + Math.sin(var26 + 1.5707963267948966D) * var32;
         double var64 = 0.0D + Math.cos(var26 + 4.71238898038469D) * var32;
         double var66 = 0.0D + Math.sin(var26 + 4.71238898038469D) * var32;
         double var68 = 0.0D;
         double var70 = 0.4999D;
         double var72 = (double)(-1.0F + var16);
         double var74 = var21 * (0.5D / var32) + var72;
         var13.i(var52, var21, var54).e(0.4999D, var74).v(var29, var30, var31, 255).pJ();
         var13.i(var52, 0.0D, var54).e(0.4999D, var72).v(var29, var30, var31, 255).pJ();
         var13.i(var56, 0.0D, var58).e(0.0D, var72).v(var29, var30, var31, 255).pJ();
         var13.i(var56, var21, var58).e(0.0D, var74).v(var29, var30, var31, 255).pJ();
         var13.i(var60, var21, var62).e(0.4999D, var74).v(var29, var30, var31, 255).pJ();
         var13.i(var60, 0.0D, var62).e(0.4999D, var72).v(var29, var30, var31, 255).pJ();
         var13.i(var64, 0.0D, var66).e(0.0D, var72).v(var29, var30, var31, 255).pJ();
         var13.i(var64, var21, var66).e(0.0D, var74).v(var29, var30, var31, 255).pJ();
         double var76 = 0.0D;
         if (var1.aOa % 2 == 0) {
            var76 = 0.5D;
         }

         var13.i(var36, var21, var38).e(0.5D, var76 + 0.5D).v(var29, var30, var31, 255).pJ();
         var13.i(var40, var21, var42).e(1.0D, var76 + 0.5D).v(var29, var30, var31, 255).pJ();
         var13.i(var48, var21, var50).e(1.0D, var76).v(var29, var30, var31, 255).pJ();
         var13.i(var44, var21, var46).e(0.5D, var76).v(var29, var30, var31, 255).pJ();
         var12.pn();
         pz.nF();
      }

   }

   public boolean q(Cj var1, rI var2, double var3, double var5, double var7) {
      if (super.q((zx)var1, var2, var3, var5, var7)) {
         return true;
      } else {
         if (var1.Dh()) {
            zz var9 = var1.Dj();
            if (var9 != null) {
               PX var10 = this.q(var9, (double)var9.gJ * 0.5D, 1.0F);
               PX var11 = this.q(var1, (double)var1.xC(), 1.0F);
               if (var2.w(NV.r(var11.bUV, var11.bUW, var11.bUX, var10.bUV, var10.bUW, var10.bUX))) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private PX q(zz var1, double var2, float var4) {
      double var5 = var1.aOD + (var1.aNZ - var1.aOD) * (double)var4;
      double var7 = var2 + var1.aNE + (var1.aNK - var1.aNE) * (double)var4;
      double var9 = var1.aOC + (var1.aOt - var1.aOC) * (double)var4;
      return new PX(var5, var7, var9);
   }

   // $FF: synthetic method
   public void e(zk var1, double var2, double var4, double var6, float var8, float var9) {
      this.q((Cj)var1, var2, var4, var6, var8, var9);
   }

   // $FF: synthetic method
   protected void w(zz var1, float var2) {
      this.q((Cj)var1, var2);
   }

   protected PJ q(Cj var1) {
      return var1.Dg() ? aqU : aqR;
   }

   protected void q(Cj var1, float var2) {
      if (var1.Dg()) {
         pz.u(2.35F, 2.35F, 2.35F);
      }

   }

   public sg(sx var1) {
      super(var1, new lZ(), 0.5F);
      this.aqT = ((lZ)this.atf).le();
   }
}
