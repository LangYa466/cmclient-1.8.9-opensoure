import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public abstract class zz extends zk {
   public float aPW;
   private final GX[] aPX = new GX[5];
   public float aPY;
   protected int aPZ;
   private Bh aQa;
   protected double aQb;
   protected float aQc;
   protected float aQd;
   private boolean aQe = true;
   public float TM;
   public int aQf;
   private static final Bf aQg;
   public boolean aQh;
   private zz aQi;
   public float aQj;
   public int aQk;
   protected int aQl;
   public int aQm = 20;
   private float aQn;
   private static final UUID aQo = UUID.fromString(a.q[-30499 & 669]);
   private int aQp;
   protected double aQq;
   public int aQr;
   private int aQs;
   protected DD aQt;
   public float aQu;
   public float aQv = 0.02F;
   protected int aQw;
   private final Ox aQx = new Ox(this);
   public float aQy;
   protected boolean aQz;
   public float aQA;
   public float aQB;
   protected float aQC;
   public float aQD;
   protected double aQE;
   protected boolean aQF;
   private zz aQG;
   public float aQH;
   protected float aQI;
   protected double aQJ;
   public float aQK;
   protected float aQL;
   public float aQM;
   private final Map aQN = Maps.newHashMap();
   private float aQO;
   public float aQP;
   protected float aQQ;
   public int aQR;
   public float aQS;
   public int aQT;
   public float aQU;
   protected double aQV;
   private int aQW;
   public float aQX;
   protected int aQY;
   protected float aQZ;

   public boolean zq() {
      return this.zM() == zH.aRJ;
   }

   public boolean yg() {
      return false;
   }

   protected boolean zr() {
      return this.zA() <= 0.0F;
   }

   public abstract GX dP(int var1);

   public void xp() {
      this.aQf = this.aQr = 10;
      this.aQH = 0.0F;
   }

   public Bj q(Bi var1) {
      return this.Ag().w(var1);
   }

   protected void zs() {
      int var1 = this.zz();
      if (this.aQh) {
         ++this.aQR;
         if (this.aQR >= var1) {
            this.aQR = 0;
            this.aQh = false;
         }
      } else {
         this.aQR = 0;
      }

      this.TM = (float)this.aQR / (float)var1;
   }

   protected String dR(int var1) {
      return var1 > 4 ? a.q[247 & 3229] : a.q[13495 & 2462];
   }

   public void aA(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.aQO = var1;
   }

   protected boolean zt() {
      return false;
   }

   protected void q(LJ var1) {
      this.aQe = true;
      if (!this.vR.bXF) {
         LG.bCg[var1.Od()].q(this, this.Ag(), var1.Oj());
      }

   }

   public boolean q(LG var1) {
      return this.aQN.containsKey(Integer.valueOf(var1.bCA));
   }

   public void r(HL var1) {
      this.aA(var1.bR(a.q[1167 & 14479]));
      if (var1.d(a.q[-28460 & 8336], 9) && this.vR != null && !this.vR.bXF) {
         zR.q(this.Ag(), var1.s(a.q[26841 & 1426], 10));
      }

      if (var1.d(a.q[4757 & 145], 9)) {
         HT var2 = var1.s(a.q[6297 & 145], 10);

         for(int var3 = 0; var3 < var2.II(); ++var3) {
            HL var4 = var2.fv(var3);
            LJ var5 = LJ.A(var4);
            if (var5 != null) {
               this.aQN.put(Integer.valueOf(var5.Od()), var5);
            }
         }
      }

      if (var1.d(a.q[22667 & 139], 99)) {
         this.aC(var1.bR(a.q[19103 & 8651]));
      } else {
         HE var6 = var1.bP(w.q[31083 & 297]);
         if (var6 == null) {
            this.aC(this.zE());
         } else if (var6.Iz() == 5) {
            this.aC(((HQ)var6).br());
         } else if (var6.Iz() == 2) {
            this.aC((float)((HV)var6).IB());
         }
      }

      this.aQf = var1.bI(a.q[24975 & 2204]);
      this.aQT = var1.bI(a.q[9151 & -16242]);
      this.aQW = var1.bQ(a.q[2701 & 25805]);
   }

   protected void hK() {
   }

   protected void zu() {
      this.aNw.e(8, Byte.valueOf((byte)0));
      this.aNw.e(7, Integer.valueOf(0));
   }

   public boolean yp() {
      return false;
   }

   public void q(zk var1, float var2, double var3, double var5) {
      if (this.oF.nextDouble() >= this.q(zR.aSc).Bs()) {
         this.aOQ = true;
         float var7 = Pq.B(var3 * var3 + var5 * var5);
         float var8 = 0.4F;
         this.aOd /= 2.0D;
         this.aOO /= 2.0D;
         this.aOL /= 2.0D;
         this.aOd -= var3 / (double)var7 * (double)var8;
         this.aOO += (double)var8;
         this.aOL -= var5 / (double)var7 * (double)var8;
         if (this.aOO > 0.4000000059604645D) {
            this.aOO = 0.4000000059604645D;
         }
      }

   }

   protected String zv() {
      return a.q[2195 & 723];
   }

   protected float zw() {
      return 1.0F;
   }

   public int zx() {
      int var1 = 0;

      for(GX var5 : this.xM()) {
         if (var5 != null && var5.do1() instanceof FH) {
            int var6 = ((FH)var5.do1()).brr;
            var1 += var6;
         }
      }

      return var1;
   }

   public void xK() {
      super.xK();
      this.aQI = this.aQc;
      this.aQc = 0.0F;
      this.aNI = 0.0F;
   }

   public void hv() {
      super.hv();
      if (!this.vR.bXF) {
         int var1 = this.zF();
         if (var1 > 0) {
            if (this.aQk <= 0) {
               this.aQk = 20 * (30 - var1);
            }

            --this.aQk;
            if (this.aQk <= 0) {
               this.dU(var1 - 1);
            }
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            GX var3 = this.aPX[var2];
            GX var4 = this.dP(var2);
            if (!GX.t(var4, var3)) {
               ((QU)this.vR).aaj().q(this, new JM(this.yi(), var2, var4));
               if (var3 != null) {
                  this.aQa.q(var3.Il());
               }

               if (var4 != null) {
                  this.aQa.w(var4.Il());
               }

               this.aPX[var2] = var4 == null ? null : var4.HW();
            }
         }

         if (this.aOa % 20 == 0) {
            this.zN().pK();
         }
      }

      this.hu();
      double var9 = this.aNZ - this.aOf;
      double var10 = this.aOt - this.aNW;
      float var5 = (float)(var9 * var9 + var10 * var10);
      float var6 = this.aQB;
      float var7 = 0.0F;
      this.aQI = this.aQc;
      float var8 = 0.0F;
      if (var5 > 0.0025000002F) {
         var8 = 1.0F;
         var7 = (float)Math.sqrt((double)var5) * 3.0F;
         var6 = (float)Pq.u(var10, var9) * 180.0F / 3.1415927F - 90.0F;
      }

      if (this.TM > 0.0F) {
         var6 = this.aOn;
      }

      if (!this.aNG) {
         var8 = 0.0F;
      }

      this.aQc += (var8 - this.aQc) * 0.3F;
      this.vR.bXK.cf(a.q[17335 & 5271]);
      var7 = this.l(var6, var7);
      this.vR.bXK.Ol();
      this.vR.bXK.cf(a.q[12440 & -32360]);

      while(this.aOn - this.aOF < -180.0F) {
         this.aOF -= 360.0F;
      }

      while(this.aOn - this.aOF >= 180.0F) {
         this.aOF += 360.0F;
      }

      while(this.aQB - this.aQS < -180.0F) {
         this.aQS -= 360.0F;
      }

      while(this.aQB - this.aQS >= 180.0F) {
         this.aQS += 360.0F;
      }

      while(this.aNN - this.aOr < -180.0F) {
         this.aOr -= 360.0F;
      }

      while(this.aNN - this.aOr >= 180.0F) {
         this.aOr += 360.0F;
      }

      while(this.aQu - this.aQj < -180.0F) {
         this.aQj -= 360.0F;
      }

      while(this.aQu - this.aQj >= 180.0F) {
         this.aQj += 360.0F;
      }

      this.vR.bXK.Ol();
      this.aQZ += var7;
   }

   protected void F(zk var1) {
      var1.x(this);
   }

   public void hB() {
      if (!this.aQh || this.aQR >= this.zz() / 2 || this.aQR < 0) {
         this.aQR = -1;
         this.aQh = true;
         if (this.vR instanceof QU) {
            ((QU)this.vR).aaj().q(this, new JU(this, 0));
         }
      }

   }

   protected void zy() {
      List var1 = this.vR.q(this, this.xE().C(0.20000000298023224D, 0.0D, 0.20000000298023224D), Predicates.and(OD.bPV, new zA(this)));
      if (!var1.isEmpty()) {
         for(int var2 = 0; var2 < var1.size(); ++var2) {
            zk var3 = (zk)var1.get(var2);
            this.F(var3);
         }
      }

   }

   public void au(float var1) {
      this.aQB = var1;
   }

   private int zz() {
      return this.q(LG.bCo) ? 6 - (1 + this.w(LG.bCo).Oj()) * 1 : (this.q(LG.bBV) ? 6 + (1 + this.w(LG.bBV).Oj()) * 2 : 6);
   }

   public final float zA() {
      return this.aNw.dx(6);
   }

   protected int p(DD var1) {
      return 0;
   }

   protected int dS(int var1) {
      int var2 = yS.l(this);
      return var2 > 0 && this.oF.nextInt(var2 + 1) > 0 ? var1 : var1 - 1;
   }

   public void yn() {
      this.q(Oz.bPA, Float.MAX_VALUE);
   }

   protected float l(float var1, float var2) {
      float var3 = Pq.bl(var1 - this.aQB);
      this.aQB += var3 * 0.3F;
      float var4 = Pq.bl(this.aOn - this.aQB);
      boolean var5 = var4 < -90.0F || var4 >= 90.0F;
      if (var4 < -75.0F) {
         var4 = -75.0F;
      }

      if (var4 >= 75.0F) {
         var4 = 75.0F;
      }

      this.aQB = this.aOn - var4;
      if (var4 * var4 > 2500.0F) {
         this.aQB += var4 * 0.2F;
      }

      if (var5) {
         var2 *= -1.0F;
      }

      return var2;
   }

   public zz(QI var1) {
      super(var1);
      this.yJ();
      this.aC(this.zE());
      this.aOM = true;
      this.aQM = (float)((Math.random() + 1.0D) * 0.009999999776482582D);
      this.p(this.aNZ, this.aNK, this.aOt);
      this.aQP = (float)Math.random() * 12398.0F;
      this.aOn = (float)(Math.random() * 3.141592653589793D * 2.0D);
      this.aQu = this.aOn;
      this.aNC = 0.6F;
   }

   public void l(boolean var1) {
      super.l(var1);
      Bj var2 = this.q(zR.aSd);
      if (var2.t(aQo) != null) {
         var2.r(aQg);
      }

      if (var1) {
         var2.e(aQg);
      }

   }

   public void dT(int var1) {
      this.aQN.remove(Integer.valueOf(var1));
   }

   protected void mC() {
      this.aNw.w(7, Integer.valueOf(0));
      this.aNw.w(8, Byte.valueOf((byte)0));
      this.aNw.w(9, Byte.valueOf((byte)0));
      this.aNw.w(6, Float.valueOf(1.0F));
   }

   protected void zB() {
      this.aOO += 0.03999999910593033D;
   }

   public void w(Oz var1) {
      zk var2 = var1.Wv();
      zz var3 = this.Ac();
      if (this.aQl >= 0 && var3 != null) {
         var3.w(this, this.aQl);
      }

      if (var2 != null) {
         var2.d(this);
      }

      this.aQz = true;
      this.zN().pK();
      if (!this.vR.bXF) {
         int var4 = 0;
         if (var2 instanceof DD) {
            var4 = yS.t((zz)var2);
         }

         if (this.Ae() && this.vR.vU().bL(r.q[-23633 & 7165])) {
            this.r(this.aQY > 0, var4);
            this.e(this.aQY > 0, var4);
            if (this.aQY > 0 && this.oF.nextFloat() < 0.025F + (float)var4 * 0.01F) {
               this.zP();
            }
         }
      }

      this.vR.q(this, (byte)3);
   }

   protected String zC() {
      return a.q[14742 & -30980];
   }

   public PX yd() {
      return this.l(1.0F);
   }

   protected void aB(float var1) {
   }

   protected void zD() {
      Iterator var1 = this.aQN.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         LJ var3 = (LJ)this.aQN.get(var2);
         if (!var3.v(this)) {
            if (!this.vR.bXF) {
               var1.remove();
               this.q(var3);
            }
         } else if (var3.EW() % 600 == 0) {
            this.q(var3, false);
         }
      }

      if (this.aQe) {
         if (!this.vR.bXF) {
            this.zT();
         }

         this.aQe = false;
      }

      int var11 = this.aNw.du(7);
      boolean var12 = this.aNw.dy(8) > 0;
      if (var11 > 0) {
         boolean var4 = false;
         if (!this.xZ()) {
            var4 = this.oF.nextBoolean();
         } else {
            var4 = this.oF.nextInt(15) == 0;
         }

         if (var12) {
            var4 &= this.oF.nextInt(5) == 0;
         }

         if (var4 && var11 > 0) {
            double var5 = (double)(var11 >> 16 & 255) / 255.0D;
            double var7 = (double)(var11 >> 8 & 255) / 255.0D;
            double var9 = (double)(var11 >> 0 & 255) / 255.0D;
            this.vR.q(var12 ? OP.bRA : OP.bRz, this.aNZ + (this.oF.nextDouble() - 0.5D) * (double)this.gK, this.aNK + this.oF.nextDouble() * (double)this.gJ, this.aOt + (this.oF.nextDouble() - 0.5D) * (double)this.gK, var5, var7, var9);
         }
      }

   }

   public boolean w(LJ var1) {
      if (this.zM() == zH.aRJ) {
         int var2 = var1.Od();
         if (var2 == LG.bCJ.bCA || var2 == LG.bCp.bCA) {
            return false;
         }
      }

      return true;
   }

   public void z(float var1) {
      float var2 = this.zA();
      if (var2 > 0.0F) {
         this.aC(var2 + var1);
      }

   }

   public abstract GX zg();

   public void e(zk var1, int var2) {
      if (!var1.aNQ && !this.vR.bXF) {
         zE var3 = ((QU)this.vR).aaj();
         if (var1 instanceof BD) {
            var3.q(var1, new JW(var1.yi(), this.yi()));
         }

         if (var1 instanceof DM) {
            var3.q(var1, new JW(var1.yi(), this.yi()));
         }

         if (var1 instanceof BR) {
            var3.q(var1, new JW(var1.yi(), this.yi()));
         }
      }

   }

   protected float e(Oz var1, float var2) {
      if (var1.Wz()) {
         return var2;
      } else {
         if (this.q(LG.bCu) && var1 != Oz.bPA) {
            int var3 = (this.w(LG.bCu).Oj() + 1) * 5;
            int var4 = 25 - var3;
            float var5 = var2 * (float)var4;
            var2 = var5 / 25.0F;
         }

         if (var2 <= 0.0F) {
            return 0.0F;
         } else {
            int var6 = yS.q(this.xM(), var1);
            if (var6 > 20) {
               var6 = 20;
            }

            if (var6 > 0 && var6 <= 20) {
               int var7 = 25 - var6;
               float var8 = var2 * (float)var7;
               var2 = var8 / 25.0F;
            }

            return var2;
         }
      }
   }

   public final void dU(int var1) {
      this.aNw.e(9, Byte.valueOf((byte)var1));
   }

   protected void r(boolean var1, int var2) {
   }

   public final float zE() {
      return (float)this.q(zR.aSa).Bs();
   }

   public final int zF() {
      return this.aNw.dy(9);
   }

   public void t(HL var1) {
      var1.q(a.q[16559 & -26981], this.zA());
      var1.q(w.q[5929 & 377], (short)((int)Math.ceil((double)this.zA())));
      var1.q(a.q[7054 & -7940], (short)this.aQf);
      var1.a(a.q[18061 & 2205], this.aQW);
      var1.q(a.q[2766 & 25999], (short)this.aQT);
      var1.q(a.q[10415 & 4767], this.zS());

      for(GX var5 : this.xM()) {
         if (var5 != null) {
            this.aQa.q(var5.Il());
         }
      }

      var1.w(a.q[157 & -23920], zR.q(this.Ag()));

      for(GX var12 : this.xM()) {
         if (var12 != null) {
            this.aQa.w(var12.Il());
         }
      }

      if (!this.aQN.isEmpty()) {
         HT var7 = new HT();

         for(LJ var11 : this.aQN.values()) {
            var7.q(var11.B(new HL()));
         }

         var1.w(a.q[8593 & 17553], var7);
      }

   }

   protected void xI() {
      this.q(Oz.bPA, 4.0F);
   }

   public void dV(int var1) {
      LJ var2 = (LJ)this.aQN.remove(Integer.valueOf(var1));
      if (var2 != null) {
         this.q(var2);
      }

   }

   public void zG() {
   }

   protected void zH() {
      this.aOO += 0.03999999910593033D;
   }

   public Collection zI() {
      return this.aQN.values();
   }

   public void aC(float var1) {
      this.aNw.e(6, Float.valueOf(Pq.n(var1, 0.0F, this.zE())));
   }

   protected void w(Oz var1, float var2) {
      if (!this.q(var1)) {
         var2 = this.r(var1, var2);
         var2 = this.e(var1, var2);
         float var3 = var2;
         var2 = Math.max(var2 - this.zS(), 0.0F);
         this.aA(this.zS() - (var3 - var2));
         if (var2 != 0.0F) {
            float var4 = this.zA();
            this.aC(var4 - var2);
            this.zN().q(var1, var4, var2);
            this.aA(this.zS() - var2);
         }
      }

   }

   public zz zJ() {
      return this.aQG;
   }

   public boolean g(zz var1) {
      return this.q(var1.zh());
   }

   protected void zK() {
      this.aQe = true;
   }

   public void h(zz var1) {
      this.aQi = var1;
      this.aQW = this.aOa;
   }

   public boolean xl() {
      return !this.aNQ;
   }

   public void G(zk var1) {
      double var2 = var1.aNZ;
      double var4 = var1.xE().bNT + (double)var1.gJ;
      double var6 = var1.aOt;
      byte var8 = 1;

      for(int var9 = -var8; var9 <= var8; ++var9) {
         for(int var10 = -var8; var10 < var8; ++var10) {
            if (var9 != 0 || var10 != 0) {
               int var11 = (int)(this.aNZ + (double)var9);
               int var12 = (int)(this.aOt + (double)var10);
               NV var13 = this.xE().D((double)var9, 1.0D, (double)var10);
               if (this.vR.i(var13).isEmpty()) {
                  if (QI.c(this.vR, new NW(var11, (int)this.aNK, var12))) {
                     this.l(this.aNZ + (double)var9, this.aNK + 1.0D, this.aOt + (double)var10);
                     return;
                  }

                  if (QI.c(this.vR, new NW(var11, (int)this.aNK - 1, var12)) || this.vR.g(new NW(var11, (int)this.aNK - 1, var12)).ds().cB() == hn.zS) {
                     var2 = this.aNZ + (double)var9;
                     var4 = this.aNK + 1.0D;
                     var6 = this.aOt + (double)var10;
                  }
               }
            }
         }
      }

      this.l(var2, var4, var6);
   }

   public boolean zL() {
      return false;
   }

   public void at(float var1) {
      this.aQu = var1;
   }

   public zH zM() {
      return zH.aRI;
   }

   public abstract GX dQ(int var1);

   protected void q(double var1, boolean var3, cv var4, NW var5) {
      if (!this.xg()) {
         this.xz();
      }

      if (!this.vR.bXF && this.aNI > 3.0F && var3) {
         hI var6 = this.vR.g(var5);
         cv var7 = var6.ds();
         float var8 = (float)Pq.bf(this.aNI - 3.0F);
         if (var7.cB() != hn.zp) {
            double var9 = (double)Math.min(0.2F + var8 / 15.0F, 10.0F);
            if (var9 > 2.5D) {
               var9 = 2.5D;
            }

            int var11 = (int)(150.0D * var9);
            ((QU)this.vR).q(OP.bRW, this.aNZ, this.aNK, this.aOt, var11, 0.0D, 0.0D, 0.0D, 0.15000000596046448D, cv.i(var6));
         }
      }

      super.q(var1, var3, var4, var5);
   }

   public Ox zN() {
      return this.aQx;
   }

   public void zO() {
   }

   protected void zP() {
   }

   public boolean q(Mb var1) {
      return this.zh() != null ? this.zh().w(var1) : false;
   }

   public void q(byte var1) {
      if (var1 == 2) {
         this.aQX = 1.5F;
         this.aNz = this.aQm;
         this.aQf = this.aQr = 10;
         this.aQH = 0.0F;
         String var2 = this.zv();
         if (var2 != null) {
            this.q(this.zv(), this.zw(), (this.oF.nextFloat() - this.oF.nextFloat()) * 0.2F + 1.0F);
         }

         this.q(Oz.bPI, 0.0F);
      } else if (var1 == 3) {
         String var3 = this.zC();
         if (var3 != null) {
            this.q(this.zC(), this.zw(), (this.oF.nextFloat() - this.oF.nextFloat()) * 0.2F + 1.0F);
         }

         this.aC(0.0F);
         this.w(Oz.bPI);
      } else {
         super.q(var1);
      }

   }

   protected float zQ() {
      return 0.42F;
   }

   public float zR() {
      return this.aQn;
   }

   public float zS() {
      return this.aQO;
   }

   public LJ w(LG var1) {
      return (LJ)this.aQN.get(Integer.valueOf(var1.bCA));
   }

   protected void zT() {
      if (this.aQN.isEmpty()) {
         this.zu();
         this.L(false);
      } else {
         int var1 = LM.e(this.aQN.values());
         this.aNw.e(8, Byte.valueOf((byte)(LM.r(this.aQN.values()) ? 1 : 0)));
         this.aNw.e(7, Integer.valueOf(var1));
         this.L(this.dW(LG.bCb.bCA));
      }

   }

   public zz zU() {
      return this.aQi;
   }

   public boolean zV() {
      return false;
   }

   public float aD(float var1) {
      float var2 = this.TM - this.aQy;
      if (var2 < 0.0F) {
         ++var2;
      }

      return this.aQy + var2 * var1;
   }

   public boolean yB() {
      int var1 = Pq.D(this.aNZ);
      int var2 = Pq.D(this.xE().bNT);
      int var3 = Pq.D(this.aOt);
      cv var4 = this.vR.g(new NW(var1, var2, var3)).ds();
      return (var4 == Ea.bjK || var4 == Ea.bhV) && (!(this instanceof DD) || !((DD)this).hm());
   }

   public boolean H(zk var1) {
      this.I(var1);
      return false;
   }

   public void k(float var1, float var2) {
      if (this.hC()) {
         if (!this.xg() || this instanceof DD && ((DD)this).bdO.bfB) {
            if (!this.xd() || this instanceof DD && ((DD)this).bdO.bfB) {
               float var9 = 0.91F;
               if (this.aNG) {
                  var9 = this.vR.g(new NW(Pq.D(this.aNZ), Pq.D(this.xE().bNT) - 1, Pq.D(this.aOt))).ds().mX * 0.91F;
               }

               float var4 = 0.16277136F / (var9 * var9 * var9);
               float var12;
               if (this.aNG) {
                  var12 = this.zR() * var4;
               } else {
                  var12 = this.aQv;
               }

               this.g(var1, var2, var12);
               var9 = 0.91F;
               if (this.aNG) {
                  var9 = this.vR.g(new NW(Pq.D(this.aNZ), Pq.D(this.xE().bNT) - 1, Pq.D(this.aOt))).ds().mX * 0.91F;
               }

               if (this.yB()) {
                  float var14 = 0.15F;
                  this.aOd = Pq.J(this.aOd, (double)(-var14), (double)var14);
                  this.aOL = Pq.J(this.aOL, (double)(-var14), (double)var14);
                  this.aNI = 0.0F;
                  if (this.aOO < -0.15D) {
                     this.aOO = -0.15D;
                  }

                  boolean var15 = this.hI() && this instanceof DD;
                  if (var15 && this.aOO < 0.0D) {
                     this.aOO = 0.0D;
                  }
               }

               this.h(this.aOd, this.aOO, this.aOL);
               if (this.aNB && this.yB()) {
                  this.aOO = 0.2D;
               }

               if (this.vR.bXF && (!this.vR.ao(new NW((int)this.aNZ, 0, (int)this.aOt)) || !this.vR.aB(new NW((int)this.aNZ, 0, (int)this.aOt)).abR())) {
                  if (this.aNK > 0.0D) {
                     this.aOO = -0.1D;
                  } else {
                     this.aOO = 0.0D;
                  }
               } else {
                  this.aOO -= 0.08D;
               }

               this.aOO *= 0.9800000190734863D;
               this.aOd *= (double)var9;
               this.aOL *= (double)var9;
            } else {
               double var8 = this.aNK;
               this.g(var1, var2, 0.02F);
               this.h(this.aOd, this.aOO, this.aOL);
               this.aOd *= 0.5D;
               this.aOO *= 0.5D;
               this.aOL *= 0.5D;
               this.aOO -= 0.02D;
               if (this.aNB && this.g(this.aOd, this.aOO + 0.6000000238418579D - this.aNK + var8, this.aOL)) {
                  this.aOO = 0.30000001192092896D;
               }
            }
         } else {
            double var3 = this.aNK;
            float var5 = 0.8F;
            float var6 = 0.02F;
            float var7 = (float)yS.k(this);
            if (var7 > 3.0F) {
               var7 = 3.0F;
            }

            if (!this.aNG) {
               var7 *= 0.5F;
            }

            if (var7 > 0.0F) {
               var5 += (0.54600006F - var5) * var7 / 3.0F;
               var6 += (this.zR() * 1.0F - var6) * var7 / 3.0F;
            }

            this.g(var1, var2, var6);
            this.h(this.aOd, this.aOO, this.aOL);
            this.aOd *= (double)var5;
            this.aOO *= 0.800000011920929D;
            this.aOL *= (double)var5;
            this.aOO -= 0.02D;
            if (this.aNB && this.g(this.aOd, this.aOO + 0.6000000238418579D - this.aNK + var3, this.aOL)) {
               this.aOO = 0.30000001192092896D;
            }
         }
      }

      this.aQA = this.aQX;
      double var11 = this.aNZ - this.aOf;
      double var13 = this.aOt - this.aNW;
      float var16 = Pq.B(var11 * var11 + var13 * var13) * 4.0F;
      if (var16 > 1.0F) {
         var16 = 1.0F;
      }

      this.aQX += (var16 - this.aQX) * 0.4F;
      this.aQK += this.aQX;
   }

   public void zW() {
      Iterator var1 = this.aQN.keySet().iterator();

      while(var1.hasNext()) {
         Integer var2 = (Integer)var1.next();
         LJ var3 = (LJ)this.aQN.get(var2);
         if (!this.vR.bXF) {
            var1.remove();
            this.q(var3);
         }
      }

   }

   protected void zX() {
      this.aOO = (double)this.zQ();
      if (this.q(LG.bCm)) {
         this.aOO += (double)((float)(this.w(LG.bCm).Oj() + 1) * 0.1F);
      }

      if (this.xf()) {
         float var1 = this.aOn * 0.017453292F;
         this.aOd -= (double)(Pq.bk(var1) * 0.2F);
         this.aOL += (double)(Pq.bi(var1) * 0.2F);
      }

      this.aOQ = true;
   }

   public void f(float var1, float var2) {
      super.f(var1, var2);
      LJ var3 = this.w(LG.bCm);
      float var4 = var3 != null ? (float)(var3.Oj() + 1) : 0.0F;
      int var5 = Pq.bf((var1 - 3.0F - var4) * var2);
      if (var5 > 0) {
         this.q(this.dR(var5), 1.0F, 1.0F);
         this.q(Oz.bPo, (float)var5);
         int var6 = Pq.D(this.aNZ);
         int var7 = Pq.D(this.aNK - 0.20000000298023224D);
         int var8 = Pq.D(this.aOt);
         cv var9 = this.vR.g(new NW(var6, var7, var8)).ds();
         if (var9.cB() != hn.zp) {
            cB var10 = var9.nl;
            this.q(var10.dd(), var10.de() * 0.5F, var10.df() * 0.75F);
         }
      }

   }

   public Random zY() {
      return this.oF;
   }

   public void am(boolean var1) {
      this.aQF = var1;
   }

   public int zZ() {
      return this.aQp;
   }

   public int Aa() {
      return this.aQw;
   }

   public boolean xV() {
      return !this.aNQ && this.zA() > 0.0F;
   }

   static {
      aQg = (new Bf(aQo, a.q[17310 & -31554], 0.30000001192092896D, 2)).ao(false);
   }

   public abstract void q(int var1, GX var2);

   public void az(float var1) {
      this.aQn = var1;
   }

   protected void e(boolean var1, int var2) {
   }

   public int Ab() {
      return this.aQW;
   }

   public void u(zk var1) {
      if (this.aNP != null && var1 == null) {
         if (!this.vR.bXF) {
            this.G(this.aNP);
         }

         if (this.aNP != null) {
            this.aNP.aND = null;
         }

         this.aNP = null;
      } else {
         super.u(var1);
      }

   }

   public void xe() {
      this.aQy = this.TM;
      super.xe();
      this.vR.bXK.cf(a.q[-32614 & 13230]);
      boolean var1 = this instanceof DD;
      if (this.xV()) {
         if (this.xQ()) {
            this.q(Oz.bPB, 1.0F);
         } else if (var1 && !this.vR.wg().d(this.xE())) {
            double var2 = this.vR.wg().ad(this) + this.vR.wg().abw();
            if (var2 < 0.0D) {
               this.q(Oz.bPB, (float)Math.max(1, Pq.D(-var2 * this.vR.wg().abq())));
            }
         }
      }

      if (this.xa() || this.vR.bXF) {
         this.xi();
      }

      boolean var7 = var1 && ((DD)this).bdO.bfx;
      if (this.xV()) {
         if (this.e(hn.zS)) {
            if (!this.zL() && !this.dW(LG.bCI.bCA) && !var7) {
               this.dJ(this.dS(this.xn()));
               if (this.xn() == -20) {
                  this.dJ(0);

                  for(int var3 = 0; var3 < 8; ++var3) {
                     float var4 = this.oF.nextFloat() - this.oF.nextFloat();
                     float var5 = this.oF.nextFloat() - this.oF.nextFloat();
                     float var6 = this.oF.nextFloat() - this.oF.nextFloat();
                     this.vR.q(OP.bRo, this.aNZ + (double)var4, this.aNK + (double)var5, this.aOt + (double)var6, this.aOd, this.aOO, this.aOL);
                  }

                  this.q(Oz.bPH, 2.0F);
               }
            }

            if (!this.vR.bXF && this.xj() && this.aNP instanceof zz) {
               this.u((zk)null);
            }
         } else {
            this.dJ(300);
         }
      }

      if (this.xV() && this.xA()) {
         this.xi();
      }

      this.aPY = this.aQU;
      if (this.aQf > 0) {
         --this.aQf;
      }

      if (this.aNz > 0 && !(this instanceof DH)) {
         --this.aNz;
      }

      if (this.zA() <= 0.0F) {
         this.Af();
      }

      if (this.aQY > 0) {
         --this.aQY;
      } else {
         this.aQt = null;
      }

      if (this.aQG != null && !this.aQG.xV()) {
         this.aQG = null;
      }

      if (this.aQi != null) {
         if (!this.aQi.xV()) {
            this.h((zz)null);
         } else if (this.aOa - this.aQW > 100) {
            this.h((zz)null);
         }
      }

      this.zD();
      this.aQC = this.aQZ;
      this.aQS = this.aQB;
      this.aQj = this.aQu;
      this.aOF = this.aOn;
      this.aOr = this.aNN;
      this.vR.bXK.Ol();
   }

   public zz Ac() {
      return (zz)(this.aQx.Wb() != null ? this.aQx.Wb() : (this.aQt != null ? this.aQt : (this.aQi != null ? this.aQi : null)));
   }

   public void hu() {
      if (this.aQs > 0) {
         --this.aQs;
      }

      if (this.aPZ > 0) {
         double var1 = this.aNZ + (this.aQJ - this.aNZ) / (double)this.aPZ;
         double var3 = this.aNK + (this.aQq - this.aNK) / (double)this.aPZ;
         double var5 = this.aOt + (this.aQV - this.aOt) / (double)this.aPZ;
         double var7 = Pq.C(this.aQb - (double)this.aOn);
         this.aOn = (float)((double)this.aOn + var7 / (double)this.aPZ);
         this.aNN = (float)((double)this.aNN + (this.aQE - (double)this.aNN) / (double)this.aPZ);
         --this.aPZ;
         this.p(var1, var3, var5);
         this.g(this.aOn, this.aNN);
      } else if (!this.hC()) {
         this.aOd *= 0.98D;
         this.aOO *= 0.98D;
         this.aOL *= 0.98D;
      }

      if (Math.abs(this.aOd) < 0.005D) {
         this.aOd = 0.0D;
      }

      if (Math.abs(this.aOO) < 0.005D) {
         this.aOO = 0.0D;
      }

      if (Math.abs(this.aOL) < 0.005D) {
         this.aOL = 0.0D;
      }

      this.vR.bXK.cf(a.q[153 & 5595]);
      if (this.zr()) {
         this.aQF = false;
         this.aQD = 0.0F;
         this.aPW = 0.0F;
         this.aQd = 0.0F;
      } else if (this.hC()) {
         this.vR.bXK.cf(a.q[666 & 9466]);
         this.hK();
         this.vR.bXK.Ol();
      }

      this.vR.bXK.Ol();
      this.vR.bXK.cf(p.q[573 & -7362]);
      if (this.aQF) {
         if (this.xg()) {
            this.zH();
         } else if (this.xd()) {
            this.zB();
         } else if (this.aNG && this.aQs == 0) {
            this.zX();
            this.aQs = 10;
         }
      } else {
         this.aQs = 0;
      }

      this.vR.bXK.Ol();
      this.vR.bXK.cf(a.q[9375 & 21147]);
      this.aQD *= 0.98F;
      this.aPW *= 0.98F;
      this.aQd *= 0.9F;
      this.k(this.aQD, this.aPW);
      this.vR.bXK.Ol();
      this.vR.bXK.cf(a.q[26780 & 4765]);
      if (!this.vR.bXF) {
         this.zy();
      }

      this.vR.bXK.Ol();
   }

   public void I(zk var1) {
      if (var1 instanceof zz) {
         this.aQG = (zz)var1;
      } else {
         this.aQG = null;
      }

      this.aQp = this.aOa;
   }

   public void e(LJ var1) {
      if (this.w(var1)) {
         if (this.aQN.containsKey(Integer.valueOf(var1.Od()))) {
            ((LJ)this.aQN.get(Integer.valueOf(var1.Od()))).y(var1);
            this.q((LJ)this.aQN.get(Integer.valueOf(var1.Od())), true);
         } else {
            this.aQN.put(Integer.valueOf(var1.Od()), var1);
            this.r(var1);
         }
      }

   }

   public PX l(float var1) {
      if (this instanceof iQ && aew.atw().atS().bH.af()) {
         return super.l(var1);
      } else if (var1 == 1.0F) {
         return this.h(this.aNN, this.aQu);
      } else {
         float var2 = this.aOr + (this.aNN - this.aOr) * var1;
         float var3 = this.aQj + (this.aQu - this.aQj) * var1;
         return this.h(var2, var3);
      }
   }

   public abstract GX[] xM();

   protected float Ad() {
      return this.yp() ? (this.oF.nextFloat() - this.oF.nextFloat()) * 0.2F + 1.5F : (this.oF.nextFloat() - this.oF.nextFloat()) * 0.2F + 1.0F;
   }

   protected void r(LJ var1) {
      this.aQe = true;
      if (!this.vR.bXF) {
         LG.bCg[var1.Od()].w(this, this.Ag(), var1.Oj());
      }

   }

   protected float r(Oz var1, float var2) {
      if (!var1.Wu()) {
         int var3 = 25 - this.zx();
         float var4 = var2 * (float)var3;
         this.aB(var2);
         var2 = var4 / 25.0F;
      }

      return var2;
   }

   protected void xo() {
      this.aNV = this.oF.nextDouble() >= this.q(zR.aSc).Bs();
   }

   public void q(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.aQJ = var1;
      this.aQq = var3;
      this.aQV = var5;
      this.aQb = (double)var7;
      this.aQE = (double)var8;
      this.aPZ = var9;
   }

   protected void q(LJ var1, boolean var2) {
      this.aQe = true;
      if (var2 && !this.vR.bXF) {
         LG.bCg[var1.Od()].q(this, this.Ag(), var1.Oj());
         LG.bCg[var1.Od()].w(this, this.Ag(), var1.Oj());
      }

   }

   public Mb zh() {
      return this.vR.wp().co(this.ym().toString());
   }

   protected void yJ() {
      this.Ag().r(zR.aSa);
      this.Ag().r(zR.aSc);
      this.Ag().r(zR.aSd);
   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else if (this.vR.bXF) {
         return false;
      } else {
         this.aQw = 0;
         if (this.zA() <= 0.0F) {
            return false;
         } else if (var1.Wy() && this.q(LG.bCs)) {
            return false;
         } else {
            if ((var1 == Oz.bPE || var1 == Oz.bPw) && this.dP(4) != null) {
               this.dP(4).w((int)(var2 * 4.0F + this.oF.nextFloat() * var2 * 2.0F), this);
               var2 *= 0.75F;
            }

            this.aQX = 1.5F;
            boolean var3 = true;
            if ((float)this.aNz > (float)this.aQm / 2.0F) {
               if (var2 <= this.aQL) {
                  return false;
               }

               this.w(var1, var2 - this.aQL);
               this.aQL = var2;
               var3 = false;
            } else {
               this.aQL = var2;
               this.aNz = this.aQm;
               this.w(var1, var2);
               this.aQf = this.aQr = 10;
            }

            this.aQH = 0.0F;
            zk var4 = var1.Wv();
            if (var4 != null) {
               if (var4 instanceof zz) {
                  this.h((zz)var4);
               }

               if (var4 instanceof DD) {
                  this.aQY = 100;
                  this.aQt = (DD)var4;
               } else if (var4 instanceof DA) {
                  DA var5 = (DA)var4;
                  if (var5.Ff()) {
                     this.aQY = 100;
                     this.aQt = null;
                  }
               }
            }

            if (var3) {
               this.vR.q(this, (byte)2);
               if (var1 != Oz.bPH) {
                  this.xo();
               }

               if (var4 != null) {
                  double var9 = var4.aNZ - this.aNZ;

                  double var7;
                  for(var7 = var4.aOt - this.aOt; var9 * var9 + var7 * var7 < 1.0E-4D; var7 = (Math.random() - Math.random()) * 0.01D) {
                     var9 = (Math.random() - Math.random()) * 0.01D;
                  }

                  this.aQH = (float)(Pq.u(var7, var9) * 180.0D / 3.141592653589793D - (double)this.aOn);
                  this.q(var4, var2, var9, var7);
               } else {
                  this.aQH = (float)((int)(Math.random() * 2.0D) * 180);
               }
            }

            if (this.zA() <= 0.0F) {
               String var10 = this.zC();
               if (var3 && var10 != null) {
                  this.q(var10, this.zw(), this.Ad());
               }

               this.w(var1);
            } else {
               String var11 = this.zv();
               if (var3 && var11 != null) {
                  this.q(var11, this.zw(), this.Ad());
               }
            }

            return true;
         }
      }
   }

   public boolean J(zk var1) {
      return this.vR.w(new PX(this.aNZ, this.aNK + (double)this.xC(), this.aOt), new PX(var1.aNZ, var1.aNK + (double)var1.xC(), var1.aOt)) == null;
   }

   protected boolean Ae() {
      return !this.yp();
   }

   protected void Af() {
      ++this.aQT;
      if (this.aQT == 20) {
         if (!this.vR.bXF && (this.aQY > 0 || this.zt()) && this.Ae() && this.vR.vU().bL(r.q[15293 & 1005])) {
            int var1 = this.p(this.aQt);

            while(var1 > 0) {
               int var2 = BR.eu(var1);
               var1 -= var2;
               this.vR.p(new BR(this.vR, this.aNZ, this.aNK, this.aOt, var2));
            }
         }

         this.yo();

         for(int var8 = 0; var8 < 20; ++var8) {
            double var9 = this.oF.nextGaussian() * 0.02D;
            double var4 = this.oF.nextGaussian() * 0.02D;
            double var6 = this.oF.nextGaussian() * 0.02D;
            this.vR.q(OP.bRk, this.aNZ + (double)(this.oF.nextFloat() * this.gK * 2.0F) - (double)this.gK, this.aNK + (double)(this.oF.nextFloat() * this.gJ), this.aOt + (double)(this.oF.nextFloat() * this.gK * 2.0F) - (double)this.gK, var9, var4, var6);
         }
      }

   }

   public Bh Ag() {
      if (this.aQa == null) {
         this.aQa = new Bm();
      }

      return this.aQa;
   }

   public void v(GX var1) {
      this.q(a.q[-15982 & 6302], 0.8F, 0.8F + this.vR.bXs.nextFloat() * 0.4F);

      for(int var2 = 0; var2 < 5; ++var2) {
         PX var3 = new PX(((double)this.oF.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
         var3 = var3.bm(-this.aNN * 3.1415927F / 180.0F);
         var3 = var3.bn(-this.aOn * 3.1415927F / 180.0F);
         double var4 = (double)(-this.oF.nextFloat()) * 0.6D - 0.3D;
         PX var6 = new PX(((double)this.oF.nextFloat() - 0.5D) * 0.3D, var4, 0.6D);
         var6 = var6.bm(-this.aNN * 3.1415927F / 180.0F);
         var6 = var6.bn(-this.aOn * 3.1415927F / 180.0F);
         var6 = var6.K(this.aNZ, this.aNK + (double)this.xC(), this.aOt);
         this.vR.q(OP.bRU, var6.bUV, var6.bUW, var6.bUX, var3.bUV, var3.bUW + 0.05D, var3.bUX, Fm.s(var1.do1()));
      }

   }

   public boolean dW(int var1) {
      return this.aQN.containsKey(Integer.valueOf(var1));
   }

   public boolean hC() {
      return !this.vR.bXF;
   }

   public boolean mJ() {
      return !this.aNQ;
   }

   public float xR() {
      return this.aQu;
   }
}
