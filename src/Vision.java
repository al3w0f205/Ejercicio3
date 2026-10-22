public class Vision {
    private String nombre;
    private String color;
    private int memoria;

    public Vision() {
        this.nombre = "Vision";
        this.color = "Rojo";
        this.memoria = 100;
    }

    public Vision(String nombre) {
        this.nombre = nombre;
        this.color = "Rojo";
        this.memoria = 50;
    }

    public Vision(String nombre, String color, int memoria) {
        this.nombre = nombre;
        this.color = color;
        setMemoria(memoria);
    }

    public Vision(Vision otro) {
        this.nombre = otro.nombre;
        this.color = otro.color;
        this.memoria = otro.memoria;
    }

    public String getNombre() { return nombre; }
    public String getColor() { return color; }
    public int getMemoria() { return memoria; }

    public void setMemoria(int memoria) {
        this.memoria = Math.max(0, Math.min(100, memoria));
    }

    public void mostrar() {
        System.out.println(nombre + " | " + color + " | memoria " + memoria);
    }

    public void recordar(int cantidad) {
        setMemoria(memoria + cantidad);
    }

    public void recordar(int cantidad, int veces) {
        recordar(cantidad * veces);
    }

    public void borrarMemoria() {
        setMemoria(0);
    }

    public void cambiarColor(String color) {
        this.color = color;
    }

    public int diferenciaMemoria(Vision otra) {
        int diferencia = Math.abs(memoria - otra.memoria);
        return diferencia;
    }

    public String codigo() {
        int corte = Math.min(3, nombre.length());
        String codigo = nombre.substring(0, corte).toUpperCase() + "-" + memoria;
        return codigo;
    }
}
