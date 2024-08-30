import java.util.HashMap;
import java.util.Map;

public class aao implements net.optifine.expr.k {
   private Map cRA = new HashMap();

   private void amd() {
      aar[] var1 = aar.values();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         aar var3 = var1[var2];
         this.q(this.cRA, var3);
      }

      aap[] var8 = aap.values();

      for(int var9 = 0; var9 < var8.length; ++var9) {
         aap var4 = var8[var9];
         this.cRA.put(var4.bY(), var4);
      }

      for(Rl var11 : Rl.cbr.values()) {
         String var5 = var11.caU.trim();
         var5 = u.q[373 & -28163] + var5.toUpperCase().replace(' ', '_');
         int var6 = var11.car;
         net.optifine.expr.q var7 = new net.optifine.expr.q((float)var6);
         this.q(var5, var7);
      }

   }

   public aao(Map var1) {
      this.amd();

      for(String var3 : var1.keySet()) {
         net.optifine.expr.d var4 = (net.optifine.expr.d)var1.get(var3);
         this.q(var3, var4);
      }

   }

   private void q(Map var1, aar var2) {
      String[] var3 = var2.amf();
      if (var3 == null) {
         var1.put(var2.bY(), new aat(var2));
      } else {
         for(int var4 = 0; var4 < var3.length; ++var4) {
            String var5 = var3[var4];
            String[] var6 = var2.amg();
            if (var6 == null) {
               var1.put(var2.bY() + q.q[587 & -24381] + var5, new aat(var2, var4));
            } else {
               for(int var7 = 0; var7 < var6.length; ++var7) {
                  String var8 = var6[var7];
                  var1.put(var2.bY() + q.q[25667 & 2151] + var5 + q.q[579 & 8387] + var8, new aat(var2, var4, var7));
               }
            }
         }
      }

   }

   public boolean gB(String var1) {
      return this.cRA.containsKey(var1);
   }

   public net.optifine.expr.d eY(String var1) {
      return (net.optifine.expr.d)this.cRA.get(var1);
   }

   public boolean q(String var1, net.optifine.expr.d var2) {
      if (this.cRA.containsKey(var1)) {
         net.optifine.shaders.x.fu(t.q[2875 & -23765] + var1);
         return false;
      } else {
         this.cRA.put(var1, var2);
         return true;
      }
   }
}
