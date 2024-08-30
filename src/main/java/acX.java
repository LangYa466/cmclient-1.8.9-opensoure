import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;

public class acx implements adQ {
   private final byte[] dev;
   private final int dew;
   private final int dex;
   private final int dey;
   private final int dez;

   public int ac() {
      return this.dey;
   }

   public int apT() {
      return -14031 & 12524;
   }

   public ByteBuffer apU() {
      ByteBuffer var1 = BufferUtils.createByteBuffer(this.dev.length);
      var1.put(this.dev);
      var1.flip();
      return var1;
   }

   public acx(int var1, int var2) {
      this.dex = var1;
      this.dey = var2;
      this.dew = this.kc(var1);
      this.dez = this.kc(var2);
      this.dev = new byte[this.dew * this.dez * (21820 & -24571)];
   }

   public int apV() {
      return this.dez;
   }

   public int apW() {
      return this.dew;
   }

   public int ab() {
      return this.dex;
   }

   private int kc(int var1) {
      int var2;
      for(var2 = 8198 & 667; var2 < var1; var2 *= 24798 & 2306) {
         ;
      }

      return var2;
   }

   public acw apX() {
      return new acw(this);
   }
}
