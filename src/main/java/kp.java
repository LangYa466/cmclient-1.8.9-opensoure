import com.google.common.collect.Lists;
import java.util.List;

public class kP extends jB {
   private final jI Qc;
   private final List Qd = Lists.newArrayList();
   private final jC Qe = new kM();
   private int Qf = -1;
   private final List Qg = Lists.newArrayList();

   protected int bj() {
      return super.bj() + 30;
   }

   public kP(jI var1, hS var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.Qc = var1;
   }

   protected boolean x(int var1) {
      return var1 == this.Qf;
   }

   public void q(List var1) {
      this.Qd.clear();

      for(mV var3 : var1) {
         this.Qd.add(new kL(this.Qc, var3));
      }

   }

   public void bh(int var1) {
      this.Qf = var1;
   }

   public void q(mN var1) {
      this.Qg.clear();

      for(int var2 = 0; var2 < var1.lN(); ++var2) {
         this.Qg.add(new kN(this.Qc, var1.bt(var2)));
      }

   }

   protected int bh() {
      return this.Qg.size() + 1 + this.Qd.size();
   }

   public int ky() {
      return this.Qf;
   }

   public jC aB(int var1) {
      if (var1 < this.Qg.size()) {
         return (jC)this.Qg.get(var1);
      } else {
         var1 = var1 - this.Qg.size();
         if (var1 == 0) {
            return this.Qe;
         } else {
            --var1;
            return (jC)this.Qd.get(var1);
         }
      }
   }

   public int iC() {
      return super.iC() + 85;
   }
}
