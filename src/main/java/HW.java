import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;

public class hw extends hx {
   private final Map Ac = Maps.newHashMap();
   private final ImmutableSet Ad;

   protected hw(String var1, Class var2, Collection var3) {
      super(var1, var2);
      this.Ad = ImmutableSet.copyOf(var3);

      for(Enum var5 : var3) {
         String var6 = ((Pd)var5).bY();
         if (this.Ac.containsKey(var6)) {
            throw new IllegalArgumentException(a.q[223 & 5791] + var6 + q.q[4396 & -30612]);
         }

         this.Ac.put(var6, var5);
      }

   }

   public static hw q(String var0, Class var1, Enum... var2) {
      return q(var0, var1, Lists.newArrayList(var2));
   }

   public static hw q(String var0, Class var1, Collection var2) {
      return new hw(var0, var1, var2);
   }

   public static hw q(String var0, Class var1) {
      return q(var0, var1, Predicates.alwaysTrue());
   }

   public Collection et() {
      return this.Ad;
   }

   public static hw q(String var0, Class var1, Predicate var2) {
      return q(var0, var1, Collections2.filter(Lists.newArrayList(var1.getEnumConstants()), var2));
   }

   public String q(Enum var1) {
      return ((Pd)var1).bY();
   }
}
