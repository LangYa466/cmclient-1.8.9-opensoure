public class lL extends lJ {
   public mm TW;
   public mm TX;
   public mm TY;
   public mm TZ;
   public int Ua;
   public mm Ub;
   public boolean Uc;
   public int Ud;
   public mm Ue;
   public mm Uf;
   public boolean Ug;

   public void q(float var1, float var2, float var3, float var4, float var5, float var6, zk var7) {
      this.TY.Xn = var4 / 57.295776F;
      this.TY.Xw = var5 / 57.295776F;
      this.TZ.Xw = Pq.bi(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.5F;
      this.TW.Xw = Pq.bi(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
      this.TZ.Xp = 0.0F;
      this.TW.Xp = 0.0F;
      this.TX.Xw = Pq.bi(var1 * 0.6662F) * 1.4F * var2;
      this.Ue.Xw = Pq.bi(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.TX.Xn = 0.0F;
      this.Ue.Xn = 0.0F;
      if (this.TJ) {
         this.TZ.Xw += -0.62831855F;
         this.TW.Xw += -0.62831855F;
         this.TX.Xw = -1.2566371F;
         this.Ue.Xw = -1.2566371F;
         this.TX.Xn = 0.31415927F;
         this.Ue.Xn = -0.31415927F;
      }

      if (this.Ud != 0) {
         this.TW.Xw = this.TW.Xw * 0.5F - 0.31415927F * (float)this.Ud;
      }

      this.TZ.Xn = 0.0F;
      this.TZ.Xp = 0.0F;
      switch(this.Ua) {
      case 0:
      case 2:
      default:
         break;
      case 1:
         this.TZ.Xw = this.TZ.Xw * 0.5F - 0.31415927F * (float)this.Ua;
         break;
      case 3:
         this.TZ.Xw = this.TZ.Xw * 0.5F - 0.31415927F * (float)this.Ua;
         this.TZ.Xn = ao.ef.ej.af() ? 0.0F : -0.5235988F;
      }

      this.TW.Xn = 0.0F;
      if (this.TM > -9990.0F) {
         float var8 = this.TM;
         this.Uf.Xn = Pq.bk(Pq.bh(var8) * 3.1415927F * 2.0F) * 0.2F;
         this.TZ.Xj = Pq.bk(this.Uf.Xn) * 5.0F;
         this.TZ.WW = -Pq.bi(this.Uf.Xn) * 5.0F;
         this.TW.Xj = -Pq.bk(this.Uf.Xn) * 5.0F;
         this.TW.WW = Pq.bi(this.Uf.Xn) * 5.0F;
         this.TZ.Xn += this.Uf.Xn;
         this.TW.Xn += this.Uf.Xn;
         this.TW.Xw += this.Uf.Xn;
         var8 = 1.0F - this.TM;
         var8 = var8 * var8;
         var8 = var8 * var8;
         var8 = 1.0F - var8;
         float var9 = Pq.bk(var8 * 3.1415927F);
         float var10 = Pq.bk(this.TM * 3.1415927F) * -(this.TY.Xw - 0.7F) * 0.75F;
         this.TZ.Xw = (float)((double)this.TZ.Xw - ((double)var9 * 1.2D + (double)var10));
         this.TZ.Xn += this.Uf.Xn * 2.0F;
         this.TZ.Xp += Pq.bk(this.TM * 3.1415927F) * -0.4F;
      }

      if (M.cg.ce.af()) {
         hS var15 = hS.eV();
         aeI var17 = var7.yb();
         if (var7 instanceof DD && var7 != var15.CM) {
            boolean var19 = var7.hI();
            var17.q(var19 ? 1.0D : 0.0D, 0.25D, var19 ? aeL.doB : aeL.dor, true);
            var17.aub();
         }

         this.Uf.Xw = (float)(0.5D * var17.auf());
         if (var7 != var15.CM || var15.Br.aCr != 0) {
            this.TZ.Xw = (float)((double)this.TZ.Xw + 0.4D * var17.auf());
         }

         this.TW.Xw = (float)((double)this.TW.Xw + 0.4D * var17.auf());
         this.TX.Xj = (float)(4.0D * var17.auf());
         this.Ue.Xj = (float)(4.0D * var17.auf());
         this.TX.Xr = (float)(12.0D - 3.0D * var17.auf());
         this.Ue.Xr = (float)(12.0D - 3.0D * var17.auf());
         this.TY.Xr = (float)var17.auf();
      } else if (this.Ug) {
         this.Uf.Xw = 0.5F;
         this.TZ.Xw += 0.4F;
         this.TW.Xw += 0.4F;
         this.TX.Xj = 4.0F;
         this.Ue.Xj = 4.0F;
         this.TX.Xr = 9.0F;
         this.Ue.Xr = 9.0F;
         this.TY.Xr = 1.0F;
      } else {
         this.Uf.Xw = 0.0F;
         this.TX.Xj = 0.1F;
         this.Ue.Xj = 0.1F;
         this.TX.Xr = 12.0F;
         this.Ue.Xr = 12.0F;
         this.TY.Xr = 0.0F;
      }

      this.TZ.Xp += Pq.bi(var3 * 0.09F) * 0.05F + 0.05F;
      this.TW.Xp -= Pq.bi(var3 * 0.09F) * 0.05F + 0.05F;
      this.TZ.Xw += Pq.bk(var3 * 0.067F) * 0.05F;
      this.TW.Xw -= Pq.bk(var3 * 0.067F) * 0.05F;
      if (this.Uc) {
         float var16 = 0.0F;
         float var18 = 0.0F;
         this.TZ.Xp = 0.0F;
         this.TW.Xp = 0.0F;
         this.TZ.Xn = -(0.1F - var16 * 0.6F) + this.TY.Xn;
         this.TW.Xn = 0.1F - var16 * 0.6F + this.TY.Xn + 0.4F;
         this.TZ.Xw = -1.5707964F + this.TY.Xw;
         this.TW.Xw = -1.5707964F + this.TY.Xw;
         this.TZ.Xw -= var16 * 1.2F - var18 * 0.4F;
         this.TW.Xw -= var16 * 1.2F - var18 * 0.4F;
         this.TZ.Xp += Pq.bi(var3 * 0.09F) * 0.05F + 0.05F;
         this.TW.Xp -= Pq.bi(var3 * 0.09F) * 0.05F + 0.05F;
         this.TZ.Xw += Pq.bk(var3 * 0.067F) * 0.05F;
         this.TW.Xw -= Pq.bk(var3 * 0.067F) * 0.05F;
      }

      q(this.TY, this.Ub);
   }

   public lL(float var1, float var2, int var3, int var4) {
      this.TP = var3;
      this.TN = var4;
      this.TY = new mm(this, 0, 0);
      this.TY.w(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.TY.e(0.0F, 0.0F + var2, 0.0F);
      this.Ub = new mm(this, 32, 0);
      this.Ub.w(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.Ub.e(0.0F, 0.0F + var2, 0.0F);
      this.Uf = new mm(this, 16, 16);
      this.Uf.w(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.Uf.e(0.0F, 0.0F + var2, 0.0F);
      this.TZ = new mm(this, 40, 16);
      this.TZ.w(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.TZ.e(-5.0F, 2.0F + var2, 0.0F);
      this.TW = new mm(this, 40, 16);
      this.TW.Xx = true;
      this.TW.w(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.TW.e(5.0F, 2.0F + var2, 0.0F);
      this.TX = new mm(this, 0, 16);
      this.TX.w(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.TX.e(-1.9F, 12.0F + var2, 0.0F);
      this.Ue = new mm(this, 0, 16);
      this.Ue.Xx = true;
      this.Ue.w(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.Ue.e(1.9F, 12.0F + var2, 0.0F);
   }

   public void L(boolean var1) {
      this.TY.Xb = var1;
      this.Ub.Xb = var1;
      this.Uf.Xb = var1;
      this.TZ.Xb = var1;
      this.TW.Xb = var1;
      this.TX.Xb = var1;
      this.Ue.Xb = var1;
   }

   public void B(float var1) {
      this.TZ.E(var1);
   }

   public lL(float var1) {
      this(var1, 0.0F, 64, 32);
   }

   public void q(lJ var1) {
      super.q(var1);
      if (var1 instanceof lL) {
         lL var2 = (lL)var1;
         this.Ud = var2.Ud;
         this.Ua = var2.Ua;
         this.Ug = var2.Ug;
         this.Uc = var2.Uc;
      }

   }

   public void q(zk var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.q(var2, var3, var4, var5, var6, var7, var1);
      pz.nE();
      if (this.TL) {
         float var8 = 2.0F;
         pz.u(1.5F / var8, 1.5F / var8, 1.5F / var8);
         pz.y(0.0F, 16.0F * var7, 0.0F);
         this.TY.H(var7);
         pz.nF();
         pz.nE();
         pz.u(1.0F / var8, 1.0F / var8, 1.0F / var8);
         pz.y(0.0F, 24.0F * var7, 0.0F);
         this.Uf.H(var7);
         this.TZ.H(var7);
         this.TW.H(var7);
         this.TX.H(var7);
         this.Ue.H(var7);
         this.Ub.H(var7);
      } else {
         if (M.cg.ce.af()) {
            pz.t(0.0D, 0.20000000298023224D * var1.yb().auf(), 0.0D);
         } else if (var1.hI()) {
            pz.y(0.0F, 0.2F, 0.0F);
         }

         this.TY.H(var7);
         this.Uf.H(var7);
         this.TZ.H(var7);
         this.TW.H(var7);
         this.TX.H(var7);
         this.Ue.H(var7);
         this.Ub.H(var7);
      }

      pz.nF();
   }

   public lL() {
      this(0.0F);
   }
}
