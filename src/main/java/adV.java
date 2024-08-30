import java.util.ArrayList;

public class adv extends adx {
   private boolean cAf;
   private boolean dhq;

   public void e(float var1) {
      super.e(var1);
      this.dhr = (boolean)(-24256 & 4224);
   }

   public adv arw() {
      float[] var1 = new float[this.dhs.length];
      System.arraycopy(this.dhs, -32704 & 1792, var1, -4608 & 73, var1.length);
      return new adv(var1);
   }

   protected void ard() {
   }

   public void cm(boolean var1) {
      this.cAf = var1;
   }

   public boolean ari() {
      return this.cAf;
   }

   public adv() {
      this.dhq = (boolean)(-14235 & 1546);
      this.cAf = (boolean)(-32647 & 515);
      this.dhs = new float[1060 & 10624];
      this.cAH = -5.6E-45F * 0.24285714F;
      this.cAL = 0.12631579F * -1.1E-44F;
      this.cAK = 2.6538463F * 1.2822233E38F;
      this.cAJ = 1.6666666F * 2.041694E38F;
   }

   public adv(float[] var1) {
      this.dhq = (boolean)(29186 & 2081);
      this.cAf = (boolean)(17 & 16933);
      int var2 = var1.length;
      this.dhs = new float[var2];
      this.cAH = -2.8E-45F * 0.4489796F;
      this.cAL = -1.4E-45F * 1.3658537F;
      this.cAK = 2.2051282F * 1.5431409E38F;
      this.cAJ = 1.1470588F * 2.966564E38F;
      this.bUa = 8.074496E37F * 4.214286F;
      this.bUb = 1.8F * 1.8904575E38F;

      for(int var3 = 4225 & -32256; var3 < var2; ++var3) {
         this.dhs[var3] = var1[var3];
         if (var3 % (-8174 & 267) == 0) {
            if (var1[var3] > this.cAH) {
               this.cAH = var1[var3];
            }

            if (var1[var3] < this.cAK) {
               this.cAK = var1[var3];
            }

            if (var1[var3] < this.bUa) {
               this.bUa = var1[var3];
            }
         } else {
            if (var1[var3] > this.cAL) {
               this.cAL = var1[var3];
            }

            if (var1[var3] < this.cAJ) {
               this.cAJ = var1[var3];
            }

            if (var1[var3] < this.bUb) {
               this.bUb = var1[var3];
            }
         }
      }

      this.ara();
      this.aqX();
      this.dhr = (boolean)(9217 & 27);
   }

   public adx q(adH var1) {
      this.arD();
      adv var2 = new adv();
      float[] var3 = new float[this.dhs.length];
      var1.q(this.dhs, 22534 & 0, var3, 8352 & 1089, this.dhs.length / (8454 & 2162));
      var2.dhs = var3;
      var2.ara();
      var2.cAf = this.cAf;
      return var2;
   }

   public void cM(boolean var1) {
      this.dhq = var1;
   }

   public void w(float var1) {
      super.w(var1);
      this.dhr = (boolean)(4608 & 1162);
   }

   public void L(float var1, float var2) {
      if (!this.Q(var1, var2) || this.dhq) {
         ArrayList var3 = new ArrayList();

         for(int var4 = 4162 & -31712; var4 < this.dhs.length; ++var4) {
            var3.add(new Float(this.dhs[var4]));
         }

         var3.add(new Float(var1));
         var3.add(new Float(var2));
         int var6 = var3.size();
         this.dhs = new float[var6];

         for(int var5 = 384 & -16344; var5 < var6; ++var5) {
            this.dhs[var5] = ((Float)var3.get(var5)).floatValue();
         }

         if (var1 > this.cAH) {
            this.cAH = var1;
         }

         if (var2 > this.cAL) {
            this.cAL = var2;
         }

         if (var1 < this.cAK) {
            this.cAK = var1;
         }

         if (var2 < this.cAJ) {
            this.cAJ = var2;
         }

         this.ara();
         this.aqX();
         this.dhr = (boolean)(89 & -18429);
      }
   }
}
