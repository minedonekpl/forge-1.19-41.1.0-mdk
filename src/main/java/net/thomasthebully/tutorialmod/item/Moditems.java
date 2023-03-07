package net.thomasthebully.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thomasthebully.tutorialmod.tutorialmod;

public class Moditems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, tutorialmod.MOD_ID);

    public  static final RegistryObject<Item> ZIRCON = Items.register( "zircon",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public  static final RegistryObject<Item> RAW_ZIRCON = Items.register( "raw_zircon",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
