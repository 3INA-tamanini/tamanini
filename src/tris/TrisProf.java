package tris;

import java.util.Objects;

/**
 * Gioco del Tris
 * Inizia il giocatore contrassegnato la lettera X
 * @author prof. Santo Domenico Annino
 * @version 1.0
 */
public final class TrisProf {
    private String[][] campoDaGioco;
    
    private String giocatoreX;
    private String giocatoreO;

    /**
     * Costruttore
     * @param dimensione
     * @param giocatoreX
     * @param giocatoreO 
     */
    public TrisProf(int dimensione, String giocatoreX, String giocatoreO) {
        campoDaGioco = new String[dimensione][dimensione];
        
        setGiocatoreX(giocatoreX);
        setGiocatoreO(giocatoreO);
        
        inizializzaCampoDaGioco();
    }
    
    /**
     * Restituisce il campo da gioco
     * @return String[][]
     */
    public String[][] getCampoDaGioco() {
        return this.campoDaGioco;
    }    
    
    /**
     * Restituisce il nome del giocatore con la X
     * @return String
     */
    public String getGiocatoreX() {
        return giocatoreX;
    }

    /**
     * Imposta il nome del giocator con la O
     * @param giocatoreX String
     */
    public void setGiocatoreX(String giocatoreX) {
        if (giocatoreX.length() >= 2)
            this.giocatoreX = giocatoreX;
    }        
    
    /**
     * Restituisce il nome del giocatore con la O
     * @return String
     */
    public String getGiocatoreO() {
        return giocatoreO;
    }

    /**
     * Imposta il nome del giocatore con la O
     * @param giocatoreO String
     */
    public void setGiocatoreO(String giocatoreO) {
        if (giocatoreO.length() >= 2)
            this.giocatoreO = giocatoreO;
    }
    
    /**
     * Inizializza il campo da gioco con uno spazio
     */
    private void inizializzaCampoDaGioco() {
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                campoDaGioco[i][j] = " ";
            }
        }
    }

    /**
     * Controlla se una determinata cella è disponibile
     * @param riga int
     * @param colonna int
     * @return boolean
     */
    private boolean isCellaDisponibile(int riga, int colonna) {
        if (Objects.equals(campoDaGioco[riga][colonna], " ")) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Verifica se è il turno del giocatore contrassegnato con la X o con la O
     * restituendo il carattere corrispondente
     * @return String
     */
    private String verificaTurnoDiGioco() {
        int contX = 0;
        int contO = 0;
        
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[i][j], "X")) {
                    contX++;
                }
                if (Objects.equals(campoDaGioco[i][j], "O")) {
                    contO++;
                }
            }
        }
        
        if (contX > contO)
            return "O";
        else
            return "X";
    }

    /**
     * Inserisce il carattere X oppure O nella riga e colonna indicate
     * @param segno String
     * @param riga int
     * @param colonna int
     */
    private void piazzaSegno(String segno, int riga, int colonna) {
        if (isCellaDisponibile(riga, colonna))
            campoDaGioco[riga][colonna] = segno;
    }

    /**
     * Restituisce X se vince il giocatore contrassegnato con il carattere X,
     * O se vince il giocatore contrassegnato con il carattere O,
     * = in caso di parità
     * stringa vuota in tutti gli altri casi ovvero se nessuno vince o pareggia.
     * @return String
     */
    private String verificaVincitaOParita() {
        // Righe       
        int contX = 0;
        int contO = 0;
                
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[i][j], "X")) {
                    contX++;
                    if (contX == campoDaGioco.length) {
                        return "X";
                    }
                }
                
                if (Objects.equals(campoDaGioco[i][j], "O")) {
                    contO++;
                    if (contO == campoDaGioco.length) {
                        return "O";
                    }
                }
            }
            
            contX = 0;
            contO = 0;
        }

        // Colonne    
        contX = 0;
        contO = 0;
        
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[j][i], "X")) {
                    contX++;
                    if (contX == campoDaGioco.length) {
                        return "X";
                    }
                }
                
                if (Objects.equals(campoDaGioco[j][i], "O")) {
                    contO++;
                    if (contO == campoDaGioco.length) {
                        return "O";
                    }
                }
            }
            
            contX = 0;
            contO = 0;
        }

        // Diagonale principale
        contX = 0;
        contO = 0;
        
        for (int i = 0; i < campoDaGioco.length; i++) {
            if (Objects.equals(campoDaGioco[i][i], "X")) {
                contX++;
                if (contX == campoDaGioco.length) {
                    return "X";
                }
            }
            
            if (Objects.equals(campoDaGioco[i][i], "O")) {
                contO++;
                if (contO == campoDaGioco.length) {
                    return "O";
                }
            }
        }                

        // Diagonale secondaria
        int riga = campoDaGioco.length-1;
        
        contX = 0;
        contO = 0;
        
        for (int i = riga; i >= 0; i--) {
            int offset = riga-i;
            
            if (Objects.equals(campoDaGioco[i][offset], "X")) {
                contX++;
                if (contX == campoDaGioco.length) {
                    return "X";
                }
            }
            
            if (Objects.equals(campoDaGioco[i][offset], "O")) {
                contO++;
                if (contO == campoDaGioco.length) {
                    return "O";
                }
            }
        }           
        
        // Parità
        int cont = 0;
        for (int i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                if (Objects.equals(campoDaGioco[i][j], "X") || 
                                      Objects.equals(campoDaGioco[i][j], "O")) {
                    cont++;
                    
                    if (cont == campoDaGioco.length * campoDaGioco.length) {
                        return "=";
                    }
                }
            }
        }
        
        // Nessuna vincita
        return "";
    }
    
    /**
     * Restituisce X se vince il giocatore contrassegnato con il carattere X,
     * O se vince il giocatore contrassegnato con il carattere O,
     * = in caso di parità
     * stringa vuota in tutti gli altri casi ovvero se nessuno vince o pareggia.
     * @param riga int
     * @param colonna int
     * @return String
     */
    public String gioca(int riga, int colonna) {
        if (riga < campoDaGioco.length && colonna < campoDaGioco.length) {
            if (Objects.equals(verificaTurnoDiGioco(), "X"))
                piazzaSegno("X", riga, colonna);
            else
                piazzaSegno("O", riga, colonna);
        } else
            ; // per il momento niente

        return verificaVincitaOParita();        
    }

    /**
     * Restituisce una stringa con il campo da gioco
     * @return String
     */
    public String info() {
        String matrice = "┌────┐\n";
        
        int i;
        for (i = 0; i < campoDaGioco.length; i++) {
            for (int j = 0; j < campoDaGioco.length; j++) {
                matrice += "│" + campoDaGioco[i][j];              
            }
            matrice += "│\n";
            matrice += i < campoDaGioco.length-1?"├────┤\n":"";
        }
        
        matrice += "└────┘\n";
        
        return matrice;
    }   
}
