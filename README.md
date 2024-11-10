## Generador de archivos java
**Descripcion**

* El objetivo de este proyecto es desarrollar una aplicación que sea capaz de generar archivos fuente en Java (.java) a partir de un archivo de texto (.txt) proporcionado por el usuario. La aplicación debe leer el contenido del archivo .txt, analizarlo y crear un archivo .java válido basado en las instrucciones o el contenido del archivo de texto.

**Requisitos funcionales**

1) Lectura del archivo

* La aplicación debe ser capaz de leer un archivo de texto .txt proporcionado por el usuario. El archivo de texto contendrá instrucciones o contenido que deben ser convertidos en un archivo fuente de Java.

2) Generacion del archivo .java

* La aplicación debe analizar el contenido del archivo .txt y generar un archivo fuente de Java (.java). El archivo generado debe ser sintácticamente correcto y seguir las convenciones de codificación de Java.

3) Manejo de Excepciones

* La aplicación debe manejar errores como la falta de permisos para leer el archivo .txt, errores de sintaxis en el contenido del archivo .txt, y errores al escribir el archivo .java.

**Ejemplo de uso**

		meta.txt
		Punto = {(x:int),(y:int)}
		Auto = {(marca:String),(anio:int)}
		Persona = {(nombre:String),(edad:int)}
		
**Contenido esperado**

	public class Persona { 
		private String nombre;
		private int edad;
		
		public Persona(String nombre, int edad){
			this.nombre = nombre;
			this.edad = edad;
		}
	}

**Extras**

* generar getters y setters
* generar toString
