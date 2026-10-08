# Introducción a los árboles: Grupo 1

Estructura de Datos, UTA FISEI, Software Nivel III. Docente: José Rubén Caiza Caizabuano. Exposición: jueves 08/10/2026.

## Integrantes

| Integrante    | Rol          |
| ------------- | ------------ |
| Josue Camacho | Coordinación |
| Mateo Chalco  | Código       |
| Luis Silva    | Revisión     |

## Contenido de la exposición

- Terminología: raíz, nodo, arco, padre e hijo, hoja, grado.
- Nivel y altura: la altura se cuenta en aristas.
- Árbol general y árbol binario.
- Clase `Nodo<T>`.
- Armado de un árbol a mano.
- Reto del campeonato.

## Estructura del proyecto

```
Arboles-main/
  README.md
  .gitignore
  src/
    arboles/
      modelo/Nodo.java
      negocio/ArbolBinario.java
      app/Main.java
      app/MainInteractivo.java
      app/ConsolaArbol.java
      app/VistaArbol.java
    reto/
      RETO.md
      MainReto.java
      MainRetoInteractivo.java
      solucion/MainRetoSolucion.java
      pruebas/PruebasArbol.java
  docs/
    CASOS-DE-PRUEBA.md
    DIAGRAMA-CLASES.md
    DIAGRAMA-SECUENCIA.md
    DIAGRAMAS-FLUJO.md
    MATERIAL-USADO.md
    QUIZ.md
    img/
  presentacion/
    Introduccion_a_los_arboles_Grupo_1.pptx
    Introduccion_a_los_arboles_Grupo_1.pdf
  evidencia/
    banco_preguntas.md
    capturas_kahoot/
```

- `arboles/modelo`: clase `Nodo<T>`.
- `arboles/negocio`: clase `ArbolBinario<T>` con sus operaciones.
- `arboles/app`: demostración, menú interactivo y vista del árbol en consola.
- `reto`: enunciado, plantilla, solución y pruebas del reto del campeonato.

## Cómo ejecutar

Requisito: JDK 17 o superior. Comandos desde la raíz del proyecto.

Compilar (Linux o macOS):

```
javac -encoding UTF-8 -d out $(find src -name "*.java")
```

Compilar (Windows PowerShell):

```
javac -encoding UTF-8 -d out (Get-ChildItem -Recurse src -Filter *.java).FullName
```

Ejecutar:

| Qué               | Comando                                       |
| ----------------- | --------------------------------------------- |
| Demostración      | `java -cp out arboles.app.Main`               |
| Menú interactivo  | `java -cp out arboles.app.MainInteractivo`    |
| Reto              | `java -cp out reto.MainReto`                  |
| Reto interactivo  | `java -cp out reto.MainRetoInteractivo`       |
| Solución del reto | `java -cp out reto.solucion.MainRetoSolucion` |
| Pruebas           | `java -cp out reto.pruebas.PruebasArbol`      |

En VS Code también se puede abrir cualquiera de esas clases y usar Run.

## Evidencia y enlaces

| Elemento                                 | Enlace o ruta                                         |
| ---------------------------------------- | ----------------------------------------------------- |
| Informe en Canva                         | `[PEGAR ENLACE]`                                      |
| Diapositivas en Canva                    | `[PEGAR ENLACE]`                                      |
| Diapositivas en PDF                      | `presentacion/Introduccion_a_los_arboles_Grupo_1.pdf` |
| Actividad interactiva (Kahoot o Quizizz) | `[PEGAR ENLACE]`                                      |
| Banco de preguntas                       | `evidencia/banco_preguntas.md`                        |
| Capturas de la actividad                 | `evidencia/capturas_kahoot/`                          |

## Participación

Cada integrante hizo sus propios commits en este repositorio.
