/**
 * This file is part of Aion-Lightning <aion-lightning.org>.
 *
 *  Aion-Lightning is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Aion-Lightning is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details. *
 *  You should have received a copy of the GNU General Public License
 *  along with Aion-Lightning.
 *  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.gameserver.world;

public enum WorldMapType {
    // Asmodae
    PANDAEMONIUM(120010000),
    CONVENT_OF_MARCHUTAN(120020000),
    MARCHUTAN_PRIORY(120080000),
    REFUGE_OF_RETURNEES_D(140010000),
    ISHALGEN(220010000),
    MORHEIM(220020000),
    ALTGARD(220030000),
    BELUSLAN(220040000),
    BRUSTHONIN(220050000),
    NOSRA(220110000),
    TOWER_OF_ETERNITY_D(220120000),
	PERNON(710010000),
    // Elysea
    SANCTUM(110010000),
    CLOISTER_OF_KAISINEL(110020000),
    KAISINEL_ACADEMY(110070000),
    REFUGE_OF_RETURNEES_L(130090000),
    POETA(210010000),
    ELTNEN(210020000),
    VERTERON(210030000),
    HEIRON(210040000),
    THEOBOMOS(210060000),
    ESTERRA(210100000),
    TOWER_OF_ETERNITY_L(210110000),
	ORIEL(700010000),
    // Balaurea
    INGGISON(210050000),
    SIGNIA(210070000),
    GRIFFOEN(210080000),
    KATALAM_UNDERGROUND_L(210090000),
	//INGGISON(210130000),
    GELKMAROS(220070000),
    VENGAR(220080000),
    HABROK(220090000),
    KATALAM_UNDERGROUND_D(220100000),
	//GELKMAROS(220140000),
	SILENTERA_CANYON_L(600010000),
    TIAMARANTAS_EYE_L(600040000),
    TIAMARANTAS_EYE_D(600041000),
    AKARON(600100000),
	SILENTERA_CANYON_D(600110000),
    LAKRUM(600200000),
    DUMAHA(600300000),
    // Abyss
    RESHANTA(400010000),
    // Prison
    LF_PRISON(510010000),
    DF_PRISON(520010000),
    // Instances
    ARENA_EVENT_L(210120000),
    ARENA_EVENT_D(220130000),
    IDABPRO(300010000),
    NOCHSANA_TRAINING_CAMP(300030000),
    DARK_POETA(300040000),
    GALE_ISLAND_TREASURE_CHAMBER(300050000),
    SULPHUR_TREE_NEST(300060000),
    ZEPHYR_ISLAND_TREASURE_CHAMBER(300070000),
    LEFT_WING_CHAMBER(300080000),
    RIGHT_WING_CHAMBER(300090000),
    STEEL_RAKE(300100000),
    BARANATH_DREDGION(300110000),
    KRAKONS_DISPUTE_TREASURE_CHAMBER(300120000),
    TWILIGHT_BATTLEFIELD_TREASURE_CHAMBER(300130000),
    ISLE_OF_ROOTS_TREASURE_CHAMBER(300140000),
    UDAS_TEMPLE(300150000),
    CAMPAIGN_LOWER_UDAS_TEMPLE(300160000),
    BESHMUNDIR_TEMPLE(300170000),
    CAMPAIGN_TALOCS_HOLLOW(300190000),
    CAMPAIGN_HARAMEL(300200000),
    CHANTRA_DREDGION(300210000),
    ABYSSAL_SPLINTER(300220000),
    CAMPAIGN_NIGHTMARE(300230000),
    ATURAM_SKY_FORTRESS(300240000),
    ATURAM_SKY_FORTRESS_BONUS(300241000),
    ESOTERRACE(300250000),
    RENTUS_BASE(300280000),
    EMPYREAN_CRUCIBLE(300300000),
    CRUCIBLE_CHALLENGE(300320000),
    ARENA_OF_CHAOS(300350000),
    ARENA_OF_DISCIPLINE(300360000),
    CHAOS_TRAINING_GROUNDS(300420000),
    DISCIPLINE_TRAINING_GROUNDS(300430000),
    TERATH_DREDGION(300440000),
    ARENA_OF_COOPERATION(300450000),
    STEEL_RAKE_CABIN(300460000),
    SEALED_HALL_OF_KNOWLEDGE(300480000),
    BATTLEFIELD_OF_SURVIVAL(300490000),
    TIAMATS_FORTRESS(300510000),
    CAMPAIGN_TIAMATS_HIDEOUT(300520000),
    STEEL_WALL_BASTION(300540000),
    ARENA_OF_GLORY(300550000),
    SHUGO_IMPERIAL_TOMB(300560000),
    TRAINING_CAMP_OF_COOPERATION(300570000),
    JORMUNGANDS_BRIDGE(300590000),
    SHATTERED_ABYSSAL_SPLINTER(300600000),
    MANTOR(300610000),
    LOST_RENTUS_BASE(300620000),
    TIAMATS_HIDEOUT(300630000),
    CORRIDOR_OF_BETRAYAL(300700000),
    KATALAMIZE(300800000),
    TRAINING_ARENA_OF_UNITY(301100000),
    RUNADIUM(301110000),
    KAMARS_BATTLEFIELD(301120000),
    LOST_REFUGE(301140000),
    RUMAKIKIS_CONSPIRACY_SOLO(301150000),
    RUKIBUKI_CIRCUS_L(301160000),
    RUKIBUKI_CIRCUS_D(301200000),
    JORMUNGAND_MARCHING_ROUTE(301210000),
    STEEL_WALL_BASTION_BATTLEFIELD(301220000),
    RUNE_SHIELD_TOWER(301230000),
    HIDDEN_KYSIS_WAR_FORTRESS(301240000),
    HIDDEN_MIREN_WAR_FORTRESS(301250000),
    HIDDEN_KROTAN_WAR_FORTRESS(301260000),
    BARUNA_RESEARCH_LABORATORY_L(301270000),
    KYSIS_WAR_FORTRESS(301280000),
    MIREN_WAR_FORTRESS(301290000),
    KROTAN_WAR_FORTRESS(301300000),
    RUNATORIUM(301310000),
    JORMUNGAND_BRIDGE_BONUS(301320000),
    RUNADIUM_BONUS(301330000),
    BARUNA_RESEARCH_LABORATORY_D(301340000),
    RUNADIUM_HEROIC(301360000),
    RUNE_SHIELD_TOWER_HEROIC(301370000),
    RUNE_TRIBE_REFUGE(301380000),
    MAKARNA_OF_BITTERNESS(301390000),
    TRILLONERKS_SECRET_GOLD_VAULT_L(301400000),
    PLAZA_OF_CHALLENGE(301500000),
    CURSED_ARGENT_MANOR(301510000),
    CAMPAIGN_MAKARNA(301520000),
    LIBRARY_OF_KNOWLEDGE_L(301540000),
    GARDEN_OF_KNOWLEDGE(301550000),
    MUSEUM_OF_KNOWLEDGE(301560000),
    LIBRARY_OF_KNOWLEDGE_D(301570000),
    CRUCIBLE_DUNGEON(301580000),
    TRILLONERKS_SECRET_GOLD_VAULT_D(301590000),
    ADMA_RUINS(301600000),
    ELEMENTAL_LORDS_LABORATORY(301610000),
    ARKHALS_HIDEOUT(301620000),
    HELL_PASS(301630000),
    SURE_HELL_PASS(301631000),
    EVENT_INCOGNITO_HELLPATH(301632000),
    MECHANERKS_WEAPONS_FACTORY(301640000),
    ASHUNATAL_DREDGION(301650000),
    KROBAN_BASE(301660000),
    BALAUR_MARCHING_ROUTE(301670000),
    RUNATORIUM_RUINS(301680000),
    AETHER_MINE(301690000),
    TREASURE_ISLAND_OF_COURAGE(301700000),
    MIRASH_REFUGE(301720000),
    MIRASH_REFUGE_BONUS(301730000),
    EVENT_HOUSE_GHORYS_GOLD_VAULT(301750000),
    FIRE_TEMPLE_OF_MEMORY(302000000),
    RIFT_OF_OBLIVION(302100000),
    RIFT_OF_OBLIVION_BONUS(302110000),
    SANCTUM_BATTLEFIELD(302200000),
    PANDAEMONIUM_BATTLEFIELD(302300000),
    GOLD_ARENA(302310000),
    GOLDEN_CRUCIBLE(302320000),
    KUMUKI_HIDEOUT(302330000),
    NARAKKALLI(302340000),
    INTERNET_CAFE_NARAKKALLI_BONUS(302341000),
    NEVIWIND_CANYON(302350000),
    GOLD_ARENA_LONE_FIGHTER(302360000),
    GOLDEN_CRUCIBLE_GROUP_BATTLE(302370000),
    GOLD_ARENA_GROUP_BATTLES_L(302380000), //TODO - Asmo or Elyos
    GOLDEN_CRUCIBLE_GROUP_BATTLES_L(302390000), //TODO - Asmo or Elyos
    TOWER_OF_CHALLENGE_L(302400000),
    GOLD_ARENA_GROUP_BATTLES_D(302410000), //TODO - Asmo or Elyos
    GOLDEN_CRUCIBLE_GROUP_BATTLES_D(302420000), //TODO - Asmo or Elyos
    PROMETUNS_WORKSHOP_NORMAL(302430000),
    SILENTERA_CANYON(302440000),
    TOWER_OF_CHALLENGE(302450000),
    KUBRINERKS_CUBE_LABORATORY(302460000),
    SANCTUM_BATTLEFIELD_Q(302470000),
    PANDAEMONIUM_BATTLEFIELD_Q(302480000),
    GARDEN_OF_KNOWLEDGE_BONUS(302490000),
    HERERIM_MINE(302500000),
    SENEKTA(302510000),
    INTERNET_CAFE_STEEL_RAKE_FORTRESS_BONUS(302520000),
    ILLUMIEL(302530000),
    KUMUKI_HIDEOUT_IN_COOPERATION_WITH_MADE_IN_ABYSS(302540000),
    STELLA_DEVELOPMENT_LABORATORY_NORMAL(302550000),
    REGA_HEADQUARTERS(302560000),
    VISHAKAS_HIDEOUT(302570000),
    SECRET_NK_INSTITUTE(302580000),
    GOLD_ARENA_3_VS_3(302590000),
    GOLDEN_CRUCIBLE_3_VS_3(302600000),
    STELLA_DEVELOPMENT_LABORATORY_EASY(302610000),
    IDLDF8_LAB_H(302620000),
    PROMETUNS_WORKSHOP_DIFFICULT(302630000),
    MINIUM_VAULT(302641000),
    EVENT_LEGION_BANQUET_HALL(302650000),
    BENINERKS_MANOR_NORMAL(302660000),
    SHADOW_OF_SUFFERING(302670000),
    TOWER_OF_CHALLENGE_LOWER_LEVEL(302680000),
    BENINERKS_MANOR_EASY(302690000),
    UNSTABLE_ABYSSAL_SPLINTER(302710000),
    KARAMATIS_A(310010000),
    KARAMATIS_B(310020000),
    AERDINA(310030000),
    GERANAIA(310040000),
    CAMPAIGN_AETHEROGENETICS_LAB(310050000),
    SLIVER_OF_DARKNESS_L(310060000),
    SLIVER_OF_DARKNESS_D(310070000),
    SANCTUM_UNDERGROUND_ARENA(310080000),
    CAMPAIGN_INDRATU_FORTRESS(310090000),
    AZOTURAN_FORTRESS(310100000),
    THEOBOMOS_LAB(310110000),
    KARAMATIS_C(310120000),
    HOLY_TOWER_L(310160000),
    INTERNET_CAFE_HOLY_TOWER_BONUS_L(310161000),
    ATAXIAR_A(320010000),
    ATAXIAR_B(320020000),
    BREGIRUN(320030000),
    NIDALBER(320040000),
    SKY_TEMPLE_INTERIOR(320050000),
    SPACE_OF_OBLIVION(320060000),
    SPACE_OF_DESTINY(320070000),
    DRAUPNIR_CAVE(320080000),
    TRINIEL_UNDERGROUND_ARENA(320090000),
    FIRE_TEMPLE(320100000),
    CAMPAIGN_ALQUIMIA_RESEARCH_CENTRE(320110000),
    SHADOW_COURT_DUNGEON(320120000),
    ADMA_STRONGHOLD(320130000),
    ATAXIAR_C(320140000),
    PADMARASHKAS_CAVE(320150000),
    HOLY_TOWER_D(320160000),
    INTERNET_CAFE_HOLY_TOWER_BONUS_D(320161000),
    CAMPAIGN_BAKARMA_FORTRESS(320170000),
    GENESIS_ARENA(320180000),
    ORIEL_B(720010000),
    PERNON_B(730010000),
    // Housing
    ELYSEAN_LEGION_HOUSING(700020000, true),
    ASMODIAN_LEGION_HOUSING(710020000, true),
    HOUSING_BARRACK(900110000, true),
    // Test Maps
    IDTEST_DUNGEON(300020000),
    TEST_MRT_IDZONE(300290000),
    TEST_BASIC(900020000),
    TEST_SERVER(900030000),
    TEST_GIANTMONSTER(900100000),
    TEST_IDARENA(900120000),
    IDLDF5RE_TEST(900130000),
    INSTANCE_TEST(900140000),
    INSTANCE_TEST_2(900150000),
    TEST_INTRO(900170000),
    TEST_SERVER_ART(900180000),
    TAGMATCHTESTLEVEL(900190000),
    TESTTIMEATTACKINSTANCE_02(900200000),
    IDTOURNAMENT_STAGE_TEST(900210000),
    IDTOURNAMENT_LOBBY_TEST(900230000),
    IDTOURNAMENT_TEST_01(900240000),
    // 
    SAURO_WAR_DEPOT(301130000),
    BELUS_TERRITORY(400020000),
    ANTRIKSHAS_ASCENSION_SITE(400030000),
    ASPIDA_TERRITORY(400040000),
    ATHANOS_TERRITORY(400050000),
    DEYLON_TERRITORY(400060000),
    CONCERT_GROUNDS(600080000),
    SECRET_LOCATION(600081000),
    MEETING_POINT(800010000),
    KALDOR(800020000),
    RED_KATALAM_NORTH(800030000),
    SOUTH_KATALAM(800040000),
    SYSTEM_BASIC(900220000);

	private final int worldId;
	private final boolean isPersonal;

	WorldMapType(int worldId) {
		this(worldId, false);
	}

	WorldMapType(int worldId, boolean personal) {
		this.worldId = worldId;
		this.isPersonal = personal;
	}

	public int getId() {
		return worldId;
	}

	public boolean isPersonal() {
		return isPersonal;
	}

	/**
	 * @param id
	 *            of world
	 * @return WorldMapType
	 */
	public static WorldMapType getWorld(int id) {
		for (WorldMapType type : WorldMapType.values()) {
			if (type.getId() == id) {
				return type;
			}
		}
		return null;
	}
}
