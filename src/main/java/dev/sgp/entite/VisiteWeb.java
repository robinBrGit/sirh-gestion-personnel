package dev.sgp.entite;

public class VisiteWeb {
    private static int id = 0;
    private String chemin;
    private long tempsExecution;

    public VisiteWeb(String chemin, long tempsExecution) {
        this.id = id++;
        this.chemin = chemin;
        this.tempsExecution = tempsExecution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public long getTempsExecution() {
        return tempsExecution;
    }

    public void setTempsExecution(long tempsExecution) {
        this.tempsExecution = tempsExecution;
    }
}
