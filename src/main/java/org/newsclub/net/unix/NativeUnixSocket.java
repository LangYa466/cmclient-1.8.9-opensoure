package org.newsclub.net.unix;

import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;

final class NativeUnixSocket {
   private static boolean EF = (boolean)(12544 & 19010);

   static native void setBoundServer(AFUNIXServerSocket var0);

   static boolean abR() {
      return EF;
   }

   static native void connect(byte[] var0, FileDescriptor var1, long var2);

   static native void shutdown(FileDescriptor var0, int var1);

   private NativeUnixSocket() {
      throw new UnsupportedOperationException(.i.q[935 & 16355 & -78 & 23523]);
   }

   static native int available(FileDescriptor var0);

   static native void setBound(AFUNIXSocket var0);

   static native void setConnected(AFUNIXSocket var0);

   static native void destroy();

   static native int capabilities();

   static {
      org.newsclub.net.unix.s var0 = new org.newsclub.net.unix.s();
      Throwable var1 = null;

      try {
         var0.att();
      } catch (Throwable var10) {
         var1 = var10;
         throw var10;
      } finally {
         if (var0 != null) {
            if (var1 != null) {
               try {
                  var0.close();
               } catch (Throwable var9) {
                  var1.addSuppressed(var9);
               }
            } else {
               var0.close();
            }
         }

      }

      EF = (boolean)(-27549 & 18437);
   }

   static native long bind(byte[] var0, FileDescriptor var1, int var2);

   static native void attachCloseable(FileDescriptor var0, Closeable var1);

   static native int write(AFUNIXSocketImpl var0, FileDescriptor var1, byte[] var2, int var3, int var4, int[] var5);

   static native void setPort(AFUNIXSocketAddress var0, int var1);

   static native int getFD(FileDescriptor var0);

   static native int read(AFUNIXSocketImpl var0, FileDescriptor var1, byte[] var2, int var3, int var4, ByteBuffer var5);

   static native void setCreated(AFUNIXSocket var0);

   static native void initServerImpl(AFUNIXServerSocket var0, AFUNIXSocketImpl var1);

   static native void listen(FileDescriptor var0, int var1);

   static native AFUNIXSocketCredentials peerCredentials(FileDescriptor var0, AFUNIXSocketCredentials var1);

   static native void initFD(FileDescriptor var0, int var1);

   static native void setSocketOptionInt(FileDescriptor var0, int var1, int var2);

   static native int maxAddressLength();

   static native void accept(byte[] var0, FileDescriptor var1, FileDescriptor var2, long var3, int var5);

   static void q(AFUNIXSocketAddress var0, int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException(.i.q[14319 & 30703 & 20403 & -11341] + var1);
      } else {
         try {
            setPort(var0, var1);
         } catch (RuntimeException var3) {
            throw var3;
         } catch (Exception var4) {
            throw new IOException(.i.q[-21577 & 29620 & -13323 & 13292], var4);
         }
      }
   }

   static native int getSocketOptionInt(FileDescriptor var0, int var1);

   static native void setCreatedServer(AFUNIXServerSocket var0);

   static native void init();

   static native void close(FileDescriptor var0);
}
