public class main {
    public static void main(String[] args){
        grupo g = new grupo();
        
        pessoa p1 = new pessoa();
        p1.setNome("Joao");
        p1.setAltura(1.70f);
        p1.setIdade(19);
        p1.setMassa(70.0f);  
        
        pessoa p2 = new pessoa();
        p2.setNome("Ana");
        p2.setAltura(1.65f);
        p2.setIdade(18);
        p2.setMassa(58.0f);
        
        g.setPessoa(p1);
        g.setPessoa(p2);    
        
        g.ordena();
    }   
}
