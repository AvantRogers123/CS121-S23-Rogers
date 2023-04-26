package Project2;

public class Roblox {import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("How many players are there? ");
            final int n = scanner.nextInt();
            Player[] players = new Player[n];
            for (int i = 0; i < n; i++) {
                players[i] = new Player();
            }

            robloxSelection robloxSelection = new robloxSelection();
            robloxSelection.assignRoblox(players);
        }
    }public class Player {
        static private int userCount = 0;

        public int id;
        public Roblox roblox;

        public Player() {
            this.id = ++ userCount;
        }
    }
    public class Roblox {
        private String name;
        private int hitPoints;
        private String move;
        private int movePower;
        private int attackSpeed;

        public Roblox(String name, int hitPoints, String move, int movePower, int attackSpeed) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.move = move;
            this.movePower = movePower;
            this.attackSpeed = attackSpeed;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public String getMove() {
            return move;
        }

        public int getMovePower() {
            return movePower;
        }

        public int getAttackSpeed() {
            return attackSpeed;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public void setMove(String move) {
            this.move = move;
        }

        public void setMovePower(int movePower) {
            this.movePower = movePower;
        }

        public void setAttackSpeed(int attackSpeed) {
            this.attackSpeed = attackSpeed;
        }

        // Display stats method
        public String displayRobloxStats() {
            String stats = "Name: " + name + "\n";
            stats += "Hit Points: " + hitPoints + "\n";
            stats += "Move: " + move + "\n";
            stats += "Move Power: " + movePower + "\n";
            stats += "Attack Speed: " + attackSpeed;
            return stats;
        }
    }



    public Roblox createRoblox() {
        String name = getString("Name: ");
        int hitPoints = getInt("Hit points: ");
        String move = getString("Move’s name: ");
        int movePower = getInt("Move’s power: ");
        int attackSpeed = getInt("Attack speed: ");

        return new Roblox(name, hitPoints, move, movePower, attackSpeed);
    }

    private int getInt(String msg) {
        System.out.print(msg);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("\tOops, input should be an integer!");
                System.out.print(msg);
            }
        }
        throw new RuntimeException("Error: No integer was given!");
    }
    private String getString(String msg) {
        System.out.print(msg);
        return scanner.next();
    }

    public void assignRoblox(Player[] players) {
        scanner = new Scanner(System.in);

        for (Player player : players) {
            System.out.printf("\nPlayer %d: Select a Pokemon and enter its stats.\n", player.id);
            player.roblox = createPokemon();
            System.out.printf("\nPlayer %d Pokemon:\n", player.id);
            System.out.println(player.roblox.displayRobloxStats());
        }

        scanner.close();
    }
}
}
