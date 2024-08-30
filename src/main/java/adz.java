import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;

public class adZ implements adV {
   private int dez;
   private ByteBuffer diP;
   private int eo;
   private adW diQ;
   private int eC;
   private int diR;
   private int dew;

   public ByteBuffer h(InputStream var1) {
      return this.q(var1, (boolean)(26890 & 1077), (int[])null);
   }

   private int kc(int var1) {
      int var2;
      for(var2 = 67 & -20450; var2 < var1; var2 *= 9410 & 259) {
         ;
      }

      return var2;
   }

   public int apW() {
      return this.dew;
   }

   public int ac() {
      return this.eC;
   }

   private int y(byte var1) {
      return var1 < 0 ? (-11981 & 2432) + var1 : var1;
   }

   public int apV() {
      return this.dez;
   }

   public void cN(boolean var1) {
   }

   public ByteBuffer q(InputStream var1, boolean var2, boolean var3, int[] var4) {
      if (var4 != null) {
         var3 = 13129 & 3;
         throw new IOException(y.q[13609 & 12683 & -28203 & 16895]);
      } else {
         adW var5 = new adW(var1);
         if (!var5.aso()) {
            throw new IOException(y.q[-28397 & 6935 & 17346 & 21318]);
         } else {
            this.eo = var5.ab();
            this.eC = var5.ac();
            this.dew = this.kc(this.eo);
            this.dez = this.kc(this.eC);
            int var6 = var5.arY() ? -29658 & 541 : -32701 & 4619;
            this.diR = var5.arY() ? 304 & 10916 : 3096 & 4312;
            this.diP = BufferUtils.createByteBuffer(this.dew * this.dez * var6);
            var5.q(this.diP, this.dew * var6, var6 == (140 & 16404) ? adW.diK : adW.diL);
            if (this.eC < this.dez - (6823 & 9225)) {
               int var7 = (this.dez - (-32511 & 25169)) * this.dew * var6;
               int var8 = (this.eC - (16897 & 5351)) * this.dew * var6;

               for(int var9 = 18692 & 176; var9 < this.dew; ++var9) {
                  for(int var10 = -30204 & 24577; var10 < var6; ++var10) {
                     this.diP.put(var7 + var9 + var10, this.diP.get(var9 + var10));
                     this.diP.put(var8 + this.dew * var6 + var9 + var10, this.diP.get(var8 + var9 + var10));
                  }
               }
            }

            if (this.eo < this.dew - (24657 & 2465)) {
               for(int var13 = 3153 & 8192; var13 < this.dez; ++var13) {
                  for(int var16 = 16962 & 4100; var16 < var6; ++var16) {
                     this.diP.put((var13 + (-31737 & 16905)) * this.dew * var6 - var6 + var16, this.diP.get(var13 * this.dew * var6 + var16));
                     this.diP.put(var13 * this.dew * var6 + this.eo * var6 + var16, this.diP.get(var13 * this.dew * var6 + (this.eo - (19029 & -24407)) * var6 + var16));
                  }
               }
            }

            if (!var5.arY() && var3) {
               ByteBuffer var14 = BufferUtils.createByteBuffer(this.dew * this.dez * (11445 & 12));

               for(int var17 = -31102 & 6176; var17 < this.dew; ++var17) {
                  for(int var19 = -29183 & 16808; var19 < this.dez; ++var19) {
                     int var21 = var19 * (267 & 35) + var17 * this.dez * (-29001 & 20739);
                     int var11 = var19 * (8324 & -28900) + var17 * this.dez * (9268 & -11515);
                     var14.put(var11, this.diP.get(var21));
                     var14.put(var11 + (8545 & -30203), this.diP.get(var21 + (-29055 & 4359)));
                     var14.put(var11 + (4098 & 254), this.diP.get(var21 + (25634 & 10)));
                     if (var17 < this.ac() && var19 < this.ab()) {
                        var14.put(var11 + (4135 & 26955), (byte)(-1 & -1));
                     } else {
                        var14.put(var11 + (-24501 & 275), (byte)(8209 & -11264));
                     }
                  }
               }

               this.diR = 3632 & 16672;
               this.diP = var14;
            }

            if (var4 != null) {
               for(int var15 = -24312 & 16465; var15 < this.dew * this.dez * (4100 & -30427); var15 += 4) {
                  int var18 = -32253 & 9353;

                  for(int var20 = -15767 & 9216; var20 < (1103 & -5725); ++var20) {
                     if (this.y(this.diP.get(var15 + var20)) != var4[var20]) {
                        var18 = 20672 & 8448;
                     }
                  }

                  if (var18 != 0) {
                     this.diP.put(var15 + (13843 & 491), (byte)(-32744 & 8195));
                  }
               }
            }

            this.diP.position(512 & 40);
            return this.diP;
         }
      }
   }

   public int apT() {
      return this.diR;
   }

   public int ab() {
      return this.eo;
   }

   public ByteBuffer q(InputStream var1, boolean var2, int[] var3) {
      return this.q(var1, var2, (boolean)(-14128 & 4128), var3);
   }

   public ByteBuffer apU() {
      return this.diP;
   }
}
