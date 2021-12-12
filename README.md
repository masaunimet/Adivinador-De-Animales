# Adivinador-De-Animales

----Para su funcionamiento tiene que implementarse en el framework de Java, NetBeans----

Los árboles binarios sirven, entre otras cosas, para ir eligiendo entre opciones que se van agregando en las ramas de forma que las respuestas se almacenan en las hojas, siendo útiles para simular comportamientos y toma de decisiones en sistemas que se basan en inteligencia artificial. 

Implemente un Adivinador de Animales en Java utilizando un árbol binario. Dicho Adivinador podrá ir aprendiendo de los desaciertos que cometa al tratar de adivinar el animal en el cual está pensando el usuario. El Adivinador realizará una serie de preguntas al usuario y en función de las respuestas que este ofrezca, el Adivinador generará una respuesta. Un ejemplo del funcionamiento del Adivinador se muestra a continuación:

1.	Estás pensando en un animal? s
Es un pájaro? n
Qué animal era? Ratón
Qué diferencia a un pájaro de un Ratón? vuela
Si el animal fuera un pájaro cuál sería la respuesta? s
2.	Estás pensando en un animal? s
vuela? s
Es un pájaro? n
Qué animal era? Aguila
Qué diferencia a un pájaro de un Águila? caza
Si el animal fuera un pájaro cuál sería la respuesta? n
3.	Estás pensando en un animal? s
vuela? n
Es un Ratón? n
Qué animal era? Perro
Qué diferencia a un Ratón de un Perro? Ladra
Si el animal fuera un Ratón cuál sería la respuesta? n
4.	Estás pensando en un animal? s
vuela? n
Ladra? n
Es un Ratón? n
Qué animal era? Rinoceronte
Qué diferencia a un Ratón de un Rinoceronte? tiene colmillos
Si el animal fuera un Ratón cuál sería la respuesta? n
5.	Estás pensando en un animal? s
vuela? s
caza? n
Es un pájaro? n
Qué animal era? Buitre
Qué diferencia a un pájaro de un Buitre? come carroña
Si el animal fuera un pájaro cuál sería la respuesta? n
6.	Estás pensando en un animal? s
vuela? n
Ladra? n
tiene colmillos? s
Es un Rinoceronte? n
Qué animal era? Elefante
Qué diferencia a un Rinoceronte de un Elefante? tienen trompa
Si el animal fuera un Rinoceronte cuál sería la respuesta? n
7.	Estás pensando en un animal? s
vuela? n
Ladra? n
tiene colmillos? s
tienen trompa? n
Es un Rinoceronte? n
Qué animal era? Jabalí
Qué diferencia a un Rinoceronte de un Jabalí?le gusta entrar al agua
Si el animal fuera un Rinoceronte cuál sería la respuesta? n
8.	Estás pensando en un animal? s
vuela? n
Ladra? n
tiene colmillos? n
Es un Ratón? n
Qué animal era? Jirafa
Qué diferencia a un Ratón de un Jirafa? tiene el cuello largo
Si el animal fuera un Ratón cuál sería la respuesta? n
9.	Estás pensando en un animal? s
vuela? s
caza? n
come carroña? n
Es un pájaro? n
Qué animal era? Mosca
Qué diferencia a un pájaro de un Mosca? es un insecto
Si el animal fuera un pájaro cuál sería la respuesta? n
10.	Estás pensando en un animal? s
vuela? n
Ladra? n
tiene colmillos? s
tienen trompa? n
le gusta entrar al agua? s
Es un Rinoceronte? n
Qué animal era? HIpopótamo
	Qué diferencia a un Rinoceronte de un Hipopótamo?se sumerge por largo tiempo.
	Si el animal fuera un Rinoceronte cuál sería la respuesta? n
11.	Estás pensando en un animal? s
vuela? n
Ladra? n
tiene colmillos? s
tienen trompa? n
le gusta entrar al agua? s
Se sumerge por largo tiempo? s
Es un Hipopótamo?s



	Soy el más grande!



Observe cómo el Adivinador va agregando información a su base de conocimientos. De cada intento fallido, el Adivinador “aprende”, de forma que en las siguientes sesiones, la probabilidad de que acierte aumenta.

Ahora bien, se debe considerar que debe hacer el programa cuando se responde afirmativo, por ejemplo, a la pregunta: Si el animal fuera un Rinoceronte cuál sería la respuesta? s


El programa a implementar deberá cumplir con las siguientes condiciones:


1.	Inicio de sesión: con lo cual, el sistema realizará las preguntas pertinentes para intentar adivinar el animal en el cual piensa el usuario. Una vez que el sistema genere una respuesta, bien sea correcta o incorrecta, se termina la sesión.
2.	Almacenamiento de la base de conocimientos: tome en cuenta que la base de conocimientos almacenada en un árbol binario debe poder ser guardada en un archivo de texto para que lo aprendido por el Adivinador no se pierda. Cada vez que se inicia el Adivinador, se cargará desde el archivo, la información correspondiente a la base de conocimientos. 
3.	Interfaz gráfica: debe, además implementar una interfaz gráfica de usuario.
4.	Mostrar base de conocimientos: el sistema ofrecerá al usuario la opción de poder observar el árbol binario en el que se representa la base de conocimientos. En otras palabras, el usuario podrá ver el diagrama correspondiente al árbol.
5.	Inicialización de la base de conocimientos: el usuario podrá borrar la base de conocimientos si así lo requiere. 
