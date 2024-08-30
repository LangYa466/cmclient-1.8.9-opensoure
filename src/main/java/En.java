public class EN extends Ev {
   public boolean bpg;
   public EV bph = new EY();
   public EZ bpi = new EZ(this, 2, 2);
   private final DD bpj;

   public boolean q(GX var1, Fe var2) {
      return var2.bpT != this.bph && super.q(var1, var2);
   }

   public boolean q(DD var1) {
      return true;
   }

   public void w(EV var1) {
      this.bph.y(0, Hb.Ir().q(this.bpi, this.bpj.vR));
   }

   public EN(DJ var1, boolean var2, DD var3) {
      this.bpg = var2;
      this.bpj = var3;
      this.e(new Ff(var1.Dm, this.bpi, this.bph, 0, 144, 36));

      for(int var4 = 0; var4 < 2; ++var4) {
         for(int var5 = 0; var5 < 2; ++var5) {
            this.e(new Fe(this.bpi, var5 + var4 * 2, 88 + var5 * 18, 26 + var4 * 18));
         }
      }

      for(int var6 = 0; var6 < 4; ++var6) {
         this.e(new EO(this, var1, var1.CB() - 1 - var6, 8, 8 + var6 * 18, var6));
      }

      for(int var7 = 0; var7 < 3; ++var7) {
         for(int var9 = 0; var9 < 9; ++var9) {
            this.e(new Fe(var1, var9 + (var7 + 1) * 9, 8 + var9 * 18, 84 + var7 * 18));
         }
      }

      for(int var8 = 0; var8 < 9; ++var8) {
         this.e(new Fe(var1, var8, 8 + var8 * 18, 142));
      }

      this.w(this.bpi);
   }

   public GX q(DD var1, int var2) {
      GX var3 = null;
      Fe var4 = (Fe)this.boC.get(var2);
      if (var4 != null && var4.kM()) {
         GX var5 = var4.kO();
         var3 = var5.HW();
         if (var2 == 0) {
            if (!this.q(var5, 9, 45, true)) {
               return null;
            }

            var4.q(var5, var3);
         } else if (var2 >= 1 && var2 < 5) {
            if (!this.q(var5, 9, 45, false)) {
               return null;
            }
         } else if (var2 >= 5 && var2 < 9) {
            if (!this.q(var5, 9, 45, false)) {
               return null;
            }
         } else if (var3.do1() instanceof FH && !((Fe)this.boC.get(5 + ((FH)var3.do1()).brm)).kM()) {
            int var6 = 5 + ((FH)var3.do1()).brm;
            if (!this.q(var5, var6, var6 + 1, false)) {
               return null;
            }
         } else if (var2 >= 9 && var2 < 36) {
            if (!this.q(var5, 36, 45, false)) {
               return null;
            }
         } else if (var2 >= 36 && var2 < 45) {
            if (!this.q(var5, 9, 36, false)) {
               return null;
            }
         } else if (!this.q(var5, 9, 45, false)) {
            return null;
         }

         if (var5.bsH == 0) {
            var4.p((GX)null);
         } else {
            var4.kQ();
         }

         if (var5.bsH == var3.bsH) {
            return null;
         }

         var4.q(var1, var5);
      }

      return var3;
   }

   public void b(DD var1) {
      super.b(var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         GX var3 = this.bpi.es(var2);
         if (var3 != null) {
            var1.w(var3, false);
         }
      }

      this.bph.y(0, (GX)null);
   }
}
