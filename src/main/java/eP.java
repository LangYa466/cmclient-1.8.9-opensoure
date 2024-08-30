import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EP extends Ev {
   public int bpm;
   private String bpn;
   private QI aTy;
   private EV bpo;
   private EV bpp;
   private int bpq;
   private final DD bpr;
   private static final Logger bps = LogManager.getLogger();
   private NW bpt;

   public void as(int var1, int var2) {
      if (var1 == 0) {
         this.bpm = var2;
      }

   }

   public EP(DJ var1, QI var2, DD var3) {
      this(var1, var2, NW.bNZ, var3);
   }

   // $FF: synthetic method
   static EV q(EP var0) {
      return var0.bpo;
   }

   public void b(DD var1) {
      super.b(var1);
      if (!this.aTy.bXF) {
         for(int var2 = 0; var2 < this.bpo.CB(); ++var2) {
            GX var3 = this.bpo.es(var2);
            if (var3 != null) {
               var1.w(var3, false);
            }
         }
      }

   }

   public boolean q(DD var1) {
      return this.aTy.g(this.bpt).ds() != Ea.bjO ? false : var1.x((double)this.bpt.aY() + 0.5D, (double)this.bpt.aX() + 0.5D, (double)this.bpt.KO() + 0.5D) <= 64.0D;
   }

   // $FF: synthetic method
   static int w(EP var0) {
      return var0.bpq;
   }

   public void w(EV var1) {
      super.w(var1);
      if (var1 == this.bpo) {
         this.Hh();
      }

   }

   public EP(DJ var1, QI var2, NW var3, DD var4) {
      this.bpp = new EY();
      this.bpo = new EQ(this, i.q[17629 & 733], true, 2);
      this.bpt = var3;
      this.aTy = var2;
      this.bpr = var4;
      this.e(new Fe(this.bpo, 0, 27, 47));
      this.e(new Fe(this.bpo, 1, 76, 47));
      this.e(new ER(this, this.bpp, 2, 134, 47, var2, var3));

      for(int var5 = 0; var5 < 3; ++var5) {
         for(int var6 = 0; var6 < 9; ++var6) {
            this.e(new Fe(var1, var6 + var5 * 9 + 9, 8 + var6 * 18, 84 + var5 * 18));
         }
      }

      for(int var7 = 0; var7 < 9; ++var7) {
         this.e(new Fe(var1, var7, 8 + var7 * 18, 142));
      }

   }

   public void w(ET var1) {
      super.w(var1);
      var1.q(this, 0, this.bpm);
   }

   public void Hh() {
      boolean var1 = false;
      boolean var2 = true;
      boolean var3 = true;
      boolean var4 = true;
      boolean var5 = true;
      boolean var6 = true;
      boolean var7 = true;
      GX var8 = this.bpo.er(0);
      this.bpm = 1;
      int var9 = 0;
      int var10 = 0;
      byte var11 = 0;
      if (var8 == null) {
         this.bpp.y(0, (GX)null);
         this.bpm = 0;
      } else {
         GX var12 = var8.HW();
         GX var13 = this.bpo.er(1);
         Map var14 = yS.z(var12);
         boolean var15 = false;
         var10 = var10 + var8.Ii() + (var13 == null ? 0 : var13.Ii());
         this.bpq = 0;
         if (var13 != null) {
            var15 = var13.do1() == Et.blC && Et.blC.ad(var13).II() > 0;
            if (var12.If() && var12.do1().w(var8, var13)) {
               int var29 = Math.min(var12.Ik(), var12.Hz() / 4);
               if (var29 <= 0) {
                  this.bpp.y(0, (GX)null);
                  this.bpm = 0;
                  return;
               }

               int var33;
               for(var33 = 0; var29 > 0 && var33 < var13.bsH; ++var33) {
                  int var35 = var12.Ik() - var29;
                  var12.fr(var35);
                  ++var9;
                  var29 = Math.min(var12.Ik(), var12.Hz() / 4);
               }

               this.bpq = var33;
            } else {
               if (!var15 && (var12.do1() != var13.do1() || !var12.If())) {
                  this.bpp.y(0, (GX)null);
                  this.bpm = 0;
                  return;
               }

               if (var12.If() && !var15) {
                  int var16 = var8.Hz() - var8.Ik();
                  int var17 = var13.Hz() - var13.Ik();
                  int var18 = var17 + var12.Hz() * 12 / 100;
                  int var19 = var16 + var18;
                  int var20 = var12.Hz() - var19;
                  if (var20 < 0) {
                     var20 = 0;
                  }

                  if (var20 < var12.dm()) {
                     var12.fr(var20);
                     var9 += 2;
                  }
               }

               Map var28 = yS.z(var13);
               Iterator var32 = var28.keySet().iterator();

               while(var32.hasNext()) {
                  int var34 = ((Integer)var32.next()).intValue();
                  yH var36 = yH.dt(var34);
                  if (var36 != null) {
                     int var37 = var14.containsKey(Integer.valueOf(var34)) ? ((Integer)var14.get(Integer.valueOf(var34))).intValue() : 0;
                     int var21 = ((Integer)var28.get(Integer.valueOf(var34))).intValue();
                     int var22;
                     if (var37 == var21) {
                        ++var21;
                        var22 = var21;
                     } else {
                        var22 = Math.max(var21, var37);
                     }

                     var21 = var22;
                     boolean var23 = var36.l(var8);
                     if (this.bpr.bdO.bfz || var8.do1() == Et.blC) {
                        var23 = true;
                     }

                     Iterator var24 = var14.keySet().iterator();

                     while(var24.hasNext()) {
                        int var25 = ((Integer)var24.next()).intValue();
                        if (var25 != var34 && !var36.q(yH.dt(var25))) {
                           var23 = false;
                           ++var9;
                        }
                     }

                     if (var23) {
                        if (var22 > var36.wQ()) {
                           var21 = var36.wQ();
                        }

                        var14.put(Integer.valueOf(var34), Integer.valueOf(var21));
                        int var40 = 0;
                        switch(var36.gx()) {
                        case 1:
                           var40 = 8;
                           break;
                        case 2:
                           var40 = 4;
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        default:
                           break;
                        case 5:
                           var40 = 2;
                           break;
                        case 10:
                           var40 = 1;
                        }

                        if (var15) {
                           var40 = Math.max(1, var40 / 2);
                        }

                        var9 += var40 * var21;
                     }
                  }
               }
            }
         }

         if (StringUtils.isBlank(this.bpn)) {
            if (var8.HS()) {
               var11 = 1;
               var9 += var11;
               var12.HX();
            }
         } else if (!this.bpn.equals(var8.tg())) {
            var11 = 1;
            var9 += var11;
            var12.bD(this.bpn);
         }

         this.bpm = var10 + var9;
         if (var9 <= 0) {
            var12 = null;
         }

         if (var11 == var9 && var11 > 0 && this.bpm >= 40) {
            this.bpm = 39;
         }

         if (this.bpm >= 40 && !this.bpr.bdO.bfz) {
            var12 = null;
         }

         if (var12 != null) {
            int var30 = var12.Ii();
            if (var13 != null && var30 < var13.Ii()) {
               var30 = var13.Ii();
            }

            var30 = var30 * 2 + 1;
            var12.fq(var30);
            yS.q(var14, var12);
         }

         this.bpp.y(0, var12);
         this.Ha();
      }

   }

   public GX q(DD var1, int var2) {
      GX var3 = null;
      Fe var4 = (Fe)this.boC.get(var2);
      if (var4 != null && var4.kM()) {
         GX var5 = var4.kO();
         var3 = var5.HW();
         if (var2 == 2) {
            if (!this.q(var5, 3, 39, true)) {
               return null;
            }

            var4.q(var5, var3);
         } else if (var2 != 0 && var2 != 1) {
            if (var2 >= 3 && var2 < 39 && !this.q(var5, 0, 2, false)) {
               return null;
            }
         } else if (!this.q(var5, 3, 39, false)) {
            return null;
         }

         if (var5.bsH == 0) {
            var4.p((GX)null);
         } else {
            var4.kQ();
         }

         if (var5.bsH == var3.bsH) {
            return null;
         }

         var4.q(var1, var5);
      }

      return var3;
   }

   public void bw(String var1) {
      this.bpn = var1;
      if (this.eZ(2).kM()) {
         GX var2 = this.eZ(2).kO();
         if (StringUtils.isBlank(var1)) {
            var2.HX();
         } else {
            var2.bD(this.bpn);
         }
      }

      this.Hh();
   }
}
