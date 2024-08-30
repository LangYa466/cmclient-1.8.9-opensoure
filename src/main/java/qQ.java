import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;

public class qq {
   public FloatBuffer alE;
   private ByteBuffer alF;
   public IntBuffer alG;
   public Zy ajw = null;
   private tO[] alH = null;
   public int alI;
   private uu alJ;
   public BitSet aen = new BitSet();
   private tO[] alK = null;
   public net.optifine.shaders.b alL;
   private double alM;
   private ByteBuffer alN;
   private OS alO = null;
   public int alP;
   private int alQ;
   private boolean alR = false;
   private tO alS = null;
   private boolean[] alT = new boolean[256];
   private boolean alU;
   public BitSet alV = null;
   private ShortBuffer alW;
   private double alX;
   private uw alY;
   private double alZ;
   private boolean ama;

   private void ct(int var1) {
      if (var1 > this.alG.remaining()) {
         int var2 = this.alN.capacity();
         int var3 = var2 % 2097152;
         int var4 = var3 + (((this.alG.position() + var1) * 4 - var3) / 2097152 + 1) * 2097152;
         LogManager.getLogger().warn(i.q[3055 & 4573] + var2 + i.q[462 & 11214] + var4 + i.q[3551 & 20975]);
         int var5 = this.alG.position();
         ByteBuffer var6 = py.bM(var4);
         this.alN.position(0);
         var6.put(this.alN);
         var6.rewind();
         this.alN = var6;
         this.alE = this.alN.asFloatBuffer();
         this.alG = this.alN.asIntBuffer();
         this.alG.position(var5);
         this.alW = this.alN.asShortBuffer();
         this.alW.position(var5 << 1);
         if (this.alH != null) {
            tO[] var7 = this.alH;
            int var8 = this.pR();
            this.alH = new tO[var8];
            System.arraycopy(var7, 0, this.alH, 0, Math.min(var7.length, this.alH.length));
            this.alK = null;
         }
      }

   }

   public double pz() {
      return this.alZ;
   }

   public qq(int var1) {
      this.alN = py.bM(var1 * 4);
      this.alG = this.alN.asIntBuffer();
      this.alW = this.alN.asShortBuffer();
      this.alE = this.alN.asFloatBuffer();
      net.optifine.shaders.b.u(this);
   }

   public int pA() {
      return this.alP * this.alJ.sX();
   }

   public void pB() {
      if (!this.ama) {
         throw new IllegalStateException(i.q[-32303 & 16893]);
      } else {
         this.ama = false;
         this.alN.position(0);
         this.alN.limit(this.pA() * 4);
      }
   }

   public int cu(int var1) {
      return ((this.alP - var1) * this.alJ.sT() + this.alJ.sZ()) / 4;
   }

   public int pC() {
      return this.alR ? 4 : this.alI;
   }

   public void pD() {
      if (this.alH != null) {
         int var1 = MV.eV().fA().sB();
         if (this.alT.length <= var1) {
            this.alT = new boolean[var1 + 1];
         }

         Arrays.fill(this.alT, false);
         int var2 = 0;
         int var3 = -1;
         int var4 = this.alP / 4;

         for(int var5 = 0; var5 < var4; ++var5) {
            tO var6 = this.alH[var5];
            if (var6 != null) {
               int var7 = var6.sc();
               if (!this.alT[var7]) {
                  if (var6 == net.optifine.util.K.cWG) {
                     if (var3 < 0) {
                        var3 = var5;
                     }
                  } else {
                     var5 = this.q(var6, var5) - 1;
                     ++var2;
                     if (this.alO != OS.bSm) {
                        this.alT[var7] = true;
                     }
                  }
               }
            }
         }

         if (var3 >= 0) {
            this.q(net.optifine.util.K.cWG, var3);
            ++var2;
         }

         if (var2 > 0) {
            ;
         }
      }

   }

