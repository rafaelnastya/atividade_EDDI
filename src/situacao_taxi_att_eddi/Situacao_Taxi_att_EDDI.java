package situacao_taxi_att_eddi;

import java.util.Scanner;

public class Situacao_Taxi_att_EDDI{

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String nome_taxista, destino;
        int vetorsize, km, qtdevetor;
        double taximetro, valor_km;
            
        qtdevetor = 0;
        System.out.println("Insira a quantidade de viagens que incluira: "); //tamanho do vetor
        vetorsize = scan.nextInt();
        Vetor_taxi vetor = new Vetor_taxi(vetorsize);
        
        while(qtdevetor < vetorsize)
        {
            System.out.println("\nInserindo dados da " + (qtdevetor + 1) + "ª Viagem:");
            //interação com o usuário
            System.out.println("Insira o nome do taxista: ");
            nome_taxista = scan.next();
        
            System.out.println("Insira o destino da viagem: ");
            destino = scan.next();
        
            System.out.println("Insira os quilometros percorridos na viagem: ");
            km = scan.nextInt();
        
            System.out.println("Insira o valor dado no taximetro: ");
            taximetro = scan.nextDouble();
            
            valor_km = taximetro / km;
            System.out.println("O valor do quilometro da sua viagem foi R$" + valor_km);
        
            vetor.insert(nome_taxista, destino, km, taximetro); //inserindo dados no vetor
            System.out.println("Vetor: " + vetor.toString()); //mostrando as informações do inseridas
            System.out.println("Tamanho do vetor: " + vetor.return_size()); //retorna o tamanho do vetor
            
            System.out.println(vetor.read_by_position(0)); //retorna o vetor da posicao especificada
            
            //NOTA: O MÉTODO ALTERAR SÓ FUNCIONA SE O VETOR DIGITADO FOR EXISTENTE, CASO SEJA DIGITADO VETOR: 9, E NÃO HOUVER VETOR 9, NÃO IRÁ ALTERAR NADA.
            System.out.println("Deseja alterar um vetor? (S ou N)");
            String opcao0 = scan.next();
            if(opcao0.equalsIgnoreCase("S")){
                
                System.out.println("Informe a posicao do vetor a ser alterado: ");
                int position = scan.nextInt();
                
                System.out.println("Informe o novo nome do taxista: ");
                nome_taxista = scan.next();
        
                System.out.println("Informe o novo destino da viagem: ");
                destino = scan.next();
        
                System.out.println("Informe os novos quilometros percorridos na viagem: ");
                km = scan.nextInt();
        
                System.out.println("Informe o novo valor dado no taximetro: ");
                taximetro = scan.nextDouble();
                
                valor_km = taximetro / km;
                System.out.println("O novo valor do quilometro da sua viagem será R$" + valor_km);
                
                // Atualiza a viagem no vetor
                vetor.update(position, nome_taxista, destino, km, taximetro); 
                System.out.println("Vetor apos alteracao: " + vetor.toString());
            }
            
            //remover um vetor; 
            System.out.println("Voce deseja remover um vetor? (S ou N)");
            String opcao = scan.next();
            if(opcao.equalsIgnoreCase("S")){
                System.out.println("Informe o vetor a ser removido: ");
                int position = scan.nextInt();
                vetor.remove(position);
            }
            
            qtdevetor++; //repete o laço caso o usuario defina o numero de vetores maior que 1
        }
    }
    
}
