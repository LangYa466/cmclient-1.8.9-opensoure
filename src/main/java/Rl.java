import org.lwjgl.opengl.GL11;

public abstract class rL {
   private PJ aqk = null;
   protected final sx aql;
   public float aqm;
   protected float aqn = 1.0F;
   private static final PJ aqo = new PJ(y.q[459 & 29095]);
   private am Mj;

   public static void q(NV var0, double var1, double var3, double var5) {
      pz.nC();
      qk var7 = qk.pm();
      qq var8 = var7.pl();
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      var8.u(var1, var3, var5);
      var8.q(7, us.axG);
      var8.i(var0.bNW, var0.bNX, var0.bNY).o(0.0F, 0.0F, -1.0F).pJ();
      var8.i(var0.bNU, var0.bNX, var0.bNY).o(0.0F, 0.0F, -1.0F).pJ();
      var8.i(var0.bNU, var0.bNT, var0.bNY).o(0.0F, 0.0F, -1.0F).pJ();
      var8.i(var0.bNW, var0.bNT, var0.bNY).o(0.0F, 0.0F, -1.0F).pJ();
      var8.i(var0.bNW, var0.bNT, var0.bNV).o(0.0F, 0.0F, 1.0F).pJ();
      var8.i(var0.bNU, var0.bNT, var0.bNV).o(0.0F, 0.0F, 1.0F).pJ();
      var8.i(var0.bNU, var0.bNX, var0.bNV).o(0.0F, 0.0F, 1.0F).pJ();
      var8.i(var0.bNW, var0.bNX, var0.bNV).o(0.0F, 0.0F, 1.0F).pJ();
      var8.i(var0.bNW, var0.bNT, var0.bNY).o(0.0F, -1.0F, 0.0F).pJ();
      var8.i(var0.bNU, var0.bNT, var0.bNY).o(0.0F, -1.0F, 0.0F).pJ();
      var8.i(var0.bNU, var0.bNT, var0.bNV).o(0.0F, -1.0F, 0.0F).pJ();
      var8.i(var0.bNW, var0.bNT, var0.bNV).o(0.0F, -1.0F, 0.0F).pJ();
      var8.i(var0.bNW, var0.bNX, var0.bNV).o(0.0F, 1.0F, 0.0F).pJ();
      var8.i(var0.bNU, var0.bNX, var0.bNV).o(0.0F, 1.0F, 0.0F).pJ();
      var8.i(var0.bNU, var0.bNX, var0.bNY).o(0.0F, 1.0F, 0.0F).pJ();
      var8.i(var0.bNW, var0.bNX, var0.bNY).o(0.0F, 1.0F, 0.0F).pJ();
      var8.i(var0.bNW, var0.bNT, var0.bNV).o(-1.0F, 0.0F, 0.0F).pJ();
      var8.i(var0.bNW, var0.bNX, var0.bNV).o(-1.0F, 0.0F, 0.0F).pJ();
      var8.i(var0.bNW, var0.bNX, var0.bNY).o(-1.0F, 0.0F, 0.0F).pJ();
      var8.i(var0.bNW, var0.bNT, var0.bNY).o(-1.0F, 0.0F, 0.0F).pJ();
      var8.i(var0.bNU, var0.bNT, var0.bNY).o(1.0F, 0.0F, 0.0F).pJ();
      var8.i(var0.bNU, var0.bNX, var0.bNY).o(1.0F, 0.0F, 0.0F).pJ();
      var8.i(var0.bNU, var0.bNX, var0.bNV).o(1.0F, 0.0F, 0.0F).pJ();
      var8.i(var0.bNU, var0.bNT, var0.bNV).o(1.0F, 0.0F, 0.0F).pJ();
      var7.pn();
      var8.u(0.0D, 0.0D, 0.0D);
      pz.nP();
   }

