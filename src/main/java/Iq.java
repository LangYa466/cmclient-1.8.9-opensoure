public class iQ extends iO {
   private double Fo;
   public float Fp;
   public float Fq;
   private final Ni Fr;
   private boolean Fs;
   private boolean Ft;
   private String Fu;
   public Pz Fv;
   public float Fw;
   protected hS G;
   private double Fx;
   public float Fy;
   private boolean Fz;
   public float FA;
   private float FB;
   private float FC;
   private float FD;
   public final nb FE;
   public int FF;
   private int FG;
   private double FH;
   private int FI;
   protected int FJ;
   public float FK;

   public Ni hw() {
      return this.Fr;
   }

   public void q(Nb var1, int var2) {
      if (var1 != null && var1.bJN) {
         super.q(var1, var2);
      }

   }

   public void q(Qy var1) {
      String var2 = var1.di();
      if (t.q[21082 & 2682].equals(var2)) {
         this.G.r(new lm(this.bdM, this.vR));
      } else if (t.q[-15187 & 233].equals(var2)) {
         this.G.r(new jk(this.bdM, this.vR, var1));
      } else if (u.q[22398 & -29901].equals(var2)) {
         this.G.r(new ke(this.bdM, this.vR));
      }

   }

   public void hv() {
      if (this.vR.ao(new NW(this.aNZ, 0.0D, this.aOt))) {
         super.hv();
         if (this.xj()) {
            this.FE.q(new Jj(this.aOn, this.aNN, this.aNG));
            this.FE.q(new Js(this.aQD, this.aPW, this.Fv.bTC, this.Fv.bTD));
         } else {
            this.hL();
         }
      }

   }

   public void z(float var1) {
   }

   protected void q(BD var1) {
   }

   public boolean hx() {
      return true;
   }

   public void hy() {
      this.FE.q(new Jz(this.bdO));
   }

   public float hz() {
      return this.FD;
   }

   public void i(GX var1) {
      Fm var2 = var1.do1();
      if (var2 == Et.bmU) {
         this.G.r(new ki(this, var1, true));
      }

   }

   protected void w(Oz var1, float var2) {
      if (!this.q(var1)) {
         this.aC(this.zA() - var2);
      }

   }

   public BD k(boolean var1) {
      Jm var2 = var1 ? Jm.bww : Jm.bwx;
      this.FE.q(new Jl(var2, NW.bNZ, OK.bQB));
      return null;
   }

   public void t(zk var1) {
      this.G.Cc.q(var1, OP.bRt);
   }

   public String hA() {
      return this.Fu;
   }

   public void G(String var1) {
      this.FE.q(new Je(var1));
   }

   public void hB() {
      super.hB();
      this.FE.q(new Jp());
   }

   public void l(boolean var1) {
      super.l(var1);
      this.FF = var1 ? 600 : 0;
   }

   public void q(String var1, float var2, float var3) {
      this.vR.q(this.aNZ, this.aNK, this.aOt, var1, var2, var3, false);
   }

   public void H(String var1) {
      this.Fu = var1;
   }

   public void w(OX var1) {
      this.G.BZ.iA().e(var1);
   }

   protected boolean w(double var1, double var3, double var5) {
      if (this.aOm) {
         return false;
      } else {
         NW var7 = new NW(var1, var3, var5);
         double var8 = var1 - (double)var7.aY();
         double var10 = var5 - (double)var7.KO();
         if (!this.p(var7)) {
            byte var12 = -1;
            double var13 = 9999.0D;
            if (this.p(var7.Vh()) && var8 < var13) {
               var13 = var8;
               var12 = 0;
            }

            if (this.p(var7.Ve()) && 1.0D - var8 < var13) {
               var13 = 1.0D - var8;
               var12 = 1;
            }

            if (this.p(var7.Vg()) && var10 < var13) {
               var13 = var10;
               var12 = 4;
            }

            if (this.p(var7.Vk()) && 1.0D - var10 < var13) {
               var13 = 1.0D - var10;
               var12 = 5;
            }

            float var15 = 0.1F;
            if (var12 == 0) {
               this.aOd = (double)(-var15);
            }

            if (var12 == 1) {
               this.aOd = (double)var15;
            }

            if (var12 == 4) {
               this.aOL = (double)(-var15);
            }

            if (var12 == 5) {
               this.aOL = (double)var15;
            }
         }

         return false;
      }
   }

   public boolean q(Oz var1, float var2) {
      return false;
   }

   public boolean hC() {
      return true;
   }

   public void q(zM var1) {
      this.G.r(new jG(this.bdM, var1, this.vR));
   }

   private boolean p(NW var1) {
      return !this.vR.g(var1).ds().cT() && !this.vR.g(var1.Vi()).ds().cT();
   }

   protected boolean hD() {
      return this.G.gj() == this;
   }

   public void hE() {
      this.FE.q(new JC(JD.bxk));
   }

   protected void hF() {
      this.FE.q(new Jq(this, Jr.bwP, (int)(this.hz() * 100.0F)));
   }

   public void q(xw var1) {
      this.G.r(new iX(var1));
   }

   public void hG() {
      this.FE.q(new Jt(this.bdQ.boD));
      this.hJ();
   }

   public boolean q(int var1, String var2) {
      return var1 <= 0;
   }

   public void y(zk var1) {
      this.G.Cc.q(var1, OP.bRu);
   }

   public void q(OX var1) {
      this.G.BZ.iA().e(var1);
   }

   public iQ(hS var1, QI var2, nb var3, Ni var4) {
      super(var2, var3.mh());
      this.FE = var3;
      this.Fr = var4;
      this.G = var1;
      this.aOe = 0;
   }

   public boolean hH() {
      return this.aNP != null && this.aNP instanceof CX && ((CX)this.aNP).Ei();
   }

   public void q(CX var1, EV var2) {
      this.G.r(new lr(this.bdM, var2, var1));
   }

   public void q(EV var1) {
      String var2 = var1 instanceof Qy ? ((Qy)var1).di() : y.q[3283 & 16773];
      if (q.q[-31268 & 8655].equals(var2)) {
         this.G.r(new lh(this.bdM, var1));
      } else if (w.q[495 & 27327].equals(var2)) {
         this.G.r(new jq(this.bdM, var1));
      } else if (w.q[-31825 & 13245].equals(var2)) {
         this.G.r(new lp(this.bdM, var1));
      } else if (t.q[16536 & 3774].equals(var2)) {
         this.G.r(new lg(this.bdM, var1));
      } else if (y.q[17075 & 13223].equals(var2)) {
         this.G.r(new lb(this.bdM, var1));
      } else if (!w.q[-32385 & 895].equals(var2) && !e.q[9111 & 3543].equals(var2)) {
         this.G.r(new lh(this.bdM, var1));
      } else {
         this.G.r(new ln(this.bdM, var1));
      }

   }

   public void hu() {
      if (this.FF > 0) {
         --this.FF;
         if (this.FF == 0) {
            this.l(false);
         }
      }

      if (this.FJ > 0) {
         --this.FJ;
      }

      this.FA = this.Fy;
      if (this.aOE) {
         if (this.G.Cx != null && !this.G.Cx.s()) {
            this.G.r((kf)null);
         }

         if (this.Fy == 0.0F) {
            this.G.fs().w(iu.q(new PJ(i.q[2411 & -11281]), this.oF.nextFloat() * 0.4F + 0.8F));
         }

         this.Fy += 0.0125F;
         if (this.Fy >= 1.0F) {
            this.Fy = 1.0F;
         }

         this.aOE = false;
      } else if (this.q(LG.bCz) && this.w(LG.bCz).EW() > 60) {
         this.Fy += 0.006666667F;
         if (this.Fy > 1.0F) {
            this.Fy = 1.0F;
         }
      } else {
         if (this.Fy > 0.0F) {
            this.Fy -= 0.05F;
         }

         if (this.Fy < 0.0F) {
            this.Fy = 0.0F;
         }
      }

      if (this.aOi > 0) {
         --this.aOi;
      }

      boolean var1 = this.Fv.bTC;
      boolean var2 = this.Fv.bTD;
      float var3 = 0.8F;
      boolean var4 = this.Fv.aPW >= var3;
      this.Fv.Xv();
      if (this.FM() && !this.xj()) {
         this.Fv.bTE *= 0.2F;
         this.Fv.aPW *= 0.2F;
         this.FJ = 0;
      }

      this.w(this.aNZ - (double)this.gK * 0.35D, this.xE().bNT + 0.5D, this.aOt + (double)this.gK * 0.35D);
      this.w(this.aNZ - (double)this.gK * 0.35D, this.xE().bNT + 0.5D, this.aOt - (double)this.gK * 0.35D);
      this.w(this.aNZ + (double)this.gK * 0.35D, this.xE().bNT + 0.5D, this.aOt - (double)this.gK * 0.35D);
      this.w(this.aNZ + (double)this.gK * 0.35D, this.xE().bNT + 0.5D, this.aOt + (double)this.gK * 0.35D);
      boolean var5 = (float)this.FO().KD() > 6.0F || this.bdO.bfC;
      if (this.aNG && !var2 && !var4 && this.Fv.aPW >= var3 && !this.xf() && var5 && !this.FM() && !this.q(LG.bCh)) {
         if (this.FJ <= 0 && !this.G.Br.aCu.bC()) {
            this.FJ = 7;
         } else {
            this.l(true);
         }
      }

      if (!this.xf() && this.Fv.aPW >= var3 && var5 && !this.FM() && !this.q(LG.bCh) && this.G.Br.aCu.bC()) {
         this.l(true);
      }

      if (this.xf() && (this.Fv.aPW < var3 || this.aNB || !var5)) {
         this.l(false);
      }

      if (this.bdO.bfC) {
         if (this.G.Cu.lu()) {
            if (!this.bdO.bfB) {
               this.bdO.bfB = true;
               this.hy();
            }
         } else if (!var1 && this.Fv.bTC) {
            if (this.bdR == 0) {
               this.bdR = 7;
            } else {
               this.bdO.bfB = !this.bdO.bfB;
               this.hy();
               this.bdR = 0;
            }
         }
      }

      if (this.bdO.bfB && this.hD()) {
         if (this.Fv.bTD) {
            this.aOO -= (double)(this.bdO.GF() * 3.0F);
         }

         if (this.Fv.bTC) {
            this.aOO += (double)(this.bdO.GF() * 3.0F);
         }
      }

      if (this.hH()) {
         if (this.FG < 0) {
            ++this.FG;
            if (this.FG == 0) {
               this.FD = 0.0F;
            }
         }

         if (var1 && !this.Fv.bTC) {
            this.FG = -10;
            this.hF();
         } else if (!var1 && this.Fv.bTC) {
            this.FG = 0;
            this.FD = 0.0F;
         } else if (var1) {
            ++this.FG;
            if (this.FG < 10) {
               this.FD = (float)this.FG * 0.1F;
            } else {
               this.FD = 0.8F + 2.0F / (float)(this.FG - 9) * 0.1F;
            }
         }
      } else {
         this.FD = 0.0F;
      }

      super.hu();
      if (this.aNG && this.bdO.bfB && !this.G.Cu.lu()) {
         this.bdO.bfB = false;
         this.hy();
      }

   }

   public boolean hI() {
      boolean var1 = this.Fv != null ? this.Fv.bTD : false;
      return var1 && !this.bei;
   }

   public void hJ() {
      this.bdM.I((GX)null);
      super.hG();
      this.G.r((kf)null);
   }

   public void hK() {
      super.hK();
      if (this.hD()) {
         this.aQD = this.Fv.bTE;
         this.aPW = this.Fv.aPW;
         this.aQF = this.Fv.bTC;
         this.Fq = this.Fw;
         this.Fp = this.FK;
         this.FK = (float)((double)this.FK + (double)(this.aNN - this.FK) * 0.5D);
         this.Fw = (float)((double)this.Fw + (double)(this.aOn - this.Fw) * 0.5D);
      }

   }

   public void hL() {
      boolean var1 = this.xf();
      if (var1 != this.Ft) {
         if (var1) {
            this.FE.q(new Jq(this, Jr.bwN));
         } else {
            this.FE.q(new Jq(this, Jr.bwO));
         }

         this.Ft = var1;
      }

      boolean var2 = this.hI();
      if (var2 != this.Fz) {
         if (var2) {
            this.FE.q(new Jq(this, Jr.bwK));
         } else {
            this.FE.q(new Jq(this, Jr.bwL));
         }

         this.Fz = var2;
      }

      if (this.hD()) {
         double var3 = this.aNZ - this.Fo;
         double var5 = this.xE().bNT - this.FH;
         double var7 = this.aOt - this.Fx;
         double var9 = (double)(this.aOn - this.FB);
         double var11 = (double)(this.aNN - this.FC);
         boolean var13 = var3 * var3 + var5 * var5 + var7 * var7 > 9.0E-4D || this.FI >= 20;
         boolean var14 = var9 != 0.0D || var11 != 0.0D;
         if (this.aNP == null) {
            if (var13 && var14) {
               this.FE.q(new Jk(this.aNZ, this.xE().bNT, this.aOt, this.aOn, this.aNN, this.aNG));
            } else if (var13) {
               this.FE.q(new Ji(this.aNZ, this.xE().bNT, this.aOt, this.aNG));
            } else if (var14) {
               this.FE.q(new Jj(this.aOn, this.aNN, this.aNG));
            } else {
               this.FE.q(new Jh(this.aNG));
            }
         } else {
            this.FE.q(new Jk(this.aOd, -999.0D, this.aOL, this.aOn, this.aNN, this.aNG));
            var13 = false;
         }

         ++this.FI;
         if (var13) {
            this.Fo = this.aNZ;
            this.FH = this.xE().bNT;
            this.Fx = this.aOt;
            this.FI = 0;
         }

         if (var14) {
            this.FB = this.aOn;
            this.FC = this.aNN;
         }
      }

   }

   public void q(float var1, int var2, int var3) {
      this.bdD = var1;
      this.bee = var2;
      this.bet = var3;
   }

   public void q(NR var1) {
      this.G.r(new lo(var1));
   }

   public void hM() {
      this.FE.q(new Jq(this, Jr.bwQ));
   }

   public void u(zk var1) {
      super.u(var1);
      if (var1 instanceof BF) {
         this.G.fs().w(new iq(this, (BF)var1));
      }

   }

   public void x(float var1) {
      if (this.Fs) {
         float var2 = this.zA() - var1;
         if (var2 <= 0.0F) {
            this.aC(var1);
            if (var2 < 0.0F) {
               this.aNz = this.aQm / 2;
            }
         } else {
            this.aQL = var2;
            this.aC(this.zA());
            this.aNz = this.aQm;
            this.w(Oz.bPI, var2);
            this.aQf = this.aQr = 10;
         }
      } else {
         this.aC(var1);
         this.Fs = true;
      }

   }

   public NW dt() {
      return new NW(this.aNZ + 0.5D, this.aNK + 0.5D, this.aOt + 0.5D);
   }
}
