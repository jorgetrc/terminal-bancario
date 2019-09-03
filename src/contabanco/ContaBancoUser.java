package contabanco;

/**
 * Class para criar conta para o usuário
 * @author jl
 */
public class ContaBancoUser {
//Atributos

    private int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-------------------------------");

    }
    
    // Métodos
    
    /**
     * Cria uma nova conta com saldo passando o tipo da conta
     * @param t Tipo da conta CC | CP
     */
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    /**
     * Fechar conta
     */
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Salque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int v;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
    }

    
    public ContaBancoUser() {
        this.saldo = 0;
        this.status = false;
    }
    
    /**
     * Colocando número da conta
     * @param n Número conta 
     */
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    /**
     * Retornar número da conta
     * @return int
     */
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus(boolean status) {
        return status;
    }

    public void setSatus(boolean status) {
        this.status = status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    private boolean getStatus() {
        return status;
    }
}
