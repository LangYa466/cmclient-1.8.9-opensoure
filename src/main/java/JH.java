import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;

class jh implements Predicate {
   // $FF: synthetic field
   final jg Ii;

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.P((String)var1);
   }

   jh(jg var1) {
      this.Ii = var1;
   }

   public boolean P(String var1) {
      Float var2 = Floats.tryParse(var1);
      return var1.length() == 0 || var2 != null && Floats.isFinite(var2.floatValue()) && var2.floatValue() >= 0.0F;
   }
}
