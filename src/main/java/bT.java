import java.util.List;

public class Bt extends Bu {
   public long aXf;
   private int aXg;
   private int aXh;

   public void hv() {
      super.hv();
      if (this.aXh == 2) {
         this.vR.q(this.aNZ, this.aNK, this.aOt, a.q[-31818 & 12452], 10000.0F, 0.8F + this.oF.nextFloat() * 0.2F);
         this.vR.q(this.aNZ, this.aNK, this.aOt, t.q[669 & 19133], 2.0F, 0.5F + this.oF.nextFloat() * 0.2F);
      }

      --this.aXh;
      if (this.aXh < 0) {
         if (this.aXg == 0) {
            this.yo();
         } else if (this.aXh < -this.oF.nextInt(10)) {
            --this.aXg;
            this.aXh = 1;
            this.aXf = this.oF.nextLong();
            NW var1 = new NW(this);
            if (!this.vR.bXF && this.vR.vU().bL(y.q[1658 & -31958]) && this.vR.t(var1, 10) && this.vR.g(var1).ds().cB() == hn.zp && Ea.bkn.e(this.vR, var1)) {
               this.vR.r(var1, Ea.bkn.cx());
            }
         }
      }

      if (this.aXh >= 0) {
         if (this.vR.bXF) {
            this.vR.hj(2);
         } else {
            double var6 = 3.0D;
            List var3 = this.vR.w(this, new NV(this.aNZ - var6, this.aNK - var6, this.aOt - var6, this.aNZ + var6, this.aNK + 6.0D + var6, this.aOt + var6));

            for(int var4 = 0; var4 < var3.size(); ++var4) {
               zk var5 = (zk)var3.get(var4);
               var5.w(this);
            }
         }
      }

   }

   public Bt(QI var1, double var2, double var4, double var6) {
      super(var1);
      this.q(var2, var4, var6, 0.0F, 0.0F);
      this.aXh = 2;
      this.aXf = this.oF.nextLong();
      this.aXg = this.oF.nextInt(3) + 1;
      NW var8 = new NW(this);
      if (!var1.bXF && var1.vU().bL(y.q[25262 & -29910]) && (var1.Kq() == Qr.bWg || var1.Kq() == Qr.bWh) && var1.t(var8, 10)) {
         if (var1.g(var8).ds().cB() == hn.zp && Ea.bkn.e(var1, var8)) {
            var1.r(var8, Ea.bkn.cx());
         }

         for(int var9 = 0; var9 < 4; ++var9) {
            NW var10 = var8.C(this.oF.nextInt(3) - 1, this.oF.nextInt(3) - 1, this.oF.nextInt(3) - 1);
            if (var1.g(var10).ds().cB() == hn.zp && Ea.bkn.e(var1, var10)) {
               var1.r(var10, Ea.bkn.cx());
            }
         }
      }

   }

   protected void r(HL var1) {
   }

   protected void t(HL var1) {
   }

   protected void mC() {
   }
}
