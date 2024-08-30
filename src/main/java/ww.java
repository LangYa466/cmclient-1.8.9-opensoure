public class Ww implements Comparable {
   private final boolean cnC;
   private final Ra cnD;
   private final boolean cnE;
   private final String cnF;
   private final String cnG;
   private final boolean cnH;
   private final long cnI;
   private final long cnJ;

   public String adK() {
      return this.cnG;
   }

   public long adB() {
      return this.cnJ;
   }

   public boolean adv() {
      return this.cnH;
   }

   public int q(Ww var1) {
      return this.cnI < var1.cnI ? 1 : (this.cnI > var1.cnI ? -1 : this.cnG.compareTo(var1.cnG));
   }

   public long adD() {
      return this.cnI;
   }

   public Ww(String var1, String var2, long var3, long var5, Ra var7, boolean var8, boolean var9, boolean var10) {
      this.cnG = var1;
      this.cnF = var2;
      this.cnI = var3;
      this.cnJ = var5;
      this.cnD = var7;
      this.cnE = var8;
      this.cnH = var9;
      this.cnC = var10;
   }

   public String tg() {
      return this.cnF;
   }

   public Ra adL() {
      return this.cnD;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.q((Ww)var1);
   }

   public boolean adM() {
      return this.cnE;
   }

   public boolean adN() {
      return this.cnC;
   }
}
