final class Eg extends yy {
   private boolean bkL = true;

   protected GX q(yC var1, GX var2) {
      if (Fk.bqj == Fk.fc(var2.dm())) {
         QI var3 = var1.dV();
         NW var4 = var1.dU().v(dr.N(var1.dT()));
         if (Ga.q(var2, var3, var4)) {
            if (!var3.bXF) {
               var3.e(2005, var4, 0);
            }
         } else {
            this.bkL = false;
         }

         return var2;
      } else {
         return super.q(var1, var2);
      }
   }

   protected void w(yC var1) {
      if (this.bkL) {
         var1.dV().e(1000, var1.dU(), 0);
      } else {
         var1.dV().e(1001, var1.dU(), 0);
      }

   }
}
