import org.lwjgl.opengl.GL11;

public class ua extends rL {
   private final hS aws = hS.eV();
   private sj Jx;
   private static double awt = 4096.0D;
   private static final PJ awu = new PJ(y.q[16701 & -29314]);
   private final vE awv = new vE(q.q[10885 & -32115], q.q[-11634 & 8854]);
   private final vE aww = new vE(q.q[12973 & -31787], q.q[4799 & -28729]);

   protected void q(BE var1, double var2, double var4, double var6) {
      if (hS.fY() && var1.Co() != null && var1.Co().HS() && this.aql.Bk == var1) {
         float var8 = 1.6F;
         float var9 = 0.016666668F * var8;
         double var10 = var1.B(this.aql.arL);
         float var12 = var1.hI() ? 32.0F : 64.0F;
         if (var10 < (double)(var12 * var12)) {
            String var13 = var1.Co().tg();
            if (var1.hI()) {
               iS var14 = this.rs();
               pz.nE();
               pz.y((float)var2 + 0.0F, (float)var4 + var1.gJ + 0.5F, (float)var6);
               GL11.glNormal3f(0.0F, 1.0F, 0.0F);
               pz.i(-this.aql.arC, 0.0F, 1.0F, 0.0F);
               pz.i(this.aql.arQ, 1.0F, 0.0F, 0.0F);
               pz.u(-var9, -var9, var9);
               pz.nx();
               pz.y(0.0F, 0.25F / var9, 0.0F);
               pz.O(false);
               pz.nX();
               pz.P(770, 771);
               qk var15 = qk.pm();
               qq var16 = var15.pl();
               int var17 = var14.K(var13) / 2;
               pz.nC();
               var16.q(7, us.axK);
               var16.i((double)(-var17 - 1), -1.0D, 0.0D).p(0.0F, 0.0F, 0.0F, 0.25F).pJ();
               var16.i((double)(-var17 - 1), 8.0D, 0.0D).p(0.0F, 0.0F, 0.0F, 0.25F).pJ();
               var16.i((double)(var17 + 1), 8.0D, 0.0D).p(0.0F, 0.0F, 0.0F, 0.25F).pJ();
               var16.i((double)(var17 + 1), -1.0D, 0.0D).p(0.0F, 0.0F, 0.0F, 0.25F).pJ();
               var15.pn();
               pz.nP();
               pz.O(true);
               var14.q(var13, -var14.K(var13) / 2, 0, 553648127);
               pz.oe();
               pz.nz();
               pz.u(1.0F, 1.0F, 1.0F, 1.0F);
               pz.nF();
            } else {
               this.q(var1, var13, var2, var4, var6, 64);
            }
         }
      }

   }

   public ua(sx var1, sj var2) {
      super(var1);
      this.Jx = var2;
   }

   // $FF: synthetic method
   protected void w(zk var1, double var2, double var4, double var6) {
      this.q((BE)var1, var2, var4, var6);
   }

