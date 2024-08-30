import com.google.common.collect.Maps;
import java.util.Map;

public enum PN {
   bUk(i.q[20853 & 2359]),
   bUl(t.q[16894 & 622]);

   private static final Map bUm = Maps.newHashMap();
   private final String bUn;

   private PN(String var3) {
      this.bUn = var3;
   }

   public static PN dl(String var0) {
      return (PN)bUm.get(var0.toLowerCase());
   }

   static {
      for(PN var3 : values()) {
         bUm.put(var3.bUn, var3);
      }

   }
}
