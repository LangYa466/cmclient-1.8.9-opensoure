final class Ee extends yy {
   private final yy bkJ = new yy();

   public GX q(yC var1, GX var2) {
      QI var3 = var1.dV();
      NW var4 = var1.dU().v(dr.N(var1.dT()));
      hI var5 = var3.g(var4);
      cv var6 = var5.ds();
      hn var7 = var6.cB();
      Fm var8;
      if (hn.zS.equals(var7) && var6 instanceof ey && ((Integer)var5.w(ey.rN)).intValue() == 0) {
         var8 = Et.bou;
      } else {
         if (!hn.zY.equals(var7) || !(var6 instanceof ey) || ((Integer)var5.w(ey.rN)).intValue() != 0) {
            return super.q(var1, var2);
         }

         var8 = Et.bnE;
      }

      var3.am(var4);
      if (--var2.bsH == 0) {
         var2.d(var8);
         var2.bsH = 1;
      } else if (((ND)var1.dW()).at(new GX(var8)) < 0) {
         this.bkJ.w(var1, new GX(var8));
      }

      return var2;
   }
}
