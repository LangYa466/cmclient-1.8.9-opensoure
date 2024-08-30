import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class wc {
   private String aJv;
   private final List aJw;

   private wc() {
      this.aJv = null;
      this.aJw = Lists.newArrayList();
   }

   private void aP(String var1) {
      this.aJw.add(0, var1);
   }

   public String toString() {
      return this.aJv != null ? (!this.aJw.isEmpty() ? this.aJv + q.q[15695 & -15910] + this.vD() : this.aJv) : (!this.aJw.isEmpty() ? y.q[2418 & -30725] + this.vD() : y.q[20851 & 511]);
   }

   // $FF: synthetic method
   static String q(wc var0, String var1) {
      return var0.aJv = var1;
   }

   public String vD() {
      return StringUtils.join(this.aJw, y.q[1397 & -7823]);
   }

   // $FF: synthetic method
   static void w(wc var0, String var1) {
      var0.aP(var1);
   }
}
