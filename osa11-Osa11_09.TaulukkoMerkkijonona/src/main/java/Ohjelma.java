
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
        int rivit = 2;
int sarakkeet = 3;
int[][] matriisi = new int[rivit][sarakkeet];
matriisi[0][1] = 5;
matriisi[1][0] = 3;
matriisi[1][2] = 7;
System.out.println(taulukkoMerkkijonona(matriisi));
    }
    
    public static String taulukkoMerkkijonona(int[][] taulukko){
        
        StringBuilder table = new StringBuilder();
        for (int i=0;i<taulukko.length;i++){
            StringBuilder rivi = new StringBuilder();
            for (int j=0;j<taulukko[i].length;j++){
                rivi.append(taulukko[i][j]);
            }
            rivi.append("\n");
            table.append(rivi);
        }
        
        return table.toString();
        
    }

}
