package geradordecurriculo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Anderson Souza
 */
public class Gerador {
    private static String titulo;
    
    public static void setTitulo(String titulo){
        Gerador.titulo=titulo;
    }
    public static String getTitulo(){
        return Gerador.titulo;
    }
    public static void inicio() throws IOException{
        try{
            BufferedWriter arq = new BufferedWriter(new FileWriter(Gerador.getTitulo()+".html"));
            String dados = "<html>\n"
                    + "<head>\n"
                    + "<title>Curriculo</title>\n"
                    +"<style>"
                    + "body{"
                    + "font: 16px calibri, sans-serif;"
                    +"}</style></head>"
                    + "<body>\n"
                    + "<center><h2>CURRICULUM VITAE</h2></center>\n"
                    + "<hr>\n";
            arq.append(dados);
            arq.close();  
        }catch(Exception e){
            e.printStackTrace();
        }
               
    }

    public static void corpo(String dado) throws IOException{
        BufferedWriter arq = new BufferedWriter(new FileWriter(Gerador.getTitulo()+".html",true));
        String dados =dado;
        arq.append(dados);
        arq.close();         
    }
    
    public static void fim() throws IOException{
        try{
           BufferedWriter arq = new BufferedWriter(new FileWriter(Gerador.getTitulo()+".html",true));
            String dados = "\n</body>\n"
                    + "</html>";
            arq.append(dados);
            arq.close();          
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    
    

}