   protected void w(zk var1, double var2, double var4, double var6) {
      if (this.d(var1)) {
         this.q(var1, var1.dh().Vy(), var2, var4, var6, 64);
      }

   }

   private QI rq() {
      return this.aql.vR;
   }

   private void q(cv var1, double var2, double var4, double var6, NW var8, float var9, float var10, double var11, double var13, double var15) {
      if (var1.cw()) {
         qk var17 = qk.pm();
         qq var18 = var17.pl();
         double var19 = ((double)var9 - (var4 - ((double)var8.aX() + var13)) / 2.0D) * 0.5D * (double)this.rq().aI(var8);
         if (var19 >= 0.0D) {
            if (var19 > 1.0D) {
               var19 = 1.0D;
            }

            double var21 = (double)var8.aY() + var1.cp() + var11;
            double var23 = (double)var8.aY() + var1.cD() + var11;
            double var25 = (double)var8.aX() + var1.cR() + var13 + 0.015625D;
            double var27 = (double)var8.KO() + var1.cs() + var15;
            double var29 = (double)var8.KO() + var1.cy() + var15;
            float var31 = (float)((var2 - var21) / 2.0D / (double)var10 + 0.5D);
            float var32 = (float)((var2 - var23) / 2.0D / (double)var10 + 0.5D);
            float var33 = (float)((var6 - var27) / 2.0D / (double)var10 + 0.5D);
            float var34 = (float)((var6 - var29) / 2.0D / (double)var10 + 0.5D);
            var18.i(var21, var25, var27).e((double)var31, (double)var33).p(1.0F, 1.0F, 1.0F, (float)var19).pJ();
            var18.i(var21, var25, var29).e((double)var31, (double)var34).p(1.0F, 1.0F, 1.0F, (float)var19).pJ();
            var18.i(var23, var25, var29).e((double)var32, (double)var34).p(1.0F, 1.0F, 1.0F, (float)var19).pJ();
            var18.i(var23, var25, var27).e((double)var32, (double)var33).p(1.0F, 1.0F, 1.0F, (float)var19).pJ();
         }
      }

   }

   public am rr() {
      if (this.Mj == null) {
         this.Mj = (am)this.aql.EM.G.Bn.h(am.class);
      }

      return this.Mj;
   }

   public sx eX() {
      return this.aql;
   }

   protected boolean d(zk var1) {
      return var1.yg() && var1.dg();
   }

   private void q(zk var1, double var2, double var4, double var6, float var8) {
      pz.nx();
      tU var9 = hS.eV().fA();
      tO var10 = var9.aw(y.q[2461 & -10847]);
      tO var11 = var9.aw(y.q[8507 & -30721]);
      pz.nE();
      pz.y((float)var2, (float)var4, (float)var6);
      float var12 = var1.gK * 1.4F;
      pz.u(var12, var12, var12);
      qk var13 = qk.pm();
      qq var14 = var13.pl();
      float var15 = 0.5F;
      float var16 = 0.0F;
      float var17 = var1.gJ / var12;
      float var18 = (float)(var1.aNK - var1.xE().bNT);
      pz.i(-this.aql.arC, 0.0F, 1.0F, 0.0F);
      pz.y(0.0F, 0.0F, -0.3F + (float)((int)var17) * 0.02F);
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      float var19 = 0.0F;
      int var20 = 0;
      boolean var21 = MV.pH();
      if (var21) {
         var14.r(OS.bSj);
      }

      var14.q(7, us.axW);

      while(var17 > 0.0F) {
         tO var22 = var20 % 2 == 0 ? var10 : var11;
         var14.e(var22);
         this.o(tU.awb);
         float var23 = var22.sp();
         float var24 = var22.sd();
         float var25 = var22.sj();
         float var26 = var22.sa();
         if (var20 / 2 % 2 == 0) {
            float var27 = var25;
            var25 = var23;
            var23 = var27;
         }

         var14.i((double)(var15 - var16), (double)(0.0F - var18), (double)var19).e((double)var25, (double)var26).pJ();
         var14.i((double)(-var15 - var16), (double)(0.0F - var18), (double)var19).e((double)var23, (double)var26).pJ();
         var14.i((double)(-var15 - var16), (double)(1.4F - var18), (double)var19).e((double)var23, (double)var24).pJ();
         var14.i((double)(var15 - var16), (double)(1.4F - var18), (double)var19).e((double)var25, (double)var24).pJ();
         var17 -= 0.45F;
         var18 -= 0.45F;
         var15 *= 0.9F;
         var19 += 0.03F;
         ++var20;
      }

      var13.pn();
      if (var21) {
         var14.r((OS)null);
         pz.nJ();
      }

      pz.nF();
      pz.oe();
   }

