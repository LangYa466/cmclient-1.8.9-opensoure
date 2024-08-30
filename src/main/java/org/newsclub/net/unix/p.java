package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.SocketException;

final class p extends OutputStream {
   private volatile boolean dlL;
   // $FF: synthetic field
   final AFUNIXSocketImpl dlN;

   public void write(int var1) {
      byte[] var10000 = new byte[4129 & 25247];
      var10000[5 & -11200] = (byte)var1;
      byte[] var2 = var10000;
      this.write(var2, 11424 & 16384, 2065 & -15231);
   }

   private p(AFUNIXSocketImpl var1) {
      this.dlN = var1;
      this.dlL = (boolean)(-12216 & 16);
   }

   public synchronized void close() {
      if (!this.dlL) {
         this.dlL = (boolean)(27749 & -32383);
         FileDescriptor var1 = AFUNIXSocketImpl.r(this.dlN);
         if (var1 != null) {
            NativeUnixSocket.shutdown(var1, 6305 & -15851);
         }

         AFUNIXSocketImpl.w(this.dlN, (boolean)(257 & -24015));
         AFUNIXSocketImpl.w(this.dlN);
      }
   }

   public void write(byte[] var1, int var2, int var3) {
      if (this.dlL) {
         throw new SocketException(.o.q[14311 & 11109 & 10229 & 5869]);
      } else if (var3 >= 0 && var2 >= 0 && var3 <= var1.length - var2) {
         FileDescriptor var4 = AFUNIXSocketImpl.t(this.dlN);

         int var6;
         for(int var5 = 4 & -12158; var3 > 0; var5 += var6) {
            if (Thread.interrupted()) {
               InterruptedIOException var7 = new InterruptedIOException(.o.q[-7577 & -5401 & 7790 & 7934]);
               var7.bytesTransferred = var5;
               Thread.currentThread().interrupt();
               throw var7;
            }

            var6 = NativeUnixSocket.write(this.dlN, var4, var1, var2, var3, AFUNIXSocketImpl.e(this.dlN));
            if (var6 < 0) {
               throw new IOException(.o.q[16255 & 23543 & 8959 & -11281]);
            }

            var3 -= var6;
            var2 += var6;
         }

      } else {
         throw new IndexOutOfBoundsException();
      }
   }
}
