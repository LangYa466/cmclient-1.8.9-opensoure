import java.awt.Color;
import org.apache.commons.lang3.math.NumberUtils;

public class ahO extends kf {
   public int jr;
   private kz dyQ;
   private final kf dyR;
   private ahQ dyS;
   private iU dyT;
   private iU dyU;
   private iU dyV;
   private kz dyW;
   private kz dyX;
   private kz dyY;
   private ahS dyZ;
   private boolean aM;
   private ahN dza;
   private String dzb;

   public void o() {
      this.Mt.clear();
      (this.dyW = new kz(1251 & 355, this.CB, this.eo / (8194 & 1094) - (-32156 & 381), this.eC / (4290 & 8742) - (7216 & -32720), 6862 & 457, 8796 & -28395)).I((boolean)(-28271 & 25153));
      super.Mt.add(this.dyU = new iU(21184 & -30700, this.eo / (12674 & 3078) - (16759 & -26523), super.eC / (8915 & 5122) - (28312 & -28584), 8565 & 20590, 797 & 19540, o.q[8527 & 861 & 13293 & -26627] + (this.aM ? e.q[17061 & 23204 & 8103 & -18505] : e.q[23487 & 7103 & -7451 & 18093])));
      super.Mt.add(this.dyV = new iU(16391 & 10641, this.eo / (9762 & -28394) + (-5559 & 5141), this.eC / (1126 & 10) - (29210 & 2233), 4324 & 2148, 18100 & 8212, o.q[8559 & 1487 & 15358 & -24226] + this.dyZ.toString()));
      this.dyX = new kz(10338 & 4194, this.CB, this.eo / (274 & 5154) - (-28444 & 638), this.eC / (25255 & -31486) + (4236 & 18783), 9304 & 22722, 1748 & -24515);
      this.dyQ = new kz(25313 & -28313, this.CB, this.eo / (3090 & 302) - (-31711 & 2678), this.eC / (-26622 & 17155) + (8270 & 16828), 2623 & 16895, 5463 & 8244);
      this.dyY = new kz(-31134 & 8288, this.CB, this.eo / (8474 & 1763) + (12451 & -32197), this.eC / (1895 & 4242) + (271 & 16940), 465 & 6212, 790 & 17469);
      this.Mt.add(this.dza = new ahN(18634 & 5138, this.eo / (-32186 & 2) - (-8089 & 4581), this.eC / (16422 & 4099) + (9082 & 1074), 5322 & 255, -23524 & 2069, this.jr == 0 ? -1 & -1 : this.jr, this));
      this.Mt.add(this.dyT = new iU(23651 & -31869, this.eo / (70 & -22006) - (485 & -28051), this.eC / (1450 & 18498) + (12538 & 1102), 5484 & 2148, 1108 & -9963, this.dyS == null ? i.q[-12865 & -12897 & 927 & 2975] : o.q[30543 & 32095 & -22145 & -30385]));
      this.Mt.add(new iU(5485 & 20, this.eo / (8194 & 17547) + (2309 & 9425), this.eC / (8267 & -32734) + (8394 & -12182), 8940 & 20836, -32707 & 21268, q.q[24575 & 21759 & 9663 & 2975]));
      if (this.dyS == null) {
         this.dyX.Y(String.valueOf((int)this.G.CM.aNZ));
         this.dyQ.Y(String.valueOf((int)this.G.CM.aNK));
         this.dyY.Y(String.valueOf((int)this.G.CM.aOt));
      } else {
         this.dyX.Y(String.valueOf(this.dyS.aY()));
         this.dyQ.Y(String.valueOf(this.dyS.aX()));
         this.dyY.Y(String.valueOf(this.dyS.KO()));
      }

      if (this.dyS != null) {
         this.dyW.Y(this.dyS.bY());
      } else if (this.dzb != null) {
         this.dyW.Y(this.dzb);
      }

      this.dyT.aM = (boolean)(this.dyW.aZ().length() > 0 ? -32741 & 20577 : 64 & 19472);
   }

   public ahO(kf var1, ahQ var2) {
      this.dyR = var1;
      this.dyS = var2;
      this.aM = var2.J();
      this.dyZ = var2.awB();
      this.jr = var2.bl();
   }

