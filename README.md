
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

