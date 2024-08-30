import org.lwjgl.opengl.GL11;

public class Z extends aX {
   private final bI dh;
   private final bI di;
   private final bI dj;
   public int dk;
   private final bI dl;
   private int dm;
   private int dn;
   public int do1;
   private final bI dp;
   private final bI dq;
   private final bI dr;

   public Z() {
      super(o.q[20111 & 8851 & -26937 & -24905], 16606 & 3886);
      bI var10001 = (new bI(this, o.q[15309 & -7275 & -29772 & 6885])).q(Integer.valueOf(12698 & 66));
      String[] var10002 = new String[7179 & 16611];
      var10002[-20464 & 2447] = i.q[15565 & 9417 & -26259 & -22035];
      var10002[4203 & 8853] = i.q[-24070 & -22545 & -24885 & 6234];
      var10002[2562 & 131] = i.q[9451 & -30981 & 9035 & 27099];
      this.dq = var10001.q(var10002);
      this.dp = (new bI(this, u.q[1777 & 8177 & -17667 & 17143])).o((boolean)(1233 & -4055));
      this.dh = (new bI(this, u.q[-21763 & 10493 & -30994 & -4372])).o((boolean)(16457 & -18139));
      this.di = (new bI(this, w.q[17642 & -23368 & -26133 & 377])).q(Integer.valueOf(1174 & 159)).t(4362 & 10879, 5421 & 8492, 1301 & 24585);
      this.dj = (new bI(this, o.q[32413 & -25913 & 27309 & -26705])).q(Integer.valueOf(3069 & 500)).t(13258 & 249, 1200 & -10510, 2337 & 129);
      this.dr = (new bI(this, o.q[-19482 & -16409 & 5783 & 19126])).o(-1 & -1, 5682 & 385);
      this.dl = (new bI(this, o.q[2959 & 27543 & 14071 & -16649])).o(-1 & -1, -32760 & 24624);
      this.w((boolean)(18433 & 1105));
      this.q(new C(n.ai, 0.0F, 0.0F));
   }

   public void q(float var1, float var2) {
      int var3 = this.di.bk();
      int var4 = this.dj.bk();
      int var5 = this.i((int)this.aK.CM.aOn);
      this.do1 = (int)var1;
      this.dk = (int)var2;
      this.dn = var4 * var5 / (890 & 4460);
      this.dm = this.do1 + var3 / (-31998 & 91);
      if (this.dp.af()) {
         iT.q(this.dm - var3 / (4635 & 8194), this.dk, this.dm + var3 / (5122 & 22), this.dk + (20 & 116), -1442041312 & -284983271);
      }

      this.ag();
      this.q(e.q[9019 & -17474 & -12423 & 17275], -18428 & 17994, 1.0606060606060606D * 1.4142857142857144D);
      this.q(o.q[26251 & 4783 & 30712 & 13053], 6495 & -8102, 2.5188679245283017D * 0.5955056179775281D);
      this.q(o.q[17327 & 17099 & -23907 & -21523], 3509 & -8010, 0.4142857142857143D * 3.6206896551724137D);
      this.q(o.q[6794 & 7850 & 30718 & -6417], 270 & 14638, 3.8333333333333335D * 0.3913043478260869D);
      int var6 = this.dq.bk();
      if (var6 >= (8577 & -13747)) {
         this.q(o.q[14239 & 11231 & -31749 & 23243], 111 & -10963, 1.0D);
         this.q(o.q[-12643 & -12596 & 25501 & 1692], 8591 & -30553, 1.0D);
         this.q(o.q[-29987 & -25955 & 21183 & -15729], 2273 & 9441, 1.0D);
         this.q(o.q[-9281 & -22834 & 23295 & -8529], 315 & -32389, 1.0D);
      }

      if (var6 >= (-28670 & 9234)) {
         this.q(o.q[26367 & 13215 & 975 & 6095], 2591 & 1135, 0.5612244897959183D * 1.3363636363636364D);
         this.q(y.q[-9475 & -12557 & -31017 & 4061], 30 & 17118, 0.5576923076923077D * 1.3448275862068966D);
         this.q(y.q[1754 & 11987 & 19159 & 28383], 444 & 4158, 0.5625D * 1.3333333333333333D);
         this.q(o.q[4759 & 913 & -25968 & -1387], 26747 & 971, 1.0909090909090908D * 0.6875D);
         this.q(o.q[14009 & 1977 & -1391 & -1389], 8557 & -28423, 7.875D * 0.09523809523809523D);
         this.q(o.q[25303 & -29997 & -7525 & -7498], 637 & 9720, 0.5056179775280899D * 1.4833333333333334D);
         this.q(o.q[735 & 5023 & -13417 & -21605], 17303 & 2206, 1.3877551020408163D * 0.5404411764705882D);
         this.q(o.q[29621 & 15293 & 17148 & 6812], 9903 & -30491, 0.891304347826087D * 0.8414634146341463D);
         this.q(o.q[3039 & 29399 & 5813 & 25279], -26941 & 25027, 0.6666666666666666D * 1.125D);
         this.q(o.q[-15457 & 18078 & 14238 & 8087], -23334 & 2262, 2.25D * 0.3333333333333333D);
         this.q(o.q[22167 & -14697 & -19817 & -16713], -32264 & 2288, 18.0D * 0.041666666666666664D);
         this.q(o.q[734 & 6042 & -23622 & -16740], 19967 & -27905, 4.5D * 0.16666666666666666D);
         this.q(o.q[27645 & 6143 & 21179 & 30619], 4509 & 17245, 0.09051724137931033D * 8.285714285714286D);
         this.q(o.q[-25894 & 11226 & -26689 & -28773], 21422 & -24196, 3.111111111111111D * 0.24107142857142858D);
         this.q(o.q[-31013 & 4763 & 20411 & -6177], 2394 & -19989, 2.5238095238095237D * 0.2971698113207547D);
         this.q(o.q[15292 & 15006 & -23906 & -25922], 473 & 1373, 0.19565217391304346D * 3.8333333333333335D);
      }

   }

