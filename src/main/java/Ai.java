public class AI extends zW {
   private zr aUo;
   private Qk aVe;

   public void Aw() {
      ((LD)this.aUo.yM()).bu(true);
      ((LD)this.aUo.yM()).bv(true);
      this.aVe = null;
   }

   public boolean Ay() {
      return this.aUo.vR.ZH() ? false : !this.aVe.YM() && this.aVe.af(new NW(this.aUo));
   }

   public AI(zr var1) {
      this.aUo = var1;
      if (!(var1.yM() instanceof LD)) {
         throw new IllegalArgumentException(o.q[17357 & -24545]);
      }
   }

   public void Az() {
      ((LD)this.aUo.yM()).bu(false);
      ((LD)this.aUo.yM()).bv(false);
   }

   public void Ax() {
      this.aVe.YE();
   }

   public boolean Av() {
      if (this.aUo.vR.ZH()) {
         return false;
      } else {
         NW var1 = new NW(this.aUo);
         Qh var2 = this.aUo.vR.Zw().r(var1, 16);
         if (var2 == null) {
            return false;
         } else {
            this.aVe = var2.W(var1);
            return this.aVe == null ? false : (double)this.aVe.ag(var1) < 2.25D;
         }
      }
   }
}
