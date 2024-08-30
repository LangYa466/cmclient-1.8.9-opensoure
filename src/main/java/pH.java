class Ph {
   Ph bSI;
   Object bSJ;
   final int bSK;
   final int bSL;

   public final boolean equals(Object var1) {
      if (!(var1 instanceof Ph)) {
         return false;
      } else {
         Ph var2 = (Ph)var1;
         Integer var3 = this.Xm();
         Integer var4 = var2.Xm();
         if (var3 == var4 || var3 != null && var3.equals(var4)) {
            Object var5 = this.Xn();
            Object var6 = var2.Xn();
            if (var5 == var6 || var5 != null && var5.equals(var6)) {
               return true;
            }
         }

         return false;
      }
   }

   public final int Xm() {
      return this.bSL;
   }

   Ph(int var1, int var2, Object var3, Ph var4) {
      this.bSJ = var3;
      this.bSI = var4;
      this.bSL = var2;
      this.bSK = var1;
   }

   public final Object Xn() {
      return this.bSJ;
   }

   public final String toString() {
      return this.Xm() + q.q[22102 & 2238] + this.Xn();
   }

   public final int hashCode() {
      return Pg.gJ(this.bSL);
   }
}
