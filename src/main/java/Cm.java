import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class CM extends Cs {
   private static final Bf baO;
   private float baP = -1.0F;
   protected static final Bi baQ = (new Bl((Bi)null, i.q[-7736 & 468], 0.0D, 0.0D, 1.0D)).bl(i.q[19449 & 1479]);
   private final zY baR = new zY(this);
   private float baS;
   private int baT;
   private boolean baU = false;
   private static final UUID baV = UUID.fromString(i.q[462 & 8642]);

   protected final void d(float var1, float var2) {
      boolean var3 = this.baP > 0.0F && this.baS > 0.0F;
      this.baP = var1;
      this.baS = var2;
      if (!var3) {
         this.aL(1.0F);
      }

   }

   public void aL(boolean var1) {
      this.xG().e(13, Byte.valueOf((byte)(var1 ? 1 : 0)));
   }

   protected void q(NW var1, cv var2) {
      this.q(i.q[1463 & 21431], 0.15F, 1.0F);
   }

   protected void w(Qq var1) {
      super.w(var1);
      if (this.oF.nextFloat() < (this.vR.Kq() == Qr.bWh ? 0.05F : 0.01F)) {
         int var2 = this.oF.nextInt(3);
         if (var2 == 0) {
            this.q(0, new GX(Et.bmG));
         } else {
            this.q(0, new GX(Et.bmp));
         }
      }

   }

   protected boolean zo() {
      return !this.DI();
   }

   public void t(HL var1) {
      super.t(var1);
      if (this.yp()) {
         var1.s(i.q[20921 & 3000], true);
      }

      if (this.DL()) {
         var1.s(i.q[29117 & 505], true);
      }

      var1.a(i.q[5118 & -24134], this.DI() ? this.baT : -1);
      var1.s(i.q[2495 & 9147], this.DH());
   }

   protected String zp() {
      return i.q[1012 & 29117];
   }

   public void hu() {
      if (this.vR.ZH() && !this.vR.bXF && !this.yp()) {
         float var1 = this.J(1.0F);
         NW var2 = new NW(this.aNZ, (double)Math.round(this.aNK), this.aOt);
         if (var1 > 0.5F && this.oF.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F && this.vR.aw(var2)) {
            boolean var3 = true;
            GX var4 = this.dP(4);
            if (var4 != null) {
               if (var4.If()) {
                  var4.fr(var4.Ik() + this.oF.nextInt(2));
                  if (var4.Ik() >= var4.Hz()) {
                     this.v(var4);
                     this.q(4, (GX)null);
                  }
               }

               var3 = false;
            }

            if (var3) {
               this.dG(8);
            }
         }
      }

      if (this.xj() && this.zc() != null && this.aNP instanceof CV) {
         ((zx)this.aNP).yM().q(this.yM().NK(), 1.5D);
      }

      super.hu();
   }

   public boolean o(DD var1) {
      GX var2 = var1.FD();
      if (var2 != null && var2.do1() == Et.blf && var2.dm() == 0 && this.DL() && this.q(LG.bCB)) {
         if (!var1.bdO.bfz) {
            --var2.bsH;
         }

         if (var2.bsH <= 0) {
            var1.bdM.y(var1.bdM.bfu, (GX)null);
         }

         if (!this.vR.bXF) {
            this.eA(this.oF.nextInt(2401) + 3600);
         }

         return true;
      } else {
         return false;
      }
   }

   protected void mC() {
      super.mC();
      this.xG().w(12, Byte.valueOf((byte)0));
      this.xG().w(13, Byte.valueOf((byte)0));
      this.xG().w(14, Byte.valueOf((byte)0));
   }

   public double pP() {
      return this.yp() ? 0.0D : -0.35D;
   }

   public boolean yp() {
      return this.xG().dy(12) == 1;
   }

   protected Fm yX() {
      return Et.bnc;
   }

   protected String zv() {
      return i.q[22517 & -24131];
   }

   protected void zP() {
      switch(this.oF.nextInt(3)) {
      case 0:
         this.r(Et.bmQ, 1);
         break;
      case 1:
         this.r(Et.bmK, 1);
         break;
      case 2:
         this.r(Et.bmI, 1);
      }

   }

   public boolean DH() {
      return this.baU;
   }

   public boolean q(Oz var1, float var2) {
      if (super.q(var1, var2)) {
         zz var3 = this.zc();
         if (var3 == null && var1.Wv() instanceof zz) {
            var3 = (zz)var1.Wv();
         }

         if (var3 != null && this.vR.Kq() == Qr.bWh && (double)this.oF.nextFloat() < this.q(baQ).Bs()) {
            int var4 = Pq.D(this.aNZ);
            int var5 = Pq.D(this.aNK);
            int var6 = Pq.D(this.aOt);
            CM var7 = new CM(this.vR);

            for(int var8 = 0; var8 < 50; ++var8) {
               int var9 = var4 + Pq.q(this.oF, 7, 40) * Pq.q(this.oF, -1, 1);
               int var10 = var5 + Pq.q(this.oF, 7, 40) * Pq.q(this.oF, -1, 1);
               int var11 = var6 + Pq.q(this.oF, 7, 40) * Pq.q(this.oF, -1, 1);
               if (QI.c(this.vR, new NW(var9, var10 - 1, var11)) && this.vR.ar(new NW(var9, var10, var11)) < 10) {
                  var7.p((double)var9, (double)var10, (double)var11);
                  if (!this.vR.i((double)var9, (double)var10, (double)var11, 7.0D) && this.vR.q(var7.xE(), var7) && this.vR.q(var7, var7.xE()).isEmpty() && !this.vR.p(var7.xE())) {
                     this.vR.p(var7);
                     var7.f(var3);
                     var7.q(this.vR.aF(new NW(var7)), (zJ)null);
                     this.q(baQ).e(new Bf(i.q[6070 & 434], -0.05000000074505806D, 0));
                     var7.q(baQ).e(new Bf(i.q[435 & 10683], -0.05000000074505806D, 0));
                     break;
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected final void aL(float var1) {
      super.d(this.baP * var1, this.baS * var1);
   }

   public void w(Oz var1) {
      super.w(var1);
      if (var1.Wv() instanceof BV && !(this instanceof Ct) && ((BV)var1.Wv()).CT() && ((BV)var1.Wv()).CX()) {
         ((BV)var1.Wv()).CU();
         this.q(new GX(Et.bll, 1, 2), 0.0F);
      }

   }

   public void aM(boolean var1) {
      this.xG().e(12, Byte.valueOf((byte)(var1 ? 1 : 0)));
      if (this.vR != null && !this.vR.bXF) {
         Bj var2 = this.q(zR.aSd);
         var2.r(baO);
         if (var1) {
            var2.e(baO);
         }
      }

      this.aN(var1);
   }

   static {
      baO = new Bf(baV, i.q[-20029 & 17347], 0.5D, 1);
   }

   public void aN(boolean var1) {
      this.aL(var1 ? 0.5F : 1.0F);
   }

   public zH zM() {
      return zH.aRJ;
   }

   public boolean DI() {
      return this.xG().dy(14) == 1;
   }

   protected void yJ() {
      super.yJ();
      this.q(zR.aSe).h(35.0D);
      this.q(zR.aSd).h(0.23000000417232513D);
      this.q(zR.aSb).h(3.0D);
      this.Ag().r(baQ).h(this.oF.nextDouble() * 0.10000000149011612D);
   }

   public CM(QI var1) {
      super(var1);
      ((LD)this.yM()).bu(true);
      this.aPR.q(0, new AM(this));
      this.aPR.q(2, new zT(this, DD.class, 1.0D, false));
      this.aPR.q(5, new Aw(this, 1.0D));
      this.aPR.q(7, new AV(this, 1.0D));
      this.aPR.q(8, new AW(this, DD.class, 8.0F));
      this.aPR.q(8, new Ar(this));
      this.Dz();
      this.d(0.6F, 1.95F);
   }

   public int zx() {
      int var1 = super.zx() + 2;
      if (var1 > 20) {
         var1 = 20;
      }

      return var1;
   }

   public void aO(boolean var1) {
      if (this.baU != var1) {
         this.baU = var1;
         if (var1) {
            this.aPR.q(1, this.baR);
         } else {
            this.aPR.q(this.baR);
         }
      }

   }

   public float xC() {
      float var1 = 1.74F;
      if (this.yp()) {
         var1 = (float)((double)var1 - 0.81D);
      }

      return var1;
   }

   protected int DJ() {
      int var1 = 1;
      if (this.oF.nextFloat() < 0.01F) {
         int var2 = 0;
         Ob var3 = new Ob();

         for(int var4 = (int)this.aNZ - 4; var4 < (int)this.aNZ + 4 && var2 < 14; ++var4) {
            for(int var5 = (int)this.aNK - 4; var5 < (int)this.aNK + 4 && var2 < 14; ++var5) {
               for(int var6 = (int)this.aOt - 4; var6 < (int)this.aOt + 4 && var2 < 14; ++var6) {
                  cv var7 = this.vR.g(var3.D(var4, var5, var6)).ds();
                  if (var7 == Ea.biU || var7 == Ea.bgQ) {
                     if (this.oF.nextFloat() < 0.3F) {
                        ++var1;
                     }

                     ++var2;
                  }
               }
            }
         }
      }

      return var1;
   }

   public zJ q(Qq var1, zJ var2) {
      var2 = super.q(var1, var2);
      float var3 = var1.YZ();
      this.al(this.oF.nextFloat() < 0.55F * var3);
      if (var2 == null) {
         var2 = new CO(this, this.vR.bXs.nextFloat() < 0.05F, this.vR.bXs.nextFloat() < 0.05F);
      }

      if (var2 instanceof CO) {
         CO var4 = (CO)var2;
         if (var4.baX) {
            this.aL(true);
         }

         if (var4.TL) {
            this.aM(true);
            if ((double)this.vR.bXs.nextFloat() < 0.05D) {
               List var5 = this.vR.q(CV.class, this.xE().C(5.0D, 3.0D, 5.0D), OD.bPS);
               if (!var5.isEmpty()) {
                  CV var6 = (CV)var5.get(0);
                  var6.aQ(true);
                  this.u(var6);
               }
            } else if ((double)this.vR.bXs.nextFloat() < 0.05D) {
               CV var10 = new CV(this.vR);
               var10.q(this.aNZ, this.aNK, this.aOt, this.aOn, 0.0F);
               var10.q(var1, (zJ)null);
               var10.aQ(true);
               this.vR.p(var10);
               this.u(var10);
            }
         }
      }

      this.aO(this.oF.nextFloat() < var3 * 0.1F);
      this.w(var1);
      this.q(var1);
      if (this.dP(4) == null) {
         Calendar var8 = this.vR.ZK();
         if (var8.get(2) + 1 == 10 && var8.get(5) == 31 && this.oF.nextFloat() < 0.25F) {
            this.q(4, new GX(this.oF.nextFloat() < 0.1F ? Ea.bio : Ea.biV));
            this.aPN[4] = 0.0F;
         }
      }

      this.q(zR.aSc).e(new Bf(i.q[31229 & 1468], this.oF.nextDouble() * 0.05000000074505806D, 0));
      double var9 = this.oF.nextDouble() * 1.5D * (double)var3;
      if (var9 > 1.0D) {
         this.q(zR.aSe).e(new Bf(i.q[-29763 & 25021], var9, 2));
      }

      if (this.oF.nextFloat() < var3 * 0.05F) {
         this.q(baQ).e(new Bf(i.q[-31233 & 446], this.oF.nextDouble() * 0.25D + 0.5D, 0));
         this.q(zR.aSa).e(new Bf(i.q[5054 & 17854], this.oF.nextDouble() * 3.0D + 1.0D, 2));
         this.aO(true);
      }

      return var2;
   }

   protected int p(DD var1) {
      if (this.yp()) {
         this.aPJ = (int)((float)this.aPJ * 2.5F);
      }

      return super.p(var1);
   }

   protected void DK() {
      Dr var1 = new Dr(this.vR);
      var1.b(this);
      var1.q(this.vR.aF(new NW(var1)), (zJ)null);
      var1.Fm();
      if (this.yp()) {
         var1.dL(-24000);
      }

      this.vR.i(this);
      var1.ak(this.yV());
      if (this.dg()) {
         var1.bh(this.yj());
         var1.ah(this.xm());
      }

      this.vR.p(var1);
      var1.e(new LJ(LG.bCz.bCA, 200, 0));
      this.vR.w((DD)null, 1017, new NW((int)this.aNZ, (int)this.aNK, (int)this.aOt), 0);
   }

   public void q(byte var1) {
      if (var1 == 16) {
         if (!this.xP()) {
            this.vR.q(this.aNZ + 0.5D, this.aNK + 0.5D, this.aOt + 0.5D, i.q[-31297 & 511], 1.0F + this.oF.nextFloat(), this.oF.nextFloat() * 0.7F + 0.3F, false);
         }
      } else {
         super.q(var1);
      }

   }

   protected void eA(int var1) {
      this.baT = var1;
      this.xG().e(14, Byte.valueOf((byte)1));
      this.dV(LG.bCB.bCA);
      this.e(new LJ(LG.bCk.bCA, var1, Math.min(this.vR.Kq().Zb() - 1, 0)));
      this.vR.q(this, (byte)16);
   }

   public boolean H(zk var1) {
      boolean var2 = super.H(var1);
      if (var2) {
         int var3 = this.vR.Kq().Zb();
         if (this.zg() == null && this.xL() && this.oF.nextFloat() < (float)var3 * 0.3F) {
            var1.dG(2 * var3);
         }
      }

      return var2;
   }

   public boolean DL() {
      return this.xG().dy(13) == 1;
   }

   protected void Dz() {
      this.aPR.q(4, new zT(this, Dr.class, 1.0D, true));
      this.aPR.q(4, new zT(this, Co.class, 1.0D, true));
      this.aPR.q(6, new Au(this, 1.0D, false));
      this.aPM.q(1, new An(this, true, new Class[]{Ct.class}));
      this.aPM.q(2, new Ay(this, DD.class, true));
      this.aPM.q(2, new Ay(this, Dr.class, false));
      this.aPM.q(2, new Ay(this, Co.class, true));
   }

   public void d(zz var1) {
      super.d(var1);
      if ((this.vR.Kq() == Qr.bWg || this.vR.Kq() == Qr.bWh) && var1 instanceof Dr) {
         if (this.vR.Kq() != Qr.bWh && this.oF.nextBoolean()) {
            return;
         }

         zx var2 = (zx)var1;
         CM var3 = new CM(this.vR);
         var3.b(var1);
         this.vR.i(var1);
         var3.q(this.vR.aF(new NW(var3)), (zJ)null);
         var3.aL(true);
         if (var1.yp()) {
            var3.aM(true);
         }

         var3.ak(var2.yV());
         if (var2.dg()) {
            var3.bh(var2.yj());
            var3.ah(var2.xm());
         }

         this.vR.p(var3);
         this.vR.w((DD)null, 1016, new NW((int)this.aNZ, (int)this.aNK, (int)this.aOt), 0);
      }

   }

   public void r(HL var1) {
      super.r(var1);
      if (var1.bL(i.q[17337 & 2488])) {
         this.aM(true);
      }

      if (var1.bL(i.q[4541 & 25529])) {
         this.aL(true);
      }

      if (var1.d(i.q[8638 & 2554], 99) && var1.bQ(i.q[-32322 & 2554]) > -1) {
         this.eA(var1.bQ(i.q[6074 & -15878]));
      }

      this.aO(var1.bL(i.q[1467 & 8635]));
   }

   protected String zC() {
      return i.q[16822 & 3062];
   }

   protected boolean c(GX var1) {
      return var1.do1() == Et.blL && this.yp() && this.xj() ? false : super.c(var1);
   }

   public void hv() {
      if (!this.vR.bXF && this.DI()) {
         int var1 = this.DJ();
         this.baT -= var1;
         if (this.baT <= 0) {
            this.DK();
         }
      }

      super.hv();
   }
}
