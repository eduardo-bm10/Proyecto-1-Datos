# SPACE INVADERS

## ➔DESCRIPCIÓN BREVE
Crear un juego al estilo del clásico **Space Invaders**, un juego en el que el jugador es una nave espacial y debe de elimianr a sus oponentes los  invasores para asi ir ganando puntaje, el jugador deberá evitar que los enemigos lleguen a la parte inferior de la pantalla disparandoles y eliminandolos con su nave. 

Para el desarrollo de este proyecto se uso el lenguaje de programacion Java, se usaron ciertos patrones de diseño para lograr llegar a los objetivos que se pidieron.
Para la creación de los enemigos (los invasores), se tuvo que implementar el uso de listas enlazadas, en los que hay diferentes clases de enemigos, hay enemigos básicos y tambien un jefe que es más grande que los demás, estos enmigos se crean en forma de hileras y se desplazan horizontalmente, hacia abajo de la pantalla y en alguna ocasion la hilera de gira con el jefe como punto de rotación en sentido a las manecillas del reloj.

**En pantalla debe salir lo siguiente:**
```markdown
◆ El nivel actual.
◆ La cantidad de puntos del usuario.
◆ Y el tipo de hilera de enemigos que está en pantalla.
```
**Interacción usuario-juego.**
```markdown
La interacción del usuario con el juego es atraves del mouse, este podrá desplazar
su nave horizontalmente, la nave sigue el movimiento del mouse y tambien podrá 
disparar haciendo click en el boton izquierdo del mouse.
```

