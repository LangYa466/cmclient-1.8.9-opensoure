import java.awt.Color;

public class Y extends E {
   private final bI cY;
   private final bI cZ;
   private final bI da;
   private final bI db;
   private final bI dc;
   private final bI dd;
   public static Y de;
   private final bI df;
   private final bI dg;

   public void q(kJ var1, int var2, int var3) {
      if (this.aK.Br.aCr < (1049 & -28319) || this.cZ.af()) {
         int var4 = this.df.bl();
         float var5 = this.dd.br();
         float var6 = this.db.br();
         float var7 = this.dc.br();
         if (this.dg.bk() != 0 && this.cY.af()) {
            bQ.e((float)var2 - 3.3F * 0.030303031F, (float)var3, 3.0F * 1.0F, this.da.bl());
         }

         switch(this.dg.bk()) {
         case 0:
            int var8 = var1.kr();
            int var9 = var1.kp();
            this.aK.fJ().o(iT.Gs);
            pz.nX();
            pz.s(9031 & 18311, 2819 & -31915, -29311 & 8257, 19970 & -20416);
            pz.hT();
            this.aK.BZ.e((var8 >> (8327 & 16657)) - (-15281 & 12839), (var9 >> (-25599 & 77)) - (6159 & 17703), 2248 & 18209, 256 & 20655, -15500 & 1043, 8785 & -28650);
            pz.s(24423 & 9106, 8967 & 18211, 2049 & 20577, -32572 & 9480);
            break;
         case 1:
            var7 = var7 / 2.0F;
            bQ.q((float)var2 - var7, (float)var3 - var6 - var5, (float)var2 + var7, (float)var3 - var6, var4, (boolean)(17 & 7393));
            bQ.q((float)var2 - var7, (float)var3 + var6, (float)var2 + var7, (float)var3 + var6 + var5, var4, (boolean)(4117 & -16285));
            bQ.q((float)var2 - var6 - var5, (float)var3 - var7, (float)var2 - var6, (float)var3 + var7, var4, (boolean)(8225 & -10087));
            bQ.q((float)var2 + var6, (float)var3 - var7, (float)var2 + var6 + var5, (float)var3 + var7, var4, (boolean)(12547 & 673));
            break;
         case 2:
            bQ.q(var2, var3, var6, var6 + var7, var4, (boolean)(-12269 & 10561));
            break;
         case 3:
            float[] var10000 = new float[952 & -15287];
            var10000[775 & 17472] = (float)var2 - var5;
            var10000[-16127 & 25] = (float)var3 + var5;
            var10000[24866 & 2630] = (float)var2;
            var10000[1611 & -28633] = (float)var3;
            var10000[-16378 & 1285] = (float)var2;
            var10000[12581 & -30713] = (float)var3;
            var10000[4118 & -20857] = (float)var2 + var5;
            var10000[16391 & 2111] = (float)var3 + var5;
            bQ.q(var10000, var7, var4, (boolean)(-22003 & 3));
         }

         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   public Y() {
      super(i.q[9010 & -5313 & -9355 & -11459], 46 & 798);
      new bI(this, i.q[1851 & 11067 & 32689 & 30713]);
      bI var10001 = (new bI(this, t.q[-32153 & -5273 & 10214 & -4562])).q(Integer.valueOf(2261 & 20515));
      String[] var10002 = new String[17925 & -18268];
      var10002[-32640 & 16458] = e.q[18942 & 10750 & -6185 & -19533];
      var10002[4307 & 3073] = i.q[-11462 & -10446 & -31746 & 954];
      var10002[16974 & 14594] = i.q[29555 & 11063 & -31877 & -7301];
      var10002[-26585 & 9299] = i.q[23397 & -9721 & 9943 & 20085];
      this.dg = var10001.q(var10002);
      this.df = (new bI(this, w.q[3491 & 4515 & -31313 & -30273])).o((new Color(-7937 & 511, 511 & -28417, 15615 & 255, 255 & -28417)).getRGB(), -29676 & 29056);
      this.dd = (new bI(this, i.q[-17921 & -15873 & 11231 & 3551])).q(Float.valueOf(4.5555553F * 0.6585366F)).q(1.0F, 0.40816328F * 58.8F, 0.15F * 3.3333333F);
      this.db = (new bI(this, i.q[23357 & -21571 & 29494 & -5250])).q(Float.valueOf(0.9222222F * 1.6265061F)).q(0.0F, 2.6666667F * 12.0F, 0.11111111F * 4.5F);
      this.dc = (new bI(this, i.q[3959 & 2933 & -21579 & -22603])).q(Float.valueOf(1.0F)).q(0.48000002F * 1.0416666F, 0.3838384F * 13.026316F, 0.4871795F * 1.0263158F);
      new bI(this, i.q[25471 & -23753 & 32758 & 2038]);
      this.cY = (new bI(this, i.q[10103 & 12151 & -13513 & 20279])).o((boolean)(9362 & 2636));
      this.da = (new bI(this, i.q[22332 & 10046 & -16514 & -13445])).o((new Color(16895 & -27905, 22271 & 2303, 12543 & 767, 3071 & 16639)).getRGB(), 128 & -30653);
      new bI(this, i.q[13182 & 3326 & -16139 & -16129]);
      this.cZ = (new bI(this, i.q[10169 & -20551 & 21373 & 17277])).o((boolean)(4741 & 1105));
      de = this;
   }
}
