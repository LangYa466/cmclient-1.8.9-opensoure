import java.util.EnumSet;
import java.util.Set;

public enum JR {
   bxJ(0),
   bxK(1),
   bxL(2),
   bxM(3),
   bxN(4);

   private int bxO;

   private JR(int var3) {
      this.bxO = var3;
   }

   private int KG() {
      return 1 << this.bxO;
   }

   private boolean fE(int var1) {
      return (var1 & this.KG()) == this.KG();
   }

   public static Set fF(int var0) {
      EnumSet var1 = EnumSet.noneOf(JR.class);

      for(JR var5 : values()) {
         if (var5.fE(var0)) {
            var1.add(var5);
         }
      }

      return var1;
   }

   public static int w(Set var0) {
      int var1 = 0;

      for(JR var3 : var0) {
         var1 |= var3.KG();
      }

      return var1;
   }
}
