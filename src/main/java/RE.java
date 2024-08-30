import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class re {
   private Set aoc = Sets.newIdentityHashSet();
   private Map aod = Maps.newIdentityHashMap();

   public void w(cv var1, rg var2) {
      this.aod.put(var1, var2);
   }

   public Map qG() {
      IdentityHashMap var1 = Maps.newIdentityHashMap();

      for(cv var3 : cv.nk) {
         if (!this.aoc.contains(var3)) {
            var1.putAll(((rg)Objects.firstNonNull(this.aod.get(var3), new rf())).x(var3));
         }
      }

      return var1;
   }

   public void q(cv... var1) {
      Collections.addAll(this.aoc, var1);
   }
}