   public void i(float var1, float var2, float var3) {
      int var4 = this.alP / 4;
      float[] var5 = new float[var4];

      for(int var6 = 0; var6 < var4; ++var6) {
         var5[var6] = q(this.alE, (float)((double)var1 + this.alX), (float)((double)var2 + this.alM), (float)((double)var3 + this.alZ), this.alJ.sX(), var6 * this.alJ.sT());
      }

      Integer[] var15 = new Integer[var4];

      for(int var7 = 0; var7 < var15.length; ++var7) {
         var15[var7] = var7;
      }

      Arrays.sort(var15, new qr(this, var5));
      BitSet var16 = new BitSet();
      int var8 = this.alJ.sT();
      int[] var9 = new int[var8];

      for(int var17 = 0; (var17 = var16.nextClearBit(var17)) < var15.length; ++var17) {
         int var11 = var15[var17].intValue();
         if (var11 != var17) {
            this.alG.limit(var11 * var8 + var8);
            this.alG.position(var11 * var8);
            this.alG.get(var9);
            int var12 = var11;

            for(int var13 = var15[var11].intValue(); var12 != var17; var13 = var15[var13].intValue()) {
               this.alG.limit(var13 * var8 + var8);
               this.alG.position(var13 * var8);
               IntBuffer var14 = this.alG.slice();
               this.alG.limit(var12 * var8 + var8);
               this.alG.position(var12 * var8);
               this.alG.put(var14);
               var16.set(var12);
               var12 = var13;
            }

            this.alG.limit(var17 * var8 + var8);
            this.alG.position(var17 * var8);
            this.alG.put(var9);
         }

         var16.set(var17);
      }

      this.alG.limit(this.alG.capacity());
      this.alG.position(this.pA());
      if (this.alH != null) {
         tO[] var18 = new tO[this.alP / 4];
         int var19 = this.alJ.sT() / 4 * 4;

         for(int var20 = 0; var20 < var15.length; ++var20) {
            int var21 = var15[var20].intValue();
            var18[var20] = this.alH[var21];
         }

         System.arraycopy(var18, 0, this.alH, 0, var18.length);
      }

   }

   private void pE() {
      ++this.alQ;
      this.alQ %= this.alJ.sU();
      this.alY = this.alJ.db(this.alQ);
      if (this.alY.ta() == uy.ayH) {
         this.pE();
      }

   }

   public void cv(int var1) {
      for(int var2 = 0; var2 < 4; ++var2) {
         this.ae(var1, var2 + 1);
      }

   }

   public qq o(float var1, float var2, float var3) {
      // $FF: Couldn't be decompiled
   }

   private void ac(int var1, int var2) {
      int var3 = var2 - var1;
      if (var3 > 0) {
         int var4 = var1 * 4;
         int var5 = var3 * 4;
         GL11.glDrawArrays(this.alI, var4, var5);
      }

   }

   public void q(int var1, uu var2) {
      if (this.ama) {
         throw new IllegalStateException(i.q[-15916 & 4568]);
      } else {
         this.ama = true;
         this.pK();
         this.alI = var1;
         this.alJ = var2;
         this.alY = var2.db(this.alQ);
         this.alU = false;
         this.alN.limit(this.alN.capacity());
         if (MV.Tf()) {
            net.optifine.shaders.b.e(this);
         }

         if (MV.pH()) {
            if (this.alO != null) {
               if (this.alH == null) {
                  this.alH = this.alK;
               }

               if (this.alH == null || this.alH.length < this.pR()) {
                  this.alH = new tO[this.pR()];
               }
            }
         } else {
            if (this.alH != null) {
               this.alK = this.alH;
            }

            this.alH = null;
         }

      }
   }

   public int pF() {
      return this.alR ? this.alP / 4 * 6 : this.alP;
   }

   public qt pG() {
      this.alG.rewind();
      int var1 = this.pA();
      this.alG.limit(var1);
      int[] var2 = new int[var1];
      this.alG.get(var2);
      this.alG.limit(this.alG.capacity());
      this.alG.position(var1);
      tO[] var3 = null;
      if (this.alH != null) {
         int var4 = this.alP / 4;
         var3 = new tO[var4];
         System.arraycopy(this.alH, 0, var3, 0, var4);
      }

      return new qt(this, var2, new uu(this.alJ), var3);
   }

