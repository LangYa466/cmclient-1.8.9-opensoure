import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class hO {
   private int AX;
   private final List AY = Lists.newArrayList();
   private static final Joiner AZ = Joiner.on(q.q[4831 & -29877]);
   private final Map Ba = Maps.newHashMap();
   private int Bb;

   public hO w(String... var1) {
      if (!ArrayUtils.isEmpty((Object[])var1) && !StringUtils.isEmpty(var1[0])) {
         if (this.AY.isEmpty()) {
            this.Bb = var1.length;
            this.AX = var1[0].length();
         }

         if (var1.length != this.Bb) {
            throw new IllegalArgumentException(i.q[-15443 & 941] + this.Bb + i.q[1966 & -19521] + var1.length + w.q[29 & 17567]);
         } else {
            for(String var5 : var1) {
               if (var5.length() != this.AX) {
                  throw new IllegalArgumentException(i.q[-13393 & 6127] + this.AX + i.q[3003 & 1968] + var5.length() + w.q[63 & 2973]);
               }

               for(char var9 : var5.toCharArray()) {
                  if (!this.Ba.containsKey(Character.valueOf(var9))) {
                     this.Ba.put(Character.valueOf(var9), (Predicate)null);
                  }
               }
            }

            this.AY.add(var1);
            return this;
         }
      } else {
         throw new IllegalArgumentException(i.q[3057 & 6073]);
      }
   }

   public static hO eP() {
      return new hO();
   }

   private hO() {
      this.Ba.put(Character.valueOf(' '), Predicates.alwaysTrue());
   }

   private Predicate[][][] eQ() {
      this.eR();
      Predicate[][][] var1 = (Predicate[][][])Array.newInstance(Predicate.class, new int[]{this.AY.size(), this.Bb, this.AX});

      for(int var2 = 0; var2 < this.AY.size(); ++var2) {
         for(int var3 = 0; var3 < this.Bb; ++var3) {
            for(int var4 = 0; var4 < this.AX; ++var4) {
               var1[var2][var3][var4] = (Predicate)this.Ba.get(Character.valueOf(((String[])((String[])this.AY.get(var2)))[var3].charAt(var4)));
            }
         }
      }

      return var1;
   }

   private void eR() {
      ArrayList var1 = Lists.newArrayList();

      for(Entry var3 : this.Ba.entrySet()) {
         if (var3.getValue() == null) {
            var1.add(var3.getKey());
         }
      }

      if (!var1.isEmpty()) {
         throw new IllegalStateException(i.q[12210 & -31822] + AZ.join(var1) + i.q[27571 & 1975]);
      }
   }

   public hO q(char var1, Predicate var2) {
      this.Ba.put(Character.valueOf(var1), var2);
      return this;
   }

   public hK eS() {
      return new hK(this.eQ());
   }
}
