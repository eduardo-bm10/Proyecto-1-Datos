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
    * Crear clase Display para la pantalla principal.
    * Modificar cada parámetro necesario de la ventana.
    * Crear el panel principal donde se ubicarán todos los objetos en juego.

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

(por hacer)
◆ Asignación de tareas e historias entre los miembros del equipo

### Problemas o bugs encontrados:
```markdown
◆ No aparece el personaje en pantalla.

◆ Se quiere corregir el bug del movimiento del personaje.

◆ Se quiere corregir el bug que no nos permite que hayan más de un elemento en pantalla.

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
◆ Eduardo Bolivar
◆ Melissa Oviedo 
◆ Javier Tenorio
◆ Kevin Lobo 
◆ Alessandro Hidalgo
```
