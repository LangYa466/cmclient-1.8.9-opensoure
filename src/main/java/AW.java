public class Aw extends zW {
   private double aUA;
   private double aTz;
   private double aUB;
   private zr aSA;
   private double aUC;

   public boolean Ay() {
      return !this.aSA.yM().NE();
   }

   public boolean Av() {
      if (this.aSA.yx()) {
         return false;
      } else {
         NW var1 = this.aSA.yA();
         PX var2 = Be.w(this.aSA, 16, 7, new PX((double)var1.aY(), (double)var1.aX(), (double)var1.KO()));
         if (var2 == null) {
            return false;
         } else {
            this.aUA = var2.bUV;
            this.aUC = var2.bUW;
            this.aUB = var2.bUX;
            return true;
         }
      }
   }

   public Aw(zr var1, double var2) {
      this.aSA = var1;
      this.aTz = var2;
      this.dX(1);
   }

   public void Az() {
      this.aSA.yM().y(this.aUA, this.aUC, this.aUB, this.aTz);
   }
}
