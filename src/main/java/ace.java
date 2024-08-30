import java.util.LinkedHashMap;
import java.util.Map.Entry;

class acE extends LinkedHashMap {
   // $FF: synthetic field
   final acC dfi;

   protected boolean removeEldestEntry(Entry var1) {
      acG var2 = (acG)var1.getValue();
      if (var2 != null) {
         acC.q(this.dfi, var2.aq);
      }

      return (boolean)(this.size() > (11464 & 20696) ? 1027 & 2057 : 24426 & 4);
   }

   acE(acC var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.dfi = var1;
   }
}
