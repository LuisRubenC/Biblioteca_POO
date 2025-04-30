# Libro

Esta clase se hereda de la clase "RecursosBibliograficos" por lo tanto, se heredan las mismas variables de su padre; además, se crean un par de variables: "edicion" de tipo String y "prestado" de tipo booleano. Se genera un constructor en donde se inicializan las variables.

La función heredada de la clase padre, al ser abstracta, se reescribirá. Usando la palabra reservada "@Override" para indicar que se reescribe la función.

La función "mostrarDetalle" para la clase Libro funciona, como su nombre lo indica, para mostrar en pantalla los detalles de un objeto de tipo Libro.

Para mostrar el estado del libro se utiliza el valor "true" para indicar que está prestado, si es "false" está disponible para préstamo.
