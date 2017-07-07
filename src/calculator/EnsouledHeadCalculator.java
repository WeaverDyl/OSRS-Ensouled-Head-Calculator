package calculator;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class EnsouledHeadCalculator {
	
	/**
	 * A calculator used to calculate the amount of prayer experience
	 * you will get from all of the ensouled heads you own in Old School
	 * RuneScape.
	 * 
	 * @author Dylan Weaver <dweaver@umd.edu>
	 * @version 1.0
	 * 
	 * created on June 9th, 2017
	 */
	
	//the main frame that everything is built upon
	private JFrame calculatorFrame;
	
	//The experience rates for ensouled heads
	private final long goblinExperience = 130;
	private final long monkeyExperience = 182;
	private final long impExperience = 286;
	private final long minotaurExperience = 364;
	private final long scorpionExperience = 454;
	private final long bearExperience = 480;
	private final long unicornExperience = 494;
	private final long dogExperience = 520;
	private final long chaosDruidExperience = 584;
	private final long giantExperience = 650;
	private final long ogreExperience = 716;
	private final long elfExperience = 754;
	private final long trollExperience = 780;
	private final long horrorExperience = 832;
	private final long kalphiteExperience = 884;
	private final long dagannothExperience = 936;
	private final long bloodveldExperience = 1040;
	private final long tzhaarExperience = 1104;
	private final long demonExperience = 1170;
	private final long aviansieExperience = 1234;
	private final long abyssalExperience = 1300;
	private final long dragonExperience = 1560;
	
	//textboxes
	private JTextField numberOfGoblinHeads;
	private JTextField numberOfMonkeyHeads;
	private JTextField numberOfImpHeads;
	private JTextField numberOfMinotaurHeads;
	private JTextField numberOfScorpionHeads;
	private JTextField numberOfBearHeads;
	private JTextField numberOfUnicornHeads;
	private JTextField numberOfDogHeads;
	private JTextField numberOfChaosDruidHeads;
	private JTextField numberOfGiantHeads;
	private JTextField numberOfOgreHeads;
	private JTextField numberOfElfHeads;
	private JTextField numberOfTrollHeads;
	private JTextField numberOfHorrorHeads;
	private JTextField numberOfKalphiteHeads;
	private JTextField numberOfDagannothHeads;
	private JTextField numberOfBloodveldHeads;
	private JTextField numberOfTzHaarHeads;
	private JTextField numberOfDemonHeads;
	private JTextField numberOfAviansieHeads;
	private JTextField numberOfAbyssalHeads;
	private JTextField numberOfDragonHeads;

	
	//images
	private JLabel lblGoblinHeadsImage;
	private JLabel lblMonkeyHeadsImage;
	private JLabel lblImpHeadsImage;
	private JLabel lblMinotaurHeadsImage;
	private JLabel lblScorpionHeadsImage;
	private JLabel lblBearHeadsImage;
	private JLabel lblUnicornHeadsImage;
	private JLabel lblDogHeadsImage;
	private JLabel lblChaosDruidHeadsImage;
	private JLabel lblGiantHeadsImage;
	private JLabel lblOgreHeadsImage;
	private JLabel lblElfHeadsImage;
	private JLabel lblTrollHeadsImage;
	private JLabel lblHorrorHeadsImage;
	private JLabel lblKalphiteHeadsImage;
	private JLabel lblDagannothHeadsImage;
	private JLabel lblBloodveldHeadsImage;
	private JLabel lblTzHaarHeadsImage;
	private JLabel lblDemonHeadsImage;
	private JLabel lblAviansieHeadsImage;
	private JLabel lblAbyssalHeadsImage;
	private JLabel lblDragonHeadsImage;
	private JLabel lblExperienceGain;
	
	private JButton btnInstructions;
	private JButton btnAbout;
	private JButton btnCalculateExperience;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
						UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					}
					catch (Exception e) {
						System.out.println("Error, reverting to Java look and feel");
					}
					EnsouledHeadCalculator window = new EnsouledHeadCalculator();
					window.calculatorFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EnsouledHeadCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		calculatorFrame = new JFrame();
		calculatorFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(EnsouledHeadCalculator.class.getResource("/images/Ensouled_goblin_head.png")));
		calculatorFrame.setResizable(false);
		calculatorFrame.setTitle("Old School RuneScape Ensouled Heads Calculator");
		calculatorFrame.setBounds(100, 100, 736, 413);
		calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorFrame.getContentPane().setLayout(null);
		
