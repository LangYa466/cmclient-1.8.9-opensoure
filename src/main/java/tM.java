import java.util.Random;

public class Tm extends Tu {
   private cv ciV;

   public boolean w(QI var1, Random var2, NW var3) {
      if (var1.aj(var3) && var1.g(var3.Vj()).ds() == this.ciV) {
         int var4 = var2.nextInt(32) + 6;
         int var5 = var2.nextInt(4) + 1;
         Ob var6 = new Ob();

         for(int var7 = var3.aY() - var5; var7 <= var3.aY() + var5; ++var7) {
            for(int var8 = var3.KO() - var5; var8 <= var3.KO() + var5; ++var8) {
               int var9 = var7 - var3.aY();
               int var10 = var8 - var3.KO();
               if (var9 * var9 + var10 * var10 <= var5 * var5 + 1 && var1.g(var6.D(var7, var3.aX() - 1, var8)).ds() != this.ciV) {
                  return false;
               }
            }
         }

         for(int var12 = var3.aX(); var12 < var3.aX() + var4 && var12 < 256; ++var12) {
            for(int var14 = var3.aY() - var5; var14 <= var3.aY() + var5; ++var14) {
               for(int var15 = var3.KO() - var5; var15 <= var3.KO() + var5; ++var15) {
                  int var16 = var14 - var3.aY();
                  int var11 = var15 - var3.KO();
                  if (var16 * var16 + var11 * var11 <= var5 * var5 + 1) {
                     var1.q(new NW(var14, var12, var15), Ea.bit.cx(), 2);
                  }
               }
            }
         }

         Bx var13 = new Bx(var1);
         var13.q((double)((float)var3.aY() + 0.5F), (double)(var3.aX() + var4), (double)((float)var3.KO() + 0.5F), var2.nextFloat() * 360.0F, 0.0F);
         var1.p(var13);
         var1.q(var3.gx(var4), Ea.bha.cx(), 2);
         return true;
      } else {
         return false;
      }
   }

   public Tm(cv var1) {
      this.ciV = var1;
   }
}
