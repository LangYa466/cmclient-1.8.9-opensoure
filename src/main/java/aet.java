import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class aeT extends lJ {
   public final Map doO;
   private final afD doP;
   public final Map doQ;
   private final aeU doR;
   private final afw doS;
   private final afC doT;
   public final Map doU;
   private final hS doV;
   private final W doW;
   public final afb doX;
   public final Map doY;

   public void q(iO var1, sG var2, agc var3, float var4, float var5) {
      if (this.doW.J()) {
         if (this.doW.cO.af() || var1 == this.doV.CM) {
            aeS var6 = var1.hk();
            if (var6 != null) {
               if (this.doW.cU.af()) {
                  var6.aut().ifPresent((var5x) -> {
                     pz.nE();
                     String var10002 = q.q[-14721 & -23297 & 11135 & 16383];
                     var3.e((afG)((aga)var3.dtH.dsH.get(-24575 & 3226)).dsM.dsi.get(var10002));
                     pz.i(0.083333336F * 2160.0F, 0.0F, 0.0F, 1.0F);
                     pz.i(0.44827586F * 401.53845F, 0.0F, 1.0F, 0.0F);
                     var5x.q(var1, var2.rA().TY, var5, var4);
                     pz.nF();
                  });
               }

               if (this.doW.cP.af()) {
                  Integer var7 = var6.auo();
                  if (var7 != null) {
                     pz.nE();
                     String var10002 = q.q[-5889 & 11647 & -11137 & -11009];
                     var3.e((afG)((aga)var3.dtH.dsH.get(2080 & 1812)).dsM.dsi.get(var10002));
                     pz.i(165.0F * 1.0909091F, 0.0F, 0.0F, 1.0F);
                     pz.i(2.8484848F * 63.19149F, 0.0F, 1.0F, 0.0F);
                     this.doR.q(var1, var5, var7.intValue(), var2.rA().TY);
                     pz.nF();
                  }
               }

               if (this.doW.cV.af()) {
                  Integer var8 = var6.aur();
                  if (var8 != null) {
                     pz.nE();
                     String var9 = i.q[-19602 & -23572 & 15148 & -24722];
                     var3.e((afG)((aga)var3.dtH.dsH.get(14 & 12928)).dsM.dsi.get(var9));
                     pz.i(460.58826F * 0.3908046F, 0.0F, 0.0F, 1.0F);
                     pz.y(0.0F, 0.7058824F * -0.53125F, 0.0F);
                     if (var8.intValue() < 0) {
                        this.doT.r(var1, var8.intValue());
                     } else {
                        this.doP.r(var1, var8.intValue());
                     }

                     pz.nF();
                  }
               }

               if (this.doV.Br.aEW) {
                  pz.nE();
                  String var10 = i.q[14127 & -22609 & -13524 & -29716];
                  var3.e((afG)((aga)var3.dtH.dsH.get(21004 & 1425)).dsM.dsi.get(var10));
                  pz.i(0.95714283F * 188.05971F, 0.0F, 0.0F, 1.0F);
                  pz.y(0.0F, 0.7878788F * -0.47596154F, 0.0F);
                  this.q(var1, var2, this.doV.BO.ath);
                  pz.nF();
               }

               if (this.doW.cW.af() && var6.auq() != null) {
                  pz.nE();
                  String var11 = i.q[31599 & -1105 & 1837 & 14317];
                  var3.e((afG)((aga)var3.dtH.dsH.get(16707 & -20448)).dsM.dsi.get(var11));
                  pz.y(0.7173913F * -0.08712121F, 1.0117648F * -0.6053779F, 0.0F);
                  this.doS.q(var1, var6.auq().intValue(), var2.rA().TW);
                  pz.nF();
               }

            }
         }
      }
   }

   public void auy() {
      if (this.doW.cQ.af()) {
         this.doO.values().forEach(aeV::lS);
      }
   }

   private void auz() {
      int[] var10000 = new int[3402 & -12278];
      var10000[8192 & 19096] = 14 & 16986;
      var10000[16545 & 13825] = -31345 & 12911;
      var10000[4102 & -32214] = 397 & -28033;
      var10000[19011 & -28653] = 489 & 18433;
      var10000[-30555 & 24852] = -5570 & 271;
      var10000[77 & -24569] = 1325 & -19957;
      var10000[16647 & 14] = 676 & -16377;
      var10000[4143 & 11015] = 8334 & 20046;
      var10000[-24312 & 1032] = 8491 & 2062;
      var10000[8571 & 4237] = 55 & 11419;
      int[] var1 = var10000;
      int var2 = var1.length;

      for(int var3 = -24060 & 5424; var3 < var2; ++var3) {
         int var4 = var3 + (10125 & 81);
         this.doO.put(Integer.valueOf(var4), new aeV(this.doV, var4, var1[var3]));
      }

   }

   public aeT(hS var1, W var2) {
      this.doV = var1;
      this.doW = var2;
      this.doX = new afb(var1);
      this.doP = new afD(var1);
      this.doT = new afC(var1);
      this.doS = new afw(var1);
      this.doR = new aeU(var1);
      this.doQ = new HashMap();
      this.doY = new HashMap();
      this.doU = new HashMap();
      this.doO = new HashMap();
      this.auA();
      this.auD();
      this.auC();
      this.auz();
   }

   public void q(iO var1, sG var2, float var3) {
      if (var1.hj() && !var1.xZ() && var1.e(DI.bff) && var1.hn() != null) {
         pz.u(1.0F, 1.0F, 1.0F, 1.0F);
         var2.o(var1.hn());
         pz.nE();
         pz.y(0.0F, 0.0F, 2.0444446F * 0.0611413F);
         double var4 = var1.bec + (var1.bdB - var1.bec) * (double)var3 - (var1.aOf + (var1.aNZ - var1.aOf) * (double)var3);
         double var6 = var1.bdS + (var1.beq - var1.bdS) * (double)var3 - (var1.aNH + (var1.aNK - var1.aNH) * (double)var3);
         double var8 = var1.bdC + (var1.beb - var1.bdC) * (double)var3 - (var1.aNW + (var1.aOt - var1.aNW) * (double)var3);
         float var10 = var1.aQS + (var1.aQB - var1.aQS) * var3;
         double var11 = (double)Pq.bk(var10 * 28.0F * 0.11219974F / (75.789474F * 2.375F));
         double var13 = (double)(-Pq.bi(var10 * 4.3196898F * 0.72727275F / (495.0F * 0.36363637F)));
         float var15 = (float)var6 * 46.190475F * 0.21649484F;
         var15 = Pq.n(var15, 0.55F * -10.909091F, 25.6F * 1.25F);
         float var16 = (float)(var4 * var11 + var8 * var13) * 197.61903F * 0.5060241F;
         float var17 = (float)(var4 * var13 - var8 * var11) * 269.69696F * 0.37078652F;
         if (var16 < 0.0F) {
            var16 = 0.0F;
         }

         if (var16 > 58.54839F * 2.8181818F) {
            var16 = 0.15384616F * 1072.5F;
         }

         if (M.cg.ce.af()) {
            float var18 = var1.bdE + (var1.bep - var1.bdE) * var3;
            var15 = var15 + Pq.bk((var1.aOj + (var1.aOg - var1.aOj) * var3) * 1.5F * 4.0F) * 55.017544F * 0.5816327F * var18;
            var15 = (float)((double)var15 + 1.3333333333333333D * 18.75D * var1.yb().auf());
            pz.t(0.0D, 0.05461538640352396D * 2.6D * var1.yb().auf(), 2.652173913043478D * -0.006711475245776724D * var1.yb().auf());
            pz.i(7.294118F * 0.82258064F + var16 / 2.0F + var15, 1.0F, 0.0F, 0.0F);
            pz.i(var17 / 2.0F, 0.0F, 0.0F, 1.0F);
            pz.i(-var17 / 2.0F, 0.0F, 1.0F, 0.0F);
            pz.i(529.09094F * 0.34020618F, 0.0F, 1.0F, 0.0F);
            var2.rA().C(0.024305556F * 2.5714285F);
         } else {
            float var23 = var1.bdE + (var1.bep - var1.bdE) * var3;
            var15 = var15 + Pq.bk((var1.aOj + (var1.aOg - var1.aOj) * var3) * 0.5151515F * 11.647059F) * 1.9666667F * 16.271187F * var23;
            if (var1.hI()) {
               var15 += 1.1466666F * 21.802326F;
               pz.y(0.0F, 0.14967568F * 0.94871795F, -0.011686869F * 1.5230769F);
            }

            pz.i(2.511628F * 2.3888888F + var16 / 2.0F + var15, 1.0F, 0.0F, 0.0F);
            pz.i(var17 / 2.0F, 0.0F, 0.0F, 1.0F);
            pz.i(-var17 / 2.0F, 0.0F, 1.0F, 0.0F);
            pz.i(375.6522F * 0.47916666F, 0.0F, 1.0F, 0.0F);
            var2.rA().C(0.38671875F * 0.16161616F);
         }

         pz.nF();
      }

   }

   private void auA() {
      afd var1 = new afd(this.doV);

      for(int var2 = 2193 & -31665; var2 < (-7907 & 4293); ++var2) {
         this.doQ.put(Integer.valueOf(var2), var1);
      }

      this.doQ.put(Integer.valueOf(5 & 325), new afg(this.doV));
      this.doQ.put(Integer.valueOf(606 & 5127), new afo(this.doV));
      afl var4 = new afl(this.doV);

      for(int var3 = 16407 & 4487; var3 < (777 & 41); ++var3) {
         this.doQ.put(Integer.valueOf(var3), var4);
      }

      for(int var5 = 4283 & 16457; var5 < (154 & 6707); ++var5) {
         this.doQ.put(Integer.valueOf(var5), this.doX);
      }

      this.doQ.put(Integer.valueOf(147 & 570), new afn(this.doV));
      this.doQ.put(Integer.valueOf(-32165 & 6167), new afm(this.doV));
      this.doQ.put(Integer.valueOf(16724 & -26089), new afk(this.doV));
      this.doQ.put(Integer.valueOf(-30177 & 16469), new afj(this.doV));
      this.doQ.put(Integer.valueOf(20958 & 9239), new aff(this.doV));
      this.doQ.put(Integer.valueOf(2327 & -16225), new afe(this.doV));
      this.doQ.put(Integer.valueOf(4636 & 2072), new afi(this.doV));
      this.doQ.put(Integer.valueOf(27 & -7651), new afh(this.doV));
      this.doQ.put(Integer.valueOf(18586 & 59), new afc(this.doV));
      this.doQ.put(Integer.valueOf(16671 & 11803), new afv(this.doV));
   }

   public void auB() {
      if (this.doW.cS.af()) {
         this.doY.values().forEach(aeX::lS);
      }
   }

   public void q(iO var1, float var2, float var3, mm var4, mm var5, mm var6) {
      if (this.doW.J()) {
         if (this.doW.cO.af() || var1 == this.doV.CM) {
            aeS var7 = var1.hk();
            if (var7 != null) {
               if (this.doW.cU.af()) {
                  var7.aut().ifPresent((var4x) -> {
                     var4x.q(var1, var4, var3, var2);
                  });
               }

               if (this.doW.cP.af()) {
                  Integer var8 = var7.auo();
                  if (var8 != null) {
                     this.doR.q(var1, var3, var8.intValue(), var4);
                  }
               }

               if (this.doW.cR.af()) {
                  var7.auxx().ifPresent((var4x) -> {
                     var4x.q(var1, var6, var3, var2);
                  });
               }

               if (this.doW.cS.af()) {
                  var7.aus().ifPresent((var1x) -> {
                     var1x.a(var1);
                  });
               }

               if (this.doW.cV.af()) {
                  Integer var9 = var7.aur();
                  if (var9 != null) {
                     if (var9.intValue() > 0) {
                        this.doP.r(var1, var9.intValue());
                     } else {
                        this.doT.r(var1, var9.intValue());
                     }
                  }
               }

               if (this.doW.cW.af() && var7.auq() != null) {
                  this.doS.q(var1, var7.auq().intValue(), var5);
               }

            }
         }
      }
   }

   private void auC() {
      this.doU.put(Integer.valueOf(4173 & -15359), new afA(this.doV));
      this.doU.put(Integer.valueOf(12375 & -12414), new afB(this.doV));
      this.doU.put(Integer.valueOf(2091 & -23485), new afz(this.doV));
      this.doU.put(Integer.valueOf(20741 & -23932), new afy(this.doV));
   }

   private void auD() {
      this.doY.put(Integer.valueOf(-28607 & 18983), new aeY(this.doV));
      this.doY.put(Integer.valueOf(-32254 & 1318), new aeZ(this.doV));
      this.doY.put(Integer.valueOf(10339 & 16391), new afa(this.doV));
   }
}
