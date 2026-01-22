public class Celda  implements InterfazCelda{
    private boolean revelado = false; // indica si la celda fue revelada 
    private boolean marcado = false; //indica si la celda esta marcada, es deicr, marcada con una bandera 
    private boolean tieneMina; // indica si la celda tiene una mina 

    // este es constructor, que crea una celda e indica si esta esta vacia o esta tiene una mina 
    public Celda(boolean tieneMina) {
        this.tieneMina = tieneMina;
    }
    // este devuelve un -1 si la celda tiene una mina, o el numero de minas cerca 
    public int siExplota(int minasCercanas) {
        if (tieneMina) {
            return -1;
        } else  {
            return minasCercanas;
        }
    }
// retorna si la celda contiene la mina 
    public boolean tieneMina() {
        return tieneMina;
    }
// este revela la celda
    public void revelar() {
        this.revelado = true;
    }
//indica si la celda fue revelada
    public boolean estaRevelado() {
        return revelado;
    }
// maraca o desmarca la celda por medio de la bandera 
    public boolean marcar() {
        this.marcado = (this.marcado ? true : false);
        return marcado;
    }
// este indica si la celda en efecto esta maracada 
    public boolean estaMarcado() {
        return marcado;
    }
}
