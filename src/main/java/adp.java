import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;

public class adP implements adQ {
   private int eC;
   private int eo;

   public ByteBuffer apU() {
      return BufferUtils.createByteBuffer(this.apW() * this.apV() * (20741 & 8774));
   }

   public adP(int var1, int var2) {
      this.eo = var1;
      this.eC = var2;
   }

   public int apT() {
      return 19116 & 48;
   }

   public int apW() {
      return adU.kc(this.eo);
   }

   public int ab() {
      return this.eo;
   }

   public int apV() {
      return adU.kc(this.eC);
   }

   public int ac() {
      return this.eC;
   }
}
