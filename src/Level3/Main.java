package Level3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Newsroom newsroom = new Newsroom();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the newsroom!");
        System.out.println();

        int option;
        do {
            System.out.println("We can do the following:");
            System.out.println("1. Add copywriter");
            System.out.println("2. Remove copywriter");
            System.out.println("3. Add news for a copywriter");
            System.out.println("4. Remove news");
            System.out.println("5. Show all news for a copywriter");
            System.out.println("6. Calculate news rating");
            System.out.println("7. Calculate news price");
            System.out.println("8. Exit");
            System.out.print("Choose what to do next (1-8): ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addCopywriter(newsroom, scanner);
                    break;
                case 2:
                    removeCopywriter(newsroom, scanner);
                    break;
                case 3:
                    addNewsForCopywriter(newsroom, scanner);
                    break;
                case 4:
                    removeNewsForCopywriter(newsroom, scanner);
                    break;
                case 5:
                    showNewsForCopywriter(newsroom, scanner);
                    break;
                case 6:
                    calculateNewsRating(newsroom, scanner);
                    break;
                case 7:
                    calculateNewsPrice(newsroom, scanner);
                    break;
                case 8:
                    System.out.println("See you soon!");
                    break;
                default:
                    System.out.println("Invalid option (" + option + ").");
                    break;
            }

            System.out.println();
        } while (option != 8);

        scanner.close();
    }

    private static void addCopywriter(Newsroom newsroom, Scanner scanner) {
        System.out.println("Adding copywriter to the newsroom.");
        System.out.print("Enter the copywriter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the copywriter DNI: ");
        String dni = scanner.nextLine();
        newsroom.addCopywriter(name, dni);
    }

    private static void removeCopywriter(Newsroom newsroom, Scanner scanner) {
        System.out.println("Removing copywriter from the newsroom.");
        System.out.print("Enter the copywriter DNI: ");
        String dni = scanner.nextLine();
        newsroom.removeCopywriter(dni);
    }

    private static void addNewsForCopywriter(Newsroom newsroom, Scanner scanner) {
        System.out.println("Adding news for copywriter.");
        System.out.print("Enter the copywriter DNI: ");
        String dni = scanner.nextLine();
        int option;
        do {
            System.out.println("We can add news for the following sports:");
            System.out.println("1. Football");
            System.out.println("2. Basketball");
            System.out.println("3. Tennis");
            System.out.println("4. F1");
            System.out.println("5. Motorcycling");
            System.out.print("Choose what to do next (1-5): ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addFootballNewsForCopywriter(newsroom, dni, scanner);
                    break;
                case 2:
                    addBasketballNewsForCopywriter(newsroom, dni, scanner);
                    break;
                case 3:
                    addTennisNewsForCopywriter(newsroom, dni, scanner);
                    break;
                case 4:
                    addF1NewsForCopywriter(newsroom, dni, scanner);
                    break;
                case 5:
                    addMotorcyclingNewsForCopywriter(newsroom, dni, scanner);
                    break;
                default:
                    System.out.println("Invalid option (" + option + ").");
                    break;
            }
        } while (option < 1 || option > 5);
    }

    private static void addFootballNewsForCopywriter(Newsroom newsroom, String dni, Scanner scanner) {
        System.out.println("Adding football news for copywriter.");
        System.out.print("Enter the headline: ");
        String headline = scanner.nextLine();
        System.out.print("Enter the competition: ");
        String competition = scanner.nextLine();
        System.out.print("Enter the club: ");
        String club = scanner.nextLine();
        System.out.print("Enter the player: ");
        String player = scanner.nextLine();
        newsroom.addFootballNewsForCopywriter(dni, headline, competition, club, player);
    }

    private static void addBasketballNewsForCopywriter(Newsroom newsroom, String dni, Scanner scanner) {
        System.out.println("Adding basketball news for copywriter.");
        System.out.print("Enter the headline: ");
        String headline = scanner.nextLine();
        System.out.print("Enter the competition: ");
        String competition = scanner.nextLine();
        System.out.print("Enter the club: ");
        String club = scanner.nextLine();
        newsroom.addBasketballNewsForCopywriter(dni, headline, competition, club);
    }

    private static void addTennisNewsForCopywriter(Newsroom newsroom, String dni, Scanner scanner) {
        System.out.println("Adding tennis news for copywriter.");
        System.out.print("Enter the headline: ");
        String headline = scanner.nextLine();
        System.out.print("Enter the competition: ");
        String competition = scanner.nextLine();
        System.out.print("Enter the player: ");
        String player = scanner.nextLine();
        newsroom.addTennisNewsForCopywriter(dni, headline, competition, player);
    }

    private static void addF1NewsForCopywriter(Newsroom newsroom, String dni, Scanner scanner) {
        System.out.println("Adding F1 news for copywriter.");
        System.out.print("Enter the headline: ");
        String headline = scanner.nextLine();
        System.out.print("Enter the racing team: ");
        String racingTeam = scanner.nextLine();
        newsroom.addF1NewsForCopywriter(dni, headline, racingTeam);
    }

    private static void addMotorcyclingNewsForCopywriter(Newsroom newsroom, String dni, Scanner scanner) {
        System.out.println("Adding motorcycling news for copywriter.");
        System.out.print("Enter the headline: ");
        String headline = scanner.nextLine();
        System.out.print("Enter the racing team: ");
        String racingTeam = scanner.nextLine();
        newsroom.addMotorcyclingNewsForCopywriter(dni, headline, racingTeam);
    }

    private static void removeNewsForCopywriter(Newsroom newsroom, Scanner scanner) {
        System.out.println("Removing news for copywriter.");
        System.out.print("Enter the copywriter DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Enter the news headline: ");
        String headline = scanner.nextLine();
        newsroom.removeNewsForCopywriter(dni, headline);
    }

    private static void showNewsForCopywriter(Newsroom newsroom, Scanner scanner) {
        System.out.println("Showing news for copywriter.");
        System.out.print("Enter the copywriter DNI: ");
        String dni = scanner.nextLine();
        String news = newsroom.getNewsForCopyWriter(dni);
        if (!news.isEmpty()) {
            System.out.println(news);
        }
    }

    private static void calculateNewsRating(Newsroom newsroom, Scanner scanner) {
        System.out.println("Calculating news rating.");
        System.out.print("Enter the copywriter DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Enter the news headline: ");
        String headline = scanner.nextLine();
        int rating = newsroom.calculateNewsRating(dni, headline);
        if (rating >= 0) {
            System.out.println("Rating for this news: " + rating + " points.");
        }
    }

    private static void calculateNewsPrice(Newsroom newsroom, Scanner scanner) {
        System.out.println("Calculating news price.");
        System.out.print("Enter the copywriter DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Enter the news headline: ");
        String headline = scanner.nextLine();
        int price = newsroom.calculateNewsPrice(dni, headline);
        if (price >= 0) {
            System.out.println("Price for this news: " + price + "€.");
        }
    }
}
