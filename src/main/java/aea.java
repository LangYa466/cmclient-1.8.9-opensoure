public class aeA {
   private String bUg;
   private PJ aH;
   private String dmX;
   private String dmY;
   private long dmZ;

   public void hE(String var1) {
      this.dmY = var1;
   }

   public String atT() {
      return this.dmX;
   }

   public aeA(String var1, String var2, String var3, long var4) {
      this.dmX = var2;
      this.dmY = var1;
      this.bUg = var3;
      this.dmZ = var4;
      aew.atw().w(r.q[27514 & 17272 & 26478 & 12153] + this.bUg, (var1x) -> {
         this.aH = var1x;
      });
   }

   public void hF(String var1) {
      this.bUg = var1;
   }

   public long atU() {
      return this.dmZ;
   }

   public String atV() {
      return this.dmY;
   }

   public void hG(String var1) {
      this.dmX = var1;
   }

   public void Q(long var1) {
      this.dmZ = var1;
   }

   public PJ I() {
      return this.aH == null ? aew.dmF : this.aH;
   }

   public String XD() {
      return this.bUg;
   }
}
