public class adw extends adx {
   protected float gK;
   protected float gJ;

   public void M(float var1, float var2) {
      this.N(this.ay() * (var1 - 1.0F), this.ax() * (var2 - 1.0F));
   }

   public void N(float var1, float var2) {
      this.e(this.F() - var1);
      this.w(this.E() - var2);
      this.ck(this.ay() + var1 * 2.0F);
      this.t(this.ax() + var2 * 2.0F);
   }

   public float ay() {
      return this.gK;
   }

   public void m(float var1, float var2, float var3, float var4) {
      this.e(var1);
      this.w(var2);
      this.d(var3, var4);
   }

   public void w(adw var1) {
      this.m(var1.F(), var1.E(), var1.ay(), var1.ax());
   }

   public float ax() {
      return this.gJ;
   }

   public void t(float var1) {
      if (var1 != this.gJ) {
         this.dhr = (boolean)(6657 & 9217);
         this.gJ = var1;
         this.cAL = this.bUb + var1;
      }

   }

   public String toString() {
      return t.q[2813 & 635 & -11265 & -7175] + this.gK + q.q[-11913 & -15237 & 4947 & 6231] + this.gJ + q.q[2972 & 7071 & 22526 & -15361];
   }

   public adx q(adH var1) {
      this.arD();
      adv var2 = new adv();
      float[] var3 = new float[this.dhs.length];
      var1.q(this.dhs, 10242 & 957, var3, 5284 & 10578, this.dhs.length / (16594 & 10242));
      var2.dhs = var3;
      var2.ara();
      var2.arD();
      return var2;
   }

   private boolean q(adk var1) {
      return var1.e(this);
   }

   public adw(float var1, float var2, float var3, float var4) {
      this.bUa = var1;
      this.bUb = var2;
      this.gK = var3;
      this.gJ = var4;
      this.cAH = var1 + var3;
      this.cAL = var2 + var4;
      this.arD();
   }

   public boolean e(adx var1) {
      if (var1 instanceof adw) {
         adw var2 = (adw)var1;
         if (this.bUa <= var2.bUa + var2.gK && this.bUa + this.gK >= var2.bUa) {
            return (boolean)(this.bUb <= var2.bUb + var2.gJ && this.bUb + this.gJ >= var2.bUb ? -24547 & 1539 : 617 & 17794);
         } else {
            return (boolean)(17425 & 12);
         }
      } else {
         return var1 instanceof adk ? this.q((adk)var1) : super.e(var1);
      }
   }

   protected void ard() {
      float var1 = this.gK;
      float var2 = this.gJ;
      this.dhs = new float[17468 & 2056];
      this.dhs[-28096 & 10249] = this.bUa;
      this.dhs[2307 & -31675] = this.bUb;
      this.dhs[2050 & 6034] = this.bUa + var1;
      this.dhs[12355 & 16947] = this.bUb;
      this.dhs[16526 & 564] = this.bUa + var1;
      this.dhs[18439 & 12533] = this.bUb + var2;
      this.dhs[3246 & -16378] = this.bUa;
      this.dhs[4551 & 9231] = this.bUb + var2;
      this.cAH = this.dhs[526 & -14014];
      this.cAL = this.dhs[8229 & 261];
      this.cAK = this.dhs[4664 & -32444];
      this.cAJ = this.dhs[16745 & -24575];
      this.ara();
      this.aqX();
   }

   public boolean F(float var1, float var2) {
      if (var1 <= this.F()) {
         return (boolean)(9480 & 4322);
      } else if (var2 <= this.E()) {
         return (boolean)(813 & 4178);
      } else if (var1 >= this.cAH) {
         return (boolean)(1537 & 2210);
      } else {
         return (boolean)(var2 >= this.cAL ? -32240 & 5420 : 3331 & 16897);
      }
   }

   public static boolean y(float var0, float var1, float var2, float var3, float var4, float var5) {
      return (boolean)(var0 >= var2 && var1 >= var3 && var0 <= var2 + var4 && var1 <= var3 + var5 ? 65 & -21495 : 1 & 3130);
   }

   public void ck(float var1) {
      if (var1 != this.gK) {
         this.dhr = (boolean)(-2815 & 205);
         this.gK = var1;
         this.cAH = this.bUa + var1;
      }

   }

   public void d(float var1, float var2) {
      this.ck(var1);
      this.t(var2);
   }
}
