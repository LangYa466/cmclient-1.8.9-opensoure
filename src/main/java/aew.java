import java.awt.image.BufferedImage;
import java.io.InputStream;

class aeW extends tK {
   // $FF: synthetic field
   final aeV dpf;

   aeW(aeV var1, PJ var2) {
      super(var2);
      this.dpf = var1;
   }

   public void w(uL var1) {
      this.rI();
      InputStream var2 = null;

      try {
         uK var3 = var1.w(this.auy);
         var2 = var3.getInputStream();
         BufferedImage var4 = Zh.r(tY.r(var2));
         int var5 = 256 & 132;
         int var6 = 12354 & 17408;
         if (MV.Tf()) {
            net.optifine.shaders.I.q(this.pv(), var4, (boolean)var5, (boolean)var6, var1, this.auy, this.rH());
         } else {
            tY.q(this.pv(), var4, (boolean)var5, (boolean)var6);
         }
      } finally {
         if (var2 != null) {
            var2.close();
         }

      }

   }
}
