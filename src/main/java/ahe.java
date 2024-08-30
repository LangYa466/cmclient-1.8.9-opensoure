public class ahE {
   public float bUa;
   public float bUb;

   public ahE cB(float var1) {
      this.bUa /= var1;
      this.bUb /= var1;
      return this;
   }

   public ahE q(ahE var1) {
      this.bUa -= var1.bUa;
      this.bUb -= var1.bUb;
      return this;
   }

   // $FF: synthetic method
   public Object clone() {
      return this.avY();
   }

   public ahE avY() {
      return new ahE(this.bUa, this.bUb);
   }

   public ahE cC(float var1) {
      this.bUa *= var1;
      this.bUb *= var1;
      return this;
   }

   public String toString() {
      return a.q[-21557 & 19595 & -3139 & -26899] + this.bUa + r.q[4090 & 13802 & -17973 & 23519] + this.bUb + q.q[24476 & -26724 & -7170 & -15361];
   }

   public ahE avZ() {
      float var1 = (float)Math.sqrt((double)(this.bUa * this.bUa + this.bUb * this.bUb));
      if (var1 < 7.228916E-5F * 1.3833333F) {
         this.bUa = 0.0F;
         this.bUb = 0.0F;
      } else {
         this.bUa /= var1;
         this.bUb /= var1;
      }

      return this;
   }

   public ahE(float var1, float var2) {
      this.bUa = var1;
      this.bUb = var2;
   }

   public ahE w(ahE var1) {
      this.bUa += var1.bUa;
      this.bUb += var1.bUb;
      return this;
   }

   public void e(ahE var1) {
      this.bUa = var1.bUa;
      this.bUb = var1.bUb;
   }
}
