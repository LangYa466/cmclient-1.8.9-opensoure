import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class uz implements uN {
   private static final Logger ayK = LogManager.getLogger();
   public final File ayL;

   private static String x(PJ var0) {
      return String.format(p.q[17147 & -18005], r.q[-21971 & 5950], var0.Xz(), var0.XA());
   }

   public BufferedImage ti() {
      BufferedImage var1 = tY.r(this.aA(r.q[14614 & 342]));
      if (var1.getWidth() <= 64 && var1.getHeight() <= 64) {
         return var1;
      } else {
         BufferedImage var2 = new BufferedImage(64, 64, 2);
         Graphics var3 = var2.getGraphics();
         var3.drawImage(var1, 0, 0, 64, 64, (ImageObserver)null);
         var3.dispose();
         return var2;
      }
   }

   public uz(File var1) {
      this.ayL = var1;
   }

   public vn q(vp var1, String var2) {
      return q(var1, this.aA(r.q[10517 & -32329]), var2);
   }

   protected abstract boolean az(String var1);

   static vn q(vp var0, InputStream var1, String var2) {
      JsonObject var3 = null;
      BufferedReader var4 = null;

      try {
         var4 = new BufferedReader(new InputStreamReader(var1, Charsets.UTF_8));
         var3 = (new JsonParser()).parse(var4).getAsJsonObject();
      } catch (RuntimeException var9) {
         throw new JsonParseException(var9);
      } finally {
         IOUtils.closeQuietly(var4);
      }

      return var0.q(var2, var3);
   }

   public InputStream c(PJ var1) {
      return this.aA(x(var1));
   }

   protected abstract InputStream aA(String var1);

   protected static String q(File var0, File var1) {
      return var0.toURI().relativize(var1.toURI()).getPath();
   }

   public boolean v(PJ var1) {
      return this.az(x(var1));
   }

   protected void aB(String var1) {
      ayK.warn(p.q[4268 & 16573], new Object[]{var1, this.ayL});
   }

   public String tj() {
      return this.ayL.getName();
   }
}
