import com.google.common.base.Predicate;

final class hH implements Predicate {
   // $FF: synthetic field
   final Predicate AG;

   hH(Predicate var1) {
      this.AG = var1;
   }

   public boolean q(hG var1) {
      return var1 != null && this.AG.apply(var1.dO());
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.q((hG)var1);
   }
}
