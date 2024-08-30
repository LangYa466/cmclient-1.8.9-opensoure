import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class ahm {
   private WatchService dxE;

   // $FF: synthetic method
   static WatchService q(ahm var0) {
      return var0.dxE;
   }

   public boolean avW() {
      int var1 = 6276 & 10026;
      if (this.dxE != null) {
         WatchKey var2 = this.dxE.poll();
         if (var2 != null) {
            for(WatchEvent var4 : var2.pollEvents()) {
               File var5 = ((Path)var2.watchable()).resolve(var4.context().toString()).toFile();
               if (ahv.a(var5) || ahv.d(var5)) {
                  var1 = 2181 & 16451;
                  break;
               }
            }

            var2.reset();
         }
      }

      return (boolean)var1;
   }

   public ahm(Path var1) {
      try {
         this.dxE = FileSystems.getDefault().newWatchService();
         Files.walkFileTree(var1, new ahn(this));
      } catch (IOException var3) {
         var3.printStackTrace();
      }

   }
}
