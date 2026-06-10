# Conversor de Monedas Ficticias

## Integrantes

* **Angel Jose Hernandez Parra** - 750261049
* **Antony Zurita Teheran** - 7502611002

---

## Descripción del Proyecto

Aplicación de consola desarrollada en Java que permite realizar conversiones entre monedas ficticias utilizando tasas de conversión definidas directamente en el código.

El programa presenta un menú interactivo que permite al usuario seleccionar la conversión deseada e ingresar el valor a convertir.

---

## Roles

### Integrador

**Angel Jose Hernandez Parra**

* Creación y configuración inicial del repositorio.
* Administración de ramas y flujo de integración.
* Revisión y aprobación de Pull Requests.
* Integración de cambios a la rama principal (`main`).

### Desarrollador

**Antony Zurita Teheran**

* Implementación de funcionalidades de conversión.
* Desarrollo de métodos de cálculo.
* Creación de commits y Pull Requests.
* Pruebas de funcionamiento de la aplicación.

---

## Funcionalidades

La aplicación permite realizar las siguientes conversiones:

1. Convertir pesos a dólares ficticios.
2. Convertir dólares ficticios a pesos.
3. Convertir pesos a euros ficticios.
4. Convertir euros ficticios a pesos.

### Menú Principal

```text
=== Conversor de Monedas Ficticias ===
1. Pesos a dólares
2. Dólares a pesos
3. Pesos a euros
4. Euros a pesos
5. Salir
```

---

## Estructura del Proyecto

```text
conversor-monedas/
│
├── README.md
├── .gitignore
│
└── src/
    ├── Main.java
    ├── ConversorMonedas.java
    └── ConversorMonedasCli.java
```

---

## Instrucciones de Ejecución

### Requisitos

* Java JDK 17 o superior.
* IntelliJ IDEA o cualquier IDE compatible con Java.
* Git instalado.

### Clonar el repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

### Entrar al proyecto

```bash
cd conversor-monedas
```

### Ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main.java`.
3. Seleccionar una opción del menú.
4. Ingresar el valor a convertir.
5. Visualizar el resultado de la conversión.

---

## Flujo Colaborativo con Git y GitHub

Para el desarrollo se utilizó el flujo de trabajo basado en ramas:

### Creación de ramas

```bash
git checkout -b feature/pesos-a-dolares
git checkout -b feature/dolares-a-pesos
git checkout -b feature/pesos-a-euros
git checkout -b feature/euros-a-pesos
```

### Flujo de trabajo

```bash
git status
git add .
git commit -m "Agregar funcionalidad"
git push origin nombre-rama
```

### Integración

1. Creación de Pull Request.
2. Revisión por otro integrante.
3. Aprobación del Pull Request.
4. Merge hacia la rama `main`.
5. Actualización de repositorios locales mediante `git pull`.

---

## Evidencias del Flujo Colaborativo

Se adjuntan las siguientes evidencias en el repositorio:

* Captura de colaboradores agregados.
* Captura de ramas creadas.
* Captura de Pull Requests.
* Captura de revisiones realizadas.
* Captura de aprobaciones.
* Captura de merges hacia `main`.
* Historial de Git mediante:

```bash
git log --oneline --graph --decorate --all
```

* Evidencia de ejecución correcta del programa.

---

## Tecnologías Utilizadas

* Java
* Git
* GitHub
* IntelliJ IDEA

---

## Estado del Proyecto

Proyecto finalizado y funcional.
