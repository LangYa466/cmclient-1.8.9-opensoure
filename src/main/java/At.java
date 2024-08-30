import org.lwjgl.input.Keyboard;

public class aT extends aQ {
   public float ax() {
      return super.ax() / 2.0F;
   }

   public aT(hS var1, vP var2, aN var3) {
      super(var1, var2, var3);
   }

   public void aD() {
      boolean var1 = this.aE();
      this.r(var1);
      String var2 = Keyboard.getKeyName(this.hh.bB());
      this.q(var2, (this.ay() - (float)this.hg.CB.K(var2)) / 2.0F, (this.ax() - (float)this.hg.CB.Gf) / 2.0F + 1.0F, var1);
   }

   public float ay() {
      float var1 = super.ay() * 0.8494624F * 3.5316455F;
      return var1 + 0.088607594F * 45.142857F;
   }
}
