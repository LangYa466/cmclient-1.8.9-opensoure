import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class wa extends IOException {
   private final List aJt = Lists.newArrayList();
   private final String aJu;

   public String getMessage() {
      return w.q[824 & 32060] + ((wc)this.aJt.get(this.aJt.size() - 1)).toString() + q.q[2694 & 25229] + this.aJu;
   }

   public void aN(String var1) {
      wc.q((wc)this.aJt.get(0), var1);
      this.aJt.add(0, new wc());
   }

   public void aO(String var1) {
      wc.w((wc)this.aJt.get(0), var1);
   }

   public wa(String var1, Throwable var2) {
      super(var2);
      this.aJt.add(new wc());
      this.aJu = var1;
   }

   public static wa q(Exception var0) {
      if (var0 instanceof wa) {
         return (wa)var0;
      } else {
         String var1 = var0.getMessage();
         if (var0 instanceof FileNotFoundException) {
            var1 = i.q[23017 & -32280];
         }

         return new wa(var1, var0);
      }
   }

   public wa(String var1) {
      this.aJt.add(new wc());
      this.aJu = var1;
   }
}
