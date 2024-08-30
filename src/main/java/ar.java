public class Ar extends zW {
   private zx aUf;
   private double aUg;
   private double aUh;
   private int aUi;

   public boolean Av() {
      return this.aUf.zY().nextFloat() < 0.02F;
   }

   public void Az() {
      double var1 = 6.283185307179586D * this.aUf.zY().nextDouble();
      this.aUg = Math.cos(var1);
      this.aUh = Math.sin(var1);
      this.aUi = 20 + this.aUf.zY().nextInt(20);
   }

   public Ar(zx var1) {
      this.aUf = var1;
      this.dX(3);
   }

   public void Ax() {
      --this.aUi;
      this.aUf.zl().r(this.aUf.aNZ + this.aUg, this.aUf.aNK + (double)this.aUf.xC(), this.aUf.aOt + this.aUh, 10.0F, (float)this.aUf.yU());
   }

   public boolean Ay() {
      return this.aUi >= 0;
   }
}
