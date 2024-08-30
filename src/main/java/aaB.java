import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class aab {
   private String av = null;
   private Map cQP = new LinkedHashMap();
   private Set cQQ = new LinkedHashSet();

   public void I(String var1, String var2) {
      this.cQP.put(var1, var2);
   }

   public boolean gx(String var1) {
      return this.cQQ.contains(var1);
   }

   public void e(ZP[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         ZP var3 = var1[var2];
         String var4 = var3.bY();
         String var5 = (String)this.cQP.get(var4);
         if (var5 != null) {
            var3.ge(var5);
         }
      }

   }

   public String gy(String var1) {
      return (String)this.cQP.get(var1);
   }

   public void gz(String var1) {
      this.cQQ.add(var1);
   }

   public aab(String var1) {
      this.av = var1;
   }

   public void o(Collection var1) {
      this.cQQ.addAll(var1);
   }

   public void q(aab var1) {
      if (var1 != null) {
         this.cQP.putAll(var1.cQP);
      }

   }

   public String[] alN() {
      Set var1 = this.cQP.keySet();
      String[] var2 = (String[])var1.toArray(new String[var1.size()]);
      return var2;
   }

   public void gA(String var1) {
      this.cQQ.remove(var1);
   }

   public Collection alO() {
      return new LinkedHashSet(this.cQQ);
   }

   public String bY() {
      return this.av;
   }
}
