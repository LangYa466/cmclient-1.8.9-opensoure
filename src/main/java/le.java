import com.google.common.collect.Lists;
import java.util.List;

public class lE implements lt, lv {
   private final List Ta = Lists.newArrayList();

   public OX kS() {
      return new Oo(u.q[4993 & 3043]);
   }

   public void w(lx var1) {
      var1.q(this);
   }

   public boolean kU() {
      for(lt var2 : this.Ta) {
         if (var2.kU()) {
            return true;
         }
      }

      return false;
   }

   public OX kT() {
      return new Oo(u.q[898 & -15406]);
   }

   public void w(float var1, int var2) {
      hS.eV().fJ().o(ky.OI);
      iT.q(0, 0, 16.0F, 0.0F, 16, 16, 256.0F, 256.0F);
   }

   public lE() {
      hS var1 = hS.eV();

      for(LX var3 : var1.Cg.wp().OJ()) {
         this.Ta.add(new lF(this, var3));
      }

   }

   public List kR() {
      return this.Ta;
   }
}
