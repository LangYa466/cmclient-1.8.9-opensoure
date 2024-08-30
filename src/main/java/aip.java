import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Map;

public final class aip extends Thread {
   private boolean KV;
   private bW dAA;
   private final Map dAB;
   private boolean dAC;
   private final ais dAD = new ais();
   private final OffsetDateTime dAE;
   private final aa dAF;
   private final hS dAG;

   public void o(mL var1) {
      if (this.J() && this.ann()) {
         if (var1 == null) {
            this.dAD.iy((String)null);
            this.dAD.iA((String)null);
            this.dAD.iz((String)null);
            this.dAD.lc(272 & 29248);
            this.dAD.ld(-28144 & 292);
         } else {
            this.dAD.iy(y.q[7112 & 25326 & -17585 & 16204] + var1.Zd);
            this.dAD.iA(y.q[29691 & 2043 & -13479 & -1463] + var1.Zd);
            this.dAD.iz(var1.Zd);
            if (var1.Zb != null) {
               String[] var2 = bO.i(var1.Zb).replaceAll(y.q[-6401 & -22550 & 4719 & 24155], q.q[26772 & -1298 & -27288 & -4072]).trim().split(q.q[20319 & 3967 & 4351 & 22783]);
               if (var2.length == (8242 & 18946)) {
                  this.dAD.lc(this.bQ(var2[8320 & 3648]));
                  this.dAD.ld(this.bQ(var2[-31703 & 20753]));
               } else {
                  this.dAD.lc(11394 & 20544);
                  this.dAD.ld(17944 & -22363);
               }
            }
         }
      }
   }

   public boolean J() {
      return this.dAF.J();
   }

   public void cZ(boolean var1) {
      this.dAG.Bn.atI().info(y.q[29406 & -15490 & 10111 & 638]);
      if (this.ann()) {
         this.dAA.close();
      }

      this.dAC = (boolean)(-31872 & 16456);
      if (var1) {
         this.interrupt();
      }

   }

   public aip(hS var1, aa var2) {
      super(y.q[-28985 & 9159 & 19295 & 19287]);
      this.dAG = var1;
      this.dAF = var2;
      this.dAB = new aiq(this);
      this.dAE = OffsetDateTime.now();
   }

   // $FF: synthetic method
   static ais q(aip var0) {
      return var0.dAD;
   }

