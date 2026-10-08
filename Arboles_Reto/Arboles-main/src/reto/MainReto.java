package reto;

import arboles.modelo.Nodo;
import arboles.negocio.ArbolBinario;
import arboles.app.VistaArbol;

public class MainReto {

    public static void main(String[] args) {
        // Parte 1: construir el arbol A
        ArbolBinario<String> arbolA = new ArbolBinario<>();
        Nodo<String> ltx = arbolA.crearRaiz("LTX");
        Nodo<String> atf = arbolA.agregarIzquierdo(ltx, "ATF");
        Nodo<String> mch = arbolA.agregarDerecho(ltx, "MCH");
        arbolA.agregarIzquierdo(atf, "TUA");
        arbolA.agregarDerecho(atf, "IBB");
        Nodo<String> snc = arbolA.agregarIzquierdo(mch, "SNC");
        arbolA.agregarDerecho(mch, "OCC");
        arbolA.agregarIzquierdo(snc, "LGQ");

        System.out.println("=== PARTE 1: ARBOL A ===");
        VistaArbol.mostrar(arbolA);

        // Parte 2: consultar sus datos
        System.out.println("\n=== PARTE 2: CONSULTAS ===");
        System.out.println("Raiz: " + arbolA.getRaiz().getDato());
        System.out.println("Cantidad de nodos: " + arbolA.contarNodos());
        System.out.println("Cantidad de hojas: " + arbolA.contarHojas());
        System.out.println("Altura: " + arbolA.altura());
        System.out.println("Grado de LTX: " + ltx.grado());
        System.out.println("Grado de SNC: " + snc.grado());

        // Parte 3: construir el arbol B
        ArbolBinario<String> arbolB = new ArbolBinario<>();
        Nodo<String> gps = arbolB.crearRaiz("GPS");
        Nodo<String> scy = arbolB.agregarDerecho(gps, "SCY");
        Nodo<String> mrr = arbolB.agregarDerecho(scy, "MRR");
        Nodo<String> ptz = arbolB.agregarDerecho(mrr, "PTZ");
        arbolB.agregarDerecho(ptz, "TPN");

        System.out.println("\n=== PARTE 3: ARBOL B ===");
        VistaArbol.mostrar(arbolB);
        System.out.println("esCadena(A): " + esCadena(arbolA));
        System.out.println("esCadena(B): " + esCadena(arbolB));
        System.out.println("El arbol B se parece a una lista; buscar un dato puede requerir recorrer todos sus nodos.");

        // Casos limite
        System.out.println("\n=== CASOS LIMITE ===");
        ArbolBinario<String> vacio = new ArbolBinario<>();
        System.out.println("Arbol vacio: " + esCadena(vacio));
        ArbolBinario<String> uno = new ArbolBinario<>();
        uno.crearRaiz("UNO");
        System.out.println("Un solo nodo: " + esCadena(uno));
        try {
            arbolA.agregarIzquierdo(ltx, "OTRO");
        } catch (IllegalStateException e) {
            System.out.println("Hijo ocupado: " + e.getMessage());
        }
    }

    static boolean esCadena(ArbolBinario<String> arbol) {
        if (arbol.esVacio()) {
            return false;
        }
        return arbol.altura() == arbol.contarNodos() - 1;
    }
}
