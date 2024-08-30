import java.util.List;

public class ei extends dk {
   public static final hv qP = hv.q(q.q[103 & 23669], new ej());
   public static final hu qQ = hu.x(r.q[281 & -23604]);

   public OS cn() {
      return OS.bSk;
   }

   public boolean cv() {
      return true;
   }

   public void q(QI var1, NW var2, hI var3, NV var4, List var5, zk var6) {
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      super.q(var1, var2, var3, var4, var5, var6);
      float var7 = 0.125F;
      this.w(0.0F, 0.0F, 0.0F, var7, 1.0F, 1.0F);
      super.q(var1, var2, var3, var4, var5, var6);
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var7);
      super.q(var1, var2, var3, var4, var5, var6);
      this.w(1.0F - var7, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.q(var1, var2, var3, var4, var5, var6);
      this.w(0.0F, 0.0F, 1.0F - var7, 1.0F, 1.0F, 1.0F);
      super.q(var1, var2, var3, var4, var5, var6);
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public int cC() {
      return 3;
   }

   private void k(QI var1, NW var2, hI var3) {
      boolean var4 = !var1.aA(var2);
      if (var4 != ((Boolean)var3.w(qQ)).booleanValue()) {
         var1.q(var2, var3.q(qQ, Boolean.valueOf(var4)), 4);
      }

   }

   public boolean w(Qx var1, NW var2, OK var3) {
      return true;
   }

   public static boolean U(int var0) {
      return (var0 & 8) != 8;
   }

   public hI q(QI var1, NW var2, OK var3, float var4, float var5, float var6, int var7, zz var8) {
      OK var9 = var3.WK();
      if (var9 == OK.bQC) {
         var9 = OK.bQB;
      }

      return this.cx().q(qP, var9).q(qQ, Boolean.valueOf(true));
   }

   public boolean cr() {
      return false;
   }

   public void r(QI var1, NW var2, hI var3) {
      No var4 = var1.h(var2);
      if (var4 instanceof NK) {
         Fb.q(var1, var2, (NK)var4);
         var1.y(var2, this);
      }

      super.r(var1, var2, var3);
   }

   public boolean cw() {
      return false;
   }

   public ei() {
      super(hn.zl, hm.zh);
      this.q(this.nr.ez().q(qP, OK.bQB).q(qQ, Boolean.valueOf(true)));
      this.q(yl.aLN);
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   protected hA cY() {
      return new hA(this, new ht[]{qP, qQ});
   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      if (var1.bXF) {
         return true;
      } else {
         No var9 = var1.h(var2);
         if (var9 instanceof NK) {
            var4.q((EV)((NK)var9));
            var4.w(Nj.bKz);
         }

         return true;
      }
   }

   public void q(QI var1, NW var2, hI var3, zz var4, GX var5) {
      super.q(var1, var2, var3, var4, var5);
      if (var5.HS()) {
         No var6 = var1.h(var2);
         if (var6 instanceof NK) {
            ((NK)var6).bx(var5.tg());
         }
      }

   }

   public int y(QI var1, NW var2) {
      return Ev.r(var1.h(var2));
   }

   public void e(Qx var1, NW var2) {
      this.w(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public No q(QI var1, int var2) {
      return new NK();
   }

   public void w(QI var1, NW var2, hI var3) {
      this.k(var1, var2, var3);
   }

   public int e(hI var1) {
      int var2 = 0;
      var2 = var2 | ((OK)var1.w(qP)).tb();
      if (!((Boolean)var1.w(qQ)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      this.k(var1, var2, var3);
   }

   public hI J(int var1) {
      return this.cx().q(qP, N(var1)).q(qQ, Boolean.valueOf(U(var1)));
   }

   public static OK N(int var0) {
      return OK.gD(var0 & 7);
   }
}