   public void run() {
      while(!this.isInterrupted()) {
         try {
            boolean var1 = this.ann();
            if (!this.J()) {
               if (var1) {
                  this.cZ((boolean)(17415 & -32768));
               }

               Thread.sleep(109334506L & 5790619140180083705L);
            } else if (!var1) {
               this.init();
               Thread.sleep(-5767114915672650776L & 5767114915303135212L);
            } else {
               cf var2 = new cf();
               var2.w(this.dAE);
               if (this.dAD.axb() != null && !this.dAD.axb().isEmpty()) {
                  var2.q(this.dAD.axb(), this.dAD.axa(), Math.max(this.dAD.axa() + (12581 & -32759), this.dAD.awX()));
               }

               if (this.dAD.awY() != null && !this.dAD.awY().isEmpty()) {
                  var2.g(this.dAD.awY());
               }

               String var3 = uI.q(y.q[-5269 & -421 & 17243 & 8799]);
               if (var3 != null && !var3.equals(y.q[-17825 & -18849 & 1755 & 1739])) {
                  int var4 = this.dAG.fi() != null && this.dAG.Cx != null && this.dAG.CM != null && !(this.dAG.Cx instanceof jj) && !(this.dAG.Cx instanceof iW) && !(this.dAG.Cx instanceof li) && !(this.dAG.Cx instanceof js) && !(this.dAG.Cx instanceof bF) && !(this.dAG.Cx instanceof bD) ? -32757 & 14529 : 10624 & 17021;
                  String var5;
                  if (var4 != 0) {
                     var5 = y.q[1869 & -24721 & 4829 & -19473];
                  } else if (this.dAG.fi() == null) {
                     if (this.dAG.fp() && this.dAG.CM != null) {
                        String var10000 = y.q[10831 & -30098 & 23134 & 22142];
                        String var10001 = w.q[-13861 & 17375 & -18949 & 13787];
                        Object[] var10002 = new Object[-31231 & 10435];
                        var10002[21128 & 21] = uI.q(y.q[10847 & 24447 & -26657 & -31025] + this.dAG.Cu.YP.bY());
                        var5 = XH.q(var10000, var10001, var10002);
                     } else {
                        var5 = XH.eD(y.q[-17580 & 27476 & -31110 & -10500]);
                        if (this.dAD.afK()) {
                           this.o((mL)null);
                        }
                     }
                  } else if (this.dAG.CM != null) {
                     String var11 = y.q[-21669 & -24839 & 7007 & 599];
                     String var14 = w.q[-11269 & 24539 & -24065 & -19973];
                     Object[] var17 = new Object[901 & 21507];
                     var17[-32575 & 2080] = this.dAF.ds.af() ? this.dAG.fi().Zd : XH.eD(y.q[21078 & 9214 & 30687 & 25307]);
                     var5 = XH.q(var11, var14, var17);
                  } else {
                     var5 = XH.eD(y.q[31354 & 25338 & -23948 & -27052]);
                     if (this.dAD.afK()) {
                        this.o((mL)null);
                     }
                  }

                  String var6 = var4 != 0 ? y.q[32379 & -22789 & 17107 & 23251] : (this.dAG.fp() ? y.q[16086 & 15316 & -12451 & 21373] : (this.dAG.fi() != null ? (this.dAF.ds.af() ? (String)this.dAB.getOrDefault(this.dAG.fi().Zd.toLowerCase(), y.q[-13729 & 25461 & 4095 & -28801]) : y.q[18301 & -25641 & -9609 & -1195]) : y.q[-28938 & 3031 & -1193 & 855]));
                  String var12 = y.q[-11529 & -7553 & 3935 & -26625];
                  String var15 = w.q[-12801 & -6689 & 987 & 9179];
                  Object[] var18 = new Object[5322 & -30202];
                  int var10004 = -16319 & 1322;
                  this.dAG.Bn.getClass();
                  var18[var10004] = q.q[-22849 & 13495 & 5631 & 6654];
                  var10004 = -28647 & 1537;
                  this.dAG.Bn.getClass();
                  var18[var10004] = q.q[-10057 & 8191 & 25279 & 8895];
                  String var7 = XH.q(var12, var15, var18);
                  var2.w(w.q[-11415 & 9081 & 29686 & 12662], this.iw(var7));
                  var2.q(var6, this.iw(var5));
                  var12 = y.q[17118 & 13151 & -30856 & -27816];
                  var15 = w.q[31231 & -16901 & 3547 & 2043];
                  var18 = new Object[21569 & 10657];
                  var18[-30196 & 16800] = this.dAF.dt.af() ? this.dAG.fD().XD() : XH.eD(y.q[-10414 & -11269 & -29089 & 32342]);
                  String var8 = XH.q(var12, var15, var18);
                  var2.d(this.iw(var3)).j(this.iw(var8));
                  this.dAA.q(var2.bP());
                  Thread.sleep(105516009L & -2748413071107963928L);
               } else {
                  var2.d(y.q[23134 & 6764 & -22947 & -22945]);
                  var2.k(w.q[-25115 & -27287 & -9860 & 374]);
                  this.dAA.q(var2.bP());
                  Thread.sleep(541151208L & 3191653154809357290L);
               }
            }
         } catch (InterruptedException var9) {
            ;
         } catch (Throwable var10) {
            this.dAG.Bn.atI().warn(y.q[11133 & 3071 & 5085 & 12889], var10);
            this.cZ((boolean)(213 & 5129));
            return;
         }
      }

   }

   private int bQ(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var3) {
         return 9032 & 22528;
      }
   }

   // $FF: synthetic method
   static hS w(aip var0) {
      return var0.dAG;
   }

   // $FF: synthetic method
   static boolean q(aip var0, boolean var1) {
      return var0.dAC = var1;
   }

   public boolean ann() {
      return (boolean)(this.dAC && this.isAlive() && this.dAA != null && this.dAA.bF() == cj.mh ? -28399 & 24705 : 4353 & -31164);
   }

   private String iw(String var1) {
      return new String(var1.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
   }

   public void init() {
      this.dAC = (boolean)(537 & -15098);
      if (this.ann()) {
         this.dAA.close();
      }

      if (!this.J()) {
         if (!this.KV) {
            this.dAG.Bn.atI().info(y.q[12030 & 22395 & -32165 & 1630]);
            this.KV = (boolean)(199 & 8193);
         }

      } else {
         this.dAG.Bn.atI().info(y.q[-29825 & -10245 & 10847 & 12031]);
         this.dAA = new bW(1107051472603063213L & 1107051472669735074L);
         this.dAA.q(new air(this));

         try {
            this.dAA.q();
         } catch (cn var5) {
            this.dAA = null;
            this.dAC = (boolean)(-28448 & 1559);
            this.dAG.Bn.atI().warn(y.q[-24708 & -18596 & 23263 & 2815]);

            try {
               Thread.sleep(971055171054922344L & -971055172587164960L);
            } catch (InterruptedException var4) {
               ;
            }
         } catch (Exception var6) {
            this.dAA = null;
            this.dAC = (boolean)(17696 & -26619);
            this.dAG.Bn.atI().error(y.q[-27043 & -6563 & 15231 & -35], var6);

            try {
               Thread.sleep(-4483928986325036054L & 4483928984920561652L);
            } catch (InterruptedException var3) {
               ;
            }
         }

         if (!this.KV) {
            this.KV = (boolean)(11907 & 16641);
         }

      }
   }
}
