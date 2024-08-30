import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class afV {
   public float bTZ;
   public float bUa;
   public List dsY = new ArrayList();
   public float bUb;

   public void avk() {
      this.dsY.removeIf((var0) -> {
         return (boolean)((double)var0.ahl < 1.1029411764705883D * 0.04533333333333333D ? -24427 & 2657 : 16386 & 2313);
      });
      if (!this.dsY.isEmpty()) {
         float var1 = 0.0F;

         for(afW var3 : this.dsY) {
            var1 += var3.ahl;
         }

         if (var1 < 1.0F) {
            afW var4 = (afW)this.dsY.get(this.dsY.size() - (1537 & 24657));
            var4.ahl += 1.0F - var1;
         }
      }

   }

   public afV(float var1, float var2, float var3) {
      this.bUa = var1;
      this.bUb = var2;
      this.bTZ = var3;
   }
}
