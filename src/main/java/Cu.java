public class cu {
   public double mH;
   public double mI;
   public double mJ;

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.mJ);
      int var3 = (int)(var1 ^ var1 >>> (-32606 & 12852));
      var1 = Double.doubleToLongBits(this.mH);
      var3 = (23359 & 31) * var3 + (int)(var1 ^ var1 >>> (2344 & -18907));
      var1 = Double.doubleToLongBits(this.mI);
      var3 = (8735 & 23615) * var3 + (int)(var1 ^ var1 >>> (106 & -25824));
      return var3;
   }

   public double ch() {
      return this.mI;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return (boolean)(1 & 4837);
      } else if (!(var1 instanceof cu)) {
         return (boolean)(16386 & 15252);
      } else {
         cu var2 = (cu)var1;
         if (Double.compare(var2.mJ, this.mJ) != 0) {
            return (boolean)(136 & -29184);
         } else if (Double.compare(var2.mH, this.mH) != 0) {
            return (boolean)(21697 & 8448);
         } else {
            return (boolean)(Double.compare(var2.mI, this.mI) == 0 ? 133 & -32767 : 4240 & -31999);
         }
      }
   }

   public String toString() {
      return w.q[8287 & -19841 & -26913 & 9883] + this.mJ + q.q[-18946 & 13822 & 27503 & 17150] + this.mH + q.q[20734 & 4351 & 17775 & 1903] + this.mI + w.q[-13795 & -24163 & 9215 & -20163];
   }

   public void q(cu var1, double var2, double var4, double var6) {
      this.mJ = var1.mJ + var2;
      this.mH = var1.mH + var4;
      this.mI = var1.mI + var6;
   }

   public double ci() {
      return this.mH;
   }

   public void q(double var1, double var3, double var5) {
      this.mJ = var1;
      this.mH = var3;
      this.mI = var5;
   }

   public double cj() {
      return this.mJ;
   }

   public cu(double var1, double var3, double var5) {
      this.mJ = var1;
      this.mH = var3;
      this.mI = var5;
   }
}
