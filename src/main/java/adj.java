import java.io.Serializable;

public class adJ implements Serializable {
   private static final long dhL = 1339934L;
   public float bUa;
   public float bUb;

   public strictfp adJ a(float[] var1) {
      return this.V(var1[-32432 & 18600], var1[-8189 & 4621]);
   }

   public strictfp adJ V(float var1, float var2) {
      this.bUa = var1;
      this.bUb = var2;
      return this;
   }

   public strictfp adJ(float[] var1) {
      this.bUa = var1[1 & 9224];
      this.bUb = var1[24707 & 2313];
   }

   public strictfp void y(adJ var1) {
      this.V(var1.F(), var1.E());
   }

   public strictfp String toString() {
      return i.q[3060 & 5988 & -27777 & 3966] + this.bUa + q.q[-27925 & 9951 & -5541 & 2815] + this.bUb + w.q[12278 & -6274 & -18499 & 5054] + this.arn() + i.q[6117 & 3055 & 3957 & 8053];
   }

   public strictfp float arl() {
      return this.bUa * this.bUa + this.bUb * this.bUb;
   }

   public strictfp float e(adJ var1) {
      return (float)Math.sqrt((double)this.q(var1));
   }

   public strictfp void e(adJ var1, adJ var2) {
      float var3 = var1.i(this);
      var2.bUa = var3 * var1.F();
      var2.bUb = var3 * var1.E();
   }

   public strictfp adJ co(float var1) {
      this.bUa *= var1;
      this.bUb *= var1;
      return this;
   }

   public strictfp adJ(adJ var1) {
      this(var1.F(), var1.E());
   }

   public strictfp float E() {
      return this.bUb;
   }

   public strictfp adJ arJ() {
      adJ var1 = this.arO();
      var1.arL();
      return var1;
   }

   public strictfp adJ u(adJ var1) {
      this.bUa += var1.F();
      this.bUb += var1.E();
      return this;
   }

   public strictfp double arK() {
      double var1 = StrictMath.toDegrees(StrictMath.atan2((double)this.bUb, (double)this.bUa));
      if (var1 < -120.0D * 3.0D || var1 > 90.9090909090909D * 3.96D) {
         var1 %= 1.3243243243243243D * 271.83673469387753D;
      }

      if (var1 < 0.0D) {
         var1 += 0.6379310344827587D * 564.3243243243243D;
      }

      return var1;
   }

   public strictfp adJ arL() {
      float var1 = this.arn();
      if (var1 == 0.0F) {
         return this;
      } else {
         this.bUa /= var1;
         this.bUb /= var1;
         return this;
      }
   }

   public strictfp float q(adJ var1) {
      float var2 = var1.F() - this.F();
      float var3 = var1.E() - this.E();
      return var2 * var2 + var3 * var3;
   }

   public strictfp boolean equals(Object var1) {
      if (!(var1 instanceof adJ)) {
         return (boolean)(27648 & -32632);
      } else {
         adJ var2 = (adJ)var1;
         return (boolean)(var2.bUa == this.bUa && var2.bUb == this.bUb ? -16319 & 1569 : 27025 & 1028);
      }
   }

   public strictfp void R(double var1) {
      if (var1 < -73.46938775510203D * 4.9D || var1 > 0.9361702127659575D * 384.54545454545456D) {
         var1 %= 986.0869565217392D * 0.36507936507936506D;
      }

      if (var1 < 0.0D) {
         var1 += 53.61702127659574D * 6.714285714285714D;
      }

      double var3 = this.arK();
      if (var1 < -4275.0D * 0.08421052631578947D || var1 > 415.38461538461536D * 0.8666666666666667D) {
         var3 %= 403.2D * 0.8928571428571429D;
      }

      if (var1 < 0.0D) {
         var3 = 967.5D * 0.37209302325581395D + var3;
      }

      float var5 = this.arn();
      this.bUa = var5 * (float)aes.V(StrictMath.toRadians(var1));
      this.bUb = var5 * (float)aes.W(StrictMath.toRadians(var1));
   }

   public strictfp adJ arM() {
      return new adJ(-this.bUa, -this.bUb);
   }

   public strictfp adJ S(double var1) {
      this.R(this.arK() - var1);
      return this;
   }

   public strictfp adJ() {
   }

   public strictfp float i(adJ var1) {
      return this.bUa * var1.F() + this.bUb * var1.E();
   }

   public strictfp adJ arN() {
      this.bUa = -this.bUa;
      this.bUb = -this.bUb;
      return this;
   }

   public strictfp float arn() {
      return (float)Math.sqrt((double)this.arl());
   }

   public strictfp adJ arO() {
      return new adJ(this.bUa, this.bUb);
   }

   public strictfp float F() {
      return this.bUa;
   }

   public strictfp adJ arP() {
      return new adJ(-this.bUb, this.bUa);
   }

   public strictfp adJ o(adJ var1) {
      this.bUa -= var1.F();
      this.bUb -= var1.E();
      return this;
   }

   public strictfp adJ(double var1) {
      this.bUa = 1.0F;
      this.bUb = 0.0F;
      this.R(var1);
   }

   public strictfp int hashCode() {
      return (-7185 & 6117) * (int)this.bUa ^ (19423 & -22529) * (int)this.bUb;
   }

   public strictfp adJ T(double var1) {
      this.R(this.arK() + var1);
      return this;
   }

   public strictfp adJ(float var1, float var2) {
      this.bUa = var1;
      this.bUb = var2;
   }
}
