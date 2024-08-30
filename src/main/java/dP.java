import java.util.List;

public class dp extends cv {
   public static final hu os = hu.x(q.q[31685 & 2017]);
   public static final hw ot = hw.q(e.q[196 & -14124], dq.class);

   public int u(hI var1) {
      dq var2 = (dq)var1.w(ot);
      if (var2 == dq.ow) {
         var2 = dq.ou;
      }

      return var2.dm();
   }

   protected hA cY() {
      return new hA(this, new ht[]{ot, os});
   }

   public int e(hI var1) {
      return ((dq)var1.w(ot)).dm();
   }

   public int w(QI var1, NW var2) {
      hI var3 = var1.g(var2);
      return var3.ds() != this ? 0 : ((dq)var3.w(ot)).dm();
   }

   protected dp() {
      super(hn.zv);
      this.q(this.nr.ez().q(ot, dq.ou).q(os, Boolean.valueOf(false)));
      this.q(yl.aLz);
   }

   public hm w(hI var1) {
      return ((dq)var1.w(ot)).dn();
   }

   public hI J(int var1) {
      return this.cx().q(ot, dq.M(var1));
   }

   public void q(Fm var1, yl var2, List var3) {
      var3.add(new GX(this, 1, dq.ou.dm()));
      var3.add(new GX(this, 1, dq.ov.dm()));
      var3.add(new GX(this, 1, dq.ow.dm()));
   }

   public hI q(hI var1, Qx var2, NW var3) {
      if (var1.w(ot) == dq.ow) {
         cv var4 = var2.g(var3.Vi()).ds();
         var1 = var1.q(os, Boolean.valueOf(var4 == Ea.biM || var4 == Ea.bhe));
      }

      return var1;
   }
}
