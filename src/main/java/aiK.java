import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class aik implements Runnable {
   private final Predicate dAl;
   private final Consumer dAm;
   private final aew dAn;

   public void run() {
      if (this.dAn.dma.Cx == null) {
         this.dAn.dmK.clear();
      } else {
         this.dAn.dmK.removeIf(this.dAl);
         this.dAn.dmK.forEach(this.dAm);
      }
   }

   public aik(aew var1) {
      this.dAn = var1;
      this.dAl = Objects::isNull;
      this.dAm = ail::run;
   }
}