## ➔Planificación y administración del proyecto
Link a nuestro proyecto en jira [SPACE INVADERS- JIRA](https://algoritms-and-data-structures-project1.atlassian.net/jira/your-work), aquí se pueden ver todas las historias de usuario de nuestro equipo de trabajo.

◆ Plan de iteraciones que agrupen cada bloque de historias de usuario de forma
  que se vea un desarrollo incremental


### Historias de Usuario:
```markdown
◆ Como Desarrollador: Quiero crear una pantalla en la que puedo colocar los demás componentes del juego.

◆ Como Dessarrollador: quiero crear al personaje y que este se vea en la pantalla.

◆ Como Desarrollador: quiero implementar el movimiento del personaje y delimitar un limite de altura
  en el que esteno pueda subir más.

◆ Como Usuario: quiero disparar a los enemigos con click izquierdo.

◆ Como Desarrollador: quiero crear la hilera de enemigos y que esta se despliegue en la pantalla.

◆ Como Desarrollador: quiero lograr que los enemigos se muevan en dirección vertical y horizontal.

◆ Como Usuario: quiero ver el puntaje que llevo actualmente en pantalla.

◆ Como Usuario: quiero poder ver a que clase de enemigos me enfrento.

◆ Como Usuario: quiero enfrentarme a hileras de enemigos con diferentes características.

◆ Como Desarrollador: quiero implementar estructuras de datos lineales en mi programa.

◆ Como Usuario: quiero mover la nave hacia los lados utilizando el mouse.

◆ Como Usuario: quiero enfrentarme a diversos niveles de dificultad.

◆ Como Usuario: quiero que mi puntuación pueda ser muy alta.

◆ Como Desarrollador : quiero lograr que si un enemigo llega a la parte inferior de la pantalla el jugador pierda.

◆ Como Desarrollador : quiero lograr que las hileras de enemigos varíen aleatoriamente.

◆ Como Usuario: quiero ver en pantalla el tipo de la próxima hilera de enemigos en salir.
```


### Tareas por cada User Story:
```markdown
◆ Como Desarrollador: Quiero crear una pantalla en la que puedo colocar los demás componentes del juego.
    
    ◆ Crear clase Display para la pantalla principal.
    ◆ Modificar cada parámetro necesario de la ventana.
    ◆ Crear el panel principal donde se ubicarán todos los objetos en juego.

◆ Como Dessarrollador: quiero crear al personaje y que este se vea en la pantalla.

    ◆ Crear clase Player y sus atributos.
    ◆ Crear la clase de Movimiento que modifica las coordenadas mediante MouseEvent.
    ◆ Crear método para disparar.
    ◆ Añadir y testear la nave en pantalla utilizando el mouse.
    ◆ Buscar una imagen png representativa para el jugador.

◆ Como Desarrollador: quiero implementar el movimiento del personaje y delimitar un limite de altura
  en el que este no pueda subir más.
  
    ◆ Utilizar métodos Override de MouseEvent en la clase Movimiento para mover al personaje.
    ◆ Declarar una variable final para la altura del personaje, y sólo hacer modificable su coordenada x.
    ◆ Hacer que la nave esté en la misma posición del mouse en todo momento. 

◆ Como Usuario: quiero disparar a los enemigos con click izquierdo.

    ◆ Crear la clase PlayerMissile con todos los atributos y métodos del disparo.
    ◆ Establecer que sus coordenadas X y Y al inicio sean las mismas que las del jugador.
    ◆ Crear un método de movimiento que desplace el disparo hacia arriba, modificando su coordenada Y.
    ◆ Asegurarse de que sólo se genere un objeto PlayerMissile con cada click, ni más ni menos.  

◆ Como Desarrollador: quiero crear la hilera de enemigos y que esta se despliegue en la pantalla.

    ◆ Crear clase Enemy con sus respectivos atributos y métodos.
    ◆ Crear las clases para cada hilera requerida (Basic, ClassA, ClassB, ClassC, ClassD, ClassE).
    ◆ Declarar los principales atributos de las hileras.
    ◆ Crear un método para crear la hilera, el cual cree una lista enlazada y añada a los enemigos.
    ◆ Encargarse de mostrar a cada enemigo de la hilera en pantalla.

◆ Como Desarrollador: quiero lograr que los enemigos se muevan en dirección vertical y horizontal.

    ◆ Crear método de movimiento en la clase Enemy.
    ◆ Declarar las coordenadas X y Y del enemigo.
    ◆ Modificar las coordenadas de forma iterativa dentro del método de movimiento, verificando los límites de la pantalla.

◆ Como Usuario: quiero ver el puntaje que llevo actualmente en pantalla.

    ◆ Crear clase Points y declarar una variable para la cantidad de puntos.
    ◆ Crear método que actualice la cantidad de puntos cuando el jugador derrote a un enemigo.
    ◆ Añadir el contador de puntos al panel principal en forma de JLabel.

◆ Como Usuario: quiero poder ver a que clase de enemigos me enfrento.

    ◆ Crear y añadir un JLabel que informe el tipo de hilera actual en pantalla.

◆ Como Usuario: quiero enfrentarme a hileras de enemigos con diferentes características.

    ◆ Crear clase Boss y que extienda de Enemy.
    ◆ Crear método para crear hileras que incluyan al objeto Boss.
    ◆ Crear método movimientoBoss que alterne al jefe entre los demás enemigos.
    ◆ Crear hilera que contenga enemigos con diferente cantidad de vidas.

◆ Como Desarrollador: quiero implementar estructuras de datos lineales en mi programa.

    ◆ Crear clase de DoubleLinkedList y CircularLinkedList con sus respectivos nodos.
    ◆ Implementar las clases para crear las hileras.

◆ Como Usuario: quiero mover la nave hacia los lados utilizando el mouse.

    ◆ Modificar y delimitar las coordenada X de la nave mediante el mouse.
    
◆ Como Usuario: quiero enfrentarme a diversos niveles de dificultad.

    ◆ Crear clase Level.
    ◆ Crear método cambiarDificultad que aumente la velocidad de los enemigos luego de un tiempo.

◆ Como Usuario: quiero que mi puntuación pueda ser muy alta.

    ◆ Crear y declarar la variable de la puntuación de tipo "long", en caso de que el jugador realice muchos puntos.

◆ Como Desarrollador : quiero lograr que si un enemigo llega a la parte inferior de la pantalla el jugador pierda.

    ◆ Crear método muerteJugador que verifique cuando el enemigo toca a la nave, y este automáticamente cierre el juego.
    ◆ Hacer uso de la clase Box para el propósito del punto anterior.

◆ Como Desarrollador : quiero lograr que las hileras de enemigos varíen aleatoriamente.

    ◆ Crear método generarHilera, que reciba un número aleatorio del 1 al 6, cada número asignado a un tipo de hilera.
    ◆ El método generarHilera se ejecuta paralelamente mediante un Thread.

◆ Como Usuario: quiero ver en pantalla el tipo de la próxima hilera de enemigos en salir.

    ◆ Crear y añadir un JLabel que informe la siguiente hilera en camino.
```

### Asignación de tareas e historias entre los miembros del equipo
```markdown
◆ Eduardo Bolivar:

    ◆ Como Dessarrollador: quiero crear al personaje y que este se vea en la pantalla.
    ◆ Como Desarrollador: quiero implementar el movimiento del personaje y delimitar un limite de altura
      en el que esteno pueda subir más.
    ◆ Como Usuario: quiero disparar a los enemigos con click izquierdo.
    ◆ Como Desarrollador: quiero crear la hilera de enemigos y que esta se despliegue en la pantalla.
    ◆ Como Desarrollador: quiero lograr que los enemigos se muevan en dirección vertical y horizontal.
    ◆ Como Usuario: quiero enfrentarme a hileras de enemigos con diferentes características.
    ◆ Como Usuario: quiero mover la nave hacia los lados utilizando el mouse.
    

◆ Melissa Oviedo: 
    
    ◆
    ◆
    ◆
    ◆
    ◆

◆ Javier Tenorio:

    ◆Como Desarrollador: Quiero crear una pantalla en la que puedo colocar los demás componentes del juego.
    ◆Como Dessarrollador: quiero crear al personaje y que este se vea en la pantalla.
    ◆Como Usuario: quiero mover la nave hacia los lados utilizando el mouse.
    ◆Como Desarrollador: quiero implementar el movimiento del personaje y delimitar un limite de altura
     en el que este no pueda subir más.
    ◆Como Usuario: quiero disparar a los enemigos con click izquierdo.
    
◆ Kevin Gabriel Lobo: 
    
    ◆ Como Usuario: quiero que mi puntuación pueda ser muy alta.
    ◆ Como Desarrollador : quiero lograr que si un enemigo llega a la parte inferior de la pantalla el jugador pierda.
    ◆ Como Usuario: quiero ver el puntaje que llevo actualmente en pantalla.
    ◆ Como Desarrollador: quiero lograr que los enemigos se muevan en dirección vertical y horizontal.
    ◆ Como Desarrollador: Quiero crear una pantalla en la que puedo colocar los demás componentes del juego.

◆ Alessandro Hidalgo:

    ◆ Como Dessarrollador: quiero crear al personaje y que este se vea en la pantalla.
    ◆ Como Desarrollador: quiero lograr que los enemigos se muevan en dirección vertical y horizontal.
    ◆ Como Usuario: quiero mover la nave hacia los lados utilizando el mouse.
    ◆ Como Usuario: quiero poder ver a que clase de enemigos me enfrento.
    ◆ Como Usuario: quiero ver el puntaje que llevo actualmente en pantalla.
    
```

### Problemas o bugs encontrados:
```markdown
◆ No aparece el personaje en pantalla.

◆ Se quiere corregir el bug del movimiento del personaje.

◆ Se quiere corregir el bug que no nos permite que hayan más de un elemento en pantalla.

◆La nave se crea en pantalla pero no en la posición deseada.

◆Error como usuario no puedo mover la nave ni disparar, solo se crea la imagen

◆Error en el movimiento de la nave, esta en vez de moverse va haciendo un repaint de muchas naves en la posición actual del mouse.

◆ Se quiere corregir el error a la hora de disparar, hay que minimizar y abrir nuevamente la interfaz 
  para que se muestre en pantalla la acción de disparo.
  
◆ La hilera de enemigos se mueve de manera extraña y se desordena.

◆ La nave del jugador aparece en la parte superior de la pantalla cuando aparece otro objeto.

◆ El jefe aún no aparece en pantalla.

◆ La imagen del disparo debería eliminarse al llegar a lo más alto, pero no lo hace.

◆ El JPanel principal a veces no actualiza correctamente los objetos en pantalla.

◆ Cada enemigo de la hilera realiza su movimiento con un Thread diferente.

◆ Los objetos aparecen en la parte superior de la pantalla cuando ya deberían haberse eliminado.
```



## ➔Diseño
En la siguiente imagen se muestra el **diagrama de clases** que realizamos al inicio antes de iniciar con la codificación este para tener una idea del orden y la distribución de cada clase y sus subclases

![Diagrama de Clases 1](https://user-images.githubusercontent.com/62964521/114803845-77a8c280-9d5d-11eb-95e1-9370f15b3fa3.png)





## Editores:
```markdown
◆ Eduardo Bolivar.
◆ Melissa Oviedo. 
◆ Javier Tenorio.
◆ Kevin Gabriel Lobo.
◆ Alessandro Hidalgo.
```