   private boolean q(BE var1) {
      if (net.optifine.shaders.F.cOf) {
         return false;
      } else {
         if (!MV.bIn) {
            zk var2 = this.aws.gj();
            double var3 = var1.x(var2.aNZ, var2.aNK, var2.aOt);
            if (var3 > awt) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: synthetic method
   protected PJ f(zk var1) {
      return this.e((BE)var1);
   }

   public static void sF() {
      hS var0 = MV.eV();
      double var1 = (double)MV.c(var0.Br.aEN, 1.0F, 120.0F);
      double var3 = Math.max(6.0D * (double)var0.BB / var1, 16.0D);
      awt = var3 * var3;
   }

   private void w(BE var1) {
      GX var2 = var1.Co();
      if (var2 != null) {
         if (!this.q(var1)) {
            return;
         }

         if (!MV.bIn) {
            iQ var3 = this.aws.CM;
            double var4 = var1.x(var3.aNZ, var3.aNK, var3.aOt);
            if (var4 > 4096.0D) {
               return;
            }
         }

         BD var12 = new BD(var1.vR, 0.0D, 0.0D, 0.0D, var2);
         Fm var13 = var12.Ch().do1();
         var12.Ch().bsH = 1;
         var12.aYb = 0.0F;
         pz.nE();
         pz.nx();
         int var5 = var1.Cn();
         if (var13 instanceof Gx) {
            var5 = var5 % 4 * 2;
         }

         pz.i((float)var5 * 360.0F / 8.0F, 0.0F, 0.0F, 1.0F);
         if (var13 instanceof Gx) {
            this.aql.CL.o(awu);
            pz.i(180.0F, 0.0F, 0.0F, 1.0F);
            float var14 = 0.0078125F;
            pz.u(var14, var14, var14);
            pz.y(-64.0F, -64.0F, 0.0F);
            Ws var15 = Et.bmM.q(var12.Ch(), var1.vR);
            pz.y(0.0F, 0.0F, -1.0F);
            if (var15 != null) {
               this.aws.Bt.nr().q(var15, true);
            }
         } else {
            tO var6 = null;
            if (var13 == Et.boh) {
               var6 = this.aws.fA().aw(tR.avy);
               this.aws.fJ().o(tU.awb);
               if (var6 instanceof tR) {
                  tR var7 = (tR)var6;
                  double var8 = var7.avw;
                  double var10 = var7.avx;
                  var7.avw = 0.0D;
                  var7.avx = 0.0D;
                  var7.q(var1.vR, var1.aNZ, var1.aOt, (double)Pq.bl((float)(180 + var1.aPj.WI() * 90)), false, true);
                  var7.avw = var8;
                  var7.avx = var10;
               } else {
                  var6 = null;
               }
            }

            pz.u(0.5F, 0.5F, 0.5F);
            if (!this.Jx.j(var12.Ch()) || var13 instanceof GR) {
               pz.i(180.0F, 0.0F, 1.0F, 0.0F);
            }

            pz.nO();
            qh.pi();
            this.Jx.q(var12.Ch(), qM.anl);
            qh.pj();
            pz.oi();
            if (var6 != null && var6.sm() > 0) {
               var6.sk();
            }
         }

         pz.oe();
         pz.nF();
      }

   }

   public void q(BE var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.aws.Bn.atS().bF.af()) {
         pz.nE();
         NW var10 = var1.yD();
         double var11 = (double)var10.aY() - var1.aNZ + var2;
         double var13 = (double)var10.aX() - var1.aNK + var4;
         double var15 = (double)var10.KO() - var1.aOt + var6;
         pz.t(var11 + 0.5D, var13 + 0.5D, var15 + 0.5D);
         pz.i(180.0F - var1.aOn, 0.0F, 1.0F, 0.0F);
         this.aql.CL.o(tU.awb);
         pl var17 = this.aws.fB();
         vD var18 = var17.nb().mX();
         vz var19;
         if (var1.Co() != null && var1.Co().do1() == Et.bmM) {
            var19 = var18.q(this.aww);
         } else {
            var19 = var18.q(this.awv);
         }

         pz.nE();
         pz.y(-0.5F, -0.5F, -0.5F);
         var17.nc().q(var19, 1.0F, 1.0F, 1.0F, 1.0F);
         pz.nF();
         pz.y(0.0F, 0.0F, 0.4375F);
         this.w(var1);
         pz.nF();
         this.q(var1, var2 + (double)((float)var1.aPj.WP() * 0.3F), var4 - 0.25D, var6 + (double)((float)var1.aPj.WR() * 0.3F));
      }
   }

   // $FF: synthetic method
   public void e(zk var1, double var2, double var4, double var6, float var8, float var9) {
      this.q((BE)var1, var2, var4, var6, var8, var9);
   }

   protected PJ e(BE var1) {
      return null;
   }
}
