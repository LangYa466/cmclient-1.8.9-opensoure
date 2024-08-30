import java.util.List;

public abstract class DO extends zk {
   private int bfP = -1;
   private int bfK = -1;
   public zz bfR;
   private int bfG;
   public double bfS;
   private int bfT;
   private cv bfE;
   private boolean bfH;
   public double bfU;
   public double bfV;
   private int bfN = -1;

   public DO(QI var1, zz var2, double var3, double var5, double var7) {
      super(var1);
      this.bfR = var2;
      this.d(1.0F, 1.0F);
      this.q(var2.aNZ, var2.aNK, var2.aOt, var2.aOn, var2.aNN);
      this.p(this.aNZ, this.aNK, this.aOt);
      this.aOd = this.aOO = this.aOL = 0.0D;
      var3 = var3 + this.oF.nextGaussian() * 0.4D;
      var5 = var5 + this.oF.nextGaussian() * 0.4D;
      var7 = var7 + this.oF.nextGaussian() * 0.4D;
      double var9 = (double)Pq.B(var3 * var3 + var5 * var5 + var7 * var7);
      this.bfS = var3 / var9 * 0.1D;
      this.bfV = var5 / var9 * 0.1D;
      this.bfU = var7 / var9 * 0.1D;
   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else {
         this.xo();
         if (var1.Wv() != null) {
            PX var3 = var1.Wv().yd();
            if (var3 != null) {
               this.aOd = var3.bUV;
               this.aOO = var3.bUW;
               this.aOL = var3.bUX;
               this.bfS = this.aOd * 0.1D;
               this.bfV = this.aOO * 0.1D;
               this.bfU = this.aOL * 0.1D;
            }

            if (var1.Wv() instanceof zz) {
               this.bfR = (zz)var1.Wv();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected void mC() {
   }

   public DO(QI var1) {
      super(var1);
      this.d(1.0F, 1.0F);
   }

   public DO(QI var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.d(1.0F, 1.0F);
      this.q(var2, var4, var6, this.aOn, this.aNN);
      this.p(var2, var4, var6);
      double var14 = (double)Pq.B(var8 * var8 + var10 * var10 + var12 * var12);
      this.bfS = var8 / var14 * 0.1D;
      this.bfV = var10 / var14 * 0.1D;
      this.bfU = var12 / var14 * 0.1D;
   }

   public void t(HL var1) {
      var1.q(t.q[638 & -14595], (short)this.bfK);
      var1.q(t.q[-14465 & 13053], (short)this.bfP);
      var1.q(t.q[894 & 10878], (short)this.bfN);
      PJ var2 = (PJ)cv.nk.z(this.bfE);
      var1.a(t.q[13951 & 17023], var2 == null ? q.q[584 & 2096] : var2.toString());
      var1.q(t.q[19353 & 737], (byte)(this.bfH ? 1 : 0));
      var1.w(y.q[-31880 & 5980], this.q(new double[]{this.aOd, this.aOO, this.aOL}));
   }

   public void r(HL var1) {
      this.bfK = var1.bI(t.q[29436 & 893]);
      this.bfP = var1.bI(t.q[-23811 & 637]);
      this.bfN = var1.bI(t.q[5759 & 894]);
      if (var1.d(t.q[4735 & -30081], 8)) {
         this.bfE = cv.z(var1.bG(t.q[24191 & 8831]));
      } else {
         this.bfE = cv.K(var1.bN(t.q[2687 & -32129]) & 255);
      }

      this.bfH = var1.bN(t.q[17073 & 8073]) == 1;
      if (var1.d(y.q[5080 & 862], 9)) {
         HT var2 = var1.s(y.q[7128 & -30887], 6);
         this.aOd = var2.fu(0);
         this.aOO = var2.fu(1);
         this.aOL = var2.fu(2);
      } else {
         this.yo();
      }

   }

   protected abstract void q(PB var1);

   public boolean f(double var1) {
      double var3 = this.xE().Vd() * 4.0D;
      if (Double.isNaN(var3)) {
         var3 = 4.0D;
      }

      var3 = var3 * 64.0D;
      return var1 < var3 * var3;
   }

   public float xu() {
      return 1.0F;
   }

   protected float GJ() {
      return 0.95F;
   }

   public boolean xl() {
      return true;
   }

   public int I(float var1) {
      return 15728880;
   }

   public float J(float var1) {
      return 1.0F;
   }

   public void hv() {
      if (this.vR.bXF || (this.bfR == null || !this.bfR.aNQ) && this.vR.ao(new NW(this))) {
         super.hv();
         this.dG(1);
         if (this.bfH) {
            if (this.vR.g(new NW(this.bfK, this.bfP, this.bfN)).ds() == this.bfE) {
               ++this.bfT;
               if (this.bfT == 600) {
                  this.yo();
               }

               return;
            }

            this.bfH = false;
            this.aOd *= (double)(this.oF.nextFloat() * 0.2F);
            this.aOO *= (double)(this.oF.nextFloat() * 0.2F);
            this.aOL *= (double)(this.oF.nextFloat() * 0.2F);
            this.bfT = 0;
            this.bfG = 0;
         } else {
            ++this.bfG;
         }

         PX var1 = new PX(this.aNZ, this.aNK, this.aOt);
         PX var2 = new PX(this.aNZ + this.aOd, this.aNK + this.aOO, this.aOt + this.aOL);
         PB var3 = this.vR.w(var1, var2);
         var1 = new PX(this.aNZ, this.aNK, this.aOt);
         var2 = new PX(this.aNZ + this.aOd, this.aNK + this.aOO, this.aOt + this.aOL);
         if (var3 != null) {
            var2 = new PX(var3.bwj.bUV, var3.bwj.bUW, var3.bwj.bUX);
         }

         zk var4 = null;
         List var5 = this.vR.w(this, this.xE().E(this.aOd, this.aOO, this.aOL).C(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         for(int var8 = 0; var8 < var5.size(); ++var8) {
            zk var9 = (zk)var5.get(var8);
            if (var9.xl() && (!var9.n(this.bfR) || this.bfG >= 25)) {
               float var10 = 0.3F;
               NV var11 = var9.xE().C((double)var10, (double)var10, (double)var10);
               PB var12 = var11.q(var1, var2);
               if (var12 != null) {
                  double var13 = var1.a(var12.bwj);
                  if (var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if (var4 != null) {
            var3 = new PB(var4);
         }

         if (var3 != null) {
            this.q(var3);
         }

         this.aNZ += this.aOd;
         this.aNK += this.aOO;
         this.aOt += this.aOL;
         float var17 = Pq.B(this.aOd * this.aOd + this.aOL * this.aOL);
         this.aOn = (float)(Pq.u(this.aOL, this.aOd) * 180.0D / 3.141592653589793D) + 90.0F;

         for(this.aNN = (float)(Pq.u((double)var17, this.aOO) * 180.0D / 3.141592653589793D) - 90.0F; this.aNN - this.aOr < -180.0F; this.aOr -= 360.0F) {
            ;
         }

         while(this.aNN - this.aOr >= 180.0F) {
            this.aOr += 360.0F;
         }

         while(this.aOn - this.aOF < -180.0F) {
            this.aOF -= 360.0F;
         }

         while(this.aOn - this.aOF >= 180.0F) {
            this.aOF += 360.0F;
         }

         this.aNN = this.aOr + (this.aNN - this.aOr) * 0.2F;
         this.aOn = this.aOF + (this.aOn - this.aOF) * 0.2F;
         float var18 = this.GJ();
         if (this.xg()) {
            for(int var19 = 0; var19 < 4; ++var19) {
               float var20 = 0.25F;
               this.vR.q(OP.bRo, this.aNZ - this.aOd * (double)var20, this.aNK - this.aOO * (double)var20, this.aOt - this.aOL * (double)var20, this.aOd, this.aOO, this.aOL);
            }

            var18 = 0.8F;
         }

         this.aOd += this.bfS;
         this.aOO += this.bfV;
         this.aOL += this.bfU;
         this.aOd *= (double)var18;
         this.aOO *= (double)var18;
         this.aOL *= (double)var18;
         this.vR.q(OP.bRv, this.aNZ, this.aNK + 0.5D, this.aOt, 0.0D, 0.0D, 0.0D);
         this.p(this.aNZ, this.aNK, this.aOt);
      } else {
         this.yo();
      }

   }
}
