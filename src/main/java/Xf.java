import com.google.common.base.Predicate;

final class xf implements Predicate {
   // $FF: synthetic field
   final NV aKq;

   xf(NV var1) {
      this.aKq = var1;
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.e((zk)var1);
   }

   public boolean e(zk var1) {
      return var1.aNZ >= this.aKq.bNW && var1.aNK >= this.aKq.bNT && var1.aOt >= this.aKq.bNY ? var1.aNZ < this.aKq.bNU && var1.aNK < this.aKq.bNX && var1.aOt < this.aKq.bNV : false;
   }
}
