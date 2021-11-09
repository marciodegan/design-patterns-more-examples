package gumball;

public class GumballMachine {

    // os 4 estados
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    // variável de instância que será usada para armazenar o estado em que estamos. Começa no SOLD_OUT.
    int state = SOLD_OUT;
    int count = 0; // segunda variavel de instancia que armazena o número de gomas na máquina.

    /* o construtor receber uma contagem inicial das gomas. Se o valor for diferente de zero, a maquina entra no estado NO_QUARTER
    o que significa que ela está esperando que alguém insira uma moeda. Caso contrário, a máquina permanece no estado SOLD_OUT.*/
    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insereMoeda() {                 // quando uma moeda é inserida, se
        if (state == HAS_QUARTER) {             // uma moeda já foi inserida, avisamos o cliente
            System.out.println("INSERT: A coin is already inserted | HAS_QUARTER");
        } else if (state == NO_QUARTER) {       // caso contrário, aceitamos a moeda e passamos para o estado HAS_QUARTER
            state = HAS_QUARTER;
            System.out.println("INSERT: You inserted a quarter | NO_QUARTER to HAS_QUARTER");
        } else if (state == SOLD_OUT) {         // e, se a máquina estiver vazia, rejeitamos a moeda
            System.out.println("INSERT: You can´t insert a quarter | SOLD_OUT to SOLD_OUT");
        } else if (state == SOLD) {             // se o cliente acabou de comprar, ele deverá aguardar até que transação seja concluída.
            System.out.println("INSERT: Please wait, we´re already giving you a gumball | SOLD to SOLD");
        }
    }

    public void ejetaMoeda() {                  // Se o cliente tenta remover a moeda
        if (state == HAS_QUARTER) {             // Se houver moeda, a maquina devolve e volta ao estado NO_QUARTER
            System.out.println("EJECT: Quarter returned | HAS_QUARTER to NO_QUARTER");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {       // Se não houver moeda, é claro que não podemos devolvê-la
            System.out.println("EJECT: trying to eject, but you haven´t inserted a quarter | NO_QUARTER to NO_QUARTER");
        } else if (state == SOLD) {             // Se o cliente acabou de acionar a alavanca, não podemos devolver a moeda, porque já recebeu o produto
            System.out.println("EJECT: Sorry, you already turned the crank | SOLD to SOLD");
        } else if (state == SOLD_OUT) {         // Não é possível ejetar se a maquina está vazia. nesse caso ela nao aceita moedas.
            System.out.println("EJECT: You can´t eject, you havent inserted a quarter yet | SOLD_OUT to SOLD_OUT");
        }
    }

    public void giraAlavanca() {
        if (state == SOLD) {
            System.out.println("CRANK: Turning twice doesn´t get you another gumball | SOLD to SOLD");
        } else if (state == NO_QUARTER) {
            System.out.println("CRANK: You turned but there´s no quarter | NO_QUARTER to NO_QUARTER");
        } else if (state == SOLD_OUT) {
            System.out.println("CRANK: Sorry, it´s empty | SOLD_OUT to SOLD_OUT");
        } else if (state == HAS_QUARTER) {
            System.out.println("CRANK: you turned the crank. Take your gumball | HAS_QUARTER to SOLD");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("DISPENSE: A gumball is coming out");
            count = count - 1;
            if (count == 0) {
                System.out.println("DISPENSE: Oops, out of gumballs");
                state = SOLD_OUT;               // Aqui é onde nós lidamos com a condição "gomas acabaram". Se esta foi a última, colocamos no estado SOLD_OUT
            } else {
                state = NO_QUARTER;             // caso contrário, voltamos ao estado de espera pela moeda.
            }
                                                // Estas situações jamais devem ocorrer, mas caso ocorram, emitimos um erro em vez de uma goma
        } else if (state == NO_QUARTER) {
            System.out.println("DISPENSE: You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("DISPENSE: No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("DISPENSE: No gumball dispensed");
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMáquina XPTO");
        result.append(" | Estoque atual: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nA máquina está: ");
        if (state == SOLD_OUT) {
            result.append("SOLD_OUT");
        } else if (state == NO_QUARTER) {
            result.append("NO_QUARTER | aguardando quarter");
        } else if (state == HAS_QUARTER) {
            result.append("HAS_QUARTER | aguardando girar alavanca");
        } else if (state == SOLD) {
            result.append("SOLD | delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}