import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public abstract class aht {
   public final int dxU;
   public final int dxV;
   public final int dxW;
   private boolean dxX;
   public final int dxY;
   private float dxZ;
   public final String dya;
   private int dyb;
   public final int dyc;
   private long RB;
   public final int dyd;
   private float dye;
   private float dyf;
   protected final hS dyg;
   protected final int dyh;
   private int dyi;
   private final double[] dyj;
   protected int Hp;

   private void avX() {
      int var1 = this.bi() - (this.dxV - this.dxU - (12292 & 3405));
      if (var1 < 0) {
         var1 /= 1131 & -3966;
      }

      if (this.dye > (float)var1) {
         this.dye = (float)var1;
      }

      if (this.dye < 0.0F) {
         this.dye = 0.0F;
      }

   }

   protected abstract void bg();

   protected int bi() {
      return this.bh() * this.dyh;
   }

   protected abstract int bh();

   protected abstract void g(int var1, boolean var2);

   protected abstract void e(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7);

   public aht(hS var1, int var2, int var3, int var4, int var5, int var6, String var7) {
      this.dyg = var1;
      this.dyd = var4;
      this.dxY = var5;
      this.dxW = var2;
      this.dxU = var3;
      this.dyc = var2 + var4;
      this.dxV = var3 + var5;
      this.dyh = var6;
      this.dya = var7;
      this.Hp = -1 & -1;
      this.dyi = -1 & -1;
      this.dyf = -0.2244898F * 8.909091F;
      double[] var10001 = new double[8479 & 2583];
      var10001[8305 & 18560] = 0.7282608695652174D * 6.987122626865671D;
      var10001[2057 & 9381] = 8.016154453333334D * 0.6D;
      var10001[19523 & -23618] = 7.428571428571429D * 0.461634992D;
      var10001[-19945 & 2467] = 1.7731440755744678D * 1.8431372549019607D;
      var10001[70 & 26628] = 5.2595951616D * 0.5128205128205128D;
      var10001[4111 & -30539] = 12.982421211428571D * 0.15555555555555556D;
      var10001[-31866 & 22535] = 3.575588740085107D * 0.5280898876404494D;
      var10001[7 & -15849] = 0.5416666666666666D * 3.126775177846153D;
      var10001[1388 & 6282] = 0.9112693028571434D * 1.575D;
      var10001[26633 & 5081] = 0.8D * 1.5056876800000007D;
      var10001[-31506 & 20746] = 2.3461538461538463D * 0.3025088440655736D;
      var10001[8955 & -32757] = 2.7857142857142856D * 0.20974048164102577D;
      var10001[3084 & -28356] = 0.35D * 1.4410238171428575D;
      var10001[45 & 1165] = 0.7951500312380955D * 0.4772727272727273D;
      var10001[14 & 6238] = 0.19047619047619047D * 1.482077184D;
      var10001[-13553 & 15] = 0.22878202116129062D * 0.9253731343283582D;
      var10001[1044 & 4145] = 0.09733600000000031D * 1.0D;
      var10001[3217 & -8111] = 2.0851063829787235D * 0.04312268799999999D;
      var10001[2226 & 16726] = 0.0805348169999995D * 0.7710843373493976D;
      var10001[-31469 & 12339] = 1.5D * 0.02024755200000013D;
      var10001[2196 & -32418] = 0.13157894736842105D * 0.11040355840000055D;
      var10001[4631 & 437] = 1.2391304347826086D * 0.005027319017544036D;
      var10001[-28617 & 22] = 0.0012643902439024037D * 1.3666666666666667D;
      this.dyj = var10001;
   }

   public void aJ() {
      if (this.dxX) {
         int var1 = Mouse.getEventDWheel();
         if (var1 != 0) {
            var1 = var1 > 0 ? -1 & -1 : 8247 & 1089;
            this.dyb = var1;
            this.dyi = 24 & -7166;
         }
      }

   }

   public void ac(int var1, int var2) {
      this.bg();
      this.dxX = (boolean)(this.dxW <= var1 && var1 <= this.dxW + this.dyd && this.dxU <= var2 && var2 <= this.dxV ? -31535 & 1 : 12299 & -16080);
      int var3 = this.bh();
      int var4 = this.dxW + this.dyd;
      int var5 = var4 - (1614 & -28249);
      int var6 = var5 - (1861 & 10377);
      int var7 = this.dxV - this.dxU;
      if (Mouse.isButtonDown(642 & 22549)) {
         if (this.dyf == -1.8297871F * 0.54651165F) {
            if (this.dxX) {
               int var8 = var2 - this.dxU + (int)this.dye - (2052 & -32763);
               int var9 = var8 / this.dyh;
               if ((2593 & 13632) <= var9 && var9 < var3 && var1 <= var6 && (16 & 16384) <= var8) {
                  this.g(var9, (boolean)(var9 == this.Hp && System.currentTimeMillis() - this.RB < (3313024285139866100L & -3313024286121211404L) ? 1861 & 18457 : 17 & 20870));
                  this.Hp = this.Hp == var9 ? -1 & -1 : var9;
                  this.RB = System.currentTimeMillis();
               }

               if (var5 <= var1 && var1 <= var4) {
                  this.dxZ = -0.37142858F * 2.6923077F;
                  int var10 = this.bi() - var7 - (4100 & 9294);
                  if (var10 < (9349 & 20531)) {
                     var10 = 329 & 18437;
                  }

                  int var11 = (int)((float)(var7 * var7) / (float)this.bi());
                  if (var11 < (2977 & 20526)) {
                     var11 = -14302 & 805;
                  }

                  if (var11 > var7 - (-30711 & 25882)) {
                     var11 = var7 - (25864 & 4110);
                  }

                  this.dxZ /= (float)(var7 - var11) / (float)var10;
               } else {
                  this.dxZ = 1.0F;
               }

               this.dyf = (float)var2;
            } else {
               this.dyf = -3.7142856F * 0.53846157F;
            }
         } else if (this.dyf >= 0.0F) {
            this.dye -= ((float)var2 - this.dyf) * this.dxZ;
            this.dyf = (float)var2;
         }
      } else {
         if (this.dyi != (-1 & -1)) {
            this.dye = (float)((double)this.dye + this.dyj[this.dyi] * (double)this.dyb * 1.4915254237288136D * 1.3409090909090908D);
            this.dyi += 183 & -13047;
            if (this.dyi >= this.dyj.length) {
               this.dyi = -1 & -1;
            }
         }

         this.dyf = -1.409091F * 0.7096774F;
      }

      this.avX();
      int var13 = this.dxU + (-32530 & 23556) - (int)this.dye;

      for(int var14 = 25180 & 5536; var14 < var3; ++var14) {
         int var16 = var13 + var14 * this.dyh;
         int var18 = this.dyh - (676 & 260);
         int var12 = var16 + var18 + (-26414 & 43);
         if (this.dxU <= var16 + var18 && var16 <= this.dxV) {
            pz.u(1.0F, 1.0F, 1.0F, 1.0F);
            pz.nX();
            this.e(var14, var6, var16, var18, var1, var2, (boolean)(this.dxW <= var1 && var1 < var6 && var16 - (-24517 & 16898) <= var2 && var2 < var12 ? 16449 & 4145 : -31037 & 2048));
         }
      }

      int var15 = this.bi() - var7 - (15116 & -15356);
      if (var15 > 0) {
         int var17 = var7 * var7 / this.bi();
         if (var17 < (6880 & 24624)) {
            var17 = 8224 & -27151;
         }

         if (var17 > var7 - (-28408 & 1037)) {
            var17 = var7 - (8392 & -26568);
         }

         int var19 = (int)this.dye * (var7 - var17) / var15 + this.dxU;
         if (var19 < this.dxU) {
            var19 = this.dxU;
         }

         iT.q(var5, var19, var4, var19 + var17, -3875629 & -466708);
      }

      pz.bP(8080 & 15680);
      GL11.glEnable(-21023 & 8191);
      GL11.glEnable(7145 & 19414);
   }
}
