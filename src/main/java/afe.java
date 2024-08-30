import java.util.HashMap;
import java.util.Map;

public class afE {
   public Map dsf = new HashMap();
   public String av;

   public int EW() {
      int var1 = 26012 & -28669;

      for(afI var3 : this.dsf.values()) {
         var1 = Math.max(var1, var3.EW());
      }

      return var1;
   }

   public afE(String var1) {
      this.av = var1;
   }
}
