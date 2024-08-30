import java.util.Map;
import java.util.WeakHashMap;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class kx {
   protected int Ok;
   protected final hS Ol;
   protected int eo;
   private boolean aM = true;
   protected final int Om;
   protected ail On;
   protected float Oo;
   public int Op;
   protected int ix;
   protected boolean Oq = true;
   protected boolean Or = true;
   protected int Os = -2;
   protected int Ot;
   protected int iy;
   protected boolean Ou = true;
   protected int Ov = -1;
   protected final Map Ow;
   protected long Ox;
   protected double Oy = 0.0D;
   protected int Oz;
   protected float OA;
   protected boolean OB;
   protected int OC;
   protected int OD;
   protected int eC;
   public int OE;

   protected int bi() {
      return this.bh() * this.Om + this.OC;
   }

   protected int bj() {
      return this.eo / 2 + 124;
   }

   public void aS(int var1) {
      this.OA += (float)var1;
      this.jT();
      this.Os = -2;
   }

   protected abstract void w(int var1, int var2, int var3, int var4, int var5, int var6);

   protected void q(qk var1) {
      qq var2 = var1.pl();
      this.Ol.fJ().o(iT.Gp);
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      float var3 = 32.0F;
      var2.q(7, us.axL);
      var2.i((double)this.OD, (double)this.Oz, 0.0D).e((double)((float)this.OD / var3), (double)((float)(this.Oz + (int)this.OA) / var3)).v(32, 32, 32, 255).pJ();
      var2.i((double)this.Ok, (double)this.Oz, 0.0D).e((double)((float)this.Ok / var3), (double)((float)(this.Oz + (int)this.OA) / var3)).v(32, 32, 32, 255).pJ();
      var2.i((double)this.Ok, (double)this.Ot, 0.0D).e((double)((float)this.Ok / var3), (double)((float)(this.Ot + (int)this.OA) / var3)).v(32, 32, 32, 255).pJ();
      var2.i((double)this.OD, (double)this.Ot, 0.0D).e((double)((float)this.OD / var3), (double)((float)(this.Ot + (int)this.OA) / var3)).v(32, 32, 32, 255).pJ();
      var1.pn();
   }

   protected abstract int bh();

   public int jR() {
      return this.Om;
   }

   public void E(boolean var1) {
      this.Or = var1;
   }

   public int jS() {
      return (int)this.OA;
   }

   protected void h(int var1, int var2, int var3) {
   }

   public void q(int var1, int var2, float var3) {
      if (this.Oq) {
         this.ix = var1;
         this.iy = var2;
         this.bg();
         int var4 = this.bj();
         boolean var5 = this.Ol.Bn.atS().bB.af();
         boolean var6 = this.Ol.Bn.atS().bj.af();
         int var7 = var4 + (var6 ? 3 : 6);
         this.jT();
         pz.nx();
         pz.og();
         qk var8 = qk.pm();
         qq var9 = var8.pl();
         if (!this.Ol.Bn.atS().bo.af()) {
            this.Ol.fJ().o(iT.Gp);
            pz.u(1.0F, 1.0F, 1.0F, 1.0F);
            float var10 = 32.0F;
            var9.q(7, us.axL);
            var9.i((double)this.OD, (double)this.Oz, 0.0D).e((double)((float)this.OD / var10), (double)((float)(this.Oz + (int)this.OA) / var10)).v(32, 32, 32, 255).pJ();
            var9.i((double)this.Ok, (double)this.Oz, 0.0D).e((double)((float)this.Ok / var10), (double)((float)(this.Oz + (int)this.OA) / var10)).v(32, 32, 32, 255).pJ();
            var9.i((double)this.Ok, (double)this.Ot, 0.0D).e((double)((float)this.Ok / var10), (double)((float)(this.Ot + (int)this.OA) / var10)).v(32, 32, 32, 255).pJ();
            var9.i((double)this.OD, (double)this.Ot, 0.0D).e((double)((float)this.OD / var10), (double)((float)(this.Ot + (int)this.OA) / var10)).v(32, 32, 32, 255).pJ();
            var8.pn();
         }

         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         int var15 = this.OD + this.eo / 2 - this.iC() / 2 + 2;
         int var11 = this.Ot + 4 - (int)this.OA;
         if (this.OB) {
            this.q(var15, var11, var8);
         }

         if (!var5) {
            kJ var12 = this.Ol.Bn.atA();
            int var13 = var12.kq();
            GL11.glEnable(3089);
            GL11.glScissor(0, (this.eC - this.Oz) * var13, this.eo * var13, (this.Oz - this.Ot) * var13);
         }

         this.u(var15, var11, var1, var2);
         GL11.glDisable(3089);
         pz.nW();
         if (var5) {
            this.y(0, this.Ot, 255, 255);
            this.y(this.Oz, this.eC, 255, 255);
         }

         pz.nX();
         pz.s(770, 771, 0, 1);
         pz.nB();
         pz.bP(7425);
         pz.nC();
         if (var5) {
            pz.nW();
            byte var16 = 4;
            pz.nX();
            pz.s(770, 771, 0, 1);
            pz.nB();
            pz.bP(7425);
            pz.nC();
            var9.q(7, us.axL);
            var9.i((double)this.OD, (double)(this.Ot + var16), 0.0D).e(0.0D, 1.0D).v(0, 0, 0, 0).pJ();
            var9.i((double)this.Ok, (double)(this.Ot + var16), 0.0D).e(1.0D, 1.0D).v(0, 0, 0, 0).pJ();
            var9.i((double)this.Ok, (double)this.Ot, 0.0D).e(1.0D, 0.0D).v(0, 0, 0, 255).pJ();
            var9.i((double)this.OD, (double)this.Ot, 0.0D).e(0.0D, 0.0D).v(0, 0, 0, 255).pJ();
            var8.pn();
            var9.q(7, us.axL);
            var9.i((double)this.OD, (double)this.Oz, 0.0D).e(0.0D, 1.0D).v(0, 0, 0, 255).pJ();
            var9.i((double)this.Ok, (double)this.Oz, 0.0D).e(1.0D, 1.0D).v(0, 0, 0, 255).pJ();
            var9.i((double)this.Ok, (double)(this.Oz - var16), 0.0D).e(1.0D, 0.0D).v(0, 0, 0, 0).pJ();
            var9.i((double)this.OD, (double)(this.Oz - var16), 0.0D).e(0.0D, 0.0D).v(0, 0, 0, 0).pJ();
            var8.pn();
         }

         int var17 = this.jV();
         if (var17 > 0) {
            if (var6) {
               int var18 = (this.Oz - this.Ot) * (this.Oz - this.Ot) / this.bi();
               var18 = Pq.G(var18, 32, this.Oz - this.Ot - 8);
               int var14 = (int)this.OA * (this.Oz - this.Ot - var18) / var17 + this.Ot;
               if (var14 < this.Ot) {
                  var14 = this.Ot;
               }

               aix.q((double)((float)(var7 + var4) / 2.0F), (double)this.Ot, (double)((float)(var7 + var4) / 2.0F), (double)this.Oz, 1.0F, -8355712);
               aiD.w((float)var4, (float)var14, (float)(var7 - var4), (float)var18, 14737632);
            } else {
               int var20 = (this.Oz - this.Ot) * (this.Oz - this.Ot) / this.bi();
               var20 = Pq.G(var20, 32, this.Oz - this.Ot - 8);
               int var22 = (int)this.OA * (this.Oz - this.Ot - var20) / var17 + this.Ot;
               if (var22 < this.Ot) {
                  var22 = this.Ot;
               }

               var9.q(7, us.axL);
               var9.i((double)var4, (double)this.Oz, 0.0D).e(0.0D, 1.0D).v(0, 0, 0, 255).pJ();
               var9.i((double)var7, (double)this.Oz, 0.0D).e(1.0D, 1.0D).v(0, 0, 0, 255).pJ();
               var9.i((double)var7, (double)this.Ot, 0.0D).e(1.0D, 0.0D).v(0, 0, 0, 255).pJ();
               var9.i((double)var4, (double)this.Ot, 0.0D).e(0.0D, 0.0D).v(0, 0, 0, 255).pJ();
               var8.pn();
               var9.q(7, us.axL);
               var9.i((double)var4, (double)(var22 + var20), 0.0D).e(0.0D, 1.0D).v(128, 128, 128, 255).pJ();
               var9.i((double)var7, (double)(var22 + var20), 0.0D).e(1.0D, 1.0D).v(128, 128, 128, 255).pJ();
               var9.i((double)var7, (double)var22, 0.0D).e(1.0D, 0.0D).v(128, 128, 128, 255).pJ();
               var9.i((double)var4, (double)var22, 0.0D).e(0.0D, 0.0D).v(128, 128, 128, 255).pJ();
               var8.pn();
               var9.q(7, us.axL);
               var9.i((double)var4, (double)(var22 + var20 - 1), 0.0D).e(0.0D, 1.0D).v(192, 192, 192, 255).pJ();
               var9.i((double)(var7 - 1), (double)(var22 + var20 - 1), 0.0D).e(1.0D, 1.0D).v(192, 192, 192, 255).pJ();
               var9.i((double)(var7 - 1), (double)var22, 0.0D).e(1.0D, 0.0D).v(192, 192, 192, 255).pJ();
               var9.i((double)var4, (double)var22, 0.0D).e(0.0D, 0.0D).v(192, 192, 192, 255).pJ();
               var8.pn();
            }
         }

         this.b(var1, var2);
         pz.nP();
         pz.bP(7424);
         pz.hT();
         pz.nz();
      }

      this.aN();
   }

   protected abstract void bg();

   protected void jT() {
      this.OA = Pq.n(this.OA, 0.0F, (float)this.jV());
   }

   protected void y(int var1, int var2, int var3, int var4) {
      qk var5 = qk.pm();
      qq var6 = var5.pl();
      this.Ol.fJ().o(iT.Gp);
      pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = 32.0F;
      var6.q(7, us.axL);
      var6.i((double)this.OD, (double)var2, 0.0D).e(0.0D, (double)((float)var2 / 32.0F)).v(64, 64, 64, var4).pJ();
      var6.i((double)(this.OD + this.eo), (double)var2, 0.0D).e((double)((float)this.eo / 32.0F), (double)((float)var2 / 32.0F)).v(64, 64, 64, var4).pJ();
      var6.i((double)(this.OD + this.eo), (double)var1, 0.0D).e((double)((float)this.eo / 32.0F), (double)((float)var1 / 32.0F)).v(64, 64, 64, var3).pJ();
      var6.i((double)this.OD, (double)var1, 0.0D).e(0.0D, (double)((float)var1 / 32.0F)).v(64, 64, 64, var3).pJ();
      var5.pn();
   }

   protected abstract boolean x(int var1);

   public void aN() {
      if (this.aT(this.iy)) {
         if (Mouse.isButtonDown(0) && this.jW()) {
            if (this.Os != -1) {
               if (this.Os >= 0) {
                  this.OA -= (float)(this.iy - this.Os) * this.Oo;
                  this.Os = this.iy;
               }
            } else {
               boolean var1 = true;
               if (this.iy >= this.Ot && this.iy <= this.Oz) {
                  int var2 = (this.eo - this.iC()) / 2;
                  int var3 = (this.eo + this.iC()) / 2;
                  int var4 = this.iy - this.Ot - this.OC + (int)this.OA - 4;
                  int var5 = var4 / this.Om;
                  if (var5 < this.bh() && this.ix >= var2 && this.ix <= var3 && var5 >= 0 && var4 >= 0) {
                     boolean var6 = var5 == this.Ov && hS.fe() - this.Ox < 250L;
                     this.q(var5, var6, this.ix, this.iy);
                     this.Ov = var5;
                     this.Ox = hS.fe();
                  } else if (this.ix >= var2 && this.ix <= var3 && var4 < 0) {
                     this.n(this.ix - var2, this.iy - this.Ot + (int)this.OA - 4);
                     var1 = false;
                  }

                  int var10 = this.bj();
                  int var7 = var10 + 6;
                  if (this.ix >= var10 && this.ix <= var7) {
                     this.Oo = -1.0F;
                     int var8 = this.jV();
                     if (var8 < 1) {
                        var8 = 1;
                     }

                     int var9 = (int)((float)((this.Oz - this.Ot) * (this.Oz - this.Ot)) / (float)this.bi());
                     var9 = Pq.G(var9, 32, this.Oz - this.Ot - 8);
                     this.Oo /= (float)(this.Oz - this.Ot - var9) / (float)var8;
                  } else {
                     this.Oo = 1.0F;
                  }

                  if (var1) {
                     this.Os = this.iy;
                  } else {
                     this.Os = -2;
                  }
               } else {
                  this.Os = -2;
               }
            }
         } else {
            this.Os = -1;
         }

         if (Mouse.isButtonDown(0)) {
            this.jT();
         }
      }

   }

   public void w(boolean var1) {
      this.aM = var1;
   }

   protected void u(int var1, int var2, int var3, int var4) {
      if (this.Ol.Bn.atS().bp.af()) {
         int var5 = this.bh();

         for(int var6 = 0; var6 < var5; ++var6) {
            int var7 = var2 + var6 * this.Om + this.OC;
            int var8 = this.Om - 4;
            if (var7 > this.Oz || var7 + var8 < this.Ot) {
               this.h(var6, var1, var7);
            }

            if (this.Or) {
               int var9 = this.OD + (this.eo / 2 - this.iC() / 2);
               int var10 = this.OD + this.eo / 2 + this.iC() / 2;
               aeI var11 = (aeI)this.Ow.get(Integer.valueOf(var6));
               if (var11 == null) {
                  var11 = new aeI();
                  this.Ow.put(Integer.valueOf(var6), var11);
               }

               var11.q(this.x(var6) ? 1.0D : 0.0D, 0.4D, aeL.doc, true);
               var11.aub();
               if (var11.auf() > 0.0D) {
                  aix.q((double)var9, (double)(var7 - 2), (double)var9 + (double)(var10 - var9) * var11.auf(), (double)(var7 - 2), 1.0F, 14737632);
                  aix.q((double)var10 - (double)(var10 - var9) * var11.auf(), (double)(var7 - 2 + var8 + 4), (double)var10, (double)(var7 - 2 + var8 + 4), 1.0F, 14737632);
               }

               pz.u(1.0F, 1.0F, 1.0F, 1.0F);
            }

            this.w(var6, var1, var7, var8, var3, var4);
         }
      } else {
         int var13 = this.bh();
         qk var14 = qk.pm();
         qq var15 = var14.pl();

         for(int var16 = 0; var16 < var13; ++var16) {
            int var17 = var2 + var16 * this.Om + this.OC;
            int var18 = this.Om - 4;
            if (var17 > this.Oz || var17 + var18 < this.Ot) {
               this.h(var16, var1, var17);
            }

            if (this.Or && this.x(var16)) {
               int var19 = this.OD + (this.eo / 2 - this.iC() / 2);
               int var12 = this.OD + this.eo / 2 + this.iC() / 2;
               pz.u(1.0F, 1.0F, 1.0F, 1.0F);
               pz.nC();
               var15.q(7, us.axL);
               var15.i((double)var19, (double)(var17 + var18 + 2), 0.0D).e(0.0D, 1.0D).v(128, 128, 128, 255).pJ();
               var15.i((double)var12, (double)(var17 + var18 + 2), 0.0D).e(1.0D, 1.0D).v(128, 128, 128, 255).pJ();
               var15.i((double)var12, (double)(var17 - 2), 0.0D).e(1.0D, 0.0D).v(128, 128, 128, 255).pJ();
               var15.i((double)var19, (double)(var17 - 2), 0.0D).e(0.0D, 0.0D).v(128, 128, 128, 255).pJ();
               var15.i((double)(var19 + 1), (double)(var17 + var18 + 1), 0.0D).e(0.0D, 1.0D).v(0, 0, 0, 255).pJ();
               var15.i((double)(var12 - 1), (double)(var17 + var18 + 1), 0.0D).e(1.0D, 1.0D).v(0, 0, 0, 255).pJ();
               var15.i((double)(var12 - 1), (double)(var17 - 1), 0.0D).e(1.0D, 0.0D).v(0, 0, 0, 255).pJ();
               var15.i((double)(var19 + 1), (double)(var17 - 1), 0.0D).e(0.0D, 0.0D).v(0, 0, 0, 255).pJ();
               var14.pn();
               pz.nP();
            }

            this.w(var16, var1, var17, var18, var3, var4);
         }
      }

   }

   public int iC() {
      return 220;
   }

   public int jV() {
      return Math.max(0, this.bi() - (this.Oz - this.Ot - 4));
   }

   protected void q(int var1, int var2, qk var3) {
   }

   public boolean aT(int var1) {
      return var1 >= this.Ot && var1 <= this.Oz && this.ix >= this.OD && this.ix <= this.Ok;
   }

   protected abstract void q(int var1, boolean var2, int var3, int var4);

   public void q(iU var1) {
      if (var1.aM) {
         if (var1.aq == this.Op) {
            this.OA -= (float)(this.Om * 2 / 3);
            this.Os = -2;
            this.jT();
         } else if (var1.aq == this.OE) {
            this.OA += (float)(this.Om * 2 / 3);
            this.Os = -2;
            this.jT();
         }
      }

   }

   protected void w(boolean var1, int var2) {
      this.OB = var1;
      this.OC = var2;
      if (!var1) {
         this.OC = 0;
      }

   }

   public int c(int var1, int var2) {
      int var3 = this.OD + this.eo / 2 - this.iC() / 2;
      int var4 = this.OD + this.eo / 2 + this.iC() / 2;
      int var5 = var2 - this.Ot - this.OC + (int)this.OA - 4;
      int var6 = var5 / this.Om;
      return var1 < this.bj() && var1 >= var3 && var1 <= var4 && var6 >= 0 && var5 >= 0 && var6 < this.bh() ? var6 : -1;
   }

   public void v(int var1, int var2) {
      this.Op = var1;
      this.OE = var2;
   }

   public kx(hS var1, int var2, int var3, int var4, int var5, int var6) {
      this.Ol = var1;
      this.eo = var2;
      this.eC = var3;
      this.Ot = var4;
      this.Oz = var5;
      this.Om = var6;
      this.OD = 0;
      this.Ok = var2;
      this.Ow = new WeakHashMap();
      this.On = new ail(var1.Bn, () -> {
         if (this.Oy == 0.0D && (double)this.OA >= 0.0D && this.OA <= (float)this.jV()) {
            this.On.awW();
         } else {
            double var1 = this.Oy * 0.3D;
            var1 = var1 / 16.0D;
            if (this.Oy != 0.0D) {
               this.OA = (float)((double)this.OA + var1);
               this.Oy -= this.Oy * ((double)this.OA >= 0.0D && this.OA <= (float)this.jV() ? 0.0125D : 0.025D);
               if (Math.abs(this.Oy) < 0.1D) {
                  this.Oy = 0.0D;
               }
            }

            if (this.OA < 0.0F && this.Oy == 0.0D) {
               this.OA = Math.min(this.OA + (0.0F - this.OA) * 0.2F, 0.0F);
               if (this.OA > -0.1F && this.OA < 0.0F) {
                  this.OA = 0.0F;
               }
            } else if (this.OA > (float)this.jV() && this.Oy == 0.0D) {
               this.OA = Math.max(this.OA - (this.OA - (float)this.jV()) * 0.2F, (float)this.jV());
               if (this.OA > (float)this.jV() && (double)this.OA < (double)this.jV() + 0.1D) {
                  this.OA = (float)this.jV();
               }
            }
         }

      });
   }

   protected void b(int var1, int var2) {
   }

   public boolean jW() {
      return this.aM;
   }

   public void aU(int var1) {
      this.OD = var1;
      this.Ok = var1 + this.eo;
   }

   public void i(int var1, int var2, int var3, int var4) {
      this.eo = var1;
      this.eC = var2;
      this.Ot = var3;
      this.Oz = var4;
      this.OD = 0;
      this.Ok = var1;
   }

   public void aJ() {
      if (this.aT(this.iy)) {
         int var1 = Mouse.getEventDWheel();
         if (var1 != 0) {
            if (var1 > 0) {
               var1 = 1;
            } else {
               var1 = -1;
            }

            if (this.OA <= (float)this.jV() && (double)var1 < 0.0D) {
               this.Oy += 16.0D;
            }

            if ((double)this.OA >= 0.0D && (double)var1 > 0.0D) {
               this.Oy -= 16.0D;
            }

            if (!this.On.GX()) {
               this.On.GY();
            }
         }
      }

   }

   protected void n(int var1, int var2) {
   }
}
