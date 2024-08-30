import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;

public class hy extends hx {
   private final ImmutableSet Ag;

   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.Ag.hashCode();
      return var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         if (!super.equals(var1)) {
            return false;
         } else {
            hy var2 = (hy)var1;
            return this.Ag.equals(var2.Ag);
         }
      } else {
         return false;
      }
   }

   public String w(Integer var1) {
      return var1.toString();
   }

   public static hy w(String var0, int var1, int var2) {
      return new hy(var0, var1, var2);
   }

   protected hy(String var1, int var2, int var3) {
      super(var1, Integer.class);
      if (var2 < 0) {
         throw new IllegalArgumentException(i.q[-7195 & 4590] + var1 + i.q[493 & 11765]);
      } else if (var3 <= var2) {
         throw new IllegalArgumentException(i.q[-15890 & 12774] + var1 + i.q[5615 & 1015] + var2 + w.q[16415 & 253]);
      } else {
         HashSet var4 = Sets.newHashSet();

         for(int var5 = var2; var5 <= var3; ++var5) {
            var4.add(Integer.valueOf(var5));
         }

         this.Ag = ImmutableSet.copyOf(var4);
      }
   }

   public Collection et() {
      return this.Ag;
   }

   // $FF: synthetic method
   public String q(Comparable var1) {
      return this.w((Integer)var1);
   }
}
