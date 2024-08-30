public class AV extends zW {
   private zr aVL;
   private double aqh;
   private boolean aVM;
   private double aqf;
   private double aUF;
   private int aVN;
   private double aqg;

   public boolean Ay() {
      return !this.aVL.yM().NE();
   }

   public AV(zr var1, double var2, int var4) {
      this.aVL = var1;
      this.aUF = var2;
      this.aVN = var4;
      this.dX(1);
   }

   public void Az() {
      this.aVL.yM().y(this.aqh, this.aqf, this.aqg, this.aUF);
   }

   public AV(zr var1, double var2) {
      this(var1, var2, 120);
   }

   public void AT() {
      this.aVM = true;
   }

   public boolean Av() {
      if (!this.aVM) {
         if (this.aVL.Aa() >= 100) {
            return false;
         }

         if (this.aVL.zY().nextInt(this.aVN) != 0) {
            return false;
         }
      }

      PX var1 = Be.q(this.aVL, 10, 7);
      if (var1 == null) {
         return false;
      } else {
         this.aqh = var1.bUV;
         this.aqf = var1.bUW;
         this.aqg = var1.bUX;
         this.aVM = false;
         return true;
      }
   }

   public void dY(int var1) {
      this.aVN = var1;
   }
}
