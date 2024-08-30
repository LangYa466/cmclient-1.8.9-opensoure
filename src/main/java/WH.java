import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class wh extends wd {
   public int vE() {
      return 2;
   }

   public List q(wZ var1, String[] var2, NW var3) {
      return var2.length > 0 && var2.length <= 3 ? w(var2, 0, var3) : (var2.length > 3 && var2.length <= 6 ? w(var2, 3, var3) : (var2.length > 6 && var2.length <= 9 ? w(var2, 6, var3) : (var2.length == 10 ? q(var2, new String[]{w.q[2665 & 21497], e.q[403 & 390], u.q[971 & -19637]}) : (var2.length == 11 ? q(var2, new String[]{q.q[990 & -19802], y.q[9702 & 390], u.q[-31793 & 4937]}) : (var2.length == 12 && u.q[-15525 & 1867].equals(var2[9]) ? q(var2, cv.nk.Xx()) : null)))));
   }

   public void q(wZ var1, String[] var2) {
      if (var2.length < 9) {
         throw new xr(u.q[11079 & 999], new Object[0]);
      } else {
         var1.q(wG.aKa, 0);
         NW var3 = q(var1, var2, 0, false);
         NW var4 = q(var1, var2, 3, false);
         NW var5 = q(var1, var2, 6, false);
         Ur var6 = new Ur(var3, var4);
         Ur var7 = new Ur(var5, var5.e(var6.acO()));
         int var8 = var6.acM() * var6.acN() * var6.acS();
         if (var8 > 32768) {
            throw new wq(u.q[26617 & 840], new Object[]{var8, Integer.valueOf(32768)});
         } else {
            boolean var9 = false;
            cv var10 = null;
            int var11 = -1;
            if ((var2.length < 11 || !var2[10].equals(y.q[19894 & -19514]) && !var2[10].equals(u.q[3913 & 17353])) && var6.e(var7)) {
               throw new wq(u.q[842 & -30902], new Object[0]);
            } else {
               if (var2.length >= 11 && var2[10].equals(u.q[-31927 & 2907])) {
                  var9 = true;
               }

               if (var6.ckH >= 0 && var6.ckK < 256 && var7.ckH >= 0 && var7.ckK < 256) {
                  QI var12 = var1.vQ();
                  if (var12.q(var6) && var12.q(var7)) {
                     boolean var13 = false;
                     if (var2.length >= 10) {
                        if (var2[9].equals(e.q[5571 & 8626])) {
                           var13 = true;
                        } else if (var2[9].equals(u.q[2907 & 10095])) {
                           if (var2.length < 12) {
                              throw new xr(u.q[967 & 855], new Object[0]);
                           }

                           var10 = r(var1, var2[11]);
                           if (var2.length >= 13) {
                              var11 = y(var2[12], 0, 15);
                           }
                        }
                     }

                     ArrayList var14 = Lists.newArrayList();
                     ArrayList var15 = Lists.newArrayList();
                     ArrayList var16 = Lists.newArrayList();
                     LinkedList var17 = Lists.newLinkedList();
                     NW var18 = new NW(var7.ckF - var6.ckF, var7.ckH - var6.ckH, var7.ckJ - var6.ckJ);

                     for(int var19 = var6.ckJ; var19 <= var6.ckI; ++var19) {
                        for(int var20 = var6.ckH; var20 <= var6.ckK; ++var20) {
                           for(int var21 = var6.ckF; var21 <= var6.ckG; ++var21) {
                              NW var22 = new NW(var21, var20, var19);
                              NW var23 = var22.e(var18);
                              hI var24 = var12.g(var22);
                              if ((!var13 || var24.ds() != Ea.bjN) && (var10 == null || var24.ds() == var10 && (var11 < 0 || var24.ds().e(var24) == var11))) {
                                 No var25 = var12.h(var22);
                                 if (var25 != null) {
                                    HL var26 = new HL();
                                    var25.q(var26);
                                    var15.add(new wi(var23, var24, var26));
                                    var17.addLast(var22);
                                 } else if (!var24.ds().cE() && !var24.ds().cw()) {
                                    var16.add(new wi(var23, var24, (HL)null));
                                    var17.addFirst(var22);
                                 } else {
                                    var14.add(new wi(var23, var24, (HL)null));
                                    var17.addLast(var22);
                                 }
                              }
                           }
                        }
                     }

                     if (var9) {
                        for(NW var31 : var17) {
                           No var34 = var12.h(var31);
                           if (var34 instanceof EV) {
                              ((EV)var34).clear();
                           }

                           var12.q(var31, Ea.bim.cx(), 2);
                        }

                        for(NW var32 : var17) {
                           var12.q(var32, Ea.bjN.cx(), 3);
                        }
                     }

                     ArrayList var30 = Lists.newArrayList();
                     var30.addAll(var14);
                     var30.addAll(var15);
                     var30.addAll(var16);
                     List var33 = Lists.reverse(var30);

                     for(wi var40 : var33) {
                        No var45 = var12.h(var40.aJC);
                        if (var45 instanceof EV) {
                           ((EV)var45).clear();
                        }

                        var12.q(var40.aJC, Ea.bim.cx(), 2);
                     }

                     var8 = 0;

                     for(wi var41 : var30) {
                        if (var12.q(var41.aJC, var41.aJB, 2)) {
                           ++var8;
                        }
                     }

                     for(wi var42 : var15) {
                        No var46 = var12.h(var42.aJC);
                        if (var42.aJD != null && var46 != null) {
                           var42.aJD.a(q.q[13915 & 467], var42.aJC.aY());
                           var42.aJD.a(q.q[1493 & 2135], var42.aJC.aX());
                           var42.aJD.a(q.q[-30497 & 22103], var42.aJC.KO());
                           var46.w(var42.aJD);
                           var46.vv();
                        }

                        var12.q(var42.aJC, var42.aJB, 2);
                     }

                     for(wi var43 : var33) {
                        var12.w(var43.aJC, var43.aJB.ds());
                     }

                     List var39 = var12.q(var6, false);
                     if (var39 != null) {
                        for(QE var47 : var39) {
                           if (var6.i(var47.bWQ)) {
                              NW var48 = var47.bWQ.e(var18);
                              var12.q(var48, var47.ds(), (int)(var47.bWO - var12.Zz().adz()), var47.aVw);
                           }
                        }
                     }

                     if (var8 <= 0) {
                        throw new wq(u.q[-15540 & 4957], new Object[0]);
                     } else {
                        var1.q(wG.aKa, var8);
                        q(var1, this, u.q[4941 & 27469], new Object[]{var8});
                     }
                  } else {
                     throw new wq(u.q[18287 & 11230], new Object[0]);
                  }
               } else {
                  throw new wq(u.q[11103 & -27826], new Object[0]);
               }
            }
         }
      }
   }

   public String vJ() {
      return u.q[4935 & -23738];
   }

   public String e(wZ var1) {
      return u.q[1863 & 975];
   }
}