//BEGIN ENSOULED GOBLIN HEADS
		//the goblin heads text label
		JLabel lblGoblinHeads = new JLabel("Goblin Heads");
		lblGoblinHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGoblinHeads.setBounds(10, 11, 90, 30);
		calculatorFrame.getContentPane().add(lblGoblinHeads);
		
		//the number of ensouled goblin heads
		numberOfGoblinHeads = new JTextField();
		numberOfGoblinHeads.setText("0");
		numberOfGoblinHeads.setColumns(10);
		numberOfGoblinHeads.setBounds(149, 17, 86, 20);
		calculatorFrame.getContentPane().add(numberOfGoblinHeads);
		
		//the image for ensouled goblin heads
		lblGoblinHeadsImage = new JLabel("");
		Image goblinHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_goblin_head.png")).getImage();
		lblGoblinHeadsImage.setIcon(new ImageIcon(goblinHeadsImage));
		lblGoblinHeadsImage.setBounds(110, 11, 29, 30);
		calculatorFrame.getContentPane().add(lblGoblinHeadsImage);
//END ENSOULED GOBLIN HEADS		
		
//BEGIN ENSOULED MONKEY HEADS
		//the monkey heads text label
		JLabel lblMonkeyHeads = new JLabel("Monkey Heads");
		lblMonkeyHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMonkeyHeads.setBounds(10, 52, 90, 30);
		calculatorFrame.getContentPane().add(lblMonkeyHeads);
		
		//the number of ensouled monkey heads
		numberOfMonkeyHeads = new JTextField();
		numberOfMonkeyHeads.setText("0");
		numberOfMonkeyHeads.setColumns(10);
		numberOfMonkeyHeads.setBounds(149, 58, 86, 20);
		calculatorFrame.getContentPane().add(numberOfMonkeyHeads);

		//the image for ensouled monkey heads
		lblMonkeyHeadsImage = new JLabel("");
		Image monkeyHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_monkey_head.png")).getImage();
		lblMonkeyHeadsImage.setIcon(new ImageIcon(monkeyHeadsImage));
		lblMonkeyHeadsImage.setBounds(110, 52, 29, 30);
		calculatorFrame.getContentPane().add(lblMonkeyHeadsImage);
//END ENSOULED MONKEY HEADS

//BEGIN ENSOULED IMP HEADS
		//the imp heads text label
		JLabel lblImpHeads = new JLabel("Imp Heads");
		lblImpHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblImpHeads.setBounds(10, 93, 90, 30);
		calculatorFrame.getContentPane().add(lblImpHeads);
		
		//the number of ensouled imp heads
		numberOfImpHeads = new JTextField();
		numberOfImpHeads.setText("0");
		numberOfImpHeads.setColumns(10);
		numberOfImpHeads.setBounds(149, 99, 86, 20);
		calculatorFrame.getContentPane().add(numberOfImpHeads);
		
		//the image for ensouled imp heads
		lblImpHeadsImage = new JLabel("");
		Image impHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_imp_head.png")).getImage();
		lblImpHeadsImage.setIcon(new ImageIcon(impHeadsImage));
		lblImpHeadsImage.setBounds(110, 93, 29, 30);
		calculatorFrame.getContentPane().add(lblImpHeadsImage);
//END ENSOULED IMP HEADS
		
