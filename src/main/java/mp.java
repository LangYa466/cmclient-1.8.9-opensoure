import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;

public class mP extends QI {
   private boolean Zy = false;
   private final hS Zz = hS.eV();
   private nb FE;
   private final Set ZA = Sets.newHashSet();
   private final Set ZB = Sets.newHashSet();
   private final Set ZC = Sets.newHashSet();
   private mG ZD;

   public void t(long var1) {
      if (var1 < 0L) {
         var1 = -var1;
         this.vU().j(w.q[-12625 & 685], q.q[29306 & 1139]);
      } else {
         this.vU().j(w.q[18093 & 4845], q.q[-27787 & 10483]);
      }

      super.t(var1);
   }

   public void lP() {
      this.bXm.removeAll(this.bXl);

      for(int var1 = 0; var1 < this.bXl.size(); ++var1) {
         zk var2 = (zk)this.bXl.get(var1);
         int var3 = var2.aNR;
         int var4 = var2.aOy;
         if (var2.aOq && this.y(var3, var4, true)) {
            this.aM(var3, var4).i(var2);
         }
      }

      for(int var5 = 0; var5 < this.bXl.size(); ++var5) {
         this.o((zk)this.bXl.get(var5));
      }

      this.bXl.clear();

      for(int var6 = 0; var6 < this.bXm.size(); ++var6) {
         zk var7 = (zk)this.bXm.get(var6);
         if (var7.aNP != null) {
            if (!var7.aNP.aNQ && var7.aNP.aND == var7) {
               continue;
            }

            var7.aNP.aND = null;
            var7.aNP = null;
         }

         if (var7.aNQ) {
            int var8 = var7.aNR;
            int var9 = var7.aOy;
            if (var7.aOq && this.y(var8, var9, true)) {
               this.aM(var8, var9).i(var7);
            }

            this.bXm.remove(var6--);
            this.o(var7);
         }
      }

   }

   public zk bu(int var1) {
      zk var2 = (zk)this.bXf.gM(var1);
      if (var2 != null) {
         this.ZC.remove(var2);
         this.i(var2);
      }

      return var2;
   }

   public void q(LY var1) {
      this.bXj = var1;
   }

   public boolean lQ() {
      return this.Zy;
   }

   public int q(NW var1, int var2) {
      int var3 = super.q(var1, var2);
      if (MV.Tg()) {
         var3 = Xz.q(var1, var3);
      }

      return var3;
   }

