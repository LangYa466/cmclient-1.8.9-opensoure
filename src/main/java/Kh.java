import com.google.common.base.Predicate;
import java.net.IDN;

class kh implements Predicate {
   // $FF: synthetic field
   final kg MI;

   public boolean P(String var1) {
      if (var1.length() == 0) {
         return true;
      } else {
         String[] var2 = var1.split(w.q[4219 & -23562]);
         if (var2.length == 0) {
            return true;
         } else {
            try {
               String var3 = IDN.toASCII(var2[0]);
               return true;
            } catch (IllegalArgumentException var4) {
               return false;
            }
         }
      }
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.P((String)var1);
   }

   kh(kg var1) {
      this.MI = var1;
   }
}
