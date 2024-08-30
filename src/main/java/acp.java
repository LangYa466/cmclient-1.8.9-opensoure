import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class acP {
   private static BufferedImage dfF = new BufferedImage(8448 & 4353, 5504 & 18716, 9250 & -30393);

   public static String w(Color var0) {
      if (var0 == null) {
         throw new IllegalArgumentException(r.q[-16914 & 16302 & 19374 & 22447]);
      } else {
         String var1 = Integer.toHexString(var0.getRed());
         if (var1.length() == (10579 & 21505)) {
            var1 = w.q[-31319 & -14419 & -29719 & 441] + var1;
         }

         String var2 = Integer.toHexString(var0.getGreen());
         if (var2.length() == (4097 & -32717)) {
            var2 = w.q[22441 & -1045 & -24133 & -26693] + var2;
         }

         String var3 = Integer.toHexString(var0.getBlue());
         if (var3.length() == (17237 & 8353)) {
            var3 = w.q[11199 & 17919 & -29701 & -15955] + var3;
         }

         return var1 + var2 + var3;
      }
   }

   public static Color hr(String var0) {
      return var0 != null && var0.length() == (6663 & -24506) ? new Color(Integer.parseInt(var0.substring(24929 & 138, 16390 & -32494), 17052 & -20110), Integer.parseInt(var0.substring(9026 & 3106, 1348 & -32753), -30448 & 4243), Integer.parseInt(var0.substring(-18411 & 12, 662 & 46), -6959 & 16)) : Color.white;
   }

   public static acN q(String var0, String var1, String[][] var2, String var3) {
      return new acU(var0, var1.toString(), var2, var1, var3);
   }

   public static acN q(String var0, Color var1) {
      return new acQ(var0, w(var1));
   }

   public static acN q(String var0, int var1, String var2) {
      return new acR(var0, String.valueOf(var1), var1, var2);
   }

   public static acN q(String var0, float var1, float var2, float var3, String var4) {
      return new acS(var0, String.valueOf(var1), var1, var2, var3, var4);
   }

   public static BufferedImage aqH() {
      Graphics2D var0 = (Graphics2D)dfF.getGraphics();
      var0.setComposite(AlphaComposite.Clear);
      var0.fillRect(3632 & 16523, 5249 & 16900, -32496 & 16778, -31427 & 896);
      var0.setComposite(AlphaComposite.SrcOver);
      var0.setColor(Color.white);
      return dfF;
   }

   public static acN q(String var0, boolean var1, String var2) {
      return new acT(var0, String.valueOf(var1), var1, var2);
   }
}
