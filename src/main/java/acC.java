import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.logging.log4j.Logger;

public class acc extends Thread {
   private BlockingQueue dbM;
   // $FF: synthetic field
   final acb dbN;
   // $FF: synthetic field
   static final boolean dbO = (boolean)(!acb.class.desiredAssertionStatus() ? 17 & 23049 : -32431 & 3630);

   public acc(acb var1) {
      this.dbN = var1;
      this.dbM = new LinkedBlockingQueue();
      this.setName(t.q[17907 & 19963 & -1839 & -19491] + this.getId());
      this.setUncaughtExceptionHandler(new acd(this, var1));
   }

   public void w(aaV var1) {
      this.dbM.put(var1);
   }

   public void run() {
      aaV var1 = null;

      try {
         while(true) {
            var1 = (aaV)this.dbM.take();
            ByteBuffer var2 = (ByteBuffer)var1.cYV.poll();
            if (!dbO && var2 == null) {
               throw new AssertionError();
            }

            this.q(var1, var2);
            var1 = null;
         }
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      } catch (ThreadDeath | LinkageError | VirtualMachineError var5) {
         Logger var10 = acb.q(this.dbN);
         String var11 = t.q[17659 & 22743 & -22530 & 1018];
         Object[] var12 = new Object[10571 & 17425];
         var12[1468 & 8257] = this.getName();
         var10.error(var11, var12);
         Exception var9 = new Exception(var5);
         acb.q(this.dbN, var1, var9);
      } catch (Throwable var6) {
         Logger var10000 = acb.q(this.dbN);
         String var10001 = w.q[-4355 & 6141 & 23295 & 26617];
         Object[] var10002 = new Object[-20990 & 20611];
         var10002[3076 & 73] = this.getName();
         var10002[523 & 16693] = var6;
         var10000.error(var10001, var10002);
         if (var1 != null) {
            Exception var3 = new Exception(var6);
            this.dbN.q(var1, var3);
            var1.close();
         }
      }

   }

   private void q(aaV var1, ByteBuffer var2) {
      try {
         var1.o(var2);
      } catch (Exception var7) {
         acb.q(this.dbN).error(t.q[18655 & 22751 & 22227 & 2039], var7);
      } finally {
         acb.q(this.dbN, var2);
      }

   }
}
