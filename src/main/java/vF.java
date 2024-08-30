import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;

class vf implements Runnable {
   // $FF: synthetic field
   final Map aAr;
   // $FF: synthetic field
   final ve aAs;

   vf(ve var1, Map var2) {
      this.aAs = var1;
      this.aAr = var2;
   }

   public void run() {
      if (this.aAr.containsKey(Type.SKIN)) {
         this.aAs.aAo.q((MinecraftProfileTexture)this.aAr.get(Type.SKIN), Type.SKIN, this.aAs.aAp);
      }

      if (this.aAr.containsKey(Type.CAPE)) {
         this.aAs.aAo.q((MinecraftProfileTexture)this.aAr.get(Type.CAPE), Type.CAPE, this.aAs.aAp);
      }

   }
}
