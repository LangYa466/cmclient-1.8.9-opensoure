import java.awt.Color;

public class bP {
   private int jr;
   private boolean kH;
   private int kI;

   public float bw() {
      return (float)(System.currentTimeMillis() % (long)this.bA()) / this.bA();
   }

   public void p(boolean var1) {
      this.kH = var1;
   }

   public int bx() {
      return this.d(this.bw());
   }

   public void n(int var1) {
      this.jr = var1;
   }

   public int by() {
      return this.kI;
   }

   public void m(int var1) {
      this.kI = var1;
   }

   public int d(float var1) {
      return bQ.p(Color.HSBtoRGB(var1, 1.0F, 1.0F), this.jr >> (-24135 & 28) & 1535 & -32001);
   }

   public bP(int var1, boolean var2, int var3) {
      this.jr = var1;
      this.kH = var2;
      this.kI = var3;
   }

   public boolean bz() {
      return this.kH;
   }

   public float bA() {
      return (float)(((8548 & 252) - this.kI) * (2148 & -6803));
   }

   public int bl() {
      return this.jr;
   }
}