   public boolean pH() {
      return this.alH != null;
   }

   public OS cn() {
      return this.alO;
   }

   public void w(tO var1) {
      if (this.alV != null && var1 != null && var1.sn() >= 0) {
         this.alV.set(var1.sn());
      }

      if (this.alH != null) {
         int var2 = this.alP / 4;
         this.alH[var2 - 1] = var1;
      }

   }

   public void pI() {
      this.alU = true;
   }

   public qq e(double var1, double var3) {
      // $FF: Couldn't be decompiled
   }

   public void p(float var1, float var2, float var3) {
      int var4 = (byte)((int)(var1 * 127.0F)) & 255;
      int var5 = (byte)((int)(var2 * 127.0F)) & 255;
      int var6 = (byte)((int)(var3 * 127.0F)) & 255;
      int var7 = var4 | var5 << 8 | var6 << 16;
      int var8 = this.alJ.sT() >> 2;
      int var9 = (this.alP - 4) * var8 + this.alJ.sV() / 4;
      this.alG.put(var9, var7);
      this.alG.put(var9 + var8, var7);
      this.alG.put(var9 + var8 * 2, var7);
      this.alG.put(var9 + var8 * 3, var7);
   }

   public void q(qt var1) {
      this.alG.clear();
      this.ct(var1.pT().length);
      this.alG.put(var1.pT());
      this.alP = var1.pF();
      this.alJ = new uu(var1.pQ());
      if (qt.w(var1) != null) {
         if (this.alH == null) {
            this.alH = this.alK;
         }

         if (this.alH == null || this.alH.length < this.pR()) {
            this.alH = new tO[this.pR()];
         }

         tO[] var2 = qt.w(var1);
         System.arraycopy(var2, 0, this.alH, 0, var2.length);
      } else {
         if (this.alH != null) {
            this.alK = this.alH;
         }

         this.alH = null;
      }

   }

   public Zy w(hI var1, NW var2) {
      if (this.ajw == null) {
         this.ajw = new Zy(var1, var2);
         return this.ajw;
      } else {
         this.ajw.e(var1, var2);
         return this.ajw;
      }
   }

   public void r(float var1, float var2, float var3, int var4) {
      int var5 = this.cu(var4);
      int var6 = -1;
      if (!this.alU) {
         var6 = this.alG.get(var5);
         if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            int var7 = (int)((float)(var6 & 255) * var1);
            int var8 = (int)((float)(var6 >> 8 & 255) * var2);
            int var9 = (int)((float)(var6 >> 16 & 255) * var3);
            var6 = var6 & -16777216;
            var6 = var6 | var9 << 16 | var8 << 8 | var7;
         } else {
            int var13 = (int)((float)(var6 >> 24 & 255) * var1);
            int var14 = (int)((float)(var6 >> 16 & 255) * var2);
            int var15 = (int)((float)(var6 >> 8 & 255) * var3);
            var6 = var6 & 255;
            var6 = var6 | var13 << 24 | var14 << 16 | var15 << 8;
         }
      }

