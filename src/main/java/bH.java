import com.google.common.collect.Maps;
import java.util.Map;

public enum BH {
   aYo(0, w.q[4039 & -15387]),
   aYp(1, u.q[-31942 & 3338]),
   aYq(2, u.q[780 & 2460]),
   aYr(3, u.q[4414 & 17806]),
   aYs(4, u.q[341 & -15598]),
   aYt(5, u.q[8978 & 1494]),
   aYu(6, u.q[4500 & 8469]);

   private static final Map aYv = Maps.newHashMap();
   private final int aYw;
   private final String aYx;

   private BH(int var3, String var4) {
      this.aYw = var3;
      this.aYx = var4;
   }

   public int CA() {
      return this.aYw;
   }

   public String bY() {
      return this.aYx;
   }

   public static BH eq(int var0) {
      BH var1 = (BH)aYv.get(Integer.valueOf(var0));
      return var1 == null ? aYo : var1;
   }

   static {
      for(BH var3 : values()) {
         aYv.put(Integer.valueOf(var3.CA()), var3);
      }

   }
}
