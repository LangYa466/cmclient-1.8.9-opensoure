import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.GlyphMetrics;
import java.awt.font.GlyphVector;

public class acH {
   private short ddg;
   private short ddk;
   private int dfm;
   private acw ddj;
   private short dfn;
   private Shape dfo;
   private boolean dfp;

   public int aqw() {
      return this.dfm;
   }

   public int ab() {
      return this.ddg;
   }

   public acH(int var1, Rectangle var2, GlyphVector var3, int var4, acC var5) {
      this.dfm = var1;
      GlyphMetrics var6 = var3.getGlyphMetrics(var4);
      int var7 = (int)var6.getLSB();
      if (var7 > 0) {
         var7 = 4160 & -22779;
      }

      int var8 = (int)var6.getRSB();
      if (var8 > 0) {
         var8 = 16641 & 10326;
      }

      int var9 = var2.width - var7 - var8;
      int var10 = var2.height;
      if (var9 > 0 && var10 > 0) {
         int var11 = var5.aqq();
         int var12 = var5.aqi();
         int var13 = var5.aqf();
         int var14 = var5.aqe();
         int var15 = -29671 & 4643;
         this.ddg = (short)(var9 + var14 + var12 + var15);
         this.ddk = (short)(var10 + var11 + var13 + var15);
         this.dfn = (short)(var5.aqs() + var2.y - var11);
      }

      this.dfo = var3.getGlyphOutline(var4, (float)(-var2.x + var5.aqe()), (float)(-var2.y + var5.aqq()));
      this.dfp = (boolean)(!var5.aqm().canDisplay((char)var1) ? -22783 & 5 : 3072 & -31807);
   }

   public int aqx() {
      return this.dfn;
   }

   public void q(acw var1) {
      this.ddj = var1;
   }

   public Shape aqy() {
      return this.dfo;
   }

   public void q(Shape var1) {
      this.dfo = var1;
   }

   public acw apX() {
      return this.ddj;
   }

   public boolean aqv() {
      return this.dfp;
   }

   public int ac() {
      return this.ddk;
   }
}
