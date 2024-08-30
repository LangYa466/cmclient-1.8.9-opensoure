import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BiConsumer;

public class bu extends br {
   private final float jd;
   private boolean iS;
   private final float je;
   public float iR;
   private final float jf;

   public void p(float var1) {
      bQ.q((float)this.aY(), (float)this.aX(), (float)(this.aY() + this.eo), (float)(this.aX() + this.eC), 2.0F, x.q(311 & 1074));
      bQ.q((float)this.aY(), (float)this.aX(), (float)this.aY() + this.iR * (float)(this.eo - (8988 & 20650)) + 1.1325301F * 3.531915F, (float)(this.aX() + this.eC), 2.0F, this.hZ ? x.q(5366 & 10647) : x.q(4196 & -28956));
      bQ.q((float)this.aY() + this.iR * (float)(this.eo - (5128 & 2122)), (float)this.aX(), (float)this.aY() + this.iR * (float)(this.eo - (5928 & 16521)) + 0.19354838F * 41.333336F, (float)(this.aX() + this.eC), 1.0697675F * 2.0565217F, x.q(-7937 & 3327));
      float var2 = bS.w(this.iR, this.jf, this.jd, this.je);
      var2 = this.s(var2);
      x.O.q(String.valueOf(var2), this.aY() + this.eo, this.aX() - (8457 & 18433), 184549375 & -1325400065);
   }

   public void o(float var1) {
      super.o(var1);
   }

   public boolean e(int var1, int var2, int var3) {
      if (this.aM && this.hZ) {
         this.iR = (float)(var1 - (this.aY() + (8333 & 20740))) / (float)(this.eo - (-32696 & 24607));
         return this.iS = (boolean)(3849 & 16449);
      } else {
         return (boolean)(98 & 264);
      }
   }

   public void t(int var1, int var2) {
      if (this.iS) {
         this.iR = (float)(var1 - (this.aY() + (526 & -27339))) / (float)(this.eo - (4696 & 397));
         this.iR = bS.q(bS.w(this.iR, this.jf, this.jd, this.je), this.jf, this.jd, this.je);
      }

   }

   protected float s(float var1) {
      return (new BigDecimal(String.valueOf(var1))).setScale(2114 & -24141, RoundingMode.HALF_UP).floatValue();
   }

   public void w(int var1, int var2, int var3) {
      if (this.iS) {
         this.iS = (boolean)(-32352 & 16450);
         this.iZ.accept(this.iY, this);
      }

   }

   public bu(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, bI var9, BiConsumer var10, aY var11) {
      super(var1, var2, var3, var4, var9, var10, var11);
      this.jf = var5;
      this.jd = var6;
      this.je = var7;
      this.iR = bS.q(var8, var5, var6, var7);
      this.ja = (boolean)(-12279 & 10295);
   }
}
