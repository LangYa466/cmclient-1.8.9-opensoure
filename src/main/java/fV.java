public abstract class fv extends cv {
   protected final boolean tI;

   protected hI w(QI var1, NW var2, hI var3, boolean var4) {
      return var1.bXF ? var3 : (new fy(this, var1, var2, var3)).q(var1.aA(var2), var4).dO();
   }

   public OS cn() {
      return OS.bSl;
   }

   public void r(QI var1, NW var2, hI var3) {
      super.r(var1, var2, var3);
      if (((fx)var3.w(this.dK())).dL()) {
         var1.e(var2.Vi(), this);
      }

      if (this.tI) {
         var1.e(var2, this);
         var1.e(var2.Vj(), this);
      }

   }

   public static boolean P(QI var0, NW var1) {
      return h(var0.g(var1));
   }

   protected fv(boolean var1) {
      super(hn.zF);
      this.tI = var1;
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.q(yl.aLx);
   }

   public void e(Qx var1, NW var2) {
      hI var3 = var1.g(var2);
      fx var4 = var3.ds() == this ? (fx)var3.w(this.dK()) : null;
      if (var4 != null && var4.dL()) {
         this.w(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.w(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }

   }

   public boolean cw() {
      return false;
   }

   protected void w(QI var1, NW var2, hI var3, cv var4) {
   }

   public boolean e(QI var1, NW var2) {
      return QI.c(var1, var2.Vj());
   }

   public abstract ht dK();

   public void q(QI var1, NW var2, hI var3, cv var4) {
      if (!var1.bXF) {
         fx var5 = (fx)var3.w(this.dK());
         boolean var6 = !QI.c(var1, var2.Vj());
         if (var5 == fx.tM && !QI.c(var1, var2.Ve())) {
            var6 = true;
         } else if (var5 == fx.tN && !QI.c(var1, var2.Vh())) {
            var6 = true;
         } else if (var5 == fx.tO && !QI.c(var1, var2.Vg())) {
            var6 = true;
         } else if (var5 == fx.tP && !QI.c(var1, var2.Vk())) {
            var6 = true;
         }

         if (var6) {
            this.q(var1, var2, var3, 0);
            var1.am(var2);
         } else {
            this.w(var1, var2, var3, var4);
         }
      }

   }

   public boolean cr() {
      return false;
   }

   public int cI() {
      return 0;
   }

   public PB q(QI var1, NW var2, PX var3, PX var4) {
      this.e((Qx)var1, var2);
      return super.q(var1, var2, var3, var4);
   }

   public void w(QI var1, NW var2, hI var3) {
      if (!var1.bXF) {
         var3 = this.w(var1, var2, var3, true);
         if (this.tI) {
            this.q(var1, var2, var3, this);
         }
      }

   }

   public static boolean h(hI var0) {
      cv var1 = var0.ds();
      return var1 == Ea.bgR || var1 == Ea.bkm || var1 == Ea.bhY || var1 == Ea.bhA;
   }

   public NV e(QI var1, NW var2, hI var3) {
      return null;
   }
}
