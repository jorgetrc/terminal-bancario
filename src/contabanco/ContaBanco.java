/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author jl
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancoUser p1 = new ContaBancoUser();
        p1.setNumConta(1111);
        p1.setDono("Pedro");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.fecharConta();
        p1.estadoAtual();
        
                
        ContaBancoUser p2 = new ContaBancoUser();
        p2.setNumConta(2222);
        p2.setDono("Ana");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(1000);
        p2.estadoAtual();
        
        ContaBancoUser p3 = new ContaBancoUser();
        p3.setNumConta(23223);
        p3.setDono("Felipe");
        p3.abrirConta("CC");
        
        
        
    }
}