      this.alG.put(var5, var6);
   }

   public void a(float var1, float var2, float var3) {
      for(int var4 = 0; var4 < 4; ++var4) {
         this.t(var1, var2, var3, var4 + 1);
      }

   }

   public void e(int var1, int var2, int var3, int var4, int var5) {
      if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
         this.alG.put(var1, var5 << 24 | var4 << 16 | var3 << 8 | var2);
      } else {
         this.alG.put(var1, var2 << 24 | var3 << 16 | var4 << 8 | var5);
      }

   }

   public void u(double var1, double var3, double var5) {
      this.alX = var1;
      this.alM = var3;
      this.alZ = var5;
   }

   public qq i(double var1, double var3, double var5) {
      // $FF: Couldn't be decompiled
   }

   public void w(int[] var1) {
      if (MV.Tf()) {
         net.optifine.shaders.b.q(this, var1);
      }

      this.ct(var1.length);
      this.alG.position(this.pA());
      this.alG.put(var1);
      this.alP += var1.length / this.alJ.sX();
      if (MV.Tf()) {
         net.optifine.shaders.b.i(this);
      }

   }

   public void pJ() {
      ++this.alP;
      this.ct(this.alJ.sX());
      this.alQ = 0;
      this.alY = this.alJ.db(this.alQ);
      if (MV.Tf()) {
         net.optifine.shaders.b.t(this);
      }

   }

   public void r(OS var1) {
      this.alO = var1;
      if (var1 == null) {
         if (this.alH != null) {
            this.alK = this.alH;
         }

         this.alH = null;
         this.alS = null;
      }

   }

   public qq v(int var1, int var2, int var3, int var4) {
      // $FF: Couldn't be decompiled
   }

   public void pK() {
      this.alP = 0;
      this.alY = null;
      this.alQ = 0;
      this.alS = null;
      if (XU.aet()) {
         if (this.alV == null) {
            this.alV = this.aen;
         }

         this.alV.clear();
      } else if (this.alV != null) {
         this.alV = null;
      }

      this.alR = false;
   }

   public void pL() {
      if (this.alI == 7) {
         if (this.alF == null) {
            this.alF = py.bM(this.alN.capacity() * 2);
         }

         if (this.alF.capacity() < this.alN.capacity() * 2) {
            this.alF = py.bM(this.alN.capacity() * 2);
         }

         int var1 = this.alJ.sT();
         int var2 = this.alN.limit();
         this.alN.rewind();
         this.alF.clear();

         for(int var3 = 0; var3 < this.alP; var3 += 4) {
            this.alN.limit((var3 + 3) * var1);
            this.alN.position(var3 * var1);
            this.alF.put(this.alN);
            this.alN.limit((var3 + 1) * var1);
            this.alN.position(var3 * var1);
            this.alF.put(this.alN);
            this.alN.limit((var3 + 2 + 2) * var1);
            this.alN.position((var3 + 2) * var1);
            this.alF.put(this.alN);
         }

         this.alN.limit(var2);
         this.alN.rewind();
         this.alF.flip();
         this.alR = true;
      }

   }

   public qq p(float var1, float var2, float var3, float var4) {
      return this.v((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   public boolean pM() {
      return this.ama;
   }

   public ByteBuffer pN() {
      return this.alR ? this.alF : this.alN;
   }

   public double pO() {
      return this.alX;
   }

   public double pP() {
      return this.alM;
   }

   public void e(float var1, float var2, float var3, float var4, int var5) {
      int var6 = this.cu(var5);
      int var7 = -1;
      if (!this.alU) {
         var7 = this.alG.get(var6);
         if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            int var8 = (int)((float)(var7 & 255) * var1);
            int var9 = (int)((float)(var7 >> 8 & 255) * var2);
            int var10 = (int)((float)(var7 >> 16 & 255) * var3);
            int var11 = (int)((float)(var7 >> 24 & 255) * var4);
            var7 = var11 << 24 | var10 << 16 | var9 << 8 | var8;
         } else {
            int var13 = (int)((float)(var7 >> 24 & 255) * var1);
            int var14 = (int)((float)(var7 >> 16 & 255) * var2);
            int var15 = (int)((float)(var7 >> 8 & 255) * var3);
            int var16 = (int)((float)(var7 & 255) * var4);
            var7 = var13 << 24 | var14 << 16 | var15 << 8 | var16;
         }
      }

      this.alG.put(var6, var7);
   }

   public void b(int var1, int var2, int var3, int var4) {
      int var5 = (this.alP - 4) * this.alJ.sX() + this.alJ.da(1) / 4;
      int var6 = this.alJ.sT() >> 2;
      this.alG.put(var5, var1);
      this.alG.put(var5 + var6, var2);
      this.alG.put(var5 + var6 * 2, var3);
      this.alG.put(var5 + var6 * 3, var4);
   }

   public qq ad(int var1, int var2) {
      // $FF: Couldn't be decompiled
   }

   public void o(double var1, double var3, double var5) {
      int var7 = this.alJ.sX();
      int var8 = (this.alP - 4) * var7;

      for(int var9 = 0; var9 < 4; ++var9) {
         int var10 = var8 + var9 * var7;
         int var11 = var10 + 1;
         int var12 = var11 + 1;
         this.alG.put(var10, Float.floatToRawIntBits((float)(var1 + this.alX) + Float.intBitsToFloat(this.alG.get(var10))));
         this.alG.put(var11, Float.floatToRawIntBits((float)(var3 + this.alM) + Float.intBitsToFloat(this.alG.get(var11))));
         this.alG.put(var12, Float.floatToRawIntBits((float)(var5 + this.alZ) + Float.intBitsToFloat(this.alG.get(var12))));
      }

   }

   public uu pQ() {
      return this.alJ;
   }

   private int pR() {
      int var1 = this.alG.capacity() * 4 / (this.alJ.sX() * 4);
      return var1;
   }

   private void ae(int var1, int var2) {
      int var3 = this.cu(var2);
      int var4 = var1 >> 16 & 255;
      int var5 = var1 >> 8 & 255;
      int var6 = var1 & 255;
      int var7 = var1 >> 24 & 255;
      this.e(var3, var4, var5, var6, var7);
   }

   public void e(tO var1) {
      if (this.alV != null && var1 != null && var1.sn() >= 0) {
         this.alV.set(var1.sn());
      }

      if (this.alH != null) {
         this.alS = var1;
      }

   }

   private static float q(FloatBuffer var0, float var1, float var2, float var3, int var4, int var5) {
      float var6 = var0.get(var5 + var4 * 0 + 0);
      float var7 = var0.get(var5 + var4 * 0 + 1);
      float var8 = var0.get(var5 + var4 * 0 + 2);
      float var9 = var0.get(var5 + var4 * 1 + 0);
      float var10 = var0.get(var5 + var4 * 1 + 1);
      float var11 = var0.get(var5 + var4 * 1 + 2);
      float var12 = var0.get(var5 + var4 * 2 + 0);
      float var13 = var0.get(var5 + var4 * 2 + 1);
      float var14 = var0.get(var5 + var4 * 2 + 2);
      float var15 = var0.get(var5 + var4 * 3 + 0);
      float var16 = var0.get(var5 + var4 * 3 + 1);
      float var17 = var0.get(var5 + var4 * 3 + 2);
      float var18 = (var6 + var9 + var12 + var15) * 0.25F - var1;
      float var19 = (var7 + var10 + var13 + var16) * 0.25F - var2;
      float var20 = (var8 + var11 + var14 + var17) * 0.25F - var3;
      return var18 * var18 + var19 * var19 + var20 * var20;
   }

   public boolean pS() {
      return this.alU;
   }

   public void t(float var1, float var2, float var3, int var4) {
      int var5 = this.cu(var4);
      int var6 = Pq.G((int)(var1 * 255.0F), 0, 255);
      int var7 = Pq.G((int)(var2 * 255.0F), 0, 255);
      int var8 = Pq.G((int)(var3 * 255.0F), 0, 255);
      this.e(var5, var6, var7, var8, 255);
   }

   private int q(tO var1, int var2) {
      GL11.glBindTexture(3553, var1.avf);
      int var3 = -1;
      int var4 = -1;
      int var5 = this.alP / 4;

      for(int var6 = var2; var6 < var5; ++var6) {
         tO var7 = this.alH[var6];
         if (var7 == var1) {
            if (var4 < 0) {
               var4 = var6;
            }
         } else if (var4 >= 0) {
            this.ac(var4, var6);
            if (this.alO == OS.bSm) {
               return var6;
            }

            var4 = -1;
            if (var3 < 0) {
               var3 = var6;
            }
         }
      }

      if (var4 >= 0) {
         this.ac(var4, var5);
      }

      if (var3 < 0) {
         var3 = var5;
      }

      return var3;
   }
}