//BEGIN ENSOULED MINOTAUR HEADS
		//the minotaur heads text label
		JLabel lblMinotaurHeads = new JLabel("Minotaur Heads");
		lblMinotaurHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMinotaurHeads.setBounds(10, 134, 90, 30);
		calculatorFrame.getContentPane().add(lblMinotaurHeads);
		
		//the number of ensouled minotaur heads
		numberOfMinotaurHeads = new JTextField();
		numberOfMinotaurHeads.setText("0");
		numberOfMinotaurHeads.setColumns(10);
		numberOfMinotaurHeads.setBounds(149, 140, 86, 20);
		calculatorFrame.getContentPane().add(numberOfMinotaurHeads);
		
		//the image for ensouled minotaur heads
		lblMinotaurHeadsImage = new JLabel("");
		Image minotaurHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_minotaur_head.png")).getImage();
		lblMinotaurHeadsImage.setIcon(new ImageIcon(minotaurHeadsImage));
		lblMinotaurHeadsImage.setBounds(110, 134, 29, 30);
		calculatorFrame.getContentPane().add(lblMinotaurHeadsImage);
//END ENSOULED MINOTAUR HEADS
		
//BEGIN ENSOULED SCORPION HEADS
		//the scorpion heads text label
		JLabel lblScorpionHeads = new JLabel("Scorpion Heads");
		lblScorpionHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblScorpionHeads.setBounds(10, 175, 90, 30);
		calculatorFrame.getContentPane().add(lblScorpionHeads);
		
		//the number of ensouled scorpion heads
		numberOfScorpionHeads = new JTextField();
		numberOfScorpionHeads.setText("0");
		numberOfScorpionHeads.setColumns(10);
		numberOfScorpionHeads.setBounds(149, 181, 86, 20);
		calculatorFrame.getContentPane().add(numberOfScorpionHeads);
		
		//the image for ensouled scorpion heads
		lblScorpionHeadsImage = new JLabel("");
		Image scorpionHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_scorpion_head.png")).getImage();
		lblScorpionHeadsImage.setIcon(new ImageIcon(scorpionHeadsImage));
		lblScorpionHeadsImage.setBounds(110, 175, 29, 30);
		calculatorFrame.getContentPane().add(lblScorpionHeadsImage);
//END ENSOULED SCORPION HEADS
		
//BEGIN ENSOULED BEAR HEADS
		//the bear heads text label
		JLabel lblBearHeads = new JLabel("Bear Heads");
		lblBearHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBearHeads.setBounds(10, 216, 90, 30);
		calculatorFrame.getContentPane().add(lblBearHeads);
		
		//the number of ensouled bear heads
		numberOfBearHeads = new JTextField();
		numberOfBearHeads.setText("0");
		numberOfBearHeads.setColumns(10);
		numberOfBearHeads.setBounds(149, 222, 86, 20);
		calculatorFrame.getContentPane().add(numberOfBearHeads);
		
		//the image for ensouled bear heads
		lblBearHeadsImage = new JLabel("");
		Image bearHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_bear_head.png")).getImage();
		lblBearHeadsImage.setIcon(new ImageIcon(bearHeadsImage));
		lblBearHeadsImage.setBounds(110, 216, 29, 30);
		calculatorFrame.getContentPane().add(lblBearHeadsImage);
//END ENSOULED BEAR HEADS
		
//BEGIN ENSOULED UNICORN HEADS
		//the unicorn heads text label
		JLabel lblUnicornHeads = new JLabel("Unicorn Heads");
		lblUnicornHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUnicornHeads.setBounds(10, 257, 90, 30);
		calculatorFrame.getContentPane().add(lblUnicornHeads);
		
		//the number of ensouled unicorn heads
		numberOfUnicornHeads = new JTextField();
		numberOfUnicornHeads.setText("0");
		numberOfUnicornHeads.setColumns(10);
		numberOfUnicornHeads.setBounds(149, 263, 86, 20);
		calculatorFrame.getContentPane().add(numberOfUnicornHeads);
		
		//the image for ensouled unicorn heads
		lblUnicornHeadsImage = new JLabel("");
		Image unicornHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_unicorn_head.png")).getImage();
		lblUnicornHeadsImage.setIcon(new ImageIcon(unicornHeadsImage));
		lblUnicornHeadsImage.setBounds(110, 257, 29, 30);
		calculatorFrame.getContentPane().add(lblUnicornHeadsImage);
//END ENSOULED UNICORN HEADS
		
