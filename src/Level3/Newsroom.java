package Level3;

import java.util.ArrayList;
import java.util.List;

public class Newsroom {

    private List<Copywriter> copywritersList;

    public Newsroom() {
        copywritersList = new ArrayList<>();
    }

    public void addCopywriter(String name, String dni) {
        if (copywritersList.stream().noneMatch(c -> c.getDNI().equalsIgnoreCase(dni))) {
            copywritersList.add(new Copywriter(name, dni));
            System.out.println("Copywriter added successfully.");
        } else {
            System.out.println("Copywriter cannot be added because it already exists.");
        }
    }

    public void removeCopywriter(String dni) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywritersList.remove(copywriter);
            System.out.println("Copywriter removed successfully.");
        } else {
            System.out.println("Copywriter not found, it cannot be removed.");
        }
    }

    public void addFootballNewsForCopywriter(String dni, String headline, String competition, String club, String player) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addFootballNews(headline, competition, club, player);
        } else {
            System.out.println("Copywriter not found, news cannot be added.");
        }
    }

    public void addBasketballNewsForCopywriter(String dni, String headline, String competition, String club) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addBasketballNews(headline, competition, club);
        } else {
            System.out.println("Copywriter not found, news cannot be added.");
        }
    }

    public void addTennisNewsForCopywriter(String dni, String headline, String competition, String player) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addTennisNews(headline, competition, player);
        } else {
            System.out.println("Copywriter not found, news cannot be added.");
        }
    }

    public void addF1NewsForCopywriter(String dni, String headline, String racingTeam) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addF1News(headline, racingTeam);
        } else {
            System.out.println("Copywriter not found, news cannot be added.");
        }
    }

    public void addMotorcyclingNewsForCopywriter(String dni, String headline, String racingTeam) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addMotorcyclingNews(headline, racingTeam);
        } else {
            System.out.println("Copywriter not found, news cannot be added.");
        }
    }

    public void removeNewsForCopywriter(String dni, String headline) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.removeNews(headline);
        } else {
            System.out.println("Copywriter not found, news cannot be removed.");
        }
    }

    public String getNewsForCopyWriter(String dni) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            return copywriter.getNews();
        } else {
            System.out.println("Copywriter not found, news cannot be shown.");
            return "";
        }
    }

    public int getNewsRating(String dni, String headline) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            return copywriter.getNewsRating(headline);
        } else {
            System.out.println("Copywriter not found, news rating cannot be calculated.");
            return -1;
        }
    }

    public int getNewsPrice(String dni, String headline) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            return copywriter.getNewsPrice(headline);
        } else {
            System.out.println("Copywriter not found, news price cannot be calculated.");
            return -1;
        }
    }

    private Copywriter getCopywriterByDNI(String dni) {
        return copywritersList.stream().filter(c -> c.getDNI().equalsIgnoreCase(dni)).findFirst().orElse(null);
    }
}
