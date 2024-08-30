import java.awt.image.BufferedImage;

public class tD extends tC {
   private final int aum;
   private final int[] aun;
   private final int auo;

   public int[] rK() {
      return this.aun;
   }

   public tD(int var1, int var2) {
      this.aum = var1;
      this.auo = var2;
      this.aun = new int[var1 * var2];
      tY.b(this.pv(), var1, var2);
   }

   public void rL() {
      tY.q(this.pv(), this.aun, this.aum, this.auo);
   }

   public tD(BufferedImage var1) {
      this(var1.getWidth(), var1.getHeight());
      var1.getRGB(0, 0, var1.getWidth(), var1.getHeight(), this.aun, 0, var1.getWidth());
      this.rL();
   }

   public void w(uL var1) {
   }
}
