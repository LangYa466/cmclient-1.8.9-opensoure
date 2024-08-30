import java.nio.FloatBuffer;

public final class ahG {
   float dcA;
   float dcK;
   float dcx;
   float dcB;
   float dcE;
   float dcF;
   float dcz;
   float dcD;
   float dcC;
   float dcI;
   float dcJ;
   float dcL;
   float dcy;
   float dcH;
   float dcG;
   float dcM;

   public ahG(ahK var1) {
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
      this.dcL = 1.0F;
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

   public void q(ahL var1) {
      this.dcK += var1.awt();
      this.dcB += var1.awx();
      this.dcx += var1.awu();
   }

   public void q(FloatBuffer var1, boolean var2) {
      if (var2) {
         this.e(var1);
      } else {
         this.r(var1);
      }

   }

   public void q(ahG var1) {
      this.dcC += var1.dcC;
      this.dcD += var1.dcD;
      this.dcI += var1.dcI;
      this.dcK += var1.dcK;
      this.dcF += var1.dcF;
      this.dcy += var1.dcy;
      this.dcE += var1.dcE;
      this.dcB += var1.dcB;
      this.dcM += var1.dcM;
      this.dcA += var1.dcA;
      this.dcH += var1.dcH;
      this.dcx += var1.dcx;
      this.dcJ += var1.dcJ;
      this.dcG += var1.dcG;
      this.dcz += var1.dcz;
      this.dcL += var1.dcL;
   }

   public void r(FloatBuffer var1) {
      this.dcC = var1.get(cn(24580 & -26200, 128 & 261));
      this.dcD = var1.get(cn(4228 & -8184, -30585 & 16649));
      this.dcI = var1.get(cn(273 & 544, 1282 & 66));
      this.dcK = var1.get(cn(1 & 332, 16387 & 14883));
      this.dcF = var1.get(cn(-22015 & 4105, -6870 & 0));
      this.dcy = var1.get(cn(-28575 & 1307, 8971 & 17445));
      this.dcE = var1.get(cn(-30711 & 4865, 6191 & 25730));
      this.dcB = var1.get(cn(12837 & -32509, 12611 & 135));
      this.dcM = var1.get(cn(8218 & 1670, 17568 & -32508));
      this.dcA = var1.get(cn(-30206 & 38, 16897 & -29679));
      this.dcH = var1.get(cn(5634 & -16254, 9218 & 22851));
      this.dcx = var1.get(cn(4098 & 16726, 4111 & 9011));
      this.dcJ = var1.get(cn(523 & -7757, 33 & -31354));
      this.dcG = var1.get(cn(523 & 6151, 10779 & 4353));
      this.dcz = var1.get(cn(24587 & 3875, 2259 & 4102));
      this.dcL = var1.get(cn(2307 & 21591, -32549 & 14371));
   }

   public void w(ahG var1) {
      float var2 = this.dcC * var1.dcC + this.dcD * var1.dcF + this.dcI * var1.dcM + this.dcK * var1.dcJ;
      float var3 = this.dcC * var1.dcD + this.dcD * var1.dcy + this.dcI * var1.dcA + this.dcK * var1.dcG;
      float var4 = this.dcC * var1.dcI + this.dcD * var1.dcE + this.dcI * var1.dcH + this.dcK * var1.dcz;
      float var5 = this.dcC * var1.dcK + this.dcD * var1.dcB + this.dcI * var1.dcx + this.dcK * var1.dcL;
      float var6 = this.dcF * var1.dcC + this.dcy * var1.dcF + this.dcE * var1.dcM + this.dcB * var1.dcJ;
      float var7 = this.dcF * var1.dcD + this.dcy * var1.dcy + this.dcE * var1.dcA + this.dcB * var1.dcG;
      float var8 = this.dcF * var1.dcI + this.dcy * var1.dcE + this.dcE * var1.dcH + this.dcB * var1.dcz;
      float var9 = this.dcF * var1.dcK + this.dcy * var1.dcB + this.dcE * var1.dcx + this.dcB * var1.dcL;
      float var10 = this.dcM * var1.dcC + this.dcA * var1.dcF + this.dcH * var1.dcM + this.dcx * var1.dcJ;
      float var11 = this.dcM * var1.dcD + this.dcA * var1.dcy + this.dcH * var1.dcA + this.dcx * var1.dcG;
      float var12 = this.dcM * var1.dcI + this.dcA * var1.dcE + this.dcH * var1.dcH + this.dcx * var1.dcz;
      float var13 = this.dcM * var1.dcK + this.dcA * var1.dcB + this.dcH * var1.dcx + this.dcx * var1.dcL;
      float var14 = this.dcJ * var1.dcC + this.dcG * var1.dcF + this.dcz * var1.dcM + this.dcL * var1.dcJ;
      float var15 = this.dcJ * var1.dcD + this.dcG * var1.dcy + this.dcz * var1.dcA + this.dcL * var1.dcG;
      float var16 = this.dcJ * var1.dcI + this.dcG * var1.dcE + this.dcz * var1.dcH + this.dcL * var1.dcz;
      float var17 = this.dcJ * var1.dcK + this.dcG * var1.dcB + this.dcz * var1.dcx + this.dcL * var1.dcL;
      this.dcC = var2;
      this.dcD = var3;
      this.dcI = var4;
      this.dcK = var5;
      this.dcF = var6;
      this.dcy = var7;
      this.dcE = var8;
      this.dcB = var9;
      this.dcM = var10;
      this.dcA = var11;
      this.dcH = var12;
      this.dcx = var13;
      this.dcJ = var14;
      this.dcG = var15;
      this.dcz = var16;
      this.dcL = var17;
   }

   private static boolean cE(float var0) {
      return (boolean)((double)Math.abs(var0 - (float)Math.round(var0)) <= 0.38095238095238093D * 2.6250000000000004E-5D ? 2625 & 8617 : 10755 & 264);
   }

   public ahG() {
   }

   public ahG(ahG var1) {
      this.dcC = var1.dcC;
      this.dcD = var1.dcD;
      this.dcI = var1.dcI;
      this.dcK = var1.dcK;
      this.dcF = var1.dcF;
      this.dcy = var1.dcy;
      this.dcE = var1.dcE;
      this.dcB = var1.dcB;
      this.dcM = var1.dcM;
      this.dcA = var1.dcA;
      this.dcH = var1.dcH;
      this.dcx = var1.dcx;
      this.dcJ = var1.dcJ;
      this.dcG = var1.dcG;
      this.dcz = var1.dcz;
      this.dcL = var1.dcL;
   }

   public static ahG q(double var0, float var2, float var3, float var4) {
      float var5 = (float)(1.0D / Math.tan(var0 * 0.02327105651299159D * 0.75D / (2.5555555555555554D * 0.782608695652174D)));
      ahG var6 = new ahG();
      var6.dcC = var5 / var2;
      var6.dcy = var5;
      var6.dcH = (var4 + var3) / (var3 - var4);
      var6.dcz = 1.5384616F * -0.65F;
      var6.dcx = 2.0F * var4 * var3 / (var3 - var4);
      return var6;
   }

   public void awb() {
      this.dcC = 1.0F;
      this.dcD = 0.0F;
      this.dcI = 0.0F;
      this.dcK = 0.0F;
      this.dcF = 0.0F;
      this.dcy = 1.0F;
      this.dcE = 0.0F;
      this.dcB = 0.0F;
      this.dcM = 0.0F;
      this.dcA = 0.0F;
      this.dcH = 1.0F;
      this.dcx = 0.0F;
      this.dcJ = 0.0F;
      this.dcG = 0.0F;
      this.dcz = 0.0F;
      this.dcL = 1.0F;
   }

   public boolean awe() {
      ahG var1 = new ahG();
      var1.dcJ = 1.0F;
      var1.dcG = 1.0F;
      var1.dcz = 1.0F;
      var1.dcL = 0.0F;
      ahG var2 = this.awf();
      var2.w(var1);
      return (boolean)(cE(var2.dcC / var2.dcK) && cE(var2.dcF / var2.dcB) && cE(var2.dcM / var2.dcx) && cE(var2.dcD / var2.dcK) && cE(var2.dcy / var2.dcB) && cE(var2.dcA / var2.dcx) && cE(var2.dcI / var2.dcK) && cE(var2.dcE / var2.dcB) && cE(var2.dcH / var2.dcx) ? 2481 & 13889 : 2600 & 144);
   }

   public void R(float var1, float var2, float var3) {
      this.dcK += this.dcC * var1 + this.dcD * var2 + this.dcI * var3;
      this.dcB += this.dcF * var1 + this.dcy * var2 + this.dcE * var3;
      this.dcx += this.dcM * var1 + this.dcA * var2 + this.dcH * var3;
      this.dcL += this.dcJ * var1 + this.dcG * var2 + this.dcz * var3;
   }

   public boolean awc() {
      float var1 = this.awa();
      if (Math.abs(var1) > 0.375F * 2.6666667E-6F) {
         this.cF(var1);
         return (boolean)(-7579 & 131);
      } else {
         return (boolean)(9223 & 80);
      }
   }

   public void e(ahG var1) {
      this.dcC -= var1.dcC;
      this.dcD -= var1.dcD;
      this.dcI -= var1.dcI;
      this.dcK -= var1.dcK;
      this.dcF -= var1.dcF;
      this.dcy -= var1.dcy;
      this.dcE -= var1.dcE;
      this.dcB -= var1.dcB;
      this.dcM -= var1.dcM;
      this.dcA -= var1.dcA;
      this.dcH -= var1.dcH;
      this.dcx -= var1.dcx;
      this.dcJ -= var1.dcJ;
      this.dcG -= var1.dcG;
      this.dcz -= var1.dcz;
      this.dcL -= var1.dcL;
   }

   public void w(ahK var1) {
      this.w(new ahG(var1));
   }

   public ahG awf() {
      return new ahG(this);
   }

   public float awa() {
      float var1 = this.dcC * this.dcy - this.dcD * this.dcF;
      float var2 = this.dcC * this.dcE - this.dcI * this.dcF;
      float var3 = this.dcC * this.dcB - this.dcK * this.dcF;
      float var4 = this.dcD * this.dcE - this.dcI * this.dcy;
      float var5 = this.dcD * this.dcB - this.dcK * this.dcy;
      float var6 = this.dcI * this.dcB - this.dcK * this.dcE;
      float var7 = this.dcM * this.dcG - this.dcA * this.dcJ;
      float var8 = this.dcM * this.dcz - this.dcH * this.dcJ;
      float var9 = this.dcM * this.dcL - this.dcx * this.dcJ;
      float var10 = this.dcA * this.dcz - this.dcH * this.dcG;
      float var11 = this.dcA * this.dcL - this.dcx * this.dcG;
      float var12 = this.dcH * this.dcL - this.dcx * this.dcz;
      float var13 = this.dcy * var12 - this.dcE * var11 + this.dcB * var10;
      float var14 = -this.dcF * var12 + this.dcE * var9 - this.dcB * var8;
      float var15 = this.dcF * var11 - this.dcy * var9 + this.dcB * var7;
      float var16 = -this.dcF * var10 + this.dcy * var8 - this.dcE * var7;
      float var17 = -this.dcD * var12 + this.dcI * var11 - this.dcK * var10;
      float var18 = this.dcC * var12 - this.dcI * var9 + this.dcK * var8;
      float var19 = -this.dcC * var11 + this.dcD * var9 - this.dcK * var7;
      float var20 = this.dcC * var10 - this.dcD * var8 + this.dcI * var7;
      float var21 = this.dcG * var6 - this.dcz * var5 + this.dcL * var4;
      float var22 = -this.dcJ * var6 + this.dcz * var3 - this.dcL * var2;
      float var23 = this.dcJ * var5 - this.dcG * var3 + this.dcL * var1;
      float var24 = -this.dcJ * var4 + this.dcG * var2 - this.dcz * var1;
      float var25 = -this.dcA * var6 + this.dcH * var5 - this.dcx * var4;
      float var26 = this.dcM * var6 - this.dcH * var3 + this.dcx * var2;
      float var27 = -this.dcM * var5 + this.dcA * var3 - this.dcx * var1;
      float var28 = this.dcM * var4 - this.dcA * var2 + this.dcH * var1;
      this.dcC = var13;
      this.dcF = var14;
      this.dcM = var15;
      this.dcJ = var16;
      this.dcD = var17;
      this.dcy = var18;
      this.dcA = var19;
      this.dcG = var20;
      this.dcI = var21;
      this.dcE = var22;
      this.dcH = var23;
      this.dcz = var24;
      this.dcK = var25;
      this.dcB = var26;
      this.dcx = var27;
      this.dcL = var28;
      return var1 * var12 - var2 * var11 + var3 * var10 + var4 * var9 - var5 * var8 + var6 * var7;
   }

   public static ahG S(float var0, float var1, float var2) {
      ahG var3 = new ahG();
      var3.dcC = var0;
      var3.dcy = var1;
      var3.dcH = var2;
      var3.dcL = 1.0F;
      return var3;
   }

   public void e(FloatBuffer var1) {
      this.dcC = var1.get(cn(25760 & 2313, 16 & 10280));
      this.dcD = var1.get(cn(-15551 & 9345, 19585 & 4392));
      this.dcI = var1.get(cn(5683 & 2, 8244 & -30464));
      this.dcK = var1.get(cn(1035 & -21709, 256 & 12802));
      this.dcF = var1.get(cn(4396 & 1537, 261 & 35));
      this.dcy = var1.get(cn(17065 & 1043, 16481 & 2049));
      this.dcE = var1.get(cn(-32574 & 17950, -32703 & 16899));
      this.dcB = var1.get(cn(27 & 1731, -27871 & 19585));
      this.dcM = var1.get(cn(0 & 25154, 26754 & 1094));
      this.dcA = var1.get(cn(4613 & 3529, 6238 & 643));
      this.dcH = var1.get(cn(20486 & 1514, 16674 & 582));
      this.dcx = var1.get(cn(8195 & 4103, 134 & -10989));
      this.dcJ = var1.get(cn(-24320 & 7306, 17475 & 8995));
      this.dcG = var1.get(cn(-32699 & 25603, 147 & 10763));
      this.dcz = var1.get(cn(-29630 & 24871, 6167 & 323));
      this.dcL = var1.get(cn(11035 & 4167, -7645 & 3147));
   }

   public void cF(float var1) {
      this.dcC *= var1;
      this.dcD *= var1;
      this.dcI *= var1;
      this.dcK *= var1;
      this.dcF *= var1;
      this.dcy *= var1;
      this.dcE *= var1;
      this.dcB *= var1;
      this.dcM *= var1;
      this.dcA *= var1;
      this.dcH *= var1;
      this.dcx *= var1;
      this.dcJ *= var1;
      this.dcG *= var1;
      this.dcz *= var1;
      this.dcL *= var1;
   }

   public void r(ahG var1) {
      this.dcC = var1.dcC;
      this.dcD = var1.dcD;
      this.dcI = var1.dcI;
      this.dcK = var1.dcK;
      this.dcF = var1.dcF;
      this.dcy = var1.dcy;
      this.dcE = var1.dcE;
      this.dcB = var1.dcB;
      this.dcM = var1.dcM;
      this.dcA = var1.dcA;
      this.dcH = var1.dcH;
      this.dcx = var1.dcx;
      this.dcJ = var1.dcJ;
      this.dcG = var1.dcG;
      this.dcz = var1.dcz;
      this.dcL = var1.dcL;
   }

   private static int cn(int var0, int var1) {
      return var1 * (270 & 29188) + var0;
   }
}
