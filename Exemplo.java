public class Exemplo { 
    int a = 2; 
    static int b = 4; 
    
    public static void main(String[] args) { 
        int a = 3; 
        Exemplo e = new Exemplo(); 
        System.out.print("a=" + a + "; "); 
        System.out.print("b=" + b + "; ");

        

        System.out.print("a=" + e.a + "; "); 
        System.out.print("b=" + b + "; "); } 
        
        
        public void alteraValores(int a) { a++; b++; } }