   protected void q(char var1, int var2) {
      if (var2 == (17927 & -30671)) {
         if (this.dyS != null) {
            this.awA();
         }

         this.G.r((kf)null);
      } else if (var1 == (4239 & 2893)) {
         this.awA();
      } else if (this.dyW.ba()) {
         this.dyW.t(var1, var2);
         this.dza = new ahN(1712 & 12557, this.eo / (259 & 13930) - (-26523 & 8301), this.eC / (5186 & 530) + (1049 & 27), 762 & 458, 4373 & -32682, this.jr == 0 ? -1 & -1 : this.jr, this);
      } else if (this.dyX.ba()) {
         this.dyX.t(var1, var2);
      } else if (this.dyQ.ba()) {
         this.dyQ.t(var1, var2);
      } else if (this.dyY.ba()) {
         this.dyY.t(var1, var2);
      }

      this.dyT.aM = (boolean)(this.dyW.aZ().length() > 0 && NumberUtils.isDigits(this.dyX.aZ().replace(q.q[-32436 & -3730 & -8865 & 24031], q.q[1040 & 22553 & -7955 & 9869])) && NumberUtils.isDigits(this.dyQ.aZ().replace(q.q[5068 & 5102 & 28541 & 28031], q.q[-19063 & 13929 & -32492 & -9600])) && NumberUtils.isDigits(this.dyY.aZ().replace(q.q[18286 & 18254 & -1540 & -19986], q.q[16650 & -3832 & 14452 & -26546])) ? 17601 & 8197 : -26106 & 16544);
   }

   public boolean s() {
      return (boolean)(-7680 & 1298);
   }

   protected void q(int var1, int var2, int var3) {
      super.q(var1, var2, var3);
      this.dyW.q(var1, var2, var3);
      this.dyX.q(var1, var2, var3);
      this.dyQ.q(var1, var2, var3);
      this.dyY.q(var1, var2, var3);
   }

   public void aL() {
      this.dzb = this.dyW.aZ();
   }

   private void awA() {
      if (this.dyS == null) {
         String var1 = this.dyW.aZ();
         String var2 = this.G.fp() ? String.valueOf(Md.Jc().gh(400 & 25132).Zn()) : this.G.fi().Zd;
         int var3 = Integer.parseInt(this.dyX.aZ());
         int var4 = Integer.parseInt(this.dyQ.aZ());
         int var5 = Integer.parseInt(this.dyY.aZ());
         int var6 = this.dza.awz();
         ahR var7 = ahR.la(this.G.CM.vR.bXI.ZQ());
         ahQ var8 = new ahQ(var1, var2, this.aM, var3, var4, var5, var6, var7, this.dyZ);
         this.G.Bn.dmo.w(var8);
      } else {
         this.dyS.bb(this.dyW.aZ());
         this.dyS.w(this.aM);
         int var9 = Integer.parseInt(this.dyX.aZ());
         int var10 = Integer.parseInt(this.dyQ.aZ());
         int var11 = Integer.parseInt(this.dyY.aZ());
         this.dyS.fH(var9);
         this.dyS.fI(var10);
         this.dyS.fG(var11);
         this.dyS.q(this.dyZ);
         this.dyS.n(this.jr);
         this.G.Bn.dmo.w(this.dyS);
      }

      this.G.r(new ahP());
   }

   public void p() {
      this.dyW.ke();
      this.dyX.ke();
      this.dyQ.ke();
      this.dyY.ke();
   }

   protected void q(iU var1) {
      switch(var1.aq) {
      case 0:
         this.aM ^= 17241 & 8231;
         this.dyU.iX = o.q[4559 & 11087 & -20097 & -23187] + (this.aM ? e.q[-21571 & -21835 & -19540 & 22501] : e.q[29431 & 2805 & 16295 & 25319]);
         break;
      case 1:
         this.dyZ = this.dyZ.awE();
         this.dyV.iX = o.q[1023 & 8654 & -2178 & -10898] + this.dyZ.toString();
         break;
      case 2:
         this.dza.o(this.G);
         break;
      case 3:
         this.awA();
         break;
      case 4:
         this.G.r(this.dyR);
      }

   }

   public void q(int var1, int var2, float var3) {
      this.jA();
      this.w(this.CB, o.q[8531 & 10068 & 4440 & 8144], this.eo / (3122 & -32638), 16906 & -20466, 553648127 & -939524097);
      this.w(this.CB, o.q[-5803 & 15701 & -3079 & -27657], this.eo / (2163 & -8062), this.eC / (-8142 & 775) - (8254 & 1404), 16777215 & 33554431);
      this.w(this.CB, o.q[-22657 & 26455 & 22522 & 29138], this.eo / (-26078 & 17670), this.eC / (8322 & -26598), -1056964609 & 587202559);
      this.w(this.CB, o.q[18303 & -6153 & 12627 & 13823], this.eo / (-32726 & 20610), this.eC / (4359 & -13150) + (174 & -32410), 687865855 & -2113929217);
      this.dyW.kh();
      this.dyX.kh();
      this.dyQ.kh();
      this.dyY.kh();
      super.q(var1, var2, var3);
   }

   public ahO(kf var1) {
      this.dyR = var1;
      this.aM = (boolean)(-13119 & 4395);
      this.dyZ = ahS.dzn;
      this.jr = Color.red.getRGB();
   }
}
