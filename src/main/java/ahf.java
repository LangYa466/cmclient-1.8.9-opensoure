import java.nio.FloatBuffer;

public final class ahF {
   private float dcF;
   private float dcH;
   private float dcD;
   private float dcy;
   private float dcC;
   private float dcE;
   private float dcI;
   private float dcA;
   private float dcM;

   public float awa() {
      float var1 = this.dcy * this.dcH - this.dcE * this.dcA;
      float var2 = -(this.dcF * this.dcH - this.dcE * this.dcM);
      float var3 = this.dcF * this.dcA - this.dcy * this.dcM;
      float var4 = -(this.dcD * this.dcH - this.dcI * this.dcA);
      float var5 = this.dcC * this.dcH - this.dcI * this.dcM;
      float var6 = -(this.dcC * this.dcA - this.dcD * this.dcM);
      float var7 = this.dcD * this.dcE - this.dcI * this.dcy;
      float var8 = -(this.dcC * this.dcE - this.dcI * this.dcF);
      float var9 = this.dcC * this.dcy - this.dcD * this.dcF;
      float var10 = this.dcC * var1 + this.dcD * var2 + this.dcI * var3;
      this.dcC = var1;
      this.dcF = var2;
      this.dcM = var3;
      this.dcD = var4;
      this.dcy = var5;
      this.dcA = var6;
      this.dcI = var7;
      this.dcE = var8;
      this.dcH = var9;
      return var10;
   }

   public void q(ahF var1) {
      float var2 = this.dcC * var1.dcC + this.dcD * var1.dcF + this.dcI * var1.dcM;
      float var3 = this.dcC * var1.dcD + this.dcD * var1.dcy + this.dcI * var1.dcA;
      float var4 = this.dcC * var1.dcI + this.dcD * var1.dcE + this.dcI * var1.dcH;
      float var5 = this.dcF * var1.dcC + this.dcy * var1.dcF + this.dcE * var1.dcM;
      float var6 = this.dcF * var1.dcD + this.dcy * var1.dcy + this.dcE * var1.dcA;
      float var7 = this.dcF * var1.dcI + this.dcy * var1.dcE + this.dcE * var1.dcH;
      float var8 = this.dcM * var1.dcC + this.dcA * var1.dcF + this.dcH * var1.dcM;
      float var9 = this.dcM * var1.dcD + this.dcA * var1.dcy + this.dcH * var1.dcA;
      float var10 = this.dcM * var1.dcI + this.dcA * var1.dcE + this.dcH * var1.dcH;
      this.dcC = var2;
      this.dcD = var3;
      this.dcI = var4;
      this.dcF = var5;
      this.dcy = var6;
      this.dcE = var7;
      this.dcM = var8;
      this.dcA = var9;
      this.dcH = var10;
   }

   public void e(FloatBuffer var1) {
      this.dcC = var1.get(cn(-16108 & 9226, 288 & 532));
      this.dcD = var1.get(cn(29185 & 2459, 20 & 13411));
      this.dcI = var1.get(cn(1034 & 20994, 10753 & -16332));
      this.dcF = var1.get(cn(18471 & 8400, 5953 & 11));
      this.dcy = var1.get(cn(1233 & 779, 16515 & 9249));
      this.dcE = var1.get(cn(23299 & 66, 281 & 3075));
      this.dcM = var1.get(cn(22610 & 1800, -16245 & 550));
      this.dcA = var1.get(cn(325 & 1553, 1546 & 26662));
      this.dcH = var1.get(cn(6214 & -32501, -27694 & 2050));
   }

   public void p(int var1, int var2, float var3) {
      if (var1 == 0) {
         if (var2 == 0) {
            this.dcC = var3;
         } else if (var2 == (-24575 & 17679)) {
            this.dcD = var3;
         } else {
            this.dcI = var3;
         }
      } else if (var1 == (1025 & 16713)) {
         if (var2 == 0) {
            this.dcF = var3;
         } else if (var2 == (3 & 5513)) {
            this.dcy = var3;
         } else {
            this.dcE = var3;
         }
      } else if (var2 == 0) {
         this.dcM = var3;
      } else if (var2 == (2113 & -28407)) {
         this.dcA = var3;
      } else {
         this.dcH = var3;
      }

   }

   public ahF() {
   }

