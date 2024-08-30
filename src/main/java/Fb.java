public class fB extends fv {
   public static final hu uh = hu.x(w.q[4718 & 9199]);
   public static final hw ui = hw.q(r.q[8918 & 18647], fx.class, new fC());

   public ht dK() {
      return ui;
   }

   public int e(hI var1) {
      int var2 = 0;
      var2 = var2 | ((fx)var1.w(ui)).dm();
      if (((Boolean)var1.w(uh)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public hI J(int var1) {
      return this.cx().q(ui, fx.ad(var1 & 7)).q(uh, Boolean.valueOf((var1 & 8) > 0));
   }

   protected hA cY() {
      return new hA(this, new ht[]{ui, uh});
   }

   protected boolean q(QI var1, NW var2, hI var3, boolean var4, int var5) {
      // $FF: Couldn't be decompiled
   }

   protected fB() {
      super(true);
      this.q(this.nr.ez().q(ui, fx.tK).q(uh, Boolean.valueOf(false)));
   }

   protected boolean q(QI var1, NW var2, boolean var3, int var4, fx var5) {
      hI var6 = var1.g(var2);
      if (var6.ds() != this) {
         return false;
      } else {
         fx var7 = (fx)var6.w(ui);
         return var5 != fx.tL || var7 != fx.tK && var7 != fx.tO && var7 != fx.tP ? (var5 != fx.tK || var7 != fx.tL && var7 != fx.tM && var7 != fx.tN ? (((Boolean)var6.w(uh)).booleanValue() ? (var1.aA(var2) ? true : this.q(var1, var2, var6, var3, var4 + 1)) : false) : false) : false;
      }
   }

   protected void w(QI var1, NW var2, hI var3, cv var4) {
      boolean var5 = ((Boolean)var3.w(uh)).booleanValue();
      boolean var6 = var1.aA(var2) || this.q(var1, var2, var3, true, 0) || this.q(var1, var2, var3, false, 0);
      if (var6 != var5) {
         var1.q(var2, var3.q(uh, Boolean.valueOf(var6)), 3);
         var1.e(var2.Vj(), this);
         if (((fx)var3.w(ui)).dL()) {
            var1.e(var2.Vi(), this);
         }
      }

   }
}
