final class Ef extends yy {
   private boolean bkK = true;

   protected void w(yC var1) {
      if (this.bkK) {
         var1.dV().e(1000, var1.dU(), 0);
      } else {
         var1.dV().e(1001, var1.dU(), 0);
      }

   }

   protected GX q(yC var1, GX var2) {
      QI var3 = var1.dV();
      NW var4 = var1.dU().v(dr.N(var1.dT()));
      if (var3.aj(var4)) {
         var3.r(var4, Ea.bkn.cx());
         if (var2.r(1, var3.bXs)) {
            var2.bsH = 0;
         }
      } else if (var3.g(var4).ds() == Ea.bjE) {
         Ea.bjE.q(var3, var4, Ea.bjE.cx().q(gN.xt, Boolean.valueOf(true)));
         var3.am(var4);
      } else {
         this.bkK = false;
      }

      return var2;
   }
}
