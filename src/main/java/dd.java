import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public abstract class DD extends zz implements ahw {
   private boolean bdv;
   private final GameProfile bdw;
   public float bdx;
   public PJ bdy;
   protected float bdz = 0.02F;
   public PJ bdA;
   public double bdB;
   public double bdC;
   public float bdD;
   public float bdE;
   private NW bdF;
   public DP bdG;
   private GX bdH;
   private int bdI;
   public PJ bdJ;
   public boolean bdK;
   private int bdL;
   public DJ bdM = new DJ(this);
   private int bdN;
   public DL bdO = new DL();
   public boolean bdP;
   public Ev bdQ;
   protected int bdR;
   public double bdS;
   public float bdT;
   private NW bdU;
   public int bdV;
   public Ev bdW;
   private ab bdX;
   private Fa bdY = new Fa();
   private boolean bdZ = false;
   private ahB bea;
   public double beb;
   public double bec;
   private final aq bed;
   public int bee;
   public afp bef;
   public float beg;
   private int beh;
   protected boolean bei;
   public boolean bej;
   public boolean bek;
   protected OT bel = new OT();
   public NW bem;
   public agc ben;
   protected float beo = 0.1F;
   public float bep;
   public double beq;
   private final aH ber;
   public PJ bes;
   public int bet;

   public boolean xO() {
      return !this.bdO.bfB;
   }

   protected void FB() {
      if (this.bdH != null) {
         this.w(this.bdH, 16);
         int var1 = this.bdH.bsH;
         GX var2 = this.bdH.q(this.vR, this);
         if (var2 != this.bdH || var2 != null && var2.bsH != var1) {
            this.bdM.bft[this.bdM.bfu] = var2;
            if (var2.bsH == 0) {
               this.bdM.bft[this.bdM.bfu] = null;
            }
         }

         this.FQ();
      }

   }

   public GX dQ(int var1) {
      return this.bdM.eU(var1);
   }

   protected void w(GX var1, int var2) {
      if (var1.HY() == Fj.bqf) {
         this.q(p.q[2225 & -31565], 0.5F, this.vR.bXs.nextFloat() * 0.1F + 0.9F);
      }

      if (var1.HY() == Fj.bqe) {
         for(int var3 = 0; var3 < var2; ++var3) {
            PX var4 = new PX(((double)this.oF.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
            var4 = var4.bm(-this.aNN * 3.1415927F / 180.0F);
            var4 = var4.bn(-this.aOn * 3.1415927F / 180.0F);
            double var5 = (double)(-this.oF.nextFloat()) * 0.6D - 0.3D;
            PX var7 = new PX(((double)this.oF.nextFloat() - 0.5D) * 0.3D, var5, 0.6D);
            var7 = var7.bm(-this.aNN * 3.1415927F / 180.0F);
            var7 = var7.bn(-this.aOn * 3.1415927F / 180.0F);
            var7 = var7.K(this.aNZ, this.aNK + (double)this.xC(), this.aOt);
            if (var1.Hw()) {
               this.vR.q(OP.bRU, var7.bUV, var7.bUW, var7.bUX, var4.bUV, var4.bUW + 0.05D, var4.bUX, Fm.s(var1.do1()), var1.dm());
            } else {
               this.vR.q(OP.bRU, var7.bUV, var7.bUW, var7.bUX, var4.bUV, var4.bUW + 0.05D, var4.bUX, Fm.s(var1.do1()));
            }
         }

         this.q(p.q[3250 & 8370], 0.5F + 0.5F * (float)this.oF.nextInt(2), (this.oF.nextFloat() - this.oF.nextFloat()) * 0.2F + 1.0F);
      }

   }

   public static NW e(QI var0, NW var1, boolean var2) {
      cv var3 = var0.g(var1).ds();
      if (var3 != Ea.bgQ) {
         if (!var2) {
            return null;
         } else {
            boolean var4 = var3.da();
            boolean var5 = var0.g(var1.Vi()).ds().da();
            return var4 && var5 ? var1 : null;
         }
      } else {
         return cO.w(var0, var1, 0);
      }
   }

   public void r(HL var1) {
      super.r(var1);
      this.aOv = e(this.bdw);
      HT var2 = var1.s(i.q[4450 & -31892], 10);
      this.bdM.q(var2);
      this.bdM.bfu = var1.bQ(p.q[-4938 & 4342]);
      this.bei = var1.bL(p.q[-21321 & 16567]);
      this.bdL = var1.bI(p.q[701 & 186]);
      this.bdD = var1.bR(p.q[445 & 185]);
      this.bet = var1.bQ(p.q[186 & -10502]);
      this.bee = var1.bQ(p.q[19707 & -32325]);
      this.bdN = var1.bQ(p.q[16831 & 700]);
      if (this.bdN == 0) {
         this.bdN = this.oF.nextInt();
      }

      this.eO(var1.bQ(q.q[5565 & 2495]));
      if (this.bei) {
         this.bem = new NW(this);
         this.q(true, true, false);
      }

      if (var1.d(r.q[12439 & -15649], 99) && var1.d(r.q[155 & -23624], 99) && var1.d(r.q[-28515 & 16827], 99)) {
         this.bdU = new NW(var1.bQ(r.q[159 & 24567]), var1.bQ(r.q[5273 & 252]), var1.bQ(r.q[5305 & 10395]));
         this.bdv = var1.bL(p.q[5373 & 16829]);
      }

      this.bel.F(var1);
      this.bdO.g(var1);
      if (var1.d(p.q[11454 & 5054], 9)) {
         HT var3 = var1.s(p.q[8382 & 23742], 10);
         this.bdY.e(var3);
      }

   }

   protected void hK() {
      super.hK();
      this.zs();
      this.aQu = this.aOn;
   }

   protected void hG() {
      this.bdQ = this.bdW;
   }

   public int FC() {
      return this.FM() ? this.bdH.In() - this.bdI : 0;
   }

   public void t(zk var1) {
   }

   public void q(zM var1) {
   }

   public GX FD() {
      return this.bdM.GE();
   }

   public void w(Oz var1) {
      super.w(var1);
      this.d(0.2F, 0.2F);
      this.p(this.aNZ, this.aNK, this.aOt);
      this.aOO = 0.10000000149011612D;
      if (this.bY().equals(p.q[-32077 & 18871])) {
         this.q(new GX(Et.bnj, 1), true, false);
      }

      if (!this.vR.vU().bL(i.q[251 & 1210])) {
         this.bdM.GB();
      }

      if (var1 != null) {
         this.aOd = (double)(-Pq.bi((this.aQH + this.aOn) * 3.1415927F / 180.0F) * 0.1F);
         this.aOL = (double)(-Pq.bk((this.aQH + this.aOn) * 3.1415927F / 180.0F) * 0.1F);
      } else {
         this.aOd = this.aOL = 0.0D;
      }

      this.w(Nj.bJS);
      this.q(Nj.bKm);
   }

   public boolean zV() {
      return this.bei;
   }

   public void f(float var1, float var2) {
      if (!this.bdO.bfC) {
         if (var1 >= 2.0F) {
            this.q(Nj.bJZ, (int)Math.round((double)var1 * 100.0D));
         }

         super.f(var1, var2);
      }

   }

   public void eN(int var1) {
      this.eQ(var1);
      int var2 = Integer.MAX_VALUE - this.bee;
      if (var1 > var2) {
         var1 = var2;
      }

      this.bdD += (float)var1 / (float)this.FV();

      for(this.bee += var1; this.bdD >= 1.0F; this.bdD /= (float)this.FV()) {
         this.bdD = (this.bdD - 1.0F) * (float)this.FV();
         this.eR(1);
      }

   }

   public ahB FE() {
      if (this.bea == null) {
         this.bea = new ahB();
      }

      return this.bea;
   }

   public int FF() {
      return this.bdN;
   }

   protected String yk() {
      return p.q[18672 & 12725];
   }

   public void eO(int var1) {
      this.aNw.e(18, Integer.valueOf(var1));
   }

   public void eP(int var1) {
      this.bet -= var1;
      if (this.bet < 0) {
         this.bet = 0;
         this.bdD = 0.0F;
         this.bee = 0;
      }

      this.bdN = this.oF.nextInt();
   }

   protected String dR(int var1) {
      return var1 > 4 ? p.q[-23867 & 1248] : p.q[16581 & -21789];
   }

   public boolean q(NW var1, OK var2, GX var3) {
      if (this.bdO.bfA) {
         return true;
      } else if (var3 == null) {
         return false;
      } else {
         NW var4 = var1.v(var2.WK());
         cv var5 = this.vR.g(var4).ds();
         return var3.g(var5) || var3.HT();
      }
   }

   public void FG() {
      this.bdM.y(this.bdM.bfu, (GX)null);
   }

   public boolean xQ() {
      return !this.bei && super.xQ();
   }

   protected void xw() {
      if (!this.hm()) {
         super.xw();
      }

   }

   public void q(NW var1, boolean var2) {
      if (var1 != null) {
         this.bdU = var1;
         this.bdv = var2;
      } else {
         this.bdU = null;
         this.bdv = false;
      }

   }

   public void y(zk var1) {
   }

   protected int p(DD var1) {
      if (this.vR.vU().bL(i.q[4351 & -14406])) {
         return 0;
      } else {
         int var2 = this.bet * 7;
         return var2 > 100 ? 100 : var2;
      }
   }

   public void w(OX var1) {
   }

   protected void yJ() {
      super.yJ();
      this.Ag().r(zR.aSb).h(1.0D);
      this.q(zR.aSd).h(0.10000000149011612D);
   }

   public void q(EV var1) {
   }

   public boolean FH() {
      return this.FM() && this.bdH.do1().W(this.bdH) == Fj.bqg;
   }

   public boolean FI() {
      return this.bdZ;
   }

   public abstract boolean hm();

   public Mb zh() {
      return this.FL().co(this.bY());
   }

   public void bl(boolean var1) {
      this.bdZ = var1;
   }

   public boolean vR() {
      return Md.Jc().bEU[0].vU().bL(q.q[9853 & 6908]);
   }

   public boolean FJ() {
      return this.bdO.bfA;
   }

   public Fa FK() {
      return this.bdY;
   }

   public void q(int var1, GX var2) {
      this.bdM.bfs[var1] = var2;
   }

   public LY FL() {
      return this.vR.wp();
   }

   public double pP() {
      return -0.35D;
   }

   public BD k(boolean var1) {
      return this.q(this.bdM.ar(this.bdM.bfu, var1 && this.bdM.GE() != null ? this.bdM.GE().bsH : 1), false, true);
   }

   public void k(float var1, float var2) {
      double var3 = this.aNZ;
      double var5 = this.aNK;
      double var7 = this.aOt;
      if (this.bdO.bfB && this.aNP == null) {
         double var9 = this.aOO;
         float var11 = this.aQv;
         this.aQv = this.bdO.GF() * (float)(this.xf() ? 2 : 1);
         super.k(var1, var2);
         this.aOO = var9 * 0.6D;
         this.aQv = var11;
      } else {
         super.k(var1, var2);
      }

      this.n(this.aNZ - var3, this.aNK - var5, this.aOt - var7);
   }

   public float xC() {
      float var1 = 1.62F;
      if (this.zV()) {
         var1 = 0.2F;
      }

      if (M.cg.ce.af()) {
         var1 -= (float)(0.07999999821186066D * this.yb().auf());
      } else if (this.hI()) {
         var1 -= 0.08F;
      }

      return var1;
   }

   public boolean FM() {
      return this.bdH != null;
   }

   public int zx() {
      return this.bdM.zx();
   }

   public void xK() {
      if (!this.vR.bXF && this.hI()) {
         this.u((zk)null);
         this.ae(false);
      } else {
         double var1 = this.aNZ;
         double var3 = this.aNK;
         double var5 = this.aOt;
         float var7 = this.aOn;
         float var8 = this.aNN;
         super.xK();
         this.bdE = this.bep;
         this.bep = 0.0F;
         this.m(this.aNZ - var1, this.aNK - var3, this.aOt - var5);
         if (this.aNP instanceof Dc) {
            this.aNN = var8;
            this.aOn = var7;
            this.aQB = ((Dc)this.aNP).aQB;
         }
      }

   }

   public float zR() {
      return (float)this.q(zR.aSd).Bs();
   }

   public GX[] xM() {
      return this.bdM.bfs;
   }

   public String bY() {
      return this.bdw.getName();
   }

   public float b(cv var1) {
      float var2 = this.bdM.m(var1);
      if (var2 > 1.0F) {
         int var3 = yS.p(this);
         GX var4 = this.bdM.GE();
         if (var3 > 0 && var4 != null) {
            var2 += (float)(var3 * var3 + 1);
         }
      }

      if (this.q(LG.bCo)) {
         var2 *= 1.0F + (float)(this.w(LG.bCo).Oj() + 1) * 0.2F;
      }

      if (this.q(LG.bBV)) {
         float var5 = 1.0F;
         switch(this.w(LG.bBV).Oj()) {
         case 0:
            var5 = 0.3F;
            break;
         case 1:
            var5 = 0.09F;
            break;
         case 2:
            var5 = 0.0027F;
            break;
         case 3:
         default:
            var5 = 8.1E-4F;
         }

         var2 *= var5;
      }

      if (this.e(hn.zS) && !yS.s(this)) {
         var2 /= 5.0F;
      }

      if (!this.aNG) {
         var2 /= 5.0F;
      }

      return var2;
   }

   protected String zv() {
      return p.q[18684 & 180];
   }

   protected boolean zr() {
      return this.zA() <= 0.0F || this.zV();
   }

   public void w(DD var1, boolean var2) {
      if (var2) {
         this.bdM.q(var1.bdM);
         this.aC(var1.zA());
         this.bel = var1.bel;
         this.bet = var1.bet;
         this.bee = var1.bee;
         this.bdD = var1.bdD;
         this.eO(var1.FU());
         this.aOb = var1.aOb;
         this.aNF = var1.aNF;
         this.aNM = var1.aNM;
      } else if (this.vR.vU().bL(i.q[8890 & 2555])) {
         this.bdM.q(var1.bdM);
         this.bet = var1.bet;
         this.bee = var1.bee;
         this.bdD = var1.bdD;
         this.eO(var1.FU());
      }

      this.bdN = var1.bdN;
      this.bdY = var1.bdY;
      this.xG().e(10, Byte.valueOf(var1.xG().dy(10)));
   }

   public boolean e(DI var1) {
      return (this.xG().dy(10) & var1.Gv()) == var1.Gv();
   }

   public void aU(float var1) {
      if (!this.bdO.bfx && !this.vR.bXF) {
         this.bel.aU(var1);
      }

   }

   public boolean n(cv var1) {
      return this.bdM.A(var1);
   }

   public void eQ(int var1) {
      int var2 = this.FU();
      this.aNw.e(18, Integer.valueOf(var2 + var1));
   }

   public DG M(NW var1) {
      // $FF: Couldn't be decompiled
   }

   public boolean c(DD var1) {
      Mb var2 = this.zh();
      Mb var3 = var1.zh();
      return var2 == null || !var2.w(var3) || var2.Oz();
   }

   public GX FN() {
      return this.bdH;
   }

   public GameProfile mh() {
      return this.bdw;
   }

   public OT FO() {
      return this.bel;
   }

   public boolean FP() {
      return this.bei && this.bdL >= 100;
   }

   public void aA(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.xG().e(17, Float.valueOf(var1));
   }

   public void w(zk var1, int var2) {
      this.eQ(var2);
      Collection var3 = this.FL().q(LQ.bDK);
      if (var1 instanceof DD) {
         this.w(Nj.bKA);
         var3.addAll(this.FL().q(LQ.bDH));
         var3.addAll(this.R(var1));
      } else {
         this.w(Nj.bKn);
      }

      for(LW var5 : var3) {
         LS var6 = this.FL().e(this.bY(), var5);
         var6.Oq();
      }

   }

   public void q(Ra var1) {
   }

   protected String zC() {
      return p.q[16565 & -30529];
   }

   private void P(zk var1) {
      var1.u(this);
   }

   public void i(GX var1) {
   }

   public void FQ() {
      this.bdH = null;
      this.bdI = 0;
      if (!this.vR.bXF) {
         this.ai(false);
      }

   }

   public void q(byte var1) {
      if (var1 == 9) {
         this.FB();
      } else if (var1 == 23) {
         this.bdZ = false;
      } else if (var1 == 22) {
         this.bdZ = true;
      } else {
         super.q(var1);
      }

   }

   public void q(NR var1) {
   }

   public static UUID e(GameProfile var0) {
      UUID var1 = var0.getId();
      if (var1 == null) {
         var1 = bq(var0.getName());
      }

      return var1;
   }

   public NW FR() {
      return this.bdU;
   }

   public boolean FS() {
      return this.zA() > 0.0F && this.zA() < this.zE();
   }

   public int FT() {
      return this.bdI;
   }

   public void Q(zk var1) {
      if (var1.mD() && !var1.z(this)) {
         float var2 = (float)this.q(zR.aSb).Bs();
         int var3 = 0;
         float var4 = 0.0F;
         if (var1 instanceof zz) {
            var4 = yS.q(this.zg(), ((zz)var1).zM());
         } else {
            var4 = yS.q(this.zg(), zH.aRI);
         }

         var3 = var3 + yS.y(this);
         if (this.xf()) {
            ++var3;
         }

         if (var2 > 0.0F || var4 > 0.0F) {
            boolean var5 = this.aNI > 0.0F && !this.aNG && !this.yB() && !this.xg() && !this.q(LG.bCh) && this.aNP == null && var1 instanceof zz;
            if (var5 && var2 > 0.0F) {
               var2 *= 1.5F;
            }

            var2 = var2 + var4;
            boolean var6 = false;
            int var7 = yS.a(this);
            if (var1 instanceof zz && var7 > 0 && !var1.xL()) {
               var6 = true;
               var1.dG(1);
            }

            double var8 = var1.aOd;
            double var10 = var1.aOO;
            double var12 = var1.aOL;
            boolean var14 = var1.q(Oz.D(this), var2);
            if (var14) {
               if (var3 > 0) {
                  var1.z((double)(-Pq.bk(this.aOn * 3.1415927F / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(Pq.bi(this.aOn * 3.1415927F / 180.0F) * (float)var3 * 0.5F));
                  this.aOd *= 0.6D;
                  this.aOL *= 0.6D;
                  this.l(false);
               }

               if (var1 instanceof DH && var1.aNV) {
                  ((DH)var1).beK.t(new Kb(var1));
                  var1.aNV = false;
                  var1.aOd = var8;
                  var1.aOO = var10;
                  var1.aOL = var12;
               }

               boolean var15 = this.bed.J();
               if (var5 || var15 && this.bed.er.af()) {
                  this.t(var1);
               }

               if (var4 > 0.0F || var15 && this.bed.eu.af()) {
                  this.y(var1);
               }

               if (var2 >= 18.0F) {
                  this.w(MX.bIW);
               }

               this.I(var1);
               if (var1 instanceof zz) {
                  yS.q((zz)var1, this);
               }

               yS.w(this, var1);
               GX var16 = this.FD();
               Object var17 = var1;
               if (var1 instanceof Bp) {
                  zK var18 = ((Bp)var1).aWW;
                  if (var18 instanceof zz) {
                     var17 = (zz)var18;
                  }
               }

               if (var16 != null && var17 instanceof zz) {
                  var16.q((zz)var17, this);
                  if (var16.bsH <= 0) {
                     this.FG();
                  }
               }

               if (var1 instanceof zz) {
                  this.q(Nj.bKq, Math.round(var2 * 10.0F));
                  if (var7 > 0) {
                     var1.dG(var7 * 4);
                  }
               }

               this.aU(0.3F);
            } else if (var6) {
               var1.xi();
            }
         }
      }

   }

   public void n(double var1, double var3, double var5) {
      if (this.aNP == null) {
         if (this.e(hn.zS)) {
            int var7 = Math.round(Pq.B(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (var7 > 0) {
               this.q(Nj.bKo, var7);
               this.aU(0.015F * (float)var7 * 0.01F);
            }
         } else if (this.xg()) {
            int var8 = Math.round(Pq.B(var1 * var1 + var5 * var5) * 100.0F);
            if (var8 > 0) {
               this.q(Nj.bKj, var8);
               this.aU(0.015F * (float)var8 * 0.01F);
            }
         } else if (this.yB()) {
            if (var3 > 0.0D) {
               this.q(Nj.bKb, (int)Math.round(var3 * 100.0D));
            }
         } else if (this.aNG) {
            int var9 = Math.round(Pq.B(var1 * var1 + var5 * var5) * 100.0F);
            if (var9 > 0) {
               this.q(Nj.bKO, var9);
               if (this.xf()) {
                  this.q(Nj.bKS, var9);
                  this.aU(0.099999994F * (float)var9 * 0.01F);
               } else {
                  if (this.hI()) {
                     this.q(Nj.bKL, var9);
                  }

                  this.aU(0.01F * (float)var9 * 0.01F);
               }
            }
         } else {
            int var10 = Math.round(Pq.B(var1 * var1 + var5 * var5) * 100.0F);
            if (var10 > 25) {
               this.q(Nj.bJV, var10);
            }
         }
      }

   }

   public void yc() {
      this.d(0.6F, 1.8F);
      super.yc();
      this.aC(this.zE());
      this.aQT = 0;
   }

   public void eR(int var1) {
      this.bet += var1;
      if (this.bet < 0) {
         this.bet = 0;
         this.bdD = 0.0F;
         this.bee = 0;
      }

      if (var1 > 0 && this.bet % 5 == 0 && (float)this.beh < (float)this.aOa - 100.0F) {
         float var2 = this.bet > 30 ? 1.0F : (float)this.bet / 30.0F;
         this.vR.q((zk)this, p.q[-32566 & 10690], var2 * 0.75F, 1.0F);
         this.beh = this.aOa;
      }

   }

   public int FU() {
      return this.aNw.du(18);
   }

   public DD(QI var1, GameProfile var2) {
      super(var1);
      this.aOv = e(var2);
      this.bdw = var2;
      this.bdW = new EN(this.bdM, !var1.bXF, this);
      this.bdQ = this.bdW;
      NW var3 = var1.Zq();
      this.q((double)var3.aY() + 0.5D, (double)(var3.aX() + 1), (double)var3.KO() + 0.5D, 0.0F, 0.0F);
      this.aQQ = 180.0F;
      this.aOc = 20;
      aew var4 = aew.atw();
      if (var4.dmd) {
         this.ben = new agc(var4.dmf.dtf, var4.dmf.dte);
         this.bdX = (ab)var4.h(ab.class);
      }

      this.bed = (aq)var4.h(aq.class);
      this.ber = (aH)var4.h(aH.class);
   }

   public void hE() {
   }

   public void q(Qy var1) {
   }

   public void q(Nb var1, int var2) {
   }

   public void q(CX var1, EV var2) {
   }

   public void q(Nb var1) {
   }

   public void hv() {
      if (this instanceof DD) {
         this.q(this, this.ber.fW.br(), this.ber.fP.br());
      }

      this.aOm = this.hm();
      if (this.hm()) {
         this.aNG = false;
      }

      if (this.bdH != null) {
         GX var1 = this.bdM.GE();
         if (var1 == this.bdH) {
            if (this.bdI <= 25 && this.bdI % 4 == 0) {
               this.w(var1, 5);
            }

            if (--this.bdI == 0 && !this.vR.bXF) {
               this.FB();
            }
         } else {
            this.FQ();
         }
      }

      if (this.bdV > 0) {
         --this.bdV;
      }

      if (this.zV()) {
         ++this.bdL;
         if (this.bdL > 100) {
            this.bdL = 100;
         }

         if (!this.vR.bXF) {
            if (!this.FW()) {
               this.q(true, true, false);
            } else if (this.vR.ZH()) {
               this.q(false, true, true);
            }
         }
      } else if (this.bdL > 0) {
         ++this.bdL;
         if (this.bdL >= 110) {
            this.bdL = 0;
         }
      }

      super.hv();
      if (!this.vR.bXF && this.bdQ != null && !this.bdQ.q(this)) {
         this.hG();
         this.bdQ = this.bdW;
      }

      if (this.xL() && this.bdO.bfx) {
         this.xi();
      }

      this.bec = this.bdB;
      this.bdS = this.beq;
      this.bdC = this.beb;
      double var14 = this.aNZ - this.bdB;
      double var3 = this.aNK - this.beq;
      double var5 = this.aOt - this.beb;
      double var7 = 10.0D;
      if (var14 > var7) {
         this.bec = this.bdB = this.aNZ;
      }

      if (var5 > var7) {
         this.bdC = this.beb = this.aOt;
      }

      if (var3 > var7) {
         this.bdS = this.beq = this.aNK;
      }

      if (var14 < -var7) {
         this.bec = this.bdB = this.aNZ;
      }

      if (var5 < -var7) {
         this.bdC = this.beb = this.aOt;
      }

      if (var3 < -var7) {
         this.bdS = this.beq = this.aNK;
      }

      this.bdB += var14 * 0.25D;
      this.beb += var5 * 0.25D;
      this.beq += var3 * 0.25D;
      if (this.aNP == null) {
         this.bdF = null;
      }

      if (!this.vR.bXF) {
         this.bel.E(this);
         this.w(Nj.bJU);
         if (this.xV()) {
            this.w(Nj.bKm);
         }
      }

      int var9 = 29999999;
      double var10 = Pq.J(this.aNZ, -2.9999999E7D, 2.9999999E7D);
      double var12 = Pq.J(this.aOt, -2.9999999E7D, 2.9999999E7D);
      if (var10 != this.aNZ || var12 != this.aOt) {
         this.p(var10, this.aNK, var12);
      }

      if (this.ben != null && this.bdX.J()) {
         this.ben.C(this);
      }

   }

   private void m(double var1, double var3, double var5) {
      if (this.aNP != null) {
         int var7 = Math.round(Pq.B(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         if (var7 > 0) {
            if (this.aNP instanceof BF) {
               this.q(Nj.bKc, var7);
               if (this.bdF == null) {
                  this.bdF = new NW(this);
               } else if (this.bdF.M((double)Pq.D(this.aNZ), (double)Pq.D(this.aNK), (double)Pq.D(this.aOt)) >= 1000000.0D) {
                  this.w(MX.bJw);
               }
            } else if (this.aNP instanceof Bw) {
               this.q(Nj.bKd, var7);
            } else if (this.aNP instanceof Dc) {
               this.q(Nj.bJR, var7);
            } else if (this.aNP instanceof CX) {
               this.q(Nj.bJT, var7);
            }
         }
      }

   }

   public void w(Nb var1) {
      this.q(var1, 1);
   }

   private void z(OK var1) {
      // $FF: Couldn't be decompiled
   }

   public float zS() {
      return this.xG().dx(17);
   }

   public int FV() {
      return this.bet >= 30 ? 112 + (this.bet - 30) * 9 : (this.bet >= 15 ? 37 + (this.bet - 15) * 5 : 7 + this.bet * 2);
   }

   public static UUID bq(String var0) {
      return UUID.nameUUIDFromBytes((r.q[18004 & 4870] + var0).getBytes(Charsets.UTF_8));
   }

   public boolean i(DD var1) {
      if (!this.xZ()) {
         return false;
      } else if (var1.hm()) {
         return false;
      } else {
         Mb var2 = this.zh();
         return var2 == null || var1 == null || var1.zh() != var2 || !var2.OF();
      }
   }

   public void q(xw var1) {
   }

   public int xb() {
      return this.bdO.bfx ? 0 : 80;
   }

   protected void q(BD var1) {
      this.vR.p(var1);
   }

   public GX zg() {
      return this.bdM.GE();
   }

   private boolean FW() {
      return this.vR.g(this.bem).ds() == Ea.bgQ;
   }

   public int FX() {
      return this.bdL;
   }

   public void hu() {
      if (this.bdR > 0) {
         --this.bdR;
      }

      if (this.vR.Kq() == Qr.bWe && this.vR.vU().bL(i.q[-16132 & 8892])) {
         if (this.zA() < this.zE() && this.aOa % 20 == 0) {
            this.z(1.0F);
         }

         if (this.bel.Xh() && this.aOa % 10 == 0) {
            this.bel.gG(this.bel.KD() + 1);
         }
      }

      this.bdM.GD();
      this.bdE = this.bep;
      super.hu();
      Bj var1 = this.q(zR.aSd);
      if (!this.vR.bXF) {
         var1.h((double)this.bdO.GG());
      }

      this.aQv = this.bdz;
      if (this.xf()) {
         this.aQv = (float)((double)this.aQv + (double)this.bdz * 0.3D);
      }

      this.az((float)var1.Bs());
      float var2 = Pq.B(this.aOd * this.aOd + this.aOL * this.aOL);
      float var3 = (float)(Math.atan(-this.aOO * 0.20000000298023224D) * 15.0D);
      if (var2 > 0.1F) {
         var2 = 0.1F;
      }

      if (!this.aNG || this.zA() <= 0.0F) {
         var2 = 0.0F;
      }

      if (this.aNG || this.zA() <= 0.0F) {
         var3 = 0.0F;
      }

      this.bep += (var2 - this.bep) * 0.4F;
      this.aQU += (var3 - this.aQU) * 0.8F;
      if (this.zA() > 0.0F && !this.hm()) {
         NV var4 = null;
         if (this.aNP != null && !this.aNP.aNQ) {
            var4 = this.xE().y(this.aNP.xE()).C(1.0D, 0.0D, 1.0D);
         } else {
            var4 = this.xE().C(1.0D, 0.5D, 1.0D);
         }

         List var5 = this.vR.w(this, var4);

         for(int var6 = 0; var6 < var5.size(); ++var6) {
            zk var7 = (zk)var5.get(var6);
            if (!var7.aNQ) {
               this.P(var7);
            }
         }
      }

   }

   public BD w(GX var1, boolean var2) {
      return this.q(var1, false, false);
   }

   public void yo() {
      super.yo();
      this.bdW.b(this);
      if (this.bdQ != null) {
         this.bdQ.b(this);
      }

   }

   public void hy() {
   }

   protected boolean mG() {
      return !this.bdO.bfB;
   }

   public float FY() {
      int var1 = 0;

      for(GX var5 : this.bdM.bfs) {
         if (var5 != null) {
            ++var1;
         }
      }

      return (float)var1 / (float)this.bdM.bfs.length;
   }

   public void FZ() {
      if (this.bdH != null) {
         this.bdH.w(this.vR, this, this.bdI);
      }

      this.FQ();
   }

   public boolean Ga() {
      return this.bdv;
   }

   public boolean r(int var1, GX var2) {
      if (var1 >= 0 && var1 < this.bdM.bft.length) {
         this.bdM.y(var1, var2);
         return true;
      } else {
         int var3 = var1 - 100;
         if (var3 >= 0 && var3 < this.bdM.bfs.length) {
            int var5 = var3 + 1;
            if (var2 != null && var2.do1() != null) {
               if (var2.do1() instanceof FH) {
                  if (zx.x(var2) != var5) {
                     return false;
                  }
               } else if (var5 != 4 || var2.do1() != Et.bll && !(var2.do1() instanceof FO)) {
                  return false;
               }
            }

            this.bdM.y(var3 + this.bdM.bft.length, var2);
            return true;
         } else {
            int var4 = var1 - 200;
            if (var4 >= 0 && var4 < this.bdY.CB()) {
               this.bdY.y(var4, var2);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public OX dh() {
      Oo var1 = new Oo(LX.q(this.zh(), this.bY()));
      var1.Vw().q(new DW(DX.bgz, p.q[-32025 & 211] + this.bY() + q.q[25947 & 3022]));
      var1.Vw().q(this.yl());
      var1.Vw().dc(this.bY());
      return var1;
   }

   public float Gb() {
      // $FF: Couldn't be decompiled
   }

   public BD q(GX var1, boolean var2, boolean var3) {
      if (var1 == null) {
         return null;
      } else if (var1.bsH == 0) {
         return null;
      } else {
         double var4 = this.aNK - 0.30000001192092896D + (double)this.xC();
         BD var6 = new BD(this.vR, this.aNZ, var4, this.aOt, var1);
         var6.el(40);
         if (var3) {
            var6.bo(this.bY());
         }

         if (var2) {
            float var7 = this.oF.nextFloat() * 0.5F;
            float var8 = this.oF.nextFloat() * 3.1415927F * 2.0F;
            var6.aOd = (double)(-Pq.bk(var8) * var7);
            var6.aOL = (double)(Pq.bi(var8) * var7);
            var6.aOO = 0.20000000298023224D;
         } else {
            float var9 = 0.3F;
            var6.aOd = (double)(-Pq.bk(this.aOn / 180.0F * 3.1415927F) * Pq.bi(this.aNN / 180.0F * 3.1415927F) * var9);
            var6.aOL = (double)(Pq.bi(this.aOn / 180.0F * 3.1415927F) * Pq.bi(this.aNN / 180.0F * 3.1415927F) * var9);
            var6.aOO = (double)(-Pq.bk(this.aNN / 180.0F * 3.1415927F) * var9 + 0.1F);
            float var11 = this.oF.nextFloat() * 3.1415927F * 2.0F;
            var9 = 0.02F * this.oF.nextFloat();
            var6.aOd += Math.cos((double)var11) * (double)var9;
            var6.aOO += (double)((this.oF.nextFloat() - this.oF.nextFloat()) * 0.1F);
            var6.aOL += Math.sin((double)var11) * (double)var9;
         }

         this.q(var6);
         if (var3) {
            this.w(Nj.bKx);
         }

         return var6;
      }
   }

   public boolean hx() {
      return false;
   }

   public void t(HL var1) {
      super.t(var1);
      var1.w(i.q[864 & -23184], this.bdM.w(new HT()));
      var1.a(p.q[-32586 & 8382], this.bdM.bfu);
      var1.s(p.q[25847 & 2487], this.bei);
      var1.q(p.q[956 & -27463], (short)this.bdL);
      var1.q(p.q[27833 & 185], this.bdD);
      var1.a(p.q[-26118 & 16570], this.bet);
      var1.a(p.q[3835 & 8379], this.bee);
      var1.a(p.q[24767 & 2236], this.bdN);
      var1.a(q.q[-30785 & 445], this.FU());
      if (this.bdU != null) {
         var1.a(r.q[-31585 & 471], this.bdU.aY());
         var1.a(r.q[17113 & 12472], this.bdU.aX());
         var1.a(r.q[-15429 & 157], this.bdU.KO());
         var1.s(p.q[-32321 & 17085], this.bdv);
      }

      this.bel.G(var1);
      this.bdO.h(var1);
      var1.w(p.q[190 & 3838], this.bdY.Hi());
      GX var2 = this.bdM.GE();
      if (var2 != null && var2.do1() != null) {
         var1.w(p.q[-15681 & 11711], var2.z(new HL()));
      }

   }

   private Collection R(zk var1) {
      LX var2 = this.FL().co(this.bY());
      if (var2 != null) {
         int var3 = var2.Ox().WF();
         if (var3 >= 0 && var3 < LQ.bDG.length) {
            for(LW var5 : this.FL().q(LQ.bDG[var3])) {
               LS var6 = this.FL().e(var1.bY(), var5);
               var6.Oq();
            }
         }
      }

      LX var7 = this.FL().co(var1.bY());
      if (var7 != null) {
         int var8 = var7.Ox().WF();
         if (var8 >= 0 && var8 < LQ.bDL.length) {
            return this.FL().q(LQ.bDL[var8]);
         }
      }

      return Lists.newArrayList();
   }

   protected void aB(float var1) {
      this.bdM.aB(var1);
   }

   public GX dP(int var1) {
      return var1 == 0 ? this.bdM.GE() : this.bdM.bfs[var1 - 1];
   }

   public boolean S(zk var1) {
      if (this.hm()) {
         if (var1 instanceof EV) {
            this.q((EV)var1);
         }

         return false;
      } else {
         GX var2 = this.FD();
         GX var3 = var2 != null ? var2.HW() : null;
         if (!var1.y(this)) {
            if (var2 != null && var1 instanceof zz) {
               if (this.bdO.bfz) {
                  var2 = var3;
               }

               if (var2.q(this, (zz)var1)) {
                  if (var2.bsH <= 0 && !this.bdO.bfz) {
                     this.FG();
                  }

                  return true;
               }
            }

            return false;
         } else {
            if (var2 != null && var2 == this.FD()) {
               if (var2.bsH <= 0 && !this.bdO.bfz) {
                  this.FG();
               } else if (var2.bsH < var3.bsH && this.bdO.bfz) {
                  var2.bsH = var3.bsH;
               }
            }

            return true;
         }
      }
   }

   public void e(GX var1, int var2) {
      if (var1 != this.bdH) {
         this.bdH = var1;
         this.bdI = var2;
         if (!this.vR.bXF) {
            this.ai(true);
         }
      }

   }

   protected String xD() {
      return p.q[7343 & 191];
   }

   public boolean w(QC var1) {
      if (var1.isEmpty()) {
         return true;
      } else {
         GX var2 = this.FD();
         return var2 != null && var2.HS() && var2.tg().equals(var1.Zk());
      }
   }

   public void zX() {
      super.zX();
      this.w(Nj.bKK);
      if (this.xf()) {
         this.aU(0.8F);
      } else {
         this.aU(0.2F);
      }

   }

   protected boolean zt() {
      return true;
   }

   protected void mC() {
      super.mC();
      this.aNw.w(16, Byte.valueOf((byte)0));
      this.aNw.w(17, Float.valueOf(0.0F));
      this.aNw.w(18, Integer.valueOf(0));
      this.aNw.w(10, Byte.valueOf((byte)0));
   }

   public boolean bm(boolean var1) {
      return (var1 || this.bel.Xh()) && !this.bdO.bfx;
   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else if (this.bdO.bfx && !var1.WA()) {
         return false;
      } else {
         this.aQw = 0;
         if (this.zA() <= 0.0F) {
            return false;
         } else {
            if (this.zV() && !this.vR.bXF) {
               this.q(true, true, false);
            }

            if (var1.Wp()) {
               if (this.vR.Kq() == Qr.bWe) {
                  var2 = 0.0F;
               }

               if (this.vR.Kq() == Qr.bWf) {
                  var2 = var2 / 2.0F + 1.0F;
               }

               if (this.vR.Kq() == Qr.bWh) {
                  var2 = var2 * 3.0F / 2.0F;
               }
            }

            if (var2 == 0.0F) {
               return false;
            } else {
               zk var3 = var1.Wv();
               if (var3 instanceof DM && ((DM)var3).bfF != null) {
                  var3 = ((DM)var3).bfF;
               }

               return super.q(var1, var2);
            }
         }
      }
   }

   public int yf() {
      return 10;
   }

   public boolean yg() {
      return true;
   }

   public void q(boolean var1, boolean var2, boolean var3) {
      this.d(0.6F, 1.8F);
      hI var4 = this.vR.g(this.bem);
      if (this.bem != null && var4.ds() == Ea.bgQ) {
         this.vR.q(this.bem, var4.q(cO.nT, Boolean.valueOf(false)), 4);
         NW var5 = cO.w(this.vR, this.bem, 0);
         if (var5 == null) {
            var5 = this.bem.Vi();
         }

         this.p((double)((float)var5.aY() + 0.5F), (double)((float)var5.aX() + 0.1F), (double)((float)var5.KO() + 0.5F));
      }

      this.bei = false;
      if (!this.vR.bXF && var2) {
         this.vR.ZF();
      }

      this.bdL = var1 ? 0 : 100;
      if (var3) {
         this.q(this.bem, false);
      }

   }

   public void q(String var1, float var2, float var3) {
      this.vR.q(this, var1, var2, var3);
   }

   public void d(zz var1) {
      if (var1 instanceof CP) {
         this.w(MX.bIP);
      }

      zw var2 = (zw)zv.aPs.get(Integer.valueOf(zv.E(var1)));
      if (var2 != null) {
         this.w(var2.aPv);
      }

   }

   protected void w(Oz var1, float var2) {
      if (!this.q(var1)) {
         if (!var1.Wu() && this.FH() && var2 > 0.0F) {
            var2 = (1.0F + var2) * 0.5F;
         }

         var2 = this.r(var1, var2);
         var2 = this.e(var1, var2);
         float var3 = var2;
         var2 = Math.max(var2 - this.zS(), 0.0F);
         this.aA(this.zS() - (var3 - var2));
         if (var2 != 0.0F) {
            this.aU(var1.Wn());
            float var4 = this.zA();
            this.aC(this.zA() - var2);
            this.zN().q(var1, var4, var2);
            if (var2 < 3.4028235E37F) {
               this.q(Nj.bKT, Math.round(var2 * 10.0F));
            }
         }
      }

   }

   public void xJ() {
      if (!this.bdO.bfB) {
         super.xJ();
      }

   }
}
