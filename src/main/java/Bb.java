import java.util.function.BiConsumer;

public class bB extends br {
   private final bC ju;
   private final bC jv;
   public int jw;

   public bB(int var1, int var2, int var3, int var4, int var5, int var6, bI var7, BiConsumer var8, aY var9) {
      super(var1, var2, var4, var5, var7, var8, var9);
      this.jw = var6;
      this.d(var3);
      this.ja = (boolean)(-29949 & 8257);
      var9.hI.add(this.jv = new bC(this.aY(), this.aX(), 16490 & 8223, var5, (boolean)(2055 & 1024), var7, (var1x, var2x) -> {
         this.jw -= 389 & -24063;
         this.be();
      }));
      var9.hI.add(this.ju = new bC(this.aY() + var4 - (218 & -8178), this.aX(), -8166 & 47, var5, (boolean)(4149 & -30207), var7, (var1x, var2x) -> {
         this.jw += 513 & -13115;
         this.be();
      }));
      this.be();
   }

   public void p(float var1) {
      x.O.q((String)this.iY.bn().get(this.jw + (16579 & -32199)), this.aY() + (int)((float)this.eo - x.O.id((String)this.iY.bn().get(this.jw + (67 & 57)))) / (4110 & 9602), this.aX() + (this.eC - (29834 & 2074)) / (-24574 & 19507), -1543503873 & 150994943);
   }

   private void be() {
      this.jv.aM = (boolean)(this.jw != 0 ? -30485 & 8961 : 16534 & 11265);
      this.ju.aM = (boolean)(this.jw != this.iY.bn().size() - (23554 & 830) ? 10241 & 647 : 2086 & 26056);
   }

   public void aW() {
   }

   public void o(float var1) {
   }
}
