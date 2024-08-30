public class DA extends Dq {
   private float bdo;
   private float bdp;
   private float bdq;
   private boolean bdr;
   private float bds;
   private boolean bdt;

   public float Fx() {
      return this.Dy() ? 1.5393804F : (this.Ff() ? (0.55F - (20.0F - this.aNw.dx(18)) * 0.02F) * 3.1415927F : 0.62831855F);
   }

   public boolean q(CT var1) {
      if (var1 == this) {
         return false;
      } else if (!this.Ff()) {
         return false;
      } else if (!(var1 instanceof DA)) {
         return false;
      } else {
         DA var2 = (DA)var1;
         return !var2.Ff() ? false : (var2.Fg() ? false : this.DO() && var2.DO());
      }
   }

   public void hv() {
      super.hv();
      this.bdq = this.bdo;
      if (this.Fz()) {
         this.bdo += (1.0F - this.bdo) * 0.4F;
      } else {
         this.bdo += (0.0F - this.bdo) * 0.4F;
      }

      if (this.xA()) {
         this.bdt = true;
         this.bdr = false;
         this.bdp = 0.0F;
         this.bds = 0.0F;
      } else if ((this.bdt || this.bdr) && this.bdr) {
         if (this.bdp == 0.0F) {
            this.q(t.q[-30099 & 26221], this.zw(), (this.oF.nextFloat() - this.oF.nextFloat()) * 0.2F + 1.0F);
         }

         this.bds = this.bdp;
         this.bdp += 0.05F;
         if (this.bds >= 2.0F) {
            this.bdt = false;
            this.bdr = false;
            this.bds = 0.0F;
            this.bdp = 0.0F;
         }

         if (this.bdp > 0.4F) {
            float var1 = (float)this.xE().bNT;
            int var2 = (int)(Pq.bk((this.bdp - 0.4F) * 3.1415927F) * 7.0F);

            for(int var3 = 0; var3 < var2; ++var3) {
               float var4 = (this.oF.nextFloat() * 2.0F - 1.0F) * this.gK * 0.5F;
               float var5 = (this.oF.nextFloat() * 2.0F - 1.0F) * this.gK * 0.5F;
               this.vR.q(OP.bRp, this.aNZ + (double)var4, (double)(var1 + 0.8F), this.aOt + (double)var5, this.aOd, this.aOO, this.aOL);
            }
         }
      }

   }

   public int yU() {
      return this.Fg() ? 20 : super.yU();
   }

   protected float zw() {
      return 0.4F;
   }

   public boolean Fy() {
      return this.bdt;
   }

   public float aS(float var1) {
      return 0.75F + (this.bds + (this.bdp - this.bds) * var1) / 2.0F * 0.25F;
   }

   public void e(Fk var1) {
      this.aNw.e(20, Byte.valueOf((byte)(var1.Hl() & 15)));
   }

   public void t(HL var1) {
      super.t(var1);
      var1.s(t.q[8805 & -32155], this.Dy());
      var1.q(t.q[9078 & 751], (byte)this.FA().Hl());
   }

   public boolean Fz() {
      return this.aNw.dy(19) == 1;
   }

   protected String zv() {
      return t.q[18283 & 13039];
   }

   public float aT(float var1) {
      return (this.bdq + (this.bdo - this.bdq) * var1) * 0.15F * 3.1415927F;
   }

   public Fk FA() {
      return Fk.fc(this.aNw.dy(20) & 15);
   }

   public void f(zz var1) {
      super.f(var1);
      if (var1 == null) {
         this.bk(false);
      } else if (!this.Ff()) {
         this.bk(true);
      }

   }

   protected String zC() {
      return t.q[5884 & -32146];
   }

   public boolean o(DD var1) {
      GX var2 = var1.bdM.GE();
      if (this.Ff()) {
         if (var2 != null) {
            if (var2.do1() instanceof Gp) {
               Gp var3 = (Gp)var2.do1();
               if (var3.HP() && this.aNw.dx(18) < 20.0F) {
                  if (!var1.bdO.bfz) {
                     --var2.bsH;
                  }

                  this.z((float)var3.af(var2));
                  if (var2.bsH <= 0) {
                     var1.bdM.y(var1.bdM.bfu, (GX)null);
                  }

                  return true;
               }
            } else if (var2.do1() == Et.boc) {
               Fk var4 = Fk.fc(var2.dm());
               if (var4 != this.FA()) {
                  this.e(var4);
                  if (!var1.bdO.bfz && --var2.bsH <= 0) {
                     var1.bdM.y(var1.bdM.bfu, (GX)null);
                  }

                  return true;
               }
            }
         }

         if (this.x(var1) && !this.vR.bXF && !this.B(var2)) {
            this.bcO.an(!this.Fg());
            this.aQF = false;
            this.aPI.NG();
            this.f((zz)null);
         }
      } else if (var2 != null && var2.do1() == Et.bmA && !this.Dy()) {
         if (!var1.bdO.bfz) {
            --var2.bsH;
         }

         if (var2.bsH <= 0) {
            var1.bdM.y(var1.bdM.bfu, (GX)null);
         }

         if (!this.vR.bXF) {
            if (this.oF.nextInt(3) == 0) {
               this.ba(true);
               this.aPI.NG();
               this.f((zz)null);
               this.bcO.an(true);
               this.aC(20.0F);
               this.bp(var1.ym().toString());
               this.be(true);
               this.vR.q(this, (byte)7);
            } else {
               this.be(false);
               this.vR.q(this, (byte)6);
            }
         }

         return true;
      }

      return super.o(var1);
   }

   public void bj(boolean var1) {
      if (var1) {
         this.aNw.e(19, Byte.valueOf((byte)1));
      } else {
         this.aNw.e(19, Byte.valueOf((byte)0));
      }

   }

   // $FF: synthetic method
   public zp q(zp var1) {
      return this.p(var1);
   }

   public boolean B(GX var1) {
      return var1 == null ? false : (!(var1.do1() instanceof Gp) ? false : ((Gp)var1.do1()).HP());
   }

   public DA(QI var1) {
      super(var1);
      this.d(0.6F, 0.8F);
      ((LD)this.yM()).bw(true);
      this.aPR.q(1, new AM(this));
      this.aPR.q(2, this.bcO);
      this.aPR.q(3, new Ao(this, 0.4F));
      this.aPR.q(4, new zT(this, 1.0D, true));
      this.aPR.q(5, new Ak(this, 1.0D, 10.0F, 2.0F));
      this.aPR.q(6, new As(this, 1.0D));
      this.aPR.q(7, new AV(this, 1.0D));
      this.aPR.q(8, new zX(this, 8.0F));
      this.aPR.q(9, new AW(this, DD.class, 8.0F));
      this.aPR.q(9, new Ar(this));
      this.aPM.q(1, new AE(this));
      this.aPM.q(2, new AF(this));
      this.aPM.q(3, new An(this, true, new Class[0]));
      this.aPM.q(4, new AO(this, CT.class, false, new DB(this)));
      this.aPM.q(5, new Ay(this, Cz.class, false));
      this.ba(false);
   }

   public boolean q(zz var1, zz var2) {
      if (!(var1 instanceof BV) && !(var1 instanceof Cc)) {
         if (var1 instanceof DA) {
            DA var3 = (DA)var1;
            if (var3.Ff() && var3.Fi() == var2) {
               return false;
            }
         }

         return var1 instanceof DD && var2 instanceof DD && !((DD)var2).c((DD)var1) ? false : !(var1 instanceof CX) || !((CX)var1).Ep();
      } else {
         return false;
      }
   }

   protected String zp() {
      return this.Dy() ? t.q[-31769 & 3687] : (this.oF.nextInt(3) == 0 ? (this.Ff() && this.aNw.dx(18) < 10.0F ? t.q[17133 & 2664] : t.q[-9605 & 617]) : t.q[874 & 7786]);
   }

   public boolean yQ() {
      return !this.Dy() && super.yQ();
   }

   public int za() {
      return 8;
   }

   public DA p(zp var1) {
      DA var2 = new DA(this.vR);
      String var3 = this.As();
      if (var3 != null && var3.trim().length() > 0) {
         var2.bp(var3);
         var2.ba(true);
      }

      return var2;
   }

   public void ba(boolean var1) {
      super.ba(var1);
      if (var1) {
         this.q(zR.aSa).h(20.0D);
      } else {
         this.q(zR.aSa).h(8.0D);
      }

      this.q(zR.aSb).h(4.0D);
   }

   protected void mC() {
      super.mC();
      this.aNw.w(18, new Float(this.zA()));
      this.aNw.w(19, new Byte((byte)0));
      this.aNw.w(20, new Byte((byte)Fk.bqx.dm()));
   }

   public void q(byte var1) {
      if (var1 == 8) {
         this.bdr = true;
         this.bdp = 0.0F;
         this.bds = 0.0F;
      } else {
         super.q(var1);
      }

   }

   protected boolean zo() {
      return !this.Ff() && this.aOa > 2400;
   }

   protected void yJ() {
      super.yJ();
      this.q(zR.aSd).h(0.30000001192092896D);
      if (this.Ff()) {
         this.q(zR.aSa).h(20.0D);
      } else {
         this.q(zR.aSa).h(8.0D);
      }

      this.Ag().r(zR.aSb);
      this.q(zR.aSb).h(2.0D);
   }

   public void bk(boolean var1) {
      byte var2 = this.aNw.dy(16);
      if (var1) {
         this.aNw.e(16, Byte.valueOf((byte)(var2 | 2)));
      } else {
         this.aNw.e(16, Byte.valueOf((byte)(var2 & -3)));
      }

   }

   protected Fm yX() {
      return Fm.fe(-1);
   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else {
         zk var3 = var1.Wv();
         this.bcO.an(false);
         if (var3 != null && !(var3 instanceof DD) && !(var3 instanceof DM)) {
            var2 = (var2 + 1.0F) / 2.0F;
         }

         return super.q(var1, var2);
      }
   }

   protected void q(NW var1, cv var2) {
      this.q(t.q[636 & -15772], 0.15F, 1.0F);
   }

   public void hu() {
      super.hu();
      if (!this.vR.bXF && this.bdt && !this.bdr && !this.yw() && this.aNG) {
         this.bdr = true;
         this.bdp = 0.0F;
         this.bds = 0.0F;
         this.vR.q(this, (byte)8);
      }

      if (!this.vR.bXF && this.zc() == null && this.Dy()) {
         this.bk(false);
      }

   }

   protected void yR() {
      this.aNw.e(18, Float.valueOf(this.zA()));
   }

   public void r(HL var1) {
      super.r(var1);
      this.bk(var1.bL(t.q[16997 & -21785]));
      if (var1.d(t.q[8038 & 17135], 99)) {
         this.e(Fk.fc(var1.bN(t.q[-29978 & 13942])));
      }

   }

   public boolean H(zk var1) {
      boolean var2 = var1.q(Oz.n(this), (float)((int)this.q(zR.aSb).Bs()));
      if (var2) {
         this.e(this, var1);
      }

      return var2;
   }

   public float xC() {
      return this.gJ * 0.8F;
   }

   public boolean Dy() {
      return (this.aNw.dy(16) & 2) != 0;
   }

   public float z(float var1, float var2) {
      float var3 = (this.bds + (this.bdp - this.bds) * var1 + var2) / 1.8F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      } else if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return Pq.bk(var3 * 3.1415927F) * Pq.bk(var3 * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
   }
}