   protected rL(sx var1) {
      this.aql = var1;
   }

   private void q(zk var1, double var2, double var4, double var6, float var8, float var9) {
      if (!MV.Tf() || !net.optifine.shaders.F.cKF) {
         pz.nX();
         pz.P(770, 771);
         this.aql.CL.o(aqo);
         QI var10 = this.rq();
         pz.O(false);
         float var11 = this.aqm;
         if (var1 instanceof zx) {
            zx var12 = (zx)var1;
            var11 *= var12.zi();
            if (var12.yp()) {
               var11 *= 0.5F;
            }
         }

         double var35 = var1.aOD + (var1.aNZ - var1.aOD) * (double)var9;
         double var14 = var1.aNE + (var1.aNK - var1.aNE) * (double)var9;
         double var16 = var1.aOC + (var1.aOt - var1.aOC) * (double)var9;
         int var18 = Pq.D(var35 - (double)var11);
         int var19 = Pq.D(var35 + (double)var11);
         int var20 = Pq.D(var14 - (double)var11);
         int var21 = Pq.D(var14);
         int var22 = Pq.D(var16 - (double)var11);
         int var23 = Pq.D(var16 + (double)var11);
         double var24 = var2 - var35;
         double var26 = var4 - var14;
         double var28 = var6 - var16;
         qk var30 = qk.pm();
         qq var31 = var30.pl();
         var31.q(7, us.axL);

         for(NW var33 : NW.q(new NW(var18, var20, var22), new NW(var19, var21, var23))) {
            cv var34 = var10.g(var33.Vj()).ds();
            if (var34.cC() != -1 && var10.ar(var33) > 3) {
               this.q(var34, var2, var4, var6, var33, var8, var11, var24, var26, var28);
            }
         }

         var30.pn();
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         pz.nz();
         pz.O(true);
      }

   }

   protected void q(zk var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      this.q(var1, var8, var2, var4, var6, 64);
   }

   public boolean q(zk var1, rI var2, double var3, double var5, double var7) {
      NV var9 = var1.xE();
      if (var9.Vc() || var9.Vd() == 0.0D) {
         var9 = new NV(var1.aNZ - 2.0D, var1.aNK - 2.0D, var1.aOt - 2.0D, var1.aNZ + 2.0D, var1.aNK + 2.0D, var1.aOt + 2.0D);
      }

      return var1.c(var3, var5, var7) && (var1.aOw || var2.w(var9));
   }

   public boolean g(zk var1) {
      PJ var2 = this.f(var1);
      if (this.aqk != null) {
         var2 = this.aqk;
      }

      if (var2 == null) {
         return false;
      } else {
         this.o(var2);
         return true;
      }
   }

   protected abstract PJ f(zk var1);

   public void o(PJ var1) {
      this.aql.CL.o(var1);
   }

   public iS rs() {
      return this.aql.iv();
   }

