import java.util.UUID;

public class Ct extends CM {
   private static final UUID ban = UUID.fromString(p.q[5025 & 624]);
   private int bao;
   private UUID bap;
   private int baq;
   private static final Bf bar = (new Bf(ban, t.q[20133 & 4323], 0.05D, 0)).ao(false);

   public void t(HL var1) {
      super.t(var1);
      var1.q(p.q[-7461 & 4635], (short)this.bao);
      if (this.bap != null) {
         var1.a(p.q[572 & 540], this.bap.toString());
      } else {
         var1.a(p.q[17053 & -32132], q.q[25733 & 4106]);
      }

   }

   public zJ q(Qq var1, zJ var2) {
      super.q(var1, var2);
      this.aL(false);
      return var2;
   }

   protected void yR() {
      Bj var1 = this.q(zR.aSd);
      if (this.Dy()) {
         if (!this.yp() && !var1.w(bar)) {
            var1.e(bar);
         }

         --this.bao;
      } else if (var1.w(bar)) {
         var1.r(bar);
      }

      if (this.baq > 0 && --this.baq == 0) {
         this.q(p.q[571 & 3866], this.zw() * 2.0F, ((this.oF.nextFloat() - this.oF.nextFloat()) * 0.2F + 1.0F) * 1.8F);
      }

      if (this.bao > 0 && this.bap != null && this.zU() == null) {
         DD var2 = this.vR.a(this.bap);
         this.h(var2);
         this.aQt = var2;
         this.aQY = this.Ab();
      }

      super.yR();
   }

   protected String zv() {
      return p.q[606 & -31810];
   }

   protected String zC() {
      return p.q[19999 & -23969];
   }

   // $FF: synthetic method
   static void q(Ct var0, zk var1) {
      var0.O(var1);
   }

   public boolean Dy() {
      return this.bao > 0;
   }

   public boolean o(DD var1) {
      return false;
   }

   public void r(HL var1) {
      super.r(var1);
      this.bao = var1.bI(p.q[25247 & 7739]);
      String var2 = var1.bG(p.q[18172 & -29924]);
      if (var2.length() > 0) {
         this.bap = UUID.fromString(var2);
         DD var3 = this.vR.a(this.bap);
         this.h(var3);
         if (var3 != null) {
            this.aQt = var3;
            this.aQY = this.Ab();
         }
      }

   }

   public boolean q(Oz var1, float var2) {
      if (this.q(var1)) {
         return false;
      } else {
         zk var3 = var1.Wv();
         if (var3 instanceof DD) {
            this.O(var3);
         }

         return super.q(var1, var2);
      }
   }

   public boolean yy() {
      return this.vR.Kq() != Qr.bWe;
   }

   protected void Dz() {
      this.aPM.q(1, new Cu(this));
      this.aPM.q(2, new Cv(this));
   }

   public void h(zz var1) {
      super.h(var1);
      if (var1 != null) {
         this.bap = var1.ym();
      }

   }

   private void O(zk var1) {
      this.bao = 400 + this.oF.nextInt(400);
      this.baq = this.oF.nextInt(40);
      if (var1 instanceof zz) {
         this.h((zz)var1);
      }

   }

   protected void r(boolean var1, int var2) {
      int var3 = this.oF.nextInt(2 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.r(Et.bnc, 1);
      }

      var3 = this.oF.nextInt(2 + var2);

      for(int var6 = 0; var6 < var3; ++var6) {
         this.r(Et.bln, 1);
      }

   }

   protected void zP() {
      this.r(Et.blD, 1);
   }

   protected void yJ() {
      super.yJ();
      this.q(baQ).h(0.0D);
      this.q(zR.aSd).h(0.23000000417232513D);
      this.q(zR.aSb).h(5.0D);
   }

   protected String zp() {
      return p.q[6717 & -14563];
   }

   public boolean yT() {
      return this.vR.q(this.xE(), this) && this.vR.q(this, this.xE()).isEmpty() && !this.vR.p(this.xE());
   }

   public void hv() {
      super.hv();
   }

   protected void w(Qq var1) {
      this.q(0, new GX(Et.blG));
   }

   public Ct(QI var1) {
      super(var1);
      this.aOI = true;
   }
}
