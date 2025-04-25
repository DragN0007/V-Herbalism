package com.dragn0007.vherbalism.blocks;

import com.dragn0007.vherbalism.Herbalism;
import com.dragn0007.vherbalism.blocks.crop.*;
import com.dragn0007.vherbalism.blocks.crop.base.HerbalismSandyFlowerBlock;
import com.dragn0007.vherbalism.blocks.other.BurdockRootBlock;
import com.dragn0007.vherbalism.blocks.other.HangingBurdockRootBlock;
import com.dragn0007.vherbalism.blocks.other.PreparedOakLeaves;
import com.dragn0007.vherbalism.items.VHItems;
import com.dragn0007.vherbalism.world.tree.AlderTreeGrower;
import com.dragn0007.vherbalism.world.tree.SappyBirchTreeGrower;
import com.dragn0007.vherbalism.world.tree.WillowTreeGrower;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.OAK_PLANKS;

public class VHBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Herbalism.MODID);

    public static final RegistryObject<Block> BLACKBERRY_BUSH = registerBlockWithoutItem("blackberry_bush",
            () -> new BlackberryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> BAY_LAUREL = registerBlockWithoutItem("bay_laurel",
            () -> new BayLaurelCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_BAY_LAUREL = registerBlockWithoutItem("wild_bay_laurel",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BINDWEED = registerBlockWithoutItem("bindweed",
            () -> new BindweedCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_BINDWEED = registerBlockWithoutItem("wild_bindweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BORAGE = registerBlockWithoutItem("borage",
            () -> new BorageCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_BORAGE = registerBlockWithoutItem("wild_borage",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BRIGHT_EYE = registerBlockWithoutItem("bright_eye",
            () -> new BindweedCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_BRIGHT_EYE = registerBlockWithoutItem("wild_bright_eye",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BROOM_SHRUB = registerBlockWithoutItem("broom_shrub",
            () -> new BroomShrub(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> BURDOCK_ROOT = registerBlockWithoutItem("burdock_root",
            () -> new BurdockRootBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)));
    public static final RegistryObject<Block> HANGING_BURDOCK_ROOT = registerBlockWithoutItem("hanging_burdock_root",
            () -> new HangingBurdockRootBlock(BlockBehaviour.Properties.copy(Blocks.HANGING_ROOTS)));

    public static final RegistryObject<Block> BURNET = registerBlockWithoutItem("burnet",
            () -> new BurnetCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_BURNET = registerBlockWithoutItem("wild_burnet",
            () -> new HerbalismSandyFlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CATCHWEED = registerBlockWithoutItem("catchweed",
            () -> new CatchweedCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_CATCHWEED = registerBlockWithoutItem("wild_catchweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CATMINT = registerBlockWithoutItem("catmint",
            () -> new CatmintCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_CATMINT = registerBlockWithoutItem("wild_catmint",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CAMOMILE = registerBlockWithoutItem("camomile",
            () -> new CamomileCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_CAMOMILE = registerBlockWithoutItem("wild_camomile",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CELADINE = registerBlockWithoutItem("celadine",
            () -> new CeladineCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_CELADINE = registerBlockWithoutItem("wild_celadine",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> COBWEB = registerBlockWithoutItem("cobweb",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POPPY).noCollission()));

    public static final RegistryObject<Block> CHERVIL = registerBlockWithoutItem("chervil",
            () -> new ChervilCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_CHERVIL = registerBlockWithoutItem("wild_chervil",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CHICKWEED = registerBlockWithoutItem("chickweed",
            () -> new ChickweedCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_CHICKWEED = registerBlockWithoutItem("wild_chickweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> COLTSFOOT = registerBlockWithoutItem("coltsfoot",
            () -> new ColtsfootCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_COLTSFOOT = registerBlockWithoutItem("wild_coltsfoot",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> COMFREY = registerBlockWithoutItem("comfrey",
            () -> new ComfreyCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_COMFREY = registerBlockWithoutItem("wild_comfrey",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> DAISY = registerBlockWithoutItem("daisy",
            () -> new DaisyCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));

    public static final RegistryObject<Block> DANDELION = registerBlockWithoutItem("dandelion",
            () -> new DandelionCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
//
    public static final RegistryObject<Block> DOCK = registerBlockWithoutItem("dock",
            () -> new DockCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_DOCK = registerBlockWithoutItem("wild_dock",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ELDERBERRY_BUSH = registerBlockWithoutItem("elderberry_bush",
            () -> new BlackberryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> FENNEL = registerBlockWithoutItem("fennel",
            () -> new FennelCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_FENNEL = registerBlockWithoutItem("wild_fennel",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> FEVERFEW = registerBlockWithoutItem("feverfew",
            () -> new FennelCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_FEVERFEW = registerBlockWithoutItem("wild_feverfew",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> GARLIC = registerBlockWithoutItem("garlic",
            () -> new GarlicCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_GARLIC = registerBlockWithoutItem("wild_garlic",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> GOATWEED = registerBlockWithoutItem("goatweed",
            () -> new GoatweedCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_GOATWEED = registerBlockWithoutItem("wild_goatweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> GOLDENROD = registerBlockWithoutItem("goldenrod",
            () -> new GoldenrodCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_GOLDENROD = registerBlockWithoutItem("wild_goldenrod",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HAWKWEED = registerBlockWithoutItem("hawkweed",
            () -> new HawkweedCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_HAWKWEED = registerBlockWithoutItem("wild_hawkweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HEATHER = registerBlockWithoutItem("heather",
            () -> new HeatherCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_HEATHER = registerBlockWithoutItem("wild_heather",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HORSETAIL = registerBlockWithoutItem("horsetail",
            () -> new HorsetailCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_HORSETAIL = registerBlockWithoutItem("wild_horsetail",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> IVY = registerBlockWithoutItem("ivy",
            () -> new IvyCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_IVY = registerBlockWithoutItem("wild_ivy",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> JUNIPER_BUSH = registerBlockWithoutItem("juniper_bush",
            () -> new JuniperBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> LAVENDER = registerBlockWithoutItem("lavender",
            () -> new LavenderCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_LAVENDER = registerBlockWithoutItem("wild_lavender",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> LOVAGE = registerBlockWithoutItem("lovage",
            () -> new LovageCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_LOVAGE = registerBlockWithoutItem("wild_loveage",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> LUNGWORT = registerBlockWithoutItem("lungwort",
            () -> new LungwortCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_LUNGWORT = registerBlockWithoutItem("wild_lungwort",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> MALLOW = registerBlockWithoutItem("mallow",
            () -> new MallowCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_MALLOW = registerBlockWithoutItem("wild_mallow",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> MARIGOLD = registerBlockWithoutItem("marigold",
            () -> new MarigoldCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_MARIGOLD = registerBlockWithoutItem("wild_marigold",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> MINT = registerBlockWithoutItem("mint",
            () -> new MintCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_MINT = registerBlockWithoutItem("wild_mint",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> PARSLEY = registerBlockWithoutItem("parsley",
            () -> new ParsleyCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_PARSLEY = registerBlockWithoutItem("wild_parsley",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> RAGWEED = registerBlockWithoutItem("ragweed",
            () -> new RagweedCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_RAGWEED = registerBlockWithoutItem("wild_ragweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> RAGWORT = registerBlockWithoutItem("ragwort",
            () -> new RagwortCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_RAGWORT = registerBlockWithoutItem("wild_ragwort",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> RASPBERRY_BUSH = registerBlockWithoutItem("raspberry_bush",
            () -> new RaspberryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> RHUBARB = registerBlockWithoutItem("rhubarb",
            () -> new RhubarbCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_RHUBARB = registerBlockWithoutItem("wild_rhubarb",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ROSEMARY = registerBlockWithoutItem("rosemary",
            () -> new RosemaryCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_ROSEMARY = registerBlockWithoutItem("wild_rosemary",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> RUSH = registerBlockWithoutItem("rush",
            () -> new RosemaryCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_RUSH = registerBlockWithoutItem("wild_rush",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SHEEP_SORREL = registerBlockWithoutItem("sheep_sorrel",
            () -> new SheepSorrelCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_SHEEP_SORREL = registerBlockWithoutItem("wild_sheep_sorrel",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SORREL = registerBlockWithoutItem("sorrel",
            () -> new SorrelCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_SORREL = registerBlockWithoutItem("wild_sorrel",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> STINGING_NETTLE = registerBlockWithoutItem("stinging_nettle",
            () -> new StingingNettleCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_STINGING_NETTLE = registerBlockWithoutItem("wild_stinging_nettle",
            () -> new StingingNettle(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SWEET_SEDGE = registerBlockWithoutItem("sweet_sedge",
            () -> new SweetSedgeCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_SWEET_SEDGE = registerBlockWithoutItem("wild_sweet_sedge",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> TANSY = registerBlockWithoutItem("tansy",
            () -> new TansyCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_TANSY = registerBlockWithoutItem("wild_tansy",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> THYME = registerBlockWithoutItem("thyme",
            () -> new ThymeCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_THYME = registerBlockWithoutItem("wild_thyme",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> TORMENTIL = registerBlockWithoutItem("tormentil",
            () -> new TormentilCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_TORMENTIL = registerBlockWithoutItem("wild_tormentil",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WATERMINT = registerBlockWithoutItem("watermint",
            () -> new WatermintCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_WATERMINT = registerBlockWithoutItem("wild_watermint",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WILLOW = registerBlockWithoutItem("willow",
            () -> new WillowCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_WILLOW = registerBlockWithoutItem("wild_willow",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WINTERGREEN_BUSH = registerBlockWithoutItem("wintergreen_bush",
            () -> new WintergreenBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> WOOD_SORREL = registerBlockWithoutItem("wood_sorrel",
            () -> new WoodSorrelCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_WOOD_SORREL = registerBlockWithoutItem("wild_wood_sorrel",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> YARROW = registerBlockWithoutItem("yarrow",
            () -> new WoodSorrelCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_YARROW = registerBlockWithoutItem("wild_yarrow",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> DEATHBERRY_BUSH = registerBlockWithoutItem("deathberry_bush",
            () -> new DeathberryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> FOXGLOVE = registerBlockWithoutItem("foxglove",
            () -> new FoxgloveCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_FOXGLOVE = registerBlockWithoutItem("wild_foxglove",
            () -> new FlowerBlock(MobEffects.POISON, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HOLLYBERRY_BUSH = registerBlockWithoutItem("hollyberry_bush",
            () -> new HollyberryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> MEADOW_SAFFRON = registerBlockWithoutItem("meadow_saffron",
            () -> new MeadowSaffronCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_MEADOW_SAFFRON = registerBlockWithoutItem("wild_meadow_saffron",
            () -> new MeadowSaffron(MobEffects.POISON, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> NIGHTSHADE_BUSH = registerBlockWithoutItem("nightshade_bush",
            () -> new NightshadeBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> HEMLOCK = registerBlockWithoutItem("hemlock",
            () -> new HemlockCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_HEMLOCK = registerBlockWithoutItem("wild_hemlock",
            () -> new Hemlock(MobEffects.POISON, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SNAKEROOT = registerBlockWithoutItem("snakeroot",
            () -> new SnakerootCrop(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noCollission()));
    public static final RegistryObject<Block> WILD_SNAKEROOT = registerBlockWithoutItem("wild_snakeroot",
            () -> new FlowerBlock(MobEffects.POISON, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));


    public static final RegistryObject<Block> SAPPY_BIRCH_SAPLING = registerBlock("sappy_birch_sapling",
            () -> new SaplingBlock(new SappyBirchTreeGrower(), BlockBehaviour.Properties.copy(Blocks.BIRCH_SAPLING)));

    public static final RegistryObject<Block> ALDER_LEAVES = registerBlock("alder_leaves",
            () -> new LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> ALDER_PLANKS = registerBlock("alder_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALDER_STAIRS = registerBlock("alder_stairs",
            () -> new StairBlock(ALDER_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALDER_SLAB = registerBlock("alder_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ALDER_PLANKS.get())));
    public static final RegistryObject<Block> ALDER_SAPLING = registerBlock("alder_sapling",
            () -> new SaplingBlock(new AlderTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ALDER_FENCE = registerBlock("alder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ALDER_FENCE_GATE = registerBlock("alder_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(OAK_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves",
            () -> new LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow_stairs",
            () -> new StairBlock(WILLOW_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(WILLOW_PLANKS.get())));
    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(OAK_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> PREPARED_OAK_LEAVES = registerBlock("prepared_oak_leaves", PreparedOakLeaves::new);
    public static final RegistryObject<Block> DRIED_OAK_LEAVES = registerBlock("placed_dried_oak_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> KITTYPET_SCENT = registerBlock("kittypet_scent", Scent::new);
    public static final RegistryObject<Block> LONER_SCENT = registerBlock("loner_scent", Scent::new);
    public static final RegistryObject<Block> MEDIATOR_SCENT = registerBlock("mediator_scent", Scent::new);
    public static final RegistryObject<Block> ROGUE_SCENT = registerBlock("rogue_scent", Scent::new);
    public static final RegistryObject<Block> SHARP_SCENT = registerBlock("sharp_scent", Scent::new);
    public static final RegistryObject<Block> WHARF_SCENT = registerBlock("wharf_scent", Scent::new);
    public static final RegistryObject<Block> WHISTLE_SCENT = registerBlock("whistle_scent", Scent::new);

    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        VHItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }
    public static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
