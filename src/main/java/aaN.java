import java.util.ArrayList;
import java.util.Map;

public class aan {
   private net.optifine.expr.g[] cRy;
   private aam[] cRz;

   public void jx(int var1) {
      for(int var2 = 0; var2 < this.cRz.length; ++var2) {
         aam var3 = this.cRz[var2];
         var3.jx(var1);
      }

   }

   private void ce() {
      for(int var1 = 0; var1 < this.cRy.length; ++var1) {
         net.optifine.expr.g var2 = this.cRy[var1];
         var2.pK();
      }

   }

   public void pK() {
      for(int var1 = 0; var1 < this.cRz.length; ++var1) {
         aam var2 = this.cRz[var1];
         var2.pK();
      }

   }

   public aan(aam[] var1, Map var2) {
      this.cRz = var1;
      ArrayList var3 = new ArrayList();

      for(String var5 : var2.keySet()) {
         net.optifine.expr.d var6 = (net.optifine.expr.d)var2.get(var5);
         if (var6 instanceof net.optifine.expr.g) {
            net.optifine.expr.g var7 = (net.optifine.expr.g)var6;
            var3.add(var7);
         }
      }

      this.cRy = (net.optifine.expr.g[])var3.toArray(new net.optifine.expr.g[var3.size()]);
   }

   public void aW() {
      this.ce();

      for(int var1 = 0; var1 < this.cRz.length; ++var1) {
         aam var2 = this.cRz[var1];
         var2.aW();
      }

   }
}
