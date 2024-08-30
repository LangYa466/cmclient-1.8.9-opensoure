import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public class ut {
   private int axZ;
   private Zz aya;
   private final uu ayb;
   private int ayc;
   private int alI;
   private ZA ayd;

   public void sN() {
      if (this.ayc >= 0) {
         qa.ck(this.ayc);
         this.ayc = -1;
      }

   }

   public ut(uu var1) {
      this.ayb = var1;
      this.ayc = qa.oz();
   }

   public ZA sO() {
      return this.ayd;
   }

   public void sP() {
      if (this.ayc != -1) {
         qa.T(qa.aii, this.ayc);
      }
   }

   public int pC() {
      return this.alI;
   }

   public void q(ByteBuffer var1) {
      if (this.ayd != null) {
         this.ayd.q(var1, this.aya);
      } else {
         this.sP();
         qa.q(qa.aii, var1, 35044);
         this.sQ();
         this.axZ = var1.limit() / this.ayb.sT();
      }

   }

   public void q(ZA var1) {
      if (var1 != null) {
         this.sN();
         this.ayd = var1;
         this.aya = new Zz();
      }

   }

   public void cX(int var1) {
      this.alI = var1;
   }

   public void cY(int var1) {
      if (this.alI > 0) {
         var1 = this.alI;
      }

      if (this.ayd != null) {
         this.ayd.q(var1, this.aya);
      } else {
         GL11.glDrawArrays(var1, 0, this.axZ);
      }

   }

   public void sQ() {
      qa.T(qa.aii, 0);
   }

   public Zz sR() {
      return this.aya;
   }
}
