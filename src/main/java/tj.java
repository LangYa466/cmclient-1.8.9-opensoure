import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class tJ extends tC {
   private PJ Xy;
   public final List aut;
   private static final Logger auu = LogManager.getLogger();

   public tJ(String... var1) {
      this.aut = Lists.newArrayList(var1);
      if (var1.length > 0 && var1[0] != null) {
         this.Xy = new PJ(var1[0]);
      }

   }

   public void w(uL var1) {
      this.rI();
      BufferedImage var2 = null;

      try {
         for(String var4 : this.aut) {
            if (var4 != null) {
               InputStream var5 = var1.w(new PJ(var4)).getInputStream();
               BufferedImage var6 = tY.r(var5);
               if (var2 == null) {
                  var2 = new BufferedImage(var6.getWidth(), var6.getHeight(), 2);
               }

               var2.getGraphics().drawImage(var6, 0, 0, (ImageObserver)null);
            }
         }
      } catch (IOException var7) {
         auu.error(i.q[447 & -22274], var7);
         return;
      }

      if (MV.Tf()) {
         net.optifine.shaders.I.q(this.pv(), var2, false, false, var1, this.Xy, this.rH());
      } else {
         tY.q(this.pv(), var2);
      }

   }
}
