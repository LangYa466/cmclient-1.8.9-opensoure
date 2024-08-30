import org.lwjgl.opengl.ARBShaderObjects;

public class aax extends aaB {
   private static final int cTe = Integer.MIN_VALUE;
   private int[][] cTf;

   public void bO(int var1, int var2) {
      int var3 = this.vq();
      int[] var4 = this.cTf[var3];
      if (var4[0] != var1 || var4[1] != var2) {
         var4[0] = var1;
         var4[1] = var2;
         int var5 = this.amn();
         if (var5 >= 0) {
            ARBShaderObjects.glUniform2iARB(var5, var1, var2);
            this.amj();
         }
      }

   }

   public aax(String var1) {
      super(var1);
      this.akQ();
   }

   protected void jy(int var1) {
      if (var1 >= this.cTf.length) {
         int[][] var2 = this.cTf;
         int[][] var3 = new int[var1 + 10][];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         this.cTf = var3;
      }

      if (this.cTf[var1] == null) {
         this.cTf[var1] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
      }

   }

   public int[] ami() {
      int var1 = this.vq();
      int[] var2 = this.cTf[var1];
      return var2;
   }

   protected void akQ() {
      this.cTf = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE}};
   }
}
