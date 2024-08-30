class Po {
   final int bSX;
   Po bSY;
   final long bSZ;
   Object bHu;

   public final boolean equals(Object var1) {
      if (!(var1 instanceof Po)) {
         return false;
      } else {
         Po var2 = (Po)var1;
         Long var3 = this.Xq();
         Long var4 = var2.Xq();
         if (var3 == var4 || var3 != null && var3.equals(var4)) {
            Object var5 = this.Xr();
            Object var6 = var2.Xr();
            if (var5 == var6 || var5 != null && var5.equals(var6)) {
               return true;
            }
         }

         return false;
      }
   }

   public final long Xq() {
      return this.bSZ;
   }

   Po(int var1, long var2, Object var4, Po var5) {
      this.bHu = var4;
      this.bSY = var5;
      this.bSZ = var2;
      this.bSX = var1;
   }

   public final int hashCode() {
      return Pn.v(this.bSZ);
   }

   public final String toString() {
      return this.Xq() + q.q[24598 & 158] + this.Xr();
   }

   public final Object Xr() {
      return this.bHu;
   }
}
