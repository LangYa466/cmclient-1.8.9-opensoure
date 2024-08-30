public class Cj extends Cs {
   private boolean aZV;
   private float aZW;
   private float aZX;
   private AV aZY;
   private zz aZZ;
   private int baa;
   private float bab;
   private float bac;
   private float bad;

   public boolean q(Oz var1, float var2) {
      if (!this.Dk() && !var1.Wr() && var1.Wj() instanceof zz) {
         zz var3 = (zz)var1.Wj();
         if (!var1.Ws()) {
            var3.q(Oz.X(this), 2.0F);
            var3.q(e.q[19294 & 974], 0.5F, 1.0F);
         }
      }

      this.aZY.AT();
      return super.q(var1, var2);
   }

   public void hu() {
      if (this.vR.bXF) {
         this.bad = this.aZX;
         if (!this.xg()) {
            this.bab = 2.0F;
            if (this.aOO > 0.0D && this.aZV && !this.xP()) {
               this.vR.q(this.aNZ, this.aNK, this.aOt, p.q[426 & -19954], 1.0F, 1.0F, false);
            }

            this.aZV = this.aOO < 0.0D && this.vR.r((new NW(this)).Vj(), false);
         } else if (this.Dk()) {
            if (this.bab < 0.5F) {
               this.bab = 4.0F;
            } else {
               this.bab += (0.5F - this.bab) * 0.1F;
            }
         } else {
            this.bab += (0.125F - this.bab) * 0.2F;
         }

         this.aZX += this.bab;
         this.aZW = this.bac;
         if (!this.xg()) {
            this.bac = this.oF.nextFloat();
         } else if (this.Dk()) {
            this.bac += (0.0F - this.bac) * 0.25F;
         } else {
            this.bac += (1.0F - this.bac) * 0.06F;
         }

         if (this.Dk() && this.xg()) {
            PX var1 = this.l(0.0F);

            for(int var2 = 0; var2 < 2; ++var2) {
               this.vR.q(OP.bRo, this.aNZ + (this.oF.nextDouble() - 0.5D) * (double)this.gK - var1.bUV * 1.5D, this.aNK + this.oF.nextDouble() * (double)this.gJ - var1.bUW * 1.5D, this.aOt + (this.oF.nextDouble() - 0.5D) * (double)this.gK - var1.bUX * 1.5D, 0.0D, 0.0D, 0.0D);
            }
         }

         if (this.Dh()) {
            if (this.baa < this.Dl()) {
               ++this.baa;
            }

            zz var14 = this.Dj();
            if (var14 != null) {
               this.zl().w(var14, 90.0F, 90.0F);
               this.zl().Ba();
               double var15 = (double)this.aK(0.0F);
               double var4 = var14.aNZ - this.aNZ;
               double var6 = var14.aNK + (double)(var14.gJ * 0.5F) - (this.aNK + (double)this.xC());
               double var8 = var14.aOt - this.aOt;
               double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
               var4 = var4 / var10;
               var6 = var6 / var10;
               var8 = var8 / var10;
               double var12 = this.oF.nextDouble();

               while(var12 < var10) {
                  var12 += 1.8D - var15 + this.oF.nextDouble() * (1.7D - var15);
                  this.vR.q(OP.bRo, this.aNZ + var4 * var12, this.aNK + var6 * var12 + (double)this.xC(), this.aOt + var8 * var12, 0.0D, 0.0D, 0.0D);
               }
            }
         }
      }

      if (this.aNL) {
         this.dJ(300);
      } else if (this.aNG) {
         this.aOO += 0.5D;
         this.aOd += (double)((this.oF.nextFloat() * 2.0F - 1.0F) * 0.4F);
         this.aOL += (double)((this.oF.nextFloat() * 2.0F - 1.0F) * 0.4F);
         this.aOn = this.oF.nextFloat() * 360.0F;
         this.aNG = false;
         this.aOQ = true;
      }

      if (this.Dh()) {
         this.aOn = this.aQu;
      }

      super.hu();
   }

   public Cj(QI var1) {
      super(var1);
      this.aPJ = 10;
      this.d(0.85F, 0.85F);
      this.aPR.q(4, new Cl(this));
      Aw var2;
      this.aPR.q(5, var2 = new Aw(this, 1.0D));
      this.aPR.q(7, this.aZY = new AV(this, 1.0D, 80));
      this.aPR.q(8, new AW(this, DD.class, 8.0F));
      this.aPR.q(8, new AW(this, Cj.class, 12.0F, 0.01F));
      this.aPR.q(9, new Ar(this));
      this.aZY.dX(3);
      var2.dX(3);
      this.aPM.q(1, new Ay(this, zz.class, 10, true, false, new Cn(this)));
      this.aPD = new Cm(this);
      this.bad = this.aZX = this.oF.nextFloat();
   }

   protected void zP() {
      GX var1 = ((Qe)Qb.q(this.oF, DP.GL())).o(this.oF);
      this.q(var1, 1.0F);
   }

   private boolean ew(int var1) {
      return (this.aNw.du(16) & var1) != 0;
   }

   public void dI(int var1) {
      super.dI(var1);
      if (var1 == 16) {
         if (this.Dg() && this.gK < 1.0F) {
            this.d(1.9975F, 1.9975F);
         }
      } else if (var1 == 17) {
         this.baa = 0;
         this.aZZ = null;
      }

   }

   protected void mC() {
      super.mC();
      this.aNw.w(16, Integer.valueOf(0));
      this.aNw.w(17, Integer.valueOf(0));
   }

   public int yU() {
      return 180;
   }

   protected void r(boolean var1, int var2) {
      int var3 = this.oF.nextInt(3) + this.oF.nextInt(var2 + 1);
      if (var3 > 0) {
         this.q(new GX(Et.bmE, var3, 0), 1.0F);
      }

      if (this.oF.nextInt(3 + var2) > 1) {
         this.q(new GX(Et.bnk, 1, Gm.brL.dm()), 1.0F);
      } else if (this.oF.nextInt(3 + var2) > 1) {
         this.q(new GX(Et.bkV, 1, 0), 1.0F);
      }

      if (var1 && this.Dg()) {
         this.q(new GX(Ea.bip, 1, 1), 1.0F);
      }

   }

   protected LB i(QI var1) {
      return new LE(this, var1);
   }

   private void ex(int var1) {
      this.aNw.e(17, Integer.valueOf(var1));
   }

   public boolean Dg() {
      return this.ew(4);
   }

   public float xC() {
      return this.gJ * 0.5F;
   }

   private void i(int var1, boolean var2) {
      int var3 = this.aNw.du(16);
      if (var2) {
         this.aNw.e(16, Integer.valueOf(var3 | var1));
      } else {
         this.aNw.e(16, Integer.valueOf(var3 & ~var1));
      }

   }

   public float H(NW var1) {
      return this.vR.g(var1).ds().cB() == hn.zS ? 10.0F + this.vR.aI(var1) - 0.5F : super.H(var1);
   }

   protected String zC() {
      return !this.xg() ? p.q[2087 & 271] : (this.Dg() ? p.q[16536 & 9288] : p.q[8457 & 4153]);
   }

   public boolean yT() {
      return this.vR.q(this.xE(), this) && this.vR.q(this, this.xE()).isEmpty();
   }

   public boolean Dh() {
      return this.aNw.du(17) != 0;
   }

   private void aF(boolean var1) {
      this.i(2, var1);
   }

   public void Di() {
      this.aG(true);
      this.aZW = this.bac = 1.0F;
   }

   public void t(HL var1) {
      super.t(var1);
      var1.s(p.q[-16119 & 1232], this.Dg());
   }

   // $FF: synthetic method
   static AV w(Cj var0) {
      return var0.aZY;
   }

   protected String zv() {
      return !this.xg() ? p.q[20494 & 2244] : (this.Dg() ? p.q[93 & -21499] : p.q[1062 & -32625]);
   }

   protected boolean mG() {
      return false;
   }

   protected String zp() {
      return !this.xg() ? p.q[-24519 & 4997] : (this.Dg() ? p.q[-20478 & 18498] : p.q[6151 & 51]);
   }

   public zz Dj() {
      if (!this.Dh()) {
         return null;
      } else if (this.vR.bXF) {
         if (this.aZZ != null) {
            return this.aZZ;
         } else {
            zk var1 = this.vR.bv(this.aNw.du(17));
            if (var1 instanceof zz) {
               this.aZZ = (zz)var1;
               return this.aZZ;
            } else {
               return null;
            }
         }
      } else {
         return this.zc();
      }
   }

   // $FF: synthetic method
   static void q(Cj var0, boolean var1) {
      var0.aF(var1);
   }

   public boolean Dk() {
      return this.ew(2);
   }

   public int Dl() {
      return this.Dg() ? 60 : 80;
   }

   // $FF: synthetic method
   static void q(Cj var0, int var1) {
      var0.ex(var1);
   }

   public void aG(boolean var1) {
      this.i(4, var1);
      if (var1) {
         this.d(1.9975F, 1.9975F);
         this.q(zR.aSd).h(0.30000001192092896D);
         this.q(zR.aSb).h(8.0D);
         this.q(zR.aSa).h(80.0D);
         this.yN();
         this.aZY.dY(400);
      }

   }

   protected boolean CS() {
      return true;
   }

   protected void yR() {
      super.yR();
      if (this.Dg()) {
         boolean var1 = true;
         boolean var2 = true;
         boolean var3 = true;
         boolean var4 = true;
         if ((this.aOa + this.yi()) % 1200 == 0) {
            LG var5 = LG.bBV;

            for(DH var7 : this.vR.q(DH.class, new Ck(this))) {
               if (!var7.q(var5) || var7.w(var5).Oj() < 2 || var7.w(var5).EW() < 1200) {
                  var7.beK.t(new KD(10, 0.0F));
                  var7.e(new LJ(var5.bCA, 6000, 2));
               }
            }
         }

         if (!this.yt()) {
            this.w(new NW(this), 16);
         }
      }

   }

   public float aI(float var1) {
      return this.bad + (this.aZX - this.bad) * var1;
   }

   public boolean yy() {
      return (this.oF.nextInt(20) == 0 || !this.vR.ap(new NW(this))) && super.yy();
   }

   public float aJ(float var1) {
      return this.aZW + (this.bac - this.aZW) * var1;
   }

   public float aK(float var1) {
      return ((float)this.baa + var1) / (float)this.Dl();
   }

   public int zd() {
      return 160;
   }

   public void r(HL var1) {
      super.r(var1);
      this.aG(var1.bL(p.q[16385 & -27150]));
   }

   protected void yJ() {
      super.yJ();
      this.q(zR.aSb).h(6.0D);
      this.q(zR.aSd).h(0.5D);
      this.q(zR.aSe).h(16.0D);
      this.q(zR.aSa).h(30.0D);
   }

   public void k(float var1, float var2) {
      if (this.hC()) {
         if (this.xg()) {
            this.g(var1, var2, 0.1F);
            this.h(this.aOd, this.aOO, this.aOL);
            this.aOd *= 0.8999999761581421D;
            this.aOO *= 0.8999999761581421D;
            this.aOL *= 0.8999999761581421D;
            if (!this.Dk() && this.zc() == null) {
               this.aOO -= 0.005D;
            }
         } else {
            super.k(var1, var2);
         }
      } else {
         super.k(var1, var2);
      }

   }
}
