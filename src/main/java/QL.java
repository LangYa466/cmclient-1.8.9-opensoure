import java.util.Iterator;
import java.util.List;

public class Ql {
   private int bVN = -1;
   private int bVO;
   private boolean bVP;
   private int bVQ;
   private Qh bVR;
   private QI vR;
   private int bVS;
   private int bVT;
   private int bVU;

   private boolean YN() {
      List var1 = this.vR.bXt;
      Iterator var2 = var1.iterator();

      while(true) {
         if (!var2.hasNext()) {
            return false;
         }

         DD var3 = (DD)var2.next();
         if (!var3.hm()) {
            this.bVR = this.vR.Zw().r(new NW(var3), 1);
            if (this.bVR != null && this.bVR.Ym() >= 10 && this.bVR.Yw() >= 20 && this.bVR.Yu() >= 20) {
               NW var4 = this.bVR.Yn();
               float var5 = (float)this.bVR.Yz();
               boolean var6 = false;

               for(int var7 = 0; var7 < 10; ++var7) {
                  float var8 = this.vR.bXs.nextFloat() * 3.1415927F * 2.0F;
                  this.bVQ = var4.aY() + (int)((double)(Pq.bi(var8) * var5) * 0.9D);
                  this.bVU = var4.aX();
                  this.bVO = var4.KO() + (int)((double)(Pq.bk(var8) * var5) * 0.9D);
                  var6 = false;

                  for(Qh var10 : this.vR.Zw().YA()) {
                     if (var10 != this.bVR && var10.X(new NW(this.bVQ, this.bVU, this.bVO))) {
                        var6 = true;
                        break;
                     }
                  }

                  if (!var6) {
                     break;
                  }
               }

               if (var6) {
                  return false;
               }

               PX var11 = this.ah(new NW(this.bVQ, this.bVU, this.bVO));
               if (var11 != null) {
                  break;
               }
            }
         }
      }

      this.bVS = 0;
      this.bVT = 20;
      return true;
   }

   public void lS() {
      if (this.vR.ZH()) {
         this.bVN = 0;
      } else if (this.bVN != 2) {
         if (this.bVN == 0) {
            float var1 = this.vR.by(0.0F);
            if ((double)var1 < 0.5D || (double)var1 > 0.501D) {
               return;
            }

            this.bVN = this.vR.bXs.nextInt(10) == 0 ? 1 : 2;
            this.bVP = false;
            if (this.bVN == 2) {
               return;
            }
         }

         if (this.bVN != -1) {
            if (!this.bVP) {
               if (!this.YN()) {
                  return;
               }

               this.bVP = true;
            }

            if (this.bVS > 0) {
               --this.bVS;
            } else {
               this.bVS = 2;
               if (this.bVT > 0) {
                  this.YO();
                  --this.bVT;
               } else {
                  this.bVN = 2;
               }
            }
         }
      }

   }

   public Ql(QI var1) {
      this.vR = var1;
   }

   private PX ah(NW var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         NW var3 = var1.C(this.vR.bXs.nextInt(16) - 8, this.vR.bXs.nextInt(6) - 3, this.vR.bXs.nextInt(16) - 8);
         if (this.bVR.X(var3) && QF.q(zy.aPS, this.vR, var3)) {
            return new PX((double)var3.aY(), (double)var3.aX(), (double)var3.KO());
         }
      }

      return null;
   }

   private boolean YO() {
      PX var1 = this.ah(new NW(this.bVQ, this.bVU, this.bVO));
      if (var1 == null) {
         return false;
      } else {
         CM var2;
         try {
            var2 = new CM(this.vR);
            var2.q(this.vR.aF(new NW(var2)), (zJ)null);
            var2.aL(false);
         } catch (Exception var4) {
            var4.printStackTrace();
            return false;
         }

         var2.q(var1.bUV, var1.bUW, var1.bUX, this.vR.bXs.nextFloat() * 360.0F, 0.0F);
         this.vR.p(var2);
         NW var3 = this.bVR.Yn();
         var2.w(var3, this.bVR.Yz());
         return true;
      }
   }
}
