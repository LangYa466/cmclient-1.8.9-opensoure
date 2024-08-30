import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.attribute.BasicFileAttributes;

class ahn extends SimpleFileVisitor {
   // $FF: synthetic field
   final ahm dxF;

   ahn(ahm var1) {
      this.dxF = var1;
   }

   // $FF: synthetic method
   public FileVisitResult preVisitDirectory(Object var1, BasicFileAttributes var2) {
      return this.q((Path)var1, var2);
   }

   public FileVisitResult q(Path var1, BasicFileAttributes var2) {
      File var3 = var1.toFile();
      if (ahv.d(var3)) {
         WatchService var10001 = ahm.q(this.dxF);
         Kind[] var10002 = new Kind[5167 & -15805];
         var10002[8340 & 16392] = StandardWatchEventKinds.ENTRY_CREATE;
         var10002[24867 & 5641] = StandardWatchEventKinds.ENTRY_MODIFY;
         var10002[-30077 & 17734] = StandardWatchEventKinds.ENTRY_DELETE;
         var1.register(var10001, var10002);
         return FileVisitResult.CONTINUE;
      } else {
         return ahv.a(var3) ? FileVisitResult.SKIP_SUBTREE : FileVisitResult.CONTINUE;
      }
   }
}
