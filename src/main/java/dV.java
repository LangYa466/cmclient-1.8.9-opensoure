public class DV extends DO {
   public boolean GP() {
      return this.aNw.dy(10) == 1;
   }

   public boolean xL() {
      return false;
   }

   public float q(Qt var1, QI var2, NW var3, hI var4) {
      float var5 = super.q(var1, var2, var3, var4);
      cv var6 = var4.ds();
      if (this.GP() && Bq.v(var6)) {
         var5 = Math.min(0.8F, var5);
      }

      return var5;
   }

   protected void q(PB var1) {
      if (!this.vR.bXF) {
         if (var1.bTG != null) {
            if (this.bfR != null) {
               if (var1.bTG.q(Oz.n(this.bfR), 8.0F)) {
                  if (!var1.bTG.xV()) {
                     this.bfR.z(5.0F);
                  } else {
                     this.e(this.bfR, var1.bTG);
                  }
               }
            } else {
               var1.bTG.q(Oz.bPF, 5.0F);
            }

            if (var1.bTG instanceof zz) {
               byte var2 = 0;
               if (this.vR.Kq() == Qr.bWg) {
                  var2 = 10;
               } else if (this.vR.Kq() == Qr.bWh) {
                  var2 = 40;
               }

               if (var2 > 0) {
                  ((zz)var1.bTG).e(new LJ(LG.bCD.bCA, 20 * var2, 1));
               }
            }
         }

         this.vR.q(this, this.aNZ, this.aNK, this.aOt, 1.0F, false, this.vR.vU().bL(w.q[3993 & 21489]));
         this.yo();
      }

   }

   public DV(QI var1) {
      super(var1);
      this.d(0.3125F, 0.3125F);
   }

   protected void mC() {
      this.aNw.w(10, Byte.valueOf((byte)0));
   }

   public void bo(boolean var1) {
      this.aNw.e(10, Byte.valueOf((byte)(var1 ? 1 : 0)));
   }

   public boolean xl() {
      return false;
   }

   public boolean q(Oz var1, float var2) {
      return false;
   }

   protected float GJ() {
      return this.GP() ? 0.73F : super.GJ();
   }

   public DV(QI var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.d(0.3125F, 0.3125F);
   }

   public DV(QI var1, zz var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.d(0.3125F, 0.3125F);
   }
}
