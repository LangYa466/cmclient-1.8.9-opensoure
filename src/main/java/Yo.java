import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class YO {
   public static final int czH = 5000;
   private int bvY;
   private YP czI;
   public static final int czJ = 5000;
   private InputStream ayU;
   private Proxy CC;
   private OutputStream czK;
   private static final Pattern czL = Pattern.compile(e.q[9709 & -32532]);
   private Socket czM;
   private String czN;
   private long czO;
   private YR czP;
   private final List czQ;
   private int czR;
   private boolean czS;
   private static final String czT = "\n";
   private int czU;
   private long czV;
   private final List czW;
   private boolean czX;

   public synchronized boolean isClosed() {
      return this.czS || this.czU >= this.czR;
   }

   public synchronized void q(YQ var1, YT var2) {
      if (!this.czS) {
         this.czX = true;
         this.agF();
         if (this.czQ.size() <= 0 || this.czQ.get(0) != var1) {
            throw new IllegalArgumentException(e.q[-22803 & 2279] + var1);
         }

         this.czQ.remove(0);
         var1.cm(true);
         String var3 = var2.ff(w.q[4538 & -23105]);
         if (var2.agO() / 100 == 3 && var3 != null && var1.agG().agI() < 5) {
            try {
               var3 = this.q(var3, var1.agG());
               YS var8 = YM.w(var3, var1.agG().gf());
               var8.iE(var1.agG().agI() + 1);
               YQ var5 = new YQ(var8, var1.agH());
               YM.q(var5);
            } catch (IOException var6) {
               var1.agH().q(var1.agG(), var6);
            }
         } else {
            YL var4 = var1.agH();
            var4.q(var1.agG(), var2);
         }

         this.q(var2);
      }

   }

   public String agA() {
      return this.czN;
   }

   public synchronized YQ agB() {
      if (this.czW.size() <= 0 && this.czK != null) {
         this.czK.flush();
      }

      return this.q(this.czW, true);
   }

   public synchronized boolean agz() {
      return this.czQ.size() > 0;
   }

   public synchronized void q(Socket var1) {
      if (!this.czS) {
         if (this.czM != null) {
            throw new IllegalArgumentException(e.q[17379 & 227]);
         }

         this.czM = var1;
         this.czM.setTcpNoDelay(true);
         this.ayU = this.czM.getInputStream();
         this.czK = new BufferedOutputStream(this.czM.getOutputStream());
         this.agF();
         this.notifyAll();
      }

   }

   public synchronized void q(YQ var1, Exception var2) {
      this.w(var2);
   }

   private String[] w(String var1, char var2) {
      int var3 = var1.indexOf(var2);
      if (var3 < 0) {
         return new String[]{var1};
      } else {
         String var4 = var1.substring(0, var3);
         String var5 = var1.substring(var3 + 1);
         return new String[]{var4, var5};
      }
   }

   public synchronized YQ agC() {
      return this.q(this.czQ, false);
   }

   public synchronized void w(YQ var1, Exception var2) {
      this.w(var2);
   }

   public Proxy gf() {
      return this.CC;
   }

   public synchronized void w(YQ var1) {
      if (!this.czS) {
         this.agF();
      }

   }

   public synchronized InputStream getInputStream() {
      while(this.ayU == null) {
         this.agE();
         this.wait(1000L);
      }

      return this.ayU;
   }

   public int agD() {
      return this.czU;
   }

   private void agE() {
      if (this.czM != null) {
         long var1 = this.czO;
         if (this.czQ.size() > 0) {
            var1 = 5000L;
         }

         long var3 = System.currentTimeMillis();
         if (var3 > this.czV + var1) {
            this.w(new InterruptedException(e.q[27133 & 228] + var1));
         }
      }

   }

   private void q(YT var1) {
      String var2 = var1.ff(w.q[3055 & 18383]);
      if (var2 != null && !var2.equalsIgnoreCase(w.q[980 & 13306])) {
         this.w(new EOFException(e.q[505 & 8431]));
      }

      String var3 = var1.ff(e.q[4842 & -30486]);
      if (var3 != null) {
         String[] var4 = MV.f(var3, e.q[-31509 & 13055]);

         for(int var5 = 0; var5 < var4.length; ++var5) {
            String var6 = var4[var5];
            String[] var7 = this.w(var6, '=');
            if (var7.length >= 2) {
               if (var7[0].equals(e.q[4830 & -6966])) {
                  int var8 = MV.u(var7[1], -1);
                  if (var8 > 0) {
                     this.czO = (long)var8 * 1000L;
                  }
               }

               if (var7[0].equals(e.q[594 & 26775])) {
                  int var9 = MV.u(var7[1], -1);
                  if (var9 > 0) {
                     this.czR = var9;
                  }
               }
            }
         }
      }

   }

   public int lG() {
      return this.bvY;
   }

   private YQ q(List var1, boolean var2) {
      while(var1.size() <= 0) {
         this.agE();
         this.wait(1000L);
      }

      this.agF();
      if (var2) {
         return (YQ)var1.remove(0);
      } else {
         return (YQ)var1.get(0);
      }
   }

   public YO(String var1, int var2, Proxy var3) {
      this.czN = null;
      this.bvY = 0;
      this.CC = Proxy.NO_PROXY;
      this.czQ = new LinkedList();
      this.czW = new LinkedList();
      this.czM = null;
      this.ayU = null;
      this.czK = null;
      this.czP = null;
      this.czI = null;
      this.czU = 0;
      this.czX = false;
      this.czO = 5000L;
      this.czR = 1000;
      this.czV = System.currentTimeMillis();
      this.czS = false;
      this.czN = var1;
      this.bvY = var2;
      this.CC = var3;
      this.czP = new YR(this);
      this.czP.start();
      this.czI = new YP(this);
      this.czI.start();
   }

   public YO(String var1, int var2) {
      this(var1, var2, Proxy.NO_PROXY);
   }

   private void agF() {
      this.czV = System.currentTimeMillis();
   }

   public synchronized boolean e(YQ var1) {
      if (this.isClosed()) {
         return false;
      } else {
         this.q(var1, this.czQ);
         this.q(var1, this.czW);
         ++this.czU;
         return true;
      }
   }

   private synchronized void w(Exception var1) {
      if (!this.czS) {
         this.czS = true;
         this.e(var1);
         if (this.czP != null) {
            this.czP.interrupt();
         }

         if (this.czI != null) {
            this.czI.interrupt();
         }

         try {
            if (this.czM != null) {
               this.czM.close();
            }
         } catch (IOException var3) {
            ;
         }

         this.czM = null;
         this.ayU = null;
         this.czK = null;
      }

   }

   private void q(YQ var1, List var2) {
      var2.add(var1);
      this.notifyAll();
   }

   private void e(Exception var1) {
      if (this.czQ.size() > 0) {
         if (!this.czX) {
            YQ var2 = (YQ)this.czQ.remove(0);
            var2.agH().q(var2.agG(), var1);
            var2.cm(true);
         }

         while(this.czQ.size() > 0) {
            YQ var3 = (YQ)this.czQ.remove(0);
            YM.q(var3);
         }
      }

   }

   public synchronized OutputStream getOutputStream() {
      while(this.czK == null) {
         this.agE();
         this.wait(1000L);
      }

      return this.czK;
   }

   private String q(String var1, YS var2) {
      if (czL.matcher(var1).matches()) {
         return var1;
      } else if (var1.startsWith(e.q[2278 & 502])) {
         return e.q[2031 & -16137] + var1;
      } else {
         String var3 = var2.agA();
         if (var2.lG() != 80) {
            var3 = var3 + w.q[2418 & 631] + var2.lG();
         }

         if (var1.startsWith(q.q[16479 & 8287])) {
            return e.q[252 & -32023] + var3 + var1;
         } else {
            String var4 = var2.agN();
            int var5 = var4.lastIndexOf(q.q[16479 & 11871]);
            return var5 >= 0 ? e.q[20714 & 9196] + var3 + var4.substring(0, var5 + 1) + var1 : e.q[12520 & 234] + var3 + q.q[2143 & -4001] + var1;
         }
      }
   }
}