//BEGIN ENSOULED DOG HEADS
		//the dog heads text label
		JLabel lblDogHeads = new JLabel("Dog Heads");
		lblDogHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDogHeads.setBounds(10, 298, 90, 30);
		calculatorFrame.getContentPane().add(lblDogHeads);
		
		//the number of ensouled dog heads
		numberOfDogHeads = new JTextField();
		numberOfDogHeads.setText("0");
		numberOfDogHeads.setColumns(10);
		numberOfDogHeads.setBounds(149, 304, 86, 20);
		calculatorFrame.getContentPane().add(numberOfDogHeads);
		
		//the image for ensouled dog heads
		lblDogHeadsImage = new JLabel("");
		Image dogHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_dog_head.png")).getImage();
		lblDogHeadsImage.setIcon(new ImageIcon(dogHeadsImage));
		lblDogHeadsImage.setBounds(110, 298, 29, 30);
		calculatorFrame.getContentPane().add(lblDogHeadsImage);
//END ENSOULED DOG HEADS

//BEGIN ENSOULED CHAOS DRUID HEADS
		//the chaos druids text label
		JLabel lblChaosDruidHeads = new JLabel("Chaos Druid Heads");
		lblChaosDruidHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblChaosDruidHeads.setBounds(245, 11, 114, 30);
		calculatorFrame.getContentPane().add(lblChaosDruidHeads);
		
		//the number of ensouled chaos druid heads
		numberOfChaosDruidHeads = new JTextField();
		numberOfChaosDruidHeads.setText("0");
		numberOfChaosDruidHeads.setColumns(10);
		numberOfChaosDruidHeads.setBounds(390, 17, 86, 20);
		calculatorFrame.getContentPane().add(numberOfChaosDruidHeads);
		
		//the image for ensouled chaos druid heads
		lblChaosDruidHeadsImage = new JLabel("");
		Image chaosDruidHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_chaos_druid_head.png")).getImage();
		lblChaosDruidHeadsImage.setIcon(new ImageIcon(chaosDruidHeadsImage));
		lblChaosDruidHeadsImage.setBounds(361, 11, 29, 30);
		calculatorFrame.getContentPane().add(lblChaosDruidHeadsImage);
//END ENSOULED CHAOS DRUID HEADS
		
//BEGIN ENSOULED GIANT HEADS
		//the giant heads text label
		JLabel lblGiantHeads = new JLabel("Giant Heads");
		lblGiantHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGiantHeads.setBounds(245, 52, 114, 30);
		calculatorFrame.getContentPane().add(lblGiantHeads);
		
		//the number of ensouled giant heads
		numberOfGiantHeads = new JTextField();
		numberOfGiantHeads.setText("0");
		numberOfGiantHeads.setColumns(10);
		numberOfGiantHeads.setBounds(390, 58, 86, 20);
		calculatorFrame.getContentPane().add(numberOfGiantHeads);

		//the image for ensouled giant heads
		lblGiantHeadsImage = new JLabel("");
		Image giantHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_giant_head.png")).getImage();
		lblGiantHeadsImage.setIcon(new ImageIcon(giantHeadsImage));
		lblGiantHeadsImage.setBounds(361, 52, 29, 30);
		calculatorFrame.getContentPane().add(lblGiantHeadsImage);
//END ENSOULED GIANT HEADS
		
//BEGIN ENSOULED OGRE HEADS
		//the ogre heads text label
		JLabel lblOgreHeads = new JLabel("Ogre Heads");
		lblOgreHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOgreHeads.setBounds(245, 93, 114, 30);
		calculatorFrame.getContentPane().add(lblOgreHeads);
		
		//the number of ensouled ogre heads
		numberOfOgreHeads = new JTextField();
		numberOfOgreHeads.setText("0");
		numberOfOgreHeads.setColumns(10);
		numberOfOgreHeads.setBounds(390, 99, 86, 20);
		calculatorFrame.getContentPane().add(numberOfOgreHeads);
		
		//the image for ensouled ogre heads
		lblOgreHeadsImage = new JLabel("");
		Image ogreHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_ogre_head.png")).getImage();
		lblOgreHeadsImage.setIcon(new ImageIcon(ogreHeadsImage));
		lblOgreHeadsImage.setBounds(361, 93, 29, 30);
		calculatorFrame.getContentPane().add(lblOgreHeadsImage);
