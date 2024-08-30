import java.util.Random;

public class dB extends cv {
   public void q(QI var1, NW var2, hI var3, cv var4) {
      var1.q(var2, this, this.q(var1));
   }

   private void n(QI var1, NW var2) {
      if (dJ.C(var1, var2.Vj()) && var2.aX() >= 0) {
         byte var3 = 32;
         if (!dJ.ps && var1.r(var2.C(-var3, -var3, -var3), var2.C(var3, var3, var3))) {
            var1.p(new BB(var1, (double)((float)var2.aY() + 0.5F), (double)var2.aX(), (double)((float)var2.KO() + 0.5F), this.cx()));
         } else {
            var1.am(var2);

            NW var4;
            for(var4 = var2; dJ.C(var1, var4) && var4.aX() > 0; var4 = var4.Vj()) {
               ;
            }

            if (var4.aX() > 0) {
               var1.q(var4, this.cx(), 2);
            }
         }
      }

   }

   public Fm i(QI var1, NW var2) {
      return null;
   }

   public void q(QI var1, NW var2, DD var3) {
      this.m(var1, var2);
   }

   public boolean cr() {
      return false;
   }

   private void m(QI var1, NW var2) {
      hI var3 = var1.g(var2);
      if (var3.ds() == this) {
         for(int var4 = 0; var4 < 1000; ++var4) {
            NW var5 = var2.C(var1.bXs.nextInt(16) - var1.bXs.nextInt(16), var1.bXs.nextInt(8) - var1.bXs.nextInt(8), var1.bXs.nextInt(16) - var1.bXs.nextInt(16));
            if (var1.g(var5).ds().mS == hn.zp) {
               if (var1.bXF) {
                  for(int var6 = 0; var6 < 128; ++var6) {
                     double var7 = var1.bXs.nextDouble();
                     float var9 = (var1.bXs.nextFloat() - 0.5F) * 0.2F;
                     float var10 = (var1.bXs.nextFloat() - 0.5F) * 0.2F;
                     float var11 = (var1.bXs.nextFloat() - 0.5F) * 0.2F;
                     double var12 = (double)var5.aY() + (double)(var2.aY() - var5.aY()) * var7 + (var1.bXs.nextDouble() - 0.5D) + 0.5D;
                     double var14 = (double)var5.aX() + (double)(var2.aX() - var5.aX()) * var7 + var1.bXs.nextDouble() - 0.5D;
                     double var16 = (double)var5.KO() + (double)(var2.KO() - var5.KO()) * var7 + (var1.bXs.nextDouble() - 0.5D) + 0.5D;
                     var1.q(OP.bRI, var12, var14, var16, (double)var9, (double)var10, (double)var11);
                  }
               } else {
                  var1.q(var5, var3, 2);
                  var1.am(var2);
               }

               return;
            }
         }
      }

   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      this.m(var1, var2);
      return true;
   }

   public boolean cw() {
      return false;
   }

   public dB() {
      super(hn.zr, hm.za);
      this.w(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
   }

   public int q(QI var1) {
      return 5;
   }

   public void w(QI var1, NW var2, hI var3) {
      var1.q(var2, this, this.q(var1));
   }

   public boolean w(Qx var1, NW var2, OK var3) {
      return true;
   }

   public void e(QI var1, NW var2, hI var3, Random var4) {
      this.n(var1, var2);
   }
}
