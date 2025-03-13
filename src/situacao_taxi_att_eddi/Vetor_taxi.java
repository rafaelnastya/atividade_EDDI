package situacao_taxi_att_eddi;

public class Vetor_taxi {
    public String[] resources;
    private int size;
    
    public Vetor_taxi(int fit){
        this.resources = new String[fit];
        this.size = 0;
    }
    
    public void insert(String nome_taxista, String destino, int km, double taximetro) throws Exception{
        if (size >= resources.length) {
            throw new Exception("Vetor cheio.");
        }
        this.resources[this.size] = 
                "Taxista: " + nome_taxista + 
                ", Destino: " + destino + 
                ", KM: " + km + 
                ", Taximetro: R$" + taximetro;
        this.size++;
    }
    
    public int return_size(){
        return this.size;
    }
    
    @Override
    public String toString(){
        StringBuilder i = new StringBuilder();
        i.append("[");
        
        for(int x = 0; x < this.size - 1; x++){
            i.append(this.resources[x]);
            i.append(", ");
        }
        
        if(this.size > 0){
            i.append(this.resources[this.size-1]);
        }
        
        i.append("]");
        
        return i.toString();
    }
    
    public String read_by_position(int position) throws Exception{
        if(position >= 0 && position < size){
            return resources[position];
        }
        else{
            throw new Exception("Posicao invalida.");
        }
    }
    
    public void update(int position, String nome_taxista, String destino, int km, double taximetro) throws Exception{
        if(position >= 0 && position < size){
            this.resources[position] = 
                "Taxista: " + nome_taxista + 
                ", Destino: " + destino + 
                ", KM: " + km + 
                ", Taximetro: R$" + taximetro;
        }
        else{
            throw new Exception("Posição inválida.");
        } //NOTA: O MÉTODO ALTERAR SÓ FUNCIONA SE O VETOR DIGITADO FOR EXISTENTE, CASO SEJA DIGITADO VETOR: 9, E NÃO HOUVER VETOR 9, NÃO IRÁ ALTERAR NADA.
    }
   
    public void remove(int position) throws Exception{
        if(position >= 0 && position < size){
            for(int x = position; x < this.size - 1; x++){
                this.resources[x] = this.resources[x + 1];
            }
            resources[size - 1] = null;
            this.size--;
            System.out.println("Vetor removido.");
        }
        else{
            throw new Exception("Posicao invalida.");
        }
    }
}
