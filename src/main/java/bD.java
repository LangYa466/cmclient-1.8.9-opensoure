import com.google.common.collect.Lists;
import java.util.List;

public class Bd {
   List aWa = Lists.newArrayList();
   zx aWb;
   List aWc = Lists.newArrayList();

   public void Bh() {
      this.aWc.clear();
      this.aWa.clear();
   }

   public Bd(zx var1) {
      this.aWb = var1;
   }

   public boolean M(zk var1) {
      if (this.aWc.contains(var1)) {
         return true;
      } else if (this.aWa.contains(var1)) {
         return false;
      } else {
         this.aWb.vR.bXK.cf(p.q[477 & -27439]);
         boolean var2 = this.aWb.J(var1);
         this.aWb.vR.bXK.Ol();
         if (var2) {
            this.aWc.add(var1);
         } else {
            this.aWa.add(var1);
         }

         return var2;
      }
   }
}
