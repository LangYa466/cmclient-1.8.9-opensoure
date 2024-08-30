import com.google.common.collect.Sets;
import java.nio.FloatBuffer;
import java.util.BitSet;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class rA {
   public int apk;
   private final Set apl = Sets.newHashSet();
   public static final OS[] apm = OS.values();
   private final boolean apn = MV.SA();
   private final QI apo;
   private final boolean app = true;
   private boolean apq = false;
   private boolean apr = false;
   private RQ aps;
   private boolean apt = true;
   private final qd apu;
   private final ut[] apv = new ut[OS.values().length];
   private rA[] apw = new rA[OK.bQO.length];
   public int apx;
   private EnumMap apy = null;
   private final FloatBuffer apz = py.bN(16);
   private NW nJ;
   private final OS[] apA = new OS[1];
   private rA[] apB = new rA[OK.bQO.length];
   private final ReentrantLock apC = new ReentrantLock();
   public Zs apD;
   private boolean Zy = false;
   private qg apE = new qg(this, (OK)null, 0);
   public NV apF;
   private final ReentrantLock apG = new ReentrantLock();
   public static int apH;
   private final int apI;
   private int apJ = -1;
   private NW[] apK = new NW[OK.bQO.length];
   private rl apL = null;
   public rv aoo = rv.aph;

   public boolean qX() {
      return this.c(this.nJ);
   }

   private boolean c(NW var1) {
      int var2 = var1.aX();
      int var3 = var2 + 15;
      return this.b(var1).aS(var2, var3);
   }

   public void R(boolean var1) {
      this.apt = var1;
      if (var1) {
         if (this.re()) {
            this.Zy = true;
         }
      } else {
         this.Zy = false;
      }

   }

   public boolean qY() {
      return this.apt;
   }

   public void v(NW var1) {
      this.rd();
      this.nJ = var1;
      byte var2 = 8;
      this.apx = var1.aY() >> var2 << var2;
      this.apk = var1.KO() >> var2 << var2;
      this.apF = new NV(var1, var1.C(16, 16, 16));
      this.rj();

      for(int var3 = 0; var3 < this.apK.length; ++var3) {
         this.apK[var3] = null;
      }

      if (M.cg.ch.af()) {
         this.apu.akw.Bn.dmG.q(this, var1);
      }

      this.apr = false;
      this.apq = false;

      for(int var5 = 0; var5 < this.apw.length; ++var5) {
         rA var4 = this.apw[var5];
         if (var4 != null) {
            var4.apq = false;
         }
      }

      this.aps = null;
      this.apD = null;
   }

   public Zs qZ() {
      if (this.apD == null) {
         NW var1 = this.dt();
         int var2 = var1.aY();
         int var3 = var1.aX();
         int var4 = var1.KO();
         byte var5 = 5;
         int var6 = var2 >> var5 << var5;
         int var7 = var3 >> var5 << var5;
         int var8 = var4 >> var5 << var5;
         if (var6 != var2 || var7 != var3 || var8 != var4) {
            Zs var9 = this.apu.k(new NW(var6, var7, var8)).qZ();
            if (var9 != null && var9.bNW == (double)var6 && var9.bNT == (double)var7 && var9.bNY == (double)var8) {
               this.apD = var9;
            }
         }

         if (this.apD == null) {
            int var10 = 1 << var5;
            this.apD = new Zs((double)var6, (double)var7, (double)var8, (double)(var6 + var10), (double)(var7 + var10), (double)(var8 + var10));
         }
      }

      return this.apD;
   }

   public void py() {
      this.rd();

      for(int var1 = 0; var1 < OS.values().length; ++var1) {
         if (this.apv[var1] != null) {
            this.apv[var1].sN();
         }
      }

   }

   private OS q(hI var1, OS var2) {
      if (Xe.aet()) {
         OS var3 = Xe.H(var1);
         if (var3 != null) {
            return var3;
         }
      }

      this.getClass();
      if (this.apn) {
         if (var2 == OS.bSl) {
            cv var4 = var1.ds();
            if (var4 instanceof fQ) {
               return var2;
            }

            if (var4 instanceof cY) {
               return var2;
            }

            return OS.bSk;
         }
      } else if (var2 == OS.bSk) {
         return OS.bSl;
      }

      return var2;
   }

   public rA s(OK var1) {
      if (!this.apq) {
         this.rf();
      }

      return this.apB[var1.ordinal()];
   }

   public void q(OK var1, rA var2) {
      this.apw[var1.ordinal()] = var2;
      this.apB[var1.ordinal()] = var2;
   }

   private RQ b(NW var1) {
      RQ var2 = this.aps;
      if (var2 != null && var2.abR()) {
         return var2;
      } else {
         var2 = this.apo.aB(var1);
         this.aps = var2;
         return var2;
      }
   }

   private void q(qc var1, rv var2, boolean[] var3) {
      this.q(OS.bSl, var1, var2, var3);
      this.q(OS.bSk, var1, var2, var3);
      this.q(OS.bSm, var1, var2, var3);
   }

   public rA(QI var1, qd var2, NW var3, int var4) {
      this.apo = var1;
      this.apu = var2;
      this.apI = var4;
      if (!var3.equals(this.dt())) {
         this.v(var3);
      }

      if (qa.ou()) {
         for(int var5 = 0; var5 < OS.values().length; ++var5) {
            this.apv[var5] = new ut(us.axV);
         }
      }

   }

   public rv qJ() {
      return this.aoo;
   }

   public ReentrantLock ra() {
      return this.apC;
   }

   public void rb() {
      pz.q(this.apz);
   }

   public RQ rc() {
      return this.b(this.nJ);
   }

   public void rd() {
      this.ri();
      this.aoo = rv.aph;
   }

   private void q(qq var1, NW var2) {
      var1.q(7, us.axV);
      if (MV.Te()) {
         byte var3 = 8;
         int var4 = var2.aY() >> var3 << var3;
         int var5 = var2.aX() >> var3 << var3;
         int var6 = var2.KO() >> var3 << var3;
         var4 = this.apx;
         var6 = this.apk;
         var1.u((double)(-var4), (double)(-var5), (double)(-var6));
      } else {
         var1.u((double)(-var2.aY()), (double)(-var2.aX()), (double)(-var2.KO()));
      }

   }

   private Ze n(NW var1) {
      NW var2 = var1.C(-1, -1, -1);
      NW var3 = var1.C(16, 16, 16);
      qb var4 = this.q(this.apo, var2, var3, 1);
      return new Ze(var4, var2, var3, 1);
   }

   private boolean re() {
      if (this.apo instanceof mP) {
         mP var1 = (mP)this.apo;
         return var1.lQ();
      } else {
         return false;
      }
   }

   public void q(float var1, float var2, float var3, rl var4) {
      rv var5 = new rv();
      boolean var6 = true;
      NW var7 = new NW(this.nJ);
      NW var8 = var7.C(15, 15, 15);
      var4.qM().lock();

      try {
         if (var4.qI() != rm.aos) {
            return;
         }

         var4.q(var5);
      } finally {
         var4.qM().unlock();
      }

      rD var9 = new rD();
      HashSet var10 = Sets.newHashSet();
      if (!this.c(var7)) {
         ++apH;
         Ze var11 = this.n(var7);
         var11.agY();
         boolean[] var12 = new boolean[apm.length];
         pl var13 = hS.eV().fB();

         for(Object var15 : WT.q(var7, var8)) {
            WT var16 = (WT)var15;
            hI var17 = var11.g(var16);
            cv var18 = var17.ds();
            if (var18.cr()) {
               var9.A(var16);
            }

            if (var18.cK()) {
               No var19 = var11.h(new NW(var16));
               ur var20 = un.axh.w(var19);
               if (var19 != null && var20 != null) {
                  var5.q(var19);
                  if (var20.sH()) {
                     var10.add(var19);
                  }
               }
            }

            OS[] var39 = this.apA;
            var39[0] = var18.cn();

            for(int var40 = 0; var40 < var39.length; ++var40) {
               OS var21 = var39[var40];
               var21 = this.q(var17, var21);
               int var22 = var21.ordinal();
               if (var18.cC() != -1) {
                  qq var23 = var4.qP().cr(var22);
                  var23.r(var21);
                  Zy var24 = var23.w(var17, var16);
                  var24.q(var4.qP());
                  if (!var5.y(var21)) {
                     var5.u(var21);
                     this.q(var23, var7);
                  }

                  var12[var22] |= var13.q(var17, var16, var11, var23);
                  if (var24.ahD()) {
                     this.q(var4.qP(), var5, var12);
                     var24.cp(false);
                  }
               }
            }
         }

         for(OS var37 : apm) {
            if (var12[var37.ordinal()]) {
               var5.i(var37);
            }

            if (var5.y(var37)) {
               if (MV.Tf()) {
                  net.optifine.shaders.b.r(var4.qP().w(var37));
               }

               qq var38 = var4.qP().w(var37);
               this.q(var37, var1, var2, var3, var38, var5);
               if (var38.alV != null) {
                  var5.q(var37, (BitSet)var38.alV.clone());
               }
            } else {
               var5.q(var37, (BitSet)null);
            }
         }

         var11.agX();
      }

      var5.q(var9.rl());
      this.apC.lock();

      try {
         HashSet var32 = Sets.newHashSet(var10);
         HashSet var33 = Sets.newHashSet(this.apl);
         var32.removeAll(this.apl);
         var33.removeAll(var10);
         this.apl.clear();
         this.apl.addAll(var10);
         this.apu.q(var33, var32);
      } finally {
         this.apC.unlock();
      }

   }

   private void rf() {
      int var1 = this.dt().aY();
      int var2 = this.dt().KO();
      int var3 = OK.bQD.ordinal();
      int var4 = OK.bQE.ordinal();
      int var5 = OK.bQF.ordinal();
      int var6 = OK.bQG.ordinal();
      this.apB[var3] = this.apw[var3].dt().KO() == var2 - 16 ? this.apw[var3] : null;
      this.apB[var4] = this.apw[var4].dt().KO() == var2 + 16 ? this.apw[var4] : null;
      this.apB[var5] = this.apw[var5].dt().aY() == var1 - 16 ? this.apw[var5] : null;
      this.apB[var6] = this.apw[var6].dt().aY() == var1 + 16 ? this.apw[var6] : null;
      this.apq = true;
   }

   private void q(OS var1, float var2, float var3, float var4, qq var5, rv var6) {
      if (var1 == OS.bSm && !var6.o(var1)) {
         var5.i(var2, var3, var4);
         var6.e(var5.pG());
      }

      var5.pB();
   }

   public rl rg() {
      this.apC.lock();

      Object var3;
      try {
         if (this.apL == null || this.apL.qI() != rm.aor) {
            if (this.apL != null && this.apL.qI() != rm.aou) {
               this.apL.qK();
               this.apL = null;
            }

            this.apL = new rl(this, rn.aox);
            this.apL.q(this.aoo);
            rl var7 = this.apL;
            rl var1 = var7;
            return var1;
         }

         Object var2 = null;
         var3 = var2;
      } finally {
         this.apC.unlock();
      }

      return (rl)var3;
   }

   public void w(float var1, float var2, float var3, rl var4) {
      rv var5 = var4.qJ();
      if (var5.qV() != null && !var5.o(OS.bSm)) {
         qq var6 = var4.qP().w(OS.bSm);
         this.q(var6, this.nJ);
         var6.q(var5.qV());
         this.q(OS.bSm, var1, var2, var3, var6, var5);
      }

   }

   public NW d(OK var1) {
      return this.f(var1);
   }

   public boolean lQ() {
      return this.Zy;
   }

   public NW dt() {
      return this.nJ;
   }

   public boolean q(rI var1, int var2) {
      return this.qZ().w(var1, var2) ? true : var1.w(this.apF);
   }

   public qg rh() {
      return this.apE;
   }

   protected void ri() {
      this.apC.lock();

      try {
         if (this.apL != null && this.apL.qI() != rm.aou) {
            this.apL.qK();
            this.apL = null;
         }
      } finally {
         this.apC.unlock();
      }

   }

   private void q(OS var1, qc var2, rv var3, boolean[] var4) {
      qq var5 = var2.w(var1);
      if (var5.pM()) {
         var3.u(var1);
         var4[var1.ordinal()] = true;
      }

   }

   protected qb q(QI var1, NW var2, NW var3, int var4) {
      return new qb(var1, var2, var3, var4);
   }

   public boolean cC(int var1) {
      if (this.apJ == var1) {
         return false;
      } else {
         this.apJ = var1;
         return true;
      }
   }

   public String toString() {
      return i.q[17245 & 4959] + this.dt() + i.q[2910 & -27809] + this.apJ;
   }

   public NW f(OK var1) {
      int var2 = var1.tb();
      NW var3 = this.apK[var2];
      if (var3 == null) {
         var3 = this.dt().r(var1, 16);
         this.apK[var2] = var3;
      }

      return var3;
   }

   private void rj() {
      pz.nE();
      pz.nU();
      float var1 = 1.000001F;
      pz.y(-8.0F, -8.0F, -8.0F);
      pz.u(var1, var1, var1);
      pz.y(8.0F, 8.0F, 8.0F);
      pz.w(2982, this.apz);
      pz.nF();
   }

   public ut cD(int var1) {
      return this.apv[var1];
   }

   public void q(rv var1) {
      this.apG.lock();

      try {
         this.aoo = var1;
      } finally {
         this.apG.unlock();
      }

   }

   public rl rk() {
      this.apC.lock();

      rl var1;
      try {
         this.ri();
         this.apL = new rl(this, rn.aow);
         var1 = this.apL;
      } finally {
         this.apC.unlock();
      }

      return var1;
   }
}
