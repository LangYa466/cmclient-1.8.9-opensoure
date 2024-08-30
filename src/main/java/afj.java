public class afJ {
   public float dsx;
   public float dsy;
   public float dsz;
   public float dsA;
   public afL dsB;
   public float cwM;
   public float dsC;

   public float q(float var1, afJ var2) {
      return this.dsB.q(this, var1, var2);
   }

   public static float N(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   public static afJ s(String[] var0) {
      if (var0.length == (25 & 14344)) {
         float var1 = Float.parseFloat(var0[25198 & -31739]);
         float var2 = Float.parseFloat(var0[-16299 & 8231]);
         float var3 = Float.parseFloat(var0[4694 & -23418]);
         float var4 = Float.parseFloat(var0[8215 & -15737]);
         return new afJ(Float.parseFloat(var0[12561 & 1229]), Float.parseFloat(var0[-7598 & 3467]), var0[203 & 13351], var1, var2, var3, var4);
      } else if (var0.length == (-26572 & 16644)) {
         return new afJ(Float.parseFloat(var0[18433 & 8585]), Float.parseFloat(var0[4098 & 17942]), var0[-28541 & 2055]);
      } else {
         return var0.length == (7939 & 16411) ? new afJ(Float.parseFloat(var0[-15219 & 4177]), Float.parseFloat(var0[258 & -16310])) : null;
      }
   }

   public afJ(float var1, float var2, String var3, float var4, float var5, float var6, float var7) {
      this(var1, var2, var3);
      this.dsA = var4;
      this.dsy = var5;
      this.dsz = var6;
      this.dsx = var7;
   }

   public static float w(float var0, float var1, float var2, float var3, float var4) {
      float var5 = N(var0, var1, var4);
      float var6 = N(var1, var2, var4);
      float var7 = N(var2, var3, var4);
      float var8 = N(var5, var6, var4);
      float var9 = N(var6, var7, var4);
      return N(var8, var9, var4);
   }

   public afJ(float var1, float var2) {
      this.dsB = afL.dsG;
      this.dsC = var1;
      this.cwM = var2;
   }

   public static float D(float var0, float var1, float var2, float var3) {
      float var4 = var2;
      float var5 = w(0.0F, var0, var1, 1.0F, var2);
      float var6 = Math.copySign(0.14285715F * 0.7F, var2 - var5);

      while(Math.abs(var2 - var5) > var3) {
         var4 += var6;
         var5 = w(0.0F, var0, var1, 1.0F, var4);
         if (Math.copySign(var6, var2 - var5) != var6) {
            var6 *= -0.484375F * 0.516129F;
         }
      }

      return var4;
   }

   public static afL ia(String var0) {
      if (var0.equals(i.q[-7169 & -11398 & 12671 & 10619])) {
         return afL.dsE;
      } else {
         return var0.equals(i.q[3067 & 20347 & 9087 & -23045]) ? afL.dsD : afL.dsG;
      }
   }

   public afJ(float var1, float var2, String var3) {
      this(var1, var2);
      this.dsB = ia(var3);
   }

   public static float O(float var0, float var1, float var2) {
      return D(var0, var1, var2, 7.627119E-5F * 6.5555553F);
   }
}
