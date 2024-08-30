import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collections;
import java.util.List;

public class Ay extends AN {
   private final int aUG;
   protected final AA aUH;
   protected Predicate aUI;
   protected final Class aUJ;
   protected zz aUD;

   public Ay(zr var1, Class var2, boolean var3, boolean var4) {
      this(var1, var2, 10, var3, var4, (Predicate)null);
   }

   public Ay(zr var1, Class var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public void Az() {
      this.aVk.f(this.aUD);
      super.Az();
   }

   public Ay(zr var1, Class var2, int var3, boolean var4, boolean var5, Predicate var6) {
      super(var1, var4, var5);
      this.aUJ = var2;
      this.aUG = var3;
      this.aUH = new AA(var1);
      this.dX(1);
      this.aUI = new Az(this, var6);
   }

   public boolean Av() {
      if (this.aUG > 0 && this.aVk.zY().nextInt(this.aUG) != 0) {
         return false;
      } else {
         double var1 = this.AO();
         List var3 = this.aVk.vR.q(this.aUJ, this.aVk.xE().C(var1, 4.0D, var1), Predicates.and(this.aUI, OD.bPV));
         Collections.sort(var3, this.aUH);
         if (var3.isEmpty()) {
            return false;
         } else {
            this.aUD = (zz)var3.get(0);
            return true;
         }
      }
   }
}