   public void w(zk var1, double var2, double var4, double var6, float var8, float var9) {
      if (this.aql.EM != null) {
         if (this.aql.EM.aFy && this.aqm > 0.0F && !var1.xZ() && this.aql.ry()) {
            double var10 = this.aql.d(var1.aNZ, var1.aNK, var1.aOt);
            float var12 = (float)((1.0D - var10 / 256.0D) * (double)this.aqn);
            if (var12 > 0.0F) {
               this.q(var1, var2, var4, var6, var12, var9);
            }
         }

         if (var1.xF() && (!(var1 instanceof DD) || !((DD)var1).hm()) && this.aql.EM.G.Bn.atS().bi.af()) {
            this.q(var1, var2, var4, var6, var9);
         }
      }

   }

   public void e(zk var1, double var2, double var4, double var6, float var8, float var9) {
      this.w(var1, var2, var4, var6);
   }

   protected void q(zk var1, String var2, double var3, double var5, double var7, int var9) {
      double var10 = var1.B(this.aql.arL);
      if (var10 <= (double)(var9 * var9)) {
         iS var12 = this.rs();
         float var13 = 1.6F;
         float var14 = 0.016666668F * var13;
         pz.nE();
         pz.y((float)var3 + 0.0F, (float)var5 + var1.gJ + 0.5F, (float)var7);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         float var15 = this.aql.EM.G.Bn.dmB.cw(this.aql.arC);
         float var16 = this.aql.EM.G.Bn.dmB.cx(this.aql.arQ);
         if (this.aql.EM.G.Bn.dmB.J() && this.aql.EM.aCr == 2) {
            var15 += 180.0F;
         }

         pz.i(-var15, 0.0F, 1.0F, 0.0F);
         pz.i(this.aql.EM.aCr == 2 ? -var16 : var16, 1.0F, 0.0F, 0.0F);
         pz.u(-var14, -var14, var14);
         pz.nx();
         pz.O(false);
         pz.nW();
         pz.nX();
         pz.s(770, 771, 1, 0);
         qk var17 = qk.pm();
         qq var18 = var17.pl();
         byte var19 = 0;
         if (var2.equals(y.q[-32366 & 6531])) {
            var19 = -10;
         }

         am var20 = this.rr();
         boolean var21 = var1 instanceof iO && var20.dX.af() && this.aql.EM.G.Bn.ap(var1) && var2.equals(var1.dh().Vy());
         if (var20.dW.af()) {
            int var22 = var12.K(var2) / 2;
            if (var21) {
               var22 += 9;
            }

            pz.nC();
            var18.q(7, us.axK);
            var18.i((double)(-var22 - 1), (double)(-1 + var19), 0.0D).p(0.0F, 0.0F, 0.0F, 0.25F).pJ();
            var18.i((double)(-var22 - 1), (double)(8 + var19), 0.0D).p(0.0F, 0.0F, 0.0F, 0.25F).pJ();
            if (var21) {
               var22 -= 9;
            }

            var18.i((double)(var22 + 1), (double)(8 + var19), 0.0D).p(0.0F, 0.0F, 0.0F, 0.25F).pJ();
            var18.i((double)(var22 + 1), (double)(-1 + var19), 0.0D).p(0.0F, 0.0F, 0.0F, 0.25F).pJ();
            var17.pn();
         }

         if (var21) {
            pz.u(1.0F, 1.0F, 1.0F, 1.0F);
            pz.ob();
            pz.O(true);
            pz.nP();
            this.aql.EM.G.Bn.atQ().S(this.aql.EM.G.Bn.ao(var1));
            iT.q((double)(-var12.K(var2) / 2) - 9.5D, (double)(var19 - 1), 9.0F, 9.0F, 9.0D, 9.0D, 9.0D, 9.0D);
         }

         pz.nP();
         var12.w(var2, (float)(-var12.K(var2) / 2), (float)var19, 553648127, var20.dV.af());
         pz.ob();
         pz.O(true);
         var12.w(var2, (float)(-var12.K(var2) / 2), (float)var19, -1, var20.dV.af());
         pz.oe();
         pz.nz();
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         pz.nF();
      }

   }
}
