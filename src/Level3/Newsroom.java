package Level3;

import java.util.List;
import java.util.Scanner;

public class Newsroom {

    private List<Copywriter> copywriters;

    public void addCopywriter(String dni, String name) {
        if (copywriters.stream().noneMatch(c -> c.getDNI().equalsIgnoreCase(dni))) {
            copywriters.add(new Copywriter(name, dni));
            System.out.print("Copywriter added successfully.");
        } else {
            System.out.print("Copywriter cannot be added because it already exists.");
        }
    }

    public void removeCopywriter(String dni) {
        Copywriter copywriter = copywriters.stream().filter(c -> c.getDNI().equalsIgnoreCase(dni)).findFirst().orElse(null);
        if (copywriter != null) {
            copywriters.remove(copywriter);
            System.out.print("Copywriter removed successfully.");
        } else {
            System.out.print("Copywriter not found, it cannot be removed.");
        }
    }

    public void addFootballNewsForCopywriter(String dni, String headline, String competition, String club, String player) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addFootballNews(headline, competition, club, player);
        } else {
            System.out.print("Copywriter not found, news cannot be added.");
        }
    }

    public void addBasketballNewsForCopywriter(String dni, String headline, String competition, String club) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addBasketballNews(headline, competition, club);
        } else {
            System.out.print("Copywriter not found, news cannot be added.");
        }
    }

    public void addTennisNewsForCopywriter(String dni, String headline, String competition, String player) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addTennisNews(headline, competition, player);
        } else {
            System.out.print("Copywriter not found, news cannot be added.");
        }
    }

    public void addF1NewsForCopywriter(String dni, String headline, String racingTeam) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addF1News(headline, racingTeam);
        } else {
            System.out.print("Copywriter not found, news cannot be added.");
        }
    }

    public void addMotorcyclingNewsForCopywriter(String dni, String headline, String racingTeam) {
        Copywriter copywriter = getCopywriterByDNI(dni);
        if (copywriter != null) {
            copywriter.addMotorcyclingNews(headline, racingTeam);
        } else {
            System.out.print("Copywriter not found, news cannot be added.");
        }
    }

    private Copywriter getCopywriterByDNI(String dni) {
        return copywriters.stream().filter(c -> c.getDNI().equalsIgnoreCase(dni)).findFirst().orElse(null);
    }
}
