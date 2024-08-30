import java.util.UUID;

public abstract class zx extends zz {
   private boolean aPy;
   protected AY aPz;
   private GX[] aPA = new GX[5];
   private zq aPB;
   private boolean aPC;
   protected Bc aPD;
   private zz aPE;
   private Bd aPF;
   private HL aPG;
   private String aPH = null;
   protected LB aPI;
   protected int aPJ;
   public int aPK;
   private UUID aPL = null;
   protected final AP aPM;
   protected float[] aPN = new float[5];
   private AZ aPO;
   private zk aPP;
   private boolean aPQ;
   protected final AP aPR;

   protected void yJ() {
      super.yJ();
      this.Ag().r(zR.aSe).h(16.0D);
   }

   protected int p(DD var1) {
      if (this.aPJ > 0) {
         int var2 = this.aPJ;
         GX[] var3 = this.xM();

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if (var3[var4] != null && this.aPN[var4] <= 1.0F) {
               var2 += 1 + this.oF.nextInt(3);
            }
         }

         return var2;
      } else {
         return this.aPJ;
      }
   }

   public void hv() {
      if (MV.Sa() && this.ze()) {
         this.zn();
      } else {
         super.hv();
         if (!this.vR.bXF) {
            this.yz();
         }
      }

   }

   public void yK() {
   }

   public static int x(GX var0) {
      if (var0.do1() != Fm.C(Ea.biV) && var0.do1() != Et.bll) {
         if (var0.do1() instanceof FH) {
            switch(((FH)var0.do1()).brm) {
            case 0:
               return 4;
            case 1:
               return 3;
            case 2:
               return 2;
            case 3:
               return 1;
            }
         }

         return 0;
      } else {
         return 4;
      }
   }

   public boolean yL() {
      return this.aPC;
   }

   public final boolean y(DD var1) {
      if (this.yL() && this.yP() == var1) {
         this.t(true, !var1.bdO.bfz);
         return true;
      } else {
         GX var2 = var1.bdM.GE();
         if (var2 != null && var2.do1() == Et.bmY && this.yQ()) {
            if (!(this instanceof Dq) || !((Dq)this).Ff()) {
               this.q(var1, true);
               --var2.bsH;
               return true;
            }

            if (((Dq)this).x(var1)) {
               this.q(var1, true);
               --var2.bsH;
               return true;
            }
         }

         if (this.o(var1)) {
            return true;
         } else {
            return super.y(var1);
         }
      }
   }

   protected LB i(QI var1) {
      return new LD(this, var1);
   }

   protected void e(boolean var1, int var2) {
      for(int var3 = 0; var3 < this.xM().length; ++var3) {
         GX var4 = this.dP(var3);
         boolean var5 = this.aPN[var3] > 1.0F;
         if (var4 != null && (var1 || var5) && this.oF.nextFloat() - (float)var2 * 0.01F < this.aPN[var3]) {
            if (!var5 && var4.If()) {
               int var6 = Math.max(var4.Hz() - 25, 1);
               int var7 = var4.Hz() - this.oF.nextInt(this.oF.nextInt(var6) + 1);
               if (var7 > var6) {
                  var7 = var6;
               }

               if (var7 < 1) {
                  var7 = 1;
               }

               var4.fr(var7);
            }

            this.q(var4, 0.0F);
         }
      }

   }

   public LB yM() {
      return this.aPI;
   }

   protected float l(float var1, float var2) {
      this.aPB.ys();
      return var2;
   }

   public void yN() {
      this.aPQ = true;
   }

   public void ay(float var1) {
      this.aPW = var1;
   }

   public Bc yO() {
      return this.aPD;
   }

   public zk yP() {
      return this.aPP;
   }

   public static Fm ap(int var0, int var1) {
      switch(var0) {
      case 4:
         if (var1 == 0) {
            return Et.blb;
         } else if (var1 == 1) {
            return Et.blk;
         } else if (var1 == 2) {
            return Et.bmy;
         } else if (var1 == 3) {
            return Et.bmN;
         } else if (var1 == 4) {
            return Et.bnY;
         }
      case 3:
         if (var1 == 0) {
            return Et.blh;
         } else if (var1 == 1) {
            return Et.bkS;
         } else if (var1 == 2) {
            return Et.bnh;
         } else if (var1 == 3) {
            return Et.bnf;
         } else if (var1 == 4) {
            return Et.blN;
         }
      case 2:
         if (var1 == 0) {
            return Et.bmJ;
         } else if (var1 == 1) {
            return Et.bon;
         } else if (var1 == 2) {
            return Et.boe;
         } else if (var1 == 3) {
            return Et.blI;
         } else if (var1 == 4) {
            return Et.bnb;
         }
      case 1:
         if (var1 == 0) {
            return Et.bms;
         } else if (var1 == 1) {
            return Et.bot;
         } else if (var1 == 2) {
            return Et.bld;
         } else if (var1 == 3) {
            return Et.blB;
         } else if (var1 == 4) {
            return Et.bmB;
         }
      default:
         return null;
      }
   }

   public boolean yQ() {
      return !this.yL() && !(this instanceof CP);
   }

   protected final void hK() {
      ++this.aQw;
      this.vR.bXK.cf(p.q[-13706 & 564]);
      this.zj();
      this.vR.bXK.Ol();
      this.vR.bXK.cf(p.q[-31819 & 11893]);
      this.aPF.Bh();
      this.vR.bXK.Ol();
      this.vR.bXK.cf(p.q[-15562 & 12982]);
      this.aPM.AP();
      this.vR.bXK.Ol();
      this.vR.bXK.cf(p.q[-32073 & 18231]);
      this.aPR.AP();
      this.vR.bXK.Ol();
      this.vR.bXK.cf(p.q[18108 & 9081]);
      this.aPI.NJ();
      this.vR.bXK.Ol();
      this.vR.bXK.cf(p.q[17213 & 697]);
      this.yR();
      this.vR.bXK.Ol();
      this.vR.bXK.cf(p.q[6074 & 2618]);
      this.vR.bXK.cf(u.q[-30881 & 9065]);
      this.aPD.Be();
      this.vR.bXK.cd(p.q[9791 & -11653]);
      this.aPO.Ba();
      this.vR.bXK.cd(p.q[9916 & 2620]);
      this.aPz.AU();
      this.vR.bXK.Ol();
      this.vR.bXK.Ol();
   }

   public int xk() {
      if (this.zc() == null) {
         return 3;
      } else {
         int var1 = (int)(this.zA() - this.zE() * 0.33F);
         var1 = var1 - (3 - this.vR.Kq().Zb()) * 4;
         if (var1 < 0) {
            var1 = 0;
         }

         return var1 + 3;
      }
   }

   protected void q(Qq var1) {
      float var2 = var1.YZ();
      if (this.zg() != null && this.oF.nextFloat() < 0.25F * var2) {
         yS.w(this.oF, this.zg(), (int)(5.0F + var2 * (float)this.oF.nextInt(18)));
      }

      for(int var3 = 0; var3 < 4; ++var3) {
         GX var4 = this.dQ(var3);
         if (var4 != null && this.oF.nextFloat() < 0.5F * var2) {
            yS.w(this.oF, var4, (int)(5.0F + var2 * (float)this.oF.nextInt(18)));
         }
      }

   }

   public void ak(boolean var1) {
      this.aNw.e(15, Byte.valueOf((byte)(var1 ? 1 : 0)));
   }

   public void q(int var1, GX var2) {
      this.aPA[var1] = var2;
   }

   public boolean hC() {
      return super.hC() && !this.yV();
   }

   public boolean r(int var1, GX var2) {
      int var3;
      if (var1 == 99) {
         var3 = 0;
      } else {
         var3 = var1 - 100 + 1;
         if (var3 < 0 || var3 >= this.aPA.length) {
            return false;
         }
      }

      if (var2 != null && x(var2) != var3 && (var3 != 4 || !(var2.do1() instanceof FO))) {
         return false;
      } else {
         this.q(var3, var2);
         return true;
      }
   }

   protected void yR() {
   }

   public AY yS() {
      return this.aPz;
   }

   public void q(zk var1, boolean var2) {
      this.aPC = true;
      this.aPP = var1;
      if (!this.vR.bXF && var2 && this.vR instanceof QU) {
         ((QU)this.vR).aaj().q(this, new Kk(1, this, this.aPP));
      }

   }

   protected void r(boolean var1, int var2) {
      Fm var3 = this.yX();
      if (var3 != null) {
         int var4 = this.oF.nextInt(3);
         if (var2 > 0) {
            var4 += this.oF.nextInt(var2 + 1);
         }

         for(int var5 = 0; var5 < var4; ++var5) {
            this.r(var3, 1);
         }
      }

   }

   public boolean yT() {
      return this.vR.q(this.xE(), this) && this.vR.q(this, this.xE()).isEmpty() && !this.vR.p(this.xE());
   }

   public void al(boolean var1) {
      this.aPy = var1;
   }

   public int yU() {
      return 40;
   }

   public boolean yV() {
      return this.aNw.dy(15) != 0;
   }

   public Bd yW() {
      return this.aPF;
   }

   public void q(zk var1, float var2, float var3) {
      double var4 = var1.aNZ - this.aNZ;
      double var6 = var1.aOt - this.aOt;
      double var8;
      if (var1 instanceof zz) {
         zz var10 = (zz)var1;
         var8 = var10.aNK + (double)var10.xC() - (this.aNK + (double)this.xC());
      } else {
         var8 = (var1.xE().bNT + var1.xE().bNX) / 2.0D - (this.aNK + (double)this.xC());
      }

      double var14 = (double)Pq.B(var4 * var4 + var6 * var6);
      float var12 = (float)(Pq.u(var6, var4) * 180.0D / 3.141592653589793D) - 90.0F;
      float var13 = (float)(-(Pq.u(var8, var14) * 180.0D / 3.141592653589793D));
      this.aNN = this.j(this.aNN, var13, var3);
      this.aOn = this.j(this.aOn, var12, var2);
   }

   protected Fm yX() {
      return null;
   }

   public void t(boolean var1, boolean var2) {
      if (this.aPC) {
         this.aPC = false;
         this.aPP = null;
         if (!this.vR.bXF && var2) {
            this.r(Et.bmY, 1);
         }

         if (!this.vR.bXF && var1 && this.vR instanceof QU) {
            ((QU)this.vR).aaj().q(this, new Kk(1, this, (zk)null));
         }
      }

   }

   public zx(QI var1) {
      super(var1);
      this.aPR = new AP(var1 != null && var1.bXK != null ? var1.bXK : null);
      this.aPM = new AP(var1 != null && var1.bXK != null ? var1.bXK : null);
      this.aPO = new AZ(this);
      this.aPD = new Bc(this);
      this.aPz = new AY(this);
      this.aPB = new zq(this);
      this.aPI = this.i(var1);
      this.aPF = new Bd(this);

      for(int var2 = 0; var2 < this.aPN.length; ++var2) {
         this.aPN[var2] = 0.085F;
      }

   }

   private float j(float var1, float var2, float var3) {
      float var4 = Pq.bl(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public boolean yY() {
      return this.aPQ;
   }

   public void r(HL var1) {
      super.r(var1);
      if (var1.d(p.q[2926 & -27985], 1)) {
         this.al(var1.bL(p.q[21422 & 1582]));
      }

      this.aPQ = var1.bL(p.q[10815 & 1903]);
      if (var1.d(e.q[16989 & 9061], 9)) {
         HT var2 = var1.s(e.q[-6587 & 583], 10);

         for(int var3 = 0; var3 < this.aPA.length; ++var3) {
            this.aPA[var3] = GX.x(var2.fv(var3));
         }
      }

      if (var1.d(p.q[10872 & 820], 9)) {
         HT var4 = var1.s(p.q[5936 & -24006], 5);

         for(int var5 = 0; var5 < var4.II(); ++var5) {
            this.aPN[var5] = var4.fx(var5);
         }
      }

      this.aPC = var1.bL(p.q[-27843 & 1585]);
      if (this.aPC && var1.d(p.q[-28046 & 563], 10)) {
         this.aPG = var1.bO(p.q[2610 & 882]);
      }

      this.ak(var1.bL(p.q[-13389 & 8831]));
   }

   protected boolean o(DD var1) {
      return false;
   }

   public void yZ() {
      String var1 = this.zp();
      if (var1 != null) {
         this.q(var1, this.zw(), this.Ad());
      }

   }

   public int za() {
      return 4;
   }

   public GX dP(int var1) {
      return this.aPA[var1];
   }

   public boolean zb() {
      return false;
   }

   protected void w(Qq var1) {
      if (this.oF.nextFloat() < 0.15F * var1.YZ()) {
         int var2 = this.oF.nextInt(2);
         float var3 = this.vR.Kq() == Qr.bWh ? 0.1F : 0.25F;
         if (this.oF.nextFloat() < 0.095F) {
            ++var2;
         }

         if (this.oF.nextFloat() < 0.095F) {
            ++var2;
         }

         if (this.oF.nextFloat() < 0.095F) {
            ++var2;
         }

         for(int var4 = 3; var4 >= 0; --var4) {
            GX var5 = this.dQ(var4);
            if (var4 < 3 && this.oF.nextFloat() < var3) {
               break;
            }

            if (var5 == null) {
               Fm var6 = ap(var4 + 1, var2);
               if (var6 != null) {
                  this.q(var4 + 1, new GX(var6));
               }
            }
         }
      }

   }

   public zz zc() {
      return this.aPE;
   }

   public int zd() {
      return 80;
   }

   public void hu() {
      super.hu();
      this.vR.bXK.cf(o.q[-30218 & 16886]);
      if (!this.vR.bXF && this.zk() && !this.aQz && this.vR.vU().bL(w.q[10229 & -31855])) {
         for(BD var2 : this.vR.q(BD.class, this.xE().C(1.0D, 0.0D, 1.0D))) {
            if (!var2.aNQ && var2.Ch() != null && !var2.Cm()) {
               this.e(var2);
            }
         }
      }

      this.vR.bXK.Ol();
   }

   private boolean ze() {
      if (this.yp()) {
         return false;
      } else if (this.aQf > 0) {
         return false;
      } else if (this.aOa < 20) {
         return false;
      } else {
         QI var1 = this.vQ();
         if (var1 == null) {
            return false;
         } else if (var1.bXt.size() != 1) {
            return false;
         } else {
            zk var2 = (zk)var1.bXt.get(0);
            double var3 = Math.max(Math.abs(this.aNZ - var2.aNZ) - 16.0D, 0.0D);
            double var5 = Math.max(Math.abs(this.aOt - var2.aOt) - 16.0D, 0.0D);
            double var7 = var3 * var3 + var5 * var5;
            return !this.f(var7);
         }
      }
   }

   public void zf() {
      if (this.vR.bXF) {
         for(int var1 = 0; var1 < 20; ++var1) {
            double var2 = this.oF.nextGaussian() * 0.02D;
            double var4 = this.oF.nextGaussian() * 0.02D;
            double var6 = this.oF.nextGaussian() * 0.02D;
            double var8 = 10.0D;
            this.vR.q(OP.bRk, this.aNZ + (double)(this.oF.nextFloat() * this.gK * 2.0F) - (double)this.gK - var2 * var8, this.aNK + (double)(this.oF.nextFloat() * this.gJ) - var4 * var8, this.aOt + (double)(this.oF.nextFloat() * this.gK * 2.0F) - (double)this.gK - var6 * var8, var2, var4, var6);
         }
      } else {
         this.vR.q(this, (byte)20);
      }

   }

   public GX zg() {
      return this.aPA[0];
   }

   public Mb zh() {
      UUID var1 = this.ym();
      if (this.aPL != var1) {
         this.aPL = var1;
         this.aPH = var1.toString();
      }

      return this.vR.wp().co(this.aPH);
   }

   public float zi() {
      return 1.0F;
   }

   protected void yz() {
      if (this.aPG != null) {
         this.zm();
      }

      if (this.aPC) {
         if (!this.xV()) {
            this.t(true, true);
         }

         if (this.aPP == null || this.aPP.aNQ) {
            this.t(true, true);
         }
      }

   }

   public boolean r(Class var1) {
      return var1 != Cc.class;
   }

   protected void zj() {
      if (this.aPQ) {
         this.aQw = 0;
      } else {
         DD var1 = this.vR.y(this, -1.0D);
         if (var1 != null) {
            double var2 = var1.aNZ - this.aNZ;
            double var4 = var1.aNK - this.aNK;
            double var6 = var1.aOt - this.aOt;
            double var8 = var2 * var2 + var4 * var4 + var6 * var6;
            if (this.zo() && var8 > 16384.0D) {
               this.yo();
            }

            if (this.aQw > 600 && this.oF.nextInt(800) == 0 && var8 > 1024.0D && this.zo()) {
               this.yo();
            } else if (var8 < 1024.0D) {
               this.aQw = 0;
            }
         }
      }

   }

   protected void e(BD var1) {
      GX var2 = var1.Ch();
      int var3 = x(var2);
      if (var3 > -1) {
         boolean var4 = true;
         GX var5 = this.dP(var3);
         if (var5 != null) {
            if (var3 == 0) {
               if (var2.do1() instanceof GY && !(var5.do1() instanceof GY)) {
                  var4 = true;
               } else if (var2.do1() instanceof GY && var5.do1() instanceof GY) {
                  GY var8 = (GY)var2.do1();
                  GY var10 = (GY)var5.do1();
                  if (var8.HD() != var10.HD()) {
                     var4 = var8.HD() > var10.HD();
                  } else {
                     var4 = var2.dm() > var5.dm() || var2.HZ() && !var5.HZ();
                  }
               } else if (var2.do1() instanceof FR && var5.do1() instanceof FR) {
                  var4 = var2.HZ() && !var5.HZ();
               } else {
                  var4 = false;
               }
            } else if (var2.do1() instanceof FH && !(var5.do1() instanceof FH)) {
               var4 = true;
            } else if (var2.do1() instanceof FH && var5.do1() instanceof FH) {
               FH var6 = (FH)var2.do1();
               FH var7 = (FH)var5.do1();
               if (var6.brr != var7.brr) {
                  var4 = var6.brr > var7.brr;
               } else {
                  var4 = var2.dm() > var5.dm() || var2.HZ() && !var5.HZ();
               }
            } else {
               var4 = false;
            }
         }

         if (var4 && this.c(var2)) {
            if (var5 != null && this.oF.nextFloat() - 0.1F < this.aPN[var3]) {
               this.q(var5, 0.0F);
            }

            if (var2.do1() == Et.bnC && var1.Cl() != null) {
               DD var9 = this.vR.dx(var1.Cl());
               if (var9 != null) {
                  var9.w(MX.bIQ);
               }
            }

            this.q(var3, var2);
            this.aPN[var3] = 2.0F;
            this.aPQ = true;
            this.e(var1, 1);
            var1.yo();
         }
      }

   }

   public boolean zk() {
      return this.aPy;
   }

   protected void mC() {
      super.mC();
      this.aNw.w(15, Byte.valueOf((byte)0));
   }

   public void t(HL var1) {
      super.t(var1);
      var1.s(p.q[18990 & -23953], this.zk());
      var1.s(p.q[8943 & -14801], this.aPQ);
      HT var2 = new HT();

      for(int var3 = 0; var3 < this.aPA.length; ++var3) {
         HL var4 = new HL();
         if (this.aPA[var3] != null) {
            this.aPA[var3].z(var4);
         }

         var2.q(var4);
      }

      var1.w(e.q[4965 & 8791], var2);
      HT var6 = new HT();

      for(int var7 = 0; var7 < this.aPN.length; ++var7) {
         var6.q(new HQ(this.aPN[var7]));
      }

      var1.w(p.q[560 & 27316], var6);
      var1.s(p.q[-32207 & 25205], this.aPC);
      if (this.aPP != null) {
         HL var8 = new HL();
         if (this.aPP instanceof zz) {
            var8.q(q.q[953 & 5032], this.aPP.ym().getMostSignificantBits());
            var8.q(q.q[-27717 & 1001], this.aPP.ym().getLeastSignificantBits());
         } else if (this.aPP instanceof zt) {
            NW var5 = ((zt)this.aPP).yD();
            var8.a(q.q[16762 & 210], var5.aY());
            var8.a(q.q[6261 & 8660], var5.aX());
            var8.a(q.q[-14217 & 4822], var5.KO());
         }

         var1.w(p.q[562 & 12987], var8);
      }

      if (this.yV()) {
         var1.s(p.q[25271 & -30093], this.yV());
      }

   }

   public AZ zl() {
      return this.aPO;
   }

   public void f(zz var1) {
      this.aPE = var1;
   }

   private void zm() {
      if (this.aPC && this.aPG != null) {
         if (this.aPG.d(q.q[1961 & 1000], 4) && this.aPG.d(q.q[941 & 5097], 4)) {
            UUID var4 = new UUID(this.aPG.bJ(q.q[6076 & 936]), this.aPG.bJ(q.q[9129 & -27713]));

            for(zz var3 : this.vR.q(zz.class, this.xE().C(10.0D, 10.0D, 10.0D))) {
               if (var3.ym().equals(var4)) {
                  this.aPP = var3;
                  break;
               }
            }
         } else if (this.aPG.d(q.q[82 & 13170], 99) && this.aPG.d(q.q[8404 & 21844], 99) && this.aPG.d(q.q[20695 & 8790], 99)) {
            NW var1 = new NW(this.aPG.bQ(q.q[6906 & -31406]), this.aPG.bQ(q.q[7380 & 24950]), this.aPG.bQ(q.q[-32682 & 246]));
            zu var2 = zu.Z(this.vR, var1);
            if (var2 == null) {
               var2 = zu.aa(this.vR, var1);
            }

            this.aPP = var2;
         } else {
            this.t(false, true);
         }
      }

      this.aPG = null;
   }

   public void q(byte var1) {
      if (var1 == 20) {
         this.zf();
      } else {
         super.q(var1);
      }

   }

   public void y(int var1, float var2) {
      this.aPN[var1] = var2;
   }

   public zJ q(Qq var1, zJ var2) {
      this.q(zR.aSe).e(new Bf(i.q[-31299 & 4542], this.oF.nextGaussian() * 0.05D, 1));
      return var2;
   }

   private void zn() {
      ++this.aQw;
      if (this instanceof Cs) {
         float var1 = this.J(1.0F);
         if (var1 > 0.5F) {
            this.aQw += 2;
         }
      }

      this.zj();
   }

   public GX dQ(int var1) {
      return this.aPA[var1 + 1];
   }

   public boolean yy() {
      return true;
   }

   protected boolean zo() {
      return true;
   }

   protected boolean c(GX var1) {
      return true;
   }

   protected String zp() {
      return null;
   }

   public void xe() {
      super.xe();
      this.vR.bXK.cf(p.q[5119 & -31187]);
      if (this.xV() && this.oF.nextInt(1000) < this.aPK++) {
         this.aPK = -this.zd();
         this.yZ();
      }

      this.vR.bXK.Ol();
   }

   public void az(float var1) {
      super.az(var1);
      this.ay(var1);
   }

   public GX[] xM() {
      return this.aPA;
   }
}
