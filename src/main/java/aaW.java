import org.lwjgl.opengl.ARBShaderObjects;

public class aaw extends aaB {
   private static final float cTc = -3.4028235E38F;
   private float[][] cTd;

   public void B(float var1, float var2) {
      int var3 = this.vq();
      float[] var4 = this.cTd[var3];
      if (var4[0] != var1 || var4[1] != var2) {
         var4[0] = var1;
         var4[1] = var2;
         int var5 = this.amn();
         if (var5 >= 0) {
            ARBShaderObjects.glUniform2fARB(var5, var1, var2);
            this.amj();
         }
      }

   }

   public aaw(String var1) {
      super(var1);
      this.akQ();
   }

   protected void akQ() {
      this.cTd = new float[][]{{-3.4028235E38F, -3.4028235E38F}};
   }

   public float[] amh() {
      int var1 = this.vq();
      float[] var2 = this.cTd[var1];
      return var2;
   }

   protected void jy(int var1) {
      if (var1 >= this.cTd.length) {
         float[][] var2 = this.cTd;
         float[][] var3 = new float[var1 + 10][];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         this.cTd = var3;
      }

      if (this.cTd[var1] == null) {
         this.cTd[var1] = new float[]{-3.4028235E38F, -3.4028235E38F};
      }

   }
}
