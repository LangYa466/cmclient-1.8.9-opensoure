public class EJ extends Ev {
   private EV SE;
   private CX boZ;

   public boolean q(DD var1) {
      return this.SE.g(var1) && this.boZ.xV() && this.boZ.c(var1) < 8.0F;
   }

   public EJ(EV var1, EV var2, CX var3, DD var4) {
      this.SE = var2;
      this.boZ = var3;
      byte var5 = 3;
      var2.f(var4);
      int var6 = (var5 - 4) * 18;
      this.e(new EK(this, var2, 0, 8, 18));
      this.e(new EL(this, var2, 1, 8, 36, var3));
      if (var3.Ev()) {
         for(int var7 = 0; var7 < var5; ++var7) {
            for(int var8 = 0; var8 < 5; ++var8) {
               this.e(new Fe(var2, 2 + var8 + var7 * 5, 80 + var8 * 18, 18 + var7 * 18));
            }
         }
      }

      for(int var9 = 0; var9 < 3; ++var9) {
         for(int var11 = 0; var11 < 9; ++var11) {
            this.e(new Fe(var1, var11 + var9 * 9 + 9, 8 + var11 * 18, 102 + var9 * 18 + var6));
         }
      }

      for(int var10 = 0; var10 < 9; ++var10) {
         this.e(new Fe(var1, var10, 8 + var10 * 18, 160 + var6));
      }

   }

   public void b(DD var1) {
      super.b(var1);
      this.SE.h(var1);
   }

   public GX q(DD var1, int var2) {
      GX var3 = null;
      Fe var4 = (Fe)this.boC.get(var2);
      if (var4 != null && var4.kM()) {
         GX var5 = var4.kO();
         var3 = var5.HW();
         if (var2 < this.SE.CB()) {
            if (!this.q(var5, this.SE.CB(), this.boC.size(), true)) {
               return null;
            }
         } else if (this.eZ(1).o(var5) && !this.eZ(1).kM()) {
            if (!this.q(var5, 1, 2, false)) {
               return null;
            }
         } else if (this.eZ(0).o(var5)) {
            if (!this.q(var5, 0, 1, false)) {
               return null;
            }
         } else if (this.SE.CB() <= 2 || !this.q(var5, 2, this.SE.CB(), false)) {
            return null;
         }

         if (var5.bsH == 0) {
            var4.p((GX)null);
         } else {
            var4.kQ();
         }
      }

      return var3;
   }
}
