import com.google.common.base.Predicate;

class QV implements Predicate {
   // $FF: synthetic field
   final QU bYC;

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.k((zz)var1);
   }

   QV(QU var1) {
      this.bYC = var1;
   }

   public boolean k(zz var1) {
      return var1 != null && var1.xV() && this.bYC.aw(var1.dt());
   }
}
