package minecraftlover.moonvent.RemoveAttackCooldown.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;


@Mixin(PlayerEntity.class)
public class AttackCooldownMixin {
	@ModifyReturnValue(method = "getAttackCooldownProgress", at = @At("RETURN"))
	private float resetAttackCooldown(float original) {
		return 1.0f;
	}
}