   public void i(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public void q(NW var1, String var2, float var3, float var4, boolean var5) {
      this.q((double)var1.aY() + 0.5D, (double)var1.aX() + 0.5D, (double)var1.KO() + 0.5D, var2, var3, var4, var5);
   }

   public mP(nb var1, QZ var2, int var3, Qr var4, LN var5) {
      super(new Wz(), new WB(var2, p.q[21025 & 10853]), QO.hm(var3), var5, true);
      this.FE = var1;
      this.Zz().e(var4);
      this.bXI.g(this);
      this.aE(new NW(8, 64, 8));
      this.bXg = this.lV();
      this.bXP = new Wv();
      this.ZM();
      this.ZE();
      if (this.Zz.Cu != null && this.Zz.Cu.getClass() == mJ.class) {
         this.Zz.Cu = new Zf(this.Zz, var1);
      }

   }

   public boolean q(NW var1, hI var2) {
      int var3 = var1.aY();
      int var4 = var1.aX();
      int var5 = var1.KO();
      this.i(var3, var4, var5, var3, var4, var5);
      return super.q(var1, var2, 3);
   }

   private boolean lR() {
      if (this.Zz.Cu instanceof Zf) {
         Zf var1 = (Zf)this.Zz.Cu;
         return var1.ahb();
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   static Set w(mP var0) {
      return var0.ZA;
   }

   public void lS() {
      super.lS();
      this.B(this.Ky() + 1L);
      if (this.vU().bL(w.q[5039 & 17069])) {
         this.t(this.Kx() + 1L);
      }

      this.bXK.cf(p.q[5938 & 16931]);

      for(int var1 = 0; var1 < 10 && !this.ZA.isEmpty(); ++var1) {
         zk var2 = (zk)this.ZA.iterator().next();
         this.ZA.remove(var2);
         if (!this.bXm.contains(var2)) {
            this.p(var2);
         }
      }

      this.bXK.cd(p.q[31275 & -32029]);
      this.ZD.lq();
      this.bXK.cd(e.q[-9853 & 275]);
      this.lX();
      this.bXK.Ol();
   }

   public zk bv(int var1) {
      return (zk)(var1 == this.Zz.CM.yi() ? this.Zz.CM : super.bv(var1));
   }

   protected int lT() {
      return this.Zz.Br.ajy;
   }

   protected void lU() {
   }

   public void q(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10) {
      double var11 = this.Zz.gj().x(var1, var3, var5);
      iu var13 = new iu(new PJ(var7), var8, var9, (float)var1, (float)var3, (float)var5);
      if (var10 && var11 > 100.0D) {
         double var14 = Math.sqrt(var11) / 40.0D;
         this.Zz.fs().q(var13, (int)(var14 * 20.0D));
      } else {
         this.Zz.fs().w(var13);
      }

   }

   public void q(double var1, double var3, double var5, double var7, double var9, double var11, HL var13) {
      this.Zz.Cc.w(new oa(this, var1, var3, var5, var7, var9, var11, this.Zz.Cc, var13));
   }

   protected RW lV() {
      this.ZD = new mG(this);
      return this.ZD;
   }

   public void i(zk var1) {
      super.i(var1);
      this.ZC.remove(var1);
   }

   protected void o(zk var1) {
      super.o(var1);
      boolean var2 = false;
      if (this.ZC.contains(var1)) {
         if (var1.xV()) {
            this.ZA.add(var1);
            var2 = true;
         } else {
            this.ZC.remove(var1);
         }
      }

   }

   public boolean q(NW var1, hI var2, int var3) {
      this.Zy = this.lR();
      boolean var4 = super.q(var1, var2, var3);
      this.Zy = false;
      return var4;
   }

   public void j(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new Random();
      GX var6 = this.Zz.CM.zg();
      boolean var7 = this.Zz.Cu.lB() == Ra.bYN && var6 != null && cv.q(var6.do1()) == Ea.bim;
      Ob var8 = new Ob();
      int var9 = this.Zz.Bn.atS().aY.af() ? 100 : 1000;

      for(int var10 = 0; var10 < var9; ++var10) {
         int var11 = var1 + this.bXs.nextInt(var4) - this.bXs.nextInt(var4);
         int var12 = var2 + this.bXs.nextInt(var4) - this.bXs.nextInt(var4);
         int var13 = var3 + this.bXs.nextInt(var4) - this.bXs.nextInt(var4);
         var8.D(var11, var12, var13);
         hI var14 = this.g(var8);
         var14.ds().q(this, var8, var14, var5);
         if (var7 && var14.ds() == Ea.bim) {
            this.q(OP.bRT, (double)((float)var11 + 0.5F), (double)((float)var12 + 0.5F), (double)((float)var13 + 0.5F), 0.0D, 0.0D, 0.0D, new int[0]);
         }
      }

   }

   public boolean p(zk var1) {
      boolean var2 = super.p(var1);
      this.ZC.add(var1);
      if (!var2) {
         this.ZA.add(var1);
      } else if (var1 instanceof BF) {
         this.Zz.fs().w(new ip((BF)var1));
      }

      return var2;
   }

   public void lW() {
      this.FE.mg().p(new Oo(p.q[8740 & 17190]));
   }

   protected void lX() {
      super.lX();
      this.ZB.retainAll(this.bXR);
      if (this.ZB.size() == this.bXR.size()) {
         this.ZB.clear();
      }

      int var1 = 0;

      for(Qn var3 : this.bXR) {
         if (!this.ZB.contains(var3)) {
            int var4 = var3.bVY * 16;
            int var5 = var3.bVZ * 16;
            this.bXK.cf(r.q[20935 & 207]);
            RQ var6 = this.aM(var3.bVY, var3.bVZ);
            this.q(var4, var5, var6);
            this.bXK.Ol();
            this.ZB.add(var3);
            ++var1;
            if (var1 >= 10) {
               return;
            }
         }
      }

   }

   protected void a(zk var1) {
      super.a(var1);
      if (this.ZA.contains(var1)) {
         this.ZA.remove(var1);
      }

   }

   public void q(int var1, zk var2) {
      zk var3 = this.bv(var1);
      if (var3 != null) {
         this.i(var3);
      }

      this.ZC.add(var2);
      var2.dF(var1);
      if (!this.p(var2)) {
         this.ZA.add(var2);
      }

      this.bXf.r(var1, var2);
   }

   // $FF: synthetic method
   static Set e(mP var0) {
      return var0.ZC;
   }

   // $FF: synthetic method
   static hS r(mP var0) {
      return var0.Zz;
   }

   public ye r(xW var1) {
      ye var2 = super.r(var1);
      var2.q(p.q[9895 & 629], new mQ(this));
      var2.q(p.q[750 & -15834], new mR(this));
      var2.q(p.q[16959 & 5927], new mS(this));
      var2.q(p.q[-22981 & 744], new mT(this));
      return var2;
   }

   public void w(int var1, int var2, boolean var3) {
      if (var3) {
         this.ZD.G(var1, var2);
      } else {
         this.ZD.F(var1, var2);
      }

      if (!var3) {
         this.o(var1 * 16, 0, var2 * 16, var1 * 16 + 15, 256, var2 * 16 + 15);
      }

   }
}
