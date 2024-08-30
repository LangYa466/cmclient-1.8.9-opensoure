import java.awt.Color;
import java.util.function.Consumer;
import org.lwjgl.opengl.GL11;

public class bE extends bK {
   private int jF;
   private final E jG;
   private int jH;

   private double q(double var1, int var3) {
      --var1;
      return (double)((float)this.eC / 2.0F - (float)this.ac() / 2.0F + 23.275864F * 1.074074F) + var1 * (double)var3;
   }

   public bE(E var1, kf var2) {
      super(var2);
      this.jG = var1;
   }

   public void o() {
      this.jH = 17475 & -30719;
      this.jF = -29935 & 65;
      this.hI.clear();
      this.hG.clear();
      this.jG.aP.forEach((var1) -> {
         this.q(var1, this.eo / (27 & 9858) - this.ab() / (-30026 & 28682) + (16943 & 8227), (int)this.q((double)this.jH, 13137 & 3093));
         this.jF += 2117 & 10171;
         if (this.jF > (5635 & 26737)) {
            this.jF = -24575 & 4629;
            this.jH += -30973 & 1;
         }

      });
      super.o();
      this.q(new bG(this.jG.aP, this.eo, this.eC, this.eC / (30 & -28669) - this.ac() / (-30622 & 139) + (-27596 & 2388), this.eC / (8203 & 18630) + this.ac() / (2078 & 16707), 17 & -15171, this.eo / (17546 & 4934) + this.ab() / (1031 & 2050) - (17676 & 2198), -15355 & 2147));
   }

   public void aL() {
      super.aL();
      this.G.Bn.atD().ab.m();
   }

   public void q(int var1, int var2, float var3) {
      this.b(17026 & 2065);
      int var4 = 4244 & -32767;
      if (this.jG.U()) {
         int var5 = (this.jG.M() != (-1 & -1) ? this.jG.M() : 24696 & 6424) - (14340 & 1404);
         pz.nX();
         bQ.B((new Color(5122 & 256, 129 & 7192, 5635 & -32664, 17515 & -26529)).getRGB());
         bQ.q((float)(this.eo / (8971 & 230) - this.ab() / (19459 & -32262) + (-11815 & 29) + ((-32612 & 20532) - var5) / (91 & 10374)) + 0.8028169F * 0.9342105F, (float)(this.eC / (283 & 25830) - this.ac() / (22530 & 9454) + ((20 & -28097) - var5) / (74 & 263)) + 1.137931F * 0.65909094F, 0.0F, 0.0F, var5, var5, (float)var5, (float)var5);
         bQ.B(x.q(255 & -26369));
         this.G.fJ().o(this.jG.I());
         iT.q(this.eo / (16434 & -31030) - this.ab() / (-16318 & 12675) + (3739 & 16409) + ((84 & -14276) - var5) / (1734 & 16418), this.eC / (418 & -16890) - this.ac() / (10890 & 1106) + ((18646 & 12820) - var5) / (29862 & 2627), 0.0F, 0.0F, var5, var5, (float)var5, (float)var5);
         pz.nz();
         var4 = 4312 & 2097;
      }

      x.W.e(this.jG.aI.toUpperCase(), (float)this.eo / 2.0F - (float)this.ab() / 2.0F + 630.0F * 0.04761905F + (float)var4, (float)this.eC / 2.0F - (float)this.ac() / 2.0F + 170.0F * 0.029411765F, (new Color(-14104 & 5337, 16841 & 730, 458 & 729, 1997 & -28472)).getRGB());
      q(this.eo / (12586 & 3714) - this.ab() / (9490 & 2570) + (146 & -6126), this.eC / (23 & 8770) - this.ac() / (21635 & 8278) + (-28905 & 4315), this.eo / (7683 & 16674) + this.ab() / (1538 & 24691), this.eC / (4227 & 10590) - this.ac() / (-32702 & 24098) + (276 & -31076), (new Color(374 & -32531, 16485 & 3684, 620 & 1125, 1773 & -1946)).getRGB());
      int var9 = (this.eo / (20898 & 8194) - this.ab() / (16451 & 770)) * this.l.kq();
      int var6 = (this.eC / (530 & 10) - this.ac() / (-6138 & 2) + (21025 & 9283)) * this.l.kq();
      int var7 = (this.eo / (8519 & 4146) + this.ab() / (9218 & -32701)) * this.l.kq() - var9;
      int var8 = (this.eC / (21514 & 786) + this.ac() / (259 & 4210) - (406 & 10269)) * this.l.kq() - var6;
      this.q(this.l, var9, var6, var7, var8);
      super.q(var1, var2, var3);
      GL11.glDisable(7473 & 19539);
   }
}
