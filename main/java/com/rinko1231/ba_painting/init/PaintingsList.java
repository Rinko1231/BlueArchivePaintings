package com.rinko1231.ba_painting.init;

import com.rinko1231.ba_painting.BAPainting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PaintingsList {
	
	public static final DeferredRegister<PaintingVariant> PAINTING_TYPES = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, BAPainting.MOD_ID);

	public static final RegistryObject<PaintingVariant> AKO23 = PAINTING_TYPES.register("ako23", () -> new PaintingVariant(32,48));
	public static final RegistryObject<PaintingVariant> MIYU12 = PAINTING_TYPES.register("miyu12", () -> new PaintingVariant(16,32));
	public static final RegistryObject<PaintingVariant> MIYU11 = PAINTING_TYPES.register("miyu11", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> AZUSA22 = PAINTING_TYPES.register("azusa22", () -> new PaintingVariant(32,32));
	public static final RegistryObject<PaintingVariant> TERROR23 = PAINTING_TYPES.register("terror23", () -> new PaintingVariant(32,48));

	public static final RegistryObject<PaintingVariant> PLANA12 = PAINTING_TYPES.register("plana12", () -> new PaintingVariant(16,32));
	public static final RegistryObject<PaintingVariant> MARI12 = PAINTING_TYPES.register("mari12", () -> new PaintingVariant(16,32));
	public static final RegistryObject<PaintingVariant> MIKA23 = PAINTING_TYPES.register("mika23", () -> new PaintingVariant(32,48));
	public static final RegistryObject<PaintingVariant> KAYOKO23 = PAINTING_TYPES.register("kayoko23", () -> new PaintingVariant(32,48));
	public static final RegistryObject<PaintingVariant> HINASWIM32 = PAINTING_TYPES.register("hinaswim32", () -> new PaintingVariant(48,32));

	public static final RegistryObject<PaintingVariant> MARIPRAY12 = PAINTING_TYPES.register("maripray12", () -> new PaintingVariant(16,32));
	public static final RegistryObject<PaintingVariant> HASUMI23 = PAINTING_TYPES.register("hasumi23", () -> new PaintingVariant(32,48));
	public static final RegistryObject<PaintingVariant> HANAKO32 = PAINTING_TYPES.register("hanako32", () -> new PaintingVariant(48,32));
	public static final RegistryObject<PaintingVariant> ARU21 = PAINTING_TYPES.register("aru21", () -> new PaintingVariant(32,16));
	public static final RegistryObject<PaintingVariant> IZUNA32 = PAINTING_TYPES.register("izuna32", () -> new PaintingVariant(48,32));

	public static final RegistryObject<PaintingVariant> HINANIGHT32 = PAINTING_TYPES.register("hinanight32", () -> new PaintingVariant(48,32));
	public static final RegistryObject<PaintingVariant> MUTSUKI12 = PAINTING_TYPES.register("mutsuki12", () -> new PaintingVariant(16,32));
	public static final RegistryObject<PaintingVariant> ATSUKO11 = PAINTING_TYPES.register("atsuko11", () -> new PaintingVariant(16,16));
	public static final RegistryObject<PaintingVariant> ARONA23 = PAINTING_TYPES.register("arona23", () -> new PaintingVariant(32,48));
	public static final RegistryObject<PaintingVariant> KOHARU11 = PAINTING_TYPES.register("koharu11", () -> new PaintingVariant(16,16));

	public static final RegistryObject<PaintingVariant> SHIROKO22 = PAINTING_TYPES.register("shiroko22", () -> new PaintingVariant(32,32));
	public static final RegistryObject<PaintingVariant> UI22 = PAINTING_TYPES.register("ui22", () -> new PaintingVariant(32,32));
	public static final RegistryObject<PaintingVariant> MIDOMOMO22 = PAINTING_TYPES.register("midomomo22", () -> new PaintingVariant(32,32));
	public static final RegistryObject<PaintingVariant> ARIS11 = PAINTING_TYPES.register("aris11", () -> new PaintingVariant(16,16));

	
}
