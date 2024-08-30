package org.newsclub.net.unix;

import java.io.File;
import java.util.Objects;

public final class t extends org.newsclub.net.unix.r {
   private final File dlp;

   public t(String var1) {
      Objects.requireNonNull(var1, .u.q[31613 & 24433 & 1919 & 5111]);
      this.dlp = new File(var1);
   }

   protected AFUNIXSocketAddress E(String var1, int var2) {
      return new AFUNIXSocketAddress(this.dlp, var2);
   }

   public t(File var1) {
      Objects.requireNonNull(var1, .u.q[6139 & -3205 & -20618 & 10111]);
      this.dlp = var1;
   }
}