//END ENSOULED OGRE HEADS
		
//BEGIN ENSOULED ELF HEADS
		//the elf heads text label
		JLabel lblElfHeads = new JLabel("Elf Heads");
		lblElfHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblElfHeads.setBounds(245, 134, 114, 30);
		calculatorFrame.getContentPane().add(lblElfHeads);
		
		//the number of ensouled elf heads
		numberOfElfHeads = new JTextField();
		numberOfElfHeads.setText("0");
		numberOfElfHeads.setColumns(10);
		numberOfElfHeads.setBounds(390, 140, 86, 20);
		calculatorFrame.getContentPane().add(numberOfElfHeads);
		
		//the image for ensouled elf heads
		lblElfHeadsImage = new JLabel("");
		Image elfHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_elf_head.png")).getImage();
		lblElfHeadsImage.setIcon(new ImageIcon(elfHeadsImage));
		lblElfHeadsImage.setBounds(361, 134, 29, 30);
		calculatorFrame.getContentPane().add(lblElfHeadsImage);
//END ENSOULED ELF HEADS

//BEGIN ENSOULED TROLL HEADS
		//the troll heads text label
		JLabel lblTrollHeads = new JLabel("Troll Heads");
		lblTrollHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTrollHeads.setBounds(245, 175, 114, 30);
		calculatorFrame.getContentPane().add(lblTrollHeads);
		
		//the number of ensouled troll heads
		numberOfTrollHeads = new JTextField();
		numberOfTrollHeads.setText("0");
		numberOfTrollHeads.setColumns(10);
		numberOfTrollHeads.setBounds(390, 181, 86, 20);
		calculatorFrame.getContentPane().add(numberOfTrollHeads);
		
		//the image for ensouled troll heads
		lblTrollHeadsImage = new JLabel("");
		Image trollHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_troll_head.png")).getImage();
		lblTrollHeadsImage.setIcon(new ImageIcon(trollHeadsImage));
		lblTrollHeadsImage.setBounds(361, 175, 29, 30);
		calculatorFrame.getContentPane().add(lblTrollHeadsImage);
//END ENSOULED TROLL HEADS
		
//BEGIN ENSOULED HORROR HEADS
		//the horror heads text label
		JLabel lblHorrorHeads = new JLabel("Horror Heads");
		lblHorrorHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHorrorHeads.setBounds(245, 216, 114, 30);
		calculatorFrame.getContentPane().add(lblHorrorHeads);
		
		//the number of ensouled horror heads
		numberOfHorrorHeads = new JTextField();
		numberOfHorrorHeads.setText("0");
		numberOfHorrorHeads.setColumns(10);
		numberOfHorrorHeads.setBounds(390, 222, 86, 20);
		calculatorFrame.getContentPane().add(numberOfHorrorHeads);
		
		//the image for ensouled horror heads
		lblHorrorHeadsImage = new JLabel("");
		Image horrorHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_horror_head.png")).getImage();
		lblHorrorHeadsImage.setIcon(new ImageIcon(horrorHeadsImage));
		lblHorrorHeadsImage.setBounds(361, 216, 29, 30);
		calculatorFrame.getContentPane().add(lblHorrorHeadsImage);
//END ENSOULED HORROR HEADS
		
//BEGIN ENSOULED KALPHITE HEADS
		//the kalphite heads text label
		JLabel lblKalphiteHeads = new JLabel("Kalphite Heads");
		lblKalphiteHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblKalphiteHeads.setBounds(245, 257, 114, 30);
		calculatorFrame.getContentPane().add(lblKalphiteHeads);
		
		//the number of ensouled kalphite heads
		numberOfKalphiteHeads = new JTextField();
		numberOfKalphiteHeads.setText("0");
		numberOfKalphiteHeads.setColumns(10);
		numberOfKalphiteHeads.setBounds(390, 263, 86, 20);
		calculatorFrame.getContentPane().add(numberOfKalphiteHeads);
		
		//the image for ensouled kalphite heads
		lblKalphiteHeadsImage = new JLabel("");
		Image kalphiteHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_kalphite_head.png")).getImage();
		lblKalphiteHeadsImage.setIcon(new ImageIcon(kalphiteHeadsImage));
		lblKalphiteHeadsImage.setBounds(361, 257, 29, 30);
		calculatorFrame.getContentPane().add(lblKalphiteHeadsImage);
