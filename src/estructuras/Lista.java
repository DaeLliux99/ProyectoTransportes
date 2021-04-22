
package estructuras;

import java.io.Serializable;
import java.util.Collections;
import nodos.Nodo;
import modelos.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Lista<G> implements Iterable<G> , Serializable {

    Nodo cabeza;
    Nodo ultimo;
    public int longitud;
    public int idControlador;

    public Lista() {
        cabeza = null;
        longitud = 0;
    }

    public void insertarInicio(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            cabeza = nodo;
            ultimo = nodo;
        } else {
            nodo.siguiente = this.cabeza;
            this.cabeza = nodo;
        }
        this.longitud++;
        this.idControlador++;
    }

    public void insertarFinal(G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
            this.ultimo = nodo;
        } else {
            ultimo.siguiente = nodo;
            ultimo = nodo;
        }
        this.longitud++;
        this.idControlador++;
    }

    public void insertarEnIndice(int indice, G dato) {
        Nodo<G> nodo = new Nodo<>(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo;
            this.ultimo = nodo;
            this.longitud++;
            this.idControlador++;
        } else if (indice == 1) {
            this.insertarInicio(dato);
        } else if (indice == this.longitud) {
            this.insertarFinal(dato);
        } else {
            Nodo puntero = this.cabeza;
            int posicion = 1;
            while (puntero.siguiente != null && posicion < indice - 1) {
                puntero = puntero.siguiente;
                posicion++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
            this.longitud++;
            this.idControlador++;
        }
    }

    public <G extends Comparable<? super G>> void eliminar(G dato) {
        Nodo<G> temp, cabeza1 = cabeza;
        if (cabeza == null) {
            System.out.println("lista vacia");
        } else {
            if (dato.compareTo(cabeza1.valor) == 0) {
                cabeza = cabeza.siguiente;
                System.out.println("eliminado 1");
            } else {
                temp = cabeza1;
                cabeza1 = cabeza1.siguiente;
                while (cabeza1 != null) {
                    if (dato.compareTo(cabeza1.valor) == 0 && cabeza1.siguiente != null) {
                        temp.siguiente = cabeza1.siguiente;
                        System.out.println("eliminado 2");
                    } else if (dato.compareTo(cabeza1.valor) == 0) {
                        temp.siguiente = null;
                        ultimo = temp;
                        System.out.println("eliminado 3");
                    }
                    temp = cabeza1;
                    cabeza1 = cabeza1.siguiente;
                }
            }
        }
    }

    public void eliminarUltimo() {
        if (this.cabeza != null) {
            Nodo eliminado;
            if (this.cabeza.siguiente != null) {
                Nodo puntero = this.cabeza;
                while (puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                ultimo = puntero;
                eliminado = puntero.siguiente;
                puntero.siguiente = null;
            } else {
                eliminado = this.cabeza;
                this.cabeza = null;
                ultimo = null;
            }
            eliminado = null;
            this.longitud--;
        }
    }

    public G BuscarXDato(G dato) {
        if (this.cabeza == null) {
            System.out.println("\nLa lista está vacia, no hay datos para buscar ...\n");
        } else {
            Nodo temp = cabeza;
            Nodo temp2;
            boolean bandera = false;
            do {
                if (temp.valor == dato) {
                    bandera = true;
                }
                temp2 = temp;
                temp = temp.siguiente;
            } while (!bandera && temp != null);
            if (bandera) {
                return (G) temp2.getValor();
            } else {
                System.out.println("\nEl dato no existe\n");
            }
        }
        return null;
    }

    public int obtenerLongitud() {
        return longitud;
    }

    public G obetenerPrimerObjeto() {
        if (cabeza != null) {
            Object obj = cabeza.getValor();
            return (G) obj;
        }
        return null;
    }

    public G obetenerUltimoObjeto() {
        if (ultimo != null) {
            Object obj = ultimo.getValor();
            return (G) obj;
        }
        return null;
    }

    public Nodo ObetenerPrimerNodo() {
        Nodo obj = cabeza;
        return obj;
    }

    public Nodo ObetenerUltimoNodo() {
        Nodo obj = ultimo;
        return obj;
    }

    public void mostrarLista() {
        Nodo puntero = cabeza;
        while (puntero != null) {
            System.out.println(puntero.valor.toString());
            puntero = puntero.siguiente;
        }
    }

    public String getListaString() {
        Nodo puntero = cabeza;
        String s = "";
        while (puntero != null) {
            System.out.println(puntero.valor.toString());
            s = s + puntero.valor.toString();
            puntero = puntero.siguiente;
        }
        return s;
    }

    public Nodo ObetenerPorIndiceNodo(int i) {
        if (i < longitud && i >= 0) {
            Nodo puntero = cabeza;
            int a = 0;
            while (puntero != null) {
                if (a == i) {
                    return puntero;
                }
                puntero = puntero.siguiente;
                i++;
            }

        }
        System.out.println("fuera de arreglo");
        return null;
    }

    public G ObetenerPorIndiceObjeto(int i) {
        int a = 0;
        if (i < longitud && i >= 0) {
            Nodo puntero = cabeza;

            while (puntero != null) {
                if (a == i) {
                    return (G) puntero.valor;
                }
                puntero = puntero.siguiente;
                a++;
            }

        }
        System.out.println("fuera de arreglo");
        return null;
    }

    @Override

    public Iterator<G> iterator() {
        if (this.cabeza == null) {
            return Collections.<G>emptyList().iterator();
        }
        return new Iterator<G>() {
            private Nodo<G> nodoActual = null;

            @Override
            public boolean hasNext() {
                return nodoActual != ultimo;
            }

            @Override
            public G next() {
                if (nodoActual == null) {
                    nodoActual = cabeza;
                    return nodoActual.valor;
                }
                if (nodoActual.siguiente == null) {
                    throw new NoSuchElementException();
                }
                nodoActual = nodoActual.siguiente;
                return nodoActual.valor;
            }
        };
    }
}
