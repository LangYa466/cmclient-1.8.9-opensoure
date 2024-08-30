import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class hD extends hE {
   private final ImmutableMap At;
   private ImmutableTable Au;
   private final cv Av;

   public void q(Map var1) {
      if (this.Au != null) {
         throw new IllegalStateException();
      } else {
         HashBasedTable var2 = HashBasedTable.create();
         UnmodifiableIterator var3 = this.At.keySet().iterator();

         while(var3.hasNext()) {
            ht var4 = (ht)var3.next();

            for(Comparable var6 : var4.et()) {
               if (var6 != this.At.get(var4)) {
                  var2.put(var4, var6, var1.get(this.w(var4, var6)));
               }
            }
         }

         this.Au = ImmutableTable.copyOf(var2);
      }
   }

   private hD(cv var1, ImmutableMap var2) {
      this.Av = var1;
      this.At = var2;
   }

   public ImmutableMap eB() {
      return this.At;
   }

   public int hashCode() {
      return this.At.hashCode();
   }

   // $FF: synthetic method
   hD(cv var1, ImmutableMap var2, hB var3) {
      this(var1, var2);
   }

   public hI q(ht var1, Comparable var2) {
      if (!this.At.containsKey(var1)) {
         throw new IllegalArgumentException(i.q[-7691 & 2547] + var1 + i.q[-29192 & 496] + this.Av.cW());
      } else if (!var1.et().contains(var2)) {
         throw new IllegalArgumentException(i.q[15857 & 1023] + var1 + i.q[-12805 & 502] + var2 + i.q[-22017 & 17395] + cv.nk.z(this.Av) + i.q[-22538 & 4597]);
      } else {
         return (hI)(this.At.get(var1) == var2 ? this : (hI)this.Au.get(var1, var2));
      }
   }

   public boolean equals(Object var1) {
      return this == var1;
   }

   public Collection eC() {
      return Collections.unmodifiableCollection(this.At.keySet());
   }

   private Map w(ht var1, Comparable var2) {
      HashMap var3 = Maps.newHashMap(this.At);
      var3.put(var1, var2);
      return var3;
   }

   public Comparable w(ht var1) {
      if (!this.At.containsKey(var1)) {
         throw new IllegalArgumentException(i.q[17903 & -25601] + var1 + i.q[-12303 & 496] + this.Av.cW());
      } else {
         return (Comparable)var1.es().cast(this.At.get(var1));
      }
   }

   public cv ds() {
      return this.Av;
   }
}
