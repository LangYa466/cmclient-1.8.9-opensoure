import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class agc {
   private double dtA;
   private double dtB;
   private final ab dtC;
   private final am dtD;
   public static final float[] dtE = new float[16434 & 1616];
   public boolean dtF = (boolean)(-31644 & 2);
   public agi dtG;
   public afZ dtH;
   private double dtI;
   private final acj dtJ = new acj();
   private int bSt = 2056 & 1073;
   public GX dtK = null;
   public boolean dtL = (boolean)(-30207 & 24643);
   public static final FloatBuffer dtM = BufferUtils.createFloatBuffer(8208 & 18460);
   private final hS dtN;
   private final agd dtO;
   public float dtP = 0.0F;
   private boolean dtQ;
   public afY dtR;
   public agj dtS;
   private final acm dtT = new acm();

   public void kW(int var1) {
      if (this.dtR != null) {
         this.dtR.q(this.dtO);
      }

      this.dtR = null;
      this.dtG = null;
      this.bSt = var1;
   }

   public void q(zz var1, afY var2) {
      if (var2 != null) {
         afE var3 = (afE)this.dtH.dtn.dsK.get(var2.avl());
         if (var3 != null) {
            agi var4 = new agi(var3);
            var4.dtW = var2.dtk;
            if (var2.dtk > (8961 & -28603)) {
               var4.dua = (boolean)(20737 & 2633);
            }

            if (!this.avr()) {
               this.bSt = -23547 & 22669;
            }

            this.dtO.acH = var1;
            if (this.dtR != null) {
               this.dtR.q(this.dtO);
            }

            this.dtG = var4;
            this.dtR = var2;
            this.dtR.w(this.dtO);
            if (this.dtN.Br.aCr != (-32222 & 20494) && var1 == this.dtN.CM) {
               this.dtF = (boolean)(2145 & 9227);
               this.dtN.Br.aCr = 2058 & -31790;
            }
         }
      }

   }

   private void q(zz var1, GX var2, afF var3, agk var4, String var5, float var6, boolean var7) {
      Fm var8 = var2.do1();
      afG var9 = (afG)var3.dsi.get(var5);
      if (var9 != null) {
         pz.nE();
         this.e(var9);
         if (!var7) {
            pz.y(0.24489796F * 0.25520834F * (2.0F - 2.486842F * 1.2063493F * (1.0F - this.dtP)), -0.19836958F * 0.63013697F, 2.1F * 0.08928572F);
            pz.i(32.92683F * 2.7333333F, 0.0F, 0.0F, 1.0F);
            pz.i(0.8958333F * -50.23256F, 0.0F, 1.0F, 0.0F);
         } else {
            pz.y(0.0F, 0.72289157F * -0.08645833F, 2.3235295F * 0.026898734F);
         }

         pz.u(var6 * var4.Xu, var6 * var4.WZ, var6 * var4.Xa);
         if (var8 instanceof FO && cv.q(var8).cC() == (6918 & -32637)) {
            pz.y(0.0F, 1.05F * 0.17857143F, 6.857143F * -0.045572918F);
            pz.i(32.5F * 0.61538464F, 1.0F, 0.0F, 0.0F);
            pz.i(1.4210527F * 31.666666F, 0.0F, 1.0F, 0.0F);
            pz.u(-0.1875F * 2.0F, 0.47619048F * -0.7875F, 0.93333334F * 0.4017857F);
         }

         this.dtN.ff().q(var1, var2, qM.ang);
         pz.nF();
      }

   }

   public boolean avr() {
      return (boolean)(this.dtG != null && this.bSt <= 0 ? 20803 & -30691 : 1361 & 14504);
   }

   private void u(zz var1, float var2) {
      for(aga var4 : this.dtH.dsH) {
         if (var4.dsM.aM) {
            var4.q((agb)this.dtS.dud.get(var4.av));
         }
      }

   }

   public void avs() {
      this.kW(8413 & -16379);
   }

   public void C(zz var1) {
      if (this.dtG != null && this.bSt <= 0) {
         this.dtG.aW();
         double var2 = var1.aNZ - this.dtB;
         double var4 = var1.aNK - this.dtI;
         double var6 = var1.aOt - this.dtA;
         int var8 = var2 * var2 + var4 * var4 + var6 * var6 > 1.0D * 0.0025000000000000005D ? 325 & -20421 : -31728 & 24613;
         int var9 = var1.aQh && var1.TM == 0.0F && !var1.zV() ? 18721 & 8727 : -27616 & 25222;
         int var10 = !var1.hI() && var8 == 0 && var9 == 0 ? 10570 & 4100 : -24551 & 2567;
         if (this.dtG.avu() || var10 != 0) {
            this.dtO.acH = var1;
            if (var10 != 0) {
               this.kW(27060 & -32757);
            } else {
               this.avs();
            }
         }
      }

      if (this.bSt >= 0) {
         if (this.dtF && this.dtG == null && this.bSt == 0) {
            this.dtF = (boolean)(20482 & 2565);
            this.dtN.Br.aCr = 21761 & -32024;
         }

         this.bSt -= 1025 & -22397;
      }

      this.dtB = var1.aNZ;
      this.dtI = var1.aNK;
      this.dtA = var1.aOt;
   }

   public void q(iO var1, sG var2, afF var3, double var4, double var6, double var8, float var10) {
      if (this.dtH != null && !this.dtH.dsH.isEmpty()) {
         float var11 = var1.aQS + (var1.aQB - var1.aQS) * var10;
         float var12 = this.dtS.iH;
         GL11.glPushMatrix();
         GL11.glTranslated(var4, var6, var8);
         GL11.glScalef(var12, var12, var12);
         GL11.glRotatef(63.75F * 2.8235295F - (var11 - 0.49382716F * 364.5F), 0.0F, 1.0F, 0.0F);
         this.q(var1, var2, var3, var11, var10);
         GL11.glPopMatrix();
      }

   }

   private void q(zz var1, afG var2) {
      GX var3 = var1.dP(-27377 & 644);
      if (var3 != null && var2 != null) {
         Fm var4 = var3.do1();
         if (!(var4 instanceof FH) || ((FH)var4).brm != (24612 & 1029)) {
            pz.nE();
            this.e(var2);
            pz.y(0.0F, 0.6086956F * 0.4107143F, 0.0F);
            if (!(var4 instanceof GR)) {
               pz.i(320.86957F * 0.5609756F, 0.0F, 1.0F, 0.0F);
            } else {
               pz.y(0.0F, 0.5F * 0.1F, 0.0F);
            }

            pz.u(0.6377551F * 0.98F, 0.35869566F * 1.7424242F, 4.125F * 0.15151516F);
            this.dtN.ff().q(var1, var3, qM.ani);
            pz.nF();
         }
      }

   }

   private void q(zz var1, afF var2) {
      if (this.dtS.duf) {
         float var3 = this.dtS.duc;
         GX var4 = var1.zg();
         if (this.dtK != null) {
            if (this.dtP > 0.0F) {
               for(agk var6 : this.dtL ? this.dtS.due.values() : this.dtS.dui.values()) {
                  this.q(var1, this.dtK, var2, var6, var6.duk, var3 * this.dtP, this.dtL);
               }
            }
         } else if (var4 != null && this.dtS.due != null) {
            for(agk var8 : this.dtS.due.values()) {
               this.q(var1, var4, var2, var8, var8.duk, var3, (boolean)(2129 & 28961));
            }
         }
      }

   }

   public void w(iO var1, double var2, double var4, double var6) {
      sx var8 = this.dtN.eX();
      double var9 = var1.B(var8.arL);
      double var11 = 1216.0D * 0.05263157894736842D;
      String var13 = var1.dh().Vy();
      if (var9 <= var11 * var11) {
         iS var14 = var8.iv();
         float var15 = 2.445283F * 0.654321F;
         float var16 = 0.24731183F * 0.067391306F * var15;
         pz.nE();
         pz.y((float)var2 + 0.0F, (float)var4 + var1.gJ + 0.33928573F * 1.4736842F, (float)var6);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         float var17 = this.dtN.Bn.dmB.cw(this.dtN.eX().arC);
         float var18 = this.dtN.Bn.dmB.cx(this.dtN.eX().arQ);
         if (this.dtN.Bn.dmB.J() && this.dtN.Br.aCr == (-25006 & 8230)) {
            var17 += 0.53731346F * 334.99997F;
         }

         pz.i(-var17, 0.0F, 1.0F, 0.0F);
         pz.i(this.dtN.Br.aCr == (5130 & 27123) ? -var18 : var18, 1.0F, 0.0F, 0.0F);
         pz.u(-var16, -var16, var16);
         pz.nx();
         pz.O((boolean)(2673 & 1280));
         pz.nW();
         pz.nX();
         pz.s(-31870 & 17186, 17351 & 12051, 4229 & 16931, 8205 & 2);
         qk var19 = qk.pm();
         qq var20 = var19.pl();
         int var21 = -32743 & 29346;
         if (var13.equals(y.q[14738 & 24986 & 7651 & 7667])) {
            var21 = -2 & -10;
         }

         int var22 = this.dtD.dX.af() && this.dtN.Bn.ap(var1) ? 325 & 3089 : -16112 & 1196;
         if (this.dtD.dW.af()) {
            int var23 = var14.K(var13) / (21542 & -32110);
            if (var22 != 0) {
               var23 += 9;
            }

            pz.nC();
            var20.q(24679 & -30329, us.axK);
            var20.i((double)(-var23 - (3 & 12837)), (double)((-1 & -1) + var21), 0.0D).p(0.0F, 0.0F, 0.0F, 0.24000001F * 1.0416666F).pJ();
            var20.i((double)(-var23 - (20741 & 1105)), (double)((9004 & 24) + var21), 0.0D).p(0.0F, 0.0F, 0.0F, 1.5833334F * 0.15789473F).pJ();
            if (var22 != 0) {
               var23 -= 9;
            }

            var20.i((double)(var23 + (16593 & -22525)), (double)((-24562 & 137) + var21), 0.0D).p(0.0F, 0.0F, 0.0F, 0.21698114F * 1.1521739F).pJ();
            var20.i((double)(var23 + (3093 & 809)), (double)((-1 & -1) + var21), 0.0D).p(0.0F, 0.0F, 0.0F, 2.317073F * 0.10789474F).pJ();
            var19.pn();
         }

         if (var22 != 0) {
            pz.u(1.0F, 1.0F, 1.0F, 1.0F);
            pz.ob();
            pz.O((boolean)(-31743 & 25417));
            pz.nP();
            this.dtN.Bn.atQ().S(this.dtN.Bn.ao(var1));
            iT.q((double)(-var14.K(var13) / (8210 & 1538)) - 0.7160493827160493D * 13.267241379310345D, (double)(var21 - (5897 & 101)), 0.67058825F * 13.421052F, 8.612904F * 1.0449438F, 8.375D * 1.0746268656716418D, 7.35D * 1.2244897959183674D, 3.9886363636363638D * 2.2564102564102564D, 3.25D * 2.769230769230769D);
         }

         pz.nP();
         var14.w(var13, (float)(-var14.K(var13) / (-18110 & 562)), (float)var21, 570425343 & 1828716543, this.dtD.dV.af());
         pz.ob();
         pz.O((boolean)(-31151 & 2187));
         var14.w(var13, (float)(-var14.K(var13) / (6162 & 1955)), (float)var21, -1 & -1, this.dtD.dV.af());
         pz.oe();
         pz.nz();
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         pz.nF();
      }

   }

   public agc(afZ var1, agj var2) {
      this.dtH = var1;
      this.dtS = new agj();
      this.dtS.q(var2);
      this.dtN = hS.eV();
      this.dtO = new agd(this);
      this.dtC = (ab)this.dtN.Bn.h(ab.class);
      this.dtD = (am)this.dtN.Bn.h(am.class);
   }

   public acm q(zz var1, afG var2, float var3, float var4, float var5, float var6) {
      this.dtT.l(var3, var4, var5, 1.0F);
      var2.dsn.q(this.dtT);
      this.dtJ.apf();
      this.dtJ.bS((0.77922076F * 231.0F - var1.aQB + 2844.0F * 0.06329114F) / (0.7373737F * 244.1096F) * 3.6861353F * 0.85227275F);
      this.dtJ.q(this.dtT);
      this.dtT.bT(this.dtS.iH);
      float var7 = (float)(var1.aOD + (var1.aNZ - var1.aOD) * (double)var6);
      float var8 = (float)(var1.aNE + (var1.aNK - var1.aNE) * (double)var6);
      float var9 = (float)(var1.aOC + (var1.aOt - var1.aOC) * (double)var6);
      this.dtT.bUa += var7;
      this.dtT.bUb += var8;
      this.dtT.bTZ += var9;
      return this.dtT;
   }

   public boolean q(iO var1, sG var2, double var3, double var5, double var7, float var9, boolean var10) {
      if (this.dtN.Bn.dmd && !var1.xZ() && this.dtC.J()) {
         if (this.avr()) {
            agb var11 = (agb)this.dtS.dud.get(r.q[3791 & -31922 & -12545 & 20198]);
            if (var11 != null) {
               PJ var12 = var1.ho();
               agb var13 = (agb)this.dtS.dud.get(y.q[-31751 & -15367 & 27499 & 30699]);
               agb var14 = (agb)this.dtS.dud.get(y.q[9194 & 3966 & 14186 & -26630]);
               agb var15 = (agb)this.dtS.dud.get(y.q[-11409 & -30849 & 13291 & 24571]);
               agb var16 = (agb)this.dtS.dud.get(y.q[-27778 & -22530 & 20476 & -12306]);
               agb var17 = (agb)this.dtS.dud.get(y.q[-18563 & -18579 & -15489 & 10239]);
               agb var18 = (agb)this.dtS.dud.get(y.q[2030 & 17390 & -23698 & -21505]);
               if (var11.dty == null || !var12.Xz().equals(var11.dty.Xz()) || !var12.XA().equals(var11.dty.XA())) {
                  var11.dty = var12;
                  var13.dty = var11.dty;
                  var14.dty = var11.dty;
                  var15.dty = var11.dty;
                  var16.dty = var11.dty;
                  var17.dty = var11.dty;
                  var18.dty = var11.dty;
               }

               var13.hW = var1.e(DI.bfl);
               var14.hW = var1.e(DI.bfg);
               var15.hW = var1.e(DI.bfh);
               var16.hW = var1.e(DI.bfj);
               var17.hW = var1.e(DI.bfi);
               var18.hW = var1.e(DI.bfk);
               var11.Gk = var13.Gk = var14.Gk = var15.Gk = var16.Gk = var17.Gk = var18.Gk = 1.0F;
               var11.hW = (boolean)(1121 & 16397);
               if (!this.dtQ && !var1.hq().equals(q.q[12721 & 8483 & -27255 & 32169])) {
                  this.dtH = this.dtN.Bn.dmf.dtd;
                  this.dtS.q(this.dtN.Bn.dmf.dth);
                  if (this.dtR != null) {
                     this.dtR.w(this.dtO);
                  }

                  this.dtQ = (boolean)(1209 & 6401);
               }
            }

            afF var19 = (afF)this.dtH.dtn.dsJ.get(y.q[12703 & 478 & 5631 & 4540]);
            this.q(var1, var2, var19, var3, var5, var7, var9);
            if (var10) {
               this.w(var1, var3, var5, var7);
            }
         }

         return this.avr();
      } else {
         return (boolean)(-31568 & 4612);
      }
   }

   public void e(afG var1) {
      acj var2 = var1.dsn;
      dtM.clear();
      dtM.put(var2.o(dtE));
      dtM.flip();
      GL11.glMultMatrix(dtM);
   }

   private void q(iO var1, sG var2, afF var3, float var4, float var5) {
      afG var6 = (afG)var3.dsi.get(this.dtS.dug);
      if (var6 != null) {
         float var7 = var1.aQj + (var1.aQu - var1.aQj) * var5;
         float var8 = var1.aOr + (var1.aNN - var1.aOr) * var5;
         var7 = (var4 - var7) / (828.0F * 0.2173913F) * 2.4085543F * 1.3043479F;
         var6.dsm = var8 / (10.97561F * 16.4F) * 1.0232558F * 3.0701928F;
         var6.dso = var7;
      }

      if (this.dtG != null) {
         this.dtG.q(var3, var5);
      }

      for(afG var12 : var3.dsg) {
         var3.dsh[var12.apI] = var12.avi();
         var12.pK();
      }

      for(aga var13 : this.dtH.dsH) {
         var13.aW();
      }

      GL11.glEnable(419595322 & -1067388869);
      this.u(var1, var5);
      GL11.glDisable(597746111 & 5015610);
      this.q(var1, var3);
      this.q(var1, var6);
      this.dtN.Bn.dmD.q(var1, var2, this, 0.0F, 1.0769231F * 0.058035713F);
   }
}
