public class PX {
   public final double bUV;
   public final double bUW;
   public final double bUX;

   public PX q(PX var1, double var2) {
      double var4 = var1.bUV - this.bUV;
      double var6 = var1.bUW - this.bUW;
      double var8 = var1.bUX - this.bUX;
      if (var6 * var6 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.bUW) / var6;
         return var10 >= 0.0D && var10 <= 1.0D ? new PX(this.bUV + var4 * var10, this.bUW + var6 * var10, this.bUX + var8 * var10) : null;
      }
   }

   public PX p(PX var1) {
      return new PX(this.bUW * var1.bUX - this.bUX * var1.bUW, this.bUX * var1.bUV - this.bUV * var1.bUX, this.bUV * var1.bUW - this.bUW * var1.bUV);
   }

   public double a(PX var1) {
      double var2 = var1.bUV - this.bUV;
      double var4 = var1.bUW - this.bUW;
      double var6 = var1.bUX - this.bUX;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public PX w(PX var1, double var2) {
      double var4 = var1.bUV - this.bUV;
      double var6 = var1.bUW - this.bUW;
      double var8 = var1.bUX - this.bUX;
      if (var4 * var4 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.bUV) / var4;
         return var10 >= 0.0D && var10 <= 1.0D ? new PX(this.bUV + var4 * var10, this.bUW + var6 * var10, this.bUX + var8 * var10) : null;
      }
   }

   public PX(double var1, double var3, double var5) {
      if (var1 == -0.0D) {
         var1 = 0.0D;
      }

      if (var3 == -0.0D) {
         var3 = 0.0D;
      }

      if (var5 == -0.0D) {
         var5 = 0.0D;
      }

      this.bUV = var1;
      this.bUW = var3;
      this.bUX = var5;
   }

   public PX(PY var1) {
      this((double)var1.aY(), (double)var1.aX(), (double)var1.KO());
   }

   public PX K(double var1, double var3, double var5) {
      return new PX(this.bUV + var1, this.bUW + var3, this.bUX + var5);
   }

   public PX L(double var1, double var3, double var5) {
      return this.K(-var1, -var3, -var5);
   }

   public PX XT() {
      double var1 = (double)Pq.B(this.bUV * this.bUV + this.bUW * this.bUW + this.bUX * this.bUX);
      return var1 < 1.0E-4D ? new PX(0.0D, 0.0D, 0.0D) : new PX(this.bUV / var1, this.bUW / var1, this.bUX / var1);
   }

   public PX s(PX var1) {
      return this.K(var1.bUV, var1.bUW, var1.bUX);
   }

   public PX e(PX var1, double var2) {
      double var4 = var1.bUV - this.bUV;
      double var6 = var1.bUW - this.bUW;
      double var8 = var1.bUX - this.bUX;
      if (var8 * var8 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.bUX) / var8;
         return var10 >= 0.0D && var10 <= 1.0D ? new PX(this.bUV + var4 * var10, this.bUW + var6 * var10, this.bUX + var8 * var10) : null;
      }
   }

   public double XU() {
      return (double)Pq.B(this.bUV * this.bUV + this.bUW * this.bUW + this.bUX * this.bUX);
   }

   public PX bm(float var1) {
      float var2 = Pq.bi(var1);
      float var3 = Pq.bk(var1);
      double var4 = this.bUV;
      double var6 = this.bUW * (double)var2 + this.bUX * (double)var3;
      double var8 = this.bUX * (double)var2 - this.bUW * (double)var3;
      return new PX(var4, var6, var8);
   }

   public String toString() {
      return w.q[-30597 & 4123] + this.bUV + q.q[12926 & 18543] + this.bUW + q.q[8814 & 23662] + this.bUX + w.q[16831 & -32739];
   }

   public PX bn(float var1) {
      float var2 = Pq.bi(var1);
      float var3 = Pq.bk(var1);
      double var4 = this.bUV * (double)var2 + this.bUX * (double)var3;
      double var6 = this.bUW;
      double var8 = this.bUX * (double)var2 - this.bUV * (double)var3;
      return new PX(var4, var6, var8);
   }

   public PX d(PX var1) {
      return this.L(var1.bUV, var1.bUW, var1.bUX);
   }

   public double f(PX var1) {
      return this.bUV * var1.bUV + this.bUW * var1.bUW + this.bUX * var1.bUX;
   }

   public PX g(PX var1) {
      return new PX(var1.bUV - this.bUV, var1.bUW - this.bUW, var1.bUX - this.bUX);
   }

   public double h(PX var1) {
      double var2 = var1.bUV - this.bUV;
      double var4 = var1.bUW - this.bUW;
      double var6 = var1.bUX - this.bUX;
      return (double)Pq.B(var2 * var2 + var4 * var4 + var6 * var6);
   }
}
