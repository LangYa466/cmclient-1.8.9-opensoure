import com.google.common.base.Predicate;

final class xe implements Predicate {
   // $FF: synthetic field
   final int aKo;
   // $FF: synthetic field
   final int aKp;

   public boolean e(zk var1) {
      int var2 = xc.dn((int)Math.floor((double)var1.aNN));
      return this.aKp > this.aKo ? var2 >= this.aKp || var2 <= this.aKo : var2 >= this.aKp && var2 <= this.aKo;
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.e((zk)var1);
   }

   xe(int var1, int var2) {
      this.aKp = var1;
      this.aKo = var2;
   }
}
