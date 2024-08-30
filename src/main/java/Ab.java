public class AB extends zW {
   zz aUN;
   zx aTd;
   QI aTy;
   int aUO;

   public boolean Ay() {
      return !this.aUN.xV() ? false : (this.aTd.B(this.aUN) > 225.0D ? false : !this.aTd.yM().NE() || this.Av());
   }

   public AB(zx var1) {
      this.aTd = var1;
      this.aTy = var1.vR;
      this.dX(3);
   }

   public boolean Av() {
      zz var1 = this.aTd.zc();
      if (var1 == null) {
         return false;
      } else {
         this.aUN = var1;
         return true;
      }
   }

   public void Ax() {
      this.aTd.zl().w(this.aUN, 30.0F, 30.0F);
      double var1 = (double)(this.aTd.gK * 2.0F * this.aTd.gK * 2.0F);
      double var3 = this.aTd.x(this.aUN.aNZ, this.aUN.xE().bNT, this.aUN.aOt);
      double var5 = 0.8D;
      if (var3 > var1 && var3 < 16.0D) {
         var5 = 1.33D;
      } else if (var3 < 225.0D) {
         var5 = 0.6D;
      }

      this.aTd.yM().t(this.aUN, var5);
      this.aUO = Math.max(this.aUO - 1, 0);
      if (var3 <= var1 && this.aUO <= 0) {
         this.aUO = 20;
         this.aTd.H(this.aUN);
      }

   }

   public void Aw() {
      this.aUN = null;
      this.aTd.yM().NG();
   }
}
