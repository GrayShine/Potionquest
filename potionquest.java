import java.io.*;
import java.lang.*;
import java.util.Random;

class potionquest
{
	public static void main(String[]args) throws IOException, InterruptedException
	{
		InputStreamReader inStream = new InputStreamReader (System.in);
		BufferedReader inputs = new BufferedReader (inStream);

		int dirt = 0, HP = 15, rand = 0, atk = 0, slimehp = 5, battle = 0, slimeatk = 1, exp = 0, katana = 0, distance = 0, dragonhp = 25, dragonatk = 3;
		int bluegg = 0, pet = 0, hatch = 0, master = 0, hat = 0, zombiehp = 7, zombieatk = 2, gold = 100, fireax = 0, baseatk = 1, hammer = 0, bread = 0;
		int pingpong = 0, lobster = 0, area = 0, swag = 0, bacon = 0, hockey = 0, greenpot = 0, redpot = 0, bluepot = 0, avi = 0, planthalf = 0, spear = 0;
		int goldpot = 0, weapon = 0, switchblade = 0, butch = 0, diabeetus = 0, happen = 0, ocarina = 0, level = 1, tonext = 400, basenext = 400;
		int age = 0, annoy = 0, result = 0, deathhp = 1000, deathatk = 20, yellowpot = 0, sand = 0, baseHP = 15, planthp = 1, areaup = 1, sparthp = 35, spartatk = 4;
		int billyhp = 9, billyatk = 3, squidhp = 13, squidatk = 2, blindturn = 0, skeletonhp = 14, skeletonatk = 4, robothp = 30, robotatk = 7, minohp = 50, minoatk = 6;
		int kinghp = 65, kingatk = 8, battleax = 0, trollhp = 35, trollatk = 6, ninjahp = 40, ninjaatk = 7, frenchhp = 43, frenchatk = 8, saybelhp = 85, saybelatk = 10;
		int sausagehp = 60, saturnhp = 10000, sausageatk = 9, saturnatk = 13, falconhp = 75, falconatk = 25;
		
		int bigdirt = 0, redsword = 0, dirtaxe = 0, lobsword = 0, baconsword = 0, sharphammer = 0, massivedirt = 0, pongsmash = 0, ultrabacon = 0, heavyspear = 0;
		int hammerax = 0, quicksand = 0, ragefist = 0, burnlobster = 0, nuclearbacon = 0;
		String inData, selection = "nope", name, equip = "nothing", partner = "nobody", status = "healthy", monstatus = "healthy", thing = "nothing";
		boolean loop = true, loop2 = true, loop3 = true, loop4 = true, dead = false, citizen1 = false, alchemizer = false, loop5 = true;

		System.out.println();
		System.out.println();
		System.out.println("         -ysys    :yssso. `ossshsss:  /oooosooo+.   :oss+`      -`    :     ");
		System.out.println("        /m.  m/  +m.   od     `M`      ```:m````   sh. `+d/    .Mh   :m     ");
		System.out.println("        m:   ys .N.    +d     +d          :m      /m`    .N.   shm:  yo     ");
		System.out.println("        m:  `m/ /d     yo     d+          sy      oy      N:  :m.sy .N-     ");
		System.out.println("        oh./h+  +h    `m/    `M.          m/      -m-    .N. .m/ .N:d+      ");
		System.out.println("        `hd/.   :m-  .ys     /m          -N`  ``   /d--.:ho  so   sNo       ");
		System.out.println("         `m/     /h/oy:      -s       +ooydooooo.   :/ooo-   .    `:`       ");
		System.out.println("          -h      .-.                                                       ");
		System.out.println("                     `                          `.`      ``                 ");
		System.out.println("                 ./sssy/    -/    -o  /+ooo+.  +y+oso.  `ooooyo+++:         ");
		System.out.println("               `sy+.` .ho   ys    -N  m/```.` `M.   `       `m/...`         ");
		System.out.println("               yy`     sy  `N-    /d  m:       hs/--`        m:             ");
		System.out.println("               N:   .  ys  .M`    ho `Ns+++o`   .:/+m.       N:             ");
		System.out.println("               m/  `oh/d/  -N    /m` /d....`        m/      .N`             ");
		System.out.println("               -hs-  /mdy/``do--/m-  ss  ``--  -/-:sh`      oh              ");
		System.out.println("                `.osso. .// `:///.   :ssooo/-  `///-        +-              ");
		System.out.println();
		System.out.println();
		System.out.println("                            ENTER YOUR NAME TO START");
		System.out.println();
		System.out.println();
		
		System.out.println("What do you want to name your character?");
		inData = inputs.readLine();
		name = inData;
		System.out.print(name + "'s swag level is: ");
		rand = (int)(100.0 * Math.random()) + 1;
		swag = rand;
		System.out.println(swag);

		System.out.println();
		rand = (int)(5.0 * Math.random()) + 1;
		if (rand == 1) {
		System.out.println(name + " wakes up in a forest, there is a road that goes on for a distance.");
		System.out.println("You can't really remember what happened, or how you got here.");
		System.out.println("Far away in the distance you can see a small town.");
		area = 1; }
		if (rand == 2) {
		System.out.println(name + " comes to in a cave, there is a path that leads out of it.");
		System.out.println("You currently have a pounding headache, and a lump on the back of your head.");
		System.out.println("Far away outside of the cave you can see a small town.");
		area = 2; }
		if (rand == 3) {
		System.out.println(name + " regains conciousness in a desert, you're pretty sure you passed out.");
		System.out.println("Your eyes begin to sting from the nearby sandstorms, so you equip your turban.");
				hat = 2;
		System.out.println("It may be a mirage, but you think you see a town far away.");
		area = 3; }
		if (rand == 4) {
		System.out.println(name + " wakes up in a large field with your hockey stick in your hand.");
				equip = "hockey stick";
				atk = 2;
				weapon = 1;
		System.out.println("You guess you must have wandered off or something.");
		System.out.println("You hear noises and look around. There is a village in the distance.");
		area = 4; }
		if (rand == 5) {
		System.out.println(name + " looks around their office. They see a few useful things.");
		System.out.print("The only other person in the room is your partner ");
			rand = (int)(3.0 * Math.random()) + 1;
			if (rand == 1) {
			System.out.println("Problem Sleuth.");
			partner = "Problem Sleuth"; }
			if (rand == 2) {
			System.out.println("Ace Dick.");
			partner = "Ace Dick"; }
			if (rand == 3) {
			System.out.println("Pickle Inspector.");
			partner = "Pickle Inspector"; }
		System.out.println("Your partner gives you a nod, to let you know that it's business time.");
		System.out.println("The two of you Suddenly get the urge to adventure through the city-streets.");
		System.out.println("So " + name + " and " + partner + " climb down the fire-escape and go to the streets.");
		area = 5; }


		while (loop==true) {

			if (HP < 1) {
				dead = true;
				System.out.println();
				System.out.println("Your party has died.");
				System.out.println("What do you want to do?");
				System.out.println("1. Restart game with current items");
				System.out.println("2. Exit game");
				annoy = 0;
				while (dead == true) {
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
				HP = 15;
				baseHP = 15;
				baseatk = 1;
				exp = 0;
				gold = 0;
				level = 1;
				tonext = 400;
				pet = 0;
				partner = "nobody";
				status = "healthy";
				age = 0;
				dead = false;

				} else if (selection.equals("2")) {
				System.exit(0);

				} else {
				if (annoy == 0) {
					System.out.println();
					System.out.println("No seriously, put in 1 or 2.");
					annoy++;
				} else if (annoy == 1) {
					System.out.println();
					System.out.println("I just....no, put in 1 or 2.");
					annoy++;
				} else if (annoy == 2) {
					System.out.println();
					System.out.println("It's not hard or anything, just type one or the other.");
					annoy++;
				} else if (annoy == 3) {
					System.out.println();
					System.out.println("Come on! Type it! Just type 1 or 2.");
					annoy++;
				} else if (annoy == 4) {
					System.out.println();
					System.out.println("TYPE IT");
					annoy++;
				} else if (annoy == 5) {
					System.out.println();
					System.out.println("I SWEAR, IF YOU DON'T TYPE IT");
					annoy++;
				} else if (annoy == 6) {
					System.out.println();
					System.out.println("TYPE");
					annoy++;
				} else if (annoy == 7) {
					System.out.println();
					System.out.println("IT");
					annoy++;
				} else if (annoy == 8) {
					System.out.println();
					System.out.println("HURRY UP AND TYPE ONE ALREADY");
					annoy++;
				} else if (annoy == 9) {
					System.out.println();
					System.out.println("ASDFASDFASDASFASDFSDFADF");
					annoy++;
				} else if (annoy == 10) {
					System.out.println();
					System.out.println("This is just getting boring now.");
					annoy++;
				} else if (annoy == 11) {
					System.out.println();
					System.out.println("It's not like anything else is going to happen.");
					annoy++;
				} else if (annoy == 12) {
					System.out.println();
					System.out.println("This is only making me hate you more and more.");
					annoy++;
				} else if (annoy == 13) {
					System.out.println();
					System.out.println("Keep in mind, I can screw with your game.");
					annoy++;
				} else if (annoy == 14) {
					System.out.println();
					System.out.println("Like I could make you restart with a horrible disease.");
					annoy++;
				} else if (annoy == 15) {
					System.out.println();
					System.out.println("Or maybe even seven arms.");
					annoy++;
				} else if (annoy == 16) {
					System.out.println();
					System.out.println("So just stop being annoying, and press one.");
					annoy++;
				} else if (annoy == 17) {
					System.out.println();
					System.out.println("Just press one.");
					annoy++;
				} else if (annoy == 18) {
					System.out.println();
					System.out.println("JUST PRESS ONE.");
					annoy++;
				} else if (annoy == 19) {
					System.out.println();
					System.out.println("DO IT");
					annoy++;
				} else if (annoy == 20) {
					System.out.println();
					System.out.println("If you type the wrong thing one more time.");
					annoy++;
				} else if (annoy == 21) {
					System.out.println();
					System.out.println("THAT'S IT.");
					System.out.println("GAME OVER.");
					System.out.println("YOU CROSSED THE LINE.");
					System.out.println("WAY TO GO JERK.");
					System.out.println("If you restart now, You have cuts on your hands.");
					result++;
					annoy++;
				} else if (annoy == 22) {
					System.out.println();
					System.out.println("Now It's bees on your hands.");
					result++;
					annoy++;
				} else if (annoy == 23) {
					System.out.println();
					System.out.println("Now they're in your mouth.");
					result++;
					annoy++;
				} else if (annoy == 24) {
					System.out.println();
					System.out.println("And now they're on fire.");
					result++;
					annoy++;
				} else if (annoy == 25) {
					System.out.println();
					System.out.println("Now they're bears.");
					System.out.println("There is actually bears on fire, in your mouth.");
					result++;
					annoy++;
				} else if (annoy == 26) {
					System.out.println();
					System.out.println("Just think about how painful that would be.");
					System.out.println("Just, fire bears. In your mouth.");
					System.out.println("Like, an entire bear.");
					annoy++;
				} else if (annoy == 27) {
					System.out.println();
					System.out.println("You should probably start the game sometime soon.");
					System.out.println("Or you could exit it or something, because this is annoying.");
					annoy++;
				} else if (annoy == 28) {
					System.out.println();
					System.out.println("I'll fight you.");
					annoy++;
				} else if (annoy == 29) {
				System.out.println();
				System.out.println("            `/syhdddsys:     ");
				System.out.println("      `.`-. dMMMd/`   -y:    ");
				System.out.println(" `-..```:+/ -mMd ..  .. s    ");
				System.out.println("----..-:+:.   oN+  .`  /+    ");
				System.out.println("+-      /:     .Mmyss//`     ");
				System.out.println("        ::     hMMMMM`       ");
				System.out.println("        yy    +NMMMMN.       ");
				System.out.println("        /o` `/.MMMMMh:       ");
				System.out.println("        /---. .MMMMMs/`.:/-.`");
				System.out.println("        +::.  -MMMMMy .-/dd+`");
				System.out.println("       `::`   :MMMMMh        ");
				System.out.println("       .-:    +MMMMMN        ");
				System.out.println("       `::    oMMMMMM.      ");
				System.out.println("        ::    -ddddhm-       ");
				System.out.println("        /:     :.   .:       ");
				System.out.println("        -.-   -o-.  +:-.     ");
				System.out.println("               ..`  ...      ");
				System.out.println("Death is attacking!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					deathhp = 1000;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + deathhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack Death with your " + equip + ".");
					deathhp = (deathhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 2 points of damage");
					slimehp = slimehp - 2; }
					battle++;

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You start flailing your arms but he stops you.");
					} else {
					System.out.println("You tried to escape but obviously failed.");
					}
				} else {
					System.out.println("But nothing happened."); }

				if (deathhp <= 0) {
					System.out.println("Your party defeated Death!");
					System.out.println("You gained 1000000 exp and 0 gold.");
					exp = exp + 1000000;
					tonext = tonext - 1000000;
					battle = 0;
					loop2 = false;
					deathhp = 7; }

				if (battle == 1) {
					System.out.println();
					System.out.println("Death starts attacking!");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("Death slices with his sythe!");
					HP = HP - deathatk;
					System.out.println("It caused " + deathatk + " points of damage.");
					battle--;
					} else {
					System.out.println("Death asks politely if you'd like to play a board game?");
					battle--; }
						}
						}

				} else {
					System.out.println();
					System.out.println("Alright, that's enough.");
					}
					}
				}
				}
			

			if (hatch == 4) {
				System.out.println("Your egg hatched!");
				System.out.println("You have aquired a pet Nyan Cat.");
				hatch = 0;
				pet = 1;
				bluegg--; }

			if (exp >= basenext) {
				System.out.println();
				level++;
				basenext = basenext * 2;
				tonext = basenext;
				swag = swag + 4;
				System.out.println(name + " leveled up!");
				System.out.println("+1 to Attack Power.");
				System.out.println("+3 to Base HP.");
				System.out.println("+1 to Level.");
				System.out.println("+4 to Swag.");
				HP = HP + 3;
				baseHP = baseHP + 3;
				exp = 0;
				System.out.println(tonext + " exp to next level.");
				baseatk++; }

			if (distance == 60 || distance == 70) {
				loop3 = true;
				System.out.println();
				if (area == 5) {
				System.out.println("You and " + partner + " arive at a busy street district.");
				} else {
				System.out.println("Your party has arrived at a town."); }
				while (loop3==true){
				System.out.println("What do you do now?");
				System.out.println("1. heal your party");
				System.out.println("2. go to the shop");
				System.out.println("3. talk to strangers");
				if (area == 5) {
				System.out.println("4. leave district");
				} else {
				System.out.println("4. leave town"); }
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
				HP = baseHP;
				System.out.println("Your party is now at full health.");
				System.out.println(); }

				if (selection.equals("4")) {
				System.out.println("Your party decides that you should continue adventuring and leaves.");
				distance = distance + 20;
				loop3 = false; }

				if (selection.equals("3")) {
				rand = (int)(3.0 * Math.random()) + 1;
				if (rand == 1) {
				System.out.println("You see a random person walking and strike up a conversation.");
				System.out.println("\"Hello\" you say, sounding excited.");
				if (citizen1 = true && partner.equals("Ace Dick")) {
					System.out.println("But then Ace Dick immediately punches him in the snout.");
					System.out.println("You ask him why he did this, but he says it was to \"establish dominance\"");
					System.out.println("The man swears loudly and walks away.");
					System.out.println();
					citizen1 = true;
					
				} else {
					if (swag > 80) {
				System.out.println("\"Hey there, nice swag. Are you new to town?\" he replies.");
					if (hat > 0) {
				System.out.println("But before you can answer, he glances at your hat with awe.");
				System.out.println("\"Oh my gosh, you actually have one!\"");
				System.out.println("\"I've been looking everywhere for that hat, would you sell it for 700 gold?\"");
				System.out.println("1. Sure!");
				System.out.println("2. Nah, I'll hold onto it.");
				inData = inputs.readLine();
				selection = inData;
						if (selection.equals("1")) {
							System.out.println("\"Thanks!\" he says.");
							gold = gold + 700;
							hat = 0;
						} else if (selection.equals("2")) {
							System.out.println("\"Oh well, it's awesome anyways.\" he says."); }
					} else if (hat == 0) {
						System.out.println("You begin talking to the stranger and learn his name is Mark.");
						System.out.println("This man is complately useless, why are you talking to him?");
						System.out.println(); }
					} else if (swag > 30 && swag < 80) {
				System.out.println("\"Hey, how's it going?\" he asks.");
				System.out.println(name + " and the stranger begin to have a useless conversation about Politics.");
				System.out.println("\"AND THAT'S WHY THE PRESIDENT IS A TERRORIST\" he screams.");
				System.out.println();

					} else if (swag < 30 ) {
				System.out.println("\"What th- get away from me you swag-less tool.\" he rants.");
				System.out.println("He then goes on about how in his day, people saved their games.");
				System.out.println(); }
				}
				
				} else if (rand == 2 && butch == 0) {
				System.out.println("You see a shady looking man in a nearby alleyway.");
				System.out.println("He's wearing a leather jacket and has greasy hair.");
				System.out.println("You cautiously walk up to him.");
					if (swag > 80) {
				System.out.println("\"What'chu lookin' at?\" he says.");
				System.out.println("He then notices the pride and swag in your eyes.");
				System.out.println("\"Woah, you got some nice swag there buddy, name's Butch.\" he says.");
				System.out.println("\"Actually, here. Have my switchblade, you might need it.\"");
					switchblade++;
				System.out.println("\"I also don't suppose you could use some protection?\"");
				System.out.println("1. Eyyyyyyy, the more the merrier.");
				System.out.println("2. Nope, I'm good.");
				inData = inputs.readLine();
				selection = inData;
						if (selection.equals("1")) {
							System.out.println("\"Thanks!, and remember. \"Tunnel Snakes\" rule.\" he says.");
							System.out.println();
							partner = "Butch";
							butch = 1;
						} else if (selection.equals("2")) {
							System.out.println("\"Ah well, be careful out there.\" he says."); }
							butch = 1;
					} else if (swag > 30 && swag < 80) {
				System.out.println("\"Hey, this is my alley. I think you have the wrong place.\" he says.");
				System.out.println(name + " backs away because you really don't want to be stabbed.");
				System.out.println();

					} else if (swag < 30 ) {
				System.out.println("\"My my, what have we here?\" he asks.");
				System.out.println("\"Looks like some tool wound up in the wrong place.\"");
				System.out.println("\"Why, I'd be happy t' send ya back where you were going.\"");
				System.out.println("He then beats you quite badly, and kicks you out of the alley");
				System.out.println("HP -5");
					HP = HP - 5;
				System.out.println(); }
				
				} else {
				System.out.println("But you don't find anyone around.");
				System.out.println(); }
							}

				if (selection.equals("2")) {
				System.out.println();
				System.out.println("The shopkeeper welcomes " + name + " into his shop.");
				System.out.println("\"What would you like to buy?\" he exclaims.           gold: " + gold);
				System.out.println("1. Fire axe             (atk = 3)     Cost: 400");
				System.out.println("2. Ping-pong paddle     (atk = 1)     Cost: 100");
				System.out.println("3. Lobster nunchuks     (atk = 2)     Cost: 220");
				System.out.println("4. Hammer               (atk = 2)     Cost: 270");
				System.out.println("5. Bacon Strip                        Cost: 10");
				if (alchemizer == false) {
				System.out.println("6. Alchemizer           (upgrade)     Cost: 200"); }
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1") && gold >= 400) {
				System.out.println("You purchase the Fire axe and wonder why you didn't buy lobster-chucks.");
				System.out.println();
				fireax++;
				gold = gold - 400;

				} else if (selection.equals("2") && gold >= 100) {
				System.out.println("You buy a ping-pong paddle, why was this a good idea?");
				System.out.println();
				pingpong++;
				gold = gold - 100;

				} else if (selection.equals("3") && gold >= 220) {
				System.out.println("HOLY CRAP THIS COULD ONLY END WELL THERE IS NOTHING WRONG WITH THIS.");
				System.out.println();
				lobster++;
				gold = gold - 220;

				} else if (selection.equals("4") && gold >= 270) {
				System.out.println("You purchase the hammer from the shopkeeper.");
				System.out.println();
				hammer++;
				gold = gold - 270;
				
				} else if (selection.equals("5") && gold >= 10) {
				System.out.println("You buy a single bacon strip from someone you think is a butcher....");
				System.out.println();
				bacon++;
				gold = gold - 10;
				
				} else if (selection.equals("6") && gold >= 200) {
					if (alchemizer == false) {
				System.out.println("You purchase the Alchemizer and apply it to your menu.");
				System.out.println();
				alchemizer = true;
				gold = gold - 200;
					} else {
				System.out.println("\"I'm sorry, I can't sell you that.\""); }

				} else {
				System.out.println("\"I'm sorry, you don't have enough gold for that.\"");
				System.out.println(); }
					}
				}
				} else if (distance == 560 || distance == 570) {
				loop3 = true;
				System.out.println();
				if (area == 5) {
				System.out.println("You arrive at another shady street.");
				} else {
				System.out.println("Your party has arrived at a small village."); }
				while (loop3==true){
				System.out.println("What do you do now?");
				System.out.println("1. heal your party");
				System.out.println("2. go to the shop");
				System.out.println("3. talk to strangers");
				if (area == 5) {
				System.out.println("4. leave district");
				} else {
				System.out.println("4. leave town"); }
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
				System.out.println("Your party is now at full health.");
				HP = baseHP;
				System.out.println(); }

				if (selection.equals("4")) {
				System.out.println("Your party decides that you should continue adventuring and leaves.");
				distance = distance + 20;
				loop3 = false; }

				if (selection.equals("3")) {
				rand = (int)(3.0 * Math.random()) + 1;
				if (rand == 1) {
				System.out.println("You see a random person walking and strike up a conversation.");
				System.out.println("\"Hello\" you say, sounding excited.");
				if (citizen1 = true && partner.equals("Ace Dick")) {
					System.out.println("But then Ace Dick immediately punches him in the snout.");
					System.out.println("You ask him why he did this, but he says it was to \"establish dominance\"");
					System.out.println("The man swears loudly and walks away.");
					System.out.println();
					citizen1 = true;
					
				} else {
					if (swag > 80) {
				System.out.println("\"Hey there, nice swag. Are you new to town?\" he replies.");
					if (hat > 0) {
				System.out.println("But before you can answer, he glances at your hat with awe.");
				System.out.println("\"Oh my gosh, you actually have one!\"");
				System.out.println("\"I've been looking everywhere for that hat, would you sell it for 700 gold?\"");
				System.out.println("1. Sure!");
				System.out.println("2. Nah, I'll hold onto it.");
				inData = inputs.readLine();
				selection = inData;
						if (selection.equals("1")) {
							System.out.println("\"Thanks!\" he says.");
							gold = gold + 700;
							hat = 0;
						} else if (selection.equals("2")) {
							System.out.println("\"Oh well, it's awesome anyways.\" he says."); }
					} else if (hat == 0) {
						System.out.println("You begin talking to the stranger and learn his name is Mark.");
						System.out.println("This man is complately useless, why are you talking to him?");
						System.out.println(); }
					} else if (swag > 30 && swag < 80) {
				System.out.println("\"Hey, how's it going?\" he asks.");
				System.out.println(name + " and the stranger begin to have a useless conversation about Politics.");
				System.out.println("\"AND THAT'S WHY THE PRESIDENT IS A TERRORIST\" he screams.");
				System.out.println();

					} else if (swag < 30 ) {
				System.out.println("\"What th- get away from me you swag-less tool.\" he rants.");
				System.out.println("He then goes on about how in his day, people saved their games.");
				System.out.println(); }
				}
				
				} else if (rand == 2 && butch == 0) {
				System.out.println("You see a shady looking man in a nearby alleyway.");
				System.out.println("He's wearing a leather jacket and has greasy hair.");
				System.out.println("You cautiously walk up to him.");
					if (swag > 80) {
				System.out.println("\"What'chu lookin' at?\" he says.");
				System.out.println("He then notices the pride and swag in your eyes.");
				System.out.println("\"Woah, you got some nice swag there buddy, name's Butch.\" he says.");
				System.out.println("\"Actually, here. Have my switchblade, you might need it.\"");
					switchblade++;
				System.out.println("\"I also don't suppose you could use some protection?\"");
				System.out.println("1. Eyyyyyyy, the more the merrier.");
				System.out.println("2. Nope, I'm good.");
				inData = inputs.readLine();
				selection = inData;
						if (selection.equals("1")) {
							System.out.println("\"Thanks!, and remember. \"Tunnel Snakes\" rule.\" he says.");
							partner = "Butch";
							butch = 1;
						} else if (selection.equals("2")) {
							System.out.println("\"Ah well, be careful out there.\" he says."); }
							butch = 1;
					} else if (swag > 30 && swag < 80) {
				System.out.println("\"Hey, this is my alley. I think you have the wrong place.\" he says.");
				System.out.println(name + " backs away because you really don't want to be stabbed.");
				System.out.println();

					} else if (swag < 30 ) {
				System.out.println("\"My my, what have we here?\" he asks.");
				System.out.println("\"Looks like some tool wound up in the wrong place.\"");
				System.out.println("\"Why, I'd be happy t' send ya back where you were going.\"");
				System.out.println("He then beats you quite badly, and kicks you out of the alley");
				System.out.println("HP -5");
					HP = HP - 5;
				System.out.println(); }
				
				} else {
				System.out.println("But you don't find anyone around.");
				System.out.println(); }
							}

				if (selection.equals("2")) {
				System.out.println();
				System.out.println("The shopkeeper welcomes " + name + " into his shop.");
				System.out.println("\"What would you like to buy?\" he exclaims.           gold: " + gold);
				System.out.println("1. Fire axe             (atk = 3)     Cost: 400");
				System.out.println("2. Ping-pong paddle     (atk = 1)     Cost: 100");
				System.out.println("3. Lobster nunchuks     (atk = 2)     Cost: 220");
				System.out.println("4. Hammer               (atk = 2)     Cost: 270");
				System.out.println("5. Bacon Strip                        Cost: 10");
				if (alchemizer == false) {
				System.out.println("6. Alchemizer           (upgrade)     Cost: 200"); }
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1") && gold >= 400) {
				System.out.println("You purchase the Fire axe and wonder why you didn't buy lobster-chucks.");
				System.out.println();
				fireax++;
				gold = gold - 400;

				} else if (selection.equals("2") && gold >= 100) {
				System.out.println("You buy a ping-pong paddle, why was this a good idea?");
				System.out.println();
				pingpong++;
				gold = gold - 100;

				} else if (selection.equals("3") && gold >= 220) {
				System.out.println("HOLY CRAP THIS COULD ONLY END WELL THERE IS NOTHING WRONG WITH THIS.");
				System.out.println();
				lobster++;
				gold = gold - 220;

				} else if (selection.equals("4") && gold >= 270) {
				System.out.println("You purchase the hammer from the shopkeeper.");
				System.out.println();
				hammer++;
				gold = gold - 270;
				
				} else if (selection.equals("5") && gold >= 10) {
				System.out.println("You buy a single bacon strip from someone you think is a butcher....");
				System.out.println();
				bacon++;
				gold = gold - 10;
				
				} else if (selection.equals("6") && gold >= 200) {
					if (alchemizer == false) {
				System.out.println("You purchase the Alchemizer and apply it to your menu.");
				System.out.println();
				alchemizer = true;
				gold = gold - 200;
					} else {
				System.out.println("\"I'm sorry, I can't sell you that.\""); }

				} else {
				System.out.println("\"I'm sorry, you don't have enough gold for that.\"");
				System.out.println(); }
					}
				}
				}

		System.out.println();
		if (distance == 1000 || distance == 1010) {
						System.out.println();
				System.out.println("WARNING: The Final Boss is approaching soon, be ready to put up a fight!");
							System.out.println();
						System.out.println(); }
		System.out.println("What do you want to do?                             Distance: " + distance);
					if (area == 3) {
		System.out.println("1. Scoop up sand");
					} else {
		System.out.println("1. Pick up dirt"); }
		System.out.println("2. Check pockets");
		System.out.println("3. Equip weapon");
		 if (alchemizer == true) {
		System.out.println("3.5 Mix items"); }
		System.out.println("4. View status");
		System.out.println("5. Keep walking");
		System.out.println("6. Look around (Warning: shenanigans may induce)");
			if (ocarina > 0) {
		System.out.println("7. Play ocarina"); }
		inData = inputs.readLine();
		selection = inData;

		if (selection.equals("1")) {
				if (area == 3) {
				System.out.println("You cup together a good amount of sand.");
				sand++;
				} else { 
			System.out.println("You pick up a chunk of dirt.");
			dirt++; }

		} else if (selection.equals("stop")) {
			System.exit(0);

		} else if (selection.equals("2")) {
			loop4 = true;
			while (loop4==true) {
			System.out.println("You check your pockets and you find.....");
			System.out.println();
			if (greenpot > 0) {
				System.out.println("Green Potion x " + greenpot); }
			if (redpot > 0) {
				System.out.println("Red Potion x " + redpot); }
			if (bluepot > 0) {
				System.out.println("Blue Potion x " + bluepot); }
			if (yellowpot > 0) {
				System.out.println("Yellow Potion x " + yellowpot); }
			if (goldpot > 0) {
				System.out.println("Gold Potion x " + goldpot); }
			if (hockey > 0) {
				System.out.println("Hockey Stick x " + hockey); }
			if (dirt > 0) {
				System.out.println("Dirt x " + dirt); }
			if (sand > 0) {
				System.out.println("Sand x " + sand); }
			if (bacon > 0) {
				System.out.println("Bacon Strip x " + bacon); }
			if (hammer > 0) {
				System.out.println("Hammer x " + hammer); }
			if (katana > 0) {
				System.out.println("Katana x " + katana); }
			if (spear > 0) {
				System.out.println("Spear x " + spear); }
			if (bread > 0) {
				System.out.println("Bread loaf x " + bread); }
			if (battleax > 0) {
				System.out.println("Battle Axe x " + battleax); }
			if (pongsmash > 0) {
				System.out.println("Ping Pong Smasher x " + pongsmash); }
			if (ultrabacon > 0) {
				System.out.println("Ultra Bacon x " + ultrabacon); }
			if (heavyspear > 0) {
				System.out.println("Heavy Spear x " + heavyspear); }
			if (hammerax > 0) {
				System.out.println("Hammerhead Axe x " + hammerax); }
			if (quicksand > 0) {
				System.out.println("Quicksand x " + quicksand); }
			if (ragefist > 0) {
				System.out.println("Lobster Rage Fists x " + ragefist); }
			if (burnlobster > 0) {
				System.out.println("Burning Lobster x " + burnlobster); }
			if (nuclearbacon > 0) {
				System.out.println("Nuclear Bacon x " + nuclearbacon); }
			if (sharphammer > 0) {
				System.out.println("Sharpened hammer x " + sharphammer); }
			if (bluegg > 0) {
				System.out.println("Rainbow egg x " + bluegg); }
			if (master > 0) {
				System.out.println("Master sword x " + master); }
			if (fireax > 0) {
				System.out.println("Fire axe x " + fireax); }
			if (pingpong > 0) {
				System.out.println("Ping-pong paddle x " + pingpong); }
			if (switchblade > 0) {
				System.out.println("Switchblade x " + switchblade); }
			if (lobster > 0) {
				System.out.println("Lobster nunchuks x " + lobster); }
			if (avi > 0) {
				System.out.println("Aviators x " + avi); }
			System.out.println("Do you want to use anything?");
			System.out.println("Or type \"back\" to go back.");
			inData = inputs.readLine();
			selection = inData;

			if (selection.equals("bacon strip") && bacon >= 1) {
				System.out.println();
				System.out.println("You eat a strip of cooked bacon, and you feel the same.");
				System.out.println("Swag level -1");
				System.out.println("HP +1");
					HP++;
					swag--;
					bacon--;
					diabeetus++;
					if (HP > baseHP) {
					HP = baseHP; }
					loop4 = false;

			} else if (selection.equals("green potion") && greenpot >= 1) {
				System.out.println();
				System.out.println("You chug down the potion and instantly begin to feel the effects.");
				System.out.println(name + " starts to see small green hairs growing out of their arm. ");
				System.out.println("Soon you realise that this is actually grass, and become made of it.");
				System.out.println("Disease Aquired: Skin is grass");
				System.out.println("Swag level -10");
				System.out.println("Fire resistance -3");
					swag = swag - 10;
					greenpot--;
					status = "Skin is grass";
					loop4 = false;
					
			} else if (selection.equals("ultra bacon") && ultrabacon >= 1) {
				System.out.println();
				System.out.println("You eat the single strip of Ultra Bacon.");
				System.out.println(name + " feels much more disgusting.");
				System.out.println("The single strip created an incredible amount of grease.");
				System.out.println("There's so much grease, you become coated in a thick layer of it.");
				System.out.println("Disease Aquired: Skin is coated in grease");
				System.out.println("Swag level -20");
					swag = swag - 20;
					ultrabacon--;
					status = "Skin is coated in grease";
					loop4 = false;
					
			} else if (selection.equals("nuclear bacon") && nuclearbacon >= 1) {
				System.out.println();
				System.out.println("You slowly raise the glowing piece of Nuclear Bacon.");
				System.out.println(name + " goes full retard and slams the whole thing in their maouth.");
				System.out.println("You feel an intense pain on your back.");
				System.out.println("Suddenly huge massive seagull wings painted gold burst out of their back.");
				System.out.println("Disease Aquired: Golden seagull wings");
				System.out.println("Swag level +80");
					swag = swag + 80;
					nuclearbacon--;
					status = "Golden seagull wings";
					loop4 = false;

			} else if (selection.equals("bread loaf") && bread >= 1) {
				System.out.println();
				System.out.println("You chomp the bread and feel much more full.");
				System.out.println("HP +13");
					HP = HP + 13;
					bread--;
					if (HP > baseHP) {
					HP = baseHP; }
					loop4 = false;
					
			} else if (selection.equals("red potion") && redpot >= 1) {
				System.out.println();
				System.out.println("You drink the liquid and feel instantly revitalized");
				System.out.println("HP +10");
					HP = HP + 10;
					redpot--;
					if (HP > baseHP) {
					HP = baseHP; }
					loop4 = false;

			} else if (selection.equals("blue potion") && bluepot >= 1) {
				System.out.println();
				System.out.println("You sip the blue liquid and feel stranger by the minute.");
				System.out.println("After a few minutes, you can feel something growing out of your face.");
				System.out.println("A pair of aviatiors is now on your face, and you wonder how they got there.");
				System.out.println("You take them off but there is another pair underneath.");
				System.out.println("You do this about 7 times.");
				System.out.println("Disease Aquired: The Cool");
				System.out.println("Aviators +7");
				System.out.println("Swag level +10");
					avi = avi + 7;
					status = "The Cool";
					swag = swag + 10;
					bluepot--;
					loop4 = false;

			} else if (selection.equals("gold potion") && goldpot >= 1) {
				System.out.println();
				System.out.println("You drink the liquid and feel instantly strange.");
				System.out.println("This would probably be due to the fact that you just drank liquid gold.");
				System.out.println("The gold begins to form around your innards and then hardens.");
				System.out.println("You don't think you can last much longer like this.");
				System.out.println("Disease Aquired: Golden organs");
					status = "Golden organs";
					goldpot--;
					loop4 = false;
					
			} else if (selection.equals("yellow potion") && yellowpot >= 1) {
				System.out.println();
				System.out.println("You open the bottle and sip the liquid quickly.");
				System.out.println("It begins to sting your throat on the way down.");
				System.out.println("Suddenly you feel an intense burst of pain, and another sharp pain.");
				System.out.println("You let out an incredibly loud scream and the pain is gone.");
				System.out.println("You move to wipe sweat off your forehead,");
				System.out.println("but lightning comes out of you fingers and travels into a nearby hunk of metal.");
				System.out.println("Disease Aquired: Electric blood");
					status = "Electric blood";
					yellowpot--;
					loop4 = false;

			} else if (selection.equals("back")) {
					loop4 = false;

			} else {
				System.out.println("You probably shouldn't use that right now.");
					loop4 = false; }

			if (diabeetus == 15 && happen == 0) {
				System.out.println();
				System.out.println(name + " begins to have a strange feeling come over him.");
				System.out.println("It suddenly dawns on you how much junk you just ate.");
				System.out.println("Way to go tubby, now you have Diabetes.");
				System.out.println("Disease Aquired: DIABEETUS");
					status = "DIABEETUS";
					happen = 1; }
					}

		} else if (selection.equals("3")) {
			System.out.println("Choose a weapon to equip.");
			System.out.println("Or type \"back\" to go back.");
		if (equip.equals("nothing")) {
			if (dirt > 0) {
				System.out.println("Dirt"); }
			if (sand > 0) {
				System.out.println("Sand"); }
			if (katana > 0) {
				System.out.println("Katana"); }
			if (hammer > 0) {
				System.out.println("Hammer"); }
			if (master > 0) {
				System.out.println("Master Sword"); }
			if (fireax > 0) {
				System.out.println("Fire axe"); }
			if (spear > 0) {
				System.out.println("Spear"); }
			if (battleax > 0) {
				System.out.println("Battle Axe"); }
			if (pongsmash > 0) {
				System.out.println("Ping Pong Smasher"); }
			if (heavyspear > 0) {
				System.out.println("Heavy Spear"); }
			if (hammerax > 0) {
				System.out.println("Hammerhead Axe"); }
			if (quicksand > 0) {
				System.out.println("Quicksand"); }
			if (ragefist > 0) {
				System.out.println("Lobster Rage Fists"); }
			if (burnlobster > 0) {
				System.out.println("Burning Lobster"); }
			if (pingpong > 0) {
				System.out.println("Ping pong paddle"); }
			if (switchblade > 0) {
				System.out.println("Switchblade"); }
			if (lobster > 0) {
				System.out.println("Lobster nunchuks"); }
			if (lobsword > 0) {
				System.out.println("Lobsword"); }
			if (sharphammer > 0) {
				System.out.println("Hammersword"); }
			if (redsword > 0) {
				System.out.println("Red iron sword"); }
			if (baconsword > 0) {
				System.out.println("Bacon wrapped Sword"); }
			if (bigdirt > 0) {
				System.out.println("Large clump of dirt"); }
			if (dirtaxe > 0) {
				System.out.println("Dirt axe"); }
			inData = inputs.readLine();
			selection = inData;

			if (selection.equals("dirt") && dirt>0 ) {
				System.out.println("You equip a chunk of dirt.");
					equip = selection;
					dirt--;
					atk = 1;
					weapon = 1;

			} else if (selection.equals("large clump of dirt") && bigdirt>0 ) {
				System.out.println("For whatever reason, you carry around a huge clump of dirt.");
					equip = selection;
					bigdirt--;
					atk = 2;
					weapon = 1;
					
			} else if (selection.equals("lobsword") && lobsword>0 ) {
				System.out.println("You equip the Lobsword.");
					equip = selection;
					lobsword--;
					atk = 6;
					weapon = 1;
					
			} else if (selection.equals("spear") && spear>0 ) {
				System.out.println("You equip the spear.");
					equip = selection;
					spear--;
					atk = 6;
					weapon = 1;
					
			} else if (selection.equals("ping pong smasher") && pongsmash>0 ) {
				System.out.println("You equip the Ping Pong Smasher.");
					equip = selection;
					pongsmash--;
					atk = 4;
					weapon = 1;
					
			} else if (selection.equals("heavy spear") && heavyspear>0 ) {
				System.out.println("You equip the Heavy Spear.");
					equip = selection;
					heavyspear--;
					atk = 7;
					weapon = 1;
					
			} else if (selection.equals("hammerhead axe") && hammerax>0 ) {
				System.out.println("You equip the Hammerhead Axe.");
					equip = selection;
					hammerax--;
					atk = 6;
					weapon = 1;
					
			} else if (selection.equals("quicksand") && quicksand>0 ) {
				System.out.println("You equip the pile of quicksand.");
					equip = selection;
					quicksand--;
					atk = 20;
					weapon = 1;
					
			} else if (selection.equals("lobster rage fists") && ragefist>0 ) {
				System.out.println("You equip the Lobster Rage Fists.");
					equip = selection;
					ragefist--;
					atk = 5;
					weapon = 1;
					
			} else if (selection.equals("burning lobster") && burnlobster>0 ) {
				System.out.println("You equip the Burning Lobster.");
					equip = selection;
					burnlobster--;
					atk = 5;
					weapon = 1;
					
			} else if (selection.equals("bacon wrapped sword") && baconsword>0 ) {
				System.out.println("You greasily pick up the sword, but manage to equip it.");
					equip = selection;
					baconsword--;
					atk = 3;
					weapon = 1;
					
			} else if (selection.equals("dirt axe") && dirtaxe>0 ) {
				System.out.println("You can barely hold this, as it's made of dirt. But you manage to.");
					equip = selection;
					dirtaxe--;
					atk = 1;
					weapon = 1;
					
			} else if (selection.equals("sand") && sand>0 ) {
				System.out.println("You equip the pile of sand.");
					equip = selection;
					sand--;
					atk = 0;
					weapon = 1;
					
			} else if (selection.equals("battle axe") && battleax>0 ) {
				System.out.println("You equip the heavy battle axe.");
					equip = selection;
					battleax--;
					atk = 5;
					weapon = 1;
					
			} else if (selection.equals("katana") && katana>0 ) {
				System.out.println("You equip the katana.");
					equip = selection;
					katana--;
					atk = 3;
					weapon = 1;

			} else if (selection.equals("master sword") && master>0 ) {
				System.out.println("You equip the Master Sword.");
					equip = selection;
					master--;
					atk = 5;
					weapon = 1;

			} else if (selection.equals("fire axe") && fireax>0 ) {
				System.out.println("You equip the fire axe.");
					equip = selection;
					fireax--;
					atk = 3;
					weapon = 1;

			} else if (selection.equals("ping pong paddle") && pingpong>0 ) {
				System.out.println("You equip a ping-pong paddle.");
					equip = selection;
					pingpong--;
					atk = 1;
					weapon = 1;

			} else if (selection.equals("switchblade") && switchblade>0 ) {
				System.out.println("You equip the switchblade.");
					equip = selection;
					switchblade--;
					atk = 2;
					weapon = 1;

			} else if (selection.equals("lobster nunchuks") && lobster>0 ) {
				System.out.println("You equip the lobster nunchuks. AW YEAH!");
					equip = selection;
					lobster--;
					atk = 2;
					weapon = 1;
					
			} else if (selection.equals("red iron sword") && redsword>0 ) {
				System.out.println("You equip the Red-iron sword.");
					equip = selection;
					redsword--;
					atk = 4;
					weapon = 1;
					
			} else if (selection.equals("hammer") && hammer>0 ) {
				System.out.println("You equip the hammer.");
					equip = selection;
					hammer--;
					atk = 2;
					weapon = 1;
					
			} else if (selection.equals("hammersword") && sharphammer>0 ) {
				System.out.println("You equip the Hammersword.");
					equip = selection;
					sharphammer--;
					atk = 4;
					weapon = 1;

			} else if (selection.equals("back")) {
					}
		} else {
				System.out.println("You already have a weapon equipped.");
				System.out.println("Do you want to unequip it?");
				System.out.println("1. yes");
				System.out.println("2. no");
				inData = inputs.readLine();
				selection = inData;
				if (selection.equals("1")) {
					System.out.println("You unequipped the " + equip);
						if (equip.equals("dirt")) {
							dirt++;
						} else if (equip.equals("sand")) {
							sand++;
						} else if (equip.equals("katana")) {
							katana++;
						} else if (equip.equals("hockey stick")) {
							hockey++;
						} else if (equip.equals("hammer")) {
							hammer++;
						} else if (equip.equals("master sword")) {
							master++;
						} else if (equip.equals("battle axe")) {
							battleax++;
						} else if (equip.equals("fire axe")) {
							fireax++;
						} else if (equip.equals("spear")) {
							spear++;
						} else if (equip.equals("ping pong smasher")) {
							pongsmash++;
						} else if (equip.equals("heavy spear")) {
							heavyspear++;
						} else if (equip.equals("hammerhead axe")) {
							hammerax++;
						} else if (equip.equals("quicksand")) {
							quicksand++;
						} else if (equip.equals("lobster rage fists")) {
							ragefist++;
						} else if (equip.equals("burning lobster")) {
							burnlobster++;
						} else if (equip.equals("switchblade")) {
							switchblade++;
						} else if (equip.equals("lobster nunchuks")) {
							lobster++;
						} else if (equip.equals("ping pong paddle")) {
							pingpong++;
						} else if (equip.equals("hammersword")) {
							sharphammer++;
						} else if (equip.equals("lobsword")) {
							lobsword++;
						} else if (equip.equals("red iron sword")) {
							redsword++;
						} else if (equip.equals("bacon wrapped sword")) {
							baconsword++;
						} else if (equip.equals("large clump of dirt")) {
							bigdirt++;
						} else if (equip.equals("dirt axe")) {
							dirtaxe++;
						} else if (equip.equals("Hammersword")) {
							sharphammer++;
							}
					equip = ("nothing");
					atk = 0;
					weapon = 0;
				} else if (selection.equals("2")) {
					
				} else {
				System.out.println("It has to be 1 or 2."); }
						}

			} else if (selection.equals("3.5")) {
			System.out.println("What two items do you want to mix?");
			if (dirt > 0) {
				System.out.println("Dirt"); }
			if (bigdirt > 0) {
				System.out.println("Large clump of dirt"); }
			if (sand > 0) {
				System.out.println("Sand"); }
			if (katana > 0) {
				System.out.println("Katana"); }
			if (master > 0) {
				System.out.println("Master Sword"); }
			if (fireax > 0) {
				System.out.println("Fire axe"); }
			if (hammer > 0) {
				System.out.println("Hammer"); }
			if (ultrabacon > 0) {
				System.out.println("Ultra bacon"); }
			if (spear > 0) {
				System.out.println("Spear"); }
			if (pingpong > 0) {
				System.out.println("Ping pong paddle"); }
			if (switchblade > 0) {
				System.out.println("Switchblade"); }
			if (bacon > 0 ) {
				System.out.println("Bacon"); }
			if (battleax > 0 ) {
				System.out.println("Battle axe"); }
			if (lobster > 0) {
				System.out.println("Lobster nunchuks"); }
			if (greenpot > 0) {
				System.out.println("Green Potion"); }
			if (redpot > 0) {
				System.out.println("Red Potion"); }
			if (bluepot > 0) {
				System.out.println("Blue Potion"); }
			if (yellowpot > 0) {
				System.out.println("Yellow Potion"); }
			if (goldpot > 0) {
				System.out.println("Gold Potion"); }
			System.out.println();
			System.out.println("To mix, type one item's name and another item's name.");
			System.out.println("Ex. red potion blue potion");
			inData = inputs.readLine();
			selection = inData;
			
				if (selection.equals("dirt dirt") || selection.equals("dirt dirt")) {
						if (dirt > 1) {
					System.out.println();
					System.out.println("You put the dirt and the other dirt on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("Unsuprisingly, it makes a bigger clump of dirt.");
					System.out.println("You shove it into your pocket.");
					bigdirt++;
					dirt--;
					dirt--; }
					
				} else if (selection.equals("large clump of dirt large clump of dirt")) {
						if (bigdirt > 1) {
					System.out.println();
					System.out.println("You put the bigger dirt and the other dirt on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("It generates a quite massive clump of dirt.");
					System.out.println("You manage to somehow put this in your pockets.");
					massivedirt++;
					bigdirt--;
					bigdirt--; }
					
				} else if (selection.equals("katana fire axe") || selection.equals("fire axe katana")) {
						if (katana > 0 && fireax > 0) {
					System.out.println();
					System.out.println("You put the katana and the fire axe on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("It makes what appears to be a Red-iron Sword.");
					System.out.println("You shove it into your pocket.");
					redsword++;
					katana--;
					fireax--; }
					
				} else if (selection.equals("fire axe dirt") || selection.equals("dirt fire axe")) {
						if (dirt > 0 && fireax > 0) {
					System.out.println();
					System.out.println("You put the dirt and the fire axe on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("It pretty much just made an axe made out of dirt.");
					System.out.println("You shove it into your pocket.");
					dirtaxe++;
					dirt--;
					fireax--; }
					
				} else if (selection.equals("lobster nunchuks master sword") || selection.equals("master sword lobster nunchuks")) {
						if (lobster > 0 && master > 0) {
					System.out.println();
					System.out.println("You put the master sword and the lobsters on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("You pick it up and have created the Lobsword.");
					System.out.println("You can't tell if this is awesome or not.");
					System.out.println("You shove it into your pocket.");
					lobsword++;
					lobster--;
					master--; }
					
				} else if (selection.equals("bacon katana") || selection.equals("katana bacon")) {
						if (bacon > 0 && katana > 0) {
					System.out.println();
					System.out.println("You put the bacon strip and the katana on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("You take the Bacon-wrapped Sword.");
					System.out.println("As hard as the urge to eat the bacon is,");
					System.out.println("you fail to resist. " + name + " nibbles the bacon.");
					System.out.println("You shove it into your pocket.");
					baconsword++;
					bacon--;
					katana--; }
					
				} else if (selection.equals("hammer katana") || selection.equals("katana hammer")) {
						if (hammer > 0 && katana > 0) {
					System.out.println();
					System.out.println("You put the hammer and the katana on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("You pick up the Hammersword.");
					System.out.println("You shove it into your pocket.");
					sharphammer++;
					hammer--;
					katana--; }
					
				} else if (selection.equals("ping pong paddle hammer") || selection.equals("hammer ping pong paddle")) {
						if (hammer > 0 && pingpong > 0) {
					System.out.println();
					System.out.println("You put the hammer and the paddle on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("You pick up the Ping Pong Smasher.");
					System.out.println("You shove it into your pocket.");
					pongsmash++;
					hammer--;
					pingpong--; }
					
				} else if (selection.equals("bacon bacon")) {
						if (bacon > 1) {
					System.out.println();
					System.out.println("You put the two strips of bacon on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("You take the strip of Ultra-bacon");
					System.out.println("You shove it into your pocket.");
					ultrabacon++;
					bacon = bacon - 2; }
					
				} else if (selection.equals("ultra bacon ultra bacon")) {
						if (ultrabacon > 1) {
					System.out.println();
					System.out.println("You put the two strips of Ultra-bacon on the alchemizer.");
					System.out.println("You cautiously press the button and wait a few seconds......");
					System.out.println("You take the strip of Nuclear-bacon");
					System.out.println("You shove it into your pocket.");
					nuclearbacon++;
					ultrabacon = ultrabacon - 2; }
					
				} else if (selection.equals("spear battle axe") || selection.equals("battle axe spear")) {
						if (battleax > 0 && spear > 0) {
					System.out.println();
					System.out.println("You put the spear and the battle axe on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("You pick up the Heavy spear.");
					System.out.println("You shove it into your pocket.");
					heavyspear++;
					battleax--;
					spear--; }
					
				} else if (selection.equals("fire axe hammer") || selection.equals("hammer fire axe")) {
						if (fireax > 0 && hammer > 0) {
					System.out.println();
					System.out.println("You put the hammer and the fire axe on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("You take the Hammerhead axe.");
					System.out.println("You shove it into your pocket.");
					hammerax++;
					battleax--;
					spear--; }
					
				} else if (selection.equals("dirt sand") || selection.equals("sand dirt")) {
						if (fireax > 0 && hammer > 0) {
					System.out.println();
					System.out.println("You put the pile of sand and the dirt on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("You scoop up the Quicksand.");
					System.out.println("You shove it into your pocket.");
					quicksand++;
					dirt--;
					sand--; }
					
				} else if (selection.equals("lobster nunchuks lobster nunchuks")) {
						if (lobster > 1) {
					System.out.println();
					System.out.println("You place the four lobsters on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("It creates two lobsters with straps on them.");
					System.out.println("You pick up the Lobster Rage Fists.");
					System.out.println("You shove them into your pocket.");
					ragefist++;
					lobster = lobster - 2; }
					
				} else if (selection.equals("fire axe lobster nunchuks") || selection.equals("lobster nunchuks fire axe")) {
						if (fireax > 0 && lobster > 0) {
					System.out.println();
					System.out.println("You put the lobster nunchuks and the fire axe on the alchemizer.");
					System.out.println("You press the button and wait a few seconds......");
					System.out.println("You pick up the Burning Lobster.");
					System.out.println("You shove it into your pocket.");
					burnlobster++;
					fireax--;
					lobster--; }
					
				 } else {
				 	System.out.println();
					System.out.println("That's probably a bad idea to combine that.");
					}
				
		} else if (selection.equals("4")) {
			System.out.println("Here is your current status.");
				System.out.println();
				System.out.println("Current status: " + status + "             Level: " + level);
				System.out.println("Attack power: " + (baseatk + atk) + "                Exp to next: " + tonext);
				System.out.println("Equipped weapon: " + equip);
				System.out.println("Swag level: " + swag);
				System.out.println("Current health: " + HP + "/" + baseHP);
				System.out.print("Current hat: ");
					if (hat==0) {
				System.out.println("Absolutely nothing");
					} else if (hat==1) {
				System.out.println("A quite fancy top hat");
					} else if (hat==2) {
				System.out.println("A useful turban.");
					} else if (hat==3) {
				System.out.println("A King Slime's crown."); }
			if (pet == 1) {
				System.out.println("Current pet: Nyan cat"); }
				System.out.println("Party Partner: " + partner);
				System.out.println("Owned gold: " + gold);

		} else if (selection.equals("7")) {
			System.out.println("You pull out the ocarina from your pocket.");
				System.out.println();
				System.out.println("Type directions + A & B to play notes.");
				System.out.println("Ex: up up down A B left right A");
				inData = inputs.readLine();
				selection = inData;
					if (selection.equals("left up right left up right")) {
					System.out.println("You play the notes, but this isn't useful right now.");

					} else if (selection.equals("A down up A down up")) {
					System.out.println("The notes appear to be controlling the weather.");
					System.out.println("Suddenly you hear thunder, and then it starts pouring.");
					System.out.println("It's now uncontrollably raining out.");

					} else if (selection.equals("right A down right A down") && age == 0) {
					System.out.println("You begin to feel strange all of a sudden.");
					System.out.println("Everything begins to fade to white and there are clocks everywhere.");
					System.out.println("Strangely, you begin to feel older and stronger.");
					System.out.println("You've aged 7 years and gained a level.");
					System.out.println("Level +1");
						level++;
						baseatk++;
						age = 1;

					} else {
					System.out.println("You try to play the notes but it sounds terrible.");
					}

		} else if (selection.equals("6")) {
			System.out.println("You look around you and find.......");
				System.out.println();
					rand = (int)(100.0 * Math.random()) + 1;
					if (rand >= 60) {
					System.out.println("Nothing important or really useful.");
					} else if (rand == 1) {
					System.out.println("You look off into the distance and see a siliouette......");
					System.out.println("You think it's....no...it can't be....");
					System.out.println("IT IS. IT'S DOC BROWN!");
					System.out.println("\"Come with me, back to the future!\" He exclaims.");
					System.out.println("And then " + name + " and the doc' went back in time to save your parents.");
					System.out.println("THE END.");
					Thread.sleep(2000000000);
					} else if (rand == 5) {
					System.out.println("You hear a loud CRASH! And you look around in a panic.");
					System.out.println("You attempt to figure out where the sound is coming from....");
					System.out.println("BUT SUDDENLY MACHO MAN RANDY SAVAGE BURSTS THROUGH THE TREES!!!");
					System.out.println("You let out a terrified shriek and barrel in the opposite direction!");
					System.out.println("But He does not give up his prey so easily, and gives chase.");
					System.out.println("He catches up to you in a matter of seconds and crushes your arm in his grip.");
					System.out.println(name +" pleads for mercy but Randy Savage cannot be calmed.");
					System.out.println("He immediately rips open your ribcage like a bag of chips.");
					System.out.println("And to finish the deed he crushes your head like a grape.");
					System.out.println("Having finished his rage-induced kill, he goes on to deliver more destruction.");
					System.out.println("THE END");
					Thread.sleep(2000000000);
					} else if (rand >= 2 && rand <=4) {
					System.out.println("You find a katana lying on the ground.");
					System.out.println("Do you want to take it?");
					System.out.println("1. yes");
					System.out.println("2. no");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println("You take the katana.");
						katana++;
						} else if (selection.equals("2")) {
						System.out.println("You decide to be smart and don't put a katana in your pocket."); }
					} else if (rand == 6) {
					System.out.println("You look down and something catches your eye.");
					System.out.println("It's a mysterious egg that's blue with what appears to rainbows on it.");
					System.out.println("Do you want to take it?");
					System.out.println("1. yes");
					System.out.println("2. no");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println("You carefully pick up the egg.");
						bluegg++;
						} else if (selection.equals("2")) {
						System.out.println("You're pretty sure that eggs can't be blue, so you crush it under your foot."); }
					} else if (rand == 7) {
					System.out.println("You look around you and see nothing, but you hear choir music in the deep woods.");
					System.out.println("Curious, " + name + " follows the sound of the music 20 feet back.");
							distance = distance - 20;
					System.out.println("Eventually you find yourself at the entrance to a strange temple.");
					System.out.println("Do you go inside?");
					System.out.println("1. yes");
					System.out.println("2. no");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println("You walk inside, expecting to see an average church or something.");
						System.out.println("But after looking around you see that the entire building is empty.");
						System.out.println("As far as you can tell, the building is only one room with a large pedestal.");
						System.out.println("You examine the pedestal and see three notches that would fit three stones.");
						System.out.println("Good thing you brought your 3 spiritual stones with you!");
						System.out.println("Do you put them in?");
						System.out.println("1. yes");
						System.out.println("2. no");
						inData = inputs.readLine();
						selection = inData;
							if (selection.equals("1")) {
							System.out.println("You put the stones in, and a secret room opens in front of you.");
							System.out.println("After looking around the new room, you only can see a strange sword.");
							System.out.println("The sword is stuck blade-down in a stone block in the floor.");
							System.out.println("You're pretty sure that you should not pull this sword out of the block.");
							System.out.println("Do you want to pull it out?");
							System.out.println("1. yes");
							System.out.println("2. no");
							inData = inputs.readLine();
							selection = inData;
								if (selection.equals("1")) {
								System.out.println("You go against your better judgement and rip the sword out of the ground.");
								System.out.println("You begin to feel strange........");
								System.out.println("Not that you noticed, but for some strange reason you're 7 years older.");
								System.out.println("You take the Master sword and walk out of the temple.");
								master++;
								} else if (selection.equals("2")) {
								System.out.println("You look at the weird glowing sword and realise that it's probably radiated.");
								System.out.println("Seeing as you don't want cancer, you leave the temple quickly."); }
							} else if (selection.equals("2")) {
							System.out.println("You decide to be greedy and keep your spiritual stones for yourself!");
							System.out.println("But unfortunately, they instantly explode from your greed.");
							System.out.println(name + "walks out of the temple in shame."); }
						} else if (selection.equals("2")) {
						System.out.println("You're pretty sure that there has never been a temple in the forest.");
						System.out.println("Actually, the notion strikes you as particularly foolhardy and dangerous.");
						System.out.println("You walk away from the temple and pretend it's a weather baloon."); }
					} else if (rand == 8) {
					System.out.println("You look around and don't really see anything.");
					System.out.println("But you take a glance down and see a fancy top hat lying on the ground");
					System.out.println("You would normally be prompted to pick up the hat, but why wouldn't you?");
					System.out.println(name + " instinctively equips the hat right away.");
					hat = 1;
					} else if (rand == 9) {
					System.out.println("You glance down and see a green-ish potion inside a box.");
					System.out.println("Because you can't see a reason why not, you take it.");
					greenpot++;
					} else if (rand == 10) {
					System.out.println("You glance down and see a red-ish potion on the ground.");
					System.out.println("Because this looks cool, you take it.");
					redpot++;
					} else if (rand == 11) {
					System.out.println("You see a blue potion lying right on the ground.");
					System.out.println(name + " instantly feels cooler just staring at the potion.");
					System.out.println("You swipe the potion and put in in your pocket.");
					bluepot++;
					} else if (rand == 12) {
					System.out.println("You see what looks like a golden potion on the ground.");
					System.out.println("There's no reason not to pick this up, so you do.");
					System.out.println("You stuff the potion into your pocket.");
					goldpot++;
					} else if (rand == 13) {
					System.out.println("You look around and hear a strange noise.");
					System.out.println("Far away you see what looks like a red person in a lab coat.");
					System.out.println("Upon further inspection, he appears to have crab-claws for hands.....");
					System.out.println("\"Good evening friend, my name is Zoidberg. I've heard about you.\"");
					System.out.println("\"I wanted to join your party of angry murderers.\"");
					System.out.println("Let him join?");
					System.out.println("1. Yes, of course! it's zoidberg!");
					System.out.println("2. No way! he looks like a homeless lobster");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println("\"Thank you friend! You won't regret it.\"");
						System.out.println("Zoidberg joins your party.");
						partner = "Zoidberg";

						} else if (selection.equals("2")) {
						System.out.println("\"What!? How dare you say no to the great Zoidberg!\"");
							if (weapon == 1) {		
							System.out.println("He begins to get angry and goes over to your weapon.");
							System.out.println("Zoidberg eats it in one loud CRUNCH, and walks away.");
								equip = "nothing";
							} else {
							System.out.println("He makes some loud noises and kind of walks away."); }
							}
					} else if (rand == 14) {
					System.out.println("You look around for a while, but don't really see anything.");
					System.out.println("But suddenly you hear a strange noise off in the distance.");
					System.out.println(name + " decides it's best to investigate.");
					System.out.println("You follow the sound and come upon a strange slime-like thing.");
					System.out.println("It stands upright and is green in colour. It is also smiling.");
					System.out.println("What do you do?");
					System.out.println("1. Smash it in the face");
					System.out.println("2. Begin to back away");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println();
						System.out.println("You pick the wrong decision and run at the monster.");
						System.out.println("Once you get close enough, you swing towards it.");
						System.out.println("You strike the chu-chu jelly and immediately get a shock.");
						System.out.println("The shock is so overpowering that you die instantly.");
						System.out.println("THE END.");
					Thread.sleep(2000000000);

						} else if (selection.equals("2")) {
						System.out.println();
						System.out.println("You decide it's best to not get close.");
						System.out.println("After all, you don't even know what this thing is.");
						System.out.println(name + " turns around and goes back to adventuring."); }
					} else if (rand == 15) {
					System.out.println("You have to squint but you think you see a treasure chest.");
					System.out.println("It's very far off in the distance but you can walk to it.");
					System.out.println(name + " runs over to the chest to see what's inside.");
					System.out.println("Do you want to open it?");
					System.out.println("1. Yep, this is a good idea");
					System.out.println("2. Nope, gonna leave it");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println();
						rand = (int)(5.0 * Math.random()) + 1;
							if (rand == 1) {
							System.out.println("You open the chest, but suddenly the entire thing explodes!");
							System.out.println("The explosion knocks off about 6 Health");
							System.out.println("HP -6");
							HP = HP - 6;
							} else {
							System.out.println("You open the chest, and there is a small blue ocarina inside.");
							System.out.println("It actually looks kind of important, so you pocket it.");
							ocarina++;
							}
						} else if (selection.equals("2")) {
						System.out.println();
						System.out.println("You don't trust your instincts and leave the chest be.");
						System.out.println(name + " thought that there could have been an enemy in there.");
						}
					} else if (rand == 16) {
					System.out.println("You stare intensely at the ground and see a very small yellow potion.");
					System.out.println("It's smaller than any other potion you've ever seen.");
					System.out.println("Although for some reason, it appears to be strongly electrified");
					System.out.println("You cautiously pick up the potion and put it into your pocket.");
					yellowpot++;
					} else if (rand == 17) {
					System.out.println("You look around and see a very fake looking house plant.");
					System.out.println("It looks like something one would put in a room to fill space.");
					System.out.println(name + " looks at it feeling puzzled, and doesn't know what to do.");
					System.out.println("What do you want to do?");
					System.out.println("1. Go up and hit it.");
					System.out.println("2. Go up and poke it.");
					System.out.println("3. Pocket it and sell it to Tom Nook.");
					System.out.println("4. Challenge it to a game of cards.");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println();
						System.out.println("You yell your loudest battle-cry and sprint towards it.");
						System.out.println("With a swing of your " + equip + ", you smash it in two.");
						System.out.println("After doing so, " + name + " looks down and stares at the broken plant.");
						System.out.println("You begin to ponder everything that the plant never got to accomplish.");
						System.out.println("The plant stares back at you.");
						System.out.println("You instantly feel that it's necessary to save your new friend with tape.");
						System.out.println("You take the plant pieces and pocket them.");
						planthalf = planthalf + 2;
						} else if (selection.equals("2")) {
						System.out.println();
						System.out.println("You advance towards the plant and cautiously go to poke it.");
				System.out.println("                               -//+:-.         ");
				System.out.println("                            `-/+++o///.        ");
				System.out.println("                        `-//+s/:`+sso--+:.`    ");
				System.out.println("                        `./o/oso-:syhyosss+`   ");
				System.out.println("                         `osssshhyhhhyyysss+`  ");
				System.out.println("                        .:++soooodhyyyyhs:+//` ");
				System.out.println("                        ``.-os:`.hdo:.-/o/.    ");
				System.out.println("                         `/shdssomy.````  `    ");
				System.out.println("                         :sshohd/N/            ");
				System.out.println("                         ``-:``--Ns            ");
				System.out.println("                              -/sNm+/`         ");
				System.out.println("                              sdmNNdh/         ");
				System.out.println("                              +NNMNNh.         ");
				System.out.println("                              `ymMNm/          ");
				System.out.println("The fake house-plant attacks!");
				loop2 = true;
				while (loop2==true) {

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + planthp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the plant with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand gets into the plant's fake dirt and it looks tropical.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The quicksand goes into the pot and converts it into a cactus.");
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					planthp = (planthp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 2 points of damage");
					planthp = planthp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You ran away from a fake plant, congrats.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed somehow.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (planthp <= 0) {
					System.out.println("Your party defeated a plastic plant!");
					System.out.println("You gained 2 exp and 1 gold.");
					exp = exp + 2;
					tonext = tonext - 2;
					gold = gold + 1;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					planthp = 1; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The plant makes its move!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was coated in sand.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The plant Attacks " + name + "!");
					System.out.println("It said something politically incorrect.");
					battle--;
					} else {
					System.out.println("The plant was being racist.");
					battle--; }
							}
						}
						}
						} else if (selection.equals("3")) {
						System.out.println();
						System.out.println("You are not sure who this \"Tom Nook\" is, but you know that he wants it.");
						System.out.println("He clearly knows its value, but is offering almost nothing.");
						System.out.println(name + " tries to haggle the price up a bit, but he doesn't budge.");
						System.out.println("You tell a sob-story about your empty house, with only a radio.");
						System.out.println("He's willing to buy the radio and plant for 150 gold.");
						System.out.println("You stubbornly accecpt the deal.");
						gold = gold + 150;
						} else if (selection.equals("4")) {
						System.out.println();
						System.out.println("You pull out a deck of cards and begin to deal.");
						System.out.println("He checks his hand and complains he's missing a card.");
						System.out.println(name + " begins to suspect the plant of cheating, but lets it slide.");
						System.out.println("He then continues to win every game from there on, this cannot stand!");
						System.out.println("You slam you hands on the table and flip it on top of him.");
						System.out.println("You grab the plant and throw him to the ground and stomp on him.");
						System.out.println("+2 exp");
						exp = exp + 2;
						}
					} else if (rand == 18) {
					System.out.println(name + " looks around and sees a jukebox sitting there.");
					System.out.print("You wonder how it got in the middle of a ");
						if (area == 1){
						System.out.println("forest anyways.");
						} else if (area == 2) {
						System.out.println("cave anyways.");
						} else if (area == 3) {
						System.out.println("desert anyways.");
						} else if (area == 4) {
						System.out.println("field anyways.");
						} else if (area == 5) {
						System.out.println("street anyways."); }
					System.out.println("Or how it's plugged in for that matter.");
					System.out.println("\"Oh well\" " + name + " says, and dismisses the oddity.");
					System.out.println("What do you want to do?");
					System.out.println("1. AYYYYYYYYYY");
					System.out.println("2. try to unplug it.");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println();
						System.out.println("You hit the music device with your hand to play a record,");
						System.out.println("Unfortunately you shatter the glass and slice your hand.");
						System.out.println("-3 HP");
						HP = HP - 3; 
						} else if (selection.equals("2")) {
						System.out.println();
						System.out.println("You go over to the plug of the machine, and stare at it.");
						System.out.println("It appears to be a very complex mess of wires.");
						System.out.println("This is going to require some excellent Swag to figure out.");
								if (swag < 50) {
							System.out.println("Which you unfortunately don't have.");
							System.out.println("You mess with the wires, but snap the red wire.");
							System.out.println(name + " hears a zapping sound and gets a strong shock.");
							System.out.println("-5 HP");
							HP = HP - 5;
								} else if (swag > 50) {
							System.out.println("So you do a swag-walk over to the wires, and shout;");
							System.out.println("AYYYYYYYYYYYYY!!");
							System.out.println("The wires submit and unplug themselves.");
							System.out.println("CRISIS AVERTED."); }
						}
					} else if (rand == 19) {
					System.out.println("You look around you and see nothing,but realise you almost stepped on a cookie.");
					System.out.println("Curious, " + name + " picks up the cookie.");
					System.out.println("you find yourself in a tough situation,to eat or not to eat?");
					System.out.println("1. yes");
					System.out.println("2. no");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println("You... for some out of this world reason decide you want to eat the cookie.");
						System.out.println("it turns out to be an oddly shaped poisoned bug," + name + " passes out");
						System.out.println("You wake up 3 hours later with Parkinsons");
						System.out.println("Disease Aquired: Parkinsons");
						status = "Parkinsons";
						} else if (selection.equals("2")) {
						System.out.println("You remember someone telling you not to eat things you find on the ground.");
						System.out.println("the pastry turned out to be a rare species of poisonous bug, it scuttles away.");
						System.out.println("You walk away and find a random bag of gold containing 50 gold!"); 
						gold = gold + 50;}
					} else if (rand == 20) {
					System.out.println("You look around you and see an odd fellow staring directly in front of him.");
					System.out.println("Curious, " + name + " tries to talk to him but he says nothing.");
							distance = distance + 10;
					System.out.println("Eventually you ignore him and walk a few steps until you get in front of him.");
					System.out.println("The stranger challenges you to a Pokemon Battle!");
					System.out.println("Do you accept?");
					System.out.println("1. Yes of course!");
					System.out.println("2. No, I don't have any Pokemon.");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println("Stranger: Charizard I choose you!");
						System.out.println("He throws a strange red and white ball.");
						System.out.println("The ball glows and a fire breathing dragon comes out.");
						System.out.println("What do you want to do?");
						System.out.println("1. Battle!");
						System.out.println("2. Run!");
						inData = inputs.readLine();
						selection = inData;
							if (selection.equals("1")) {
							System.out.println("You attempt throwing a pokeball...");
							System.out.println("But you realize you don't have any pokemon!.");
							System.out.println("Charizard deals 3 damage, it's Super effective!");
							System.out.println(name + " Fainted!");
							System.out.println("You flee the battle!");
							HP = HP - 3;
							inData = inputs.readLine();
							selection = inData;
						} else if (selection.equals("2")) {
						System.out.println("You don't have any pokemon so you flee the battle and lose 10 gold.");
						System.out.println(name + " walks away from the emotionless stranger.");
						gold = gold - 10; }
					} else if (selection.equals("2")) {
					System.out.println("You don't have any pokemon so you flee the battle and lose 10 gold.");
					System.out.println(name + " walks away from the emotionless stranger.");
					gold = gold - 10; }
					} else if (rand == 21) {
					System.out.println("You practically step on a pair of dice.");
					System.out.println("You think they might be magical.");
					System.out.println("do you want to roll the dice?");
					System.out.println("1. Yep, this is a good idea");
					System.out.println("2. Nope, could hurt myself.");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
						System.out.println();
						rand = (int)(6.0 * Math.random()) + 1;
							if (rand == 1) {
							System.out.println("You rolled a 3... bummer, they exploded!");
							System.out.println("HP -3");
							HP = HP - 3;
							} else if (rand == 2) {
							System.out.println("You rolled a 2... bummer, they exploded!");
							System.out.println("HP -2");
							HP = HP - 2;
							} else if (rand == 3) {
							System.out.println("You rolled a 6... bummer, they exploded!");
							System.out.println("HP -6");
							HP = HP - 6;
							} else if (rand == 4) {
							System.out.println("You rolled a 4... bummer, they exploded!");
							System.out.println("HP -4");
							HP = HP - 4;
							} else if (rand == 5) {
							System.out.println("You rolled a 1...");
							System.out.println("Nice! the dice turned to pure gold.");
							System.out.println("That'd be worth about 50 gold pieces.");
							gold = gold + 50;
							} else {
							System.out.println("You rolled a 5...");
							System.out.println("Nice! the dice turned to pure diamonds.");
							System.out.println("That'd be worth about 100 gold pieces.");
							gold = gold + 100;
							}
						} else if (selection.equals("2")) {
						System.out.println();
						System.out.println("You don't trust your luck and leave them be.");
						System.out.println(name + " has always had horrible luck...");
						}
					} else if (rand == 22) {
					System.out.println("After glancing down, you see a fish.");
					System.out.println("This seems like a bad place to find a fish.");
					System.out.println("You feel pity on it as it flops around.");
					System.out.println("The fish appears to be very hydrated, and will last for a while.");
					System.out.println("What will you do?");
					System.out.println("1. Take the fish");
					System.out.println("2. Kick the fish");
					System.out.println("3. Put it in your pants");
					inData = inputs.readLine();
					selection = inData;
						if (selection.equals("1")) {
					System.out.println(name + " tries to pick up the fish,");
					System.out.println("But it falls into the deep canyon below.");
					System.out.println("You kind of awkwardly wave at it as it falls to its death.");
						} else if (selection.equals("2")) {
					System.out.println(name + " gives it the strongest KICK they can gather up.");
					System.out.println("You boot it so hard it just goes......");
					System.out.println("It's just flying.....and..... IT'S GOOD!");
					System.out.println("TOUCHDOWN! YOU WIN THE MATCH! THE CROWD GOES WILD!");
					System.out.println("You look over and see the delicious tears of your enemies.");
					System.out.println("John Madden would be proud.");
						} else if (selection.equals("3")) {
					System.out.println(name + " grabs the fish and immediately shoves it in their pants.");
					System.out.println("You immediately begin to regret this action.");
					System.out.println("This could quite possibly be the most uncomfortable moment of your life."); }					
					} else if (rand == 23) {
					System.out.println(name + " looks around and sees a large egg sitting on the ground.");
					System.out.println("You wonder what an egg could be doing here or what kind of egg it is.");
					System.out.println("You suddenly realise you're incredibly hungry and want to eat the egg.");
					System.out.print("you attempt to start a fire in the ");
					if (area == 1){
					System.out.println("forest and some how manage to get it started.");
					} else if (area == 2) {
					System.out.println("cave and some how manage to get it started.");
					} else if (area == 3) {
					System.out.println("desert and some how manage to get it started.");
					} else if (area == 4) {
					System.out.println("field and some how manage to get it started.");
					} else if (area == 5) {
					System.out.println("street and some how manage to get it started."); }
					System.out.println("You attempt to fry the egg over the fire.");
					System.out.println("....");
						rand = (int)(4.0 * Math.random()) + 1;
							if (rand == 1) {
							System.out.println("You succesfully cook and eat the egg!");
							System.out.println("HP +6");
							HP = HP + 6;
							} else if (rand == 2) {
							System.out.println("You burnt the egg, it tastes horrible!");
							System.out.println("HP -2");
							HP = HP - 2;
							} else if (rand == 3){
							System.out.println("You eat the apparently poisonous egg!");
							System.out.println("HP -5");
							HP = HP - 5;
							} else if (rand == 4){
							System.out.println("The egg starts to wobble...");
							System.out.println("You think there might be something in it so you try to sell it.");
							System.out.println("Some idiot thought it was a dragon egg and wanted to pay lots.");
							System.out.println("Score! he offered 70 gold, you gladly accept the deal.");
							gold = gold + 70; }
					} else if (rand == 24) {
							System.out.println("AAAAAAH! You stepped on a bear trap!");
							System.out.println("You manage to break you leg out but...");
							System.out.println("You lose 5 HP!");
							HP = HP - 5;
					} else if (rand == 25) {
							System.out.println("You down at a book you almost stepped on.");
							System.out.println("Curious, " + name + " notices the title \"Hardcore Parkour\".");
							System.out.println("Learning Parkour would be amazing! do you want to read it?");
							System.out.println("1. yes");
							System.out.println("2. no");
							inData = inputs.readLine();
							selection = inData;
					if (selection.equals("1")) {
						System.out.println("You beat your chest like a gorilla and scream,");
						System.out.println("\"I DO PARKOOOOOOOOOOOOUR\"");
						System.out.println("You run and ram head-first into a wall.");
						System.out.println("Shamefully you get up and leave");
						System.out.println("-4 HP for dishonour to your country..");
						HP = HP - 4;
					} else if (selection.equals("2")) {
						System.out.println("You realise something like this takes years of pratice.");
						System.out.println("It's obviously a bad idea, so instead of reading it you decide to sell it.");
						System.out.println("Some douche with a ponytail bought it for 60 gold!"); 
						gold = gold + 60;}
					} else if (rand == 26) {
							System.out.println("You hear stomping in the area....");
							System.out.println(name + " cautiously looks around.");
							System.out.println("HOLY CRAP IT'S A MOOSE!");
							System.out.println("MOOSE LOOKS HUNGRY! IT'S COMING RIGHT AT YOU!");
							System.out.println("Quickly! how are you going to survive this!?");
							System.out.println("1. Kill & eat the moose");
							System.out.println("2. Run to the hills");
							System.out.println("3. Inject maple syrup and fight with the power of Canadian lumber");
							inData = inputs.readLine();
							selection = inData;
						if (selection.equals("1")) {
							System.out.println(name + " charges moose.");
							System.out.println("But moose is too big...");
							System.out.println("Moose crushed " + name + ".");
							System.out.println("HP -7");
							HP = HP - 7;
						} else if (selection.equals("2")) {
							System.out.println(name + " runs at top speed!");
							System.out.println("YOU'VE NEVER RAN LIKE THIS BEFORE!");
							System.out.println("In the distance you hear a shout \"Run, forest run\".");
							System.out.println("Before you have time to look....");
							System.out.println("Moose crushed " + name + ".");
							System.out.println("HP -5");
							HP = HP - 5;
						} else if (selection.equals("3")) {
							System.out.println(name + " grabs the needle and injects the maple syrup.");
							System.out.println("Your vision turns red and white.");
							System.out.println("with immense Canadian pride your lumberjack instincts kick in.");
							System.out.println("You grapple the moose and lift it into the air by its neck.");
							System.out.println(name + " chokeslams it down into the dirt.");
							System.out.println("Moose is dead. You walk away victorious."); }
						} else if (rand == 27) {
							System.out.println("You hear twigs snapping in the distance...");
							System.out.println("Like an ninja you hide behind a tree.");
							System.out.println("You duck around the tree to see a bandit armed with a bow.");
							System.out.println("1. Fight the bandit");
							System.out.println("2. Flee");
							inData = inputs.readLine();
							selection = inData;
						if (selection.equals("1")) {
							System.out.println("You charge at the Bandit, he loads an arrow to his bow.");
							System.out.println("You were shot! but you beat and loot the bandit.");
							System.out.println(" -5HP +60 gold from looting the bandit");
							HP = HP - 5;
							gold = gold + 60;
						} else if (selection.equals("2")) {
							System.out.println("You tried to run from the bandit.");
							System.out.println("He fired off three arrows in one shot!");
							System.out.println("Two of them hit you, but you dodge the other. -7HP"); 
							HP = HP - 7;}
					} else {
					System.out.println("Nothing important or really useful."); }

		} else if (selection.equals("5")) {
			if (status.equals("Golden organs")) {
			System.out.println("You hobble 5 feet and lose 1 health.");
				HP--;
				distance = distance + 5;

			} else if (status.equals("DIABEETUS")) {
			System.out.println("You run 5 feet and stop to catch your breath.");
				distance = distance + 5;

			} else if (pet == 1) {
			System.out.println("You fly 20 feet on a rainbow poptart cat like a boss.");
				distance = distance + 20;
			} else {
			System.out.println("You walk about 10 feet.");
				distance = distance + 10; }

				if (bluegg > 0) {
				hatch++; }
			
				if ((distance == 170 || distance == 180) && areaup == 1) {
						System.out.println(name + " is now standing in front of an iron door.");
						System.out.println("You open it out of curiousity....");
				System.out.println("                          .. `-                    ");
				System.out.println("                         `o-/o`..`                 ");
				System.out.println("                       .+ysho:oyhdys/.             ");
				System.out.println("                      `s+hy++sy/oyhdhdo.- ..       ");
				System.out.println("                     `ohds// --  .ohhhh//:/+so:`   ");
				System.out.println("                     -+/:+o`      -shys/////+/     ");
				System.out.println("                      -::       ::yo+s+/::/+.      ");
				System.out.println("                                +yydyh/+::///`     ");
				System.out.println("                               /:yhhhho:///:.:     ");
				System.out.println("                               `--+shhho:+/-/-     ");
				System.out.println("                              .:+o:``:sssoso/`     ");
				System.out.println("                             `+/:  `+osh+hy:       ");
				System.out.println("                                   `.o/oyh-        ");
				System.out.println("                                      ohh/         ");
				System.out.println("                                      `sy+         ");
				System.out.println("                                        -oo:`  `o:`");
				System.out.println("                                           .----o/.");
				System.out.println("A dragon emerges! Fight the boss!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					dragonhp = 25;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    boss:" + dragonhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the dragon with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand gets into the monster's eyes and it loses a turn.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						dragonhp = dragonhp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					dragonhp = (dragonhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through your weapon and causes 2 points of damage");
					dragonhp = dragonhp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					System.out.println("But couldn't because it's a boss fight.");
					battle++;
				} else {
					System.out.println("But nothing happened."); }

				if (dragonhp <= 0) {
					System.out.println("Your party defeated the boss!");
					System.out.println("You gained 800 exp and 300 gold.");
					exp = exp + 800;
					tonext = tonext - 800;
					gold = gold + 300;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					dragonhp = 25;
					distance = 190;
					System.out.println(name + " sees something on the ground, it appears to have been inside the dragon.");
					System.out.println("You go over to see it, and realize that it's a large crystal heart.");
					System.out.println("Naturally, you reach out and grab the heart.");
					System.out.println("+10 Base HP");
					baseHP = baseHP + 10;
					HP = HP + 10; 
					System.out.println("Press enter to contine going.....");
					inData = inputs.readLine();
					selection = inData;
					System.out.println();
						if (area == 1) {
					System.out.println(name + " sees an entrance to a cave inside the door.");
					System.out.println("Seeing as this is the only way to go, you enter it....");
						} else if (area == 2) {
					System.out.println(name + " sees an opening inside the door.");
					System.out.println("It appears to lead out into a desert.");
					System.out.println("There appears to be no other ways out, so you leave....");
						} else if (area == 3) {
					System.out.println(name + " sees a strange sight in the door.");
					System.out.println("It appears to be a large field, with tall grass.");
					System.out.println("You really want to leave this desert, so you enter it....");
						} else if (area == 4) {
					System.out.println(name + " sees something weird in the door.");
					System.out.println("It appears to lead out to a busy street.");
					System.out.println("There isn't any other ways to go, so you enter the door....");
						} else if (area == 5) {
					System.out.println(name + " looks in the door and is amazed.");
					System.out.println("There is an entire forest inside, it looks amazing.");
					System.out.println("You become mystified by it, and walk inside the door...."); }
					if (area==5) {
					area = 1;
					} else {
					area++; }
					areaup++;
					}
					

				if (battle == 1) {
					System.out.println();
					System.out.println("The dragon goes to attack!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was blinded.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("The dragon snaps at " + name + "!");
					HP = HP - dragonatk;
					System.out.println("It caused " + dragonatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The dragon begins to billow smoke from its nose.");
					battle--; }
							}
						}
						}
				} else if ((distance == 440 || distance == 450) && areaup == 2) {
						System.out.println(name + " strangely sees a large present in front of them.");
						System.out.println("What do you want to do?");
						inData = inputs.readLine();
						selection = inData;
					System.out.println();
					System.out.println("But before you could do that, a spartan jumped out!");
				System.out.println("                                    -dm/        ");
				System.out.println("                                    ysm- `      ");
				System.out.println("             .`                    .y/hyydys-   ");
				System.out.println("              ..-.`               `.hyyhhNNNmy. ");
				System.out.println("                 `.-.`            /+:/ysdmmNmNm.");
				System.out.println("                    `.--``        -oo+hhdmmmNMMy");
				System.out.println("                        ..-.`    `-hhshmmNNNMMMN");
				System.out.println("                           `.-.-::.:ho+omNNMMMMd");
				System.out.println("                              `//--+o//oydNMMNh.");
				System.out.println("                                 /hdhdddddmdd/` ");
				System.out.println("                               -oyo/shhddso+++  ");
				System.out.println("                               /dm`   ````omh.  ");
				System.out.println("                               +dh         +mh  ");
				System.out.println("                              `+m.          :m+ ");
				System.out.println("                            .+syo           /hh ");
				System.out.println();
				System.out.println("A Spartan emerges! Fight the boss!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					sparthp = 35;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    boss:" + sparthp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the Spartan with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand gets into the man's eyes and he screams.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						sparthp = sparthp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					sparthp = (sparthp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through your weapon and causes 2 points of damage");
					sparthp = sparthp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					System.out.println("But couldn't because it's a boss fight.");
					battle++;
				} else {
					System.out.println("But nothing happened."); }

				if (sparthp <= 0) {
					System.out.println("Your party defeated the boss!");
					System.out.println("You gained 1200 exp and 400 gold.");
					exp = exp + 1200;
					tonext = tonext - 1200;
					gold = gold + 400;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					sparthp = 25;
					distance = 460;
					System.out.println(name + " eyes the dead Spartan warrior.");
					System.out.println("He appears to have a few useful things so you bring them along.");
					System.out.println("+1 spear");
					System.out.println("+2 loaves of bread");
					spear = spear + 1;
					bread = bread + 2;
					System.out.println("Press enter to contine going.....");
					inData = inputs.readLine();
					selection = inData;
					System.out.println();
						if (area == 1) {
					System.out.println(name + " looks inside the present, and there is a portal inside.");
					System.out.println("It is an explosion of bright colours that is near impossible to resist.");
					System.out.println("You stare at it, and can make out the faint outline of a cave.");
					System.out.println("This is clearly a good idea, so you jump into it....");
						} else if (area == 2) {
					System.out.println(name + " looks inside the present, and there is a portal inside.");
					System.out.println("It is an explosion of bright colours that is near impossible to resist.");
					System.out.println("You stare at it, and can make out the faint outline of a desert.");
					System.out.println("This is clearly a good idea, so you jump into it....");
						} else if (area == 3) {
					System.out.println(name + " looks inside the present, and there is a portal inside.");
					System.out.println("It is an explosion of bright colours that is near impossible to resist.");
					System.out.println("You stare at it, and can make out the faint outline of a large field.");
					System.out.println("This is clearly a good idea, so you jump into it....");
						} else if (area == 4) {
					System.out.println(name + " looks inside the present, and there is a portal inside.");
					System.out.println("It is an explosion of bright colours that is near impossible to resist.");
					System.out.println("You stare at it, and can make out the faint outline of a busy town.");
					System.out.println("This is clearly a good idea, so you jump into it....");
						} else if (area == 5) {
					System.out.println(name + " looks inside the present, and there is a portal inside.");
					System.out.println("It is an explosion of bright colours that is near impossible to resist.");
					System.out.println("You stare at it, and can make out the faint outline of a forest.");
					System.out.println("This is clearly a good idea, so you jump into it...."); }
					if (area==5) {
					area = 1;
					} else {
					area++; }
					areaup++;
					}
					

				if (battle == 1) {
					System.out.println();
					System.out.println("The Spartan goes to attack!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But he was busy screaming.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The Spartan throws a spear at " + name + "!");
					HP = HP - spartatk;
					System.out.println("It caused " + spartatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The warrior was busy having abs.");
					battle--; }
							}
						}
						}
				} else if ((distance == 660 || distance == 670) && areaup == 3) {
						System.out.println(name + " looks around, and watches a boulder explode!");
				System.out.println("                                  .-/`              ");
				System.out.println("                            .:.:/osoh-              ");
				System.out.println("                           `  :syshhhs`             ");
				System.out.println("                          -::.  /syhmhhs+/`         ");
				System.out.println("                         .o+o/  :hhhysyhhhs`        ");
				System.out.println("                         .++hho:sdhhyyyhdhhy        ");
				System.out.println("                            :ydyhhshhyyhhhhd`       ");
				System.out.println("                              `:/-`ohhhhhh-         ");
				System.out.println("                                  /hoooohd.         ");
				System.out.println("                                 `hhdoshdho         ");
				System.out.println("                                 /hh:oo.ohh-        ");
				System.out.println("                                 /yh:    :hho.      ");
				System.out.println("                                 :yyo    .ohh/      ");
				System.out.println("                                  +h-      .yy.     ");
				System.out.println("                                 -ss-       :ys:    ");
				System.out.println("                                 ..`        `--`    ");
				System.out.println();
				System.out.println("A Minotaur emerges! Fight the boss!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					minohp = 50;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    boss:" + minohp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the Minotaur with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand gets into the Monsters eyes, and he loses 3 turns.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						minohp = minohp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					minohp = (minohp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through your weapon and causes 2 points of damage");
					minohp = minohp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					System.out.println("But couldn't because it's a boss fight.");
					battle++;
				} else {
					System.out.println("But nothing happened."); }

				if (minohp <= 0) {
					System.out.println("Your party defeated the boss!");
					System.out.println("You gained 2500 exp and 1000 gold.");
					exp = exp + 2500;
					tonext = tonext - 2500;
					gold = gold + 1000;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					sparthp = 50;
					distance = 680;
					System.out.println(name + " looks at the beaten Minotaur.");
					System.out.println("His  battle-axe shines in the light.");
					System.out.println("You take it along because it looks like a good weapon.");
					System.out.println("+1 battle-axe");
					battleax = battleax + 1;
					System.out.println("Press enter to contine going.....");
					inData = inputs.readLine();
					selection = inData;
					System.out.println();
						if (area == 1) {
					System.out.println(name + " walks over to the boulder, and notices that it's actually a vehicle.");
					System.out.println("It looks helpful, so you ride in it for a pretty good distance.");
					System.out.println("After you get out, you appear to be inside of a cave.");
					System.out.println("You must've driven there without noticing....");
						} else if (area == 2) {
					System.out.println(name + " walks over to the boulder, and notices that it's actually a vehicle.");
					System.out.println("It looks helpful, so you ride in it for a pretty good distance.");
					System.out.println("After you get out, you appear to be in the middle of a desert.");
					System.out.println("You must've driven there without noticing....");
						} else if (area == 3) {
					System.out.println(name + " walks over to the boulder, and notices that it's actually a vehicle.");
					System.out.println("It looks helpful, so you ride in it for a pretty good distance.");
					System.out.println("After you get out, you appear to be in a large field");
					System.out.println("You must've driven there without noticing....");
						} else if (area == 4) {
					System.out.println(name + " walks over to the boulder, and notices that it's actually a vehicle.");
					System.out.println("It looks helpful, so you ride in it for a pretty good distance.");
					System.out.println("After you get out, you appear to be in a large city.");
					System.out.println("You must've driven there without noticing....");
						} else if (area == 5) {
					System.out.println(name + " walks over to the boulder, and notices that it's actually a vehicle.");
					System.out.println("It looks helpful, so you ride in it for a pretty good distance.");
					System.out.println("After you get out, you appear to be inside of a large forest.");
					System.out.println("You must've driven there without noticing...."); }
					if (area==5) {
					area = 1;
					} else {
					area++; }
					areaup++;
					}
					

				if (battle == 1) {
					System.out.println();
					System.out.println("The Minotaur looks towards " + name + "!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But he actually didn't because he couldn't see.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The Minotaur swings his battle-axe at " + name + "!");
					HP = HP - minoatk;
					System.out.println("It caused " + minoatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The monster was busy thinking about killing you.");
					battle--; }
							}
						}
						}
				} else if ((distance == 810 || distance == 820) && areaup == 4) {
						System.out.println("....");
						System.out.println(name + " hears a strange noise and turns around.....");
				System.out.println("                                   +                  ");
				System.out.println("                                 .:/+-                ");
				System.out.println("                             .-/+///oss+:`            ");
				System.out.println("                           .oo/+//+ooossyd+           ");
				System.out.println("                         -`shoshys+oyhhhydd::`        ");
				System.out.println("                         `/oo:..-::/+osyhhs:          ");
				System.out.println("                         `/++++oossssssyyhy+`         ");
				System.out.println("                      .:/::///++:-s/:/s++syyyyo:`     ");
				System.out.println("                    .+/-../+++yyoosssyh+osyyyyhys:    ");
				System.out.println("                   `o+//::/osssoooooooyyyysssyyhhs:   ");
				System.out.println("                   /ooo++/////++ooooooossssssyyhhy+.  ");
				System.out.println("                   +ssoooo+++ooooooossssssssyyyyyy+-  ");
				System.out.println("                   /sysssssssssssssssssssyyyyysoss+   ");
				System.out.println("                   `+syyyyyyysssssssssyyyyyys-.os+`   ");
				System.out.println("                    `:oyyyyyyyyyyyyyyyyyyyss+oso:     ");
				System.out.println("                       -/ossyyyyyyyyyyyyyysso/-       ");
				System.out.println("                          `..--::///::::-..`          ");
				System.out.println("A King Slime! Fight the boss!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					kinghp = 65;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    boss:" + kinghp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the King Slime with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("It absorbs the sand, and begins to solidify.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						kinghp = kinghp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					kinghp = (kinghp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through your weapon and causes 2 points of damage");
					kinghp = kinghp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					System.out.println("But couldn't because it's a boss fight.");
					battle++;
				} else {
					System.out.println("But nothing happened."); }

				if (kinghp <= 0) {
					System.out.println("Your party defeated the boss!");
					System.out.println("You gained 6000 exp and 1500 gold.");
					exp = exp + 6000;
					tonext = tonext - 6000;
					gold = gold + 1500;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					kinghp = 50;
					distance = 830;
					System.out.println(name + " eyes the remains of the large slime.");
					hat = 3;
					System.out.println("In the remains of the disgusting ooze, there's an awesome crown.");
					System.out.println("You wade through the slime to grab the hat because why not.");
					System.out.println(name + " smugly puts the crown on their head.");
					System.out.println("Press enter to contine going.....");
					inData = inputs.readLine();
					selection = inData;
					System.out.println();
						if (area == 1) {
					System.out.println(name + " continues walking, while examining the area.");
					System.out.println("There doesn't seem to be anything around you, so you continue walking.");
					System.out.println("After a while, you stumble upon a cave.");
					System.out.println("You could've sworn you heard something inside of it, so you go in....");
						} else if (area == 2) {
					System.out.println(name + " continues walking, while examining the area.");
					System.out.println("There doesn't seem to be anything around you, so you continue walking.");
					System.out.println("After a while, you stumble upon a desert.");
					System.out.println("You could've sworn you heard something in the distance, and keep walking....");
						} else if (area == 3) {
					System.out.println(name + " continues walking, while examining the area.");
					System.out.println("There doesn't seem to be anything around you, so you continue walking.");
					System.out.println("After a while, you stumble upon a large field.");
					System.out.println("You could've sworn you heard something in the distance, and keep walking....");
						} else if (area == 4) {
					System.out.println(name + " continues walking, while examining the area.");
					System.out.println("There doesn't seem to be anything around you, so you continue walking.");
					System.out.println("After a while, you stumble upon a bustling city.");
					System.out.println("You could've sworn you heard something in the distance, and keep walking....");
						} else if (area == 5) {
					System.out.println(name + " continues walking, while examining the area.");
					System.out.println("There doesn't seem to be anything around you, so you continue walking.");
					System.out.println("After a while, you stumble upon a forest.");
					System.out.println("You could've sworn you heard something inside of it, so you go in...."); }
					if (area==5) {
					area = 1;
					} else {
					area++; }
					areaup++;
					}
					

				if (battle == 1) {
					System.out.println();
					System.out.println("The King Slime jumps towards " + name + "!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it couldn't move.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The King Slime attacks " + name + "!");
					HP = HP - kingatk;
					System.out.println("It caused " + kingatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The Slime is jiggling furiously.");
					battle--; }
							}
						}
						}
				} else if ((distance == 1100 || distance == 1110) && areaup == 5) {
								System.out.println(name + " comes upon a large black castle.");
								System.out.println("It looks quiete intimidating, but " + name + " enters anyways.");
								System.out.println("Inside there is a single large room with an enourmous iron door.");
								System.out.println("The door appears to be open just enough for " + name + " to slip through.");
								System.out.print("You listen closely and hear someone playing a haunting melody on ");
									rand = (int)(10.0 * Math.random()) + 1;
									if (rand == 1) {
									System.out.println("a guitar.");
									} else if (rand == 2) {
									System.out.println("an accordion.");
									} else if (rand == 3) {
									System.out.println("a piano.");
									} else if (rand == 4) {
									System.out.println("a pipe organ.");
									} else if (rand == 5) {
									System.out.println("a flute.");
									} else if (rand == 6) {
									System.out.println("an ocarina.");
									} else if (rand == 7) {
									System.out.println("a cello.");
									} else if (rand == 8) {
									System.out.println("a violin.");
									} else if (rand == 9) {
									System.out.println("a saxophone.");
									} else if (rand == 10) {
									System.out.println("a harp."); }
								System.out.println("This tune seems fimiliar, but you can't remember where you've heard it.");
								System.out.println("....");
								System.out.println("This was the song that you and your brother Saybel made up as kids.");
								System.out.println("You haven't seen him ever since he was taken 20 years ago in the night.");
								System.out.println(name + " begins to have memories flood back of their childhood.");
								System.out.println("You become overcome by emotion and crash through the door.");
								System.out.println();
								System.out.println("Press Enter when ready.");
						inData = inputs.readLine();
						selection = inData;
					System.out.println();
					System.out.println("You see a figure on the opposite side of the room ready for a fight.");
				System.out.println("                               `/-            ");
				System.out.println("                              .s--/: ```      ");
				System.out.println("                              :y`smh//os`     ");
				System.out.println("                              :s+:dhoohh`     ");
				System.out.println("                              `ohhdhddmd/     ");
				System.out.println("                          `./ohmdmmhshddh+.`` ");
				System.out.println("                       `:shddddddmmh::ydyyh-++");
				System.out.println("                     .+yhhs++//shdddy:yddy+` :");
				System.out.println("                    :o/-.`    :syyyh+ohddho   ");
				System.out.println("                   /o`      `://--ss.+dmdy.   ");
				System.out.println("                   s/       ::``-/o./yydh:    ");
				System.out.println("                   +`       ` `--:-+h//ys`    ");
				System.out.println("                   `         .-.``+y- +y-     ");
				System.out.println("                            `.  `/s. -s/      ");
				System.out.println("                            `   :y.  +s       ");
				System.out.println("                               `s-   o/       ");
				System.out.println("                               -+   .s+--`    ");
				System.out.println("                             `::/      ``     ");
				System.out.println("It's the Demon Lord Saybel! Fight the final boss!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					saybelhp = 85;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    Saybel:" + saybelhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack Saybel with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("He gets the sand in his eyes, and becomes blinded.");
						monstatus = "blind";
						blindturn = 6;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("Saybel begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						slimehp = slimehp - 20;
						monstatus = "blind";
						blindturn = 5;
						equip = "nothing";
					} else {
					saybelhp = (saybelhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through your weapon and causes 4 points of damage.");
					saybelhp = saybelhp - 4; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					System.out.println("But couldn't run from your brother!");
					battle++;
				} else {
					System.out.println("But nothing happened."); }

				if (saybelhp <= 0) {
					System.out.println("Your party defeated the boss!");
					System.out.println("You gained 10000 exp and 5000 gold.");
					exp = exp + 10000;
					tonext = tonext - 10000;
					gold = gold + 5000;
					battle = 0;
					areaup = 6;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					kinghp = 85;
					distance = 1120;
					System.out.println();
					Thread.sleep(5000);
					System.out.println("Saybel tries to swing the lance with the last of his energy,");
					Thread.sleep(3000);
					System.out.println(name + " attempts to plead with him that they don't need to fight.");
						Thread.sleep(3000);
					System.out.println("Saybel is too overcome with darkness to hear them though,");
						Thread.sleep(3000);
					System.out.println("and continues to lift the lance.");
						Thread.sleep(3000);
					System.out.println("You lower your weapon and refuse to fight.");
						Thread.sleep(3000);
					System.out.println("He manages to lift the weapon over his head, and brings it down full force.");
						Thread.sleep(3000);
					System.out.println("The lance bounces off the ground and comes back to impale him through the chest.");
						Thread.sleep(3000);
					System.out.println(name + " rushes over to help thier brother.");
						Thread.sleep(3000);
					System.out.println("He looks up, and says \"It needed to end this way. To save everyone.\"");
						Thread.sleep(3000);
					System.out.println("Saybel's eyes then fall limp and lifeless.");
						Thread.sleep(3000);
					System.out.println("You understand what he meant.");
						Thread.sleep(3000);
					System.out.println("With the darkness controlling the monsters gone, you leave your brother be.");
						Thread.sleep(3000);
					System.out.println(name + " leaves the castle and returns to his hometown to greet the villagers.");
						Thread.sleep(3000);
						System.out.println();
					System.out.println("Press Enter when ready.");
						inData = inputs.readLine();
						selection = inData;
					System.out.println();
					System.out.println("You return home and suddenly you notice that everyone is gathered in the town.");
						Thread.sleep(3000);
					System.out.println("They all explain that you saved them from the monsters and you deserve a reward.");	
						Thread.sleep(3000);
					System.out.println("You turn around to see a massive present, the size of a house!");
						Thread.sleep(3000);
					System.out.println("QUICK WHAT IS YOUR FAVOURITE OBJECT! TYPE IT IN ALL CAPITALS!");
						inData = inputs.readLine();
						thing = inData;
					System.out.println();
					System.out.println("You open the box, and hear a loud explosion come from the top.");
						Thread.sleep(3000);
					System.out.println(name + " looks upwards and sees....");
						Thread.sleep(3000);
					System.out.println("OH MAN HOLY CRAP THERE'S MILLIONS OF " + thing + "S RAINING DOWN FROM EVERYWHERE!!");
					System.out.println("THIS WAS THE BEST CHRISTMAS EVER.");
					System.out.println(" THE END ");
					Thread.sleep(7000);
					System.out.println("                                                                  ");
					Thread.sleep(200);
					System.out.println("         .---::///:---.`` `.`   `.   `.                           ");
					Thread.sleep(200);
					System.out.println("         :++///:hy//++oss`/d-   yd` .hhyysso`                     ");
					Thread.sleep(200);
					System.out.println("                ho        /d-...hy  /d:  ``.                      ");
					Thread.sleep(200);
					System.out.println("                do        +doooohy  /mhyys-                       ");
					Thread.sleep(200);
					System.out.println("               .d/        yd    +m- +d-.-:-                       ");
					Thread.sleep(200);
					System.out.println("               ./`        ..    ./. /yso++/                       ");
					Thread.sleep(200);
					System.out.println("                                                                  ");
					Thread.sleep(200);
					System.out.println("                                                                  ");
					Thread.sleep(200);
					System.out.println("            ://+:.                                                ");
					Thread.sleep(200);
					System.out.println("            y.///+:          --....-                .:///:        ");
					Thread.sleep(200);
					System.out.println("            .s  //.         -dy+ooo/     sd.     .` :d+::sy:      ");
					Thread.sleep(200);
					System.out.println("            s.`.s            yy        `yyyy.  `oh- .d/   :h+     ");
					Thread.sleep(200);
					System.out.println("        .-+yyyyh.            oh/++++   +h- sh--ho`  :d-   .h+     ");
					Thread.sleep(200);
					System.out.println("      .syyyyyyyh-            /d+---.  -d/   sdh+    /d. `/ys`     ");
					Thread.sleep(200);
					System.out.println("      yyyyyyyyysh-            yy..--` +d`   -mm`    +doyy+-       ");
					Thread.sleep(200);
					System.out.println("      yyyyyyyyyyyy            -ss+++. :s     -.      `-`          ");
					Thread.sleep(200);
					System.out.println("      -yyyyyyyyyys                                                ");
					Thread.sleep(200);
					System.out.println("       `/osyyyys/                                                 ");
					Thread.sleep(200);
					System.out.println();
					Thread.sleep(200);
					System.out.println();
					Thread.sleep(200);
					System.out.println();
					Thread.sleep(200);
					System.out.println();
					Thread.sleep(60000);
					}
					

				if (battle == 1) {
					System.out.println();
					System.out.println("Saybel charges at " + name + "!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But he stumbled because of the sand.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("He attacks with his lance!");
					HP = HP - saybelatk;
					System.out.println("It caused " + saybelatk + " points of damage.");
					battle--;
					} else {
					System.out.println("But " + name + " dodges swiftly.");
					battle--; }
							}
						}
						}
				} else {
					if (areaup == 1) {
				rand = (int)(10.0 * Math.random()) + 1;
				if (rand >= 8) {
				System.out.println("                                   `           ");
				System.out.println("                                 `+s`          ");
				System.out.println("                              `:+s+:+:`        ");
				System.out.println("                           -+sys++/:--+/:`     ");
				System.out.println("                         /yho+++///++/-:+o+.   ");
				System.out.println("                       `yys/yN-+/+:sy-+///+o/  ");
				System.out.println("                       oo.-+///+///os:/-`.:+s: ");
				System.out.println("                       sho+hdysoooooyho:--/os/ ");
				System.out.println("                       .hdyshmhysoooyy++++osy` ");
				System.out.println("                        `odhysssoooo++oosyy+`  ");
				System.out.println("                          `:+shhhyyyyhhs+:`    ");
				System.out.println("                                `....`         ");
				System.out.println("A wild slime appears!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					slimehp = 5;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + slimehp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the slime with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand gets into the monster's eyes and it loses a turn.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						slimehp = slimehp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					slimehp = (slimehp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through your weapon and causes 2 points of damage");
					slimehp = slimehp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (slimehp <= 0) {
					System.out.println("Your party defeated the slime!");
					System.out.println("You gained 150 exp and 80 gold.");
					exp = exp + 150;
					tonext = tonext - 150;
					gold = gold + 80;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					slimehp = 5; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The slime makes its move!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was blinded.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The slime attacks " + name + "!");
					HP = HP - slimeatk;
					System.out.println("It caused " + slimeatk + " point of damage.");
					battle--;
					} else {
					System.out.println("The slime stares off into the distance.");
					battle--; }
							}
						}
						}
				} else if (rand == 7) {
				System.out.println("                                 :o-      ");
				System.out.println("                              .:dNNy      ");
				System.out.println("                            .mNNNNNd/     ");
				System.out.println("                            hNNNNNNNN`    ");
				System.out.println("                           sd-NNNNy+m+    ");
				System.out.println("                         `yd`:NNNN. +N`   ");
				System.out.println("                         ho  hNNNN+  yo   ");
				System.out.println("                        `h-  NNmmNh  :m   ");
				System.out.println("                            .NN::NN  `+   ");
				System.out.println("                            +Nd `NN.      ");
				System.out.println("                            sNs  hN+      ");
				System.out.println("                            +Ny  :Ny      ");
				System.out.println("                            /N+  `mm      ");
				System.out.println("                            yN:   +N`     ");
				System.out.println("                          odys.   +N.     ");
				System.out.println("                                   `      ");
				System.out.println("A wild zombie attacks!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					zombiehp = 7;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + zombiehp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the zombie with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand gets into the monster's eyes and it loses a turn.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						zombiehp = zombiehp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					zombiehp = (zombiehp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through your weapon and causes 2 points of damage");
					zombiehp = zombiehp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (zombiehp <= 0) {
					System.out.println("Your party defeated the zombie!");
					System.out.println("You gained 250 exp and 300 gold.");
					gold = gold + 300;
					exp = exp + 250;
					tonext = tonext - 250;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					zombiehp = 7; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The zombie makes its move!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was blinded.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The zombie bites " + name + "!");
					HP = HP - zombieatk;
					System.out.println("It caused " + zombieatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The Zombie makes a strange gurgling noise.");
					battle--; }
							}
							}
							}
						}
					} else if (areaup == 2) {
				rand = (int)(10.0 * Math.random()) + 1;
				if (rand >= 9) {
				System.out.println("                            -/syhhys+/.      ");
				System.out.println("                         -smMMMMMMMMMMMd+`   ");
				System.out.println("                        :NMMMMMMMMMMMMMMMm-  ");
				System.out.println("                       -NNdyssyssssyssymMMd` ");
				System.out.println("                       hm-             :mMM: ");
				System.out.println("                       mm              -hMM: ");
				System.out.println("                      `dm`         `..`-yMMs:");
				System.out.println("                      /so /oss.  .ossoso-dmo/");
				System.out.println("                      :/y``...`  -``...-.hNo-");
				System.out.println("                       :y    `   -``   `:dd/.");
				System.out.println("                       /m` :+/o++yho-..-+Mm: ");
				System.out.println("                       `yd:yhyhyhyddyd-yNMo  ");
				System.out.println("                        `oNhd///+++ssmdMm/   ");
				System.out.println("                          -omNh+ssydNMd+`    ");
				System.out.println("                             -oyddhs/`       ");
				System.out.println("HI, BILLY MAYS HERE!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					billyhp = 9;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + billyhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You assault the man with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand gets into his eyes, and he advertises it.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						billyhp = billyhp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					billyhp = (billyhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through your weapon and causes 2 points of damage");
					billyhp = billyhp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape, but the mighty putty was too strong.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (billyhp <= 0) {
					System.out.println("Your party defeated Billy Mays!");
					System.out.println("You gained 500 exp and 150 gold.");
					exp = exp + 500;
					tonext = tonext - 500;
					gold = gold + 150;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					billyhp = 9; }

				if (battle == 1) {
					System.out.println();
					System.out.println("Billy Mays makes his move!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But he was selling sand.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("Billy Mays shows off products!");
					HP = HP - billyatk;
					System.out.println("It caused " + billyatk + " points of damage.");
					battle--;
					} else {
					System.out.println("Billy Mays was playing with Mighty Putty.");
					battle--; }
							}
						}
						}
				} else if (rand == 7) {
				System.out.println("                                                `yds+:` ");
				System.out.println("                                               -dMMNNNm/");
				System.out.println("                                           `./hMNy:``   ");
				System.out.println("                                      ``./ydMMMh-       ");
				System.out.println("                                  `-/shmMMMMMNs`        ");
				System.out.println("                         `-:.  `-/dMMMMMMMMMd:          ");
				System.out.println("                    `    y- ` .hMMMMMMMMMMmo`           ");
				System.out.println("                   -+   `d+-:omMMMNdNNdho:`             ");
				System.out.println("                   `so++osmNMMMMMmo+:.`                 ");
				System.out.println("                     -oyhhddNMMNo.                      ");
				System.out.println("                `.:+so/:shdmymd.                        ");
				System.out.println("                .::.``sy+h+.-N`                         ");
				System.out.println("                     oo-m-  `y/.                        ");
				System.out.println("                    -: .o      `                        ");
				System.out.println("A rampaging squid attacks!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					squidhp = 13;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + squidhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the squid with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand gets into the monster's eyes and it loses a turn.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						squidhp = squidhp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					squidhp = (squidhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 2 points of damage");
					squidhp = squidhp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (squidhp <= 0) {
					System.out.println("Your party defeated the squid!");
					System.out.println("You gained 350 exp and 190 gold.");
					gold = gold + 190;
					exp = exp + 350;
					tonext = tonext - 350;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					squidhp = 13; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The squid makes its move!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was blinded.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 2) {
					System.out.println("The squid shoots ink!");
					HP = HP - squidatk;
					System.out.println("It causes " + squidatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The squid begins to flop around.");
					battle--; }
							}
							}
							}
						}
					} else if (areaup == 3) {
				rand = (int)(10.0 * Math.random()) + 1;
				if (rand >= 8) {
				System.out.println("                           ./--`             ");
				System.out.println("                           :+oo.             ");
				System.out.println("                         ``-/+---`           ");
				System.out.println("                       `.:/+++ohy/`         ");
				System.out.println("                     `.```://s+o+-.        ");
				System.out.println("                   .:-----++:y://.-          ");
				System.out.println("                          .--o:::./.         ");
				System.out.println("                          `:/sys/``--        ");
				System.out.println("                          .::+://-  ./.`     ");
				System.out.println("                          `.   `-    :/.     ");
				System.out.println("                           .   :`     ``     ");
				System.out.println("                          .+. :+.            ");
				System.out.println("                          :+` :s`            ");
				System.out.println("                          /.  :+`            ");
				System.out.println("                         .:  `:-`            ");
				System.out.println("                         /.  -:`             ");
				System.out.println("                        :-    .-.            ");
				System.out.println("A wild skeleton appears!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					skeletonhp = 14;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + skeletonhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the skeleton with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand kind of hits the bones. That was probably a bad idea.");
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to become buried under the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						skeletonhp = skeletonhp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					skeletonhp = (skeletonhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 2 points of damage");
					skeletonhp = skeletonhp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (skeletonhp <= 0) {
					System.out.println("Your party defeated the skeleton!");
					System.out.println("You gained 400 exp and 300 gold.");
					exp = exp + 400;
					tonext = tonext - 400;
					gold = gold + 300;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					skeletonhp = 14; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The skeleton makes its move!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was blinded.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The skeleton attacks " + name + "!");
					HP = HP - skeletonatk;
					System.out.println("It caused " + skeletonatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The skelton winds up for a punch.");
					battle--; }
							}
						}
						}
				} else if (rand == 7 || rand == 6) {
				System.out.println("                             .+oo/`           ");
				System.out.println("                            `oy+ohy.          ");
				System.out.println("                             syssyh-          ");
				System.out.println("                           ` syo/sh/--.`      ");
				System.out.println("                        ./ooyyyysyyyyyys/     ");
				System.out.println("                       `so++sssosoooo+syh.    ");
				System.out.println("                        sso////////++:/ss`    ");
				System.out.println("                        ++/ /+++++++s: :o:    ");
				System.out.println("                        oo  /yyyyyhhh+  /o.   ");
				System.out.println("                       -+:  `oysoossy.   ++   ");
				System.out.println("                       :o`   :soo/sos`   -o-  ");
				System.out.println("                      `+s`   `so+ s+s    `:.  ");
				System.out.println("                       ..     os- /o/         ");
				System.out.println("                              /o` `o+         ");
				System.out.println("                             :++- .so+:       ");
				System.out.println("                            .://`  .+o+-      ");
				System.out.println("A wild robot come out of nowhere!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					robothp = 30;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + robothp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the machine with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand starts to fry the robots circuts.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						robothp = robothp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					robothp = (robothp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 3 points of damage");
					robothp = robothp - 3; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (robothp <= 0) {
					System.out.println("Your party defeated the robot!");
					System.out.println("You gained 1000 exp and 700 gold.");
					gold = gold + 700;
					exp = exp + 1000;
					tonext = tonext - 1000;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					robothp = 30; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The robot edges towards " + name + "!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was recharging.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The robot fires a burst of electricity at " + name + "!");
					HP = HP - robotatk;
					System.out.println("It caused " + robotatk + " points of damage.");
					battle--;
					} else {
					HP = HP - 3;
					System.out.println("The machine fires a burst of steam causing 3 points of damage.");
					battle--; }
							}
							}
							}
						}
					} else if (areaup == 4) {
				rand = (int)(10.0 * Math.random()) + 1;
				if (rand >= 8) {
				System.out.println("                     ``-:////////::--:-`     ");
				System.out.println("                  `/:-:::----....:--. .o-    ");
				System.out.println("                 `+- `-....  `.-/++-.`  o-   ");
				System.out.println("                -o+-../osso. :s++yss:::::+/- ");
				System.out.println("                o+--o/:.-+: `.:- .--/+oo-s`o-");
				System.out.println("                `s::N+--/+:.:/+o://ss/s/.//o`");
				System.out.println("                 `o+mdsy+ys+y//syooyss- `o-  ");
				System.out.println("                 `o-mmNddddyho/-y::+/` -+`   ");
				System.out.println("                 :/ -os+s/s:++:/o//:++/-`    ");
				System.out.println("                 +-``--.......--///:.`       ");
				System.out.println("                 `/::-..-::://:-`            ");
				System.out.println("                    `...`                    ");
				System.out.println("A wild Troll appears!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					trollhp = 35;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + trollhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the internet troll with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("It deflects your sand with it's loopy schloopy arms.");
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						trollhp = trollhp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					trollhp = (trollhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 2 points of damage");
					trollhp = trollhp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (trollhp <= 0) {
					System.out.println("Your party defeated the troll!");
					System.out.println("You gained 1200 exp and 1 gold.");
					exp = exp + 1200;
					tonext = tonext - 1200;
					gold = gold + 1;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					trollhp = 35; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The troll makes its move!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was blinded.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The troll spams UMAD in the chat!");
					HP = HP - trollatk;
					System.out.println("It caused " + trollatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The troll was doing science.");
					battle--; }
							}
						}
						}
				} else if (rand == 7 || rand == 6) {
				System.out.println("                     -o`                      ");
				System.out.println("                      -ms.     .::.           ");
				System.out.println("                    `+dNNM-   sMMMMh          ");
				System.out.println("                  /hNMh--:-` .MMMMMM:         ");
				System.out.println("                :hMMMd     .`.NMMMNM:         ");
				System.out.println("                mMMMMdy:.`  `+dMMMMM/         ");
				System.out.println("                hMMMMMMMNdhhhNMMMMMMNy/::.    ");
				System.out.println("                `:hMMMMMMMMMMMMMMMMMMMMMMm:   ");
				System.out.println("                   :hNMMMMMMMMMMMMMMMMMMMMN-  ");
				System.out.println("                     .:ohMMMMMMMMMMMMMMMMMMN/ ");
				System.out.println("                         sMMMMMMMMMMMMMMmMMMd ");
				System.out.println("                         -MMMMMMMMMMMMMo.dMMMo");
				System.out.println("                         `MMMMMMMMMMMMM: +MMMs");
				System.out.println("                         `dMMMMMMMMMMMN+/`oMm`");
				System.out.println("                       `/sNMMMMMMMMMMMo :hNM- ");
				System.out.println("                      /NMMMMMMMMMMMMMMds :dy  ");
				System.out.println("                     :mMMMMMMMMMMMMMMMMMm+ +- ");
				System.out.println("OH CRAP IT'S A NINJA DO SOMETHING HOLY CRAP!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					ninjahp = 40;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + ninjahp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the assassin with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The ninja gets some of the sand in his eyes.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The monster begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						ninjahp = ninjahp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					ninjahp = (ninjahp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 3 points of damage");
					ninjahp = ninjahp - 3; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (ninjahp <= 0) {
					System.out.println("Your party defeated the ninja!");
					System.out.println("You gained 1800 exp and 700 gold.");
					gold = gold + 700;
					exp = exp + 1800;
					tonext = tonext - 1800;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					ninjahp = 40; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The ninja was sneaking towards " + name + ".");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But he was blinded.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The ninja slashes a sword at " + name + "!");
					HP = HP - ninjaatk;
					System.out.println("It caused " + ninjaatk + " points of damage.");
					battle--;
					} else {
					System.out.println("But he was placing caltrops.");
					battle--; }
							}
							}
							}
						}
					} else if (areaup == 5) {
				rand = (int)(10.0 * Math.random()) + 1;
				if (rand >= 8) {
				System.out.println("                                 `..`            ");
				System.out.println("                               -smmmmy`          ");
				System.out.println("                              .dmhhshs`          ");
				System.out.println("                                :/:-/:           ");
				System.out.println("                           `    `+/+//.          ");
				System.out.println("                           ```.:/oo/::://:-`     ");
				System.out.println("                           -:/+///////////++/`   ");
				System.out.println("                           +++o+++++++++++++o+.  ");
				System.out.println("                          -++++so+++++++o:.:+oo- ");
				System.out.println("                          /++/:o/////////   -/++ ");
				System.out.println("                          `--`.+o++++++o-  -oo:  ");
				System.out.println("                              -o++/////-.``/:`   ");
				System.out.println("                              /o+///++:..``      ");
				System.out.println("                             :osssyhhhhdd        ");
				System.out.println("                             +NmmmNNNNNNN`       ");
				System.out.println("                            `dNNNNNNNNNNN.       ");
				System.out.println("A rogue frenchman attacks!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					frenchhp = 43;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + frenchhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the frenchman with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand gets into his baguette and he eats it.");
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The man begins to drown in the quicksand.");
						System.out.println("As a result, it does 20 points of damage.");
						frenchhp = frenchhp - 20;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					frenchhp = (frenchhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 2 points of damage");
					frenchhp = frenchhp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (frenchhp <= 0) {
					System.out.println("Your party defeated the wild frenchman!");
					System.out.println("You gained 7500 exp and 90 gold.");
					exp = exp + 7500;
					tonext = tonext - 7500;
					gold = gold + 90;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					frenchhp = 43; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The frenchman goes to attack!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But he was choking on sand.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The frenchman swings a baguette at " + name + "!");
					HP = HP - frenchatk;
					System.out.println("It caused " + frenchatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The frenchman was smoking a rather thin cigarette.");
					battle--; }
							}
						}
						}
				} else if (rand == 7 || rand == 6) {
				System.out.println("                         :         ");
				System.out.println("                        /+       ``");
				System.out.println("                ..     -so     -/- ");
				System.out.println("                `s-    oos.  .os`  ");
				System.out.println("                `ss:  -s+s+ :ss:   ");
				System.out.println("                -sss- oo+ss+sos.   ");
				System.out.println("                +soss:s++osso+s/   ");
				System.out.println("               -sso+sso//+so++ss.  ");
				System.out.println("               oss+/+s+::+++/+oss. ");
				System.out.println("               sso+:-/+:::+::++ss/ ");
				System.out.println("               /s++:..::--:--/++s: ");
				System.out.println("                +o+:.``...-`.:/+o` ");
				System.out.println("                 :oo/-.``````:+:`  ");
				System.out.println("                    `....`....     ");
				System.out.println("Suddenly a small fire breaks out in front of you.");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:fire");
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the fire with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("You throw a handful of sand onto the fire.");
						System.out.println("Unsuprisingly, the flames go down to almost nothing.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The fire goes down so much, it turns into just smoldering ashes.");
						monstatus = "blind";
						blindturn = 30;
						equip = "nothing";
					} else {
					System.out.println("You swung towards the fire, but it was fire so you were burned.");
					HP = HP - 3;
					System.out.println("It caused 3 points of damage.");
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (battle == 1) {
					System.out.println();
					System.out.println("The fire burned " + name + " with its flames.");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was almost out anyways.");
						blindturn--;
						battle--;
					} else {
					HP = HP - 5;
					System.out.println("It caused 5 points of damage.");
					battle--;
							}
							}
							}
						}
				} else if (areaup == 6) {
				rand = (int)(100.0 * Math.random()) + 1;
				if (rand <= 10) {
				System.out.println();
				System.out.println();
				System.out.println("             `----.`                                       ");
				System.out.println("            :oyyyyhy+:.`                      `````//`     ");
				System.out.println("            o+o/+oydhhyso+/::------...--://++osyyhhdd+     ");
				System.out.println("            `+o+//o++oydhhhyhhhhhhhhhhhhhyyyhdhddmmmd/     ");
				System.out.println("              ./+ooo+/+y/osoy+ossyhoyyhdsossyyshhhhs-      ");
				System.out.println("                `.:+ossyssssyooosyysssyyyyyyyyso/-`        ");
				System.out.println("                    ``..-:/++ooo+++ooo++/:-.```            ");
				System.out.println();
				System.out.println();
				System.out.println("AN ALL BEEF SAUSAGE DESCENDS FROM THE CLOUDS. DO SOMETHING.");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					sausagehp = 60;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + sausagehp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the Sausage with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand was actually seasoning, which caused it to become delicious.");
						blindturn = 4;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The sausage becomes engulfed by the quicksand.");
						System.out.println("As a result, it does 40 points of damage.");
						sausagehp = sausagehp - 40;
						monstatus = "blind";
						blindturn = 4;
						equip = "nothing";
					} else {
					sausagehp = (sausagehp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 2 points of damage");
					sausagehp = sausagehp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (sausagehp <= 0) {
					System.out.println("Your party defeated the rampaging sausage!");
					System.out.println("You gained 10000 exp and 200 gold.");
					exp = exp + 10000;
					tonext = tonext - 10000;
					gold = gold + 200;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					sausagehp = 60; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The sausage tries to hit!");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was amazingly delicious.");
						blindturn--;
						battle--;
					} else {
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 3) {
					System.out.println("The sausage flops at " + name + "!");
					HP = HP - sausageatk;
					System.out.println("It caused " + sausageatk + " points of damage.");
					battle--;
					} else {
					System.out.println("The sausage was frying loudly..");
					battle--; }
							}
						}
						}
				} else if (rand > 10 && rand < 14) {
				System.out.println("                                             `://++oyy");
				System.out.println("                                        `.:+syssssyyh`");
				System.out.println("                          `-/+ossyyysooyyysyysssoyhd: ");
				System.out.println("                       .oyddhysssssyhdNMmdmmmhssyho.  ");
				System.out.println("                     .sdhysoo+++++ooosshmMMmhsyy/`    ");
				System.out.println("                    /dhso+++/////++++++oydhyyy/`      ");
				System.out.println("                   /myo++/////////////oyyshy:`        ");
				System.out.println("                   myo+/////////:::/ossoosd-          ");
				System.out.println("                   mso+//////::::+oso+++osm`          ");
				System.out.println("                 ./hso++//::::+oso++//++oho           ");
				System.out.println("               .+yyyds+////+sso++////++sho            ");
				System.out.println("             -oyyydNMNhssysoo+/////+oshy-             ");
				System.out.println("           :yhysydmmdhyyyyso++++ossso/.               ");
				System.out.println("         /hdhsssssssyyo/.`-:////:-``                  ");
				System.out.println("         dhyhsssyyo/-`                                ");
				System.out.println("         ydyo+/-`                                     ");
				System.out.println("NOPE OH CRAP IT'S SATURN RUNRUNRUNRUNRUNRUNRUNRUNRUN");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					saturnhp = 10000;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + saturnhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the planet with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("The sand did literally nothing, it's a planet.");
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The planet becomes one with the quicksand.");
						System.out.println("It begins an amazing transformation sequence.");
						System.out.println("YOU HAVE CREATED PLANET MASTER QUICKSANDO.");
						System.out.println("QUICKSANDO HP RAISES TO 25000");
						saturnhp = 25000;
						equip = "nothing";
					} else {
					saturnhp = (saturnhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 2 points of damage");
					saturnhp = saturnhp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					System.out.println("But how would you even manage to run from a planet.");
					battle++;
				} else {
					System.out.println("But nothing happened."); }

				if (saturnhp <= 0) {
					System.out.println("You actuallY defeated a planet!");
					System.out.println("You gained 10000000 exp and 1555515 gold.");
					exp = exp + 10000000;
					tonext = tonext - 10000000;
					gold = gold + 1555515;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					saturnhp = 10000; }

				if (battle == 1) {
					System.out.println();
					System.out.println("The planet is entering the atmosphere!");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 2) {
					System.out.println("The planet crashes down on " + name + "!");
					HP = HP - saturnatk;
					System.out.println("It caused " + saturnatk + " points of damage!");
					battle--;
					} else {
					System.out.println("The planet begins to burn up due to the intense heat.");
					battle--; }
							}
							}
					} else if (rand > 13 && rand < 37) {
				System.out.println("                                  .ssyo:                 ");
				System.out.println("                             ``  .++yoo:                 ");
				System.out.println("                         /:///++/+o+o++.``               ");
				System.out.println("                        `:/:.oshssysyddhhy++.---.` ````.`");
				System.out.println("                           `.hdddhyhdmmdhddyyyyyy+::-::-`");
				System.out.println("                          ///dhhdhdddyo----.h+--...```   ");
				System.out.println("                          .+sy+ohhhh-       /            ");
				System.out.println("                        `.+hddhhhddh:.`                  ");
				System.out.println("                       -ooyhdmhhdddhyhyo-                ");
				System.out.println("                     `/hhddyo-`.-sddhsydh/`              ");
				System.out.println("                    ./shhs-`      ./oohdhyo`             ");
				System.out.println("                    -oos+`            +yso:              ");
				System.out.println("                   `/ys.               +ss`              ");
				System.out.println("                 -:+oyy`              .syo+-.            ");
				System.out.println("                 o/oo.`               `::/+//`           ");
				System.out.println("Suddenly Captain Falcon busts through the roof!");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					falconhp = 75;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:" + falconhp);
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the racer with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("He is protected from the sand by his visor.");
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The quicksand absorbs him, and fills his organs with quicksand.");
						System.out.println("It caused -2 HP");
						falconhp = falconhp - 2;
						equip = "nothing";
					} else {
					falconhp = (falconhp - baseatk) - atk;
					System.out.println("You did " + (baseatk + atk) + " points of damage.");
					if (status.equals("Electric blood")) {
					System.out.println("Electricity moves through you weapon and causes 2 points of damage");
					falconhp = falconhp - 2; }
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (falconhp <= 0) {
					System.out.println("You defeated Captain Falcon!");
					System.out.println("You gained 10000 exp and 6000 gold.");
					exp = exp + 10000;
					tonext = tonext - 10000;
					gold = gold + 6000;
					battle = 0;
					loop2 = false;
					monstatus = "healthy";
					blindturn = 0;
					falconhp = 75; }

				if (battle == 1) {
					System.out.println();
					System.out.println("He's winding up for a punch,");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 8) {
					System.out.println("SMAAAAAAASH!");
					System.out.println("You get hit by a Falcon Punch");
					HP = HP - falconatk;
					System.out.println("It caused " + falconatk + " points of damage!");
					battle--;
					} else {
					System.out.println("He swings and misses.");
					battle--; }
							}
							}
				} else if (rand == 7 || rand == 6) {
				System.out.println("                         :         ");
				System.out.println("                        /+       ``");
				System.out.println("                ..     -so     -/- ");
				System.out.println("                `s-    oos.  .os`  ");
				System.out.println("                `ss:  -s+s+ :ss:   ");
				System.out.println("                -sss- oo+ss+sos.   ");
				System.out.println("                +soss:s++osso+s/   ");
				System.out.println("               -sso+sso//+so++ss.  ");
				System.out.println("               oss+/+s+::+++/+oss. ");
				System.out.println("               sso+:-/+:::+::++ss/ ");
				System.out.println("               /s++:..::--:--/++s: ");
				System.out.println("                +o+:.``...-`.:/+o` ");
				System.out.println("                 :oo/-.``````:+:`  ");
				System.out.println("                    `....`....     ");
				System.out.println("Suddenly a small fire breaks out in front of you.");
				loop2 = true;
				while (loop2==true) {

				if (HP <= 0) {
					System.out.println();
					System.out.println("Your party has been defeated.");
					loop5 = true;
					while (loop5==true) {
					System.out.println("What do you want to do?");
					System.out.println("1. retry battle");
					System.out.println("2. End game");
					inData = inputs.readLine();
					selection = inData;

					if (selection.equals("1")) {
					battle = 0;
					HP = baseHP; 
					loop5 = false;

					} else if (selection.equals("2")) {
					System.exit(0);
					
					} else {
					System.out.println("You have to pick one or the other.");
					System.out.println(); }
					}
					
					}

				System.out.println("What do you do?");
				System.out.println("                         " + name + ":" + HP + "/" + baseHP + "    enemy:fire");
				System.out.println("1. Fight");
				System.out.println("2. Escape");
				inData = inputs.readLine();
				selection = inData;

				if (selection.equals("1")) {
					System.out.println("You attack the fire with your " + equip + ".");
					if (equip.equals("sand")) {
						System.out.println("You throw a handful of sand onto the fire.");
						System.out.println("Unsuprisingly, the flames go down to almost nothing.");
						monstatus = "blind";
						blindturn = 3;
						equip = "nothing";
					} else if (equip.equals("quicksand")) {
						System.out.println("The fire goes down so much, it turns into just smoldering ashes.");
						monstatus = "blind";
						blindturn = 30;
						equip = "nothing";
					} else {
					System.out.println("You swung towards the fire, but it was fire so you were burned.");
					HP = HP - 3;
					System.out.println("It caused 3 points of damage.");
					battle++;
					}

				} else if (selection.equals("2")) {
					System.out.println("You try to escape.......");
					rand = (int)(10.0 * Math.random()) + 1;
					if (rand >= 4) {
					System.out.println("You sucessfully escaped.");
					loop2 = false;
					} else {
					System.out.println("You tried to escape but failed.");
					battle++; }
				} else {
					System.out.println("But nothing happened."); }

				if (battle == 1) {
					System.out.println();
					System.out.println("The fire burned " + name + " with its flames.");
					if (monstatus.equals("blind") && blindturn > 0) {
						System.out.println("But it was almost out anyways.");
						blindturn--;
						battle--;
					} else {
					HP = HP - 5;
					System.out.println("It caused 5 points of damage.");
					battle--;
							}
							}
							}
						}
						}
						}
						}
				}
	}
	}