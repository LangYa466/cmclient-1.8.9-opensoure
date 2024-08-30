import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class uw {
   private int apI;
   private final ux aym;
   private int ayn;
   private final uy ayo;
   private static final Logger ayp = LogManager.getLogger();

   public final uy ta() {
      return this.ayo;
   }

   public final int tb() {
      return this.apI;
   }

   public final int tc() {
      return this.ayn;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         uw var2 = (uw)var1;
         return this.ayn != var2.ayn ? false : (this.apI != var2.apI ? false : (this.aym != var2.aym ? false : this.ayo == var2.ayo));
      } else {
         return false;
      }
   }

   public final int td() {
      return this.aym.bh() * this.ayn;
   }

   public String toString() {
      return this.ayn + q.q[591 & 891] + this.ayo.tg() + q.q[603 & 747] + this.aym.tg();
   }

   public final ux te() {
      return this.aym;
   }

   public uw(int var1, ux var2, uy var3, int var4) {
      if (!this.q(var1, var3)) {
         ayp.warn(a.q[382 & 4127]);
         this.ayo = uy.ayE;
      } else {
         this.ayo = var3;
      }

      this.aym = var2;
      this.apI = var1;
      this.ayn = var4;
   }

   private final boolean q(int var1, uy var2) {
      return var1 == 0 || var2 == uy.ayE;
   }

   public final boolean tf() {
      return this.ayo == uy.ayB;
   }

   public int hashCode() {
      int var1 = this.aym.hashCode();
      var1 = 31 * var1 + this.ayo.hashCode();
      var1 = 31 * var1 + this.apI;
      var1 = 31 * var1 + this.ayn;
      return var1;
   }
}
