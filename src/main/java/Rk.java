import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class rk implements rg {
   protected Map aoi = Maps.newLinkedHashMap();

   protected abstract vE C(hI var1);

   public String r(Map var1) {
      StringBuilder var2 = new StringBuilder();

      for(Entry var4 : var1.entrySet()) {
         if (var2.length() != 0) {
            var2.append(q.q[-32021 & 1883]);
         }

         ht var5 = (ht)var4.getKey();
         Comparable var6 = (Comparable)var4.getValue();
         var2.append(var5.bY());
         var2.append(q.q[-11178 & 415]);
         var2.append(var5.q(var6));
      }

      if (var2.length() == 0) {
         var2.append(q.q[21198 & -30074]);
      }

      return var2.toString();
   }

   public Map x(cv var1) {
      UnmodifiableIterator var2 = var1.cW().ex().iterator();

      while(var2.hasNext()) {
         hI var3 = (hI)var2.next();
         this.aoi.put(var3, this.C(var3));
      }

      return this.aoi;
   }
}
