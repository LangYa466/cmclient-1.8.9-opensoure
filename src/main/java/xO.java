import com.google.common.base.Predicate;

final class xo implements Predicate {
   // $FF: synthetic field
   final int aKH;
   // $FF: synthetic field
   final int aKI;

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.e((zk)var1);
   }

   xo(int var1, int var2) {
      this.aKH = var1;
      this.aKI = var2;
   }

   public boolean e(zk var1) {
      int var2 = xc.dn((int)Math.floor((double)var1.aOn));
      return this.aKH > this.aKI ? var2 >= this.aKH || var2 <= this.aKI : var2 >= this.aKH && var2 <= this.aKI;
   }
}
