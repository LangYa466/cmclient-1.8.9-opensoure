public class aG extends aW {
   private final bI fw;
   public String fx = u.q[-19109 & -19045 & 8667 & 23387];
   public String fy = u.q[-7683 & -15971 & -30851 & 7997];
   public String fz = u.q[15192 & 29016 & 8991 & 1020];
   public String fA = u.q[24863 & 13275 & 2493 & -30947];
   public long fB;
   public long fC;
   private final bI fD;
   public boolean fE;
   public String fF = u.q[3870 & -20705 & 4543 & -24289];
   public boolean fG;
   public boolean fH;
   public boolean fI;
   public String fJ = u.q[14621 & 2556 & -13924 & -6724];
   public String fK = u.q[2331 & 923 & 19967 & -14882];
   public String fL;
   public String fM = u.q[-23745 & 959 & -21217 & -17065];
   public String fN = r.q[9855 & 18031 & 10223 & -7185];
   private final bI fO;

   public Object ad() {
      return this.fL;
   }

   public boolean S() {
      return (boolean)(this.fO.af() && super.S() ? 22829 & -24061 : 2 & 11384);
   }

   public void Q() {
      if (this.aK.Cx == null) {
         int var1 = this.aK.Br.aCu.bB();
         int var2 = this.aK.Br.aEw.bB();
         boolean var3 = aiB.le(var1);
         boolean var4 = aiB.le(var2);
         if (this.fw.af() && !this.aK.CM.bdO.bfB && this.aK.Bi) {
            if (var4 && !this.fI) {
               this.fC = System.currentTimeMillis();
               this.fI = (boolean)(-22463 & 21);
            } else if (!var4 && this.fI) {
               if (System.currentTimeMillis() - this.fC < (8247389752384325103L & 539312940L)) {
                  this.fE = (boolean)(!this.fE ? 637 & -25599 : 20491 & 736);
               }

               this.fI = (boolean)(-24400 & 22538);
            }
         }

         if (this.fD.af() && !this.aK.CM.bdO.bfB) {
            if (var3 && !this.fH) {
               this.fB = System.currentTimeMillis();
               this.fH = (boolean)(22407 & 2153);
            } else if (!var3 && this.fH) {
               if (System.currentTimeMillis() - this.fB < (2638205L & 1723859374L)) {
                  this.fG = (boolean)(!this.fG ? 4099 & 27209 : -32384 & 2621);
               }

               this.fH = (boolean)(-30342 & 25093);
            }
         }

         Pz var5 = this.aK.CM.Fv;
         if (this.fw.af() && !this.aK.CM.bdO.bfB) {
            vP.q(var2, (boolean)(!var4 && !this.fE ? 23107 & 9232 : 2321 & -32249));
         }

         if (this.fD.af() && this.fG) {
            vP.q(var1, (boolean)(var5.aPW > 0.0F ? 12039 & -32559 : 16493 & -24320));
         }

         if (this.fw.af() || this.fD.af()) {
            var5.Xv();
         }

         if (this.aK.Cx instanceof bD) {
            this.fL = this.fM;
         } else if (this.aK.CM.bdO.bfB) {
            this.fL = var4 ? this.fF : this.fy;
         } else if (this.aK.CM.xj()) {
            this.fL = this.fN;
         } else if (!this.aK.CM.hI() && !this.fE) {
            if (!this.aK.CM.xf() && !this.fG) {
               this.fL = null;
            } else if (this.fG) {
               this.fL = this.fK;
            } else if (var3) {
               this.fL = this.fA;
            } else {
               this.fL = this.fz;
            }
         } else if (this.fE) {
            this.fL = this.fJ;
         } else {
            this.fL = this.fx;
         }

      }
   }

   public Object am() {
      return u.q[3038 & -26626 & 5531 & -27366];
   }

   public String e(String var1) {
      StringBuilder var2 = new StringBuilder();
      int var3 = this.hp.bk();
      int var4 = var3 != 0 ? 4225 & 1089 : -26256 & 8;
      if (var4 != 0) {
         var2.append(hz[var3 - (22529 & 307)][16466 & 1280]);
      }

      var2.append(var1);
      if (var4 != 0) {
         var2.append(hz[var3 - (289 & -32549)][17 & 3079]);
      }

      return var2.toString();
   }

   public aG() {
      super(u.q[-14401 & -15521 & 15318 & 15766], 880 & 6160);
      new bI(this, u.q[-15009 & -29313 & 20799 & 287]);
      this.fO = (new bI(this, u.q[22008 & 12797 & 16697 & 22945])).o((boolean)(2065 & 1539));
      this.fD = (new bI(this, u.q[31231 & 22431 & -1665 & -24106])).o((boolean)(151 & -27903));
      this.fw = (new bI(this, u.q[-14047 & -13011 & 13157 & 19297])).o((boolean)(1472 & 2568));
      this.hr.o((boolean)(8273 & -28378));
      this.hp.q(Integer.valueOf(-19447 & 18947));
      this.w((boolean)(8737 & 16853));
      this.q(new C(n.ak, 4.9870133F * 0.8020833F, -3.4666667F * 1.1538461F));
   }
}
