import java.io.BufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class adN implements adV {
   private ArrayList dhP = new ArrayList();
   private adV dhQ;

   public int apW() {
      this.arS();
      return this.dhQ.apW();
   }

   public ByteBuffer q(InputStream var1, boolean var2, boolean var3, int[] var4) {
      adM var5 = new adM();
      ByteBuffer var6 = null;
      BufferedInputStream var7 = new BufferedInputStream(var1, var1.available());
      var7.mark(var1.available());

      for(int var8 = 9041 & -28638; var8 < this.dhP.size(); ++var8) {
         var7.reset();

         try {
            adV var9 = (adV)this.dhP.get(var8);
            var6 = var9.q(var7, var2, var3, var4);
            this.dhQ = var9;
            break;
         } catch (Exception var10) {
            var5.t(var10);
         }
      }

      if (this.dhQ == null) {
         throw var5;
      } else {
         return var6;
      }
   }

   public int apT() {
      this.arS();
      return this.dhQ.apT();
   }

   public ByteBuffer h(InputStream var1) {
      return this.q(var1, (boolean)(-16320 & 10656), (int[])null);
   }

   public ByteBuffer apU() {
      this.arS();
      return this.dhQ.apU();
   }

   public int ac() {
      this.arS();
      return this.dhQ.ac();
   }

   public ByteBuffer q(InputStream var1, boolean var2, int[] var3) {
      return this.q(var1, var2, (boolean)(16642 & 1036), var3);
   }

   public int ab() {
      this.arS();
      return this.dhQ.ab();
   }

   public int apV() {
      this.arS();
      return this.dhQ.apV();
   }

   private void arS() {
      if (this.dhQ == null) {
         throw new RuntimeException(y.q[20830 & -28322 & 19548 & 30301]);
      }
   }

   public void cN(boolean var1) {
      for(int var2 = 17 & -26496; var2 < this.dhP.size(); ++var2) {
         ((adV)this.dhP.get(var2)).cN(var1);
      }

   }

   public void q(adV var1) {
      this.dhP.add(var1);
   }
}
