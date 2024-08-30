import java.util.Random;

public class SS extends Tu {
   public boolean w(QI var1, Random var2, NW var3) {
      for(int var4 = 0; var4 < 64; ++var4) {
         NW var5 = var3.C(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
         if (var1.aj(var5) && var1.g(var5.Vj()).ds() == Ea.bhG) {
            var1.q(var5, Ea.bkn.cx(), 2);
         }
      }

      return true;
   }
}
