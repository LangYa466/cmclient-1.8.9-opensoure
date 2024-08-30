import com.google.common.base.Predicate;

class fI implements Predicate {
   // $FF: synthetic field
   final fH uv;
   // $FF: synthetic field
   final OK uw;

   public boolean e(zk var1) {
      return var1 != null && var1.xT() == this.uw;
   }

   fI(fH var1, OK var2) {
      this.uv = var1;
      this.uw = var2;
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.e((zk)var1);
   }
}
