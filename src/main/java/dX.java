import com.google.common.collect.Maps;
import java.util.Map;

public enum DX {
   bgw(o.q[1015 & -25609], true),
   bgx(o.q[2041 & -5125], false),
   bgy(o.q[14331 & 3067], true),
   bgz(o.q[25599 & 4093], true),
   bgA(o.q[1023 & 1023], true);

   private static final Map bgB = Maps.newHashMap();
   private final boolean bgC;
   private final String bgD;

   private DX(String var3, boolean var4) {
      this.bgD = var3;
      this.bgC = var4;
   }

   public boolean GR() {
      return this.bgC;
   }

   public String GS() {
      return this.bgD;
   }

   public static DX br(String var0) {
      return (DX)bgB.get(var0);
   }

   static {
      for(DX var3 : values()) {
         bgB.put(var3.GS(), var3);
      }

   }
}