//END ENSOULED KALPHITE HEADS
		
//BEGIN ENSOULED DAGONNOTH HEADS
		//the dagonnoth heads text label
		JLabel lblDagannothHeads = new JLabel("Dagonnoth Heads");
		lblDagannothHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDagannothHeads.setBounds(245, 298, 114, 30);
		calculatorFrame.getContentPane().add(lblDagannothHeads);
		
		//the number of ensouled dagonnoth heads
		numberOfDagannothHeads = new JTextField();
		numberOfDagannothHeads.setText("0");
		numberOfDagannothHeads.setColumns(10);
		numberOfDagannothHeads.setBounds(390, 304, 86, 20);
		calculatorFrame.getContentPane().add(numberOfDagannothHeads);
		
		//the image for ensouled dagonnoth heads
		lblDagannothHeadsImage = new JLabel("");
		Image dagganothHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_dagannoth_head.png")).getImage();
		lblDagannothHeadsImage.setIcon(new ImageIcon(dagganothHeadsImage));
		lblDagannothHeadsImage.setBounds(361, 298, 29, 30);
		calculatorFrame.getContentPane().add(lblDagannothHeadsImage);
//END ENSOULED DAGONNOTH HEADS
		
//BEGIN ENSOULED BLOODVELD HEADS		
		//the bloodveld heads text label
		JLabel lblBloodveldHeads = new JLabel("Bloodveld Heads");
		lblBloodveldHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBloodveldHeads.setBounds(486, 11, 101, 30);
		calculatorFrame.getContentPane().add(lblBloodveldHeads);
		
		//the number of ensouled bloodveld heads
		numberOfBloodveldHeads = new JTextField();
		numberOfBloodveldHeads.setText("0");
		numberOfBloodveldHeads.setColumns(10);
		numberOfBloodveldHeads.setBounds(634, 17, 86, 20);
		calculatorFrame.getContentPane().add(numberOfBloodveldHeads);
		
		//the image for ensouled bloodveld heads
		lblBloodveldHeadsImage = new JLabel("");
		Image bloodveldHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_bloodveld_head.png")).getImage();
		lblBloodveldHeadsImage.setIcon(new ImageIcon(bloodveldHeadsImage));
		lblBloodveldHeadsImage.setBounds(595, 11, 29, 30);
		calculatorFrame.getContentPane().add(lblBloodveldHeadsImage);
//END ENSOULED BLOODVELD HEADS
		
//BEGIN ENSOULED TZHAAR HEADS
		//the tzhaar heads text label
		JLabel lblTzHaarHeads = new JLabel("TzHaar Heads");
		lblTzHaarHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTzHaarHeads.setBounds(486, 52, 101, 30);
		calculatorFrame.getContentPane().add(lblTzHaarHeads);
		
		//the number of tzhaar heads
		numberOfTzHaarHeads = new JTextField();
		numberOfTzHaarHeads.setText("0");
		numberOfTzHaarHeads.setColumns(10);
		numberOfTzHaarHeads.setBounds(634, 58, 86, 20);
		calculatorFrame.getContentPane().add(numberOfTzHaarHeads);
		
		//the image for ensouled tzhaar heads
		lblTzHaarHeadsImage = new JLabel("");
		Image tzhaarHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_tzhaar_head.png")).getImage();
		lblTzHaarHeadsImage.setIcon(new ImageIcon(tzhaarHeadsImage));
		lblTzHaarHeadsImage.setBounds(595, 52, 29, 30);
		calculatorFrame.getContentPane().add(lblTzHaarHeadsImage);
//END ENSOULED TZHAAR HEADS
		
