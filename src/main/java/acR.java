import java.util.ArrayList;
import org.lwjgl.Sys;

public class acr implements acy {
   private float bck;
   private boolean ddp;
   private acB ddq;
   private int ddr;
   private long dds;
   private boolean ddt;
   private long ddu;
   private int ddv;
   private boolean o;
   private boolean ddw;
   private int ddx;
   private ArrayList ddy;
   private boolean aNS;
   private long Lj;

   private void N(long var1) {
      if (!this.ddp) {
         if (this.ddy.size() != 0) {
            int var3;
            for(this.ddu -= var1; this.ddu < (2484148988870820672L & 1613759488L) && !this.ddp; this.ddu += (long)var3) {
               if (this.ddx == this.ddv) {
                  this.ddp = (boolean)(-30551 & 1);
                  break;
               }

               if (this.ddx == this.ddy.size() - (10497 & 589) && !this.o && !this.ddt) {
                  this.ddp = (boolean)(-14751 & 285);
                  break;
               }

               this.ddx = (this.ddx + this.ddr) % this.ddy.size();
               if (this.ddt) {
                  if (this.ddx <= 0) {
                     this.ddx = 3084 & -12287;
                     this.ddr = 3977 & -24521;
                     if (!this.o) {
                        this.ddp = (boolean)(-31033 & 33);
                        break;
                     }
                  } else if (this.ddx >= this.ddy.size() - (4363 & 3717)) {
                     this.ddx = this.ddy.size() - (593 & 1033);
                     this.ddr = -1 & -1;
                  }
               }

               var3 = (int)((float)((acs)this.ddy.get(this.ddx)).bcn / this.bck);
            }

         }
      }
   }

   public int apj() {
      return this.ddx;
   }

   public acr(acB var1, int var2) {
      this(var1, 21250 & 8192, 2 & 4620, var1.apY() - (4613 & 10539), var1.apZ() - (3 & 3729), (boolean)(26633 & -27535), var2, (boolean)(-32763 & 10385));
   }

   public float EX() {
      return this.bck;
   }

   public int ka(int var1) {
      return ((acs)this.ddy.get(var1)).bcn;
   }

   public acr(boolean var1) {
      this.ddy = new ArrayList();
      this.ddx = -1 & -1;
      this.ddu = -5829293623334625242L & 5829293623065724433L;
      this.ddp = (boolean)(16706 & 9364);
      this.bck = 1.0F;
      this.ddv = -2 & -2;
      this.aNS = (boolean)(24597 & -28631);
      this.ddw = (boolean)(-12239 & 1);
      this.ddr = 1 & 4609;
      this.o = (boolean)(3587 & -28479);
      this.ddq = null;
      this.ddx = 4148 & -22270;
      this.ddw = var1;
   }

   public void apk() {
      if (this.ddy.size() != 0) {
         this.ddp = (boolean)(1064 & -3819);
         this.ddx = 1205 & -24256;
         this.ddu = (long)((int)((float)((acs)this.ddy.get(19984 & 457)).bcn / this.bck));
         this.aNS = (boolean)(-28671 & 1627);
         this.Lj = 2531342919006191949L & -2531342920545597792L;
      }
   }

   public acr(acw[] var1, int var2, boolean var3) {
      this.ddy = new ArrayList();
      this.ddx = -1 & -1;
      this.ddu = -961656755995015669L & 961656754503420032L;
      this.ddp = (boolean)(192 & 306);
      this.bck = 1.0F;
      this.ddv = -2 & -1;
      this.aNS = (boolean)(4105 & -30991);
      this.ddw = (boolean)(583 & -32639);
      this.ddr = 81 & 24833;
      this.o = (boolean)(-32447 & 2057);
      this.ddq = null;

      for(int var4 = -16062 & 2208; var4 < var1.length; ++var4) {
         this.q(var1[var4], var2);
      }

      this.ddx = -20446 & 3464;
      this.ddw = var3;
   }

   public int ac() {
      return ((acs)this.ddy.get(this.ddx)).ddj.ac();
   }

   public int ab() {
      return ((acs)this.ddy.get(this.ddx)).ddj.ab();
   }

   public acr apl() {
      acr var1 = new acr();
      var1.ddq = this.ddq;
      var1.ddy = this.ddy;
      var1.ddw = this.ddw;
      var1.ddr = this.ddr;
      var1.o = this.o;
      var1.ddt = this.ddt;
      var1.bck = this.bck;
      return var1;
   }

   public void apm() {
      if (this.ddw) {
         long var1 = this.apn();
         long var3 = var1 - this.Lj;
         if (this.aNS) {
            var3 = 143132736L & 72683784L;
            this.aNS = (boolean)(3496 & -7614);
         }

         this.Lj = var1;
         this.N(var3);
      }

   }

   public acr(acB var1, int var2, int var3, int var4, int var5, boolean var6, int var7, boolean var8) {
      this.ddy = new ArrayList();
      this.ddx = -1 & -1;
      this.ddu = 7778001965920878664L & -7778001967706792826L;
      this.ddp = (boolean)(322 & 512);
      this.bck = 1.0F;
      this.ddv = -2 & -2;
      this.aNS = (boolean)(281 & 18565);
      this.ddw = (boolean)(16965 & 1);
      this.ddr = -20447 & 19969;
      this.o = (boolean)(29961 & 131);
      this.ddq = null;
      this.ddw = var8;
      if (!var6) {
         for(int var9 = var2; var9 <= var4; ++var9) {
            for(int var10 = var3; var10 <= var5; ++var10) {
               this.q(var1.ca(var9, var10), var7);
            }
         }
      } else {
         for(int var11 = var3; var11 <= var5; ++var11) {
            for(int var12 = var2; var12 <= var4; ++var12) {
               this.q(var1.ca(var12, var11), var7);
            }
         }
      }

   }

