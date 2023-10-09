package MaceraOyunu;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to Adventure Game");
        System.out.print("Please Give Us Your Name: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Oh! " + player.getName() + ". Welcome to OUR misty and mysterious island !!");
        System.out.println("Only thing can i say, this isnt a dream ;) ");
        System.out.println("There is a group of characters you can choose");
        player.selectChar();

        Location location = null;
        boolean win = false;

        while (true) {
            if(location != null){
                location = new Loot(player, location.getName());
                if(location.onLocation() == false){
                    System.out.println("You didnt got a loot.");
                }

            }

            player.printInfo();
            System.out.println("Areas:");
            System.out.println("1- Empty Shack\t2- Store\n3- Forest\t4- River\n5- Cave  \t6- Mine\n\n0- Exit the Game");
            System.out.println("Where did you want to go: ");
            int selectLoc = input.nextInt();

            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    if(player.isWater() && player.isFood() && player.isFirewood()){
                        win = true;
                        break;
                    }
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if(player.isFirewood()){
                        System.out.println("You already have firewood so shouldnt enter.");
                        location = new Somewhere(player);
                        break;
                    }else{
                        location = new Forest(player);
                        break;
                    }
                case 4:
                    if(player.isWater()){
                        System.out.println("You already have water so shouldnt enter.");
                        location = new Somewhere(player);
                        break;
                    }else{
                        location = new River(player);
                        break;
                    }
                case 5:
                    if(player.isFood()){
                        System.out.println("You already have food so shouldnt enter.");
                        location = new Somewhere(player);
                        break;
                    }else{
                        location = new Cave(player);
                        break;
                    }
                case 6:
                    if(player.isOre()){
                        System.out.println("You already have ore so shouldnt enter.");
                        location = new Somewhere(player);
                        break;
                    }else{
                        location = new Mine(player);
                        break;
                    }
                default:
                    System.out.println("Choose areas inside the menu..");
                    location = new SafeHouse(player);
            }

            if(player.isWater() && player.isFood() && player.isFirewood() && player.isOre()){
                System.out.println("You collect all necessary items to end.");
            }

            if(win){
                System.out.println("!!! CONGRATS !!! You won the game");
                break;
            }

            if(location == null){
                System.out.println("Weakling!!!");
                break;
            }
            if(location.onLocation() == false){
                System.out.println("! Game Over !");
                break;
            }
            System.out.println("----- " + location.getName() + " -----");
        }
    }
}