//BEGIN ENSOULED DEMON HEADS
		//the demon heads text label
		JLabel lblDemonHeads = new JLabel("Demon Heads");
		lblDemonHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDemonHeads.setBounds(486, 93, 101, 30);
		calculatorFrame.getContentPane().add(lblDemonHeads);
		
		//the number of demon heads
		numberOfDemonHeads = new JTextField();
		numberOfDemonHeads.setText("0");
		numberOfDemonHeads.setColumns(10);
		numberOfDemonHeads.setBounds(634, 99, 86, 20);
		calculatorFrame.getContentPane().add(numberOfDemonHeads);
		
		//the image for ensouled demon heads
		lblDemonHeadsImage = new JLabel("");
		Image demonHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_demon_head.png")).getImage();
		lblDemonHeadsImage.setIcon(new ImageIcon(demonHeadsImage));
		lblDemonHeadsImage.setBounds(595, 93, 29, 30);
		calculatorFrame.getContentPane().add(lblDemonHeadsImage);
//END ENSOULED DEMON HEADS
		
//BEGIN ENSOULED AVIANSIE HEADS
		//the aviansie heads text label
		JLabel lblAviansieHeads = new JLabel("Aviansie Heads");
		lblAviansieHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAviansieHeads.setBounds(486, 134, 101, 30);
		calculatorFrame.getContentPane().add(lblAviansieHeads);
		
		//the number of aviansie heads
		numberOfAviansieHeads = new JTextField();
		numberOfAviansieHeads.setText("0");
		numberOfAviansieHeads.setColumns(10);
		numberOfAviansieHeads.setBounds(634, 140, 86, 20);
		calculatorFrame.getContentPane().add(numberOfAviansieHeads);
		
		//the image for ensouled avianse heads
		lblAviansieHeadsImage = new JLabel("");
		Image aviansieHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_aviansie_head.png")).getImage();
		lblAviansieHeadsImage.setIcon(new ImageIcon(aviansieHeadsImage));
		lblAviansieHeadsImage.setBounds(595, 134, 29, 30);
		calculatorFrame.getContentPane().add(lblAviansieHeadsImage);
//END ENSOULED AVIANSIE HEADS
		
//BEGIN ENSOULED ABYSSAL HEADS
		//the abyssal heads text label
		JLabel lblAbyssalHeads = new JLabel("Abyssal Heads");
		lblAbyssalHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAbyssalHeads.setBounds(486, 175, 101, 30);
		calculatorFrame.getContentPane().add(lblAbyssalHeads);
		
		//the number of abyssal heads
		numberOfAbyssalHeads = new JTextField();
		numberOfAbyssalHeads.setText("0");
		numberOfAbyssalHeads.setColumns(10);
		numberOfAbyssalHeads.setBounds(634, 181, 86, 20);
		calculatorFrame.getContentPane().add(numberOfAbyssalHeads);

		//the image for ensouled demon heads
		lblAbyssalHeadsImage = new JLabel("");
		Image abyssalHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_abyssal_head.png")).getImage();
		lblAbyssalHeadsImage.setIcon(new ImageIcon(abyssalHeadsImage));
		lblAbyssalHeadsImage.setBounds(595, 171, 29, 30);
		calculatorFrame.getContentPane().add(lblAbyssalHeadsImage);
//END ENSOULED ABYSSAL HEADS
		
//BEGIN ENSOULED DRAGON HEADS
		//the dragon heads text label
		JLabel lblDragonHeads = new JLabel("Dragon Heads");
		lblDragonHeads.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDragonHeads.setBounds(486, 216, 101, 30);
		calculatorFrame.getContentPane().add(lblDragonHeads);	
		
		//the number of dragon heads
		numberOfDragonHeads = new JTextField();
		numberOfDragonHeads.setText("0");
		numberOfDragonHeads.setColumns(10);
		numberOfDragonHeads.setBounds(634, 222, 86, 20);
		calculatorFrame.getContentPane().add(numberOfDragonHeads);
		
		//the image for ensouled demon heads
		lblDragonHeadsImage = new JLabel("");
		Image dragonHeadsImage = new ImageIcon(this.getClass().getResource("/images/Ensouled_dragon_head.png")).getImage();
		lblDragonHeadsImage.setIcon(new ImageIcon(dragonHeadsImage));
		lblDragonHeadsImage.setBounds(595, 216, 29, 30);
		calculatorFrame.getContentPane().add(lblDragonHeadsImage);
