import com.google.common.base.Predicate;

final class fA implements Predicate {
   public boolean w(fx var1) {
      return var1 != fx.tT && var1 != fx.tS && var1 != fx.tQ && var1 != fx.tR;
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.w((fx)var1);
   }
}
