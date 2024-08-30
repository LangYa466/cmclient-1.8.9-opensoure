public abstract class zs extends zx {
   protected void q(double var1, boolean var3, cv var4, NW var5) {
   }

   public zs(QI var1) {
      super(var1);
   }

   public boolean yB() {
      return false;
   }

   public void f(float var1, float var2) {
   }

   public void k(float var1, float var2) {
      if (this.xg()) {
         this.g(var1, var2, 0.02F);
         this.h(this.aOd, this.aOO, this.aOL);
         this.aOd *= 0.800000011920929D;
         this.aOO *= 0.800000011920929D;
         this.aOL *= 0.800000011920929D;
      } else if (this.xd()) {
         this.g(var1, var2, 0.02F);
         this.h(this.aOd, this.aOO, this.aOL);
         this.aOd *= 0.5D;
         this.aOO *= 0.5D;
         this.aOL *= 0.5D;
      } else {
         float var3 = 0.91F;
         if (this.aNG) {
            var3 = this.vR.g(new NW(Pq.D(this.aNZ), Pq.D(this.xE().bNT) - 1, Pq.D(this.aOt))).ds().mX * 0.91F;
         }

         float var4 = 0.16277136F / (var3 * var3 * var3);
         this.g(var1, var2, this.aNG ? 0.1F * var4 : 0.02F);
         var3 = 0.91F;
         if (this.aNG) {
            var3 = this.vR.g(new NW(Pq.D(this.aNZ), Pq.D(this.xE().bNT) - 1, Pq.D(this.aOt))).ds().mX * 0.91F;
         }

         this.h(this.aOd, this.aOO, this.aOL);
         this.aOd *= (double)var3;
         this.aOO *= (double)var3;
         this.aOL *= (double)var3;
      }

      this.aQA = this.aQX;
      double var9 = this.aNZ - this.aOf;
      double var5 = this.aOt - this.aNW;
      float var7 = Pq.B(var9 * var9 + var5 * var5) * 4.0F;
      if (var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.aQX += (var7 - this.aQX) * 0.4F;
      this.aQK += this.aQX;
   }
}
