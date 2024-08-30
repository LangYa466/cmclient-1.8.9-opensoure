public class cL extends dk {
   public OS cn() {
      return OS.bSl;
   }

   public cL() {
      super(hn.zG, hm.zk);
      this.h(3.0F);
      this.q(yl.aLL);
   }

   public static void d(QI var0, NW var1) {
      OV.bSw.submit(new cM(var0, var1));
   }

   public void q(QI var1, NW var2, hI var3, zz var4, GX var5) {
      super.q(var1, var2, var3, var4, var5);
      if (var5.HS()) {
         No var6 = var1.h(var2);
         if (var6 instanceof Nu) {
            ((Nu)var6).bb(var5.tg());
         }
      }

   }

   public boolean cr() {
      return false;
   }

   public No q(QI var1, int var2) {
      return new Nu();
   }

   public int cC() {
      return 3;
   }

   public boolean cw() {
      return false;
   }

   public void q(QI var1, NW var2, hI var3, cv var4) {
      No var5 = var1.h(var2);
      if (var5 instanceof Nu) {
         ((Nu)var5).Uo();
         var1.e(var2, this, 1, 0);
      }

   }

   public boolean q(QI var1, NW var2, hI var3, DD var4, OK var5, float var6, float var7, float var8) {
      if (var1.bXF) {
         return true;
      } else {
         No var9 = var1.h(var2);
         if (var9 instanceof Nu) {
            var4.q((EV)((Nu)var9));
            var4.w(Nj.bJY);
         }

         return true;
      }
   }
}
