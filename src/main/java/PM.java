import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pm extends PrintStream {
   private static final Logger bSP = LogManager.getLogger();
   private final String bSQ;

   private void dj(String var1) {
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      StackTraceElement var3 = var2[Math.min(3, var2.length)];
      bSP.info(y.q[19455 & 4947], new Object[]{this.bSQ, var3.getFileName(), var3.getLineNumber(), var1});
   }

   public void println(Object var1) {
      this.dj(String.valueOf(var1));
   }

   public Pm(String var1, OutputStream var2) {
      super(var2);
      this.bSQ = var1;
   }

   public void println(String var1) {
      this.dj(var1);
   }
}
