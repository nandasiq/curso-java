package controle;

public class Switch {

    
    public static void main(String[] args) {
        
        
        String faixa = "branca";
        
        switch (faixa.toLowerCase()) {
            
            case "preta":
                System.out.println("Sei o Bassai-dai");
            case "marro":
                System.out.println("Sei Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Hein Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Nao sei nada");
                
        }
        System.out.println("Fim");
        
        
    }
}
