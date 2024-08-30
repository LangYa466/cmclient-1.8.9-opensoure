import com.mojang.authlib.GameProfile;

public class iP extends iO {
   private double Fh;
   private double Fi;
   private double Fj;
   private double Fk;
   private boolean Fl;
   private int Fm;
   private double Fn;

   public void q(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.Fn = var1;
      this.Fj = var3;
      this.Fi = var5;
      this.Fh = (double)var7;
      this.Fk = (double)var8;
      this.Fm = var9;
   }

   public void q(int var1, GX var2) {
      if (var1 == 0) {
         this.bdM.bft[this.bdM.bfu] = var2;
      } else {
         this.bdM.bfs[var1 - 1] = var2;
      }

   }

   public boolean q(int var1, String var2) {
      return false;
   }

   public boolean q(Oz var1, float var2) {
      return true;
   }

   public void hu() {
      if (this.Fm > 0) {
         double var1 = this.aNZ + (this.Fn - this.aNZ) / (double)this.Fm;
         double var3 = this.aNK + (this.Fj - this.aNK) / (double)this.Fm;
         double var5 = this.aOt + (this.Fi - this.aOt) / (double)this.Fm;

         double var7;
         for(var7 = this.Fh - (double)this.aOn; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.aOn = (float)((double)this.aOn + var7 / (double)this.Fm);
         this.aNN = (float)((double)this.aNN + (this.Fk - (double)this.aNN) / (double)this.Fm);
         --this.Fm;
         this.p(var1, var3, var5);
         this.g(this.aOn, this.aNN);
      }

      this.bdE = this.bep;
      this.zs();
      if (!aew.atw().atS().bK.af()) {
         float var9 = Pq.B(this.aOd * this.aOd + this.aOL * this.aOL);
         float var2 = (float)Math.atan(-this.aOO * 0.20000000298023224D) * 15.0F;
         if (var9 > 0.1F) {
            var9 = 0.1F;
         }

         if (!this.aNG || this.zA() <= 0.0F) {
            var9 = 0.0F;
         }

         if (this.aNG || this.zA() <= 0.0F) {
            var2 = 0.0F;
         }

         this.bep += (var9 - this.bep) * 0.4F;
         this.aQU += (var2 - this.aQU) * 0.8F;
      }
   }

   public void q(OX var1) {
      hS.eV().BZ.iA().e(var1);
   }

   public iP(QI var1, GameProfile var2) {
      super(var1, var2);
      this.aNC = 0.0F;
      this.aOm = true;
      this.bdx = 0.25F;
      this.aOK = 10.0D;
   }

   public NW dt() {
      return new NW(this.aNZ + 0.5D, this.aNK + 0.5D, this.aOt + 0.5D);
   }

   public void hv() {
      this.bdx = 0.0F;
      super.hv();
      this.aQA = this.aQX;
      double var1 = this.aNZ - this.aOf;
      double var3 = this.aOt - this.aNW;
      float var5 = Pq.B(var1 * var1 + var3 * var3) * 4.0F;
      if (var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.aQX += (var5 - this.aQX) * 0.4F;
      this.aQK += this.aQX;
      if (!this.Fl && this.xU() && this.bdM.bft[this.bdM.bfu] != null) {
         GX var6 = this.bdM.bft[this.bdM.bfu];
         this.e(this.bdM.bft[this.bdM.bfu], var6.do1().U(var6));
         this.Fl = true;
      } else if (this.Fl && !this.xU()) {
         this.FQ();
         this.Fl = false;
      }

   }
}
