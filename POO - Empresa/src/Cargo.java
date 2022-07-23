public class Cargo {
    int numCargo;
    float valorhoraTrab;

    public Cargo(int numCargo, float valorhoraTrab) {
        this.numCargo = numCargo;
        this.valorhoraTrab = valorhoraTrab;
    }

    public Cargo() {

    }

    public int getNumCargo() {
        return numCargo;
    }

    public void setNumCargo(int numCargo) {
        this.numCargo = numCargo;
    }

    public float getValorhoraTrab() {
        return valorhoraTrab;
    }

    public void setValorhoraTrab(float valorhoraTrab) {
        this.valorhoraTrab = valorhoraTrab;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "numCargo=" + numCargo +
                ", horaTrab=" + valorhoraTrab +
                '}';
    }
}

