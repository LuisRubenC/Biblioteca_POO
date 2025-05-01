# Menú BibliotecaApp

**Descripción**

**BibliotecaApp** es una aplicación sencilla escrita en Java que simula la gestión de recursos bibliográficos en una biblioteca. El programa permite interactuar con libros y revistas, y proporciona opciones como consultar recursos disponibles, prestar y devolver recursos.

**Características**
- Interfaz de texto interactiva: Menú sencillo para realizar operaciones en la biblioteca.
- Manejo de Recursos: Libros y revistas disponibles para préstamo y devolución.
- Gestión de Usuario: Simulación de un usuario que interactúa con los recursos bibliográficos.

**Estructura del Código**

El código está organizado en las siguientes clases:
1. BibliotecaApp: Clase principal que contiene el menú interactivo.
2. RecursoBibliografico: Clase base para representar recursos bibliográficos generales.
3. Libro: Subclase específica que representa libros.
4. Revista: Subclase específica que representa revistas.
5. Usuario: Clase que gestiona los recursos prestados por el usuario.

**Clases y Métodos Principales**

- **RecursoBibliografico** `mostrarDetalle()`: Método para mostrar detalles de cada recurso.
- **Libro** Hereda de `RecursoBibliografico` e incluye atributos como título, autor e ISBN.
- **Revista** Hereda de `RecursoBibliografico` e incluye atributos como ISSN, año y número de edición.
- **Usuario** :
`prestarRecurso(RecursoBibliografico recurso)`: Método para que el usuario preste un recurso.

`devolverRecurso(RecursoBibliografico recurso)`: Método para devolver un recurso previamente prestado.

# Usuario

Para esta clase se importan dos bibliotecas: List y ArrayList, permitiendo usar el tipo de variable List.

Se inicializa una variable llamada "nombre" de tipo String y una "lista" que guardará objetos de "RecursosBibliograficos" llamada *recursosPrestados*.
También, se crea un constructor en donde se inicializa tanto nombre como recursosPrestados.

En la primera función denominada *prestarRecurso* pide como parámetro un objeto de tipo RecursoBibliografico llamado recurso; en ella, se agrega un RecursoBibliografico en la lista previamente inicializada empleando la función ".add".

La otra función es denominada *devolverRecurso* pide como parámetro un objeto de tipo RecursoBibliografico llamado recurso; en ella, se elimina un RecursoBibliografico en la lista previamente inicializada empleando la función ".remove".

# RecursoBiblilográfico

Esta clase es polimórfica (abstracta), aqí se inicializan dos variables públicas de tipo String (titulo y autor).

Se genera un constructor para inicializar las variables antes mencionadas; por último, se genera una función abstracta que se heredará a las clases hijas "Libro" y "Revista", dicha función se llama "mostrarDetalle".

# Revista

Esta clase se hereda de la clase "RecursosBibliograficos" por lo tanto, se heredan las mismas variables de su padre; además, se crean un par de variables de tipo entero: "anioPublicacion" y "ejemplares". Se genera un constructor en donde se inicializan las variables.

La función heredada de la clase padre, al ser abstracta, se reescribirá. Usando la palabra reservada "@Override" para indicar que se reescribe la función.

La función "mostrarDetalle" para la clase Revista funciona, como su nombre lo indica, para mostrar en pantalla los detalles de un objeto de tipo Revista.

# Libro

Esta clase se hereda de la clase "RecursosBibliograficos" por lo tanto, se heredan las mismas variables de su padre; además, se crean un par de variables: "edicion" de tipo String y "prestado" de tipo booleano. Se genera un constructor en donde se inicializan las variables.

La función heredada de la clase padre, al ser abstracta, se reescribirá. Usando la palabra reservada "@Override" para indicar que se reescribe la función.

La función "mostrarDetalle" para la clase Libro funciona, como su nombre lo indica, para mostrar en pantalla los detalles de un objeto de tipo Libro.

Para mostrar el estado del libro se utiliza el valor "true" para indicar que está prestado, si es "false" está disponible para préstamo.

