public class jV implements jC {
   private final iT LR;
   private iT LS;
   private final hS LT = hS.eV();
   private final iT LU;

   public iT jn() {
      return this.LU;
   }

   public void t(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.q(this.LU, var2, var3, var4);
      this.q(this.LR, var2, var3, var4);
   }

   private void q(kz var1, int var2, boolean var3) {
      var1.hF = var2;
      if (!var3) {
         var1.kh();
      }

   }

   private void q(iT var1, int var2, int var3, int var4, boolean var5) {
      if (var1 != null) {
         if (var1 instanceof iU) {
            this.q((iU)var1, var2, var3, var4, var5);
         } else if (var1 instanceof kz) {
            this.q((kz)var1, var2, var5);
         } else if (var1 instanceof jx) {
            this.q((jx)var1, var2, var3, var4, var5);
         }
      }

   }

   private void q(iU var1, int var2, int var3, int var4, boolean var5) {
      var1.hF = var2;
      if (!var5) {
         var1.r(this.LT, var3, var4);
      }

   }

   public void q(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      this.q(this.LU, var3, var6, var7, false);
      this.q(this.LR, var3, var6, var7, false);
   }

   private void q(kz var1, int var2, int var3, int var4) {
      var1.q(var2, var3, var4);
      if (var1.ba()) {
         this.LS = var1;
      }

   }

   // $FF: synthetic method
   static iT q(jV var0) {
      return var0.LS;
   }

   public jV(iT var1, iT var2) {
      this.LU = var1;
      this.LR = var2;
   }

   private void q(iT var1, int var2, int var3, int var4) {
      if (var1 != null && var1 instanceof iU) {
         this.w((iU)var1, var2, var3, var4);
      }

   }

   public boolean y(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = this.w(this.LU, var2, var3, var4);
      boolean var8 = this.w(this.LR, var2, var3, var4);
      return var7 || var8;
   }

   private boolean q(iU var1, int var2, int var3, int var4) {
      boolean var5 = var1.w(this.LT, var2, var3);
      if (var5) {
         this.LS = var1;
      }

      return var5;
   }

   private void q(jx var1, int var2, int var3, int var4, boolean var5) {
      var1.Kb = var2;
      if (!var5) {
         var1.y(this.LT, var3, var4);
      }

   }

   private void w(iU var1, int var2, int var3, int var4) {
      var1.f(var2, var3);
   }

   public void f(int var1, int var2, int var3) {
      this.q(this.LU, var3, 0, 0, true);
      this.q(this.LR, var3, 0, 0, true);
   }

   // $FF: synthetic method
   static iT w(jV var0) {
      return var0.LU;
   }

   private boolean w(iT var1, int var2, int var3, int var4) {
      if (var1 == null) {
         return false;
      } else if (var1 instanceof iU) {
         return this.q((iU)var1, var2, var3, var4);
      } else {
         if (var1 instanceof kz) {
            this.q((kz)var1, var2, var3, var4);
         }

         return false;
      }
   }

   public iT jo() {
      return this.LR;
   }

   // $FF: synthetic method
   static iT e(jV var0) {
      return var0.LR;
   }
}
