package situacao_taxi_att_eddi;

public class Vetor_taxi {
    public String[] resources;
    private int size;
    
    public Vetor_taxi(int fit){
        this.resources = new String[fit];
        this.size = 0;
    }
    
    public void insert(String resources) throws Exception{
        this.resources[this.size] = resources;
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
    
    public int read_by_equality(String data){
        for(int x = 0; 1 < size; x++){
            if(resources[x].equalsIgnoreCase(data)){
                return x;
            }
        }
        return -1;
    }
   
    public void remove(int position) throws Exception{
        if(position >= 0 && position < size){
            for(int x = position; x <= this.size -1; x++){
                this.resources[x] = this.resources[x+1];
            }
            this.size--;
        }
        else{
            throw new Exception("Posicao invalida.");
        }
    }
}
