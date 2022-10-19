/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thequestforemma;

import java.util.Scanner;

/**
 *
 * @author Brown Family
 */
public class TheQuestForEmma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Marmina = new Scanner(System.in);
        Game(Marmina);
    }
    private static void Game(Scanner Marmina) {
        int choice = 0;
        System.out.println("You have been given a quest by the god of creation, Marmina, To find and rescue a girl named Emma Ryans.\n"
        + "You stand at the ruins of a town that marks the last known location of the the girl.\n"
        +"Trees are uprooted,the road is cracked , and houses everywhere are crumbling\n"
        +"As you wander through the town, the ground rumbles and a fissure opens up underneath you and you fall down.\n"
        +"The fissure goes down deep into the earth.\n"
        +"The air suddenly begins to feel hot, even though it is a cold winter night.\n"
        +"The cause of this immediately comes into view around the next corner.\n" 
        +"A fearsome looking Red Dragon sits in the middle of a lava filled cavern, with gold here and there.\n"
        +"A young girl lies unconscious on the ground next to the dragon.\n"
        +"Sensing your presence, it turns and says,'How wonderful! Dinner'\n"
        +"What will you do?\n"
        +"Press 1 to attack the dragon\n"
        +"Press 2 to speak to the dragon\n"
        +"Press 3 to run away");
        choice = Marmina.nextInt();
        if(choice == 1)
        {
            attackDragon(Marmina);
        }
       if(choice == 2)
        {
            talkDragon(Marmina);
        }
        if(choice == 3)
        {
            runDragon(Marmina);
        }
    }
    private static void attackDragon(Scanner Marmina) {
        int choice = 0;
        System.out.println("You attack the Dragon!.\n"//level 1
        +"Your attack doesn’t seem to do much damage.\n"
        +"The dragon spreads its wings and takes off from the ground.\n"
        +"What will you do?\n"
        +"Press 1 to cast a spell\n"
        +"Press 2 to Defend yourself\n"
        +"Press 3 to open your invetory");
        choice = Marmina.nextInt();
            switch(choice){
                case 1://level2
                System.out.println("You decide to cast a spell so you open your spellbook. You have 3 spells that may help you defeat the dragon. Which spell will you cast?\n"
                + "Press 1 for Lightning Bolt\n"
                + "Press 2 for Fireball\n"
                + "Press 3 for cone of cold");
                    choice = Marmina.nextInt();
                    switch(choice){
                        case 1://level3
                            System.out.println("You summon all the storm inside and release it as a bolt of lightning that seems to deal a huge amount of damage\n"
                            +"The dragon crumbles to the floor, seeming to be dead. But as you move over it rises up and breaths out a jet of fire!\n"
                            +"What will you do?\n"
                            +"Press 1 to Dodge out of the way and stab it in the head\n"
                            +"Press 2 to hurl another lightning bolt in his mouth\n"
                            +"Press 3 to stand your ground");
                            choice = Marmina.nextInt();
                            switch(choice){
                                case 1://level4
                                     System.out.println("You dodge a quick as lightning and stab the dragon in the head.\n"
                                    +"The fire disappears and the dragon falls dead on the ground.\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'To dodge a dragons breath takes skill.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"Press 4 to quit");
                                     choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 2://level 4
                                    System.out.println("Seeing your life flash before your eyes, you quickly hurl another lightning bolt in the dragons mouth..\n"
                                    +"As the dragon closes its mouth, It explodes in a burst of Thunder and light.\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'I haven't seen a lightning bolt that strong in my entire life!Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"Press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 3://level4
                                    System.out.println("You stand your ground, and watch as the dragon collapses in exaustion.\n"
                                    +"Life fades from its eyes. The dragon is dead\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'Your courage is incredible.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"Press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break; 
                            }
                        break;
                        case 2://level3
                            System.out.println("You pull out a tiny ball of sulfur from your adventure pouch and throw it at the dragon.\n"
                            +"Instantly, the sulfur becomes a ball of fire that hits the dragon in the head.\n"
                            +"It reels in pain but turns back towards you and prepares to bite you with its fangs! What will you do?\n"
                            +"Press 1 to swing your sword upwards\n"
                            +"Press 2 to dodge out of the way\n"
                            +"Press 3 to block with your shield");
                            choice = Marmina.nextInt();
                            switch(choice){
                                case 1://level4
                                    System.out.println("You swing your sword updwards and slice the dragons head in two.\n"
                                    +"It gives a week roar and then in a bloody heap collapses.\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You have marvelous strength.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 2://level4
                                    System.out.println("You dodge out of the way as the dragon gives a shriek of pain.\n"
                                    +"Its flesh begins to dissolve and the dragon crumbles.\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'That fire must have been 1000 degrees.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 3://level4
                                    System.out.println("You bring your shield up and push it into the dragons face.\n"
                                    +"Your push knocks the beast over and it falls into the lava. It is now dead\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You pushed it away with just a shield.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                            }
                        break;
                        case 3://level 3
                            System.out.println("You put your hands together and make a triangle facing the dragon.\n"
                            +"Cold air shoots out from the triangle in a cone shape and strikes it in the face.\n"
                            +"The dragon becomes frozen in place, THIS IS YOUR CHANCE! What will you do?\n"
                            +"Press 1 to Leap up and stab the dragon in the head\n"
                            +"Press 2 to fire an arrow at its neck\n"
                            +"Press 3 to cast a fireball to melt the dragon");
                            choice = Marmina.nextInt();
                            switch(choice){
                                case 1://level4
                                    System.out.println("You leap up 50ft and stab the beast.\n"
                                    +"As You draw your blade back up, the dragon roars and falls to the ground\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You leaped like a cat.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 2://level4
                                    System.out.println("You fire an arrow at the neck. It pierces deep in the dragons scales \n"
                                    +"The dragon falls over in a heap gasping for breath\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'Your aim was spot on.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 3://level4
                                    System.out.println("You hurl a fireball at the frozen dragon.\n"
                                    +"As it hits, the dragon melts into a puddle of water.\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You melted it completly.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break; 
                            }
                        break;
                    }
                break;
                case 2://level2
                System.out.println("You decide to defend yourself against the dragons attack.How will you defend yourself?\n"
                + "Press 1 to dodge out of the way\n"
                + "Press 2 to block with your shield\n"
                + "Press 3 to slide underneath the dragon");
                    choice = Marmina.nextInt();
                        switch(choice){
                        case 1://level3
                            System.out.println("You recall that dragons are slow and can't react to change easily.\n"
                            +"So You wait for the dragon to strike then dodge out of the way\n"
                            +"You see an opening to attack its neck,which is the most vulnurable spot! What will you do?\n"
                            +"Press 1 to take the oppertunity\n"
                            +"Press 2 to ignore the opening pass and aim for the head \n"
                            +"Press 3 to leap up onto the dragons back and stab it");
                            choice = Marmina.nextInt();
                            switch(choice){
                                case 1://level4
                                    System.out.println("You Rush in and strike the dragon in the neck.\n"
                                    +"Your blow is so strong that the head is cut free. The dragon falls in a heap\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You knew exactly where to attack the dragon.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 2://level4
                                    System.out.println("You aim for the head and you aim true.\n"
                                    +"You hit with enough force to slice its head clean off. There isn't even any blood on your blade\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'That was the cleanest strike I've ever seen.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 3://level4
                                    System.out.println("You leap up and bring your blade down on the dragon with all the force you can muster.\n"
                                    +"The air itself is slices as the dragon is split in two pieces\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You sliced it clean in two.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;  
                            }
                        break;
                        case 2://level3
                            System.out.println("You raise your shield and parry the dragon out of the way.\n"
                            +"It reels in pain\n"
                            +"You see an opening to attack! What will you do?\n"
                            +"Press 1 to slice the head off\n"
                            +"Press 2 to stab your blade in the dragons neck\n"
                            +"Press 3 to throw your blade in its mouth"); 
                            choice = Marmina.nextInt();
                            switch(choice){
                                case 1://level4
                                    System.out.println("You slice upwards and cut the dragons head off.\n"
                                    +"Your push knocks the beast over and it falls into the lava. It is now dead\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You pushed it away with just a shield.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 2://level4
                                    System.out.println("You stab your blade into the dragons exposed neck.\n"
                                    +"Your push knocks the beast over and it falls into the lava. It is now dead\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You pushed it away with just a shield.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 3://level4
                                    System.out.println("You throw your sword into the dragons mouth.\n"
                                    +"Your throw is so powerful, the blade pins the dragon to the wall. It struggles a bit and then gives up the ghost\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'That blade went over 500 miles per hour.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;  
                            }
                        break;
                        case 3://level3
                            System.out.println("You slide under the dragon. You recall the neck is the weakest spot\n"
                            +"You see an opening to attack! What will you do?\n"
                            +"Press 1 to slice the neck\n"
                            +"Press 2 to hurl a lightning bolt \n"
                            +"Press 3 to stab its stomach");
                            choice = Marmina.nextInt();
                            switch(choice){
                                case 1://level4
                                    System.out.println("You slice at the neck .\n"
                                    +"As you slide out from under the dragon, It falls in a jumbled heap\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You went for a quick and easy kill.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 2://level4
                                    System.out.println("You hurl a magical bolt of lightning at the exposed underside.\n"
                                    +"The electricity surges up in the dragon, as the beast explodes.\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'There's nothing left of the beast.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 3://level4
                                    System.out.println("You stab and cut into the stomach.\n"
                                    +"The dragon begins to convulse and vomits its blood before collapsing\n"
                                    +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You stabed clean through its scales.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                            }
                        break;
                    }
                break;
                case 3://level2
                 System.out.println("You open your invetory. inside are a few magic items you have in your possesion. What will you use?\n"
                + "Press 1 to put on a ring of flying\n"
                + "Press 2 for a dragonslayer longsword\n"
                + "Press 3 for a staff of power");
                    choice = Marmina.nextInt();
                    switch(choice){
                        case 1://level3
                            System.out.println("You put on the ring of flying and take off into the air\n"
                            +"The dragon's face takes on a look of horror!\n"
                            +"What will you do?\n"
                            +"Press 1 to grab its tail\n"
                            +"Press 2 to kick it in the face\n"
                            +"Press 3 to throw your sword in its mouth");
                            choice = Marmina.nextInt();
                            switch(choice){
                                case 1://level4
                                    System.out.println("You grab its tail and swing the dragon around.\n"
                                    +"When you release the tail, the beast is sent flying and it falls into the lava. It is now dead\n"
                                    +"As you return to the ground,You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You pushed it away with just a shield.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 2://level4
                                    System.out.println("You kick the dragon in the face.\n"
                                    +"When you release the tail, the beast is sent flying and it falls into the lava. It is now dead\n"
                                    +"As you return to the ground,You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You pushed it away with just a shield.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 3://level4
                                    System.out.println("You grab its tail and swing the dragon around.\n"
                                    +"When you release the tail, the beast is sent flying and it falls into the lava. It is now dead\n"
                                    +"As you return to the ground,You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You pushed it away with just a shield.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                            }
                        break;
                        case 2://level3
                            System.out.println("You grab the Longsword and you feel a burst of power in you\n"
                            +"The dragon angrily turns to face you\n"
                            +"What will you do?\n"
                            +"Press 1 to stab it in the head\n"
                            +"Press 2 to slice its neck\n"
                            +"Press 3 to cut off its tail");
                            choice = Marmina.nextInt();
                            switch(choice){
                                case 1://level4
                                    System.out.println("As the dragon turns to face you, you take the sword and stab it in the face .\n"
                                    +"Blood splatters out as the dragon reels in pain and crumples in a heap \n"
                                    +"As you return the sword to its sheave,You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You chose the weapon that is super effective on dragons.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 2://level4
                                    System.out.println("You slice at the neck which is the most vulnurable spot.\n"
                                    +"The dragon struggles for breath as blood squirts out of the cut. It eventually falls lifeless to the ground\n"
                                    +"As you return to the ground,You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You attacked the weakest spot!.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 3://level4
                                    System.out.println("You grab its tail and slice it off in one blow.\n"
                                    +"The dragon reels in pain and trashes around the room. It eventually trips over the edges and falls into the lava\n"
                                    +"As you return to the ground,You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You cut off the tail with so much force.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                            }
                        break;
                        case 3://level3
                            System.out.println("You grab the staff of power\n"
                            +"You feel stronger then ever before. Magic is surging through you!\n"
                            +"What will you do?\n"
                            +"Press 1 to use a power strike\n"
                            +"Press 2 to Cast a magic missile spell\n"
                            +"Press 3 to break the staff with your leg");
                            choice = Marmina.nextInt();
                            switch(choice){
                                case 1://level4
                                    System.out.println("You run at the dragon, leap into the air, and strike the staff into his head .\n"
                                    +"The power surges through the staff and the dragon roars before it is pushed into the wall. Chunks of rubble fall from the ceiling on its head\n"
                                    +"As you return to the ground,You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'That must have done 100 times the power I use.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 2://level4
                                    System.out.println("You summon a huge group of magical darts and send them flying at the dragon.\n"
                                    +"The dragon trys to dodge but it gets hit from every side. As the dust kicked up settles, the dragon is ripped to shreds \n"
                                    +"As you return to the ground,You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You never gave the dragon a chance.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break;
                                case 3://level4
                                    System.out.println("You grab the staff and break it over you leg. Suddenly a burst of light fills the room.\n"
                                    +"When the light clears, you see the dragon is now lying dead on the ground\n"
                                    +"As you return to the ground,You hear a gasp, and turn to find that the girl is awake now.\n"
                                    +"'That was amazing!' she says, 'You knew how to release enough power to defeat the dragon.Did Marmina send you?'"
                                    +"Press 1 to say yes\n"
                                    +"Press 2 to say no\n"
                                    +"Press 3 to say 'what do you think?'\n"
                                    +"press 4 to quit");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            emmaTalk1(Marmina);
                                        break;
                                        case 2:
                                            emmaTalk2(Marmina);
                                        break;
                                        case 3:
                                            emmaTalk3(Marmina);
                                        break;
                                        case 4:
                                            System.out.println("Goodbye.See you later");
                                        break;     
                                    }
                                break; 
                            }
                        break;
                    }
                break; 
            }
    }
    private static void talkDragon(Scanner Marmina) {
        int choice = 0;//level 1
        System.out.println("You ask what the dragon is doing here.\n"
        +"It ponders your question and then responds,'Protecting my treasure from thieves'\n"
        +"'They came here to steal my treasure, as you can see here.'\n"
        +"What will you say next?\n"
        +"Press 1 to ask what the thieves were looking for\n"
        +"Press 2 to ask why the dragon has so much treasure\n"
        +"Press 3 to say that thieves are awful");
        choice = Marmina.nextInt();
            switch(choice){
                case 1://level2
                System.out.println("You Ask the dragon what the thieves were looking for\n"
                       +"They were trying to steal a priceless artifact called a totem of undying\n"
                       +"It is…. Precious to me.It begins to weep.\n"
                       +"It is my last memory of my wife. She died a few years back.\n"
                       +"I was hoping to make a memorial for her with the totem, but then the thieves came.\n"
                       +"You begin to feel sorry for the dragon. You think about something you could do to help him.\n"
                       +"What will you say next?\n"
                       +"Press 1 to offer to help it make a memorial\n"
                       +"Press 2 to say you are sorry for his loss\n"
                       +"Press 3 to ask how he knows the girl is a thief");
                       choice = Marmina.nextInt();
                            switch(choice){
                                case 1: 
                                System.out.println("You tell the dragon that you would be happy to help make a memorial\n"
                                +"'You will?!' it says, its head perking up in amazement\n"
                                +"You nod your head and the dragon begins to sob.\n"
                                +"'Thank you so much' it crys.\n"
                                +"You start to build the monument, you and the dragon.\n"
                                +"The last thing you must do is place the totem.\n"
                                +"Where will you put it?\n"
                                +"Press 1 to put it on the top\n"
                                +"Press 2 to put it on the bottom\n"
                                +"Press 3 to put it in the middle");
                                choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            System.out.println("You place the totem on the top, so everyone can see it..\n"
                                            +"You and the dragon admire your work. Then the dragon turns and exits down another cave\n"
                                            +"As you turn to leave,You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'That is amazing!' she says, 'The totem can now be seen by anyone who looks up.Did Marmina send you?'"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                        break;
                                        case 2:
                                            System.out.println("You place the totem on the bottom, so the dragon can pray at the monument.\n"
                                            +"You and the dragon admire your work. Then the dragon turns and exits down another cave\n"
                                            +"As you turn to leave,You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'That is amazing!' she says, 'It feels so much like a shrine.Did Marmina send you?'"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                        break;
                                        case 3:
                                            System.out.println("You place the totem in the middle which represent the balance of the world.\n"
                                            +"You and the dragon admire your work. Then the dragon turns and exits down another cave\n"
                                            +"As you turn to leave,You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'You are very wise.' she says, 'The balance will be in the mind of the dragon forever now.Did Marmina send you?'"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                        break;
                                    }
                                break;
                                case 2:
                                    System.out.println("You tell the dragon you are sorry for the loss\n"
                                +"'Thank you' it says, turning to you. 'Still i must push through it'\n"
                                +"'If you would accept this' the dragon holds up the said totem, 'It would mean alot to me.\n"
                                +"'You are a kind person, and im certain it would help you very much'.\n"
                                +"What will you do?\n"
                                +"Press 1 to accept it\n"
                                +"Press 2 to decline it\n"
                                +"Press 3 to to accept it and promise to visit");
                                choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            System.out.println("You decide to accept the gift. You feel the power inside rise up in you\n"
                                            +"The dragon smiles, and turns down a cavern to the north\n"
                                            +"As you turn to leave,You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'Did you just negotiate with a dragon?!' she says, 'Did Marmina send you?'"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                        break;
                                        case 2:
                                            System.out.println("You respectfully decline the gift..\n"
                                            +"'I knew it. You have a great sense of respect.' It bows low and leaves\n"
                                            +"As you turn to leave,You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'That was amazing!' she says, 'I've never seen a dragon bow to anyone.Did Marmina send you?'"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                        break;
                                        case 3:
                                            System.out.println("You take the gift, and tell the dragon that you will return to visit it.\n"
                                            +"'You will?' It says,eyes lighting up in happiness, 'Thank you! That means the world'\n"
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                        break;
                                    }
                                break;
                                case 3:
                                    System.out.println("You ask how the dragon knows the girl is a thief\n"
                                +"It sighs ' The truth is she's not a thief, I just jump to conclusions easily'\n"
                                +"You nod your head in understanding.\n"
                                +"'If you would be so kind to help her return to her people, I will be glad to give you something if you ever return.'\n"
                                +"What will you say?\n"
                                +"Press 1 to say it would be your pleasure\n"
                                +"Press 2 to ask what that something would be?\n"
                                +"Press 3 to just nod your head");
                                choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            System.out.println("You say it would be your pleasure.\n"
                                            +"'Thank you! You won't regret it\n"
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'\n"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question\n"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                        break;
                                        case 2:
                                            System.out.println("You ask what that something would be?.\n"
                                            +"'You'll have to wait and see.' The dragon says\n"
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'\n"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                        break;
                                        case 3:
                                            System.out.println("You nod your head in a respectfully manner.\n"
                                            +"The dragon makes a low bow in return."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                        break;}
                                break;  
                            }
                break;
                case 2:
                System.out.println("You ask why the dragon has so much treasure\n"
                + "'Because i am a dragon! Thats what dragons do, get treasure.'\n"
                + "'You are a very kind person, I'll let you have some of the treasure if you take this girl out of here.'\n"
                + "What do you want from the dragon?\n"
                +"Press 1 to ask for some gemstones\n"
                +"Press 2 to ask for a suit of magic armor\n"
                +"Press 3 to ask for an artifact");
                    choice = Marmina.nextInt();
                            switch(choice){
                                case 1:
                                    System.out.println("You ask if you could have a few gemstones\n"
                                    + "'Why certainly! I have all sorts of gems. What type of gems would you like.'\n"
                                    + "You begin to ponder that question. What type of gems do you want?\n"
                                    +"Press 1 to ask for some rubys\n"
                                    +"Press 2 to ask for some emeralds\n"
                                    +"Press 3 to ask for some diamonds");
                                    choice = Marmina.nextInt();
                                        switch(choice){
                                            case 1:
                                                System.out.println("You nod your head in a respectfully manner.\n"
                                            +"The dragon makes a low bow in return."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You nod your head in a respectfully manner.\n"
                                            +"The dragon makes a low bow in return."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You nod your head in a respectfully manner.\n"
                                            +"The dragon makes a low bow in return."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                          
                                break;
                                case 2:
                                    System.out.println("You ask for a suit of magic armor\n"
                                    + "'Coming right up.' the dragon says and begins to rumage through the pile\n"
                                    + "'Any prefrences? Theres a lot in here.'\n"
                                    + "What type of armor do you want?\n"
                                    +"Press 1 for chain mail\n"
                                    +"Press 2 for full plate armor\n"
                                    +"Press 3 for a breastplate");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You nod your head in a respectfully manner.\n"
                                            +"The dragon makes a low bow in return."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You nod your head in a respectfully manner.\n"
                                            +"The dragon makes a low bow in return."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You nod your head in a respectfully manner.\n"
                                            +"The dragon makes a low bow in return."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                break;
                                case 3:
                                    System.out.println("You ask if the dragon has any artifacts\n"
                                    + "'Ahhh. your that type of adventurer. one who seeks rare power that has many secrets'\n"
                                    + "'I have something like that. Its called a totem of undying. However its my most valuable treasure, so i will need something in return.'\n"
                                    + "What will you give the dragon?\n"
                                    +"Press 1 give it a diamond\n"
                                    +"Press 2 to give it your magical staff of power\n"
                                    +"Press 3 to give it your powerful Longsword");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You offer it a bag of diamonds.\n"
                                            +"'This is a fine offering.' The dragon says, as it hands over the totem."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You give the dragon your magical staff.\n"
                                            +"'Incredible, a skilled wizard made this one' the dragon comments as you exchange items."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You offer your magic longsword.\n"
                                            +"'A fine weapon, I will keep it safe' The dragon promises, as you take hold of the totem."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                break; 
                            }
                break;
                case 3:
                 System.out.println("You say 'Thieves are awful'\n"
                + "The dragon gives a chuckle, 'Thieves are only awful if they steal for themselves.\n"
                +"He motions over to the girl, 'This thief was stealing for the greater good, and i was going to let her have what she was looking for\n"
                +"'If you help her get this totem safely delievered' he says pointing to a strange looking totem statue,'I let you have whatever you want from here'"
                +"What will you do?\n"  
                +"press 1 to agree to help"
                + "Press 2 to agree to help but decline the treasure\n"
                + "Press 3 to think about it for a second");
                    choice = Marmina.nextInt();
                            switch(choice){
                                case 1:
                                    System.out.println("You say that you will agree to help\n"
                                    + "'Thank you. Now for your reward.' the dragon says and a bright light engulfs the beast.\n"
                                    + "When it clears, the dragon now looks like  A tall blond haired human.\n"
                                    + "He holds a strange looking totem pole out to you. ' This is a totem of undying. If you fall in battle, it will give you strength to rise up again.'\n"
                                    +"He hands it over to you. Where will you put it?"
                                    +"Press 1 to put it on your armor\n"
                                    +"Press 2 to attach it to your belt\n"
                                    +"Press 3 to put it in your bag for safe keeping");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You put it on your armor. It changes color to blend into your chestplate.\n"
                                            +"'Use it well, and use it wisely.' The man says, as he gives you a low bow."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? Where's that beast? Did Marmina send you?'"
                                            +"The man smiles, 'I'll leave you two to carry out your buisness.' He turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You attach it to your belt, so it will be hidden from those who want to take it.\n"
                                            +"'Its power belongs to you. May it help you defeat all evil forces that come your way.' The man says."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What did you do to the dragon? Did Marmina send you?'"
                                            +"The man smiles, 'I'll leave you two to carry out your buisness.' The man turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You put it in your bag for safekeeping.\n"
                                            +"'Don't let it out of your sight.' The man says, reaching out to shake your hands."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? Is the dragon gone? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                break;
                                case 2:
                                    System.out.println("You agree to help but decline the treasure\n"
                                    + "'A wise human indeed. i will give you a blessing as a gift for your wisdom.'\n"
                                    + "What type of blessing do you want from the dragon?\n"
                                    +"Press 1 for a blessing of health\n"
                                    +"Press 2 for a blessing of magic\n"
                                    +"Press 3 for a blessing of Stamina");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You ask for a blessing of health.\n"
                                            +"'As you wish.' The dragon says, and it summons a huge heart shaped container filled with life. It enters your body. You feel stronger then you did before."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? Why are you next to the dragon? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You ask for a blessing of magic.\n"
                                            +"'Of course.' The dragon says, as it lays a claw gently upon your shoulder. You feel the magic inside you become stronger."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You ask for a blessing of Stamina.\n"
                                            +"'It will be my pleasure.' The dragon says, as it breaths wind in your direction. You feel even more energetic than before."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                break;
                                case 3:
                                    System.out.println("You ask to think about it for a second\n"
                                    + "'You are doubtful.' it comments, then hands you a whistle made of dragon bone\n"
                                    + "'Then let me promise you this. If you need help,blow this and i will come to your aid.'\n"
                                    + "You feel very thankful for the gift and want to give something to the dragon in return. What will you give it?\n"
                                    +"Press 1 to give it a jeweled necklase you found years ago\n"
                                    +"Press 2 to give it a magnifying glass without a handle\n"
                                    +"Press 3 to give it a sparkling stone");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You motion the dragon to come closer, and then put a beautiful jewled necklase around its neck .\n"
                                            +"'Thank you, This will be a perfect way to remember my promise.' The dragon says."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing here? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You give the dragon an old magnifying glass without a handle.\n"
                                            +"'Wonderful.' The dragon says, as it puts it over one of its eyes,'Its been so hard to see out of this eye."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? Why is that on that beast's eye? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You hand the dragon a sparkling stone.\n"
                                            +"'Amazing.' The dragon says as it looks deep into it,'Almost like a galaxy."
                                            +"You hear a gasp, and turn to find that the girl is awake now.\n"
                                            +"'What is happening?' she says, 'Who are you? What are you doing with that beast? Did Marmina send you?'"
                                            +"The dragon smiles, 'I'll leave you two to carry out your buisness.' The dragon turns and leaves.\n"
                                            +"The girl is getting impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                break;   
                            }
                break;
            }
    }
    private static void runDragon(Scanner Marmina) {
        int choice = 0;
        System.out.println("You turn and run away from the dragon.\n"
        +"The dragon spreads its wings and takes off from the ground.\n"
        +"You see 3 caves up ahead, one to the north, one to the east, and one to the west"
        +"What will you do?\n"
        +"Press 1 to go north\n"
        +"Press 2 to go east\n"
        +"Press 3 to go west");
        choice = Marmina.nextInt();
            switch(choice){
                case 1:
                System.out.println("The northern cavern opens up into a huge area the size of 4 football fields.\n"
                +"Stalactites and stalagmites cover the ceiling and floor.\n"
                +"The dragon flies over you and attempts to hit you with its wing.\n"
                +"What will you do?\n"
                + "Press 1 to Dodge to the right\n"
                + "Press 2 to Dodge to the left\n"
                + "Press 3 to Jump over the dragon");
                    choice = Marmina.nextInt();
                            switch(choice){
                                case 1:
                                    System.out.println("As you dodge the wings, you nearly run into a stalagmite.\n"
                                    + "As you swerve to dodge it, you nearly fall over.\n"
                                    + "There has to be some way to stop this beast!\n"
                                    + "What do you do?\n"
                                    +"Press 1 to Cast an earthquake spell\n"
                                    +"Press 2 to Duck behind one of the stalagmites\n"
                                    +"Press 3 to Keep running");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            System.out.println("You take a piece of rock from your hands and cause the earth to rumble..\n"
                                    + " Doing this causes the stalagtites to fall from the ceiling.\n"
                                    + "One hits the dragon on the head, causing it to fall dead on the floor, but the rest of the rubble is coming down at you!\n"
                                    + "A cave is coming up, but there are also some rock shelves as well. What will you do?\n"
                                    +"Press 1 to Leap into the nearest cave\n"
                                    +"Press 2 to Duck under the rock shelves\n"
                                    +"Press 3 to Keep running and dodge the falling debris");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You leap into the cave as rubble falls to the ground nearby .\n"
                                            +"When you feel that it safe you exit the cave. The room is now full of rocks and dirt"
                                            +"You hear a gasp, and turn to see the girl from before standing in front of you.\n"
                                            +"'Who are you?' she says, 'I didn't know there was someone else here! Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You go to duck under the rock shelves but something pushes you away.\n"
                                            +"Suddenly, the shelf you were heading for collapses, raising a cloud of dusk "
                                            +"You hear someone gasp for breath, and turn to find the girl from before standing over you.\n"
                                            +"'That was a close one' she says, 'You're lucky I made it in time. Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You keep running and dodging as rocks fall from the ceiling.\n"
                                            +"As you begin to come to a stop, you colide with something. You fall down"
                                            +"'Ow!' a voice says. You look up and see the girl you saw earlier rubbing her head\n"
                                            +"'That hurt alot' she says, 'You should watch where you are going. Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                        break;
                                        case 2:
                                            System.out.println("As you get behind the Stalagmite, You hear the dragon roar in pain.\n"
                                    + "It falls into view, wrenching on the ground.\n"
                                    + "However, Its tail knocks over the stalagmite you are behind!\n"
                                    + "What do you do?\n"
                                    +"Press 1 to Dodge to the left\n"
                                    +"Press 2 to Dodge to the right\n"
                                    +"Press 3 to strike the stalagmite");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                            System.out.println("You get out of the way just in time. The stalagmite misses you completly .\n"
                                            +"As the dust settles, You see the girl from the first cavern huffing for breath.\n"
                                            +"'I'm too young to be using that kind of power.' she says, 'Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You dodge to the right as the pillar falls.\n"
                                            +"Too late you realize you are about to collide with the girl you saw before "
                                            +"As you brace for impact, she leaps over your head and does a full 360 flip.\n"
                                            +"'You okay' she says, turning back to look at you 'I didn't see you there. Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You brace yourself and with your bare hands strike the pillar of stone.\n"
                                            +"As you connect, the Stalagmite shatters into bits and pieces"
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'You broke that,' she says, 'WITH YOUR BARE HANDS?! Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                        break;
                                        case 3:
                                            System.out.println("You run. And run. And run. \n"
                                    + "You are starting to get very tired, and the dragon isn't showing signs of tiring .\n"
                                    + "What do you do?\n"
                                    +"Press 1 to Slam on the breaks\n"
                                    +"Press 2 to Turn and run at the dragon\n"
                                    +"Press 3 to Stop to catch a breath");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You Slam on the breaks and the dragon flies past you .\n"
                                            +"You make out a flash of light and blood squirts out of the dragon. It collapses in a heap of gore."
                                            +"You hear someone gasping for breath, and as you look closer, you see the young girl from before, clutching a spiked hammer\n"
                                            +"'Nice setup' she says, 'That thing stood no chance. Did Marmina send you?'"
                                            +"She looks impatient, How do you answer her question"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You brace yourself and with your bare hands strike the pillar of stone.\n"
                                            +"As you connect, the Stalagmite shatters into bits and pieces"
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'You broke that,' she says, 'WITH YOUR BARE HANDS?! Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You brace yourself and with your bare hands strike the pillar of stone.\n"
                                            +"As you connect, the Stalagmite shatters into bits and pieces"
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'You broke that,' she says, 'WITH YOUR BARE HANDS?! Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                        break;
                                    }
                                break;
                                case 2:
                                    System.out.println("You attempt to dodge the wings but you’re pinned to a wall! \n"
                                    + "You need to think of something fast or you’re dead meat.\n"
                                    + "What do you do?\n"
                                    +"Press 1 to Cast a Web spell\n"
                                    +"Press 2 to Cast a lightning bolt at the dragon\n"
                                    +"Press 3 to Fire an arrow at the dragon's eye.");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                        case 1:
                                            System.out.println("You create a sticky web in the path of the dragon.\n"
                                    + " It tries to avoid it but it gets stuck! \n"
                                    + "What do you do now?\n"
                                    +"Press 1 to Throw a rock at the dragon\n"
                                    +"Press 2 to Make a face at the dragon\n"
                                    +"Press 3 to Return to the treasure trove");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You throw a rock at the dragon.\n"
                                            +"It misses and hits the ground shatters into bits and pieces"
                                            +"You hear a laugh and You turn and see the girl you saw earlier standing there smiling \n"
                                            +"'It might take much more force to hit that dragon,' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                               System.out.println("You make a face at the dragon.\n"
                                            +"While the dragon doesn't seem to like it that much You hear someone burst into laughter and You turn and see the girl you saw earlier lying on the ground giggiling\n"
                                            +"'That face,' she says,amid her giggles 'It's so funny! Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You return to the treasure trove.\n"
                                            +"Everything is as it was before, however the girl is regaining consiousness "
                                            +"You run over and the girl turns to look in your direction\n"
                                            +"'Who are you?,' she says, 'What happened to the dragon? Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                        break;
                                        case 2:
                                            System.out.println("You look behind yourself and hurl a bolt of lightning at the dragon's wings.\n"
                                    + " It seems to takes it hard for sure. \n"
                                    + "In a rage, it accidentally knocks down a stalactite which pins into the floor. \n"
                                    + "The dragon can’t chase you anymore. What do you do?\n"
                                    +"Press 1 to Sigh in relief\n"
                                    +"Press 2 to  Yell war words at the dragon\n"
                                    +"Press 3 to Walk away like a Cool person");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You Sigh in relief and turn to leave.\n"
                                            +"As you connect, the Stalagmite shatters into bits and pieces"
                                            +"You stop as the girl you saw earlier walks out from behind a wall\n"
                                            +"'That was eletrickill,' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You shout war word like 'Sylable' and 'Photosynthesis' at the beast.\n"
                                            +"Someone coughs and You turn and see the girl you saw earlier standing there.\n"
                                            +"'I'm guessing marmina sent you,' she says, 'So are you done with whatever you are doing?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You turn and walk away like a cool person.\n"
                                            +"As you exit the chamber,You hear a gasp and You turn and see the girl you saw earlier standing there in shock\n"
                                            +"'Where did you come from,' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                        break;
                                        case 3:
                                            System.out.println("You turn and rapidly begin to fire arrows at the dragon. \n"
                                    + " They hit dead center in its eyes.\n"
                                    + "The dragon has been blinded, However It still is following you because of its incredible hearing!\n"
                                    + "What do you do?\n"
                                    +"Press 1 to  Lead it into a wall\n"
                                    +"Press 2 to Lead it into a stalagmite\n"
                                    +"Press 3 to Lead it into a stalactite ");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You lure it to a wall and then dodge away as it charges.\n"
                                            +"It hits so hard it knocks itself out. it fall to the floor"
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'That looked like a huge axident,' she says,' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You lead it into one of the stalagmites.\n"
                                            +"As it connect, the Stalagmite shatters into bits and pieces, which falls on the beast, burying it."
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'How did you know it was following your sound?' she asks, 'Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You lead it into one of the hanging stalgtites on the ceiling.\n"
                                            +"It crashes into it and falls to the ground in a heap"
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'Its gonna feel that in the morning,' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                        }
                                        break;
                                    }
                                break;
                                case 3:
                                    System.out.println("You press your feet into the ground and leep as high as you can over the head of the dragon. \n"
                                    + "You make a smooth landing and hit the ground running \n"
                                    + "You are now chasing the dragon! \n"
                                    + "What do you do?\n"
                                    +"Press 1 to Taunt the dragon\n"
                                    +"Press 2 to Strike the dragon\n"
                                    +"Press 3 to Run after the dragon");
                                    choice = Marmina.nextInt();
                                        
                                    switch(choice){
                                        case 1:
                                            System.out.println("You speak some words at the dragon that are DEFINITELY NOT KID FRIENDLY!  \n"
                                    + "The dragon turns around and comes directly at you!  \n"
                                    + "Wrong move kid, now whatcha gonna do?\n"
                                    +"Press 1 to  Try to apologize to the dragon\n"
                                    +"Press 2 to Shout more insults (ARE YOU CRAZY?!)\n"
                                    +"Press 3 to Do your best gandalf impression");
                                    choice = Marmina.nextInt();
                                        switch(choice){
                                            case 1:
                                                System.out.println("You try to apologize to the dragon. It doesn’t seem to work. \n"
                                            +"What does work is the Hammer that is brought down upon its head. "
                                            +"The same girl you saw unconscious in the first chamber brings it down so hard that it flattens the dragon.\n"
                                            +"She gives a sigh then looks at you and says, ‘Your language will definitely be the death of you if you're not careful. Word of advice: Just don’t say those words. Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:System.out.println("You shout even more insults at the dragon.\n"
                                            +"It stops in its tracks, and turns around and begins to flee. "
                                            +"One word you said really filled it with fear. Or did it?\n"
                                            +" You turn and see the spiked end of a hammer inches from your face. Holding it, is a young girl."
                                            +" ‘Did Marmina send you?' she says, ' Cause he never sends someone who speaks words like that!’"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("As the dragon runs toward you, you shout,'YOU SHALL NOT PASS!' and slam your sword in the ground.\n"
                                            +"A wall of fire shoots up where the dragon is, instantly killing it"
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'Incredible, you burnt it to a crisp' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                          
                                                
                                        }
                                        
                                    break;
                                    case 2:
                                            System.out.println("You run as fast as you can, then leap up and prepare to strike the dragon.  \n"
                                    + "You suddenly realize you didn't decide on the point of impact!  \n"
                                    + "Where will you strike it?\n"
                                    +"Press 1 for the head\n"
                                    +"Press 2 for the tail\n"
                                    +"Press 3 for the neck");
                                            choice = Marmina.nextInt();
                                        switch(choice){
                                            case 1:
                                                System.out.println("You spin around and bring your blade down on the dragons head.\n"
                                            +"The sword embeds itself in the scales as the dragon topples to the ground"
                                            +"As you remove and sheave your blade,You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'Incredible, one hit and its dead' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You do a flip and slice the tail, the thing that helps the dragon control its ability to fly.\n"
                                            +"As it flails wildly, it rams into a wall and is knocked out."
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'Nice cut.' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You wait until the dragon raises it head and strike its neck.\n"
                                            +"Blood squirts out, and the dragon convulses in pain to the ground."
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'You aimed for the neck' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                          
                                                
                                        }
                                        break;
                                        case 3:
                                            System.out.println("You chase down the dragon, shouting as loud as you can  \n"
                                    + "One word you say triggers a powerful magic spell \n"
                                    + "What type of word is it\n"
                                    +"Press 1 for a word of death\n"
                                    +"Press 2 for a word of pain\n"
                                    +"Press 3 for a word of stunning power");
                                            choice = Marmina.nextInt();
                                        switch(choice){
                                            case 1:
                                                System.out.println("When the dragon hears your word, it falls to the ground dead.\n"
                                            +"You can't even fathom what just happened"
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'Such a powerful spell' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("The dragon begins to roar, as it feels pain throughout his whole body\n"
                                            +"It crumples to the ground and withers away"
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'How did you do that?' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("As the dragon Hears your voice, it seems to be stunned\n"
                                            +"It falls to the ground, stars in its eyes"
                                            +"You hear a gasp and You turn and see the girl you saw earlier standing there in awe\n"
                                            +"'That was stunning' she says, ' Did Marmina send you?'"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                          
                                                
                                        }
                                        break;
                                    }
                                break;  
                            }
                break;
                case 2:
                System.out.println("You decide to go to the east\n"
                +"You enter what appears to be a gem mine."
                +"Huge diamonds, rubies, sapphires  and emeralds cover the ground."
                +"There are tons of places to hide. What will you do?"
                + "Press 1 to Hide Behind an emerald\n"
                + "Press 2 to Hide behind a pile of rubies\n"
                + "Press 3 to Run through the middle");
                    choice = Marmina.nextInt();
                            switch(choice){
                                case 1:
                                    System.out.println("As you near the emerald, The dragon swoops by and destroys it!\n"
                                    + "You need a new plan, and fast!\n"
                                    + "What do you do?\n"
                                    +"Press 1 to Use a catapult spell on a huge emerald you can ride on.  \n"
                                    +"Press 2 to Fire a bomb arrow at the ceiling\n"
                                    +"Press 3 to Cast SCANLAN’S HAND!");
                                    choice = Marmina.nextInt();
                                    
                                    
                                        switch(choice){
                                            case 1:
                                                System.out.println("You step onto the emerald and  with a flick of your hand, you are flying through the gem mine.\n"
                                    + "The dragon can’t keep up and gets lost! This calls for a victory song! \n"
                                    + "What song do you choose\n"
                                    +"Press 1 for We are the Champions  \n"
                                    +"Press 2 for Good feeling\n"
                                    +"Press 3 for Immortals");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You begin to sing ‘We are the champions’ by Queen when you hear someone clear their throat.\n"
                                            +"You turn and see the girl from before standing in the middle of the cavern."
                                            +"‘Who the hell are you?’ she asks, ‘Did Marmina send you?\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You begin to sing the song ‘Good feeling’ by Flo Rida, when you become aware of someone behind you.\n"
                                            +"It's the girl that was in the dragon’s lair."
                                            +"Sorry to interrupt your song but do you know someone named marmina? Because that is literally one of his favorite songs.'\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You do a little air guitar as you start to sing ‘Immortals’ by Fall Out Boy, when you feel someone's presence behind you.\n"
                                            +"You turn to see the girl from before staring at you."
                                            +"‘Did Marmina send you?’ she asks ‘Cause you don’t look like the kind of person he would send to rescue someone.’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;       
                                        }
                                            break;
                                    
                                              
                                            case 2:
                                                System.out.println("You yell ‘ENEMY IC130 ABOVE’ and fire an arrow with an explosive attached to it at the dragon. \n"
                                    + "KABOOM! The dragon catches on fire! \n"
                                    + "Now’s the time to strike a pose!What will you do?\n"
                                    +"Press 1 to Make a peace sign \n"
                                    +"Press 2 to DAB\n"
                                    +"Press 3 to Snap your fingers!");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("As the beast explodes you flash a peace sign into the air\n"
                                            +"You suddenly fall backwards. A young girl had been standing right behind you."
                                            +"‘Did Marmina send you?’ she asks ‘Cause you don’t look like the kind of person he would send to rescue someone.’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You bring your arms up and dab at the dragon\n"
                                            +"Feeling someones precense, You turn to see the girl from before staring at you."
                                            +"‘Did Marmina send you?’ she asks ‘You look like his type of person.’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You do a little flourish and snap your fingers\n"
                                            +"'Thats copyright' you hear a voice say. You turn to see the girl from before siting on a pile of gems behind you."
                                            +"‘Is that your 'trademark pose'?’ she asks ‘Cause you might want to change it’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;       
                                        }
                                            break;
                                            case 3:
                                                System.out.println("You create a glowing hand that flies right at the dragon. \n"
                                    + "The dragon stares in horror, knowing what comes next\n"
                                    + "How do you want the hand to strike the beast?\n"
                                    +"Press 1 to strike The head  \n"
                                    +"Press 2 to strike the wings\n"
                                    +"Press 3 to strike the body");
                                    choice = Marmina.nextInt();
                                    switch(choice){
                                            case 1:
                                                System.out.println("You have the hand strike the head.\n"
                                            +"As the dragon takes the hit, it turns and flees."
                                            + " As You turn, you are shocked see the girl from before siting on a pile of gems behind you."
                                            +"‘What is with that being everyone's spell?!’ she asks ‘Is that the only one you use?’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say no\n"
                                            +"Press 2 to say yes\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You strike the wings so the dragon can't fly anymore\n"
                                            +"It turns and flees. As you turn, you move back as you catch sight of a young girl standing behind you."
                                            +"‘Smart move.’ she says ‘Did marmina send you?’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You have it strike the body. THE DRAGON GOES FLYING OUT OF SIGHT!\n"
                                            +"'I've seen better KO's' someone says. You turn and find a young girl behind you"
                                            +"‘Did Marmina send you?’ she asks ‘Cause he loves punching things’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;       
                                        }
                                            break;
                                          
                                                
                                        }
                                break;
                                case 2:
                                    System.out.println("You hide behind the pile of rubies. The dragon loses sight of you . \n"
                                    + "You then begin to hear panting. You give a gasp as the girl you saw before comes into view. \n"
                                    + "She has brown skin ,cyan eyes with fierce eyelashes and lime green and dark green dreadlocks that are pulled up in a knitted loop due to a blue hair tie with three rings that hang over her bangs.\n"
                                    +" ‘Hey,' she says,' Is that dragon chasing you as well? We should team up and take it down.’"
                                    + "What do you( and the girl ) do?\n"
                                    +"Press 1 to Trick the dragon into running into a wall\n"
                                    +"Press 2 to  Distract the dragon and then sneak attack it\n"
                                    +"Press 3 to Attack the dragon from both sides");
                                    choice = Marmina.nextInt();
                                        switch(choice){
                                            case 1:
                                                System.out.println("You and the girl begin yelling out at the dragon to come and get you. \n"
                                    + "It returns in fury and swoops at you.\n"
                                    + "You prepare to dodge out of the way. Which way do you go?\n"
                                    +"Press 1 to go Right\n"
                                    +"Press 2 to go left\n"
                                    +"Press 3 to go straight forward");
                                    choice = Marmina.nextInt();
                                        switch(choice){
                                            case 1:
                                                System.out.println("You count to 3 and then jump to the right.\n"
                                            +"The dragon slams into the wall and falls unconscious. You and the girl turn to each other and smile."
                                            +"Then the girl asks, ‘You’re the one marmina sent, right?’"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You wait for the charge and then leap to the left. As the dragon passes by, you deliver a powerful slice to its eyes!\n"
                                            +" The dragon roars in pain and flees down a corridor high up "
                                            +"‘Did Marmina send you?’ the girl suddenly asks ‘Only those he teaches know how to flurry rush’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You rush forward meeting its charge head on! You raise your sword and deliver a powerful slash\n"
                                            +" A spray of blood hits you in the face as the dragon splits into two halves that fall to the opposite sides. The Girl gives a Gasp"
                                            +"‘Did Marmina send you?’ she asks ‘Did you come to rescue me?’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break; 
                                                    }
                                            break;
                                            case 2:
                                                System.out.println("You call out to the dragon, asking if it wants to negotiate.\n"
                                    + "As it comes back into view, you motion to the girl to strike. \n"
                                    + "She gives you a look asking where to hit it. What do you tell her?\n"
                                    +"Press 1 to Attack the head\n"
                                    +"Press 2 to  Attack the legs\n"
                                    +"Press 3 to Attack The back");
                                    choice = Marmina.nextInt();
                                        switch(choice){
                                            case 1:
                                                System.out.println("You motion for her to strike the head (Endgame reference activated).\n"
                                            +"She gives a war cry causing the dragon to turn before bringing out a spiked hammer and bringing it down on the dragons head, crushing it"
                                            +"You give her a thumbs up and she smiles. Then she asks ‘Do you know someone named Marmina?’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You motion at the dragon's legs, and she gives a nod before running straight at the dragon!\n"
                                            +"The dragon turns its head, but its too late! The girl delivers a powerful kick to the dragon's short legs. The beast falls over and  in fear begins to Crawl out of the room.  "
                                            +"The girl gives a thumbs up. ‘Good plan’ She says, and then asks, ‘Did marmina send you?\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You motion for her to attack the back, then realize shes already gone for it! She raises a spiked hammer and brings it down hard on the back!\n"
                                            +"The dragon crumples to the ground and the girl does a flip off and flashes a peace sign. You applaud her performance and she gives a bow "
                                            +"She then takes on a serious look and asks ‘Did Marmina send you?’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;  
                                        }
                                            break;
                                            case 3:
                                                System.out.println("You run after the dragon, the girl in front of it and you in the back.\n"
                                    + "The girl begins to slow, causing the dragon to slow with her. You take that oppurtnity to attack it from behind!\n"
                                    + "As the girl follows suit, with a huge spiked hammer, The dragon is hit with so much force that it EXPLODES!\n"
                                    +"The two of you grin. How do you want to celebrate your victory"
                                    +"Press 1 to high five\n"
                                    +"Press 2 to do a power bump\n"
                                    +"Press 3 to do a little handshake");
                                    choice = Marmina.nextInt();
                                        switch(choice){
                                            case 1:
                                                System.out.println("You high five each other and turn to look at the remains of the dragon.\n"
                                            +"'I've got to admit it,' she says, 'You are pretty strong"
                                            +"‘Did Marmina send you?’ she then asks?\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("You put out your fist and bump it into the girls fist.You both then say 'balalala'!\n"
                                            +"‘Did Marmina send you?’ the girl suddenly asks ‘Cause he loves making that refrence’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;
                                            case 3:
                                                System.out.println("You put out your hand and the girl takes it and you both shake hands.\n"
                                            +"We make a great team.’ she says ‘Did Marmina send you?’\n"
                                            +"How do you answer her?"
                                            +"Press 1 to say yes\n"
                                            +"Press 2 to say no\n"
                                            +"Press 3 to say 'what do you think?'\n"
                                            +"press 4 to quit");
                                            choice = Marmina.nextInt();
                                            switch(choice){
                                                case 1:
                                                    emmaTalk1(Marmina);
                                                break;
                                                case 2:
                                                    emmaTalk2(Marmina);
                                                break;
                                                case 3:
                                                    emmaTalk3(Marmina);
                                                break;
                                                case 4:
                                                    System.out.println("Goodbye.See you later");
                                                break;
                                                }
                                            break;  
                                        }
                                            break;       
                                        }
                                break;
                       case 3://level2
                            System.out.println("You run through the middle and see three paths coming up ahead.\n"
                                    + "Each of them look pretty precarious. Do you go left , right or center?\n"
                                    + "What do you want to do?\n"
                                    +"Press 1 to go left\n"
                                    +"Press 2 to go center\n"
                                    +"Press 3 to go middle");
                                    choice = Marmina.nextInt();
                                    
                                        switch(choice){
                                            case 1://level3
                                                System.out.println("You decide to go down the left path. It is filled with sparkling stones that have razor sharp points\n"
                                                +"One of these huge stones is in the middle of the passage, blocking your path.\n"
                                                +"The dragon is hot in pursuit!What will you do?\n"
                                                +"Press 1 to duck\n"
                                                +"Press 2 to slide under\n"
                                                +"Press 3 to roll under it");
                                                choice = Marmina.nextInt();
                                                switch(choice){
                                                        case 1://level 4
                                                        System.out.println("You duck down as you run underneath the stone\n"
                                                        +"The dragon isn't as lucky. It rams right into it. YOU ESCAPE\n"
                                                        +"However,As you turn to look forward, you see a Young girl in the middle of the passage!\n"
                                                        +"'WATCH OUT!' she yells! Too late. The two of you collide and you fall over in a heap."
                                                        +"As you get to your feet, the girl gives an look at you and says. 'Please tell you are the one Marmina sent.'"
                                                        +"How do you reply?\n"
                                                        +"Press 1 to say yes \n"
                                                        +"Press 2 to no\n"
                                                        +"Press 3 to say 'What do you think?\n"
                                                        +"Press 4 to quit");
                                                        choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }
                                                    
                                                
                                                        

                                                        break;
                                                        case 2:
                                                        System.out.println("You slide underneath the stone with ease. The dragon isn't able to follow you\n"
                                                        +"You slow to a stop and catch your breath.\n"
                                                        +"However,As you turn to look forward, you see a Young girl running towards you!'WATCH OUT!' she yells! Too late. The two of you collide and you fall over in a heap.\n"
                                                        +"As you get to your feet, the girl gives an annoyed look at you and says. 'Watch where you're going! You could've gotten hurt!"
                                                        +"She then looks at you closely and then asks,'Did marmina send you? "
                                                        +"How do you reply?\n"
                                                        +"Press 1 to say yes \n"
                                                        +"Press 2 to Excuse me?\n"
                                                        +"Press 3 to say 'What do you think?\n"
                                                        +"Press 4 to quit");
                                                        choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }                                       
                                                

                                                    break;
                                                    case 3:
                                                        System.out.println("You roll under the stone and leave the dragon behind you\n"
                                                        +"The dragon isn't as lucky. It rams right into the pillar\n"
                                                        +"However,As you turn to look forward, you collide with something and fall over!\n"
                                                        +"As you get to your feet, you see a young girl on the floor rubbing her head. she says 'Thats gonna leave a mark.'"
                                                        +"She turns to you and asks,'Why don't you look where you are going? Did marmina send you?' "
                                                        +"How do you reply?\n"
                                                        +"Press 1 to say yes \n"
                                                        +"Press 2 to no\n"
                                                        +"Press 3 to say 'What do you think?\n"
                                                        +"Press 4 to quit");
                                                        choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }                                         

                                                    break;
                                                        }
                                                
                                                
                                            break;
                                            case 2:
                                                System.out.println("You decide to go down the right passage. Its too big for the dragon so you should be fine right?.\n"
                                                +"Wrong. A figure enters the room. You call out a warning and the figure turns\n"
                                                +"Its a young girl!Her face fills with horror as she sees you running head on towards her!\n"
                                                +"'OH NO!' she screams, and crouchs low."
                                                +"What do you do?"
                                                +"Press 1 to twist around her\n"
                                                +"Press 2 to dive over her\n"
                                                +"Press 3 to leap over her");
                                                choice = Marmina.nextInt();
                                                switch(choice){
                                                    case 1:
                                                        System.out.println("As you come up to her you twist around, and come to a stop behind her\n"
                                                        +"The girl gives a sigh of relief and says, 'Sorry. I wasn't looking where I was going.'\n"
                                                        +"Her green hair sparkles in the light of all the gems, illuminating her brown skin\n"
                                                        +"'Did you just outrun a dragon?' she asks in shock as she gazes out of the cave."
                                                        +"How do you reply?\n"
                                                        +"Press 1 to say yes \n"
                                                        +"Press 2 to no\n"
                                                        +"Press 3 to say 'What do you think?\n"
                                                        +"Press 4 to quit");
                                                        choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            } 
                                                    break;
                                                    case 2:
                                                        System.out.println("You dive over her and roll to a stop.\n"
                                                        +"The girl turns and yells at you. 'Watch where you're going, you almost hit me!'\n"
                                                        +"You turn and reply, 'Yeah? Well you should've watched where you were going!' \n"
                                                        +"'Don't lecture me! I'm not the one that was being careless she yells! The two of you glare at each other, and then start to laugh."
                                                        +"As you get to your feet, the girl looks at you and says. 'So your the one Marmina sent to rescue me huh?'"
                                                        +"How do you reply?\n"
                                                        +"Press 1 to say yes \n"
                                                        +"Press 2 to no\n"
                                                        +"Press 3 to say 'What do you think?\n"
                                                        +"Press 4 to quit");
                                                        choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }
                                                    break;
                                                    case 3:
                                                        System.out.println("You leap over her........ and into a rock wall\n"
                                                        +"You grab your head in pain. You're gonna feel that in the morning\n"
                                                        +"As you get to your feet, the girl gives an look at you and says. 'Sorry about that. Did marmina send you to come find me?.'"
                                                        +"How do you reply?\n"
                                                        +"Press 1 to say yes \n"
                                                        +"Press 2 to no\n"
                                                        +"Press 3 to say 'What do you think?\n"
                                                        +"Press 4 to quit");
                                                        choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }
                                                    break;
                                                }
                                                
                                            break;
                                            case 3:
                                                System.out.println("You go down the center path. The dragon is closing in!\n"
                                                +"It manages to get ahead of you and blocks your path!.\n"
                                                +"Collision is due any second!What will you do?\n"
                                                +"Press 1 to flip over the dragon\n"
                                                +"Press 2 to triple jump over its tail\n"
                                                +"Press 3 to slow down and step over it, Kindly");
                                                choice = Marmina.nextInt();
                                                switch(choice){
                                                    case 1:
                                                        System.out.println("You flip over the dragon\n"
                                                        +"As you look at the dragon, you double take as it holds up a sign that says 10\n"
                                                        +"As you land, the dragon turns and flys away. You then become aware of someone running towards you\n"
                                                        +"A young girl around 14 years old, skids to a stop and trys to catch her breath."
                                                        +"The girl looks at you and says. 'You're so fast. Did Marmina send you?'"
                                                        +"How do you reply?\n"
                                                        +"Press 1 to say yes \n"
                                                        +"Press 2 to no\n"
                                                        +"Press 3 to say 'What do you think?\n"
                                                        +"Press 4 to quit");
                                                        choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }
                                                    break;
                                                    case 2:
                                                        System.out.println("You jump once, twice, thrice and flip over the dragon and land with your arms in a T.\n"
                                                        +"The dragon applauds and turns to leave.\n"
                                                        +" You jerk back as a young girl lands beside you\n"
                                                        +"'WOW! You are amazing' she yells! As you jerk back, you fall onto your back."
                                                        +"As you get to your feet, the girl gives you a look and says. 'Please tell you are the one Marmina sent to rescue me!'"
                                                        +"How do you reply?\n"
                                                        +"Press 1 to say yes \n"
                                                        +"Press 2 to no\n"
                                                        +"Press 3 to say 'What do you think?\n"
                                                        +"Press 4 to quit");
                                                        choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }
                                                    break;
                                                    case 3:
                                                        System.out.println("You stop at the dragon and ask if you can pass\n"
                                                        +"It nods, and you step over its tail. It then turns to look at the passage again\n"
                                                        +"As you hear a voice calling out a warning. You look up to see a girl falling from the ceiling.\n"
                                                        +"'WATCH OUT!' she yells! Too late. She falls on top of you."
                                                        +"As you get to your feet, the girl gives an look at you and says. 'Sorry about that.Please tell you are the one Marmina sent.'"
                                                        +"How do you reply?\n"
                                                        +"Press 1 to say yes \n"
                                                        +"Press 2 to no\n"
                                                        +"Press 3 to say 'What do you think?\n"
                                                        +"Press 4 to quit");
                                                        choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }
                                                    break;
                                                }
                                            break;   
                                        }
                                break;   
                            }
                break;
                case 3:
                 System.out.println("You really start to feel the heat as you enter this volcanic chamber.\n"
                +"Lava explodes in bubbles everywhere you see. \n"
                +"You see three paths to take.One goes directly over the lava, two go across the edges of the vat of molten rock. the dragon has stopped for some reason. \n"
                +"Where will you go?\n"
                + "Press 1 to take the lava path\n"
                + "Press 2 to take the edges\n"
                + "Press 3 to go back.");
                    choice = Marmina.nextInt();
                            switch(choice){
                                case 1:
                                    System.out.println("You leap along the lava path.You then recall The dragon has stopped chasing you for some reason\n"
                                    + "'NOT THERE! GET AWAY FROM THAT LAVA!' the dragon calls out in panic\n"
                                    + "You hear an explosion and you see a huge purple dragon appear from the lava. It leads out a fearsome roar\n"
                                    + "You see the red dragon motion to you to follow it. What do you do\n"
                                    +"Press 1 to run as fast as you can\n"
                                    +"Press 2 to leap towards the red dragon\n"
                                    +"Press 3 to use your ice rod to make an ice slide");
                                    choice = Marmina.nextInt();
                                           switch(choice){
                                               case 1:
                                                   System.out.println("You run as fast as you can, the purple dragon following close behind.\n"
                                                    + "As soon as you exit the cavern, the red dragon hits part of the wall, sealing it and the purple dragon in.\n"
                                                    + "'Ridley.' someone says, 'Marmina knew that he survived, and i didn't believe him.\n"
                                                    +"You turn and see a young girl looking at the now closed off chamber. She then asks you, 'He sent you here to find me, right?'"
                                                    + "What do you say?\n"
                                                    +"Press 1 to say yes\n"
                                                    +"Press 2 to say no\n"
                                                    +"Press 3 to say ' what do you think?'"
                                                    +"Press 4 to quit.");
                                                    choice = Marmina.nextInt();
                                                        switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }


                                               break;
                                               case 2:
                                                   System.out.println("You leap onto the red dragons back and the two of you flee from the newcommer.\n"
                                                    + "As you leave the cave, someone hits a huge rock toward the entrance sealing the purple beast in.\n"
                                                    + " The red dragon lets you down, bows, and leaves. You hear footsteps and turn to see a young girl running towards you.\n"
                                                    + "'Are you okay?' she asks. What do you say?\n"
                                                    +"Press 1 to say yes\n"
                                                    +"Press 2 to say no  \n"
                                                    +"Press 3 to say 'What do you think?"
                                                    +"Press 4 to quit");
                                                    choice = Marmina.nextInt();
                                                        switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }

                                               break;
                                               case 3:
                                                   System.out.println("You take out your magic ice rod and freeze some of the lava, allowing you to slide to the exit.\n"
                                                    + "The two dragons then rush at each other, clawing and bitting. You yell your thanks to the red dragon and leave\n"
                                                    + "You stop as a young girl runs into view. She stares into the lava cavern at the brawl.\n"
                                                    + "'Did the dragon just save your life?' She asks in astonisment\n"
                                                    +"Press 1 to say yes \n"
                                                    +"Press 2 to say no\n"
                                                    +"Press 3 to say maybe"
                                                    +"Press 4 to quit.");
                                                    choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }

                                               break;
                                           }
                                break;
                                case 2:
                                    System.out.println("You start to go for the edges, when you hear a fearsome roar \n"
                                    + "You turn to find yourself facing a purple dragon! It charges at you\n"
                                    + "The red dragon gets in its way. 'Go!' it calls out, 'Leave this to me!'\n"
                                    + "As you leave you decide to cast a spell to aid the dragon. What will you cast\n"
                                    +"Press 1 to cast bless\n"
                                    +"Press 2 to cast Healing word\n"
                                    +"Press 3 to cast life transference");
                                    choice = Marmina.nextInt();
                                               switch(choice){
                                               case 1:
                                                  System.out.println("You cast a bless spell on the dragon, strengthening his attacks.\n"
                                                    + "You also decide that you need to help the red dragon and begin to fire arrows at the purple one.\n"
                                                    + "Someone grabs you suddenly and pulls you out of the cave.\n"
                                                    + "You come face to face with a young girl. 'What are you doing?' she asks, 'You can't defeat ridley like that! Did marmina send you?'\n"
                                                    +"What do you say"
                                                    +"Press 1 to say Yes\n"
                                                    +"Press 2 to say no\n"
                                                    +"Press 3 to say maybe."
                                                    +"Press 4 to quit");
                                                    choice = Marmina.nextInt();
                                                        switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }

                                               break;
                                               case 2:
                                                   System.out.println("You speaks some words that help the dragon heal itself before turning and leaving the room.\n"
                                                    + "'Thinking of others before thinking about yourself huh?' a voice says\n"
                                                    + "A young girl comes into your view, 'Did marmina send you?' she asks.\n"
                                                    + "What do you say?\n"
                                                    +"Press 1 to say yes\n"
                                                    +"Press 2 to say no\n"
                                                    +"Press 3 to say maybe"
                                                    +"Press 4 to quit");
                                                    choice = Marmina.nextInt();
                                                        switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }

                                               break;
                                               case 3:
                                                   System.out.println("You take some of your life force and give it to the red dragon. ITs enough for it to overpower the purple dragon\n"
                                                    + "You and the dragon race out of the room, startling a young girl who just arrived\n"
                                                    + "'Whoa!'She yells, 'Are you the hero Marmina sent here?'\n"
                                                    + "What do you say?\n"
                                                    +"Press 1 to say yes\n"
                                                    +"Press 2 to say no\n"
                                                    +"Press 3 to say maybe"
                                                    +"Press 4 to quit");
                                                    choice = Marmina.nextInt();
                                                          switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }

                                               break;
                                           }
                                break;
                                case 3:
                                    System.out.println("You turn to go back the way you came when a metalic purple dragon flys at your face! \n"
                                    + "A breath of fire from the red dragon keeps it at bay. The red dragon seems to want you to follow it.\n"
                                    + "As you follow the Red dragon out of the room, it turns and says,'That was close. Ridley almost had us.'\n"
                                    + "You have some questions now, what will you ask the dragon?\n"
                                    +"Press 1 to ask who ridley is\n"
                                    +"Press 2 to ask why it was chasing you\n"
                                    +"Press 3 to just say thank you");
                                    choice = Marmina.nextInt();
                                               switch(choice){
                                               case 1:
                                                  System.out.println("You ask who ridley is. It tells you this :'Ridley is a fearsome beast created by fireborn, an evil man who seeks to revive a demon lord named ganon. While it cannot communicate, it is able to build highly advanced machines and weapons.\n"
                                                    + "The dragon turns and leaves as a young girl runs toward you.\n"
                                                    + "'You're alive!' she says in relief, 'I knew marmina would send someone to help. You do know him right?'\n"
                                                    + "What do you want to say?\n"
                                                    +"Press 1 to say yes\n"
                                                    +"Press 2 to say no\n"
                                                    +"Press 3 to say maybe"
                                                    +"Press 4 to quit");
                                                    choice = Marmina.nextInt();
                                                           switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }

                                               break;
                                               case 2:
                                                   System.out.println("You ask why ridley was chasing you. It replys :'Ridley is an evil creature, it only knows one thing:Violence. If i had not interviened, you would be dead.'\n"
                                                    + "The red dragon flys off to a cavern high up, and a young girl pokes her head around a corner.\n"
                                                    + "'Is that purple fiend gone? Did that red beast get rid of it?.'\n"
                                                    + "What do you say?\n"
                                                    +"Press 1 to say yes\n"
                                                    +"Press 2 to say no\n"
                                                    +"Press 3 to say maybe"
                                                    +"Press 4 to quit");
                                                    choice = Marmina.nextInt();
                                                           switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }

                                               break;
                                               case 3:
                                                   System.out.println("You tell the dragon, 'Thank you'. It replys 'You are most certainly welcome.'\n"
                                                    + "As it leaves, you become aware of a young girl standing behind you.\n"
                                                    + "She asks, 'Did someone named Marmina send you? I have a feeling you know him.'\n"
                                                    + "What do you want to say?\n"
                                                    +"Press 1 to say yes\n"
                                                    +"Press 2 to say no\n"
                                                    +"Press 3 to say maybe"
                                                    +"Press 4 to quit");
                                                    choice = Marmina.nextInt();
                                                            switch(choice){
                                                                case 1:
                                                                    emmaTalk1(Marmina);
                                                                break;
                                                                case 2:
                                                                    emmaTalk2(Marmina);
                                                                break;
                                                                case 3:
                                                                    emmaTalk3(Marmina);
                                                                break;
                                                                case 4:
                                                                    System.out.println("Goodbye, see you soon");
                                                                break;
                                                            }

                                               break;
                                           }
                                break;  
                            }
                break;
            }  
    }
    private static void emmaTalk1(Scanner Marmina) {
        System.out.println("The girl turns to the red dragon, who turns out to actually have returned somehow. 'Thanks for the help' she says,'You helped me find him.'");
        System.out.println("The girl smiles and says 'I'm emma, its nice to meet you, what do you say we get out of here?");
        System.out.println("With that, the two of you leave the dragon cave behind and head back into the light.");
        
    }

    private static void emmaTalk2(Scanner Marmina) {
        System.out.println("She looks at you with a frown.'Don't lie to me. I can sense when you are lying");
        System.out.println("The girl turns to the red dragon, who turns out to actually have returned somehow. 'Thanks for the help' she says,'You helped me find him.'");
        System.out.println("Her frown turns into a grin as she looks back and says 'I'm emma, its nice to meet you, what do you say we get out of here?");
        System.out.println("With that, the two of you leave the dragon cave behind and head back into the light.");
        
    }

    private static void emmaTalk3(Scanner Marmina) {
        System.out.println("The girl ponders this for a second.'Well I think you are an very brave person. Facing down evil, dead in its tracks'");
        System.out.println("The girl turns to the red dragon, who turns out to actually have returned somehow. 'Thanks for the help' she says,'You helped me find him.'");
        System.out.println("She smiles and says 'I'm emma, its nice to meet you, what do you say we get out of here?");
        System.out.println("With that, the two of you leave the dragon cave behind and head back into the light.");
        
        
    }
    

}

    
    

    

