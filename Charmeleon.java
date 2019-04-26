/**
 * Charmeleon Pokemon object class. Subclass of Charmander 
 * @author Stephen Zheng
 * @since 02/14/2019
 */
public class Charmeleon extends Charmander {
	/** The minimum attack power for species. */
	static final int BASE_ATTACK_POWER = 160;
	/** The minimum defense power for species. */
	static final int BASE_DEFENSE_POWER = 140;
	/** The minimum stamina power for species. */
	static final int BASE_STAMINA_POWER = 116;

	/* Constructor with no name */
	public Charmeleon() {
		super("Charmeleon", "Charmeleon", 5, 1.1, 19.0, 
      BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
		chooseFastAttack();
		chooseSpecialAttack();
	}

	/* Constructor with name */
	public Charmeleon(String name) {
		super("Charmeleon", name, 5, 1.1, 19.0, 
      BASE_ATTACK_POWER, BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
		chooseFastAttack();
		chooseSpecialAttack();
	}

	/* Constructor with species and name for subclasses */
	protected Charmeleon(String species, String name, int num, double ht, double wt, int baseAttackPwr,
			int baseDefensePwr, int baseStaminaPwr) {
		super(species, name, num, ht, wt, baseAttackPwr, baseDefensePwr, baseStaminaPwr);
	}

}
