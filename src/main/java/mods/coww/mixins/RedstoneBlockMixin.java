package mods.coww.mixins;

import mods.coww.blocks.AttachableRedstoneBlock;
import mods.coww.blocks.AttachedRedlonBlock;
import mods.coww.blocks.RedlonBlock;
import mods.coww.registry.CropWonderWorkingBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.RedstoneBlock;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(RedstoneBlock.class)
public abstract class RedstoneBlockMixin extends Block implements AttachableRedstoneBlock {
    protected RedstoneBlockMixin(Settings settings) { super(settings); }

    public RedlonBlock coww_getStem() {
        return (RedlonBlock)CropWonderWorkingBlocks.REDLON;
    }

    public AttachedRedlonBlock coww_getAttachedStem() { return (AttachedRedlonBlock) CropWonderWorkingBlocks.ATTACHED_REDLON; }
}
