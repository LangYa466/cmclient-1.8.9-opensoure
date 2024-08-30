package net.minecraft.client.main;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

final class u extends Authenticator {
   // $FF: synthetic field
   final String TA;
   // $FF: synthetic field
   final String TB;

   u(String var1, String var2) {
      this.TB = var1;
      this.TA = var2;
   }

   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.TB, this.TA.toCharArray());
   }
}
