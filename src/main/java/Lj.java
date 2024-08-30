import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class lj extends pV {
   private static int Sb = yl.aLz.wA();
   private float Sc;
   private static final PJ Sd = new PJ(i.q[9022 & 20284]);
   private boolean Se;
   private boolean Sf;
   private static EX Sg = new EX(i.q[17279 & -27715], true, 45);
   private List Sh;
   private kz Si;
   private la Sj;
   private boolean Sk;
   private Fe Sl;

   public void q(int var1, int var2, float var3) {
      boolean var4 = Mouse.isButtonDown(0);
      int var5 = this.RZ;
      int var6 = this.RO;
      int var7 = var5 + 175;
      int var8 = var6 + 18;
      int var9 = var7 + 14;
      int var10 = var8 + 112;
      if (!this.Sk && var4 && var1 >= var7 && var2 >= var8 && var1 < var9 && var2 < var10) {
         this.Sf = this.kI();
      }

      if (!var4) {
         this.Sf = false;
      }

      this.Sk = var4;
      if (this.Sf) {
         this.Sc = ((float)(var2 - var8) - 7.5F) / ((float)(var10 - var8) - 15.0F);
         this.Sc = Pq.n(this.Sc, 0.0F, 1.0F);
         ((lk)this.RV).i(this.Sc);
      }

      super.q(var1, var2, var3);

      for(yl var14 : yl.aLJ) {
         if (this.q(var14, var1, var2)) {
            break;
         }
      }

      if (this.Sl != null && Sb == yl.aLy.wA() && this.u(this.Sl.bpV, this.Sl.bpR, 16, 16, var1, var2)) {
         this.e(uI.q(i.q[826 & 9150]), var1, var2);
      }

      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      pz.nx();
   }

   public void o() {
      if (this.G.Cu.lA()) {
         super.o();
         this.Mt.clear();
         Keyboard.enableRepeatEvents(true);
         this.Si = new kz(0, this.CB, this.RZ + 82, this.RO + 6, 89, this.CB.Gf);
         this.Si.bb(15);
         this.Si.H(false);
         this.Si.G(false);
         this.Si.aZ(16777215);
         int var1 = Sb;
         Sb = -1;
         this.w(yl.aLJ[var1]);
         this.Sj = new la(this.G);
         this.G.CM.bdW.w(this.Sj);
      } else {
         this.G.r(new lq(this.G.CM));
      }

   }

   protected void q(char var1, int var2) {
      if (Sb != yl.aLO.wA()) {
         if (vL.q(this.G.Br.aDM)) {
            this.w(yl.aLO);
         } else {
            super.q(var1, var2);
         }
      } else {
         if (this.Se) {
            this.Se = false;
            this.Si.Y(q.q[-30719 & 16404]);
         }

         if (!this.bl(var2)) {
            if (this.Si.t(var1, var2)) {
               this.kJ();
            } else {
               super.q(var1, var2);
            }
         }
      }

   }

   public void p() {
      if (!this.G.Cu.lA()) {
         this.G.r(new lq(this.G.CM));
      }

      this.kH();
   }

   protected void j(int var1, int var2) {
      yl var3 = yl.aLJ[Sb];
      if (var3.wG()) {
         pz.nz();
         this.CB.q(uI.q(var3.wJ()), 8, 6, 4210752);
      }

   }

   protected void w(int var1, int var2, int var3) {
      if (var3 == 0) {
         int var4 = var1 - this.RZ;
         int var5 = var2 - this.RO;

         for(yl var9 : yl.aLJ) {
            if (this.w(var9, var4, var5)) {
               this.w(var9);
               return;
            }
         }
      }

      super.w(var1, var2, var3);
   }

   protected boolean q(yl var1, int var2, int var3) {
      int var4 = var1.wL();
      int var5 = 28 * var4;
      int var6 = 0;
      if (var4 == 5) {
         var5 = this.RQ - 28 + 2;
      } else if (var4 > 0) {
         var5 += var4;
      }

      if (var1.wK()) {
         var6 = var6 - 32;
      } else {
         var6 = var6 + this.RF;
      }

      if (this.u(var5 + 3, var6 + 3, 23, 27, var2, var3)) {
         this.e(uI.q(var1.wJ()), var2, var3);
         return true;
      } else {
         return false;
      }
   }

   public void aL() {
      super.aL();
      if (this.G.CM != null && this.G.CM.bdM != null) {
         this.G.CM.bdW.q(this.Sj);
      }

      Keyboard.enableRepeatEvents(false);
   }

   public lj(DD var1) {
      super(new lk(var1));
      var1.bdQ = this.RV;
      this.MA = true;
      this.RF = 136;
      this.RQ = 195;
   }

   protected void q(iU var1) {
      if (var1.aq == 0) {
         this.G.r(new kR(this, this.G.CM.hw()));
      }

      if (var1.aq == 1) {
         this.G.r(new kS(this, this.G.CM.hw()));
      }

   }

   // $FF: synthetic method
   static EX kG() {
      return Sg;
   }

   protected boolean w(yl var1, int var2, int var3) {
      int var4 = var1.wL();
      int var5 = 28 * var4;
      int var6 = 0;
      if (var4 == 5) {
         var5 = this.RQ - 28 + 2;
      } else if (var4 > 0) {
         var5 += var4;
      }

      if (var1.wK()) {
         var6 = var6 - 32;
      } else {
         var6 = var6 + this.RF;
      }

      return var2 >= var5 && var2 <= var5 + 28 && var3 >= var6 && var3 <= var6 + 32;
   }

   protected void kH() {
      int var1 = this.RZ;
      super.kH();
      if (this.Si != null && this.RZ != var1) {
         this.Si.Gv = this.RZ + 82;
      }

   }

   private boolean kI() {
      return Sb != yl.aLy.wA() && yl.aLJ[Sb].wz() && ((lk)this.RV).kL();
   }

   protected void w(float var1, int var2, int var3) {
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      qh.pk();
      yl var4 = yl.aLJ[Sb];

      for(yl var8 : yl.aLJ) {
         this.G.fJ().o(Sd);
         if (var8.wA() != Sb) {
            this.e(var8);
         }
      }

      this.G.fJ().o(new PJ(i.q[32575 & 827] + var4.wD()));
      this.e(this.RZ, this.RO, 0, 0, this.RQ, this.RF);
      this.Si.kh();
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      int var9 = this.RZ + 175;
      int var10 = this.RO + 18;
      int var11 = var10 + 112;
      this.G.fJ().o(Sd);
      if (var4.wz()) {
         this.e(var9, var10 + (int)((float)(var11 - var10 - 17) * this.Sc), 232 + (this.kI() ? 0 : 12), 0, 12, 15);
      }

      this.e(var4);
      if (var4 == yl.aLy) {
         lq.q(this.RZ + 43, this.RO + 45, 20, (float)(this.RZ + 43 - var2), (float)(this.RO + 45 - 30 - var3), this.G.CM);
      }

   }

   protected void q(GX var1, int var2, int var3) {
      if (Sb == yl.aLO.wA()) {
         List var4 = var1.r(this.G.CM, this.G.Br.aCO);
         yl var5 = var1.do1().HA();
         if (var5 == null && var1.do1() == Et.blC) {
            Map var6 = yS.z(var1);
            if (var6.size() == 1) {
               yH var7 = yH.dt(((Integer)var6.keySet().iterator().next()).intValue());

               for(yl var11 : yl.aLJ) {
                  if (var11.q(var7.aMc)) {
                     var5 = var11;
                     break;
                  }
               }
            }
         }

         if (var5 != null) {
            var4.add(1, q.q[-24158 & 16396] + OJ.bQo + OJ.bQg + uI.q(var5.wJ()));
         }

         for(int var12 = 0; var12 < var4.size(); ++var12) {
            if (var12 == 0) {
               var4.set(var12, var1.Ij().bqM + (String)var4.get(var12));
            } else {
               var4.set(var12, OJ.bQe + (String)var4.get(var12));
            }
         }

         this.q(var4, var2, var3);
      } else {
         super.q(var1, var2, var3);
      }

   }

   private void kJ() {
      lk var1 = (lk)this.RV;
      var1.Sm.clear();

      for(Fm var3 : Fm.bqX) {
         if (var3 != null && var3.HA() != null) {
            var3.w(var3, (yl)null, var1.Sm);
         }
      }

      for(yH var5 : yH.aMw) {
         if (var5 != null && var5.aMc != null) {
            Et.blC.q(var5, var1.Sm);
         }
      }

      Iterator var9 = var1.Sm.iterator();
      String var11 = this.Si.aZ().toLowerCase();

      while(var9.hasNext()) {
         GX var12 = (GX)var9.next();
         boolean var13 = false;

         for(String var7 : var12.r(this.G.CM, this.G.Br.aCO)) {
            if (OJ.de(var7).toLowerCase().contains(var11)) {
               var13 = true;
               break;
            }
         }

         if (!var13) {
            var9.remove();
         }
      }

      this.Sc = 0.0F;
      var1.i(0.0F);
   }

   protected void q(Fe var1, int var2, int var3, int var4) {
      this.Se = true;
      boolean var5 = var4 == 1;
      var4 = var2 == -999 && var4 == 0 ? 4 : var4;
      if (var1 == null && Sb != yl.aLy.wA() && var4 != 5) {
         DJ var15 = this.G.CM.bdM;
         if (var15.Gz() != null) {
            if (var3 == 0) {
               this.G.CM.w(var15.Gz(), true);
               this.G.Cu.s(var15.Gz());
               var15.I((GX)null);
            }

            if (var3 == 1) {
               GX var17 = var15.Gz().fp(1);
               this.G.CM.w(var17, true);
               this.G.Cu.s(var17);
               if (var15.Gz().bsH == 0) {
                  var15.I((GX)null);
               }
            }
         }
      } else if (var1 == this.Sl && var5) {
         for(int var14 = 0; var14 < this.G.CM.bdW.Hb().size(); ++var14) {
            this.G.Cu.q((GX)null, var14);
         }
      } else if (Sb == yl.aLy.wA()) {
         if (var1 == this.Sl) {
            this.G.CM.bdM.I((GX)null);
         } else if (var4 == 4 && var1 != null && var1.kM()) {
            GX var6 = var1.bm(var3 == 0 ? 1 : var1.kO().Id());
            this.G.CM.w(var6, true);
            this.G.Cu.s(var6);
         } else if (var4 == 4 && this.G.CM.bdM.Gz() != null) {
            this.G.CM.w(this.G.CM.bdM.Gz(), true);
            this.G.Cu.s(this.G.CM.bdM.Gz());
            this.G.CM.bdM.I((GX)null);
         } else {
            this.G.CM.bdW.q(var1 == null ? var2 : ll.q((ll)var1).bpS, var3, var4, this.G.CM);
            this.G.CM.bdW.Ha();
         }
      } else if (var4 != 5 && var1.bpT == Sg) {
         DJ var13 = this.G.CM.bdM;
         GX var7 = var13.Gz();
         GX var8 = var1.kO();
         if (var4 == 2) {
            if (var8 != null && var3 >= 0 && var3 < 9) {
               GX var19 = var8.HW();
               var19.bsH = var19.Id();
               this.G.CM.bdM.y(var3, var19);
               this.G.CM.bdW.Ha();
            }

            return;
         }

         if (var4 == 3) {
            if (var13.Gz() == null && var1.kM()) {
               GX var18 = var1.kO().HW();
               var18.bsH = var18.Id();
               var13.I(var18);
            }

            return;
         }

         if (var4 == 4) {
            if (var8 != null) {
               GX var9 = var8.HW();
               var9.bsH = var3 == 0 ? 1 : var9.Id();
               this.G.CM.w(var9, true);
               this.G.Cu.s(var9);
            }

            return;
         }

         if (var7 != null && var8 != null && var7.ai(var8)) {
            if (var3 == 0) {
               if (var5) {
                  var7.bsH = var7.Id();
               } else if (var7.bsH < var7.Id()) {
                  ++var7.bsH;
               }
            } else if (var7.bsH <= 1) {
               var13.I((GX)null);
            } else {
               --var7.bsH;
            }
         } else if (var8 != null && var7 == null) {
            var13.I(GX.ak(var8));
            var7 = var13.Gz();
            if (var5) {
               var7.bsH = var7.Id();
            }
         } else {
            var13.I((GX)null);
         }
      } else {
         this.RV.q(var1 == null ? var2 : var1.bpS, var3, var4, this.G.CM);
         if (Ev.eY(var3) == 2) {
            for(int var11 = 0; var11 < 9; ++var11) {
               this.G.Cu.q(this.RV.eZ(45 + var11).kO(), 36 + var11);
            }
         } else if (var1 != null) {
            GX var12 = this.RV.eZ(var1.bpS).kO();
            this.G.Cu.q(var12, var1.bpS - this.RV.boC.size() + 9 + 36);
         }
      }

   }

   private void w(yl var1) {
      int var2 = Sb;
      Sb = var1.wA();
      lk var3 = (lk)this.RV;
      this.RD.clear();
      var3.Sm.clear();
      var1.s(var3.Sm);
      if (var1 == yl.aLy) {
         Ev var4 = this.G.CM.bdW;
         if (this.Sh == null) {
            this.Sh = var3.boC;
         }

         var3.boC = Lists.newArrayList();

         for(int var5 = 0; var5 < var4.boC.size(); ++var5) {
            ll var6 = new ll(this, (Fe)var4.boC.get(var5), var5);
            var3.boC.add(var6);
            if (var5 >= 5 && var5 < 9) {
               int var10 = var5 - 5;
               int var11 = var10 / 2;
               int var12 = var10 % 2;
               var6.bpV = 9 + var11 * 54;
               var6.bpR = 6 + var12 * 27;
            } else if (var5 >= 0 && var5 < 5) {
               var6.bpR = -2000;
               var6.bpV = -2000;
            } else if (var5 < var4.boC.size()) {
               int var7 = var5 - 9;
               int var8 = var7 % 9;
               int var9 = var7 / 9;
               var6.bpV = 9 + var8 * 18;
               if (var5 >= 36) {
                  var6.bpR = 112;
               } else {
                  var6.bpR = 54 + var9 * 18;
               }
            }
         }

         this.Sl = new Fe(Sg, 0, 173, 112);
         var3.boC.add(this.Sl);
      } else if (var2 == yl.aLy.wA()) {
         var3.boC = this.Sh;
         this.Sh = null;
      }

      if (this.Si != null) {
         if (var1 == yl.aLO) {
            this.Si.G(true);
            this.Si.F(false);
            this.Si.I(true);
            this.Si.Y(q.q[264 & -31036]);
            this.kJ();
         } else {
            this.Si.G(false);
            this.Si.F(true);
            this.Si.I(false);
         }
      }

      this.Sc = 0.0F;
      var3.i(0.0F);
   }

   public void aJ() {
      super.aJ();
      int var1 = Mouse.getEventDWheel();
      if (var1 != 0 && this.kI()) {
         int var2 = ((lk)this.RV).Sm.size() / 9 - 5;
         if (var1 > 0) {
            var1 = 1;
         }

         if (var1 < 0) {
            var1 = -1;
         }

         this.Sc = (float)((double)this.Sc - (double)var1 / (double)var2);
         this.Sc = Pq.n(this.Sc, 0.0F, 1.0F);
         ((lk)this.RV).i(this.Sc);
      }

   }

   public int kK() {
      return Sb;
   }

   protected void e(yl var1) {
      boolean var2 = var1.wA() == Sb;
      boolean var3 = var1.wK();
      int var4 = var1.wL();
      int var5 = var4 * 28;
      int var6 = 0;
      int var7 = this.RZ + 28 * var4;
      int var8 = this.RO;
      byte var9 = 32;
      if (var2) {
         var6 += 32;
      }

      if (var4 == 5) {
         var7 = this.RZ + this.RQ - 28;
      } else if (var4 > 0) {
         var7 += var4;
      }

      if (var3) {
         var8 = var8 - 28;
      } else {
         var6 += 64;
         var8 = var8 + (this.RF - 4);
      }

      pz.nx();
      this.e(var7, var8, var5, var6, 28, var9);
      this.Gr = 100.0F;
      this.MB.Gr = 100.0F;
      var7 = var7 + 6;
      var8 = var8 + 8 + (var3 ? 1 : -1);
      pz.oe();
      pz.od();
      GX var10 = var1.wB();
      this.MB.e(var10, var7, var8);
      this.MB.q(this.CB, var10, var7, var8);
      pz.nx();
      this.MB.Gr = 0.0F;
      this.Gr = 0.0F;
   }

   protected void q(int var1, int var2, int var3) {
      if (var3 == 0) {
         int var4 = var1 - this.RZ;
         int var5 = var2 - this.RO;

         for(yl var9 : yl.aLJ) {
            if (this.w(var9, var4, var5)) {
               return;
            }
         }
      }

      super.q(var1, var2, var3);
   }
}
