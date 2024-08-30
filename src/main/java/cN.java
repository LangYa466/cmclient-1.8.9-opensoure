import com.google.common.base.Predicate;

class Cn implements Predicate {
   private Cj bah;

   public Cn(Cj var1) {
      this.bah = var1;
   }

   public boolean k(zz var1) {
      return (var1 instanceof DD || var1 instanceof Do) && var1.B(this.bah) > 9.0D;
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.k((zz)var1);
   }
}
