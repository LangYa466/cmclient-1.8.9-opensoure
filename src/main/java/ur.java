import com.google.common.base.Objects;

public class Ur {
   public int ckF;
   public int ckG;
   public int ckH;
   public int ckI;
   public int ckJ;
   public int ckK;

   public Ur(Ur var1) {
      this.ckF = var1.ckF;
      this.ckH = var1.ckH;
      this.ckJ = var1.ckJ;
      this.ckG = var1.ckG;
      this.ckK = var1.ckK;
      this.ckI = var1.ckI;
   }

   public String toString() {
      return Objects.toStringHelper(this).add(i.q[17244 & -31924], this.ckF).add(i.q[-25779 & 18413], this.ckH).add(i.q[4958 & -22706], this.ckJ).add(i.q[-25745 & 10079], this.ckG).add(i.q[4945 & 26580], this.ckK).add(i.q[1873 & -5159], this.ckI).toString();
   }

   public int acM() {
      return this.ckG - this.ckF + 1;
   }

   public Ur(PY var1, PY var2) {
      this.ckF = Math.min(var1.aY(), var2.aY());
      this.ckH = Math.min(var1.aX(), var2.aX());
      this.ckJ = Math.min(var1.KO(), var2.KO());
      this.ckG = Math.max(var1.aY(), var2.aY());
      this.ckK = Math.max(var1.aX(), var2.aX());
      this.ckI = Math.max(var1.KO(), var2.KO());
   }

   public int acN() {
      return this.ckK - this.ckH + 1;
   }

   public Ur(int[] var1) {
      if (var1.length == 6) {
         this.ckF = var1[0];
         this.ckH = var1[1];
         this.ckJ = var1[2];
         this.ckG = var1[3];
         this.ckK = var1[4];
         this.ckI = var1[5];
      }

   }

   public Ur() {
   }

   public boolean J(int var1, int var2, int var3, int var4) {
      return this.ckG >= var1 && this.ckF <= var3 && this.ckI >= var2 && this.ckJ <= var4;
   }

   public Ur(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.ckF = var1;
      this.ckH = var2;
      this.ckJ = var3;
      this.ckG = var4;
      this.ckK = var5;
      this.ckI = var6;
   }

   public Ur(int var1, int var2, int var3, int var4) {
      this.ckF = var1;
      this.ckJ = var2;
      this.ckG = var3;
      this.ckI = var4;
      this.ckH = 1;
      this.ckK = 512;
   }

   public PY acO() {
      return new PY(this.ckG - this.ckF, this.ckK - this.ckH, this.ckI - this.ckJ);
   }

   public HS acP() {
      return new HS(new int[]{this.ckF, this.ckH, this.ckJ, this.ckG, this.ckK, this.ckI});
   }

   public void w(Ur var1) {
      this.ckF = Math.min(this.ckF, var1.ckF);
      this.ckH = Math.min(this.ckH, var1.ckH);
      this.ckJ = Math.min(this.ckJ, var1.ckJ);
      this.ckG = Math.max(this.ckG, var1.ckG);
      this.ckK = Math.max(this.ckK, var1.ckK);
      this.ckI = Math.max(this.ckI, var1.ckI);
   }

   public static Ur d(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new Ur(Math.min(var0, var3), Math.min(var1, var4), Math.min(var2, var5), Math.max(var0, var3), Math.max(var1, var4), Math.max(var2, var5));
   }

   public static Ur acQ() {
      return new Ur(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public static Ur q(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, OK var9) {
      // $FF: Couldn't be decompiled
   }

   public boolean e(Ur var1) {
      return this.ckG >= var1.ckF && this.ckF <= var1.ckG && this.ckI >= var1.ckJ && this.ckJ <= var1.ckI && this.ckK >= var1.ckH && this.ckH <= var1.ckK;
   }

   public boolean i(PY var1) {
      return var1.aY() >= this.ckF && var1.aY() <= this.ckG && var1.KO() >= this.ckJ && var1.KO() <= this.ckI && var1.aX() >= this.ckH && var1.aX() <= this.ckK;
   }

   public PY acR() {
      return new NW(this.ckF + (this.ckG - this.ckF + 1) / 2, this.ckH + (this.ckK - this.ckH + 1) / 2, this.ckJ + (this.ckI - this.ckJ + 1) / 2);
   }

   public int acS() {
      return this.ckI - this.ckJ + 1;
   }

   public void ac(int var1, int var2, int var3) {
      this.ckF += var1;
      this.ckH += var2;
      this.ckJ += var3;
      this.ckG += var1;
      this.ckK += var2;
      this.ckI += var3;
   }
}
