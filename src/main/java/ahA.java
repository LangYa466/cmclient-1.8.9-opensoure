import java.util.ConcurrentModificationException;
import java.util.Set;

public class aha implements Runnable {
   public boolean dwr = (boolean)(5016 & 1061);
   private final cu dws;
   private final Set dwt;
   private final cp dwu;
   private final ahc dwv;
   public long dww;
   private final int dwx;
   private final cu dwy;
   private final cu dwz;
   private final hS dwA;
   private final int dwB;

   private boolean aq(zk var1) {
      if (!this.dwv.dwM.dwn) {
         return (boolean)(8769 & 6404);
      } else {
         return (boolean)(var1 instanceof Bv && ((Bv)var1).BK() ? 10433 & 1025 : 32 & -27874);
      }
   }

   private PX avH() {
      return this.dwA.gj().av(0.0F);
   }

   public aha(ahc var1) {
      this.dwv = var1;
      this.dwx = var1.dwM.dwp;
      this.dwB = var1.dwM.dwk;
      this.dww = -6412123814715981431L & 6412123813347207170L;
      this.dwz = new cu(0.0D, 0.0D, 0.0D);
      this.dwy = new cu(0.0D, 0.0D, 0.0D);
      this.dws = new cu(0.0D, 0.0D, 0.0D);
      this.dwu = var1.dwu;
      this.dwt = var1.dwM.dwm;
      this.dwA = var1.dwJ.dma;
   }

   public void run() {
      while(!Thread.currentThread().isInterrupted()) {
         try {
            Thread.sleep((long)this.dwx);
            if (this.dwA.Bn.atS().bD.af() && this.dwA.Cg != null && this.dwA.CM != null && this.dwA.CM.aOa > (8538 & 1546) && this.dwA.gj() != null) {
               PX var1 = null;
               if (this.dwv.dwM.dwo) {
                  var1 = this.dwA.CM.av(0.0F);
               } else {
                  var1 = this.avH();
               }

               if (this.dwr || var1.bUV != this.dwz.mJ || var1.bUW != this.dwz.mH || var1.bUX != this.dwz.mI) {
                  long var2 = System.currentTimeMillis();
                  this.dwr = (boolean)(17496 & -28416);
                  this.dwz.q(var1.bUV, var1.bUW, var1.bUX);
                  cu var4 = this.dwz;
                  this.dwu.ce();
                  int var5 = !this.dwA.CM.hm() && this.dwA.Br.aCr == 0 ? 2082 & 24585 : 5 & -30975;

                  for(No var8 : this.dwA.Cg.bXq) {
                     try {
                        ;
                     } catch (NullPointerException | ConcurrentModificationException var13) {
                        break;
                     }

                     if (!this.dwt.contains(var8.LQ().cM())) {
                        ahb var7 = var8.xY();
                        if (!var7.avJ()) {
                           if (var5 != 0) {
                              var7.cX((boolean)(-28556 & 24576));
                           } else {
                              NW var9 = var8.eI();
                              if (var9.M(var1.bUV, var1.bUW, var1.bUX) < 0.8372093023255814D * 4892.444444444444D) {
                                 this.dwy.q((double)var9.aY(), (double)var9.aX(), (double)var9.KO());
                                 this.dws.q((double)var9.aY() + 1.0D, (double)var9.aX() + 1.0D, (double)var9.KO() + 1.0D);
                                 boolean var10 = this.dwu.q(this.dwy, this.dws, var4);
                                 var7.cX((boolean)(!var10 ? -14271 & 397 : 32 & 29385));
                              }
                           }
                        }
                     }
                  }

                  for(zk var18 : this.dwA.Cg.ZA()) {
                     try {
                        ;
                     } catch (NullPointerException | ConcurrentModificationException var12) {
                        break;
                     }

                     if (var18 != null) {
                        ahb var16 = var18.xY();
                        if (!var16.avJ()) {
                           if (var5 == 0 && !this.aq(var18)) {
                              if (var18.vP().a(var1) > (double)(this.dwv.dwM.dwq * this.dwv.dwM.dwq)) {
                                 var16.cX((boolean)(192 & 18432));
                              } else {
                                 NV var19 = var18.xE();
                                 if (var19.bNU - var19.bNW <= (double)this.dwB && var19.bNX - var19.bNT <= (double)this.dwB && var19.bNV - var19.bNY <= (double)this.dwB) {
                                    this.dwy.q(var19.bNW, var19.bNT, var19.bNY);
                                    this.dws.q(var19.bNU, var19.bNX, var19.bNV);
                                    boolean var11 = this.dwu.q(this.dwy, this.dws, var4);
                                    var16.cX((boolean)(!var11 ? 24897 & -32723 : 6408 & 580));
                                 } else {
                                    var16.cX((boolean)(4700 & 26786));
                                 }
                              }
                           } else {
                              var16.cX((boolean)(4105 & 320));
                           }
                        }
                     }
                  }

                  this.dww = System.currentTimeMillis() - var2;
               }
            }
         } catch (Exception var14) {
            this.dwv.dwJ.atI().error(a.q[25214 & -6786 & 5758 & 20606], var14);
         }
      }

      this.dwv.dwJ.atI().info(a.q[4095 & 19967 & -16257 & -32641]);
   }
}
