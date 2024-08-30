public class Ao extends zW {
   zz aUa;
   float aUb;
   zx aUc;

   public void Az() {
      double var1 = this.aUa.aNZ - this.aUc.aNZ;
      double var3 = this.aUa.aOt - this.aUc.aOt;
      float var5 = Pq.B(var1 * var1 + var3 * var3);
      this.aUc.aOd += var1 / (double)var5 * 0.5D * 0.800000011920929D + this.aUc.aOd * 0.20000000298023224D;
      this.aUc.aOL += var3 / (double)var5 * 0.5D * 0.800000011920929D + this.aUc.aOL * 0.20000000298023224D;
      this.aUc.aOO = (double)this.aUb;
   }

   public boolean Ay() {
      return !this.aUc.aNG;
   }

   public Ao(zx var1, float var2) {
      this.aUc = var1;
      this.aUb = var2;
      this.dX(5);
   }

   public boolean Av() {
      this.aUa = this.aUc.zc();
      if (this.aUa == null) {
         return false;
      } else {
         double var1 = this.aUc.B(this.aUa);
         return var1 >= 4.0D && var1 <= 16.0D ? (!this.aUc.aNG ? false : this.aUc.zY().nextInt(5) == 0) : false;
      }
   }
}