   public ahF(ahK var1) {
      float var2 = var1.awn();
      float var3 = var1.awo();
      float var4 = var1.awq();
      float var5 = var1.awp();
      float var6 = 2.0F * var2 * var2;
      float var7 = 2.0F * var3 * var3;
      float var8 = 2.0F * var4 * var4;
      this.dcC = 1.0F - var7 - var8;
      this.dcy = 1.0F - var8 - var6;
      this.dcH = 1.0F - var6 - var7;
      float var9 = var2 * var3;
      float var10 = var3 * var4;
      float var11 = var4 * var2;
      float var12 = var2 * var5;
      float var13 = var3 * var5;
      float var14 = var4 * var5;
      this.dcF = 2.0F * (var9 + var14);
      this.dcD = 2.0F * (var9 - var14);
      this.dcM = 2.0F * (var11 - var13);
      this.dcI = 2.0F * (var11 + var13);
      this.dcA = 2.0F * (var10 + var12);
      this.dcE = 2.0F * (var10 - var12);
   }

   public void awb() {
      this.dcC = 1.0F;
      this.dcD = 0.0F;
      this.dcI = 0.0F;
      this.dcF = 0.0F;
      this.dcy = 1.0F;
      this.dcE = 0.0F;
      this.dcM = 0.0F;
      this.dcA = 0.0F;
      this.dcH = 1.0F;
   }

   public void w(ahF var1) {
      this.dcC = var1.dcC;
      this.dcD = var1.dcD;
      this.dcI = var1.dcI;
      this.dcF = var1.dcF;
      this.dcy = var1.dcy;
      this.dcE = var1.dcE;
      this.dcM = var1.dcM;
      this.dcA = var1.dcA;
      this.dcH = var1.dcH;
   }

   public void e(ahF var1) {
      this.dcC += var1.dcC;
      this.dcD += var1.dcD;
      this.dcI += var1.dcI;
      this.dcF += var1.dcF;
      this.dcy += var1.dcy;
      this.dcE += var1.dcE;
      this.dcM += var1.dcM;
      this.dcA += var1.dcA;
      this.dcH += var1.dcH;
   }

   public void cD(float var1) {
      this.dcC *= var1;
      this.dcD *= var1;
      this.dcI *= var1;
      this.dcF *= var1;
      this.dcy *= var1;
      this.dcE *= var1;
      this.dcM *= var1;
      this.dcA *= var1;
      this.dcH *= var1;
   }

   public boolean awc() {
      float var1 = this.awa();
      if (Math.abs(var1) > 0.5555556F * 1.8E-6F) {
         this.cD(var1);
         return (boolean)(7809 & 8315);
      } else {
         return (boolean)(1044 & 16992);
      }
   }

   public ahF awd() {
      return new ahF(this);
   }

   public void q(ahK var1) {
      this.q(new ahF(var1));
   }

   public void r(ahF var1) {
      this.dcC -= var1.dcC;
      this.dcD -= var1.dcD;
      this.dcI -= var1.dcI;
      this.dcF -= var1.dcF;
      this.dcy -= var1.dcy;
      this.dcE -= var1.dcE;
      this.dcM -= var1.dcM;
      this.dcA -= var1.dcA;
      this.dcH -= var1.dcH;
   }

   private static int cn(int var0, int var1) {
      return var1 * (4099 & 2071) + var0;
   }

   public ahF(ahF var1) {
      this.dcC = var1.dcC;
      this.dcD = var1.dcD;
      this.dcI = var1.dcI;
      this.dcF = var1.dcF;
      this.dcy = var1.dcy;
      this.dcE = var1.dcE;
      this.dcM = var1.dcM;
      this.dcA = var1.dcA;
      this.dcH = var1.dcH;
   }

   public static ahF Q(float var0, float var1, float var2) {
      ahF var3 = new ahF();
      var3.dcC = var0;
      var3.dcy = var1;
      var3.dcH = var2;
      return var3;
   }

   public void r(FloatBuffer var1) {
      this.dcC = var1.get(cn(265 & 8320, 17410 & 6448));
      this.dcD = var1.get(cn(17442 & -32564, 7193 & 24609));
      this.dcI = var1.get(cn(1080 & 1, 275 & 2690));
      this.dcF = var1.get(cn(401 & -26111, 24588 & 32));
      this.dcy = var1.get(cn(-32047 & 20491, 20481 & 77));
      this.dcE = var1.get(cn(6593 & 1059, 24598 & 3746));
      this.dcM = var1.get(cn(17575 & -30382, 8457 & 16898));
      this.dcA = var1.get(cn(1987 & -14286, 137 & 6659));
      this.dcH = var1.get(cn(9826 & -28670, 2826 & -32750));
   }

   public void q(FloatBuffer var1, boolean var2) {
      if (var2) {
         this.e(var1);
      } else {
         this.r(var1);
      }

   }
}
