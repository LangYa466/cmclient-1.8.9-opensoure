import com.google.common.base.Predicate;
import java.util.Random;

public class gl extends dk {
   private hK vF;
   private static final Predicate vG = new gm();
   public static final hu vH = hu.x(o.q[20096 & -32203]);
   public static final hv vI = hv.c(q.q[877 & -18203]);
   private hK vJ;

   protected hK dQ() {
      if (this.vJ == null) {
         this.vJ = hO.eP().w(o.q[-28161 & 9215], q.q[-19040 & 2467], w.q[3032 & 13001]).q('#', hG.q(hN.j(Ea.bhX))).q('^', vG).q('~', hG.q(hN.j(Ea.bjN))).eS();
      }

      return this.vJ;
   }

   public void e(Qx var1, NW var2) {
      // $FF: Couldn't be decompiled
   }

   public hI J(int var1) {
      return this.cx().q(vI, OK.gD(var1 & 7)).q(vH, Boolean.valueOf((var1 & 8) > 0));
   }

   public void q(QI var1, NW var2, NU var3) {
      if (var3.Va() == 1 && var2.aX() >= 2 && var1.Kq() != Qr.bWe && !var1.bXF) {
         hK var4 = this.dQ();
         hM var5 = var4.Y(var1, var2);
         if (var5 != null) {
            for(int var6 = 0; var6 < 3; ++var6) {
               hG var7 = var5.d(var6, 0, 0);
               var1.q(var7.eI(), var7.dO().q(vH, Boolean.valueOf(true)), 2);
            }

            for(int var12 = 0; var12 < var4.eK(); ++var12) {
               for(int var14 = 0; var14 < var4.eJ(); ++var14) {
                  hG var8 = var5.d(var12, var14, 0);
                  var1.q(var8.eI(), Ea.bjN.cx(), 2);
               }
            }

            NW var13 = var5.d(1, 0, 0).eI();
            Bq var15 = new Bq(var1);
            NW var16 = var5.d(1, 2, 0).eI();
            var15.q((double)var16.aY() + 0.5D, (double)var16.aX() + 0.55D, (double)var16.KO() + 0.5D, var5.eO().WT() == OM.bQV ? 0.0F : 90.0F, 0.0F);
            var15.aQB = var5.eO().WT() == OM.bQV ? 0.0F : 90.0F;
            var15.BC();

            for(DD var10 : var1.q(DD.class, var15.xE().C(50.0D, 50.0D, 50.0D))) {
               var10.w(MX.bJs);
            }

            var1.p(var15);

            for(int var17 = 0; var17 < 120; ++var17) {
               var1.q(OP.bRP, (double)var13.aY() + var1.bXs.nextDouble(), (double)(var13.aX() - 2) + var1.bXs.nextDouble() * 3.9D, (double)var13.KO() + var1.bXs.nextDouble(), 0.0D, 0.0D, 0.0D);
            }

            for(int var18 = 0; var18 < var4.eK(); ++var18) {
               for(int var19 = 0; var19 < var4.eJ(); ++var19) {
                  hG var11 = var5.d(var18, var19, 0);
                  var1.w(var11.eI(), Ea.bjN);
               }
            }
         }
      }

   }

   public void q(QI var1, NW var2, hI var3, DD var4) {
      if (var4.bdO.bfz) {
         var3 = var3.q(vH, Boolean.valueOf(true));
         var1.q(var2, var3, 4);
      }

      super.q(var1, var2, var3, var4);
   }

   public int e(hI var1) {
      int var2 = 0;
      var2 = var2 | ((OK)var1.w(vI)).tb();
      if (((Boolean)var1.w(vH)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public Fm i(QI var1, NW var2) {
      return Et.bll;
   }

   protected hK dR() {
      if (this.vF == null) {
         this.vF = hO.eP().w(r.q[3069 & 2045], q.q[4528 & -7775], w.q[3784 & -32050]).q('#', hG.q(hN.j(Ea.bhX))).q('~', hG.q(hN.j(Ea.bjN))).eS();
      }

      return this.vF;
   }

   protected hA cY() {
      return new hA(this, new ht[]{vI, vH});
   }

   protected gl() {
      super(hn.zF);
      this.q(this.nr.ez().q(vI, OK.bQD).q(vH, Boolean.valueOf(false)));
      this.w(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
   }

   public String cP() {
      return PO.dn(o.q[3583 & 8702]);
   }

   public boolean cr() {
      return false;
   }

   public boolean cw() {
      return false;
   }

   public Fm q(hI var1, Random var2, int var3) {
      return Et.bll;
   }

   public boolean w(QI var1, NW var2, GX var3) {
      return var3.dm() == 1 && var2.aX() >= 2 && var1.Kq() != Qr.bWe && !var1.bXF && this.dR().Y(var1, var2) != null;
   }

   public void q(QI var1, NW var2, hI var3, float var4, int var5) {
   }

   public void r(QI var1, NW var2, hI var3) {
      if (!var1.bXF) {
         if (!((Boolean)var3.w(vH)).booleanValue()) {
            No var4 = var1.h(var2);
            if (var4 instanceof NU) {
               NU var5 = (NU)var4;
               GX var6 = new GX(Et.bll, 1, this.w(var1, var2));
               if (var5.Va() == 3 && var5.UY() != null) {
                  var6.l(new HL());
                  HL var7 = new HL();
                  HX.q(var7, var5.UY());
                  var6.Ie().w(r.q[-30979 & 2671], var7);
               }

               q(var1, var2, var6);
            }
         }

         super.r(var1, var2, var3);
      }

   }

   public NV e(QI var1, NW var2, hI var3) {
      this.e(var1, var2);
      return super.e(var1, var2, var3);
   }

   public int w(QI var1, NW var2) {
      No var3 = var1.h(var2);
      return var3 instanceof NU ? ((NU)var3).Va() : super.w(var1, var2);
   }

   public hI q(QI var1, NW var2, OK var3, float var4, float var5, float var6, int var7, zz var8) {
      return this.cx().q(vI, var8.xT()).q(vH, Boolean.valueOf(false));
   }

   public No q(QI var1, int var2) {
      return new NU();
   }
}
