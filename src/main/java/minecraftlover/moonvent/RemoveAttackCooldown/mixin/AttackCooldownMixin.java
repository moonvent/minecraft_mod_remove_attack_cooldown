package minecraftlover.moonvent.RemoveAttackCooldown.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.SwordItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;


@Mixin(PlayerEntity.class)
public class AttackCooldownMixin {
	@ModifyReturnValue(method = "getAttackCooldownProgress", at = @At("RETURN"))
	private float resetAttackCooldown(float original) {
		return isSword() ? 1.0f: original ;
	}

	private boolean isSword() {
		return MinecraftClient.getInstance().player.getMainHandStack().getItem() instanceof SwordItem;
	}
}
