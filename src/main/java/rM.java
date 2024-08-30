import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RM extends RL {
   private float cbz;
   private Rl ccH;

   public Rl[] q(Rl[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return this.q(var1, var2, var3, var4, var5);
   }

   public boolean q(int var1, int var2, int var3, List var4) {
      return var4.contains(this.ccH);
   }

   public float[] q(float[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.cbz);
      return var1;
   }

   public Rl[] w(Rl[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new Rl[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.ccH);
      return var1;
   }

   public RM(Rl var1, float var2) {
      this.ccH = var1;
      this.cbz = var2;
   }

   public NW q(int var1, int var2, int var3, List var4, Random var5) {
      return var4.contains(this.ccH) ? new NW(var1 - var3 + var5.nextInt(var3 * 2 + 1), 0, var2 - var3 + var5.nextInt(var3 * 2 + 1)) : null;
   }

   public Rl aO(NW var1) {
      return this.ccH;
   }

   public Rl[] q(Rl[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new Rl[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.ccH);
      return var1;
   }
}