   public void C(float var1, float var2) {
      this.z(var1, var2, (float)this.ab(), (float)this.ac());
   }

   public void q(acw var1, int var2) {
      if (var2 == 0) {
         throw new RuntimeException(i.q[30062 & -27218 & -32449 & 814] + var2);
      } else {
         if (this.ddy.isEmpty()) {
            this.ddu = (long)((int)((float)var2 / this.bck));
         }

         this.ddy.add(new acs(this, var1, var2));
         this.ddx = 2088 & 4165;
      }
   }

   public void q(float var1, float var2, float var3, float var4, act var5) {
      if (this.ddy.size() != 0) {
         if (this.ddw) {
            long var6 = this.apn();
            long var8 = var6 - this.Lj;
            if (this.aNS) {
               var8 = 956303139L & 630788L;
               this.aNS = (boolean)(4230 & 17456);
            }

            this.Lj = var6;
            this.N(var8);
         }

         acs var10 = (acs)this.ddy.get(this.ddx);
         var10.ddj.q(var1, var2, var3, var4, var5);
      }
   }

   private long apn() {
      return Sys.getTime() * (2098152L & 437264364L) / Sys.getTimerResolution();
   }

   public void pn() {
      this.C(0.0F, 0.0F);
   }

   public void O(long var1) {
      this.N(var1);
   }

   public acr(acw[] var1, int var2) {
      this(var1, var2, (boolean)(837 & 28849));
   }

   public void bU(float var1) {
      if (var1 > 0.0F) {
         this.ddu = (long)((float)this.ddu * this.bck / var1);
         this.bck = var1;
      }

   }

   public void ao(int var1, int var2, int var3) {
      if (var1 == 0) {
         throw new RuntimeException(i.q[-8193 & -514 & 13231 & 9006] + var1);
      } else {
         if (this.ddy.isEmpty()) {
            this.ddu = (long)((int)((float)var1 / this.bck));
         }

         this.ddy.add(new acs(this, var1, var2, var3));
         this.ddx = 8385 & -14816;
      }
   }

   public String toString() {
      String var1 = i.q[27439 & 11775 & -16001 & 20975] + this.ddy.size() + i.q[17781 & 23927 & -21518 & 9137];

      for(int var2 = 26881 & -28596; var2 < this.ddy.size(); ++var2) {
         acs var3 = (acs)this.ddy.get(var2);
         var1 = var1 + var3.bcn + q.q[-16693 & -21793 & -18837 & 5999];
      }

      var1 = var1 + q.q[1022 & 6140 & -29796 & 7166];
      return var1;
   }

   public acr(acw[] var1, int[] var2, boolean var3) {
      this.ddy = new ArrayList();
      this.ddx = -1 & -1;
      this.ddu = 27626500L & 1178603576L;
      this.ddp = (boolean)(17676 & 8720);
      this.bck = 1.0F;
      this.ddv = -1 & -2;
      this.aNS = (boolean)(8721 & 1125);
      this.ddw = (boolean)(-23479 & 20483);
      this.ddr = -30399 & 173;
      this.o = (boolean)(267 & 20689);
      this.ddq = null;
      this.ddw = var3;
      if (var1.length != var2.length) {
         throw new RuntimeException(i.q[-16449 & 7663 & 365 & -31377]);
      } else {
         for(int var4 = -31999 & 12308; var4 < var1.length; ++var4) {
            this.q(var1[var4], var2[var4]);
         }

         this.ddx = 3202 & -32759;
      }
   }

   public acr() {
      this((boolean)(-5117 & 4225));
   }

   public void z(float var1, float var2, float var3, float var4) {
      this.q(var1, var2, var3, var4, act.ddL);
   }

   public void q(float var1, float var2, act var3) {
      this.q(var1, var2, (float)this.ab(), (float)this.ac(), var3);
   }

   public acr(acB var1, int[] var2, int[] var3) {
      this.ddy = new ArrayList();
      this.ddx = -1 & -1;
      this.ddu = -8781501335007395295L & 8781501334944752920L;
      this.ddp = (boolean)(16416 & 4312);
      this.bck = 1.0F;
      this.ddv = -1 & -2;
      this.aNS = (boolean)(33 & 259);
      this.ddw = (boolean)(12313 & -29407);
      this.ddr = 16649 & -31215;
      this.o = (boolean)(27265 & 1091);
      this.ddq = null;
      this.ddq = var1;
      int var4 = -1 & -1;
      int var5 = -1 & -1;

      for(int var6 = 26628 & 265; var6 < var2.length / (9134 & 18434); ++var6) {
         var4 = var2[var6 * (4171 & 550)];
         var5 = var2[var6 * (-32094 & 8210) + (21961 & 8197)];
         this.ao(var3[var6], var4, var5);
      }

   }

   // $FF: synthetic method
   static acB q(acr var0) {
      return var0.ddq;
   }

   public acr(acw[] var1, int[] var2) {
      this(var1, var2, (boolean)(-16373 & 3361));
   }

   public void afC() {
      if (this.ddp) {
         if (this.ddy.size() != 0) {
            this.ddp = (boolean)(533 & -16384);
            this.ddu = this.dds;
         }
      }
   }
}
