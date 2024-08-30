import java.util.Random;

public class Sw extends Tu {
   private cT chC;

   public boolean w(QI var1, Random var2, NW var3) {
      for(int var4 = 0; var4 < 64; ++var4) {
         NW var5 = var3.C(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
         if (var1.aj(var5) && (!var1.bXI.aad() || var5.aX() < 255) && this.chC.t(var1, var5, this.chC.cx())) {
            var1.q(var5, this.chC.cx(), 2);
         }
      }

      return true;
   }

   public Sw(cT var1) {
      this.chC = var1;
   }
}
