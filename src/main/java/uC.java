import java.util.Map;
import java.util.Map.Entry;

public class Uc extends Uj {
   private double ckb = 0.004D;

   public String acH() {
      return t.q[5406 & -31942];
   }

   public Uc() {
   }

   protected boolean bj(int var1, int var2) {
      return this.oF.nextDouble() < this.ckb && this.oF.nextInt(80) < Math.max(Math.abs(var1), Math.abs(var2));
   }

   public Uc(Map var1) {
      for(Entry var3 : var1.entrySet()) {
         if (((String)var3.getKey()).equals(o.q[10141 & -13379])) {
            this.ckb = Pq.e((String)var3.getValue(), this.ckb);
         }
      }

   }

   protected Vw bk(int var1, int var2) {
      return new UC(this.vR, this.oF, var1, var2);
   }
}
