package codegenerator;

import ast.Type;
import ast.expressions.Cast;
import ast.types.CharType;
import ast.types.IntType;

import java.io.PrintWriter;

public class CodeGenerator {

    private int labels = 0;
    private PrintWriter out;

    public CodeGenerator(String outputFileName, String sourceFileName){
        try {
            out = new PrintWriter(outputFileName);
        } catch (Exception e) {
            System.err.println("Error al abrir el fichero " + outputFileName);
            System.exit(-1);
        }
    }

    /**
     * Para los comentarios
     */
    public void comment(String comment) {
        out.println("\t' * " + comment);
    }

    public int getLabels(){ return labels; }

    // --------------- INSTRUCTIONS ---------------
    // --------------- MAIN INVOCATION y HALT ---------------
    public void mainCall() {
        out.println("\n' Invocation main function");
        out.println("call main");
        out.flush();
    }

    public void halt(){
        out.println("halt");
        out.println();
        out.flush();
    }

    // --------------- PUSH ---------------
    /**
     * Introduce un carácter (1 byte) en la pila
     */
    public void pushc(char b) {
        out.println("\tpushb\t" + b);
        out.flush();
    }

    /**
     * Introduce un número entero (2 bytes) en la pila
     */
    public void pushi(int i) {
        out.println("\tpushi\t" + i);
        out.flush();
    }

    /**
     * Introduce un número real (4 bytes) en la pila
     */
    public void pushf(double f) {
        out.println("\tpushf\t" + f);
        out.flush();
    }

    /**
     * Introduce una dirección (2 bytes) en la pila
     */
    public void pusha(int dir) {
        out.println("\tpusha\t" + dir);
        out.flush();
    }

    /**
     * Introduce el valor del registro bp (2 bytes)
     */
    public void pushBP() {
        out.println("\tpusha\t");
        out.flush();
    }

    // --------------- POP ---------------
    /**
     * Extrae 1, 2 o 4 bytes, respectivamente, de la pila
     */
    public void pop(Type t) {
        out.println("\tpop" + t.suffix());
        out.flush();
    }

    // --------------- DUP ---------------
    /**
     * Extrae 1, 2 o 4 bytes de la pila
     */
    public void dup(Type t) {
        out.println("\tdup" + t.suffix());
        out.flush();
    }

    // --------------- LOAD ---------------
    /**
     * 1. Extrae una dirección de memoria de la pila (2 bytes)
     * 2. Introduce en la pila el contenido (1, 2 o 4 bytes) de la
     * dirección extraída en el paso anterior
     */
    public void load(Type t) {
        out.println("\tload" + t.suffix());
        out.flush();
    }

    // --------------- STORE ---------------
    /**
     * 1. Extrae 1, 2 o 4 bytes de la pila
     * 2. Extrae una dirección de memoria de la pila (2 bytes)
     * 3. El contenido de la dirección de memoria es reemplazado
     *    con el valor extraído en el primer paso
     */
    public void store(Type t) {
        out.println("\tstore" + t.suffix());
        out.flush();
    }

    // --------------- ARITHMETICS ---------------
    public void add(Type t) {
        out.println("\tadd" + t.suffix());
        out.flush();
    }

    public void addi() {
        out.println("\taddi");
        out.flush();
    }

    public void sub(Type t) {
        out.println("\tsub" + t.suffix());
        out.flush();
    }

    public void mul(Type t) {
        out.println("\tmul" + t.suffix());
        out.flush();
    }

    public void muli() {
        out.println("\tmuli");
        out.flush();
    }

    public void div(Type t) {
        out.println("\tdiv" + t.suffix());
        out.flush();
    }

    public void mod(Type t) {
        out.println("\tmod" + t.suffix());
        out.flush();
    }

    // --------------- COMPARATIONS ---------------
    public void gt(Type t) {
        out.println("\tgt" + t.suffix());
        out.flush();
    }

    public void lt(Type t) {
        out.println("\tlt" + t.suffix());
        out.flush();
    }

    public void ge(Type t) {
        out.println("\tge" + t.suffix());
        out.flush();
    }

    public void le(Type t) {
        out.println("\tle" + t.suffix());
        out.flush();
    }

    public void eq(Type t) {
        out.println("\teq" + t.suffix());
        out.flush();
    }

    public void ne(Type t) {
        out.println("\tne" + t.suffix());
        out.flush();
    }

    // --------------- LOGICALS ---------------
    public void and() {
        out.println("\tand");
        out.flush();
    }

    public void or() {
        out.println("\tor");
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }

    // --------------- INPUT Y OUTPUT ---------------

    /**
     * Lee un valor del teclado e introduce su representación
     * binaria en la pila
     */
    public void in(Type t) {
        out.println("\tin" + t.suffix());
        out.flush();
    }

    /**
     * Extrae un valor de la pila (1, 2 o 4 bytes)
     * y lo muestra en la consola
     */
    public void out(Type t) {
        out.println("\tout" + t.suffix());
        out.flush();
    }

    // --------------- CONVERSIONS ---------------
    public void cast(Cast cast) {
        if(cast.getType() instanceof IntType){
            if(cast.getTypeCast() instanceof CharType){
                out.println("\ti2b");
            } else {
                out.println("\ti2f");
            }
        } else if(cast.getType() instanceof CharType) {
            if(cast.getTypeCast() instanceof IntType){
                out.println("\tb2i");
            } else {
                out.println("\tb2f");
            }
        } else {
            if(cast.getTypeCast() instanceof IntType){
                out.println("\tf2i");
            } else {
                out.println("\tf2b");
            }
        }
        out.flush();
    }

    // --------------- SALTOS ---------------
    /**
     * Extrae un valor de la pila (1, 2 o 4 bytes)
     * y lo muestra en la consola
     */
    public void out(Type t) {
        out.println("\tout" + t.suffix());
        out.flush();
    }
}
