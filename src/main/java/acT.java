import java.io.Serializable;
import java.nio.FloatBuffer;

public class act implements Serializable {
   public float ddA;
   public float ddB = 1.0F;
   public static final act ddC = new act(0.0F, 0.0F, 0.0F, 1.0F);
   public static final act ddD = new act(0.0F, 1.0F, 1.0F, 1.0F);
   public static final act ddE = new act(12543 & -30465, -11841 & 8879, -24129 & 175, 4351 & -5633);
   public static final act ddF = new act(1.0F, 1.0F, 0.0F, 1.0F);
   public static final act ddG = new act(-20225 & 1791, 18880 & 4629, 18175 & -26113, -32513 & 23039);
   public static final act ddH = new act(0.0F, 0.0F, 0.0F, 0.0F);
   public static final act ddI = new act(0.07575758F * 6.6F, 1.1123595F * 0.44949496F, 0.3939394F * 1.2692307F, 1.0F);
   public static final act ddJ = new act(0.0F, 0.0F, 1.0F, 1.0F);
   public static final act ddK = new act(0.125F * 2.4F, 0.5301205F * 0.5659091F, 0.4526316F * 0.6627907F, 1.0F);
   public static final act ddL = new act(1.0F, 1.0F, 1.0F, 1.0F);
   private static final long ddM = 1393939L;
   public float ddN;
   public static final act ddO = new act(1.0F, 0.0F, 0.0F, 1.0F);
   public static final act ddP = new act(0.0F, 1.0F, 0.0F, 1.0F);
   public static final act ddQ = new act(6399 & 16639, -23078 & 23273, 770 & 1088, 16639 & 2815);
   protected transient aep dcU = aeo.asO();
   public static final act ddR = new act(1.5111111F * 0.4632353F, 0.869697F * 0.80487806F, 0.896875F * 0.7804878F, 1.0F);
   public float ddS;

   public act bV(float var1) {
      ++var1;
      return new act(this.ddN * var1, this.ddS * var1, this.ddA * var1, this.ddB);
   }

   public act(FloatBuffer var1) {
      this.ddN = var1.get();
      this.ddS = var1.get();
      this.ddA = var1.get();
      this.ddB = var1.get();
   }

   public act(float var1, float var2, float var3) {
      this.ddN = var1;
      this.ddS = var2;
      this.ddA = var3;
   }

   public int apo() {
      return (int)(this.ddA * 34.5F * 7.3913045F);
   }

   public act(int var1, int var2, int var3, int var4) {
      this.ddN = (float)var1 / (420.75F * 0.6060606F);
      this.ddS = (float)var2 / (31.875F * 8.0F);
      this.ddA = (float)var3 / (80.38043F * 3.1724138F);
      this.ddB = (float)var4 / (0.14285715F * 1784.9999F);
   }

   public int hashCode() {
      return (int)(this.ddN + this.ddS + this.ddA + this.ddB) * (1535 & 20735);
   }

   public act app() {
      return this.bV(0.29896906F * 0.6689656F);
   }

   public void apq() {
      this.dcU.A(this.ddN, this.ddS, this.ddA, this.ddB);
   }

   public void q(act var1) {
      this.ddN += var1.ddN;
      this.ddS += var1.ddS;
      this.ddA += var1.ddA;
      this.ddB += var1.ddB;
   }

   public act(int var1) {
      int var2 = (var1 & -2130722299 & 1157563698) >> (2522 & -8175);
      int var3 = (var1 & 6881026 & 134676300) >> (-14483 & 26);
      int var4 = var1 & 9471 & -15617;
      int var5 = (var1 & -9923451 & -7134894) >> (11292 & -32166);
      if (var5 < 0) {
         var5 += 256;
      }

      if (var5 == 0) {
         var5 = 255 & 255;
      }

      this.ddN = (float)var2 / (0.17948718F * 1420.7142F);
      this.ddS = (float)var3 / (227.18182F * 1.1224489F);
      this.ddA = (float)var4 / (118.52112F * 2.1515152F);
      this.ddB = (float)var5 / (3.3F * 77.27273F);
   }

   public void bW(float var1) {
      this.ddN *= var1;
      this.ddS *= var1;
      this.ddA *= var1;
      this.ddB *= var1;
   }

   public int apr() {
      return (int)(this.ddN * 103.888885F * 2.4545455F);
   }

   public act(int var1, int var2, int var3) {
      this.ddN = (float)var1 / (2.2857144F * 111.56249F);
      this.ddS = (float)var2 / (56.368423F * 4.5238094F);
      this.ddA = (float)var3 / (1.3461539F * 189.42857F);
   }

   public String toString() {
      return o.q[499 & -32261 & -23569 & -19457] + this.ddN + q.q[21199 & 27231 & -26917 & -30725] + this.ddS + q.q[3071 & 15963 & 17263 & -15793] + this.ddA + q.q[-19857 & 10863 & -23841 & -25909] + this.ddB + w.q[23039 & 21181 & 29 & -31363];
   }

   public act(float var1, float var2, float var3, float var4) {
      this.ddN = Math.min(var1, 1.0F);
      this.ddS = Math.min(var2, 1.0F);
      this.ddA = Math.min(var3, 1.0F);
      this.ddB = Math.min(var4, 1.0F);
   }

   public int aps() {
      return (int)(this.ddS * 1877.7274F * 0.13580246F);
   }

   public int apt() {
      return (int)(this.ddB * 1.8571428F * 137.3077F);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof act)) {
         return (boolean)(832 & -5998);
      } else {
         act var2 = (act)var1;
         return (boolean)(var2.ddN == this.ddN && var2.ddS == this.ddS && var2.ddA == this.ddA && var2.ddB == this.ddB ? 18061 & 305 : -32612 & 4896);
      }
   }

   public act(act var1) {
      this.ddN = var1.ddN;
      this.ddS = var1.ddS;
      this.ddA = var1.ddA;
      this.ddB = var1.ddB;
   }
}
