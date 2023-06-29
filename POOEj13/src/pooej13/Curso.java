/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package pooej13;

import java.util.Scanner;

public class Curso {

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadHorasPorSemana;
    private String turno;
    private int precioHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadHorasPorSemana, String turno, int precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadHorasPorSemana() {
        return cantidadHorasPorSemana;
    }

    public void setCantidadHorasPorSemana(int cantidadHorasPorSemana) {
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos(String[] a) {
        Scanner read1 = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresa por favor el nombre del alumno:");
            a[i] = read1.next();

        }
    }

    public void crearCurso(Curso c) {
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor ingresa los siguientes datos: ");

        System.out.println("Nombre del curso:");
        c.setNombreCurso(read.next());

        System.out.println("Cantidad de horas por dia:");
        c.setCantidadHorasPorDia(read.nextInt());

        System.out.println("Cantidad de horas por semana: ");
        c.setCantidadHorasPorSemana(read.nextInt());

        System.out.println("Turno dia o noche: ");
        c.setTurno(read.next());

        System.out.println("Precio de la hora de trabajo:");
        c.setPrecioHora(read.nextInt());

        System.out.println("Nombre de los 5 alumnos: ");
        cargarAlumnos(alumnos);

    }
    
    public void calcularGananciaSemanal(Curso c){
        int gananciaSemanal = (c.getCantidadHorasPorSemana() * 5) * c.getPrecioHora();
        System.out.println("La ganancia semanal es : " + gananciaSemanal);
    }
}
