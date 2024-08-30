import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class PD implements Pa {
   private final IdentityHashMap bTN = new IdentityHashMap(512);
   private final List bTO = Lists.newArrayList();

   public int l(Object var1) {
      Integer var2 = (Integer)this.bTN.get(var1);
      return var2 == null ? -1 : var2.intValue();
   }

   public void q(Object var1, int var2) {
      this.bTN.put(var1, Integer.valueOf(var2));

      while(this.bTO.size() <= var2) {
         this.bTO.add((Object)null);
      }

      this.bTO.set(var2, var1);
   }

   public final Object gY(int var1) {
      return var1 >= 0 && var1 < this.bTO.size() ? this.bTO.get(var1) : null;
   }

   public Iterator iterator() {
      return Iterators.filter(this.bTO.iterator(), Predicates.notNull());
   }
}