//END ENSOULED DRAGON HEADS
		
		//instructions button
		btnInstructions = new JButton("Instructions");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(calculatorFrame, "Insert the number of ensouled heads you have, and then click calculate experience.\n"
						+ "This will tell you how much experience you will gain by reanimating your ensouled heads.\n\n"
						+ "Make sure that each number is non-negative and is in the range of a long, or an error will occur.\n"
						+ "The range of a long for the purposes of this program is 0 - 9,223,372,036,854,775,807", "Instructions", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnInstructions.setBounds(10, 353, 114, 23);
		calculatorFrame.getContentPane().add(btnInstructions);
		
		//about button
		btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(calculatorFrame, "Copyright 2017 - Dylan Weaver (dweaver@umd.edu)\nVersion 1.0\nCreated for personal use\n\n"
						+ "All images belong to Jagex Ltd.", "About", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnAbout.setBounds(134, 353, 89, 23);
		calculatorFrame.getContentPane().add(btnAbout);
		
		//calculate button
		btnCalculateExperience = new JButton("Calculate Experience");
		btnCalculateExperience.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(calculateExperience() >= 0) {
						textField.setText(NumberFormat.getIntegerInstance().format(calculateExperience()));
					}
					else throw new NumberFormatException();
				} catch(NumberFormatException n) {
					textField.setText("Error, try again/read instructions");
				}
			}
		});

		btnCalculateExperience.setBounds(245, 335, 234, 41);
		calculatorFrame.getContentPane().add(btnCalculateExperience);
		
		//text field where experience will appear
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(509, 346, 211, 30);
		calculatorFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//text
		lblExperienceGain = new JLabel("Experience Gain:");
		lblExperienceGain.setBounds(574, 320, 114, 30);
		calculatorFrame.getContentPane().add(lblExperienceGain);
	}
	
	//calculates the total amount of experience
	public long calculateExperience() {
		long totalExperience = (goblinExperience * Long.parseLong(numberOfGoblinHeads.getText())) + 
						       (monkeyExperience * Long.parseLong((numberOfMonkeyHeads.getText())) +
						       (impExperience * Long.parseLong((String) numberOfImpHeads.getText())) +
						       (minotaurExperience * Long.parseLong(numberOfMinotaurHeads.getText()) +
						       (scorpionExperience * Long.parseLong(numberOfScorpionHeads.getText())) +
						       (bearExperience * Long.parseLong(numberOfBearHeads.getText())) +
						       (unicornExperience * Long.parseLong(numberOfUnicornHeads.getText())) +
						       (dogExperience * Long.parseLong(numberOfDogHeads.getText())) +
						       (chaosDruidExperience * Long.parseLong(numberOfChaosDruidHeads.getText())) +
						       (giantExperience * Long.parseLong(numberOfGiantHeads.getText())) +
						       (ogreExperience * Long.parseLong(numberOfOgreHeads.getText())) +
						       (elfExperience * Long.parseLong(numberOfElfHeads.getText())) +
						       (trollExperience * Long.parseLong(numberOfTrollHeads.getText())) +
						       (horrorExperience * Long.parseLong(numberOfHorrorHeads.getText())) +
						  	   (kalphiteExperience * Long.parseLong(numberOfKalphiteHeads.getText())) +
						  	   (dagannothExperience * Long.parseLong(numberOfDagannothHeads.getText())) +
						  	   (bloodveldExperience * Long.parseLong(numberOfBloodveldHeads.getText())) +
						  	   (tzhaarExperience * Long.parseLong(numberOfTzHaarHeads.getText())) +
						  	   (demonExperience * Long.parseLong(numberOfDemonHeads.getText())) +
						  	   (aviansieExperience * Long.parseLong(numberOfAviansieHeads.getText())) +
						  	   (abyssalExperience * Long.parseLong(numberOfAbyssalHeads.getText())) +
						  	   (dragonExperience * Long.parseLong(numberOfDragonHeads.getText()))));
		
		return totalExperience;
	}
}
