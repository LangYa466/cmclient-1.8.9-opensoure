import java.util.List;

public class eQ extends es {
   public static final hw sd = hw.q(e.q[198 & -29972], ff.class, new eR());

   public int u(hI var1) {
      return ((ff)var1.w(sd)).dm();
   }

   protected GX y(hI var1) {
      return new GX(Fm.C(this), 1, ((ff)var1.w(sd)).dm());
   }

   public int t(hI var1) {
      if (var1.ds() != this) {
         return super.t(var1);
      } else {
         ff var2 = (ff)var1.w(sd);
         return var2 == ff.sC ? Qo.YW() : (var2 == ff.sD ? Qo.YX() : super.t(var1));
      }
   }

   public int q(Qx var1, NW var2, int var3) {
      hI var4 = var1.g(var2);
      if (var4.ds() == this) {
         ff var5 = (ff)var4.w(sd);
         if (var5 == ff.sC) {
            return Qo.YW();
         }

         if (var5 == ff.sD) {
            return Qo.YX();
         }
      }

      return super.q(var1, var2, var3);
   }

   public void q(Fm var1, yl var2, List var3) {
      var3.add(new GX(var1, 1, ff.sB.dm()));
      var3.add(new GX(var1, 1, ff.sC.dm()));
      var3.add(new GX(var1, 1, ff.sD.dm()));
      var3.add(new GX(var1, 1, ff.sE.dm()));
   }

   protected hA cY() {
      return new hA(this, new ht[]{sd, rp, rq});
   }

   protected void t(QI var1, NW var2, hI var3, int var4) {
      if (var3.w(sd) == ff.sB && var1.bXs.nextInt(var4) == 0) {
         q(var1, var2, new GX(Et.bnj, 1, 0));
      }

   }

   protected int s(hI var1) {
      return var1.w(sd) == ff.sE ? 40 : super.s(var1);
   }

   public int e(hI var1) {
      int var2 = 0;
      var2 = var2 | ((ff)var1.w(sd)).dm();
      if (!((Boolean)var1.w(rq)).booleanValue()) {
         var2 |= 4;
      }

      if (((Boolean)var1.w(rp)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public void q(QI var1, DD var2, NW var3, hI var4, No var5) {
      if (!var1.bXF && var2.FD() != null && var2.FD().do1() == Et.bnF) {
         var2.w(Nj.bKr[cv.w(this)]);
         q(var1, var3, new GX(Fm.C(this), 1, ((ff)var4.w(sd)).dm()));
      } else {
         super.q(var1, var2, var3, var4, var5);
      }

   }

   public eQ() {
      this.q(this.nr.ez().q(sd, ff.sB).q(rp, Boolean.valueOf(true)).q(rq, Boolean.valueOf(true)));
   }

   public ff W(int var1) {
      return ff.aa((var1 & 3) % 4);
   }

   public hI J(int var1) {
      return this.cx().q(sd, this.W(var1)).q(rq, Boolean.valueOf((var1 & 4) == 0)).q(rp, Boolean.valueOf((var1 & 8) > 0));
   }
}