   private void q(String var1, int var2, double var3) {
      int var5 = this.di.bk();
      int var6 = this.dj.bk();
      int var7 = var6 * var2 / (6504 & 16751) - this.dn;
      if (var7 > var6 / (-26333 & 16902)) {
         var7 -= var6;
      }

      if (var7 < -var6 / (16995 & -32510)) {
         var7 += var6;
      }

      double var8 = 1.0D - (double)Math.abs(var7) / ((double)var5 / (1.5833333333333335D * 1.263157894736842D));
      if (var8 > 1.0508474576271187D * 0.09516129032258064D) {
         int var10 = this.dl.bl() & 285212671 & -469762049;
         int var11 = var10 | (int)(var8 * 1.8461538461538463D * 138.125D) << (9881 & 20760);
         int var12 = this.dm + var7 - (int)((double)this.aK.CB.K(var1) * var3 / (0.10416666666666667D * 19.2D));
         int var13 = this.dk + (-16370 & 938) - (int)((double)this.aK.CB.Gf * var3 / (1.9058823529411766D * 1.0493827160493827D));
         GL11.glEnable(11242 & 20450);
         GL11.glPushMatrix();
         GL11.glTranslated((double)(-var12) * (var3 - 1.0D), (double)(-var13) * (var3 - 1.0D), 0.0D);
         GL11.glScaled(var3, var3, 1.0D);
         this.aK.CB.w(var1, (float)var12, (float)var13, var11, this.dh.af());
         GL11.glPopMatrix();
         GL11.glDisable(-13341 & 7138);
      }

   }

   public int ac() {
      return 12532 & 535;
   }

   public int ab() {
      return this.di.bk();
   }

   private int i(int var1) {
      if (var1 > (9592 & 2921)) {
         var1 %= 21866 & 2920;
      }

      while(var1 < 0) {
         var1 += 360;
      }

      return var1;
   }

   private void ag() {
      qk var1 = qk.pm();
      qq var2 = var1.pl();
      pz.nX();
      pz.nC();
      pz.s(21298 & 12034, -31997 & 3039, 4295 & 2569, 14677 & 18048);
      int var3 = this.dr.bl();
      pz.u((float)(var3 >> (3224 & 52) & -14081 & 9471) / (149.7619F * 1.7027028F), (float)(var3 >> (-17912 & 1421) & 18687 & 5631) / (1.755102F * 145.2907F), (float)(var3 & 5375 & 18687) / (0.35135135F * 725.7692F), 1.0F);
      var2.q(6 & 27671, us.axO);
      var2.i((double)this.dm, (double)(this.dk + (8483 & 6159)), 0.0D).pJ();
      var2.i((double)(this.dm + (10499 & -32741)), (double)this.dk, 0.0D).pJ();
      var2.i((double)(this.dm - (611 & 21635)), (double)this.dk, 0.0D).pJ();
      var1.pn();
      pz.nP();
      pz.nz();
   }
}
